package testWithoutCucumber;


    import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
    import pages.PrimeList;

    import static org.junit.Assert.*;

public class generatorTest {

        // generate() Test
        @Test
        public void testGenerate() {
            System.out.println("*** PrimeListTest: generate()");
            PrimeList instance = new PrimeList();


            List<Integer> testList1 = new ArrayList<>();
            testList1.add(7901); testList1.add(7907); testList1.add(7919);

            List<Integer> testList2 = new ArrayList<>();
            testList2.add(2); testList2.add(3); testList2.add(5);
            testList2.add(7); testList2.add(11); testList2.add(13);
            testList2.add(17); testList2.add(19); testList2.add(23);
            testList2.add(29); testList2.add(31); testList2.add(37);
            testList2.add(41); testList2.add(43); testList2.add(47);
            testList2.add(53); testList2.add(59); testList2.add(61);
            testList2.add(67); testList2.add(71); testList2.add(73);
            testList2.add(79); testList2.add(83); testList2.add(89);
            testList2.add(97);

            List<Integer> result1 = instance.generate(7900, 7920);
            List<Integer> result2 = instance.generate(7900, 7920);
            List<Integer> result3 = instance.generate(1, 100);
            List<Integer> result4 = instance.generate(100, 1);



            assertEquals(testList1, result1);
            assertEquals(testList1, result2);
            assertEquals(testList2, result3);
            assertEquals(testList2, result4);
        }


        @Test
        public void testIsPrime() {
            System.out.println("*** PrimeNumberTest: isPrime()");
            PrimeList instance = new PrimeList();


            assertEquals(true, instance.isPrime(2));
            assertEquals(true, instance.isPrime(7));
            assertEquals(true, instance.isPrime(11));
            assertEquals(false, instance.isPrime(8));
            assertEquals(false, instance.isPrime(6));
            assertEquals(false, instance.isPrime(4));
        }
}
