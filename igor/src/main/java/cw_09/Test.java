package cw_09;

/**
 * Created by ihor on 27.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Aa", 11, 5000);
        Human2 h2 = new Human2("Ab", 12, 4000);
        Human2 h3 = new Human2("C", 13, 3000);
        Human2 h4 = new Human2("D", 13, 6000);
        Human2 h5 = new Human2("E", 13, 5000);
        Human2[] arr = {h1, h2, h3, h4, h5};
        //System.out.println(getMaxSalary(arr));
        arr = sortHumanSalary(arr);
        printHuman(arr);
        System.out.println("");
        arr = sortHumanName(arr);
        printHuman(arr);

    }

    static Human2[] sortHumanSalary(Human2[] arr) {
        Human2 base;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].salary < arr[j + 1].salary) {
                    base = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = base;
                }
            }
        }
        return arr;
    }

    static String getMaxSalary(Human2[] arr) {
        int maxSalary = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].salary > maxSalary) {
                maxSalary = arr[i].salary;
                index = i;
            }
        }
        return arr[index].name;
    }

    static Human2[] sortHumanName(Human2[] arr) {
        Human2 base;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].name.compareTo(arr[j + 1].name) > 0) {
                    base = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = base;
                }
            }
        }
        return arr;
    }

    static void printHuman(Human2[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("name: " + arr[i].name + " salary: " + arr[i].salary + " age: " + arr[i].age);
        }
    }
}
