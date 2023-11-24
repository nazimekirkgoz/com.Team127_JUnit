package Practise;

import org.junit.*;

public class P01 {
           /* @BeforeClass TÜM CLASSLARDAN ÖNCE 1 KERE CALISIR
            @AfterClass TÜM CLASSLARDAN SONRA 1 KERE CALISIR
            @Before HER CLASSTAN ÖNCE 1 KERE CALISIR
            @After HER CLASSTAN SONRA 1 KERE CALISIR
            @TestMETODLARI CALISTIRIR

            */
    @Before
    public void before(){
        System.out.println("before");
        System.out.println("yeni bir test");

    }
    @After
    public  void  after(){
        System.out.println("");
        System.out.println("after");
    }
    @Test
    public void Melih(){
        System.out.println("melih");
    } @Test
    public void Senih(){
        System.out.println("senih");
    } @Test
    public void fatih(){
        System.out.println("fatih");
    }

}
