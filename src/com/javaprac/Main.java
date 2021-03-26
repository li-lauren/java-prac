package com.javaprac;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Test print to console");

        // variables
        int aNumber = 2;
        int anotherNumber = 40;
        int sum = aNumber + anotherNumber;

        System.out.println(sum);

        // primitive types
        int anInteger = 30; // integers = 4 bytes
        long aBigInteger = 32489789530988L; // long = 8 bytes
        float aSmallDecimal = 2.3f; // float = 4 bytes
        double aBigDecimal = 3.14; // double precision = 8 bytes
        double nStarsInTheUniverse = 1.1e21;
        double hydrogenRadius = 5.3e-11;
        char aCharacter = 'a';
        char aDigitCharacter = '1';
        boolean aTruthValue = true;

        // string
        String aString = "java java";

        // expressions
        // math operations
        int multiplyInt = 2 * 3;
        int divideInt = 7 / 3; // only the quotient is kept for int division
        int remainderInt = 7 % 3;

        // incrementing and decrementing
        aNumber++;
        ++aNumber;

        // preincrement and postincrement
        int someInteger = 4;
        int someInteger2 = someInteger++; // 4, AFTER WHICH someInteger becomes 5
        int someInteger3 = ++someInteger; // someInteger becomes 6, AFTER WHICH someInteger3 becomes 6

        // character operations
        char aLetter = 'a';
        aLetter++; // ASCII code, aLetter becomes 'b'

        // special characters
        char aQuote = '\''; // escape sequence
        char doubleQuote = '\"';
        char newline = '\n';
        char aTab = '\t'; // tab
        char backslash = '\\';

        // boolean operations
        boolean numberIsTooBig = aNumber > 100;
        boolean isLetterT = aLetter == 't';

        // classes
        class Person { // REFERENCE TYPE
            // fields = pieces of info attached to a single type
            String username;
            int age;

            // CONSTRUCTOR
            public Person(String username, int age) {
                this.username = username;
                this.age = age;
            }

            // void = no return type
            void celebrateBirthday() {
                this.age++;
                System.out.println(
                        this.username
                        + " says: It's my bday, I turned "
                        + this.age
                );
            }

            String throwParty(int nPeople, String favoritePlace) {
                String throwAParty = this.username + " says: I'm throwing a party at" + favoritePlace;
                String invitePeople = "I'm going to invite " + nPeople + " people!";
                return throwAParty + invitePeople;
            }
        }

        // instantiate a class
        Person alice = new Person("Alice", 25);
        alice.celebrateBirthday();

        // all reference types (classes) can have method
        String aTestString = "abcdef";
        System.out.println(aTestString.length());
        System.out.println(aTestString.startsWith("abc"));
        System.out.println(aTestString.substring(0,2));
    }
}
