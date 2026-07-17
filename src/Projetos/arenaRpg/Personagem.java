package Projetos.arenaRpg;

public abstract class Personagem {

    protected String name;
    protected int life;
    protected int force;
    protected int lifeMax;

    public Personagem(String name, int lifeMax, int force) {
        this.name = name;
        this.lifeMax = lifeMax;
        this.force = force;
        this.life = lifeMax;
    }

    public String getName() {return name;}
    public int getLife() {return life;}
    public int getForce() {return force;}
    public void setName(String name) {this.name = name;}
    public void setLife(int life) {this.life = life;}
    public void setForce(int force) {this.force = force;}
    public int getLifeMax() {return lifeMax;}
    public void setLifeMax(int lifeMax) {this.lifeMax = lifeMax;}

    public abstract void attack(Personagem Alvo);

    public void takeDamage(int damage){
        if(damage > 0){
            this.life = Math.max(0, this.life - damage);
            System.out.println(this.name + " DANO RECEBIDO!!!! = " + damage);
        }
        if(this.life <= 0){
            this.life = 0;
        }
    }

    public boolean alive() { return this.life > 0;}

    public String getname(){return this.name;}
    public int getlife(){return this.life;}
    public int getlifeMax(){return this.lifeMax;}


}
