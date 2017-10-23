package com.jx.dev.hris.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MasterKaryawan {

//	private static final long serialVersionUID = 1L;
	@Id
	private String sid;
	private String kodeNip;
	private String nama;
	private String alamat;
	private String kota;
	private String hp;
	private String emailKaryawan;
}
