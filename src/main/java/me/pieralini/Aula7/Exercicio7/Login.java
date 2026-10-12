public class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void logar(String user, String password) throws LoginInvalidoException {
        if (!usuario.equals(user) || !senha.equals(password)) {
            throw new LoginInvalidoException("Usuario ou senha incorretos.");
        }

        System.out.println("Login realizado com sucesso.");
    }
}