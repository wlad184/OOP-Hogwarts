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
}
