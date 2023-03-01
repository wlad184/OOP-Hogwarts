public class Griffindor extends Hogwarts{
    private int nobility;//благородство
    private int honor;//честь
    private int bravery;//храбрость

    public Griffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() +
                " ,благородство = " + nobility +
                ", честь =" + honor +
                ", храбрость =" + bravery;

    }
}