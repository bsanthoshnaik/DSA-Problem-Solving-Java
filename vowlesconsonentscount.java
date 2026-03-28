public class vowlesconsonents {
    public static void main(String[]args){
        String str="education";
        int vow=0;
        int con=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            Character s=str.charAt(i);
            if(s=='a' ||s=='e'){
                //con++;
                vow++;
            }
            else{
                con++;
            }
        }
        System.out.println("vow="+vow);
        System.out.println("con="+con);
    }
    
}
