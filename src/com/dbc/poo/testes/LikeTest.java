package com.dbc.poo.testes;

import com.dbc.poo.*;
import org.junit.Before;
import org.junit.Test;

public class LikeTest {

    private Like like;

    @Before
    public void setUp() {
        like = new Like();
    }

    @Test
    public void deveDarLikeEmUmaPessoa() {
        // Arrange
        UsuarioFree usuario1 = new UsuarioFree("João", new DadosPessoais(20, "joãozinho@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);
        UsuarioFree usuario2 = new UsuarioFree("Maria", new DadosPessoais(20, "mariazinha@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.FEMININO, Interesse.HOMEM);

        // Act
        like.darLike(usuario1, usuario2);

        // Assert
        assert(usuario1.getMeusLikes().contains(usuario2));
    }

    @Test
    public void deveDarLikeEntreDuasPessoas() {
        // Arrange
        UsuarioFree usuario1 = new UsuarioFree("Lucas", new DadosPessoais(20, "joãozinho@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.MASCULINO, Interesse.MULHER);
        UsuarioFree usuario2 = new UsuarioFree("Carla", new DadosPessoais(20, "mariazinha@gmail.com"), new Endereco("rua jose", 123, "gravataí"), Linguagens.JAVA, Genero.FEMININO, Interesse.HOMEM);

        // Act
        like.darLike(usuario1, usuario2);
        like.darLike(usuario2, usuario1);

        // Assert
        assert(usuario1.getMeusLikes().contains(usuario2));
        assert(usuario2.getMeusLikes().contains(usuario1));

    }
}