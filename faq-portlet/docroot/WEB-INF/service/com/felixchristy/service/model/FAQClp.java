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

import com.felixchristy.service.service.FAQLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class FAQClp extends BaseModelImpl<FAQ> implements FAQ {
	public FAQClp() {
	}

	public Class<?> getModelClass() {
		return FAQ.class;
	}

	public String getModelClassName() {
		return FAQ.class.getName();
	}

	public long getPrimaryKey() {
		return _faqId;
	}

	public void setPrimaryKey(long primaryKey) {
		setFaqId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_faqId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("faqId", getFaqId());
		attributes.put("question", getQuestion());
		attributes.put("answer", getAnswer());

		return attributes;
	}

	@Override
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

	public long getFaqId() {
		return _faqId;
	}

	public void setFaqId(long faqId) {
		_faqId = faqId;
	}

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public BaseModel<?> getFAQRemoteModel() {
		return _faqRemoteModel;
	}

	public void setFAQRemoteModel(BaseModel<?> faqRemoteModel) {
		_faqRemoteModel = faqRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FAQLocalServiceUtil.addFAQ(this);
		}
		else {
			FAQLocalServiceUtil.updateFAQ(this);
		}
	}

	@Override
	public FAQ toEscapedModel() {
		return (FAQ)Proxy.newProxyInstance(FAQ.class.getClassLoader(),
			new Class[] { FAQ.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FAQClp clone = new FAQClp();

		clone.setFaqId(getFaqId());
		clone.setQuestion(getQuestion());
		clone.setAnswer(getAnswer());

		return clone;
	}

	public int compareTo(FAQ faq) {
		long primaryKey = faq.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		FAQClp faq = null;

		try {
			faq = (FAQClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = faq.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{faqId=");
		sb.append(getFaqId());
		sb.append(", question=");
		sb.append(getQuestion());
		sb.append(", answer=");
		sb.append(getAnswer());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.felixchristy.service.model.FAQ");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>faqId</column-name><column-value><![CDATA[");
		sb.append(getFaqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>question</column-name><column-value><![CDATA[");
		sb.append(getQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answer</column-name><column-value><![CDATA[");
		sb.append(getAnswer());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _faqId;
	private String _question;
	private String _answer;
	private BaseModel<?> _faqRemoteModel;
}