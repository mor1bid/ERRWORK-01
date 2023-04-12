import java.util.*;

public class dz {
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Введите размер первого массива:");
        int mylen1 = work.nextInt();
        System.out.println("Введите размер второго массива:");
        int mylen2 = work.nextInt();

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
        massCollide(ar, ray);

        work.close();
    }

    public static void massCollide(Integer ar[], Integer ray[]) 
    {
        int masslen;
        if (ar.length > ray.length) 
        {
            masslen = ar.length;
            System.out.println("Предупреждение - данные массивы несовпадают по длине! Не все элементы буду задействованы в работе.");
        }
        else 
        {
            masslen = ray.length;
        }
        Integer array[] = new Integer[masslen];
        for (int i = 0; i < masslen; i++) 
        {
            array[i] = ar[i] - ray[i];
        }
        System.out.println(Arrays.asList(array));
    }
}
