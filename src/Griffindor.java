public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}