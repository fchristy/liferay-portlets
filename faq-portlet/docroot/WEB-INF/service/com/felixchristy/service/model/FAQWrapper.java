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

package com.felixchristy.service.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FAQ}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       FAQ
 * @generated
 */
public class FAQWrapper implements FAQ, ModelWrapper<FAQ> {
	public FAQWrapper(FAQ faq) {
		_faq = faq;
	}

	public Class<?> getModelClass() {
		return FAQ.class;
	}

	public String getModelClassName() {
		return FAQ.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("faqId", getFaqId());
		attributes.put("question", getQuestion());
		attributes.put("answer", getAnswer());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long faqId = (Long)attributes.get("faqId");

		if (faqId != null) {
			setFaqId(faqId);
		}

		String question = (String)attributes.get("question");

		if (question != null) {
			setQuestion(question);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}
	}

	/**
	* Returns the primary key of this f a q.
	*
	* @return the primary key of this f a q
	*/
	public long getPrimaryKey() {
		return _faq.getPrimaryKey();
	}

	/**
	* Sets the primary key of this f a q.
	*
	* @param primaryKey the primary key of this f a q
	*/
	public void setPrimaryKey(long primaryKey) {
		_faq.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the faq ID of this f a q.
	*
	* @return the faq ID of this f a q
	*/
	public long getFaqId() {
		return _faq.getFaqId();
	}

	/**
	* Sets the faq ID of this f a q.
	*
	* @param faqId the faq ID of this f a q
	*/
	public void setFaqId(long faqId) {
		_faq.setFaqId(faqId);
	}

	/**
	* Returns the question of this f a q.
	*
	* @return the question of this f a q
	*/
	public java.lang.String getQuestion() {
		return _faq.getQuestion();
	}

	/**
	* Sets the question of this f a q.
	*
	* @param question the question of this f a q
	*/
	public void setQuestion(java.lang.String question) {
		_faq.setQuestion(question);
	}

	/**
	* Returns the answer of this f a q.
	*
	* @return the answer of this f a q
	*/
	public java.lang.String getAnswer() {
		return _faq.getAnswer();
	}

	/**
	* Sets the answer of this f a q.
	*
	* @param answer the answer of this f a q
	*/
	public void setAnswer(java.lang.String answer) {
		_faq.setAnswer(answer);
	}

	public boolean isNew() {
		return _faq.isNew();
	}

	public void setNew(boolean n) {
		_faq.setNew(n);
	}

	public boolean isCachedModel() {
		return _faq.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_faq.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _faq.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _faq.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_faq.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _faq.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_faq.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FAQWrapper((FAQ)_faq.clone());
	}

	public int compareTo(com.felixchristy.service.model.FAQ faq) {
		return _faq.compareTo(faq);
	}

	@Override
	public int hashCode() {
		return _faq.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.felixchristy.service.model.FAQ> toCacheModel() {
		return _faq.toCacheModel();
	}

	public com.felixchristy.service.model.FAQ toEscapedModel() {
		return new FAQWrapper(_faq.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _faq.toString();
	}

	public java.lang.String toXmlString() {
		return _faq.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_faq.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FAQ getWrappedFAQ() {
		return _faq;
	}

	public FAQ getWrappedModel() {
		return _faq;
	}

	public void resetOriginalValues() {
		_faq.resetOriginalValues();
	}

	private FAQ _faq;
}