package finalcalis;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;

@Entity
public class Musteri implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String ad;
	private String soyad;
	
	@Embedded
	KisiselBilgi kisiselBilgi = new KisiselBilgi();
	
	@Transient
	private Boolean secim = false;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.ALL}, fetch=FetchType.LAZY)
	private MusteriAdres musteriAdres = new MusteriAdres();
	
//	@Formula("select sum(miktar) from MusteriSatis")
	private Integer yillikSatis;
	
	private Integer maas = 600;
	
	@Formula("maas * 12")
	private Integer yillikGelir;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAd() {
		return ad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setMusteriAdres(MusteriAdres musteriAdres) {
		this.musteriAdres = musteriAdres;
	}

	public MusteriAdres getMusteriAdres() {
		return musteriAdres;
	}

	public void setYillikSatis(Integer yillikSatis) {
		this.yillikSatis = yillikSatis;
	}

	public Integer getYillikSatis() {
		return yillikSatis;
	}

	public void setMaas(Integer maas) {
		this.maas = maas;
	}

	public Integer getMaas() {
		return maas;
	}

	public void setYillikGelir(Integer yillikGelir) {
		this.yillikGelir = yillikGelir;
	}

	public Integer getYillikGelir() {
		return yillikGelir;
	}

	public void setSecim(Boolean secim) {
		this.secim = secim;
	}

	public Boolean getSecim() {
		return secim;
	}


}
