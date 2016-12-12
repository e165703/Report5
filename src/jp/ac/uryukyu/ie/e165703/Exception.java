package jp.ac.uryukyu.ie.e165703;

/**
 * Created by e165703 on 2016/12/12.
 */
public class Exception {
    public static void main(String[] args){
        String str = null;
        try {
            int length = str.length();
            System.out.println(length);
        }
        catch(NullPointerException e){
            System.out.println("エラー:NullPointerExceptionが発生しました");
            e.printStackTrace();
        }
    }
}
