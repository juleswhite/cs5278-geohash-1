package edu.vanderbilt.cs;

import org.junit.jupiter.api.Test;

import static edu.vanderbilt.cs.live2.GeoHash.*;

public class GeoHashTest {

    @Test
    public void testAssorted1DHashes(){
        // If you can get the 1D geohash to pass all of these tests, you should be in
        // good shape to complete the 2D version.
        assertEquals("00000", geohashString(LONGITUDE_RANGE[0], LONGITUDE_RANGE, 5));
        assertEquals("00000", geohashString(LATITUDE_RANGE[0], LATITUDE_RANGE, 5));
        assertEquals("11111", geohashString(LONGITUDE_RANGE[1], LONGITUDE_RANGE, 5));
        assertEquals("11111", geohashString(LATITUDE_RANGE[1], LATITUDE_RANGE, 5));
        assertEquals("10000", geohashString(0, LONGITUDE_RANGE, 5));
        assertEquals("11000", geohashString(90.0, LONGITUDE_RANGE, 5));
        assertEquals("11100", geohashString(135.0, LONGITUDE_RANGE, 5));
        assertEquals("11110", geohashString(157.5, LONGITUDE_RANGE, 5));
        assertEquals("11111", geohashString(168.75, LONGITUDE_RANGE, 5));
        assertEquals("01111", geohashString(-1, LONGITUDE_RANGE, 5));
        assertEquals("00111", geohashString(-91.0, LONGITUDE_RANGE, 5));
        assertEquals("00011", geohashString(-136.0, LONGITUDE_RANGE, 5));
        assertEquals("00001", geohashString(-158.5, LONGITUDE_RANGE, 5));
        assertEquals("00000", geohashString(-169.75, LONGITUDE_RANGE, 5));
    }

    @Test
    public void testAssorted2DHashes() {
        assertEquals("0000000000", toHashString(geohash(LATITUDE_RANGE[0], LONGITUDE_RANGE[0], 10)));
        assertEquals("0101010101", toHashString(geohash(LATITUDE_RANGE[0], LONGITUDE_RANGE[1], 10)));
        assertEquals("01010101010", toHashString(geohash(LATITUDE_RANGE[0], LONGITUDE_RANGE[1], 11)));
        assertEquals("01010101010", toHashString(geohash(LATITUDE_RANGE[0], LONGITUDE_RANGE[1], 11)));
        assertEquals("1010101011", toHashString(geohash(LATITUDE_RANGE[1], -158.5, 10)));
        assertEquals("10101010111", toHashString(geohash(LATITUDE_RANGE[1], -158.5, 11)));
        assertEquals("10101010111111", toHashString(geohash(LATITUDE_RANGE[1], -158.5, 14)));
        assertEquals("11111111111111", toHashString(geohash(LATITUDE_RANGE[1], LONGITUDE_RANGE[1], 14)));
    }

}
