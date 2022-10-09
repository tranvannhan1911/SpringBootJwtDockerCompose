package ongiuaky.ongiuaky.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class MayBay {
    @Id
    @Column(name="MaMB")
    private String maMB;
    
    @Column(name="Loai")
    private String loai;

    @Column(name="TamBay")
    private int tamBay;
    
    public MayBay() {
    	
    }

	public MayBay(String maMB, String loai, int tamBay) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
	}
}
