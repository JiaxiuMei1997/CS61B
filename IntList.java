public class IntList {
2	    public int first;
3	    public IntList rest;
4	
5	    public IntList(int f, IntList r) {
6	        first = f;
7	        rest = r;
8	    }
9	
10	    /** Return the size of the list using... recursion! */
11	    public int size() {
12	        if (rest == null) {
13	            return 1;
14	        }
15	        return 1 + this.rest.size();
16	    }
17	
18	    /** Return the size of the list using no recursion! */
19	    public int iterativeSize() {
20	        IntList p = this;
21	        int totalSize = 0;
22	        while (p != null) {
23	            totalSize += 1;
24	            p = p.rest;
25	        }
26	        return totalSize;
27	    }
28	
29	    /** Returns the ith value in this list.*/
30	    public int get(int i) {
31	    if(i == 0){
32	      return first;
33	    }
34	    return rest.get(i-1);
35	    }
36	   
37	   /** Return an IntList with all values incremented by x**/
38	   public static IntList incrList(IntList L, int x){
39	      if (L == null){
40	         return null;
41	      }
42	      IntList increL = new IntList(L.first+x, null);
43	      increL.rest = incrList(L.rest, x);
44	      return increL;
45	   }
46	   
47	   public static IntList dincrList(IntList L, int x){
48	      if (L == null){
49	         return null;
50	      }
51	      L.first = L.first+x;
52	      dincrList(L.rest,x);
53	      return L;      
54	   }
55	
56	    public static void main(String[] args) {
57	        IntList L = new IntList(15, null);
58	        L = new IntList(10, L);
59	        L = new IntList(5, L);
60	      IntList L1 = incrList(L,1);
61	      IntList L2 = dincrList(L,2);
62	        System.out.println(L.iterativeSize());
63	      System.out.println(L.get(1));
64	      System.out.println(L1);
65	      System.out.println(L2);
66	    }
67	} 
