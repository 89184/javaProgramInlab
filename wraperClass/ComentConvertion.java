package wraperClass;

public class ComentConvertion {

    ComentConvertion(int num){
         Float value1=(float)num;
         System.out.println("value: "+value1);
    }

    public static void main(String[] args) {
        
        ComentConvertion ob=new ComentConvertion(12);
        // ComentConvertion(12);
        

        System.out.println("value: "+ob);
    }
    
}
