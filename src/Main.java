import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Griffindor("Гарри Поттер", 12, 25, 4, 45, 89),
                new Griffindor("Гермиона Грейнджер", 25, 88, 17, 24, 57),
                new Griffindor("Рон Уизли", 45, 46, 23, 11, 9),

                new Kogtevran("Чжоу Чанг", 65, 4, 39, 58, 18),
                new Kogtevran("Падма Патил", 78, 2, 11, 22, 49),
                new Kogtevran("Маркус Белби", 25, 48, 71, 10, 8),

                new Puffenduy("Захария Смит", 27, 5, 16, 44, 59, 77),
                new Puffenduy("Седрик Диггори", 13, 21, 85, 94, 32, 20),
                new Puffenduy("Джастин Финч-Флетчли", 21, 6, 17, 37, 60, 80),

                new Slytherin("Драко Малфой", 19, 2, 11, 87, 78, 81, 52),
                new Slytherin("Грэхэм Монтегю", 4, 67, 25, 48, 74, 21, 26),
                new Slytherin("Грегори Гойл", 45, 87, 14, 31, 7, 12, 54)
        };

       /* int[] sum = new int[hogwart.length];
        int[] sum1 = new int[hogwart.length];
        Hogwarts.sumStudent(hogwart, hogwart, sum, sum1);*/

        printStydent(hogwarts);
        System.out.println("");
        hogwarts[0].compare(hogwarts[1]);
        hogwarts[3].compare(hogwarts[5]);
        hogwarts[7].compare(hogwarts[8]);
        hogwarts[9].compare(hogwarts[10]);
        System.out.println("");
        hogwarts[0].compareHogwarts(hogwarts[6]);
        hogwarts[1].compareHogwarts(hogwarts[9]);



        /*Griffindor[] griffindor = new Griffindor[]{
                new Griffindor("Гарри Поттер", 12, 25, 4, 45, 89),
                new Griffindor("Гермиона Грейнджер", 25, 88, 17, 24, 57),
                new Griffindor("Рон Уизли", 45, 46, 23, 11, 9)
        };
        Kogtevran[] kogtevran = new Kogtevran[]{
                new Kogtevran("Чжоу Чанг", 65, 4, 39, 58, 18),
                new Kogtevran("Падма Патил", 78, 2, 11, 22, 49),
                new Kogtevran("Маркус Белби", 25, 48, 71, 10, 8)
        };
        Puffenduy[] puffenduy = new Puffenduy[]{
                new Puffenduy("Захария Смит", 27, 5, 16, 44, 59, 77),
                new Puffenduy("Седрик Диггори", 13, 21, 85, 94, 32, 20),
                new Puffenduy("Джастин Финч-Флетчли", 21, 6, 17, 37, 60, 80)
        };
        Slytherin[] slytherin = new Slytherin[]{
                new Slytherin("Драко Малфой",19, 2, 11, 87, 78, 81, 52),
                new Slytherin("Грэхэм Монтегю",4, 67, 25, 48, 74, 21, 26),
                new Slytherin("Грегори Гойл",45, 87, 14, 31, 7, 12, 54)
        };


    }*/


    }
    public static void printStydent(Hogwarts[] hogwarts){
        for (int i = 0; i < hogwarts.length; i++) {
            System.out.println(hogwarts[i]);
        }
    }

}