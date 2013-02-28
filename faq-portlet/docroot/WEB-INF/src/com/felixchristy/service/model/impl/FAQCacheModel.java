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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing FAQ in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FAQ
 * @generated
 */
public class FAQCacheModel implements CacheModel<FAQ>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{faqId=");
		sb.append(faqId);
		sb.append(", question=");
		sb.append(question);
		sb.append(", answer=");
		sb.append(answer);
		sb.append("}");

		return sb.toString();
	}

	public FAQ toEntityModel() {
		FAQImpl faqImpl = new FAQImpl();

		faqImpl.setFaqId(faqId);

		if (question == null) {
			faqImpl.setQuestion(StringPool.BLANK);
		}
		else {
			faqImpl.setQuestion(question);
		}

		if (answer == null) {
			faqImpl.setAnswer(StringPool.BLANK);
		}
		else {
			faqImpl.setAnswer(answer);
		}

		faqImpl.resetOriginalValues();

		return faqImpl;
	}

	public long faqId;
	public String question;
	public String answer;
}