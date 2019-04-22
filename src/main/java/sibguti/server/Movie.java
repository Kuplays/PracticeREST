package sibguti.server;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

//"СТАНДАРТНЫЙ ШАБЛОН ТОЛЬКО ДЛЯ ПРОВЕРКИ СБОРКИ"

    private String name;

    private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}