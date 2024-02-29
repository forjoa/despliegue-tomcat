package domains;

public class User {
	
	private String username;
	private String pwd;
	private String nombre;
	private String DNI;
	
	public User() {}
	
	public User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	public User(String username, String pwd, String nombre, String dNI) {
		this.username = username;
		this.pwd = pwd;
		this.nombre = nombre;
		DNI = dNI;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	

}
