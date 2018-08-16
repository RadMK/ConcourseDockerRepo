package com.infy.springboot.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nav_findings")
public class NavFinding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private Long navValue;
    
    public NavFinding() {
    }
    public NavFinding(Long navValue) {
        super();
        this.navValue = navValue;
    }
	/**
	 * @return the navValue
	 */
	public Long getNavValue() {
		return navValue;
	}
	/**
	 * @param navValue the navValue to set
	 */
	public void setNavValue(Long navValue) {
		this.navValue = navValue;
	}
	
    /**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}    
	
	@Override
    public String toString() {
        return String.format("NavFinding[id=%d, navValue='%s']", id, navValue);
    }
}
