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

package com.felixchristy.service.model.impl;

import com.felixchristy.service.model.FAQ;
import com.felixchristy.service.model.FAQModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FAQ service. Represents a row in the &quot;FAQ_FAQ&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.felixchristy.service.model.FAQModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQImpl
 * @see com.felixchristy.service.model.FAQ
 * @see com.felixchristy.service.model.FAQModel
 * @generated
 */
public class FAQModelImpl extends BaseModelImpl<FAQ> implements FAQModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a f a q model instance should use the {@link com.felixchristy.service.model.FAQ} interface instead.
	 */
	public static final String TABLE_NAME = "FAQ_FAQ";
	public static final Object[][] TABLE_COLUMNS = {
			{ "faqId", Types.BIGINT },
			{ "question", Types.VARCHAR },
			{ "answer", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table FAQ_FAQ (faqId LONG not null primary key,question VARCHAR(75) null,answer VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table FAQ_FAQ";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.felixchristy.service.model.FAQ"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.felixchristy.service.model.FAQ"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.felixchristy.service.model.FAQ"));

	public FAQModelImpl() {
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

	public Class<?> getModelClass() {
		return FAQ.class;
	}

	public String getModelClassName() {
		return FAQ.class.getName();
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
		if (_question == null) {
			return StringPool.BLANK;
		}
		else {
			return _question;
		}
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public String getAnswer() {
		if (_answer == null) {
			return StringPool.BLANK;
		}
		else {
			return _answer;
		}
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			FAQ.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FAQ toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (FAQ)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		FAQImpl faqImpl = new FAQImpl();

		faqImpl.setFaqId(getFaqId());
		faqImpl.setQuestion(getQuestion());
		faqImpl.setAnswer(getAnswer());

		faqImpl.resetOriginalValues();

		return faqImpl;
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

		FAQ faq = null;

		try {
			faq = (FAQ)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<FAQ> toCacheModel() {
		FAQCacheModel faqCacheModel = new FAQCacheModel();

		faqCacheModel.faqId = getFaqId();

		faqCacheModel.question = getQuestion();

		String question = faqCacheModel.question;

		if ((question != null) && (question.length() == 0)) {
			faqCacheModel.question = null;
		}

		faqCacheModel.answer = getAnswer();

		String answer = faqCacheModel.answer;

		if ((answer != null) && (answer.length() == 0)) {
			faqCacheModel.answer = null;
		}

		return faqCacheModel;
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

	private static ClassLoader _classLoader = FAQ.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			FAQ.class
		};
	private long _faqId;
	private String _question;
	private String _answer;
	private FAQ _escapedModelProxy;
}