public class Main {
    public static void main(String[] args) {
        //Напишите пример перехвата и обработки исключения в блоке try-catch-метода.
        try {
            int result = divide(4, 0);
            System.out.println("Результат: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        finally {
            System.out.println("Программа завершена.");
        }

    }

    public static int divide(int x, int y){
        if(y == 0){
            throw new ArithmeticException("Деление на ноль невозможно");
        }

        return x/y;
    }
}