package com.servert.wiki.web.rest.vm;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.servert.wiki.config.Constants;

public class ServertRoleVM implements Serializable{

	private static final long serialVersionUID = 1L;
	
    private Long id;
    
    @Pattern(regexp = Constants.LOGIN_REGEX)
    @Size(min = 1, max = 50)
    private String login;
    
    @Size(max = 50)
    private String name;
    
    private Integer type;
    
    private Long atk;
    
    private Long hp;
    
    private Integer level;
    
    private Integer skillOneLevel;
    
    private Integer skillTwoLevel;
    
    private Integer skillThreeLevel;
    
    private Integer toolLevel;
    
    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getAtk() {
		return atk;
	}

	public void setAtk(Long atk) {
		this.atk = atk;
	}

	public Long getHp() {
		return hp;
	}

	public void setHp(Long hp) {
		this.hp = hp;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSkillOneLevel() {
		return skillOneLevel;
	}

	public void setSkillOneLevel(Integer skillOneLevel) {
		this.skillOneLevel = skillOneLevel;
	}

	public Integer getSkillTwoLevel() {
		return skillTwoLevel;
	}

	public void setSkillTwoLevel(Integer skillTwoLevel) {
		this.skillTwoLevel = skillTwoLevel;
	}

	public Integer getSkillThreeLevel() {
		return skillThreeLevel;
	}

	public void setSkillThreeLevel(Integer skillThreeLevel) {
		this.skillThreeLevel = skillThreeLevel;
	}

	public Integer getToolLevel() {
		return toolLevel;
	}

	public void setToolLevel(Integer toolLevel) {
		this.toolLevel = toolLevel;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
    
}