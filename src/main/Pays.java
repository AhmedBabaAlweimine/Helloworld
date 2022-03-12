package main;

import java.util.List;
/*this class for description pays*/
public class Pays {
private Long uid;
private String adrrese;
private String nom;
private String prenom;
	//si c'est le cas
private List<Bonjour> greeting;
private int quanitié;	

public Pays(Long uid, String nom, String prenom, List<Bonjour> greeting, List<Pays> paysvisites) {
	super();
	this.uid = uid;
	this.nom = nom;
	this.prenom = prenom;
	this.greeting = greeting;
	this.paysvisites = paysvisites;
}

public String getPrenom() {
	return prenom;
}
public List<Bonjour> getGreeting() {
	return greeting;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public void setGreeting(List<Bonjour> greeting) {
	this.greeting = greeting;
}

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

public int getQuanitié() {
	return quanitié;
}

public void setQuanitié(int quanitié) {
	this.quanitié = quanitié;
}
}
