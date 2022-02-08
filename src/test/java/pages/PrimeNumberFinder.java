package pages;

import java.util.List;
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber ,lastNumber ,min,max ;
        String checking1="1";
        String checking2="1";

        System.out.println("Welcome to the Prime Number Finder!\n"
                          +"This finder list all the prime numbers between that you gave the range\n"
                          +"Please enter a positive value for starting point :" );

        while (checking1.equals("1")){


            try {
                firstNumber=Integer.parseInt(scan.nextLine());

                if(firstNumber<=0){
                    System.out.println("Starting point must be positive");
                }else{
                    while (checking2.equals("1")){
                        System.out.println("Please enter a positive value for ending point :");

                        try{
                            lastNumber=Integer.parseInt((scan.nextLine()));
                            if (lastNumber<=0){
                                 System.out.println("Ending point must be positive");
                            }else{
                                if(firstNumber<lastNumber){
                                    min=firstNumber;
                                    max=lastNumber;
                                }else {
                                    min=lastNumber;
                                    max=firstNumber;
                                }

                                PrimeNumberInterface p =new PrimeList();
                                List<Integer>finalList;

                                finalList=p.generate(min,max);

                                if (finalList.isEmpty()){
                                    System.out.println("There is no prime numbers between those number "+min+", "+max+".");
                                }else if (finalList.size() == 1) {
                                    System.out.println("The PRIME number between " + min
                                            + " and " + max + " (inclusive) is:");
                                    finalList.forEach(System.out::println);
                                }
                                else {
                                    System.out.println("The prime numbers between " + min
                                            + " and " + max + " are:");
                                    finalList.forEach(System.out::println);
                                }


                                System.out.println("Nicely Done!");
                                System.exit(0);



                            }



                        }catch (NumberFormatException e){
                            System.out.println("Sorry, you need to enter an integer greater than 0.");

                            // Allow user to try again by entering 1
                            System.out.println("Enter 1 to try again. Enter anything else to exit.");
                            String tryAgain = scan.nextLine();
                            if (!checking2.equals(tryAgain)) {
                                System.exit(0);
                            }
                    }

                }

            }

            } catch (NumberFormatException e) {
                    System.out.println("Sorry, you need to enter an integer greater than 0.");

                    // Allow user to try again by entering 1
                    System.out.println("Enter 1 to try again. Enter anything else to exit.");
                    String tryAgain = scan.nextLine();
                    if (!checking1.equals(tryAgain)) {
                        System.exit(0);
                    }
                }
            }
        }
    }

