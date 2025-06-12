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

    @BeforeClass
    public void beforeClass(){
        System.out.println(" beforeClass");
    }
   @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
@Test
    public void testMethod1(){
        System.out.println("testMethod1");
    }



    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println(" AfterSuite");
    }


}
