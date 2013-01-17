import java.util.*;

public class tweet {
	
public static void main(String args[]){
	int t,v=0,c=0,n,a=0;
	
	Scanner sc = new Scanner(System.in);
	t= sc.nextInt();
//for(int s=0;s<t; s++ ){
	n= sc.nextInt();
	int A[]= new int[n];
	for (int i=0; i<n; i++){
		A[i]= sc.nextInt();
	}
	for (int i=0; i<n; i++){
		for (int j=i; j<n; j++){
				if(A[i]==A[j]){
					a=a+1;
					}
			}
		if(a>=c){
				c=a;
				v=A[i];
				}
		a=0;
		}

//}
	System.out.println(c+"\t"+v);
}

}
