// class Variables {
//     public static void main(String[] args) {
//         var a = 5;
//         var b = 10;

//         var c = "Total=" + (a + b);

//         System.out.println(c);
    
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("After swap: a = " + a + ", b = " + b);
//     }
// }


// class Variables {
//     public static void main(String[] args){
//         int a = 5, b = 6, c = 7;

//         System.out.println(a + " " + b + " " + c);
//     }
// }

// ******************************************************************AREA OF CIRCLE *************************************************************************************

// class Variables{
// public static void main(String[] args){
//     var radius = 9.0;
//     var pi = 3.14;

//     var area = pi*radius*radius;

//     System.out.println("Area of circle is :" + area);
// }
// }

// **************************************************************** AREA OF RECTANGGLE ************************************************************************************

// class Variables {
//     public static void main(String[] args){
//         var length = 10;
//         var width = 7;

//         var area = length*width;

//         System.out.println("Area of Rectangle :" + area);


//     }
// }


// ************************************************************** SQUARE OF A NUMBER **************************************************************************************

    // class Variables {
    //     public static void main(String[] args){
    //         var number = 37;

    //         var squareRoot = number*number;

    //         System.out.println("Square root of a given number is :" + squareRoot);
    //     }
    // }

// ************************************************************ PERIMETER OF A RECTANGLE **********************************************************************************

    // class Variables {
    //     public static void main(String[] args){
    //         var length = 10;
    //         var width = 5; 

    //         var perimeter = 2 * (length+width);

    //         System.out.println(perimeter);
    //     }
    // }


    // ********************************************************* SIMPLE INTREST CALUCLATOR *********************************************************************************

    // class Variables {
    //     public static void main(String[] args) {
    //         var principal = 1000;
    //         var rate = 5;
    //         var time = 2;

    //         var simpleIntrest = (principal * rate * time) / 100 ; 

    //         System.out.println("Simple intrest of a rectangle is : " + simpleIntrest);
    //     }
    // }

    // ******************************************************** VOLUME OF A CUBE ********************************************************************************************

        // class Variables {
        //     public static void main(String[] args){
        //     var side =  7;

        //     var volumeOfCube = side*side*side;

        //     System.out.println("Volume of a Cube is :" + volumeOfCube); 
        // }
        // }
        
    // ********************************************************  AVEREAGE OF THREE NUMBERS ***********************************************************************************

    // class Variables {
    //     public static void main(String[] args){
    //         var num1 = 12;
    //         var num2 = 15; 
    //         var num3 = 18;

    //         var average = (num1 + num2 + num3)/3;

    //         System.out.println("Average of three numbers is :" + average);

    //     }
    // }

    // ******************************************************** CIRCUMFERENCE OF A CIRCLE *********************************************************************************

    // class Variables {
    //     public static void main (String[] args){
    //         var radius = 5;
    //         var pi = 3.14;
            
    //         var circumference = 2 * pi * radius;

    //         System.out.println("Circumference of a circle : " + circumference);



    //     }
    // }

    // *********************************************************** CELSIUS TO FAHRENHEIT ***************************************************************************************

    // class Variables {
    //     public static void main(String[] args){
    //         var celsius = 32;

    //         var c2f = (celsius * 9/5) + 32;

    //         System.out.println("Celsius to fahrenheit : " + c2f);
    //     }
    // }

//  ********************************************************* IF ELSE CONDITINAL STATEMENTS *******************************************************************************


// class Variables {
//     public static void main(String[] args){
//         var number = 25;

//         if (number > 25){
//             System.out.println("The number is out of bound");
//         }else {
//             System.out.println("The number is inside bound");
//         }
//     }
// }

// ********************************************************** FINDING THE NUMBER EVEN OR ODD ******************************************************************************

// class Variables {
//     public static void main(String[] args){
//         var number = 29;

//         if (number % 2 == 0 ){
//             System.out.println("Number is an even number");
//         } else {
//             System.out.println("It is odd number");
//         }
//     }
// }

// ************************************************************* CHECKING VOTIING ELEGIBLITY ********************************************************************************

// class Variables {
//     public static void main(String[] args){
        
//         var age = 18;
        
//         if (age < 18) {
//             System.out.println("Doesn't has vote eligiblity");
//         } else {
//             System.out.println("Has the eligiblity to vote ");
//         }
//     }
// }

// ************************************************************* GRADE SYSTEM BASED ON MARKS ********************************************************************************

// class Variables {
//     public static void main(String[] args){

//         var marks = 91;

//         if (marks >= 90){
//             System.out.println("Grade A");
//         }else if (marks >= 75){
//             System.out.println("Grade B");
//         }else if (marks >= 55){
//             System.out.println("Grade C");
//         }else {
//             System.out.println("Fail");
//         }

// }
// }

//  ******************************************************** FIND THE LARGEST OF TWO NUMBERS ********************************************************************************

// class Variables{
// public static void main(String[] args){
//     var a = 15;
//     var b = 20; 

//     if (a > b){
//         System.out.println("a is greater than b");
//     } else if (b > a){
//         System.out.println("b is greater than a");
//     } else {
//         System.out.println("Both are equal");
//     }
// } 
// }

// ************************************************* CHECK IF THE NUMBER IS DIVISIBLE BY BOTH 5 AND 11 ***********************************************************************

// class Variables{
// public static void main(String[] args){

// var num = 55;

// if (num % 5 == 0 && num % 11 == 0){
//     System.out.println("It is divisible");
// }else {
//     System.out.println("It is not divisible");
// }
// }
// }

// // *********************************************** CHECK IF THE CHARACTER IS A VOWEL OR CONSONANT ***************************************************************************

// class Variables {
//     public static void main(String[] args){
//         var ch = 'U';

//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
//             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
//             System.out.println("It is an Vowel");
//         }else {
//             System.out.println("It is a Consonant");
//         }
//     }
// }
 
// ************************************************** CHECK IF A YEAR IS A LEAP YEAR *****************************************************************************************

// class Variables{
// public static void main (String[] args){

// var year = 2020;

// if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
//     System.out.println(year + " is a Leap year");
// }else{
//     System.out.println(year + " is not a leap year");
// }
// }
// }

// ************************************************* SIMPLE CALUCLATOR **********************************************************************************************

// class Variables {
//     public static void main(String[] args){

//         var a = 15;
//         var b = 10;

//         var ch = '*';


//         if (ch == '+' ){
//             System.out.println( "Addition" + (a+b));
//         }else if (ch == '-'){
//             System.out.println("Subtraction" + ( a - b));
//         }else if (ch == '/'){
//             System.out.println("Divison" + ( a / b));
//         }else if (ch == '*'){
//             System.out.println("Multiplication" + ( a * b));
//         }else {
//             System.out.println("Invalid Operator");
//         }
//     }
// }

// ********************************************************* CHECK IF NUMBER IS A THREE DIGIT NUMBER *******************************************************************

// class Variables{
// public static void main(String[] args){

//     var num = 256;

//     if (num >= 100 || num <= 999 ){
//         System.out.println(num +  "  It is a Three digit number");
//     }else {
//         System.out.println("It is not a Three digit number");
//     }

// }
// }

// ***************************************************** CHECK IF THE NUMBER IS POSITIVE OR NEGATIVE OR ZERO ***********************************************************

// class Variables {
//     public static void main(String[] args){

//         var num = 9;

//         if (num < 0){
//             System.out.println(num + "  It is a Negative Number");
//         } else if (num > 0){
//             System.out.println(num + "  It is a positive number");
//         }else {
//             System.out.println(num + "  It is Zero");
//         }
//     }
// }

// ****************************************************** FIND THE LARGEST AMONG THREE NUMBERS *************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var a = 2;
//         var b = 3;
//         var c = 5; 

//         if (a >= b && a>= c){
//             System.out.println(a + "  a is the largest number");
//         }else if (b >= a && b >=c ){
//             System.out.println(b + "  b is the largest number ");
//         }else {
//             System.out.println(c + "  c is the largest number");
//         }
//     }
// }

// ************************************************** CHECK WEATHER A NUMBER IS A MULTIPLE OF 3 or 7 ******************************************************************

// class Variables{
//     public static void main(String[] args){

//         var num = 21;

//         if ( num % 3 == 0 && num % 7 == 0){
//             System.out.println(num + "  is divisible by both 3 and 7");
//         }else {
//             System.out.println(num + "  is not divisible by both 3 and 7");
//         }
//     }
// }

// **************************************************** SIMPLE TEMPERATURE CHECKER ********************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var temp = 18;

//         if (temp >= 35){
//             System.out.println(temp + "  --> It is hot");
//         }else if (temp >= 25){
//             System.out.println(temp + "  --> It is warm");
//         }else {
//             System.out.println(temp + "  --> It is cold");
//         }
//     }
// }

// ***************************************************  CHECK IF A PERSON IS ELIGIBLE FOR DRIVING LICENSE ************************************************************

// class Variables{
//     public static void main(String[] args){
        
//         var age = 20;

//         if (age >= 18 ){
//             System.out.println(age + "  this person is eligible for driving license");
//         }else {
//             System.out.println(age + "  this person is not is not eliglbe for driving license");
//         }
//     }
// }

// **************************************************** CHECK IF A CHARACTER IS UPPERCASE OR LOWERCASE *****************************************************************

// class Variables{
//     public static void main(String[] args){

//         var ch = 'b';

//         if (ch >= 'A' && ch <= 'Z'){
//             System.out.println(ch + "  is a Uppercase letter");
//         }else if (ch >= 'a' && ch <= 'z') {
//             System.out.println(ch + "  is a Lowercase letter");
//         }else {
//             System.out.println("Not an alphabet");
//         }
//     }
// }

//  ******************************************************** ELECTRICITY BILL CALUCLATION ***************************************************************************

// class Variables {
//     public static void main(String[] args){

//         var units = 250;

//         if (units <= 100 ){
//             System.out.println((units*1) + "  1 rupee per unit");
//         }else if (units <= 200) {
//             System.out.println((units*2) + "  2 rupees per unit");
//         }else {
//             System.out.println((units*3) + "  3 rupees per unit");
//         }
//     }
// }

// *********************************************************** CHECK IF TWO NUMBERS ARE EQUAL ***********************************************************************

// class Variables{
//     public static void main(String[] args){
    
//         var num1 = 2;
//         var num2 = 5; 

//         if (num1 - num2 == 0 ){
//             System.out.println("Both are equal");
//         }else {
//             System.out.println("Both are not same");
//         }


//     }
// }

// ************************************************************ CATEGORIZE THE PERSON ACCORDING TO THE AGE ************************************************************

// class Variables{
//     public static void main(String[] args){

//         var age = 25;

//         if (age <= 12){
//             System.out.println("Is a child");
//         }else if (age <= 19){
//             System.out.println("Is a teenager");
//         }else if (age <= 60 ){
//             System.out.println("Is a adult");
//         }else{
//             System.out.println("Is a senior citizen");
//         }
        
//     }
// }

// ********************************************************** TRAFFIC LIGHT SIGNAL ************************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var signal = "yellow";

//         if (signal == "red"){
//             System.out.println(signal + "  means STOP");
//         }else if (signal == "yellow"){
//             System.out.println(signal +  "  means GET READY");
//         }else if (signal == "green"){
//             System.out.println(signal + "  means GO");
//         }else {
//             System.out.println(signal + "  is an invalid signal");
//         }
//     }
// }

// ************************************************************ WEEKDAY NAME ***********************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var day = 7;

//         switch(day) {
//             case 1: System.out.println("Monday");break;
//             case 2: System.out.println("Tuesday");break;
//             case 3: System.out.println("Wednesday");break;
//             case 4: System.out.println("Thursday");break;
//             case 5: System.out.println("Friday");break;
//             case 6: System.out.println("Saturday");break;
//             case 7: System.out.println("Sunday");break;
//             default : System.out.println("Invalid Day");
//         }



//     }
// }

// ********************************************************** Grade System ************************************************************

// class Variables {
//     public static void main(String[] args){

//         var grade = 'B';

//         switch(grade){
//             case 'A': System.out.println("Excellent");break;
//             case 'B': System.out.println("Very Good");break;
//             case 'C': System.out.println("Good");break;
//             case 'D': System.out.println("pass");break;
//             case 'F': System.out.println("fail");break;
//             default : System.out.println("Invalid Grade");
//         }
//     }
// }

// *********************************************************** DAY TYPE (WEEKEND/WEEKDAY) *********************************************************

// class Variables{
//     public static void main(String[] args){


//         var day = 7;

//         switch(day){
//             case 1: case 2: case 3: case 4: case 5:
//                 System.out.println("Weekdays"); 
//                 break;
//             case 6: case 7:
//                 System.out.println("Weekends");
//                 break;
//             default : System.out.println("Invalid Day");
//         }
//     }
// }


// // ************************************************ PRINT  1 TO 10 NUMBERS *******************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var i = 1;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// ************************************************* SUM OF FIRST N NATURAL NUMBERS *************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var n = 5;
//         var sum = 0;
//         var i = 1;

//         while(i<=n){
//             sum += i;
//             i++;
//         }
//         System.out.println("sum of N Natural numbers are :" + sum);
//     }
// }

// ***************************************************** REVERSE A NUMBER ***************************************************************************

// class Variables{
//     public static void main(String[] args){

//         var number = 12345;
//         var reverse = 0;

//         while(number != 0) {
//             var digit = number % 10;
//             reverse = reverse * 10 + digit;
//             number /= 10;

//         }
//         System.out.println("Reversed Number :  " + reverse);

//     }
// }

// ******************************************************* CHECK IF NUMBER IS A PALINDROME ***************************************************************

// class Variables{
//     public static void main(String[] args){

//         var num = 121;
//         var original = num;
//         var reverse = 0;

//         while(num != 0){
//             var digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num /= 10;
//         }
//         if (original == reverse){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }
//     }

// }

// ******************************************************** PRINT EVEN NUMBERS FROM 1-20 ***********************************************************************

// class Variables{
//     public static void main(String[] args){

//         var i = 1; 

//         while(i <= 20){
//             if (i % 2 == 0){
//                 System.out.println(i);
//             }
//             i++;
//         }
//     }
// }


class Variables{
    public static void main(String[] args){

        var i = 1;

        while(i <= 20){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}