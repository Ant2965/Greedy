//package greedy;
import java.util.*;	
public class jobsequencing {

	public static void main(String[] args) {
		
		int jobs[][]= {{4,20},{1,10},{1,40},{1,30}};
		
		Arrays.sort(jobs , Comparator.comparingDouble(o->o[1]));
		//for(int i=0;i<jobs.length;i++) {
			//for(int j=0;j<2;j++) {
				//System.out.print(jobs[i][j]+" ");


	//	}
			//System.out.println();
			

		//}

		ArrayList <Integer> ans =new ArrayList<>();
		int time =0;
		int  value =0;
		
		for(int i=jobs.length-1;i>=0;i--) {
			if(jobs[i][0]>time) {
			ans.add(i);
			value = value+ jobs[i][1];
			time++;
			}
			
		}
		
		System.out.println(ans.get(0));
		for(int i =0;i<ans.size();i++) {
			int v = ans.get(i);
			System.out.println("The jobs selected are  "+ jobs[v][0]+ ","+ jobs[v][1]);

		}
		
		
		System.out.println(value);
		
		

	}

}
