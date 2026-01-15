//by mschro67

package p3;

public class P3_main{
    public static void main(String[] args){
	System.out.println(zinsen(100,1));
    }

    public static int zinsen(int geld,int jahre){
        if (jahre==0){
	    return geld;
	}
	int result = (int) geld*1.05+zinsen(geld*1.05,jahre-1)-geld;
	return result;
    }
}
