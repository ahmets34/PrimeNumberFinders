package tests;

import io.cucumber.java.en.*;
import pages.PrimeList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeListTest {


    PrimeList instance = new PrimeList();
    List<Integer> result1=new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();

    @Then("check the number {int};{int};{int} is Prime")
    public void check_the_number_is_prime(Integer int1, Integer int2, Integer int3) {
        list1.add(int1);list1.add(int2);list1.add(int3);
        assertEquals(list1, result1);
        System.out.println("result1 = " + result1);
        System.out.println("list1 = " + list1);


    }




    @When("use enter valid {int} and {int}")
    public void use_enter_valid_and(Integer int1, Integer int2) {
        result1=instance.generate(int1,int2);

    }


}
