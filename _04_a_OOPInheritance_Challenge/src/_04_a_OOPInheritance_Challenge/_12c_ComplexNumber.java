package _04_a_OOPInheritance_Challenge;

public class _12c_ComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
jadi yg ini utk misal utk x =2+3j 
x2 = 6-3j 
nah yg real = 2+6;
yg imaginer 3-3;
nah utk kata j imajiner itu gak ikut ditambahkan itu simbol ngasih tau aja
itu imaginer bilangan!

//////////Fields:

real and imaginary are declared as private to ensure encapsulation.
Constructor:

Initializes the real and imaginary fields based on the provided values.
Getter Methods:

getReal: Returns the real part of the complex number.
getImaginary: Returns the imaginary part of the complex number.
Add Methods:

One method takes real and imaginary values directly and adds them to the current fields.
The other method takes a ComplexNumber object and adds its real and imaginary values to the current fields.
Subtract Methods:

One method takes real and imaginary values directly and subtracts them from the current fields.
The other method takes a ComplexNumber object and subtracts its real 
and imaginary values from the current fields.
//////masalah yg say atanyakan dijawab chatGPT :
 
Adding the Symbol "i" for Display Purposes
If you want to include i when printing or displaying the result 
(to make it look like a real mathematical expression), you can customize the output.
 Here's how you can modify the ComplexNumber class:

@Override
public String toString() {
    return real + " + " + imaginary + "i";
}
Example Usage with toString
public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1, 1); 
        System.out.println("Complex Number One: " + one);

        one.subtract(number);
        System.out.println("After Subtracting Number: " + one);

        number.subtract(one);
        System.out.println("Number After Subtracting One: " + number);
    }
}
Output
Complex Number One: 2.0 + 2.0i
After Subtracting Number: -0.5 + 3.5i
Number After Subtracting One: 3.0 + -5.0i
Explanation of toString
The toString method overrides the default object-to-string conversion and allows you to format the output however you like.
In this case, we format the output as real + imaginary i.
This approach ensures that the i is included when displaying results, 
but it doesn't interfere with the actual math operations, which are purely numerical. 
This way, you get the correct representation without adding complexity to your calculations.

Let me know if you'd like further clarifications or enhancements! 😊







You said:
ok thank ypu so much !!
ChatGPT said:
You're very welcome! 😊 I'm glad I could help. 
Feel free to come back anytime with more questions or exercises. Enjoy coding and have fun learning! 🚀✨













*/