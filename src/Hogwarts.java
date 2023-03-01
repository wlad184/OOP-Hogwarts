public class Hogwarts {
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



   public static void printStudent(Hogwarts[] student){
        for (int i = 0; i < student.length; i++){
            System.out.println(student[i]);
        }

   }
}
