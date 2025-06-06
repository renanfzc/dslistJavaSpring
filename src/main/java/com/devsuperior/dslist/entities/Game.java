package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  	/* Ctrl + Shift + o importa jakarta.persistence*/	/*Notacion 'Entity' configura uma classe JAVA para que seja equivalente a uma tabela do banco relacional*/
@Table (name = "tb_game")		/*Customiza o nome da tabela do banco de dados */
public class Game {
	
	@Id		/*configura ID chave primaria*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	/*Auto incrementa ID no banco de  dados*/
	private Long id;
	private String title;
	
	@Column(name = "game_year")		/*year é uma palavra reservada do SQL, esse comando muda o nome no banco*/
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT") /*Permite textos maiores no banco de dados*/
	private String shortDescription;
		
	@Column(columnDefinition = "TEXT") /*Permite textos maiores no banco de dados*/
	private String longDescription;
	
	public Game() {
		
	}

	public Game(Long id, String title, Integer year, String genre, String platform, Double score, String imgUrl,
			String shortDescription, String longDescription) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platform;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platforms;
	}

	public void setPlatform(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
