package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class pelanggan extends Model{
	public String _namaPelanggan;
	public int _noTelp;
	public penyewaan _unnamed_penyewaan_;
}