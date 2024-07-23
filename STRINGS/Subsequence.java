public class Subsequence {
    public static void main(String[] args) {
        ss("abc"," ");
        public static void ss(String ques, String ans){
            if(ques.length()==0){
                System.out.println(ans);
                return;
            }
            else{
                ss(ques.substring(1), ans);
                ss(ques.substring(1), ans+ques.charAt(0));
            }
        }

    }

}
