package org.junit;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Babalara geldik..")  //Son kullaniciya bilgilendirilmesi icin görecegi
                                       // etiketi create eder ve konsola basar.
    void topla() {
        // varsayiyorum     beklenen deger              aktüel deger
        assertEquals(3,HesapMakinesi.topla(1,2));
        //assertEquals(5,HesapMakinesi.topla(1,2));

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Lann nasil oldi...")
    void carp() {

        assertAll(
                ()->assertEquals(2.6,HesapMakinesi.carp(2,1.3)),
                ()-> assertEquals(4.8,HesapMakinesi.carp(2,2.4)),
                ()->assertEquals(-2.7,HesapMakinesi.carp(3,-0.9)),
                ()-> assertEquals(-18,HesapMakinesi.carp(-6,3))
        );

       // assertEquals(2.6,HesapMakinesi.carp(2,1.3));
       // assertEquals(4.8,HesapMakinesi.carp(2,2.4));
       // assertEquals(-2.7,HesapMakinesi.carp(3,-0.9));
       // assertEquals(-18,HesapMakinesi.carp(-6,3));

    }
}