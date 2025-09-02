
import util.Shap2D;
public class Mainmeth implements Shap2D{
	int r;
	public Mainmeth(int r)
	{
		this.r=r;
	}
	public double area(){
		return pi*r*r;
	}
	
	public double paremeter(){
		return 2*pi*r;
	}
	
	public static void main(String args[]){
	
		Mainmeth obj=new Mainmeth(5);
		System.out.println(obj.area());
		System.out.print(obj.paremeter());
	}
}
