

public abstract class Hogwarts {

    private String name;
    private int witchcraft;//сила магии
    private int transgress;//расстояние трансгресии

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return getClass() +
                " Имя = " + name + '\'' +
                ", сила магии = " + witchcraft +
                ", расстояние трансгресии = " + transgress;
    }

    /* public static void sumStudent(Hogwarts[] student, Hogwarts[] student1, int[] sum, int[] sum1){
       for (int i = 0; i < student.length; i++) {
           sum[i] = student[i].sumProperties();
           sum1[i] = student1[i].sumProperties1();
           System.out.println(sum[i]);
           System.out.println(sum1[i]);
       }
   }
   public int sumProperties(){
       return 0;
   }
    public int sumProperties1() {
        int s = 0;
        return  s = s + witchcraft + transgress;
    }*/
    public abstract int ability();
    public int ability1(){
       return witchcraft + transgress;
    }

    public abstract void compare(Hogwarts hogwarts);
    public void compareHogwarts(Hogwarts hogwarts){
        int ability1 = ability1();
        int ability2 = hogwarts.ability1();
        if (ability1 > ability2){
            System.out.println("Студент " + name + " лучше чем студент " + hogwarts.name + ": " + ability1 + " VS " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент " + hogwarts.name + " лучше чем студент " + name + ": " + ability2 + " VS " + ability1);

        }else {
            System.out.println("Студент " + name + " такой же как студент " + hogwarts.name + ": " + ability1 + " VS " + ability2);
        }

    }
    }




