//package greedy;
import java.util.*;

public class knapsack {

	public static void main(String[] args) {
		int weight[]= {30,20,10};
		int value[]= {120,100,60};
		
		int w=50;
		int put=0;
		double v= 0;
		
		int ratio[]= new int[value.length];
		
		for(int i=0;i<value.length;i++) {
			ratio[i]=value[i]/ weight[i];
		}
		
		int num[][]= new int [weight.length][2];
		for(int j=0;j<value.length;j++) {
			num[j][0]=j;
			num[j][1]=ratio[j];
		}
		Arrays.sort(num ,Comparator.comparingDouble(o -> o[1]));
		 double capacity =w;
		for(int i=num.length-1;i>=0;i--) {
			int index =num[i][0];
			if(capacity>=weight[index]) {
			capacity=capacity-weight[index];

				v=v+value[index];
			}
			else {
				v=v+(num[i][1]*capacity);
				//break;
			}
		}
		System.out.println(v);
	}
}
//////////////////////////


