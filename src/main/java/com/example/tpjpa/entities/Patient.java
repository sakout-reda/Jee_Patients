package com.example.tpjpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="PATIENTS")

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		@Column(name="NOM", length = 25)
		@NotNull
	private String nom;
		@Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date DateNaissance;
	private int score;
	private boolean malade;

}
