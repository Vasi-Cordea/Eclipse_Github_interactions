package CodingExamples;
// PULL REQUEST
public class MixedMessages {
	//exercize
	
		public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while ( x < 5 ) {
			
			// enter one candidate code below
			
		
			System.out.print(x + "" + y +" ");
			x = x + 1;
			System.out.print("code is looking good");
			}
			}
			}
		

/*
Candidates:                                   
y = x - y;
y = y + x;                  
y = y + 2;
if( y > 4 ) {
y = y - 1;
}
x = x + 1;
y = y + x;
if ( y < 5 ) {
x = x + 1;
if ( y < 3 ) {
x = x - 1;
}
}
y = y + 2;

Possible output:
22 46
11 34 59
02 14 26 38
02 14 36 48
00 11 21 32 42
11 21 32 42 53
00 11 23 36 410
02 14 25 36 47
*/

