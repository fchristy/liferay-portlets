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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the f a q service. This utility wraps {@link FAQPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQPersistence
 * @see FAQPersistenceImpl
 * @generated
 */
public class FAQUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FAQ faq) {
		getPersistence().clearCache(faq);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FAQ> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQ> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQ> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FAQ update(FAQ faq, boolean merge) throws SystemException {
		return getPersistence().update(faq, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FAQ update(FAQ faq, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(faq, merge, serviceContext);
	}

	/**
	* Caches the f a q in the entity cache if it is enabled.
	*
	* @param faq the f a q
	*/
	public static void cacheResult(com.felixchristy.service.model.FAQ faq) {
		getPersistence().cacheResult(faq);
	}

	/**
	* Caches the f a qs in the entity cache if it is enabled.
	*
	* @param faqs the f a qs
	*/
	public static void cacheResult(
		java.util.List<com.felixchristy.service.model.FAQ> faqs) {
		getPersistence().cacheResult(faqs);
	}

	/**
	* Creates a new f a q with the primary key. Does not add the f a q to the database.
	*
	* @param faqId the primary key for the new f a q
	* @return the new f a q
	*/
	public static com.felixchristy.service.model.FAQ create(long faqId) {
		return getPersistence().create(faqId);
	}

	/**
	* Removes the f a q with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q that was removed
	* @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.felixchristy.service.model.FAQ remove(long faqId)
		throws com.felixchristy.service.NoSuchFAQException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(faqId);
	}

	public static com.felixchristy.service.model.FAQ updateImpl(
		com.felixchristy.service.model.FAQ faq, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(faq, merge);
	}

	/**
	* Returns the f a q with the primary key or throws a {@link com.felixchristy.service.NoSuchFAQException} if it could not be found.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q
	* @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.felixchristy.service.model.FAQ findByPrimaryKey(
		long faqId)
		throws com.felixchristy.service.NoSuchFAQException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(faqId);
	}

	/**
	* Returns the f a q with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q, or <code>null</code> if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.felixchristy.service.model.FAQ fetchByPrimaryKey(
		long faqId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(faqId);
	}

	/**
	* Returns all the f a qs.
	*
	* @return the f a qs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.felixchristy.service.model.FAQ> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.felixchristy.service.model.FAQ> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.felixchristy.service.model.FAQ> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the f a qs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of f a qs.
	*
	* @return the number of f a qs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FAQPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FAQPersistence)PortletBeanLocatorUtil.locate(com.felixchristy.service.service.ClpSerializer.getServletContextName(),
					FAQPersistence.class.getName());

			ReferenceRegistry.registerReference(FAQUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FAQPersistence persistence) {
	}

	private static FAQPersistence _persistence;
}