package tddClass;

import classExercise.DataStructure.ArrayList;
import classExercise.DataStructure.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List list;

    @BeforeEach
    void setUp(){
        list = new ArrayList();
    }


    @Test
    public void newListIsEmptyTest(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void addItemListIsNotEmptyTest(){
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    public void addItemListIsNotEmpty_SizeIsOneTest(){
        list.add("G-String");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Test
    public void addItemGetByIndexTest(){
        list.add("A-String");
        String savedItem = list.get(0);
        assertEquals("A-String",savedItem);
    }

    @Test
    public void addXYGetXY(){
        list.add("A-String");
        list.add("G-String");
        assertEquals("A-String",list.get(0));
        assertEquals("G-String",list.get(1));
    }

    @Test
    public void addXYRemoveYSizeIsOneTest(){
        list.add("A String");
        list.add("G String");
        list.remove(1);
        assertEquals(1,list.size());
    }

    @Test
    public void addXYRemoveYFindByIndexIsNullTest(){
        list.add("A String");
        list.add("G String");
        list.remove(1);
        assertEquals(1,list.size());
        assertNull(list.get(1));
    }

}