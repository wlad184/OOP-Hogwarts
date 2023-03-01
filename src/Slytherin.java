public class Slytherin extends Hogwarts{
    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition;// амбициозность
    private int resourcefulness;//находчивость
    private int powerРungry;//жажда власти

    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int powerРungry) {
        super(name, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerРungry = powerРungry;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerРungry() {
        return powerРungry;
    }

    public void setPowerРungry(int powerРungry) {
        this.powerРungry = powerРungry;
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() +
                " ,хитрость = " + cunning +
                ", решительность =" + determination +
                ", амбициозность =" + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + powerРungry;

    }
}
