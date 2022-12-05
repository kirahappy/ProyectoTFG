package lieTime.model;

public class UsuarioModel {
	private int id;

	private String user;

	private String password;

	private boolean administrator;

	public UsuarioModel(String user, String password, boolean administrator) {
		this.user = user;
		this.password = password;
		this.administrator = administrator;
	}

	public UsuarioModel(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", password=" + password + ", administrator=" + administrator
				+ "]";
	}

}
