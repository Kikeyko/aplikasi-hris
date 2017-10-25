package com.jx.dev.hris.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_master")
public class EmployeeMaster {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@Column(name = "kode_nip", unique = true, nullable = false, length = 15)
	private String kodeNip;
	
	@Column(name = "nama", nullable = false, length = 60)
	private String nama;
	
	@Column(name = "tanggal_lahir", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;

	@Column(name = "alamat", length = 225)
	private String alamat;

	@Column(name = "kota", length = 60)
	private String kota;

	@Column(name = "hp", length = 15)
	private String hp;

	@Column(name = "email_karyawan", length = 150)
	private String emailKaryawan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jabatan_id", nullable = false)
	private PositionMaster jabatanID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKodeNip() {
		return kodeNip;
	}

	public void setKodeNip(String kodeNip) {
		this.kodeNip = kodeNip;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getEmailKaryawan() {
		return emailKaryawan;
	}

	public void setEmailKaryawan(String emailKaryawan) {
		this.emailKaryawan = emailKaryawan;
	}

	public PositionMaster getJabatanID() {
		return jabatanID;
	}

	public void setJabatanID(PositionMaster jabatanID) {
		this.jabatanID = jabatanID;
	}
	
}
