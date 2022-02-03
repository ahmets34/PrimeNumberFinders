package tests;

import io.cucumber.java.en.*;

import pages.PrimeList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReversedPrimeList {
    PrimeList instance = new PrimeList();
    List<Integer> result2=new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    @When("user reverse enter valid {int} and {int}")
    public void user_reverse_enter_valid_and(Integer int1, Integer int2) {
        result2=instance.generate(int2,int1);

    }
    @Then("check reversed the number {int};{int};{int} is Prime")
    public void check_reversed_the_number_is_prime(Integer int1, Integer int2, Integer int3) {
        list2.add(int1);list2.add(int2);list2.add(int3);
        assertEquals(list2, result2);
        System.out.println("result2 = " + result2);
        System.out.println("list2 = " + list2);
    }
}
