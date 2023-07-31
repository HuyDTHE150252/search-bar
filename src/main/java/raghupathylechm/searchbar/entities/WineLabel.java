package raghupathylechm.searchbar.entities;

import java.util.Random;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "wine_label")
public class WineLabel {
	
	@Id
	private Integer id;
	private Double alcohol_content;
	private String bottle_information;
	private String brand_name;
	private String grape_variety;
	private String importer_information;
	private String model_name;
	private String region_of_production;
	private Integer vintage;
	private String wine_name;
	private Integer quantity;
	private Boolean status_completed;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="inboundList_id", nullable=false)
	@JsonManagedReference
	private InboundList inboundList;
	
	public WineLabel(Integer id, Double alcohol_content, String bottle_information, String brand_name,
			String grape_variety, String importer_information, String model_name, String region_of_production,
			Integer vintage, String wine_name, Boolean status_completed) {
		this.id = id;
		this.alcohol_content = alcohol_content;
		this.bottle_information = bottle_information;
		this.brand_name = brand_name;
		this.grape_variety = grape_variety;
		this.importer_information = importer_information;
		this.model_name = model_name;
		this.region_of_production = region_of_production;
		this.vintage = vintage;
		this.wine_name = wine_name;
		this.status_completed = status_completed;
	}
	
	public WineLabel() {
		this.id = generateRandomId();
	}
	
	private Integer generateRandomId() {
        Random random = new Random();
        int randomId = 100000 + random.nextInt(900000);
        return randomId;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAlcohol_content() {
		return alcohol_content;
	}

	public void setAlcohol_content(Double alcohol_content) {
		this.alcohol_content = alcohol_content;
	}

	public String getBottle_information() {
		return bottle_information;
	}

	public void setBottle_information(String bottle_information) {
		this.bottle_information = bottle_information;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getGrape_variety() {
		return grape_variety;
	}

	public void setGrape_variety(String grape_variety) {
		this.grape_variety = grape_variety;
	}

	public String getImporter_information() {
		return importer_information;
	}

	public void setImporter_information(String importer_information) {
		this.importer_information = importer_information;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getRegion_of_production() {
		return region_of_production;
	}

	public void setRegion_of_production(String region_of_production) {
		this.region_of_production = region_of_production;
	}

	public Integer getVintage() {
		return vintage;
	}

	public void setVintage(Integer vintage) {
		this.vintage = vintage;
	}

	public String getWine_name() {
		return wine_name;
	}

	public void setWine_name(String wine_name) {
		this.wine_name = wine_name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getStatus_completed() {
		return status_completed;
	}

	public void setStatus_completed(Boolean status_completed) {
		this.status_completed = status_completed;
	}

	public InboundList getInboundList() {
		return inboundList;
	}

	public void setInboundList(InboundList inboundList) {
		this.inboundList = inboundList;
	}

}
