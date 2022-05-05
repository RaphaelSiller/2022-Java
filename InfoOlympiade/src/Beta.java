
public class Beta {

	public static void main(String[] args) {
		int N = 5;
		int V[] = {17, 42, 42, 42, 31, 58};
		
		int nRulebreaker = 0;
	    int jojo = 0;
	    int yesno = 0;
	    for (int i = 0; i < V.length; i++) {
	        for (int j = i+1; j < V.length; j++) {
	            if ((V[i] == V[j])) {
	                nRulebreaker++;
	                if (jojo == 0)	
	                	jojo = V[j];
	                if ((V[j] != jojo) && nRulebreaker >= 1) {
	                    System.out.println("YES\n");
	                    i = V.length;
	                    yesno = 1;
	                }
	                j = V.length;
	            }
	        }
	    }
	    if (yesno == 0)
	        System.out.println("NO\n"); // print the result
	    
	    
	    char test;
	    
	    Integer.toString(jojo)
	}

}
