import java.util.Scanner;
public class password_validator {


    public static void main(String[] args) {
        Scanner f = new Scanner(System.in); 
               
        int i,ok1=0,ok2=0,j;
        String specialCharacters = "&+@$#%";
        
        char[] a = specialCharacters.toCharArray();
        String pass = f.nextLine();
        char[] v = pass.toCharArray();
        
        if (v.length>10){
            System.out.print("False");
            System.exit(0);
            }
            
        if (v.length<5)
            {System.out.print("False");
            System.exit(0);
            }
            
        for(i=0; i<v.length; i++)
            for(j=0; j<a.length; j++)
                if(v[i]==a[j])
                    ok1=1;
                    
        if(ok1==0)
            {System.out.print("False");
            System.exit(0);
            }
            
        for(i=0; i<v.length; i++)
            if(v[i]==32)
                {System.out.print("False");
                System.exit(0);
                }
                
        for(i=0; i<v.length; i++)
            if((v[i]>=48)&&(v[i]<=57))
                ok2=1;
                
        if(ok2==0)
            {System.out.print("False");
            System.exit(0);
            }
            
        System.out.println("True");
        f.close();
    }


}