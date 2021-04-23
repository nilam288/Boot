package yash.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private Integer id;
	
	@NotEmpty(message = "Please provide a name")
	private String name;
	
	@NotEmpty(message = "Please provide a description")
	private String description;
	
    @NotNull(message = "Please provide a start date")
	private Date startDate;
    
    @NotNull(message = "Please provide a end date")
	private Date endDate;	
	
	public Project() {
		super();
	}
	public Project(Integer id, String name, String description, Date srartDate, Date endDate, Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getSrartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
}

