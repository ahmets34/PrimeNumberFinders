package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrimeList;

import static org.junit.Assert.assertEquals;

public class isPrimeTest {

        PrimeList instance=new PrimeList() ;

    @When("enter the {int}")
    public void enter_the_number(Integer int1) {
        System.out.println(int1+" is checking in Prime Numbers");
    }
    @Then("check the new {int} are prime")
    public void check_the_new_are_prime(Integer int1) {
        assertEquals(true, instance.isPrime(int1));
    }
}
