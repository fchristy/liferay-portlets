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

package com.felixchristy.service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FAQLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       FAQLocalService
 * @generated
 */
public class FAQLocalServiceWrapper implements FAQLocalService,
	ServiceWrapper<FAQLocalService> {
	public FAQLocalServiceWrapper(FAQLocalService faqLocalService) {
		_faqLocalService = faqLocalService;
	}

	/**
	* Adds the f a q to the database. Also notifies the appropriate model listeners.
	*
	* @param faq the f a q
	* @return the f a q that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ addFAQ(
		com.felixchristy.service.model.FAQ faq)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.addFAQ(faq);
	}

	/**
	* Creates a new f a q with the primary key. Does not add the f a q to the database.
	*
	* @param faqId the primary key for the new f a q
	* @return the new f a q
	*/
	public com.felixchristy.service.model.FAQ createFAQ(long faqId) {
		return _faqLocalService.createFAQ(faqId);
	}

	/**
	* Deletes the f a q with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q that was removed
	* @throws PortalException if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ deleteFAQ(long faqId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.deleteFAQ(faqId);
	}

	/**
	* Deletes the f a q from the database. Also notifies the appropriate model listeners.
	*
	* @param faq the f a q
	* @return the f a q that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ deleteFAQ(
		com.felixchristy.service.model.FAQ faq)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.deleteFAQ(faq);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _faqLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.felixchristy.service.model.FAQ fetchFAQ(long faqId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.fetchFAQ(faqId);
	}

	/**
	* Returns the f a q with the primary key.
	*
	* @param faqId the primary key of the f a q
	* @return the f a q
	* @throws PortalException if a f a q with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ getFAQ(long faqId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.getFAQ(faqId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.felixchristy.service.model.FAQ> getFAQs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.getFAQs(start, end);
	}

	/**
	* Returns the number of f a qs.
	*
	* @return the number of f a qs
	* @throws SystemException if a system exception occurred
	*/
	public int getFAQsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.getFAQsCount();
	}

	/**
	* Updates the f a q in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faq the f a q
	* @return the f a q that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ updateFAQ(
		com.felixchristy.service.model.FAQ faq)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.updateFAQ(faq);
	}

	/**
	* Updates the f a q in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faq the f a q
	* @param merge whether to merge the f a q with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the f a q that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.felixchristy.service.model.FAQ updateFAQ(
		com.felixchristy.service.model.FAQ faq, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.updateFAQ(faq, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _faqLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_faqLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _faqLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.felixchristy.service.model.FAQ addFAQ(
		java.lang.String question, java.lang.String answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqLocalService.addFAQ(question, answer);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FAQLocalService getWrappedFAQLocalService() {
		return _faqLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFAQLocalService(FAQLocalService faqLocalService) {
		_faqLocalService = faqLocalService;
	}

	public FAQLocalService getWrappedService() {
		return _faqLocalService;
	}

	public void setWrappedService(FAQLocalService faqLocalService) {
		_faqLocalService = faqLocalService;
	}

	private FAQLocalService _faqLocalService;
}