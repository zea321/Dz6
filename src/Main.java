public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        float totalAmount = 0;
        //Задания 1.

        for (int i = 0; i < arr.length; i++) {
            totalAmount += arr[i];
        }
        {
            System.out.println("Сумма трат за месяц составила " + totalAmount + " Рублей.");
        }
        //Задание 2.
        int maxAmount = 0;
        int minAmount = 200_000;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxAmount) {
                maxAmount = arr[i];}
            if (arr[i] < minAmount){
                minAmount = arr[i];}
        }
        System.out.println("Максимальная трата за день составила " + maxAmount + " Рублей");
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " Рублей");

        //Задание 3.
        float mediumAmountMonth = totalAmount / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumAmountMonth + " Рублей.");
        //Задание 4.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i < reverseFullName.length && i != -1; i--){
            {
                System.out.print(reverseFullName[i]);
            }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
