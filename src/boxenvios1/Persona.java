
package boxenvios1;

//clase para persona/usuario
public class Persona {
    
    private String nombre;
    private String apellido;
    private int id;
    private String nick;
    private String correo;
    private String password;
    
    public Persona(String nombre, String apellido, int id, String nick, String correo, String password){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.nick=nick;
        this.correo=correo;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre de Usuario: %s. Correo electronico: %s", nick, correo);
    }
    
    
    
}
