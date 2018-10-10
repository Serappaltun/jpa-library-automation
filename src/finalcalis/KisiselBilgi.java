package finalcalis;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class KisiselBilgi implements Serializable {

	private Long tcKimlik;
	private String dogumYeri;
	private Date dogumTarihi;

	public void setTcKimlik(Long tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public Long getTcKimlik() {
		return tcKimlik;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}
}
