package com.othex.connectorarchive.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "T_connector")
public class Connector {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Part_Number")
	private String partNumber;
	
	@Column(name = "Supplier")
	private String supplier;
	
	@Column(name = "Con_Color")
	private String con_Color;
	
	@Column(name = "Con_Image")
	private String con_Image;
	
	@Column(name = "Cavities_Number")
	private String cavities_Number;
	
	@Column(name = "Con_Description")
	private String con_Description;
	
	@Column(name = "Creation_date")
	private Date creation_date;
	
	@Column(name = "Update_date")
	private Date update_date;

}
