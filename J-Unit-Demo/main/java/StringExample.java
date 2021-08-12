import org.junit.Test;

public class StringExample {

    public boolean compareFirstAndLastCharAreSame(String str){
        if(str.length() <=1)
            return  false;
        if(str.length() ==2)
            return false;

        String first2char = str.substring(0,2);
        String last2char = str.substring(str.length()-2);
        return first2char.equals(last2char);
    }
}
