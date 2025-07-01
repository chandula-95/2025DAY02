import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx {
@Test
    public void hardAssertion(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        Assert.assertTrue(false);
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
    }

    @Test

    public void hardAssertion2(){
        String actual ="xyz";
        String expected ="xyz";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert =new SoftAssert();
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
 softAssert.assertTrue(false);
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");
    }

    @Test
    public void softAssertion2(){
        String actual ="xyz";
        String expected ="xyzp";

        System.out.println("expected name is :"+expected);
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(actual,expected);
        System.out.println("Actual Name is "+actual);
        softAssert.assertAll();
    }
}
