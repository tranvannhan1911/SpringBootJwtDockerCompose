package ongiuaky.ongiuaky.entity;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Entity
@Table(name="ChuyenBay")
@Getter
@Setter
public class ChuyenBay {
    @Id
    @Column(name="MaCB")
//    @ColumnPo()
    private String maCB;
    
    @Column(name="GaDi")
    private String gaDi;

    @Column(name="GaDen")
    private String gaDen;
    
    @Column(name="DoDai")
    private float doDai;
    
    @Column(name="GioDi")
    private Time gioDi;
    
    @Column(name="GioDen")
    private Time gioDen;
    
    @Column(name="ChiPhi")
    private int chiPhi;
    
    public ChuyenBay() {
    	
    }

	public ChuyenBay(String maCB, String gaDi, String gaDen, float doDai, Time gioDi, Time gioDen, int chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}

}
