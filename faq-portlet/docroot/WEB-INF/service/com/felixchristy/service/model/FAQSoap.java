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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Brian Wing Shun Chan
 * @generated
 */
public class FAQSoap implements Serializable {
	public static FAQSoap toSoapModel(FAQ model) {
		FAQSoap soapModel = new FAQSoap();

		soapModel.setFaqId(model.getFaqId());
		soapModel.setQuestion(model.getQuestion());
		soapModel.setAnswer(model.getAnswer());

		return soapModel;
	}

	public static FAQSoap[] toSoapModels(FAQ[] models) {
		FAQSoap[] soapModels = new FAQSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FAQSoap[][] toSoapModels(FAQ[][] models) {
		FAQSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FAQSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FAQSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FAQSoap[] toSoapModels(List<FAQ> models) {
		List<FAQSoap> soapModels = new ArrayList<FAQSoap>(models.size());

		for (FAQ model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FAQSoap[soapModels.size()]);
	}

	public FAQSoap() {
	}

	public long getPrimaryKey() {
		return _faqId;
	}

	public void setPrimaryKey(long pk) {
		setFaqId(pk);
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

	private long _faqId;
	private String _question;
	private String _answer;
}