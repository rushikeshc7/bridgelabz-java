package utility;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Utility {
       static Scanner sc=new Scanner(System.in);
		/*
		@param     int y   year
		@returns           the year is leap year or not
		*/
		public void checkLeapYear(int y)
		{
			if(y>1000 && y<10000)
			{
				if(y%4==0)
				{
					System.out.println(y + " is leap year");
				}
				else
				{
					System.out.println(y + " is not leap year");
				}
			}
		}
		
		
		/*
		 * @param      none
		 * @returns    the username we want to replace
		 */
		public void replaceUserName()
		{
			System.out.println("Enter the name you want to replace");
	        String s=sc.next();
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
			n=sc.nextInt(); 
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
        		 int t=0;
                    for(int j=0;j<n;j++)
                    {
        		       if(array[i]==ran)
        		       {
        		     	    t=1;
        		       }
                    }
                    if(t==0)
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
        	 int p=sc.nextInt();
        	 System.out.println("Enter number of colomns:");
        	 int q=sc.nextInt();
        	 int intArray[][]=new int[p][q];
        	 printwriter.println("Enter array:");
        	 for(int i=0;i<p;i++)
        	 {
        		 for(int j=0;j<q;j++)
        		 {
        			 intArray[i][j]=sc.nextInt();
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
        	 t=sc.nextDouble();
        	 v=sc.nextDouble();
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
         public void anagramStrings(String str1,String str2)
         {
        	 
        	 
        	 str1 = str1.toLowerCase();
        	 str2 = str2.toLowerCase();
        	 
        	 if(str1.length()!=str2.length())
        	 {
        		 System.out.println("The strings are not anagrams");
        	 }
        	 else
        	 {
        		 char[] s1=str1.toCharArray();
        		 char[] s2=str2.toCharArray();	 
        		 Arrays.sort(s1);
        		 Arrays.sort(s2);
            	 if(Arrays.equals(s1,s2))
            	 {
            		System.out.println("The Strings are anagram."); 
            	 }
            	 else
            	 {
            		 System.out.println("The Strings are not anagram.");
            	 }
        	  }
        	
         }
         
         /*
          * @param    None
          * @returns  prime numbers between 0 to 1000
          */
         public void prime()
         {
        	 String primeNumber= " ";
        	 for(int i=1;i<1000;i++)
        	 {
        		 int count=0;
        		 for(int j=i;j>=1;j--)
        		 {
        			 if(i%j==0)
        			 {
        				 count=count+1;
        			 }
        	     }
        		 if(count==2)
        		 {
        			 primeNumber=primeNumber+i+" ";
        		 }
        	 }
        	 System.out.println("Prime numbers from 0 to 1000 is: ");
        	 System.out.println(primeNumber);
         }
         
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
        	 x = sc.next();
        	 
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
        			 x = sc.next();
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
          * @param     arr[]  input array
          *            left    left side of array
          *            m      mid
          *            right   right side of array
          * @returns
          */
         public void merge(int arr[], int left, int m, int right) 
         { 
             int n1 = m - left + 1; 
             int n2 = right - m; 
       
             /* Create temp arrays */
             int L[] = new int [n1]; 
             int R[] = new int [n2]; 

             for (int i=0; i<n1; ++i) 
                 L[i] = arr[left + i]; 
             for (int j=0; j<n2; ++j) 
                 R[j] = arr[m + 1 + j]; 
       
             int i = 0, j = 0; 
      
             int k = left; 
             while (i < n1 && j < n2) 
             { 
                 if (L[i] <= R[j]) 
                 { 
                     arr[k] = L[i]; 
                     i++; 
                 } 
                 else
                 { 
                     arr[k] = R[j]; 
                     j++; 
                 } 
                 k++; 
             } 

             while (i < n1) 
             { 
                 arr[k] = L[i]; 
                 i++; 
                 k++; 
             } 
      
             while (j < n2) 
             { 
                 arr[k] = R[j]; 
                 j++; 
                 k++; 
             } 
         }
         public void sort(int arr[], int left, int right) 
         { 
             if (left < right) 
             { 
                 int m = (left+right)/2; 
                 sort(arr, left, m); 
                 sort(arr , m+1, right);
                 merge(arr, left, m, right); 
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
         public double calender(double m,double d,double y)
         {
        	double y0 = y - ((14 - m) / 12);
     		double x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
     		double m0 = m + 12 * ((14 - m) / 12) - 2;
     		double d0 = (d + x + (31 * m0 / 12)) % 7;
     		return (int)d0;
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
              String t=sc.next(); 
            	if(t.equals("c"))
              {
                 	System.out.println("Enter temperature in celcius:");
                	double cTemp = sc.nextDouble(); 
                	System.out.format("Temperature in farenheit is: %.2f" , tempConv(cTemp, t));

              }
              else if(t.equals("f"))
              {
                	System.out.println("Enter temperature in fahrenheit:");
                  double fTemp = sc.nextDouble();
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
        double epsilon = Math.pow(1 * 2.71828 , -15);
        public double sqRoot(double c) {
        	double t = c;
        	t = (double)((c / t) + t) / 2;
        	double r = t;
    		if(Math.abs(r - (c / r)) > (epsilon * r)){
    			return r;
    		}
    		return sqRoot(c);
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
        public int[] insertionSortInt(int arrInt[], int nI)
        {
            for(int i=1;i<nI;i++)
            {
           	 int a = arrInt[i]; 
           	 int j = i-1; 
           	  
           	            
           	 while (j>=-1 && arrInt[j]<(a)) 
           	 { 
           		arrInt[j+1] = arrInt[j]; 
           	     j = j--; 
           	 } 
           	arrInt[j+1] = a;
             }
            return arrInt;
         }
        
        /*
         * @param     arrStr[]  user input str array
         * @returns   Sorted string array using insertion sort
         */
        public String[] insertionSortStr(String arrStr[], int nS)
        {
            for(int i=1;i<nS;i++)
            {
           	 String a = arrStr[i]; 
           	 int j = i-1; 
           	  
           	            
           	 while (j>=-1 && arrStr[j].compareTo(a)<0) 
           	 { 
           	     arrStr[j+1] = arrStr[j]; 
           	     j = j-1; 
           	 } 
           	 arrStr[j+1] = a;
             }
            return arrStr;
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
}
