import org.testng.annotations.Test;

public class TestNGGroups {

    @Test(groups = {"smoke"})
    public void testMethod1(){
        System.out.println("testMethod1");
    }

    @Test(groups = {"regression"})
    public void testMethod2(){
        System.out.println("testMethod2");
    }

    @Test(groups = {"smoke"})
    public void testMethod3(){
        System.out.println("testMethod3");
    }

    @Test(groups = {"regression"})
    public void testMethod4(){
        System.out.println("testMethod4");
    }

    @Test(groups = {"smoke","regression"})
    public void testMethod5(){
        System.out.println("testMethod5");
    }

}
