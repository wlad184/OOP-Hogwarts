

public class Puffenduy extends Hogwarts{
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creativity;//творчество

    public Puffenduy(String name, int witchcraft, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() +
                " ,ум = " + mind +
                ", мудрость =" + wisdom +
                ", остроумие =" + wit +
                ", творчество = " + creativity;

    }
    /*@Override
    public int sumProperties(){
    int s = 0;
    return  s = s + mind + creativity + wit + wisdom;

    }
    @Override
    public int sumProperties1() {
        int s = 0;
        return s = s + super.sumProperties1();
    }*/
    @Override
    public int ability(){
        return mind + creativity + wit + wisdom;
    }
    @Override
    public void compare(Hogwarts hogwarts){
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2){
            System.out.println("Пуффендуец " + getName() + " лучше чем Пуффендуец " + hogwarts.getName() + ": " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Пуффендуец " + hogwarts.getName() + " лучше чем Пуффендуец " +getName() + ": " + ability2 + " VS " + ability1);

        }else {
            System.out.println("Пуффендуец " + getName() + " такой же как Пуффендуец " + hogwarts.getName() + ": " + ability1 + " VS " + ability2);
        }

    }
    }



    




