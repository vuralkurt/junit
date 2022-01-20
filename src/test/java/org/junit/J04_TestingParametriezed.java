package org.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class J04_TestingParametriezed {

    @Test   //cisss asla tavsiye edilmez.Cunku failed olan testen sonrakileri dogrulugu teyit edilemez.
    @DisplayName("Yirtik abicim yirttik")
    void uzunlukSifirdanBuyuk(){

        assertTrue("yildiz".length()>0);
        assertTrue("sulo".length()>2);
        assertTrue("vural".length()>3);
        assertTrue("mustafa".length()>4);
    }

/*
lenght() methodu ile asagıdaki sartlar için 0'dan buyuk deger return ettigini test ediniz.
Sartlar : "yıldız" , "suleyman" , "omer" , "kursat"  --> bu datalar testi nasıl geçer
 */

    @ParameterizedTest     //parametreli test
    @ValueSource(strings = {"yıldız" , "suleyman" , "omer" ,"x", "kursat"})

    void uzunlukSifirdanBuyukPrmtrl(String str){

        assertTrue(str.length()>2);



    }


}
