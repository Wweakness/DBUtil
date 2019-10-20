import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class book {
    private String name;
   static Map<String,NumberList> map=new HashMap<>();
    //添加
    public static void putName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户姓名");
        String name=scanner.nextLine();
        System.out.println("请输入用户电话");
        String number=scanner.nextLine();
        System.out.println("请输入用户备注");
        String otherName=scanner.nextLine();

        NumberList n=new NumberList(number,otherName);
        map.put(name,n);
        System.out.println("添加成功");


    }
    //查找
    public static void findNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户姓名");
        String name=scanner.nextLine();
       NumberList c=map.get(name);
        System.out.println(c.getNumber());
        System.out.println(c.getOtherName());

    }

    //删除
    public static void removeName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户姓名");
        String name=scanner.nextLine();
        map.remove(name);
        System.out.println("删除成功");
    }

    public static void main(String[] args) {

        User.menu();
        User.input();


    }





}
