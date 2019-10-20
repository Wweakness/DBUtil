import java.util.ArrayList;
import java.util.List;
public class NumberList {
  private String number;
   private String otherName; //备注
    public NumberList(String number,String otherName){
        this.number=number;
        this.otherName=otherName;

    }
    public String getNumber(){
        return number;

    }
    public String getOtherName(){
        return otherName;
    }
}
