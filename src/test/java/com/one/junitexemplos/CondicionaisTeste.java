package com.one.junitexemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTeste {

	 @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
    void validarAlgoSomenteNoUsuarioVinicyus() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
