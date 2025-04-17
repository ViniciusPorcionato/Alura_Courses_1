package GitHub;

public class User {
    private String nomeUser;
    private String urlImagem;
    private int id;
    private String tipoUsuario;
    private String bio;

    public User(UserOmdb meuUserOmdb) {
        this.nomeUser = meuUserOmdb.name() != null ? meuUserOmdb.name() : "Sem nome";
        this.urlImagem = meuUserOmdb.avatar_url() != null ? meuUserOmdb.avatar_url() : "";
        this.id = meuUserOmdb.id(); // Removida conversão desnecessária
        this.tipoUsuario = meuUserOmdb.type() != null ? meuUserOmdb.type() : "User";
        this.bio = meuUserOmdb.bio() != null ? meuUserOmdb.bio() : "Sem biografia";
    }

    // Getters
    public String getNomeUser() {
        return nomeUser;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public int getId() {
        return id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "User{" +
                "nomeUser='" + nomeUser + '\'' +
                ", urlImagem='" + urlImagem + '\'' +
                ", id=" + id +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}