package cw_09;

/**
 * Created by ihor on 27.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        Human2 h1 = new Human2("A", 11, 1000);
        Human2 h2 = new Human2("B", 12, 2000);
        Human2 h3 = new Human2("C", 13, 3000);
        Human2[] arr = {h1, h2, h3};
        System.out.println(getMaxSalary(arr));
    }

    static String getMaxSalary(Human2[] arr){
        int maxSalary = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].salary > maxSalary){
                maxSalary=arr[i].salary;
                index = i;
            }
        }
        return arr[index].name;
    }
}
