package lieTime.dao;

import java.util.Collection;

import java.util.HashSet;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lieTime.dao.Rol;

@Entity
@Table(name = "usuario")
public class UsuarioDao implements UserDetails {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "usuario")
	private String username;

	@Column(name = "contraseña")
	private String password;

	@Column(name = "administrador")
	private boolean administrator;

	@OneToMany(mappedBy= "usuario", fetch = FetchType.EAGER)
	private Set<MentiraDao> mentiras;
	
	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name = "usuarios_roles", joinColumns = { @JoinColumn(name = "id_Usuario") }, inverseJoinColumns = {
			@JoinColumn(name = "id_Rol") })
	@JsonIgnore
	private Set<Rol> roles;

	public UsuarioDao() {
		mentiras = new HashSet<MentiraDao>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		this.username = user;
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

	public Set<MentiraDao> getMentiras() {
		return mentiras;
	}

	public void setMentiras(Set<MentiraDao> mentiras) {
		this.mentiras = mentiras;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.collect(Collectors.toList());
	}
 
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
