import org.testng.annotations.*;

public class TestNGAnnotationOrder {

@BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeTest
    public void beforeClass(){
        System.out.println(" beforeClass");
    }
   @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
@Test
    public void testMethod1(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }
@AfterSuite
    public void AfterSuit(){
        System.out.println("AfterSuit");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void AfterClass(){
        System.out.println(" AfterClass");
    }

}
