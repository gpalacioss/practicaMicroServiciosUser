package com.practica.userservice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.practica.userservice.enums.EstatusUsuario;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ID_USUARIO")
	private Long idUsuario;

	@Column(name = "NOMBRE_USUARIO")
	private String nombreUsuario;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;
	
	@Column(name = "ESTATUS")
	@Enumerated(EnumType.STRING)
	private EstatusUsuario estatus;
	
	@ManyToOne
	@JoinColumn(name = "ID_PERFIL", referencedColumnName = "ID_PERFIL")
	private Perfil perfil;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public EstatusUsuario getEstatus() {
		return estatus;
	}

	public void setEstatus(EstatusUsuario estatus) {
		this.estatus = estatus;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
}
