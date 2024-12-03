public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {350, 200, 250, 300, 400};
        int allPayments = 0;
        for (int i : payments) {
            allPayments += i;
        }
        System.out.println(allPayments + " 000 рублей за месяц");
        System.out.println("Задача 2");
        int maxPayment = -1;
        for (final int i : payments) {
            if (i > maxPayment) {
                maxPayment = i;
            }
        }
        System.out.println(maxPayment + " 000 рублей составит максимальная выплата");
        for (final int i : payments) {
            if (i < maxPayment) {
                maxPayment = i;
            }
        }
        System.out.println(maxPayment + " 000 рублей составит минимальная выплата");
        System.out.println("Задача 3");
        double middle = allPayments / payments.length;
        System.out.println(middle + " тысяч рублей составит средняя выплата за неделю");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}