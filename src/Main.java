public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b)
    {
        return a+b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d)
    {
        int ab = add(a, b);
        int cd = add(c, d);
        return add(ab, cd);
    }

    // 3. morningGreeting
    public static String morningGreeting (String personsName)
    {
        return "早上好, " + personsName + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting (String personsName)
    {
        return "下午好, " + personsName + "!";
    }

    // 5. triple
    public static String triple (String text)
    {
        return text + text + text;
    }

    // 6. half
    public static double half (int number)
    {
        return number/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double n)
    {
        return (int) Math.round(n);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger  (double n)
    {
        return (int) -Math.round(-n);
    }

}
