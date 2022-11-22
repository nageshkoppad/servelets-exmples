package company;

public class CompanyDTO {
private String companyName;
private String founder;
private String since;
private String employe;
private String adress;
private String business;

public CompanyDTO(String companyName, String founder, String since, String employe, String adress, String business) {
	super();
	this.companyName = companyName;
	this.founder = founder;
	this.since = since;
	this.employe = employe;
	this.adress = adress;
	this.business = business;
}


@Override
public String toString() {
	return "CompanyDTO [companyName=" + companyName + ", founder=" + founder + ", since=" + since + ", employe="
			+ employe + ", adress=" + adress + ", business=" + business + "]";
}


public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getFounder() {
	return founder;
}

public void setFounder(String founder) {
	this.founder = founder;
}

public String getSince() {
	return since;
}

public void setSince(String since) {
	this.since = since;
}

public String getEmploye() {
	return employe;
}

public void setEmploye(String employe) {
	this.employe = employe;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getBusiness() {
	return business;
}

public void setBusiness(String business) {
	this.business = business;
}
}


