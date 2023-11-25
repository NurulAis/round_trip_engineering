package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class nonMember extends pelanggan {
	public String _namaPelanggan;
	public int _noTelp;
	public int _idPelanggan;
}