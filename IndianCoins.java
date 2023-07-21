//package greedy;
import java.util.*;
public class IndianCoins {

	public static void main(String[] args) {
		int coins[]= {500,2000,100,50,20,5,2,1};
		
		Arrays.sort(coins);
		int amt=590;
		
		int count =0;
		ArrayList<Integer> a =new ArrayList<>();
		
		
		for (int i =coins.length-1;i>=0;i--) {
			if(coins[i]<=amt){
				while(coins[i]<=amt) {
				count=count+1;
				a.add(coins[i]);
				
				amt=amt-coins[i];
				
				
			}
			}
		
		}
		//for(int i=0;i<a.size();i++) {
			System.out.println(a);

		//}
		System.out.println(count);

	}

}
