package utility;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import Method.Dequeue;
import Method.Stack;
public class Utility {
       
	   static Scanner sc=new Scanner(System.in);
	   public static int inputInt()
	   {
	     	int num = sc.nextInt();
	    	return num;
	   }

	   public static String inputString()
	   {
	    	String str = sc.nextLine();
	     	return str;
	   }
	  
	   public static String inputStr()
	   {
	    	String singleWordString = sc.next();
	    	return singleWordString;
	   }

	   public static float inputFloat()
	   {
	    	float flt = sc.nextFloat();
	    	return flt;
	   }

	   public static double inputDouble()
	   {
		    double dbl = sc.nextDouble();
	    	return dbl;
	   }
	    
		/*
		@param     int y   year
		@returns           the year is leap year or not
		*/
		public boolean checkLeapYear(int y)
		{
			if(y>1000 && y<10000)
			{
				if(y%4==0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		
		
		/*
		 * @param      none
		 * @returns    the username we want to replace
		 */
		public void replaceUserName()
		{
			System.out.println("Enter the name you want to replace");
	        String s=inputString();
	        System.out.println("Hello " + s + ",How are You?");
		}
        
		/*
		  @param      none
		  @returns    percentage of head vs tail
		 */
		public void coinToss()
		{ 
			int n;
			System.out.println("Enter the number of times coin flipped:");
			n=inputInt(); 
			Random random=new Random();
			int head=0,tail=0;
			
			for(int i=0;i<n;i++)
			{
				
				int result = random.nextInt(2);
				if(result<0.5)
				{
					tail++;
				}
				else
				{
					head++;
				}
			}
			System.out.println("Percentage of head: " + (double) head*100/n);
			System.out.println("Percentage of tail: " + (double) tail*100/n);
		}
		
		/*
		 * @param    int n   to store power
		 * @returns          table of 2^n
		 */
         public void powerOfTwo(int n)
         {
        	 System.out.println("Power of 2^" + n + " is " + (int)Math.pow(2,n));
        	 System.out.println();
        	 if(n>=0 && n<=31)
        	 {
        	     for(int i=1;i<=n;i++)
        	     {
        	         System.out.println("Power of 2^" + i + " is " + (int)Math.pow(2, i));
        		 }
        	 }
        	 else
        	 {
        		 System.out.println("Enter the number between 0 and 31");
        	 }
         }
         
         /*
          * @param    double N    to Find harmonic Number
          * @returns  double sum  to store the harmonic Number
          */
     	public double harmonicNumber(double N) {
		
			 double sum=0.0;
        	if(N>0)
        	{
        	    for(int i=1;i<=N;i++)
        	    {
        		   sum=sum+(1.0/i);
        	    }
        	}
        	 else
        	 {
        		System.out.println("Enter a number greater than zero"); 
        	 }
        	 return sum;
        }
        
     	/*
     	 * @param    int n  To take input value  
     	 * @returns  prime factor
     	 */
        public int primefactorization(int n)
        {
        	for(int i=2;i*i<=n;i++)
        	{
        		while(n%i==0)
        		{
        			System.out.println(i + " ");
        			n=n/i;
        		}
        	}
        	return n;
        }
         
        /*
         * @param    int stake       stake value
         *           int goal        Goal value
         *           int noOfTimes   number of trials
         * @returns  number of wins, winning and losing percentage
         */
         public void GamblerState(int stake, int goal, int NoOfTimes)
         {
        	 int wins=0;
        	 for(int i=0;i<NoOfTimes;i++)
        	 {
        		 int money = stake;
        		 while(money > 0 && money < goal)  
        		 {
        			          
        			 if(Math.random()<0.5)
        			 {
        				money++; 
        			 }
        			 else
        			 {
        				 money--;
        			 }
        			 
        			 if(money==goal)
        			 {
        				 wins++;        //Gambler wins
        			 }
        		 }
        		 
        	 }
        	 double winPercentage = (double) wins*100/NoOfTimes;
        	 System.out.println("Number of wins: " + wins);
        	 System.out.println("Winning percentage is:" + winPercentage);
        	 System.out.println("Losing pecentage is:" +(100-winPercentage));
        	 
         }
         
         /*
          * @param    int n number of coupons
          * @returns  random numbers generated to generate coupon numbers
          */
         public void generateCouponNumbers(int n)
         {
        	 Random random=new Random();
        	 int count = 0,i=0;
        	 int array[]=new int[n];
        	 
        	 while(i<n)
        	 {
        		 count++;
        		 int ran=random.nextInt(n);
        		 int check=0;
                    for(int j=0;j<n;j++)
                    {
        		       if(array[i]==ran)
        		       {
        		     	    check=1;
        		       }
                    }
                   if(check==0)
        		    {
        			    array[i]=ran;
        			    i++;
        		    } 
              }
        		 
        	 System.out.println("" + count);
         }
         
         /*
          * @param none
          * @returns 2d array
          */
         public void intArray()
         {
        	 PrintWriter printwriter=new PrintWriter(System.out,true);
        	 System.out.println("Enter number of rows:");
        	 int p=inputInt();
        	 System.out.println("Enter number of colomns:");
        	 int q=inputInt();
        	 int intArray[][]=new int[p][q];
        	 printwriter.println("Enter array:");
        	 for(int i=0;i<p;i++)
        	 {
        		 for(int j=0;j<q;j++)
        		 {
        			 intArray[i][j]=inputInt();
        		 }
        	 }
        	 for(int i=0;i<p;i++)
        	 {
        		 for(int j=0;j<q;j++)
        		 {
        			 printwriter.println(intArray[i][j]);
        		 }
        		 
        	 }
         }
         
         /*
          * @param none
          * @returns the number of distinct triplets
          */
         public void sumOf3()
         {
        	 int count=0;
        	 int arr[]={1,2,-3,8,-1,7,-6,7,5,6};
        	 for(int i=0;i<arr.length;i++)
        	 {
        		 for(int j=i+1;j<arr.length;j++)
        		 {
        			 for(int k=j+1;k<arr.length;k++)
        			 {
        				 if(arr[i]+arr[j]+arr[k]==0)
        				 {
        					 System.out.println(arr[i]+" "+arr[j]+ " "+arr[k]);
        					 count++;
        				 }
        			 }
        		 }
        	 }
        	 System.out.println(count);
         }
         
         /*
          * @param    double x  
          *           double y  
          * @returns  sqrt of x and y co-ordinate
          */
         public double distanceMeasurement(double x, double y)
         {
        	 return Math.pow((Math.pow(x, 2)+Math.pow(y, 2)),0.5);
         }
         
         /*
          * @param     none
          * @returns   current time int milliseconds
          */
         public long currentTime()
         {
        	 long time = System.currentTimeMillis();
        	 return time;
         }
         
         /*
          * @param     long start  to start timer
          *            long end    to end timer
          * @returns   elapsed time
          */
         public long elapsedTime(long start, long end)
         {
        	 long elapsed = end - start;
        	 return elapsed;
         }
         
         /*
          * @param    String permutation  to print permutation
          *           String input        input string
          * @returns  all permutations
          */
         public void allPermutation(String permutation, String input)
         {
        	 if(input.length()==0)
        	 {
        		 System.out.println(permutation);
        	 }
        	 for(int i=0;i<input.length();i++)
        	 {
        		 allPermutation(permutation + input.charAt(i), input.substring(0, i) + input.substring(i + 1));
        	 }
         }
         
         /*
          * @param
          * @returns
          */
         public void quadraticEquation(double a,double b,double c)
         {
        	 double delta = (double)(b*b)-(4*a*c);
        	 double x1 = (double)(-b+(Math.sqrt(delta)))/(2*a);
        	 double x2 = (double)(-b-(Math.sqrt(delta)))/(2*a);
        	 System.out.println("Root 1 is: " + x1);
        	 System.out.println("Root 2 is: " + x2);
         } 
         
         /*
          * @param    none
          * @returns  windchill
          */
         public  void windchillCalculate()
         {
        	 double t,v,windchill;
        	 System.out.println("Enter the temperature and speed:");
        	 t=inputDouble();
        	 v=inputDouble();
        	 if(t>50)
        	 {
        		 System.out.println("Temperature should not be greater than 50");
        		 windchillCalculate();
        		 return;
        	 }
        	 if(v>120 && v<3)
        	 {
        		 System.out.println("Velocity should be less than 120 and greater than 3");
        		 windchillCalculate();
        		 return;
        	 }
        	 
        	 windchill=35.74+0.6215*t+(0.4575*t-35.75)*Math.pow(v,0.6);
        	 System.out.println("Windchill: " + windchill);
         }
         
         /*
          * @param     str1  first given string
          *            str2  second given string
          * @returns   strings are anagram or not.
          */
         public boolean anagramStrings(String str1,String str2)
         {
        	 
        	 
        	 str1 = str1.toLowerCase();
        	 str2 = str2.toLowerCase();
        	 
        	 if(str1.length()!=str2.length())
        	 {
        		 return false;
        	 }
        	 else
        	 {
        		 char[] s1=str1.toCharArray();
        		 char[] s2=str2.toCharArray();	 
        		 Arrays.sort(s1);
        		 Arrays.sort(s2);
            	 if(Arrays.equals(s1,s2))
            	       return true;
        	  }
			return false;
        	
         }
         
         /*
          * @param    n    range
          * @returns  prime numbers between 0 to 1000
          */
         public String[] prime(int n) 
         {
     		String[] arrstr = new String[1000];
     		int position = 0;
     		for(int i = 2; i <= n; i++) 
     		{
     		    boolean isPrime = true;
     			
     			for(int j = 2; j <= i / 2; j++)
     			{
     				if((i % j) == 0) 
     				{
     					isPrime = false;
     					break;
     				}
     			}
     			if(isPrime) 
     			{
     				arrstr[position] = String.valueOf(i);
     				position++;
     			}
     		}
     		String[] returnArray = new String[position];
     		for(int k = 0; k < position; k++) 
     		{
     			returnArray[k] = arrstr[k];
     		}
     		return returnArray;
     	}

     	
//     	public static void primePrint(int num) {
//     		for (int i = 2; i <= num; i++) {
//     			if (prime(i)) {
//     				System.out.print(i + " ");
//     			}
//     		}
//		
//     	}
//         
         /*
          * @param    arr[]  array to be sorted
          *           n      length of the array
          * @returns  Sorted array
          */
         public void bubble(int arr[], int n)
         {
        	 int temp;
        	 n=arr.length;
        	 System.out.println("Sorted array is:");
        	 for(int i=0;i<n;i++)
        	 {
        		 for(int j=i+1;j<n;j++)
        		 {
        			 if(arr[i]>arr[j])
        			 {
        				 temp=arr[i];
        				 arr[i]=arr[j];
        				 arr[j]=temp;
        			 }
        		 }
        		 System.out.print(arr[i] + " ");
        	 }
         }
         
         /*
          * @param    String[] words  array of elements
          * @returns  mid
          */
         public int binarySearchWord(String[] words, String x)
         {
        	 int first=0;
        	 int last=words.length;
             
             while(first<last)
             {
            	int mid=(first+last)/2;
            	if(x.compareTo(words[mid])<0)
            	{
            		last=mid;
            	}
            	else if(x.compareTo(words[mid])>0)
            	{
            		first=mid+1;
            	}
            	else 
            	{
            		return mid;
            	}
            	
             }
             return -1; 
         }
         
         /*
          * @param    count, first, last, mid
          *           x    input String
          *           n    size of array
          * @return   element found or not  
          */
         public void question(int count,int first,int last,int mid,String x,int n)
         {
        	 System.out.println("Is your number:" + mid);
        	 System.out.println("Select between 'Yes', 'High' and 'Low'");
        	 x = inputString();
        	 
        	 do
        	 {
        		 count++;
        		 if(x.equals("Yes"))
        		 {
        			 System.out.println("Your number is:" + mid);
        			 System.out.println("Your number found in " + count + " counts");
        			 break;
        		 }
        		 else if(x.equals("High"))
        		 {
        			 first=mid+1;
        		 }
        		 else if(x.equals("Low"))
        		 {
        			 last=mid;
        		 }
        		 if(count<n)
        	     {
        			 mid=(first+last)/2;
        			 System.out.println("Is your number:" + mid);
        			 x = inputString();
        	     }
        	 }while(first<=last);
        	 
        	 if(count>n)
        	 {
        		 System.out.println("Element not found");
        	 }
         }
         
         /*
          * @param     String arr[]  user input string
          * @returns   Sorted array using insertion sort
          */
         public void insertion(String arr[], int n)
         {
             for(int i=1;i<n;i++)
             {
            	 String a = arr[i]; 
            	 int j = i-1; 
            	  
            	            
            	 while (j>=0 && arr[j].compareTo(a)>0) 
            	 { 
            	     arr[j+1] = arr[j]; 
            	     j = j-1; 
            	 } 
            	 arr[j+1] = a;
              }
             System.out.println("Sorted array is:");
             for(int k=0;k<n;k++)
             {
            	 System.out.print(arr[k] + " ");
             }
          }
         
         /*
          * @param     
          * @returns
          */
         public static void MergeSort(String[] str) {
     		if (str.length > 2) {
     			String[] left = new String[str.length / 2];
     			String[] right = new String[str.length - str.length / 2];

     			for (int i = 0; i < left.length; i++) {
     				left[i] = str[i];
     			}

     			for (int i = 0; i < right.length; i++) {
     				right[i] = str[i + str.length / 2];
     			}
     			MergeSort(left);
     			MergeSort(right);
     			merge(str, left, right);
     		   }
     	     }
         
         public static void merge(String str[], String left[], String right[]) 
         { 
        	int a = 0;
     	    int b = 0;
     		for (int i = 0; i < str.length; i++) {
     			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
     				str[i] = left[a];
     				a++;
     			} else {
     				str[i] = right[b];
     				b++;
     			}
     		}
        	 
        	 
        	 
         }	 
        
         
         /*
          *@param   notes[] array of notes
          *         amt     input amount
          *         total   to count total no of notes
          *         i       position of array notes    
          *@returns total number of minimum notes
          */
         public int vendingMachine(int[] notes, int amt, int total, int i)
         {
        	 int rem=0;
        	 if(amt==0)
        	 {
        		 return total;
        	 }
        	 else
        	 {
        		 if(amt>=notes[i])
        		 {
        			 int result = amt/notes[i];
        			 rem = amt%notes[i];
        			 amt=rem;
        			 total=total+result;
        			 System.out.println(notes[i] + "'s notes " + result);
        		 }
        	 }
        	 i++;
        	 return vendingMachine(notes, amt, total,i);
        }
         
         /*
          *@param     m  month
          *           d  day
          *           y  year
          *@returns   weekday
          */
         public int calender(int m,int d,int y)
         {
        	int y0 = y - ((14 - m) / 12);
     		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
     		int m0 = m + 12 * ((14 - m) / 12) - 2;
     		int d0 = (d + x + (31 * m0 / 12)) % 7;
     		return d0;
         }
         
         /*
          * @param   temp    temperature 
          * @returns temperature in either celcius or fahrenheit
          */
         public double tempConv(double temp, String t)
         {
        	   if(t.equals("c"))
        	   {
        		   return (((double)temp * 9 / 5) + 32);
        	   }
        	   else
        	   {
        		   return ((double)temp - 32) * 5 / 9;
        	   }
         }
        public void tempConversion()
        {
              System.out.println("Enter 'f' for fahrenheit and 'c' for celcius as temperature:");
              String t=inputString(); 
            	if(t.equals("c"))
              {
                 	System.out.println("Enter temperature in celcius:");
                	double cTemp = inputDouble(); 
                	System.out.format("Temperature in farenheit is: %.2f" , tempConv(cTemp, t));

              }
              else if(t.equals("f"))
              {
                	System.out.println("Enter temperature in fahrenheit:");
                  double fTemp = inputDouble();
                	System.out.format("Temperature in celcius is: %.2f" , tempConv(fTemp, t));
               }
               else
               {
                	System.out.println("You Entered a wrong unit. Please Enter 't' or 'c' as unit.");
                	tempConversion();
               }
        	   
         }
        
        /*
         * @param    P personal loan
         *           Y years to pay loan
         *           R interest over loan
         * @returns  monthly payment
         */
        public double pay(double P, double Y, double R)
        {
        	double n = (double) -1 * 12 * Y;
        	double r = (double) R / (12 * 100);
        	double payment =  (double) (P * r) /(1 - Math.pow((1 + r), n));
        	return payment;
        }
        
        /*
         * @param    c   input number
         *           t   input number
         * @returns  square root
         */
        
        public double sqRoot(double c) {
        	double t = c;
    		if(c>0)
    	    {
    			double epsilon = Math.pow(1 * 2.71828 , -15);
    			while(Math.abs(t - (c / t)) > (epsilon * t))
    			{
    			    t = (double)((c / t) + t) / 2;
    		    }
    		}
    		else
    		{
    			System.out.println("Number Can,t be negative, please enter positive number");
    		}
    			
    		return t;
    	}
        
        /*
         * @param     n  input decimal number
         * @returns   binary number
         */
        public void toBinary(int n)
        {
        	int binaryArr[] = new int[100];
        	int i=0;
        	while(n>0)
        	{
        		binaryArr[i] = n%2;
        		n=n/2;
        		i++;
        	}
        	for(int j=i-1;j>=0;j--)
        	{
        		System.out.print(binaryArr[j] + " ");
        	}
        	
        }
        
        /*
         * @param    n   input decimal number
         * @returns  
         */
//        public int swapNibbles(int n)
//        {
        	public int swapNibbles(String binaryStr) {
        		int len = binaryStr.length();
        		for(int i = 0; i < 8 - len; i++) {
        			binaryStr = "0" + binaryStr;
        		}
        		String n1 = binaryStr.substring(0,4);
        		String n2 = binaryStr.substring(4);
        		return Integer.parseInt(n2 + n1);  
//        		return (String)binaryString;
//        	return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
        }
        
        /*
      	 *@
       	 */
        public int binaryToDec(int result)
        {
        	int temp = result;
        	int decValue = 0;
        	int base = 1;
        	while(temp>0)
        	{
        		int last = temp % 10; 
                temp = temp / 10; 
                decValue += last * base; 
                base = base * 2; 
            } 
            return decValue; 
        }
        	
        public boolean powerOf(int value)
        {
        	String binString = String.valueOf(value);
        	for(int i = 0; i <= binString.length(); i++)
        	{
        		if(binString.charAt(i) != 0)
        		{
        			return false;
        		}
        	}
        	return true;
        }
        
        /*
         *@param   arr[]   integer array
         *@returns key     element to be searched
         */
        public int binSearchInt(int arr[],int key)
        {
        	int first = 0;
        	int last = arr.length -1;
        	int mid;
        	while(first<=last)
        	{
        		mid=(first+last)/2;
        		if(arr[mid]>key)
        		{
        			last = mid;
        		}
        		else if(arr[mid]<key)
        		{
        			first = mid + 1;
        		}
        		else
        		{
        			return mid;
        		}
        	}
        	return -1;
        }
        
        /*
         *@param   array[]    String array
         *@returns keyStr     element to be searched
         */
        public int binSearchStr(String array[],String keyStr)
        {
        	int first = 0;
        	int last = array.length - 1;
        	int mid;
        	while(first<=last)
        	{
        		mid=(first+last)/2;
        		if(keyStr.compareTo(array[mid])<0)
        		{
        			last = mid;
        		}
        		else if(keyStr.compareTo(array[mid])>0)
        		{
        			first = mid + 1;
        		}
        		else
        		{
        			return mid;
        		}
        	}
        	return -1;
        }
        
        /*
         * @param     arrInt[]  user input int array
         * @returns   Sorted int array using insertion sort
         */
        public void insertionSortInt(int arrInt[], int nI)
        {

            for(int i=1;i<nI;i++)
            {
           	 int a = arrInt[i]; 
           	 int j = i-1; 
           	  
           	            
           	 while (j>=0 && arrInt[j]>(a)) 
           	 { 
           	     arrInt[j+1] = arrInt[j]; 
           	     j = j-1; 
           	 } 
           	 arrInt[j+1] = a;
             }
            System.out.println("Sorted array is:");
            for(int k=0;k<nI;k++)
            {
           	 System.out.print(arrInt[k] + " ");
            }
         }
        
        /*
         * @param    arrInt1[]  use input int array 
         *           nI1        length of the array
         * @returns  Bubble sorted array
         */
        public int[] bubbleSortInt(int arrInt1[], int nI1)
        {
       	 int temp;
       	 nI1=arrInt1.length;
       	 System.out.println("Sorted array is:");
       	 for(int i=0;i<nI1;i++)
       	 {
       		 for(int j=i+1;j<nI1;j++)
       		 {
       			 if(arrInt1[i]>arrInt1[j])
       			 {
       				 temp=arrInt1[i];
       				arrInt1[i]=arrInt1[j];
       				arrInt1[j]=temp;
       			 }
       		 }
       		
       	 }
       	 return arrInt1;
        }
        
        /*
         * @param    arrStr1[]    user input string array
         *           nS1          length of the array
         * @returns  string sorted array
         */
        public String[] bubbleSortStr(String arrStr1[], int nS1)
        {
       	 String temp;
       	 nS1=arrStr1.length;
       	 System.out.println("Sorted array is:");
       	 for(int i=0;i<nS1;i++)
       	 {
       		 for(int j=i+1;j<nS1;j++)
       		 {
       			 if(arrStr1[i].compareTo(arrStr1[j])>0)
       			 {
       				temp=arrStr1[i];
       				arrStr1[i]=arrStr1[j];
       				arrStr1[j]=temp;
       			 }
       		 }
       		 
       	 }
       	 return arrStr1;
        }
        
        /*
         * @param
         * @returns 
         */
        
        public static void print(char[][] game) {
    		for (int i = 0; i < game.length; i++)
    		{
    			System.out.print("| ");
    			for (int j = 0; j < game.length; j++)
    			{
    				System.out.print(game[i][j] + " | ");
    			}
    			System.out.println("\n");
    		}
   
    	}
        
        public boolean checkPalindrome(String string) {
    		if(string.length() < 2) {
    			return false;
    		}
    		char[] array = string.toCharArray();
    		int n = array.length;
    		for(int i = 0; i < n; i++) {
    			if(array[i] != array[n - 1 - i]) {
    				return false;
    			}
    		}
    		return true;
        }
        
    	public static boolean checkPalindromeWord(String word) {
    		int size = word.length();
    		boolean isPalindrome = true;
    		Dequeue<Character> d = new Dequeue<Character>(size);
    		char ch[] = word.toCharArray();
    		
    		for(int i = 0; i < ch.length; i++)
    		{
    			d.addRear(ch[i]);
    		}
     		for(int i = 0; i < ch.length / 2; i++)
     		{
    			if (d.removeFront() != d.removeRear()) 
    			{
    				isPalindrome = false;
    				break;
    			}
    		}
    		return isPalindrome;
    	}
       
    	public static boolean balancedParanthesis(String exp)
    	{
    		
    		int len = exp.length();
    		Stack<Character> stack = new Stack<Character>(len);
    		char expArr[] = exp.toCharArray();
    		char ch=0;
            try {
    		for (int i = 0; i < expArr.length; i++)
    		{

    			if (expArr[i] == '(')
    			{
    				stack.push(expArr[i]);
    			}
    			else if (expArr[i] == ')')
    			{
    			    ch = stack.pop();
    			    switch(ch)
    			    {
    			    case ')':
    			    	if(ch != '(');
    					return false;
    			    }
    	        }
    		 }

            }
            catch(NullPointerException np)
            {
            	np.printStackTrace();
            }

    		return stack.isEmpty();
    	 }

    	
        


}

