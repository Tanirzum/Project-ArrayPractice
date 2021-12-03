public class Test {
    public static void main(String[] args) {
        String[] array = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
        int n = array.length;
        String temp;

        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }

        for (String s : array) {
            System.out.print(s);
        }
    }
}
