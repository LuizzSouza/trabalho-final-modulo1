package com.dbc.poo.testes;

import com.dbc.poo.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.*;

public class OperacoesUsuarioTest {

    private OperacoesUsuario opUsuario;


    @Test
    public void deveCadastrarUsuarioComSucesso() {
        //SETUP
        OperacoesUsuario opUsuario = new OperacoesUsuario();
        Usuario user = new Usuario();
        user.setNome("Luiz");
        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.setIdade(19);
        dadosPessoais.setEmail("luiz@gmail.com");
        user.setDadosPessoais(dadosPessoais);
        user.setEndereco(new Endereco("Rua A", 123, "Gravataí"));
        user.setLinguagem(Linguagens.JAVA);
        user.setGenero(Genero.MASCULINO);
        user.setInteresse(Interesse.MULHER);

       // ACT
        opUsuario.cadastrarUsuario(user);

        //ASSERT
        assertEquals("Luiz", user.getNome());
        assertEquals(19, (long) user.getDadosPessoais().getIdade());
        assertEquals("luiz@gmail.com", user.getDadosPessoais().getEmail());
        assertEquals(Linguagens.JAVA, user.getLinguagem());
        assertEquals(Genero.MASCULINO, user.getGenero());
        assertEquals(Interesse.MULHER, user.getInteresse());

    }


    @Test
    public void deveRemoverUsuariosPorIndice() {
        //SETUP
        OperacoesUsuario opUsuario = new OperacoesUsuario();
        Usuario user = new Usuario();
        Usuario user2 = new Usuario();
        user.setNome("Matheus");
        user2.setNome("Luiz");
        opUsuario.cadastrarUsuario(user);
        opUsuario.cadastrarUsuario(user2);
        opUsuario.listarTodosUsuarios();

        //ACT
        opUsuario.removerUsuarioPorIndice(1);

        //ASSERT
        ArrayList<Usuario> listaEsperada = new ArrayList<>();
        listaEsperada.add(user);
        assertEquals(listaEsperada, opUsuario.getUsuariosList());
        opUsuario.listarTodosUsuarios();

    }

}
