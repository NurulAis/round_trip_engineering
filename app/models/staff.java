package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class staff extends Model {
	public String _namaStaff;
	public int _idStaff;
	public penyewaan _unnamed_penyewaan_;
}