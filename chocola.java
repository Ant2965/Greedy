//package greedy;
import java.util.*;
public class chocola {

	public static void main(String[] args) {
		
		int n=4;
		int m=6;
		Integer ver[]={2,1,3,1,4};
		Integer hori[]={4,1,2};
	
		Arrays.sort(ver,Collections.reverseOrder());
		Arrays.sort(hori,Collections.reverseOrder());
		
		
		int h=0;  //horizontal cuts
		int v=0;  //vertical cuts
		int hp=1; //peices of horizontal
		int vp=1; //peices of vertical
		int cost=0;
		
		while(h<hori.length && v<ver.length) {
			if(hori[h]>=ver[v]) {
				
				cost = cost + hori[h]*vp;
				hp++;
				h++;
			}
			else {
				
				cost =cost + ver[v]*hp;
				vp++;
				v++;
			}
			
		}
		
		while(v<ver.length){
			cost =cost + ver[v]*hp;
			vp++;
			v++;
			
		}
		
		while(h<hori.length) {
			cost = cost + hori[h]*vp;
			hp++;
			h++;
		}
		System.out.println("The mininmun cost is  "+cost);
	}

}
