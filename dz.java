import java.util.*;

public class dz {
    public static void main(String[] args) 
    {
        boolean acceptable = false;
        Scanner work = new Scanner(System.in);
        System.out.println("Введите размер первого массива:");
        int mylen1 = work.nextInt();
        System.out.println("Введите размер второго массива:");
        int mylen2 = work.nextInt();
        if (mylen1 == mylen2) 
        {
            acceptable = true;
        }
        else 
        {
            System.out.println("Данные массивы не совпадают по длине! Не все элементы буду задействованы в работе. Продолжить? 1/0");
            int choi = work.nextInt();
            if (choi == 1) 
            {
                acceptable = true;
            }
        }
        Integer ar[] = new Integer[mylen1];
        Integer ray[] = new Integer[mylen2];
        Random rnd = new Random();

        for(int i = 0; i < mylen1; i++) 
        {
            ar[i] = rnd.nextInt(11);
        }
        for(int i = 0; i < mylen2; i++) 
        {
            ray[i] = rnd.nextInt(11);
        }

        System.out.println(Arrays.asList(ar) + "\n");
        System.out.println(Arrays.asList(ray));
        if (acceptable) 
        {
            massCollide(ar, ray);
            massDivide(ar, ray);
        }
        work.close();
    }

    // 1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той
    // же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    
    public static void massCollide(Integer ar[], Integer ray[]) 
    {
        int len = ar.length;
        if (ar.length > ray.length) 
        {
            len = ray.length;
        }
        Integer array[] = new Integer[len];
        for (int i = 0; i < len; i++) 
        {
            array[i] = ar[i] - ray[i];
        }
        System.out.println("\nРезультат: " + Arrays.asList(array));
    }

    // 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той
    // же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
    // RuntimeException, т.е. ваше.
    
    public static void massDivide(Integer ar[], Integer ray[]) 
    {
        int len = ar.length;
        if (ar.length > ray.length) 
        {
            len = ray.length;
        }
        double array[] = new double[len];
        for (int i = 0; i < len; i++) 
        {
            double arg1 = (double) ar[i];
            double arg2 = (double) ray[i];
            try 
            {
                array[i] = arg1 / arg2;
            } 
            catch (Exception e) 
            {
                throw new RuntimeException("Деление на ноль!");
            }
        }
        System.out.println("\nРезультат: " + Arrays.asList(array));
    }
}
