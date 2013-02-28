/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.felixchristy.service.service.persistence;

import com.felixchristy.service.model.FAQ;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the f a q service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQPersistenceImpl
 * @see FAQUtil
 * @generated
 */
public interface FAQPersistence extends BasePersistence<FAQ> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQUtil} to access the f a q persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the f a q in the entity cache if it is enabled.
	*
	* @param faq the f a q
	*/
	public void cacheResult(com.felixchristy.service.model.FAQ faq);

	/**
	* Caches the f a qs in the entity cache if it is enabled.
	*
	* @param faqs the f a qs
	*/
	public void cacheResult(
		java.util.List<com.felixchristy.service.model.FAQ> faqs);

	/**
	* Creates a new f a q with the primary key. Does not add the f a q to the database.
	*
	* @param faqId the primary key for the new f a q
	* @return the new f a q
	*/
	public com.felixchristy.service.model.FAQ create(long faqId);

	/**
	* Removes the f a q with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q that was removed
	* @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ remove(long faqId)
		throws com.felixchristy.service.NoSuchFAQException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.felixchristy.service.model.FAQ updateImpl(
		com.felixchristy.service.model.FAQ faq, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the f a q with the primary key or throws a {@link com.felixchristy.service.NoSuchFAQException} if it could not be found.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q
	* @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ findByPrimaryKey(long faqId)
		throws com.felixchristy.service.NoSuchFAQException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the f a q with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q, or <code>null</code> if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ fetchByPrimaryKey(long faqId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the f a qs.
	*
	* @return the f a qs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.felixchristy.service.model.FAQ> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the f a qs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a qs
	* @param end the upper bound of the range of f a qs (not inclusive)
	* @return the range of f a qs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.felixchristy.service.model.FAQ> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the f a qs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a qs
	* @param end the upper bound of the range of f a qs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a qs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.felixchristy.service.model.FAQ> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the f a qs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of f a qs.
	*
	* @return the number of f a qs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}