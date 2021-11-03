package org.AlgoDaily.practise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    @DisplayName("Checking binary search with sorted list")
    void binarySearch(){
        int expected = 4;
        int actual = binarySearch.binary(new int[]{1,2,3,5,6,7,8},0,6,6);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Checking binary search with one element")
    void binarySearchSingleElement(){
        int expected = 0;
        int actual = binarySearch.binary(new int[]{5},0,0,5);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Checking binary search with 2 elements")
    void binarySearch2Elements(){
        int expected = 1;
        int actual = binarySearch.binary(new int[]{5,6},0,1,6);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Checking negative binary search result")
    void binarySearchMissingElement(){
        int expected = -1;
        int actual = binarySearch.binary(new int[]{1,2,3,5,6,7},0,1,4);
        assertEquals(expected,actual);
    }



}
