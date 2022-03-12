package main;

import java.util.List;

public class Pays {
private Long uid;	
private String nom;
private List<Pays> paysvisites;
public Long getUid() {
	return uid;
}
public String getNom() {
	return nom;
}
public List<Pays> getPaysvisites() {
	return paysvisites;
}
public void setUid(Long uid) {
	this.uid = uid;
}
public void setNom(String nom) {
	this.nom = nom;
}
public void setPaysvisites(List<Pays> paysvisites) {
	this.paysvisites = paysvisites;
}
}
