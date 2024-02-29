package com.one.junitexemplos;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.one.junitexemplos.junit.Pessoa;

public class PessoaTeste {
	
	@Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2002, 1, 1, 15, 0, 0)); // 2000/1/1 15:00:00
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2002, 1, 1, 15, 0, 0)); // 2000/1/1 15:00:00
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

    @Test
    void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }

}
