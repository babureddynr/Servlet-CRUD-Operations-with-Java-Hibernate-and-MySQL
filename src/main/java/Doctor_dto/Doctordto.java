package Doctor_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doctordto 
{
	@Id
    private int id;
    private String name;
  

    // Constructor, getters, setters
    public Doctordto() {
    }

    public Doctordto(int id, String name) {
        this.id = id;
        this.name = name;
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	}

  