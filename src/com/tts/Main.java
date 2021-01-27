package com.tts;

import java.util.Scanner;
import java.util.Random;


        public class Main {

            public static void printNumbers() {
                int num1;
                for (num1 = 48; num1 <= 57; num1++) {
                    char ascii1 = (char) num1;
                    System.out.println("The ASCII value of Number " + num1 + " is: " + ascii1);
                }
            }

            public static void printLowerCase() {
                int num2;
                for (num2 = 97; num2 <= 122; num2++) {
                    char ascii2 = (char) num2;
                    System.out.println("The ASCII value of Lowercase Letter " + num2 + " is: " + ascii2);
                }
            }

            public static void printUpperCase() {
                int num3;
                for (num3 = 65; num3 <= 90; num3++) {
                    char ascii3 = (char) num3;
                    System.out.println("The ASCII value of Uppercase Letter " + num3 + " is: " + ascii3);
                }
            }

            public static void main(String[] args) {
                printNumbers();
                printLowerCase();
                printUpperCase();

                System.out.println("Hello World!!!!!!!!!!!!!!!");

                Scanner scanner = new Scanner(System.in);

                System.out.print("Please enter your name?");
                String nameString = scanner.nextLine();
                System.out.println("Hello " + nameString);

                System.out.print("What was the name of your favorite pet?");
                String petString = scanner.nextLine();
                System.out.println(petString + ". I had a black cat named Ebony");

                System.out.print("How old is/was your favorite pet?");
                Integer petAge = scanner.nextInt();
                System.out.println(petAge + ", :' You'll be missed Ebony.");

                System.out.print("What's your lucky number? ");
                Integer luckNum = scanner.nextInt();
                System.out.println(luckNum + ", mine is 18");

                System.out.print("Pick a random number between 1 and 50");
                Integer ranNum = scanner.nextInt();
                System.out.println(ranNum + " is your unlucky number");

                Random rand = new Random();
                Integer randoNum1 = rand.nextInt(10);
                Integer randoNum2 = rand.nextInt(20);
                Integer randoNum3 = rand.nextInt(30);

                Integer magicBall1 = (luckNum *= randoNum1);
                Integer magicBall2 = 0;
                if (magicBall1 > 75) {
                    magicBall2 = magicBall1 - 75;
                } else {
                    magicBall2 = magicBall1;
                }

                char character = petString.charAt(2);
                int ascii = (int) character;
                int lottoNum1 = ascii - 57;

                int character2 = petAge;
                int ascii2 = (int) character2;
                int lottoNum2 = ascii2 - 25;

                int lottoNum3 = ranNum / 2;

                int character3 = luckNum - 1;
                int ascii3 = (int) character3;
                int lottoNum4 = ascii3 - 25;

                int lottoNum5 = luckNum * 2;

                System.out.println("Your Lottery Numbers Are: " + lottoNum1 + ", " + lottoNum2 + ", " + lottoNum3 + ", " + lottoNum4 + ", " + lottoNum5 + " Magic Ball: " + magicBall2);

            }
        }

        //AsciiChars.printNumbers();
        //AsciiChars.printUpperCase();
        //AsciiChars.printLowerCase();
