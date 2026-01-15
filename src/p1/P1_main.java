//by mschro67

package p1;

public class P1_main{
    public static void main(String[] args){
        System.out.println(a(2,3));
    }

    public static double b(double x,int y){
    	double result=x*1;
	if (y!=0){
	    for (int a=0;a<y-1;a++){
	        result*=x;
	    }
	}else{
	    result=1;
	}
	return result;
    }

    public static double a(double x,int y){
    	double result=x*1;
	if (y>2){
	    result=x*x;
	}else{
	    result=x*b(x,y-1);
	}
	return result;
    }
}
