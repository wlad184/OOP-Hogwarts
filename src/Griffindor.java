public class Griffindor extends Hogwarts {
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

   /* @Override
    public int sumProperties() {
        int s = 0;
        return s = s + nobility + honor + bravery;

    }

    @Override
    public int sumProperties1() {
        int s = 0;
        return s = s + super.sumProperties1();
    }*/

    @Override
    public int ability(){
        return nobility + honor + bravery;
    }
    @Override
    public void compare(Hogwarts hogwarts){
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2){
            System.out.println("Гриффиндорец " + getName() + " лучше чем Гриффиндорец " + hogwarts.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Гриффиндорец " + hogwarts.getName() + " лучше чем Гриффиндорец " +getName() + ": " + ability2 + " VS " + ability1);

        }else {
            System.out.println("Гриффиндорец " + getName() + " такой же как Гриффиндорец " + hogwarts.getName() + ": " + ability1 + " VS " + ability2);
        }

    }
}