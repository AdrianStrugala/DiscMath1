import java.util.ArrayList;

public class Main {

	public static int ceiling (double x){
		
		int y;
		y = (int)x;
		
		if (y<0){}
		else if(x>y){
			y++;
		}
		
		return y;
	}
	
	public static int floor (double x){
		
		int y;
		y = (int)x;
		
		if (y<0 && y!=x){
			y--;
		}
		
		return y;
	}
	
	//{x}
	public static double fractional(double x){
		
		if(x>=0)
			return x - floor(x);
		else
			return x - ceiling(x);	
	}
	
	//x%y
	public static int modulo(int x, int y){
		
		int z=0;
		int m=0;
		
		for (int k=0; m<=x; k++){
			m = k*y;
		}
		
		z = x+y-m;
		
		return z;
	}
	
	//generate first n prime numbers
	public static ArrayList<Integer> primes(int n){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		int number = 2;
		
		if(n==0){}
		else if(n==1){
			list.add(1);		
		}
		else if(n>1){
			list.add(1);
			count++;
			
			while(count<n){
				boolean prime=true;
				for(int i=2; i<=Math.sqrt(number);i++){
					
					if(number%i==0){
						prime=false;
						break;
					}
				}
				if(prime){
					list.add(number);
					count++;
				}
				number++;
			}
		}
		
		
		return list;
	}
	
	//checks if given sequence is a permutation
	public static boolean ifpermutation (ArrayList<Integer> list){
		
		boolean ip = true;

		for (int i=0; i<list.size(); i++){
			for(int j=i+1;j<list.size();j++)
			if(list.get(i) == list.get(j)){
				ip = false;
				break;
			}
		}
	return ip;	
	}
	
	public static int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	
	//generates all permutations of given sequence
	public static ArrayList<ArrayList<Integer>> perms (ArrayList<Integer> list){
		
		ArrayList<ArrayList<Integer>> perms = new ArrayList<ArrayList<Integer>>();
		
		
		while(perms.size()<factorial(list.size())){
				
				ArrayList<Integer> inner = new ArrayList<Integer>();
				while(inner.size()<list.size()){
					int rand = (int) floor(Math.random() * list.size());
					if (!inner.contains(list.get(rand))){
						inner.add(list.get(rand));
						}
				}
				if (!perms.contains(inner)){
					perms.add(inner);
					}
					
		}			
		return perms;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for ceiling, floor, fractional part
		double[] a = {2, 2.4, 2.9, -2.7, -2};
		
		//for modulo
		int x=15;
		int y=4;
				
		
		//for primes
		int n = 5; 
		ArrayList<Integer> p = primes(n);
		
		//for permutations
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(7);
		
		ArrayList<ArrayList<Integer>> perms = perms(list);
		
		//ceiling
		for (double i:a){
			System.out.println("Ceiling of "+i+ " equals " + ceiling(i));
		}
		System.out.println();
		
		//floor
		for (double i:a){
			System.out.println("Floor of "+i+ " equals " + floor(i));
		}
		System.out.println();
		
		//fractionals
		for (double i:a){
			System.out.println("Fractional part of "+i+ " equals " + fractional(i));
		}
		System.out.println();
		
		//modulo
		System.out.println(x + " modulo " + y + " is " + modulo(x,y));
		
		System.out.println();
		
		//prime numbers
		System.out.print(n + " first prime numbers: ");
		for(int i=0; i<n; i++){
			System.out.print(p.get(i) + " ");
		}	
		System.out.println();
	
		System.out.println();
		//if sequence is permutation
		System.out.println("Is given sequence a permutation? " + ifpermutation(list));
		
		System.out.println();
		//all permutations of sequence
		System.out.println("Number of permutations: " + perms.size());	
		System.out.println("Permutations:");
		for(int i=0; i<perms.size(); i++){
			for(int j=0; j<list.size(); j++){
				System.out.print(perms.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
