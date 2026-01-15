//by mschro67

package p2;

public class P2_main{
    public static void main(String[] args){
       System.out.println(log_rek(2,8));
    }

    public static int log_iter(int base,int x){
    	int result=0;
	while (x!=1){
	    x/=base;
	    result+=1;
	}
	return result;
    }

    public static int log_rek(int base,int x){
	if (x < base) {
	    return 0;
	}
	return 1 + log_rek(base, x / base);
    }
}
