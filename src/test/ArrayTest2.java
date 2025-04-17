package test;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 1. 값을 알고 있는 경우
                int[][] ages = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };
        System.out.println(ages.length);
        System.out.println(ages[0].length);
        System.out.println(ages[1].length);
        System.out.println(ages[2].length);
        System.out.println(ages[0][0]);
        System.out.println(ages[2][3]);


        // 2. 값을 모르고 있는 경우
        int[][] seats2 = new int[3][3]; // 3X3
        int[][] seats3 = new int[3][]; // 3 X ???
        seats3[0] = new int[]{1,2,3};
        seats3[1] = new int[]{4,5};
        seats3[2] = new int[]{6,7,8,9};
        System.out.println(seats3);
        System.out.println(seats3[2][0]);

    }
}
