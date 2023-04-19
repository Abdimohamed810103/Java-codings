package org.example.fucntional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class JavaFuncTest {

    @Test
    void testreplacer(){
        List<String> sxb = List.of("Abd i", "F iqow", "Hus sein");
        List<String> walaal = List.of("Abshir", "ahmed", "mohamed");
        List<String> sxbReplaced = JavaFunc.replace(sxb, s -> s.replaceAll("\\s", ""));

        assertEquals(List.of("Abdi","Fiqow","Hussein"), sxbReplaced);


    }
    @Test
    void testFunction(){
        Function<String, String> function = (String s) -> s.toLowerCase();
        Function<String, String> function2 = (String s) -> s.concat(" done");

        Function<String, String> replaceString = JavaFunc.replaceString(function,function2);

        assertEquals("test done", replaceString.apply("TEST"));


    }

}