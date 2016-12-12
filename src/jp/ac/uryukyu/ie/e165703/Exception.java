package jp.ac.uryukyu.ie.e165703;
public class Exception{
    public static void main(String[] args){
        String str ="3．14";
        Double.parseDouble(str);
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