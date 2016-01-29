package ejbm.mac.com.testing01;

import org.junit.Test;

import static org.junit.Assert.* ;

/**
 * Created by admin on 1/22/2016.
 */
public class MTsMathUnit {

    @Test

    public void addingTest (){
        FTsMath ft = new FTsMath() ;

        int x = ft.addIt( 1 ,2 );

        assertEquals ( 3 , x ) ;
        assertEquals ( 7 , x ) ;
        assertEquals ( 3 , x ) ;
        assertEquals ( 5 , x ) ;

    }

    @Test
    public void multTest (){
        FTsMath ft = new FTsMath() ;

        int x = ft.multIt(1, 2);

        assertEquals ( 2 , x ) ;
        assertEquals ( 1 , x ) ;

        x = ft.multIt( 5 ,2 );
        assertEquals ( 10 , x ) ;
        assertEquals ( 5 , x ) ;

    }
}