public class VarargsCalculator {
    public int sum (int ...variables) {
        int sum = 0;
        for (int var: variables) {
            sum +=var;
        }
        return sum;
    } 

    public static void main(String[] args) {
        VarargsCalculator c = new VarargsCalculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));
    }
}
