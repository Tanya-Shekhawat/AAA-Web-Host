/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package TanyaServices.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Customer service. Represents a row in the &quot;tanya_Customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>TanyaServices.model.impl.CustomerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>TanyaServices.model.impl.CustomerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
@ProviderType
public interface CustomerModel
	extends BaseModel<Customer>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a customer model instance should use the {@link Customer} interface instead.
	 */

	/**
	 * Returns the primary key of this customer.
	 *
	 * @return the primary key of this customer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this customer.
	 *
	 * @param primaryKey the primary key of this customer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this customer.
	 *
	 * @return the uuid of this customer
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this customer.
	 *
	 * @param uuid the uuid of this customer
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the customer ID of this customer.
	 *
	 * @return the customer ID of this customer
	 */
	public long getCustomerId();

	/**
	 * Sets the customer ID of this customer.
	 *
	 * @param customerId the customer ID of this customer
	 */
	public void setCustomerId(long customerId);

	/**
	 * Returns the name of this customer.
	 *
	 * @return the name of this customer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this customer.
	 *
	 * @param name the name of this customer
	 */
	public void setName(String name);

	/**
	 * Returns the email of this customer.
	 *
	 * @return the email of this customer
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this customer.
	 *
	 * @param email the email of this customer
	 */
	public void setEmail(String email);

	/**
	 * Returns the address of this customer.
	 *
	 * @return the address of this customer
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this customer.
	 *
	 * @param address the address of this customer
	 */
	public void setAddress(String address);

	/**
	 * Returns the national_ ID of this customer.
	 *
	 * @return the national_ ID of this customer
	 */
	@AutoEscape
	public String getNational_Id();

	/**
	 * Sets the national_ ID of this customer.
	 *
	 * @param national_Id the national_ ID of this customer
	 */
	public void setNational_Id(String national_Id);

	/**
	 * Returns the contact of this customer.
	 *
	 * @return the contact of this customer
	 */
	@AutoEscape
	public String getContact();

	/**
	 * Sets the contact of this customer.
	 *
	 * @param contact the contact of this customer
	 */
	public void setContact(String contact);

	/**
	 * Returns the start_date of this customer.
	 *
	 * @return the start_date of this customer
	 */
	public Date getStart_date();

	/**
	 * Sets the start_date of this customer.
	 *
	 * @param start_date the start_date of this customer
	 */
	public void setStart_date(Date start_date);

	/**
	 * Returns the service ID of this customer.
	 *
	 * @return the service ID of this customer
	 */
	public long getServiceId();

	/**
	 * Sets the service ID of this customer.
	 *
	 * @param serviceId the service ID of this customer
	 */
	public void setServiceId(long serviceId);

	/**
	 * Returns the group ID of this customer.
	 *
	 * @return the group ID of this customer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this customer.
	 *
	 * @param groupId the group ID of this customer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this customer.
	 *
	 * @return the company ID of this customer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this customer.
	 *
	 * @param companyId the company ID of this customer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this customer.
	 *
	 * @return the user ID of this customer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this customer.
	 *
	 * @param userId the user ID of this customer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this customer.
	 *
	 * @return the user uuid of this customer
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this customer.
	 *
	 * @param userUuid the user uuid of this customer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this customer.
	 *
	 * @return the user name of this customer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this customer.
	 *
	 * @param userName the user name of this customer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this customer.
	 *
	 * @return the create date of this customer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this customer.
	 *
	 * @param createDate the create date of this customer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this customer.
	 *
	 * @return the modified date of this customer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this customer.
	 *
	 * @param modifiedDate the modified date of this customer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public Customer cloneWithOriginalValues();

}