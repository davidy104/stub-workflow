package co.nz.skytv.stub;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("serial")
@XmlRootElement(name = "cast", namespace = "http://model.skytv.co.nz/vod/v1")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cast implements Serializable {
	@XmlElement
	private Long castId;
	@XmlElement
	private Integer roleId;
	@XmlElement
	private String roleName;
	@XmlElement
	private String firstName;
	@XmlElement
	private String lastName;

	public Long getCastId() {
		return castId;
	}

	public void setCastId(Long castId) {
		this.castId = castId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
