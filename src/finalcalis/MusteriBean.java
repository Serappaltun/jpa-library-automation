package finalcalis;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class MusteriBean {

	private Musteri musteri = new Musteri();
	
	private List<Musteri> musteriListesi = new ArrayList<Musteri>();
	
	public void kaydet(){
		EntityManager em = EntityUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(musteri);
		em.getTransaction().commit();
		
		musteri = new Musteri();
	}
	public void tumunuDuzenle(){
		EntityManager em = EntityUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
		musteri = new Musteri();
	}
	public void secilenleriSil(){
		EntityManager em = EntityUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		for (Musteri must : musteriListesi) {
			if(must.getSecim()){
				em.remove(must);
			}
		}
		
		em.getTransaction().commit();
		
		musteri = new Musteri();
	}
	public void sil(){
		EntityManager em = EntityUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.remove(musteri);
		em.getTransaction().commit();
		
		musteri = new Musteri();
	}
	
	public List<Musteri> getMusteriListesi(){
		EntityManager em = EntityUtil.getEntityManager();
		this.musteriListesi = em.createQuery("from Musteri m").getResultList();
		return this.musteriListesi;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public Musteri getMusteri() {
		return musteri;
	}
}
