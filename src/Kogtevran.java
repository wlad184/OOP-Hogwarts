public class Kogtevran extends Hogwarts{
    private int industriousness;//трудолюбие
    private int loyalty;//верность
    private int honesty;//честность

    public Kogtevran(String name,int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() +
                " ,трудолюбие = " + industriousness +
                ", верность =" + loyalty +
                ", честность =" + honesty;

    }
   /* @Override
    public int sumProperties(){
        int s = 0;
        return  s = s + industriousness + loyalty + honesty;

    }
    @Override
    public int sumProperties1() {
        int s = 0;
        return s = s + super.sumProperties1();
    }*/
    @Override
    public int ability(){
        return industriousness + loyalty + honesty;
    }
    @Override
    public void compare(Hogwarts hogwarts){
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2){
            System.out.println("Когтевранец " + getName() + " лучше чем Когтевранец " + hogwarts.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Когтевранец " + hogwarts.getName() + " лучше чем Когтевранец " +getName() + ": " + ability2 + " VS " + ability1);

        }else {
            System.out.println("Когтевранец " + getName() + " такой же как Когтевранец " + hogwarts.getName() + ": " + ability1 + " VS " + ability2);
        }

    }

}



