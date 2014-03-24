package co.nz.skytv.stub;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author david <ns1:TransformRequest
 *         xmlns:ns1="http://service.skytv.co.nz/puborch-transform/v1"
 *         xmlns:ns2="http://model.skytv.co.nz/vod/v1"> <fromType>SKY</fromType>
 *         <toType>MPXSTUB</toType> <source> <ns2:Title>
 *         <ns2:titleId>1234</ns2:titleId> <ns2:name>Buffy The Vampire
 *         Slayer</ns2:name> <ns2:synopsis>Buffy and the Scooby Gang fight
 *         vampires</ns2:synopsis> <ns2:seriesName>Buffy</ns2:seriesName>
 *         <ns2:seriesNumber>1</ns2:seriesNumber>
 *         <ns2:episodeNumber>1</ns2:episodeNumber> <ns2:cast>
 *         <ns2:castId>24</ns2:castId> <ns2:roleId>3</ns2:roleId>
 *         <ns2:roleName>Actor</ns2:roleName> <ns2:firstName>Bob</ns2:firstName>
 *         <ns2:lastName>Down</ns2:lastName> </ns2:cast> <ns2:cast>
 *         <ns2:castId>25</ns2:castId> <ns2:roleId>3</ns2:roleId>
 *         <ns2:roleName>Actor</ns2:roleName>
 *         <ns2:firstName>Sarah</ns2:firstName>
 *         <ns2:lastName>Michell-Gellaher</ns2:lastName> </ns2:cast>
 *         <ns2:distributor>FOX</ns2:distributor>
 *         <ns2:contentProviderId>789</ns2:contentProviderId>
 *         <ns2:yearOfProduction>1995</ns2:yearOfProduction>
 *         <ns2:type>Series</ns2:type> <ns2:state>0</ns2:state> </ns2:Title>
 *         </source> </ns1:TransformRequest>
 * 
 */

@SuppressWarnings("serial")
@XmlRootElement(name = "TransformRequest", namespace = "http://service.skytv.co.nz/puborch-transform/v1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fromType", "toType", "titles" })
public class TransformRequest implements Serializable {

	@XmlElement
	private String fromType;
	@XmlElement
	private String toType;

	private List<Title> titles;

	public String getFromType() {
		return fromType;
	}

	public void setFromType(String fromType) {
		this.fromType = fromType;
	}

	public String getToType() {
		return toType;
	}

	public void setToType(String toType) {
		this.toType = toType;
	}

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
