package ejbm.mac.com.testing01;





/**
 * Created by admin on 1/22/2016.
public class unitTest {

    @Test
    */
    public void addingTest (){
        FTsMath ft = new FTsMath() ;

        int x = ft.addIt( 1 ,2 );

        assertEquals ( 3 , x ) ;
    }
}
