/**
 *
 * @author Krunal Patel 501175325
 */
package coe318.lab3;
public class Counter {
    // Stating the instance variables
    private int modulus; //base of the counter
    private int digit; //current value of the counter's digit
    private Counter left; //left neighbour
    
    //A constructor is made 
    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
        this.digit = 0;
        this.left = left; 
    } 
    
    //Getter retrieves the modulus
    public int getModulus() {
        return modulus;
    }
    
//Getter retrieves the current digit value
    public int getDigit() {
        return digit;
    }

    //Getter retrieves the left neighbour
    public Counter getLeft() {
        return left;
    }

    //Setter used to set the digit value
    public void setDigit(int digit) {
        this.digit = digit;
    }

    //Increment the counter
    public void increment() {
        //Increases the value of the digit
        digit++;
        if(digit == modulus) {
            //If it reaches the modulus, it resets the digit to 0
            digit = 0;
            if(left != null){
                //Increments the left neighbour if existent
                left.increment();
            }
        }
    
    }

    //Getter retrieves the total count, including the left neighbour 
    public int getCount() {
        if (left != null) {
        //The count is calculated recursively
        return digit + modulus * left.getCount();
        } else {
            //If a left neighbour doesn't exist, the count is the digit 
            return digit;
        }
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
