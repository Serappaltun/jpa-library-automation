
package finalcalis;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;


public class MusteriArama {
private Musteri musteri=new Musteri();

public List<Musteri> getAramaSonuc(){
	EntityManager em=EntityUtil.getEntityManager();
	return em.createQuery("from Musteri where "
			+ "ad like :deger "
			+ "and soyad like :deger2")
			.setParameter("deger", musteri.getAd())
			.setParameter("deger2", musteri.getSoyad())
			.getResultList();
}

public Musteri getMusteri() {
	return musteri;
}

public void setMusteri(Musteri musteri) {
	this.musteri = musteri;
}
}
