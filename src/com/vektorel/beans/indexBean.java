package com.vektorel.beans;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.models.tbldefault;

@SuppressWarnings("deprecation")
@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean { 

		private String ekranyazisi = "ilk JSF";

		private List<tbldefault> liste = new ArrayList<>();
		
		public indexBean() {
			
			tbldefault tb ;
			
			for (long i = 0L; i < 10; i++) {
				tb=new tbldefault();
				tb.setId(i);
				tb.setAd("Kiþi-"+i);
				liste.add(tb);
				
			}
			
			
		}
		
		public List<tbldefault> getListe() {
			return liste;
		}

		public void setListe(List<tbldefault> liste) {
			this.liste = liste;
		}

		public String getEkranyazisi() {
			return ekranyazisi;
		}

		public void setEkranyazisi(String ekranyazisi) {
			this.ekranyazisi = ekranyazisi;
		}
	
}
