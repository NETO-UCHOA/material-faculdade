import java.time.LocalDate;

public class Usuario {
    // Atributos (caracteristicas)
    private String nome;
    private String sobrenome;
    private String email;
    private String Senha;
    private LocalDate datadenascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public LocalDate getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(LocalDate datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public Usuario(String nome, String sobrenome, String email, String senha, LocalDate datadenascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        Senha = senha;
        this.datadenascimento = datadenascimento;
    }

    

}
