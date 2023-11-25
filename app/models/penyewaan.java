package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class penyewaan extends Model {
	public Integer _idPelanggan;
	public Integer _idStaff;
	public Object _waktuMulaiSewa;
	public Object _waktuSeledaiSewa;
	public staff _unnamed_staff_;
	public pelanggan _unnamed_pelanggan_;
}