public class TextException {

    public static void main(String[] args) {
        String str = null;

        try{
            System.out.println(str.length());
            TextException te= new TextException();

            str = "0000";
        }catch (NullPointerException e){
            System.out.println("找到异常");
        }finally {
//            System.out.println("hhh"+str.length());
        }

    }


}
