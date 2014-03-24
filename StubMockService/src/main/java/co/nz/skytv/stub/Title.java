package co.nz.skytv.stub;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("serial")
@XmlRootElement(name = "Title", namespace = "http://model.skytv.co.nz/vod/v1")
@XmlAccessorType(XmlAccessType.FIELD)
public class Title implements Serializable {
	@XmlElement
	private Long titleId;
	@XmlElement
	private String name;
	@XmlElement
	private String synopsis;
	@XmlElement
	private String seriesName;
	@XmlElement
	private Long seriesNumber;
	@XmlElement
	private Long episodeNumber;
	@XmlElement
	private String distributor;
	@XmlElement
	private Long contentProviderId;
	@XmlElement
	private Integer yearOfProduction;
	@XmlElement
	private String type;
	@XmlElement
	private String state;

	private List<Cast> casts;

	public Long getTitleId() {
		return titleId;
	}

	public void setTitleId(Long titleId) {
		this.titleId = titleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public Long getSeriesNumber() {
		return seriesNumber;
	}

	public void setSeriesNumber(Long seriesNumber) {
		this.seriesNumber = seriesNumber;
	}

	public Long getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(Long episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public Long getContentProviderId() {
		return contentProviderId;
	}

	public void setContentProviderId(Long contentProviderId) {
		this.contentProviderId = contentProviderId;
	}

	public Integer getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(Integer yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Cast> getCasts() {
		return casts;
	}

	public void setCasts(List<Cast> casts) {
		this.casts = casts;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
