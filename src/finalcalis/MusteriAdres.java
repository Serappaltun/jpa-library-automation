package finalcalis;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusteriAdres implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String cadde;
	private String sokak;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getCadde() {
		return cadde;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getSokak() {
		return sokak;
	}
}
