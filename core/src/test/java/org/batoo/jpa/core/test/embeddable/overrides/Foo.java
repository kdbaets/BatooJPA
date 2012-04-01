/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.batoo.jpa.core.test.embeddable.overrides;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author hceylan
 * @since $version
 */
@Entity
public class Foo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String value;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "city", column = @Column(name = "homeCity")), //
		@AttributeOverride(name = "street", column = @Column(name = "homeStreet")) })
	private Address homeAddress;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "city", column = @Column(name = "workCity")), //
		@AttributeOverride(name = "street", column = @Column(name = "workStreet")) })
	private Address workAddress;

	/**
	 * Returns the homeAddress.
	 * 
	 * @return the homeAddress
	 * @since $version
	 */
	public Address getHomeAddress() {
		return this.homeAddress;
	}

	/**
	 * Returns the id.
	 * 
	 * @return the id
	 * @since $version
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Returns the value.
	 * 
	 * @return the value
	 * @since $version
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Returns the workAddress.
	 * 
	 * @return the workAddress
	 * @since $version
	 */
	public Address getWorkAddress() {
		return this.workAddress;
	}

	/**
	 * Sets the homeAddress.
	 * 
	 * @param homeAddress
	 *            the homeAddress to set
	 * @since $version
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            the value to set
	 * @since $version
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Sets the workAddress.
	 * 
	 * @param workAddress
	 *            the workAddress to set
	 * @since $version
	 */
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
}