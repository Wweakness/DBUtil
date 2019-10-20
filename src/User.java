import java.util.Scanner;


public class User {
    public static void menu(){
        System.out.println("***请选择***");
        System.out.println("**1、添加联系人**");
        System.out.println("**2、查看联系人电话**");
        System.out.println("**3、删除联系人**");


    }
    public static boolean input(){
        Scanner scanner=new Scanner(System.in);
        int selected=scanner.nextInt();
        switch (selected){
            case 1:
                book.putName();
            case 2:
                book.findNumber();
            case 3:
                book.removeName();

        }


       return  false;
    }
}
