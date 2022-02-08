package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrimeList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class primeNumberGeneratorTest {

    PrimeList instance = new PrimeList();
    List<Integer> testList1 = new ArrayList<>();
    List<Integer> result1 = new ArrayList<>();
    List<Integer> testList2 = new ArrayList<>();
    List<Integer> result2 = new ArrayList<>();
    @Given("start to generate")
    public void startToGenerate() {
        System.out.println("*** PrimeListTest: generate()");

    }

    @When("enter two numbers {int} and {int}")
    public void enterTwoNumbersAnd(int int1, int int2) {
        result1 = instance.generate(int1,int2);
    }

    @Then("check the numbers are prime")
    public void checkTheNumbersArePrime() {
        testList1.add(7901); testList1.add(7907); testList1.add(7919);
        System.out.println("testList1 = " + testList1);
        System.out.println("result1 = " + result1);
        assertEquals(testList1, result1);
    }

    @When("enter another number \\( {int} and {int} )")
    public void enterAnotherNumberAnd(int int1, int int2) {
        result2 = instance.generate(int1,int2);
    }


    @Then("check the new numbers are prime")
    public void checkTheNewNumbersArePrime() {
        testList2.add(2); testList2.add(3); testList2.add(5);
        testList2.add(7); testList2.add(11); testList2.add(13);
        testList2.add(17); testList2.add(19); testList2.add(23);
        testList2.add(29); testList2.add(31); testList2.add(37);
        testList2.add(41); testList2.add(43); testList2.add(47);
        testList2.add(53); testList2.add(59); testList2.add(61);
        testList2.add(67); testList2.add(71); testList2.add(73);
        testList2.add(79); testList2.add(83); testList2.add(89);
        testList2.add(97);
        System.out.println("testList2 = " + testList2);
        System.out.println("result2 = " + result2);
        assertEquals(testList2, result2);

    }


}
