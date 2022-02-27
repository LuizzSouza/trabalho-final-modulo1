package com.dbc.poo;


public class Like {

    private String like;

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void imprimirLikes(Usuario usuario1) {
        for(Usuario usuario : usuario1.getMeusLikes()){
            System.out.println(usuario.getNome());
        }
    }

    public void darLike(Usuario usuario1, Usuario usuario2) {
        if (usuario1.equals(usuario2)) {
            System.out.println("No puedes dar like a ti mismo");
        } else {
            usuario1.getMeusLikes().add(usuario2);
        }
    }


}