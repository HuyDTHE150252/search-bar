package raghupathylechm.searchbar.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class InboundList {
	
	@Id
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Date arrival_date;
	@Temporal(TemporalType.DATE)
	private Date departure_date;
	private String exporter;
	private String handling_agent;
	private String importer;
	private String permit_no;
	private Integer t_cartons;
	private Integer t_quantity;
	private Boolean status_completed;
	@OneToMany(mappedBy="inboundList", cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JsonBackReference
	private List<WineLabel> winelabel;
	
	public InboundList(Integer id, Date arrival_date, Date departure_date, String exporter, String handling_agent,
			String importer, String permit_no, Integer t_cartons, Integer t_quantity, Boolean status_completed) {
		this.id = id;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
		this.exporter = exporter;
		this.handling_agent = handling_agent;
		this.importer = importer;
		this.permit_no = permit_no;
		this.t_cartons = t_cartons;
		this.t_quantity = t_quantity;
		this.status_completed = status_completed;
	}
	
	public InboundList() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getArrival_date() {
		return arrival_date;
	}

	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}

	public Date getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	public String getExporter() {
		return exporter;
	}

	public void setExporter(String exporter) {
		this.exporter = exporter;
	}

	public String getHandling_agent() {
		return handling_agent;
	}

	public void setHandling_agent(String handling_agent) {
		this.handling_agent = handling_agent;
	}

	public String getImporter() {
		return importer;
	}

	public void setImporter(String importer) {
		this.importer = importer;
	}

	public String getPermit_no() {
		return permit_no;
	}

	public void setPermit_no(String permit_no) {
		this.permit_no = permit_no;
	}

	public Integer getT_cartons() {
		return t_cartons;
	}

	public void setT_cartons(Integer t_cartons) {
		this.t_cartons = t_cartons;
	}

	public Integer getT_quantity() {
		return t_quantity;
	}

	public void setT_quantity(Integer t_quantity) {
		this.t_quantity = t_quantity;
	}

	public Boolean getStatus_completed() {
		return status_completed;
	}

	public void setStatus_completed(Boolean status_completed) {
		this.status_completed = status_completed;
	}

	public List<WineLabel> getWinelabel() {
		return winelabel;
	}

	public void setWinelabel(List<WineLabel> winelabel) {
		this.winelabel = winelabel;
	}
	
}
