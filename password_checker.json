import java.util.*;

class UserBO{
    static private String name,mob,user,pass;
    static void validate(){
        int len = pass.length(),spe=0,dig=0;
        boolean c1=false,c2=false,c3=false;
        if(len>=9 && len<=20){
            c1=true;
        }
        for(int i=0;i<len;i++){
            if(!Character.isDigit(pass.charAt(i)) && !Character.isLetter(pass.charAt(i)) && !Character.isWhitespace(pass.charAt(i))){
                spe++;
            }
            if(Character.isDigit(pass.charAt(i))){
                dig++;
            }
        }
        if(dig>0){
            c2=true;
        }
        if(spe>0){
            c3=true;
        }
        try{
            if(c1 & c2 & c3){
                System.out.println("Valid Password");
            }
            else if(c1==false){
                throw new Exception("Should be minimum of 10 characters and maximum of 20 characters");
            }
            else if(c2==false){
                throw new Exception("Should contain at least one digit");
            }
            else if(c3==false){
                throw new Exception("It should contain at least one special character");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    void set(String n,String m,String u,String p){
        name=n;
        mob=m;
        user=u;
        pass=p;
    }
}

class main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        UserBO u = new UserBO();
        u.set(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
        u.validate();
    }
}
