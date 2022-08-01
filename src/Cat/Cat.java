package Cat;

public class Cat {
    //public static final String[] name = new String[10];
    //public static final int[] age = new int[10];
    public String name;
    private int age;
    private String listCats;
    private String cats;
    private String firstFive;
    int i;

    public String getName() {
        int i = 0;
        while (true) {
            System.out.println("Имя " + name + " " + "Возраст " + age);
            i++;
            if (i > 9) {
                break;
            }
        }
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getListCats() {
        String[] name = new String[]{"Asya", "Rigik", "Tolya", "Kuzya", "Vasya", "Petya", "Sharik", "Tuzik", "Pushok", "Kotik"};
        int[] age = new int[]{1, 10, 19, 20, 25, 28, 7, 9, 12, 15};
        int oneLength = name.length;
        //int twoLength = age.length;
        int rand1 = (int) (Math.random() * oneLength);
        //int rand2 = (int) (Math.random() * twoLength);
        for (int i = 0; i < 10; i++) {
            System.out.println("Имя " + name[rand1] + ", " + "Возраст " + age[i]);

        }
        return listCats;
    }

    public void setListCats() {
        this.listCats = listCats;

    }

    public String getCats() {
        String[] name = new String[]{"Asya", "Rigik", "Tolya", "Kuzya", "Vasya", "Petya", "Sharik", "Tuzik", "Pushok", "Kotik"};
        int[] age = new int[]{1, 10, 19, 20, 25, 28, 7, 9, 12, 15};
        int oneLength = name.length;
        //int twoLength = age.length;
        int rand1 = (int) (Math.random() * oneLength);
        //int rand2 = (int) (Math.random() * twoLength);
        i = 0;
        do {
            System.out.println("Имя " + name[rand1] + ", " + "Возраст " + age[i]);
            i++;
        } while (i < name.length);


        return cats;
    }

    public void setCats() {
        this.cats = cats;

    }

    public String getFirstFive() {
        String[] name = new String[]{"Asya", "Rigik", "Tolya", "Kuzya", "Vasya", "Petya", "Sharik", "Tuzik", "Pushok", "Kotik"};
        int[] age = new int[]{1, 10, 19, 20, 25, 28, 7, 9, 12, 15};
        int oneLength = name.length;
        //int twoLength = age.length;
        int rand1 = (int) (Math.random() * oneLength);
        //int rand2 = (int) (Math.random() * twoLength);
        for (int i = 0; i < 5; i++) {
                System.out.println("Имя " + name[i] + ", " + "Возраст " + age[i]);
        }
        return firstFive;
    }
    public void setFirstFive() {
        this.firstFive = firstFive;

    }

    //static boolean equals(int[] age, String[] name) {
       // return false;
    //}


    @Override
    public String toString() {
        return "Имя " + name;
    }


}




