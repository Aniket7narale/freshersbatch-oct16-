package AssignmentQ4;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DemoTest {
	
	@BeforeAll
    static void meth1(){
        System.out.println("BeforeAll - This will execute only once and before all the test methods. \n");
    }
	
    @BeforeEach
    public void meth2(){
        System.out.println("BeforeEach - This will always execute before all the test methods. \n");
    }

    @Test
    @Order(1)
    @DisplayName("Method 5")
    public void meth5(){
        System.out.println("HELLO FROM TEST METHOD-1\n");
    }
    @Test
    @Order(2)
    @DisplayName("Method 6")
    public void meth6(){
        System.out.println("HELLO FROM TEST METHOD-2\n");
    }
    
    @Test
    @Order(3)
    @DisplayName("Method 7")
    public void meth7(){
        System.out.println("HELLO FROM TEST METHOD-3\n");
    }
    

    @AfterEach
    public  void meth3(){
        System.out.println("AfterEach - This will always execute after all the test methods. \n");
    }

    @AfterAll
    static void meth4(){
        System.out.println("AfterAll - This will execute only once and after all the test methods. \n");
    }
    
}

