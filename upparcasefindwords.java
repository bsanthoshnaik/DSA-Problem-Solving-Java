public class upparcasefindwords {
    public static void main(String[] args) {
        int captal=0;
        int small=0;
        int space=0;
        int dig=0;
        int symbols=0;
        String str="e SALa cuP NamAdAi #2025";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                space++;
            }
            else if(Character.isUpperCase(ch)){
                captal++;

            }
            else if(Character.isLowerCase(ch)){
                small++;
            }
            else if(Character.isDigit(ch)){
                dig++;
            }
            else{
                symbols++;
            }

        }
        System.out.println("captal:" + captal +  " small:"+ small +" spaces:"+space+" Symobls:"+symbols+" dig:"+dig);
    }
    
}
