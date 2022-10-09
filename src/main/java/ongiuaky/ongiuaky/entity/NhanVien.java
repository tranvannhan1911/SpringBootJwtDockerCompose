package ongiuaky.ongiuaky.entity;

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
public class NhanVien {

    @Id
    @Column(name="MaNV")
    private String maNV;
    
    @Column(name="Ten")
    private String ten;

    @Column(name="Luong")
    private int luong;
    
    public NhanVien() {
    	
    }

	public NhanVien(String maNV, String ten, int luong) {
		super();
		this.maNV = maNV;
		this.ten = ten;
		this.luong = luong;
	}

    
}
