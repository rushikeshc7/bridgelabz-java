package utility;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import Method.LinkedList;
import Method.Dequeue;
import Method.Stack;
public class Utility {
	 /*
	  * @auther: Rushikesh Chopade
	  * @since: 18/02/2019
	  * @version: 1.0.0
	  */
	  static Scanner sc=new Scanner(System.in);
	 
	 
	  /*
	   * @Aim: To get the integer from user
	   */
	   public static int inputInt()
	   {
	     	int num = sc.nextInt();
	    	return num;
	   }
	   
	   
	   /*
		* @Aim: To get the String from user
		*/
	   public static String inputString()
	   {
	    	String str = sc.nextLine();
	     	return str;
	   }
	   
	   
	   /*
		* @Aim: To get the single word string from user
		*/
	   public static String inputStr()
	   {
	    	String singleWordString = sc.next();
	    	return singleWordString;
	   }
	   
	   
	   /*
		* @Aim: To get the float from user
		*/
	   public static float inputFloat()
	   {
	    	float flt = sc.nextFloat();
	    	return flt;
	   }

	   
	   /*
		* @Aim: To get the double from user
		*/ 
	   public static double inputDouble()
	   {
		    double dbl = sc.nextDouble();
	    	return dbl;
	   }
	    
	   
		/*
		 * @pupose   Leap year
		 * @param    y: user input year
		 * @returns  true if the input is leap year else false
		 */
		public boolean checkLeapYear(int y)
		{
			//To make sure input year contains 4 digit 
			if(y>1000 && y<10000)
			{
				//If the year is completely divisible by 4 then it's a leap year. 
				if(y%4==0)
				{
					return true;  //returns true if the year is leap year
				}
				else
				{
					return false; //returns false if the year is not leap year
				}
			}
			return true;
		}
		
		
		/*
		 * @pupose User Input and Replace String Template “Hello <<UserName>>, How are you?”
		 */
		public void replaceUserName()
		{
			//To take the user input string
			System.out.println("Enter the name you want to replace");
	        String s=inputString();
	        
	        //replacing the string with the username
	        System.out.println("Hello " + s + ",How are You?");
		}
        
		
		/*
		 *@pupose  Flip Coin and print percentage of Heads and Tails
		 */
		public void coinToss()
		{ 
			int n;
			
			//To take the input from user 
			System.out.println("Enter the number of times coin flipped:");
			n=inputInt(); 
			
			//Use random function to take the random value
			Random random=new Random();
			
			int head=0,tail=0;
			
			//To iterate through 0 to n, where n is no. of times coin flipped  
			for(int i=0;i<n;i++)
			{
				//to take random value from range 0 to 1
				int result = random.nextInt(2);
				if(result<0.5)
				{
					tail++;    //increment tail
				}
				else
				{
					head++;    //increment head
				}
			}
			
			//To print percentage of head and tail
			System.out.println("Percentage of head: " + (double) head*100/n);
			System.out.println("Percentage of tail: " + (double) tail*100/n);
		}
		
		
		/*
		 * @Aim  Power of 2
		 * @param    n: to store power
		 */
         public void powerOfTwo(int n)
         {
        	 //To take power of 2 using Math.pow function
        	 System.out.println("Power of 2^" + n + " is " + (int)Math.pow(2,n));
        	 System.out.println();
        	 
        	 //Range of n should be between 0 to 31
        	 if(n>=0 && n<=31)
        	 {
        	     for(int i=1;i<=n;i++)
        	     {
        	    	 //To print power of 2
        	         System.out.println("Power of 2^" + i + " is " + (int)Math.pow(2, i));
        		 }
        	 }
        	 else
        	 {
        		 System.out.println("Enter the number between 0 and 31");
        	 }
         }
         
         
         /*
          * @pupose   Harmonic Number
          * @param    N:    To take user input
          * @returns  sum
          */
     	public double harmonicNumber(double N) 
     	{
			double sum=0.0;
			
			//N should be positive number
        	if(N>0)
        	{   
        		//Loop to add 1/1 + 1/2 + 1/3 + ... + 1/n. 
        	    for(int i=1;i<=N;i++)
        	    {
        		   sum=sum+(1.0/i);   //To store is harmonic number in sum variable
        	    }
        	}
        	 else
        	 {
        		System.out.println("Enter a number greater than zero"); 
        	 }
        	 return sum;
        }
        
     	
     	/*
     	 * @Aim  Prime Factorization
     	 * @param    n  To take input from input  
     	 * @returns  n
     	 */
        public int primefactorization(int n)
        {
        	//Traverse through 2 to n to find prime factor
        	for(int i=2;i*i<=n;i++)
        	{
        		while(n%i==0)
        		{
        			System.out.println(i + " ");
        			n=n/i;
        		}
        	}
        	return n;     //To return the prime factors
        }
         
        
        /*
         * @Aim  ­Print Number of Wins and Percentage of Win and Loss.
         * @param    stake       stake value
         *           goal        Goal value
         *           noOfTimes   number of trials
         */
         public void GamblerState(int stake, int goal, int NoOfTimes)
         {
        	 int wins=0;
        	 
        	 //To iterate through number of trials
        	 for(int i=0;i<NoOfTimes;i++)
        	 {
        		 int money = stake;
        		 
        		 //Loop till gambler is broke or has won
        		 while(money > 0 && money < goal)  
        		 {
        			 //To find the random  number         
        			 if(Math.random()<0.5)
        			 {
        				money++;    //if less than 0.5, cash increses
        			 }
        			 else
        			 {
        				 money--;   //if more than 0.5, cash decreses
        			 }
        			 
        			 if(money==goal)
        			 {
        				 wins++;        //Gambler wins
        			 }
        		 }
        		 
        	 }
        	 //To find win percentage
        	 double winPercentage = (double) wins*100/NoOfTimes;
        	 System.out.println("Number of wins: " + wins);
        	 
        	 //To find winnng and losing percentage
        	 System.out.println("Winning percentage is:" + winPercentage);
        	 System.out.println("Losing pecentage is:" +(100-winPercentage));
        	 
         }
         
         
         /*
          * @Aim  total random number needed to have all distinct numbers.
          * @param    n: number of coupons
          */
         public void generateCouponNumbers(int n)
         {
        	 //To find random number
        	 Random random=new Random();
        	 int count = 0,i=0;
        	 int array[]=new int[n];
        	 
        	 //loop till i is less than number of coupons
        	 while(i<n)
        	 {
        		 
        		 count++;
        		 
        		 //Random number in range from 0 to n, where n is no. of coupons
        		 int ran=random.nextInt(n);
 
        		 int check=0;
        		 //Ti iterate through the array of coupons
                    for(int j=0;j<n;j++)
                    {
                       //if random number is already present in array, then ignore the random number
        		       if(array[i]==ran)  
        		       {
        		     	    check=1;
        		       }
                    }
                  //if random number is not present in array, then put the random number in the array
                   if(check==0)     
        		    {
        			    array[i]=ran;
        			    i++;
        		    } 
              }
        	 //To print the number the number of coupons generated	 
        	 System.out.println("" + count);
         }
         
         
         /*
          * @Aim  Print function to print 2 Dimensional Array.
          */
         public void intArray()
         {
        	 //PrintWriter function to print the output to the screen.
        	 PrintWriter printwriter=new PrintWriter(System.out,true);
        	 
        	 //user input to take number of rows
        	 System.out.println("Enter number of rows:");
        	 int p=inputInt();
        	 
        	 //user input to take number of columns
        	 System.out.println("Enter number of columns:");
        	 int q=inputInt();
        	 
        	 int intArray[][]=new int[p][q];
        	 printwriter.println("Enter array:");
        	 
        	 //Loop to take array elements
        	 for(int i=0;i<p;i++)
        	 {
        		 for(int j=0;j<q;j++)
        		 {
        			 intArray[i][j]=inputInt();
        		 }
        	 }
        	 
        	 //Loop to print array
        	 for(int i=0;i<p;i++)
        	 {
        		 for(int j=0;j<q;j++)
        		 {
        			 printwriter.println(intArray[i][j]);
        		 }
        		 
        	 }
         }
         
         
         /*
          *@Aim  Sum of three Integer adds to ZERO
          */
         public void sumOf3()
         {
        	 int count=0;
        	 int arr[]={1,2,-3,8,-1,7,-6,7,5,6};
        	 
        	 //Loop to find the triplets 
        	 for(int i = 0; i<arr.length - 2; i++)
        	 {
        		 for(int j =i + 1 ;j < arr.length - 1; j++)
        		 {
        			 for(int k = j+1 ;k < arr.length; k++)
        			 {
        				 //Sum of three integers is zero
        				 if(arr[i] + arr[j] + arr[k] == 0)
        				 {
        					 //To print the three intergers
        					 System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
        					 count++;
        				 }
        			 }
        		 }
        	 }
        	 //Number of distinct triplets
        	 System.out.println("Number of triplets: " + count);
         }
         
         
         /*
          * @Aim      Calculate the distance from point(x,y) to origin(0,0)
          * @param    x: x co-ordinate
          *           y: y co-ordinate
          * @returns  sqrt of x and y co-ordinate
          */
         public double distanceMeasurement(double x, double y)
         {
        	 //returns the distance formulae
        	 return Math.pow((Math.pow(x, 2)+Math.pow(y, 2)),0.5);
         }
         
         
         /*
          * @Aim      print the elapsed time using stopwatch
          * @returns  current time int milliseconds
          */
         public long currentTime()
         {
        	 //to take current time in miliseconds
        	 long time = System.currentTimeMillis();
        	 return time;
         }
         
         
         /*
          * @param     start:  start time
          *            end:    end time
          * @returns   elapsed time
          */
         public long elapsedTime(long start, long end)
         {
        	 long elapsed = end - start;
        	 return elapsed;
         }
         
         
         /*
          * @Aim      Find all the permutatgions of the string
          * @param    permutation  to print permutation
          *           input        user input string
          * @returns  all permutations
          */
         public void allPermutation(String permutation, String input)
         {
        	 //If the length of input id 0, print permutation
        	 if(input.length()==0)
        	 {
        		 System.out.println(permutation);
        	 }
        	 
        	 //Loop to iterate through input string
        	 for(int i=0;i<input.length();i++)
        	 {
        		 //Recursive function to print get all permutations
        		 allPermutation(permutation + input.charAt(i), input.substring(0, i) + input.substring(i + 1));
        	 }
         }
         
         /*
          *@Aim      Find the roots of quadratic equation
          *@param    a: input
          *          b: input
          *          c: input
          */
         public void quadraticEquation(double a,double b,double c)
         {
        	 //Formula to find quadratic equation
        	 double delta = (double)(b*b)-(4*a*c);
        	 double x1 = (double)(-b+(Math.sqrt(delta)))/(2*a);
        	 double x2 = (double)(-b-(Math.sqrt(delta)))/(2*a);
        	 
        	 //to print the root 1 and 2
        	 System.out.println("Root 1 is: " + x1);
        	 System.out.println("Root 2 is: " + x2);
         } 
         
         /*
          * @Aim   Find the windchill using temperature t and speed v
          */
         public void windchillCalculate()
         {
        	 double t,v,windchill;
        	 System.out.println("Enter the temperature and speed:");
        	 t=inputDouble();
        	 v=inputDouble();
        	 //tempreature should be less than 50
        	 if(t>50)
        	 {
        		 System.out.println("Temperature should not be greater than 50");
        		 windchillCalculate();
        		 return;
        	 }
        	 //speed range should be 4 to 119
        	 if(v>120 && v<3)
        	 {
        		 System.out.println("Velocity should be less than 120 and greater than 3");
        		 windchillCalculate();
        		 return;
        	 }
        	 
        	 //Formula to find windchill
        	 windchill=35.74+0.6215*t+(0.4575*t-35.75)*Math.pow(v,0.6);
        	 //print windchill
        	 System.out.println("Windchill: " + windchill);
         }
         
         /*
          * @Aim       Find if the two strings are anagram or not
          * @param     str1  first input string
          *            str2  second input string
          * @returns   true if strings are anagram else returns false
          */
         public boolean anagramStrings(String str1,String str2)
         {
        	 //Convert str1 and str 2 to lower case
        	 str1 = str1.toLowerCase();
        	 str2 = str2.toLowerCase();
        	 
        	 //check if length of 2 strings are equal
        	 if(str1.length() != str2.length())
        	 {
        		 return false;
        	 }
        	 else
        	 {
        		 //convert both strings to char array
        		 char[] s1=str1.toCharArray();
        		 char[] s2=str2.toCharArray();	 
        		 
        		 //sort the array
        		 Arrays.sort(s1);
        		 Arrays.sort(s2);
        		 //if strings are equal returns true
            	 if(Arrays.equals(s1,s2))
            	       return true;
        	  }
			return false;
        	
         }
         
         /*
          * @Aim      Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that range.
          * @param    n:  range
          * @returns  Array of prime numbers
          */
         public String[] prime(int n) 
         {
     		String[] arrStr = new String[1000];
     		int position = 0;
     		
    		//Loop to find the prime number
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
     				//if the number id prime, put it in the arrStr
     				arrStr[position] = String.valueOf(i);
     				position++;
     			}
     		}
     		String[] strArray = new String[position];
     		
     		//Loop to take values from arrStr to strArray
     		for(int k = 0; k < position; k++) 
     		{
     			strArray[k] = arrStr[k];
     		}
     		return strArray;    //return strArray
     	}

     	         
         /*
          * @Aim      Bubble sort  
          * @param    arr[]:  User input array
          *           n:      length of the array
          */
         public void bubble(int arr[], int n)
         {
        	 int temp;
        	 n=arr.length;
        	 System.out.println("Sorted array is:");
        	 
        	 //Loop to iterate through array
        	 for(int i=0;i<n;i++)
        	 {
        		 for(int j=i+1;j<n;j++)
        		 {
        			 //if arr[i] is greater than arr[j] then swap
        			 if(arr[i]>arr[j])
        			 {
        				 temp=arr[i];
        				 arr[i]=arr[j];
        				 arr[j]=temp;
        			 }
        		 }
        		 
        		 //print arr[i]
        		 System.out.print(arr[i] + " ");
        	 }
         }
         
         
         /*
          * @Aim      Binary Search the Word from Word List
          * @param    words:  array of elements
          */
         public int binarySearchWord(String[] words, String x)
         {
        	 int first=0;
        	 int last=words.length;
             
             while(first<last)
             {
            	//To find the middle element of array
            	int mid=(first+last)/2;
            	
            	//if x is less than middle element then middle will become last
            	if(x.compareTo(words[mid])<0)
            	{
            		last=mid;
            	}
            	//if x is greater than middle element then middle + 1 will become first
            	else if(x.compareTo(words[mid])>0)
            	{
            		first=mid+1;
            	}
            	else 
            	{
            		//will return middle element
            		return mid;
            	}
            	
             }
             return -1; 
         }
         
         /*
          * @Aim      Question to find your number
          * @param    count, first, last, mid
          *           x    input String
          *           n    size of array
          * @return   element found or not  
          */
         public void question(int count,int first,int last,int mid,String x,int n)
         {
        	 //Ask the user if he found the number
        	 System.out.println("Is your number:" + mid);
        	 
        	 //Choose between 'Yes','High' and 'Low'
        	 System.out.println("Select between 'Yes', 'High' and 'Low'");
        	 x = inputString();
        	 
        	 do
        	 {
        		 count++;
        		 //If user chose 'Yes', then print the number pass it took to find the number
        		 if(x.equals("Yes"))
        		 {
        			 System.out.println("Your number is:" + mid);
        			 System.out.println("Your number found in " + count + " counts");
        			 break;
        		 }
        		 
        		 //If user chose 'High', then middle + 1 will become first element
        		 else if(x.equals("High"))
        		 {
        			 first=mid+1;
        		 }
        		 
        		 //If user chose 'Low', then middle will become last element
        		 else if(x.equals("Low"))
        		 {
        			 last=mid;
        		 }
        		 
        		 //If number of pass is less than size of array, then find the middle
        		 if(count<n)
        	     {
        			 mid=(first+last)/2;
        			 System.out.println("Is your number:" + mid);
        			 x = inputString();
        	     }
        	 }while(first<=last);  //Loop till iterate through array
        	 
        	 //if number of pass is greater than size of array then, print element not found
        	 if(count>n)
        	 {
        		 System.out.println("Element not found");
        	 }
         }
         
         /*
          * @Aim     Insertion sort
          * @param   arr[]:  user input string
          *          n:      length of array
          */
         public void insertion(String arr[], int n)
         {
        	 //Loop to iterate through array
             for(int i=1;i<n;i++)
             {
            	 String a = arr[i]; 
            	 int j = i-1; 
            	  
            	 //Loop till j is greater than or equal to 0 and arr[j] is greater than a       
            	 while (j>=0 && arr[j].compareTo(a)>0) 
            	 { 
            		 //if above condtion is true then swap values
            	     arr[j+1] = arr[j]; 
            	     j = j-1; 
            	 } 
            	 arr[j+1] = a;
              }
             //print the sorted array
             System.out.println("Sorted array is:");
             for(int k=0;k<n;k++)
             {
            	 System.out.print(arr[k] + " ");
             }
          }
         
         /*
          * @Aim       Merge sort
          * @param     str:  user input string array
          */
         public static void MergeSort(String[] str) 
         {
        	 
     		if (str.length > 2) 
     		{
     			//Divide the string in two parts i.e left array and right array 
     			String[] left = new String[str.length / 2];
     			String[] right = new String[str.length - str.length / 2];
                
     			//Loop to iterate through left array
     			for (int i = 0; i < left.length; i++) {
     				left[i] = str[i];
     			}
                
     			//Loop to iterate through right array
     			for (int i = 0; i < right.length; i++) {
     				right[i] = str[i + str.length / 2];
     			}
     			
     			//recursively calling functions
     			MergeSort(left);
     			MergeSort(right);
     			
     			//call the merge function
     			merge(str, left, right);
     		   }
     	     }
         
         public static void merge(String str[], String left[], String right[]) 
         { 
        	int a = 0;
     	    int b = 0;
     	    //Iterate through str array
     		for (int i = 0; i < str.length; i++) {
     			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
     				str[i] = left[a];      //if above condition is true, put element from left array into the str array
     				a++;
     			} else {
     				str[i] = right[b];     //else put element from right array into the str array
     				b++;
     			}
     		}
        	 
        	 
        	 
         }	 
        
         
         /*
          *@Aim     Find the Fewest Notes to be returned for Vending Machine
          *@param   notes[] array of notes
          *         amt     input amount
          *         total   total notes
          *         i       position of notes array     
          *@returns total number of minimum notes
          */
         public int vendingMachine(int[] notes, int amt, int total, int i)
         {
        	 int rem=0;
        	 //If amount become 0, return total
        	 if(amt==0)
        	 {
        		 return total;
        	 }
        	 else
        	 {
        		 if(amt>=notes[i])
        		 {
        			 //to find the number of notes
        			 int result = amt/notes[i];
        			 
        			 //to find the remaining amount 
        			 rem = amt%notes[i];
        			 amt=rem;
        			 
        			 //To find total amount
        			 total=total+result;
        			 System.out.println(notes[i] + "'s notes " + result);
        		 }
        	 }
        	 i++;
        	 //return total number no of notes
        	 return vendingMachine(notes, amt, total,i);
        }
         
         /*
          *@Aim       Take a date as input and prints the day of the week that date falls on
          *@param     m: month
          *           d: day
          *           y: year
          *@returns   weekDay
          */
         public int calender(int m,int d,int y)
         {
        	//Formula for georgion calender
        	int y0 = y - ((14 - m) / 12);
     		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
     		int m0 = m + 12 * ((14 - m) / 12) - 2;
     		int d0 = (d + x + (31 * m0 / 12)) % 7;
     		return d0;    //returns day
         }
         
         /*
          * @Aim     Convert the temperature(F) to temperature(C) or viceversa   
          * @param   temp:    temperature 
          * @returns temperature in either celcius or fahrenheit
          */
         public double tempConv(double temp, String t)
         {
        	   if(t.equals("c"))
        	   {
        		   //Formula to convert temperature(C) to temperature(F)  
        		   return (((double)temp * 9 / 5) + 32);
        	   }
        	   else
        	   {
        		 //Formula to convert temperature(F) to temperature(C)
        		   return ((double)temp - 32) * 5 / 9;
        	   }
         }
        public void tempConversion()
        {
              System.out.println("Enter 'f' for fahrenheit and 'c' for celcius as temperature:");
              String t=inputString(); 
              if(t.equals("c"))
              {
            		//To take the user input
                 	System.out.println("Enter temperature in celcius:");
                	double cTemp = inputDouble(); 
                	System.out.format("Temperature in farenheit is: %.2f" , tempConv(cTemp, t));

              }
              else if(t.equals("f"))
              {
            	    //To take the user input
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
         * @Aim      Calculates the monthly payments you would have to make over Y years to pay off a P principal loan
         *           amount at R percent interest compounded monthly                  
         * @param    P: personal loan
         *           Y: years to pay loan
         *           R: interest over loan
         * @returns  monthly payment
         */
        public double pay(double P, double Y, double R)
        {
        	//Formula to find monthly payment
        	double n = (double) -1 * 12 * Y;
        	double r = (double) R / (12 * 100);
        	double payment =  (double) (P * r) /(1 - Math.pow((1 + r), n));
        	
        	//returns monthly payment
        	return payment;  
        }
        
        /*
         * @Aim      Find the square root
         * @param    c: input 
         *           t: input 
         * @returns  t: square root
         */
        
        public double sqRoot(double c) {
        	double t = c;
        	
        	//Take positive number
    		if(c>0)
    	    {
    			//epsilon = 1e-15
    			double epsilon = Math.pow(1 * 2.71828 , -15);
    			
    			//loop till you get the desired accuracy
    			while(Math.abs(t - (c / t)) > (epsilon * t))
    			{
    				//take the average of c/t and t and replace it with t
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
         * @Aim     Convert decimal to binary 
         * @param   n:  input decimal number
         */
        public void toBinary(int n)
        {
        	int binaryArr[] = new int[100];
        	int i=0;
        	//Number should be positive
        	while(n>0)
        	{
        		//Take mod then put the remainder in array
        		binaryArr[i] = n%2;
        		n=n/2;
        		i++;
        	}
        	
        	//print the array in reverse order
        	for(int j=i-1;j>=0;j--)
        	{
        		System.out.print(binaryArr[j] + " ");
        	}
        	
        }
        
        /*
         * @Aim      Swap nibbles
         * @param    binaryStr: input binary value
         * @returns  n2 + n1:   swapped nibbles
         */
        public int swapNibbles(String binaryStr) {
        	 int len = binaryStr.length();
        	 
        	 //Iterate through the binaryStr
        	 for(int i = 0; i < 8 - len; i++) {
        	     binaryStr = "0" + binaryStr;
        	 }
        	 
        	 //take 2 substrings from binaryStr
        	 String n1 = binaryStr.substring(0,4);
        	 String n2 = binaryStr.substring(4);
        	 
        	 //return n2 + n1 
        	 return Integer.parseInt(n2 + n1);  
        }
        
        /*
      	 *@Aim    To convert from binary to decimal
      	 *@param  result: swapped nibbles
       	 */
        public int binaryToDec(int result)
        {
        	int temp = result;
        	int decValue = 0;
        	int base = 1;
        	while(temp>0)
        	{
        		//Take mod and put remainder in variable last 
        		int last = temp % 10; 
                temp = temp / 10;
                
                //Add the product of last and base variables to decValue
                decValue += last * base; 
                base = base * 2; 
            } 
        	
        	//return decimal value
            return decValue; 
        }
        
        /*
         * @Aim    Find the number is a power of 2.
         * @param  value:  decimal value
         */
        public boolean powerOf(int value)
        {
        	String binString = String.valueOf(value);
        	
        	//Loop to iterate through binString
        	for(int i = 0; i <= binString.length(); i++)
        	{
        		//if charaters from binString is not equal to 0 then return false
        		if(binString.charAt(i) != 0)
        		{
        			return false;
        		}
        	}

        	return true;
        }
        
        /*
         *@Aim     Find binary search method for integer
         *@param   arr[]:   integer array
         *@returns key:     element to be searched
         */
        public int binSearchInt(int arr[],int key)
        {
        	int first = 0;
        	int last = arr.length -1;
        	int mid;
        	//iterate through array
        	while(first<=last)
        	{
        		//Find middle of array
        		mid=(first+last)/2;
        		
        		//if middle element is greater than key then middle will become last
        		if(arr[mid]>key)
        		{
        			last = mid;
        		}
        		
        		//if middle element is less than key then middle + 1 will become first
        		else if(arr[mid]<key)
        		{
        			first = mid + 1;
        		}
        		else
        		{
        			//if above two conditions failed, return middle
        			return mid;
        		}
        	}
        	return -1;
        }
        
        /*
         *@Aim    Find binary search method for string
         *@param   array[]:  String array
         *@returns keyStr:   element to be searched
         */
        public int binSearchStr(String array[],String keyStr)
        {
        	int first = 0;
        	int last = array.length - 1;
        	int mid;
        	
        	//iterate through array
        	while(first<=last)
        	{
        		//Find middle of array
        		mid=(first+last)/2;
        		
        		//if middle element is greater than key then middle will become last
        		if(keyStr.compareTo(array[mid])<0)
        		{
        			last = mid;
        		}
        		
        		//if middle element is less than key then middle + 1 will become first
        		else if(keyStr.compareTo(array[mid])>0)
        		{
        			first = mid + 1;
        		}
        		else
        		{
        			//if above two conditions failed, return middle
        			return mid;
        		}
        	}
        	return -1;
        }
        
        /*
         * @Aim       Insertion Sort method for integer 
         * @param     arrInt[]:  user input int array
         *            nI:        length of the array
         */
        public void insertionSortInt(int arrInt[], int nI)
        {

            for(int i=1;i<nI;i++)
            {
           	 int a = arrInt[i]; 
           	 int j = i-1; 
           	  
            //Loop till j is greater than or equal to 0 and arr[j] is greater than a             
           	 while (j>=0 && arrInt[j]>(a)) 
           	 { 
           	//if above condtion is true then swap values
           	     arrInt[j+1] = arrInt[j]; 
           	     j = j-1; 
           	 } 
           	 arrInt[j+1] = a;
             }
            
            //print the sorted array
            System.out.println("Sorted array is:");
            for(int k=0;k<nI;k++)
            {
           	 System.out.print(arrInt[k] + " ");
            }
         }
        
        /*
         * @Aim      Bubble Sort method for integer
         * @param    arrInt1[]:  use input int array 
         *           nI1:        length of the array
         * @returns  Bubble sorted array
         */
        public int[] bubbleSortInt(int arrInt1[], int nI1)
        {
       	 int temp;
       	 nI1=arrInt1.length;
       	 System.out.println("Sorted array is:");
        
       	 //Loop to iterate through array
       	 for(int i=0;i<nI1;i++)
       	 {
       		 for(int j=i+1;j<nI1;j++)
       		 {
       			 //if arr[i] is greater than arr[j] then swap
       			 if(arrInt1[i]>arrInt1[j])
       			 {
       			    temp=arrInt1[i];
       				arrInt1[i]=arrInt1[j];
       				arrInt1[j]=temp;
       			 }
       		 }
       		
       	 }
       	 //return sorted array
       	 return arrInt1;
        }
        
        /*
         * @Aim      Bubble Sort method for string
         * @param    arrStr1[]:  user input string array
         *           nS1:        length of the array
         * @returns  string sorted array
         */
        public String[] bubbleSortStr(String arrStr1[], int nS1)
        {
       	 String temp;
       	 nS1=arrStr1.length;
       	 System.out.println("\nSorted array is:");
       	 
         //Loop to iterate through array
       	 for(int i=0;i<nS1;i++)
       	 {
       		 for(int j=i+1;j<nS1;j++)
       		 {
       			 //if arr[i] is greater than arr[j] then swap
       			 if(arrStr1[i].compareTo(arrStr1[j])>0)
       			 {
       				temp=arrStr1[i];
       				arrStr1[i]=arrStr1[j];
       				arrStr1[j]=temp;
       			 }    
       		 }
       		 
       	 }
       	 //return sorted array
       	 return arrStr1;
        }
        
        /*
         * @Aim       Tic Tac Toe board
         * @param     game:  character array to print board    
         */
        
        public static void print(char[][] game) {
        	
        	//Loop to iterate through board
    		for (int i = 0; i < game.length; i++)
    		{
    			//to print '|'
    			System.out.print("| ");
    			for (int j = 0; j < game.length; j++)
    			{
    				System.out.print(game[i][j] + " | ");
    			}
    			System.out.println("\n");
    		}
   
    	}
        
        /*
         * @Aim      Check if the string is palindrome or not
         * @param    string: 
         * @returns  true if palindrome
         */
        public boolean checkPalindrome(String string)
        {
    		if(string.length() < 2) 
    		{
    			return false;
    		}
    		
    		char[] array = string.toCharArray();
    		int n = array.length;
    		
    		//loop to traverse through the array
    		for(int i = 0; i < n; i++) 
    		{
    			//returns false if array[i] is not equal to array[n-1-i]
    			if(array[i] != array[n - 1 - i])
    			{
    				return false;
    			}
    		}
    		return true;
        }
        
        /*
         * @Aim      Palindrome checker
         * @param    word:  input
         * @returns  true if palindrome
         */
    	public static boolean checkPalindromeWord(String word) {
    		int size = word.length();
    		boolean isPalindrome = true;
    		
    		//Dequeue
    		Dequeue<Character> d = new Dequeue<Character>(size);
    		char ch[] = word.toCharArray();
    	
    		for(int i = 0; i < ch.length; i++)
    		{
    			//To add element from rear
    			d.addRear(ch[i]);
    		}
     		for(int i = 0; i < ch.length / 2; i++)
     		{
     			//if removed element from front is not equal to removed element from rear then returns false
    			if (d.removeFront() != d.removeRear()) 
    			{
    				isPalindrome = false;
    				break;
    			}
    		}
    		return isPalindrome;
    	}
       
    	/*
    	 *@Aim      Check if the Arithmetic Expression is balanced or not.
         *@param    exp:   user input expression
         *@returns  false if paranthesis does not match
         */
    	public static boolean balancedParanthesis(String exp)
    	{
    		
    		int len = exp.length();
    		
    		//Stack
    		Stack<Character> stack = new Stack<Character>(len);
    		char expArr[] = exp.toCharArray();
    		char ch=0;
            try {
            
            //Traverse through expArr	
    		for (int i = 0; i < expArr.length; i++)
    		{

    			if (expArr[i] == '(' || expArr[i] == '{' || expArr[i] == '[')
    			{
    				//add in the array if '(' appears in the expression 
    				stack.push(expArr[i]);
    			}
    			else if (expArr[i] == ')' || expArr[i] == '}' || expArr[i] == ']' )
    			{
    				//pop from the array if ')' appears in the expression
    			    ch = stack.pop();
    			    
    			    //Switch loop to check paranthesis pair
    			    switch(ch)
    			    {
    			    case ')':
    			    	if(ch != '(');  
    					return false;
    			    case '}':
    			    	if(ch != '{');  
    					return false;
    			    case ']':
    			    	if(ch != '[');  
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

    	 /*
         * @param    word:
         *           str:   
         */
    	public static void unorderedListWord(String word, String str) throws IOException
    	{
    		String[] arrStr = str.split(" ");
    		LinkedList<String> llWord = new LinkedList<String>();
    		System.out.println();
    		System.out.println("Strings from the list are: ");
    		for(int i=0;i < arrStr.length; i++)
    		{
    			llWord.add(arrStr[i]);
    			System.out.println(arrStr[i]);
    		}
    		
    		System.out.println("The word you want to search is: " +word);
    		if (llWord.search(word)) {
    			System.out.println("\nThe word is present in the list, remove it");
    			
    			//remove the word from the list
    			llWord.remove(word);    
    			llWord.printList();
    		

    		} else {
    			System.out.println("\nThe word is not present in the list, add it");
    			
    			//add the word to the list
    			llWord.add(word);    
    			llWord.printList();

    		}
    	}
    	
    	
    	public static void orderedListWord(String num, String str) throws IOException {
    		String strArr[] = str.split(" ");
    		LinkedList<String> llInt = new LinkedList<String>();
    		for (int i = 0; i < strArr.length; i++) {
    			llInt.add(strArr[i]);
    		}
    		System.out.println("sorted list of numbers:");

    		llInt.sort();
    		llInt.printList();
    		if (llInt.search(num)) {
    			System.out.println("\nThe number is present in the list, remove it");
    			llInt.remove(num); 
    			llInt.printList();

    		} else {
    			System.out.println("\nThe number is not present in the list, add it");
    			llInt.add(num);
    			llInt.printList();

    		}
    	}
        


}

