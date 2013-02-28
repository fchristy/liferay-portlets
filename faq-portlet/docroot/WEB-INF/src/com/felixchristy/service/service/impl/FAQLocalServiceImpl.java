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

package com.felixchristy.service.service.impl;

import com.felixchristy.service.model.FAQ;
import com.felixchristy.service.service.base.FAQLocalServiceBaseImpl;
import com.felixchristy.service.service.persistence.FAQUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the f a q local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.felixchristy.service.service.FAQLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.felixchristy.service.service.base.FAQLocalServiceBaseImpl
 * @see com.felixchristy.service.service.FAQLocalServiceUtil
 */
public class FAQLocalServiceImpl extends FAQLocalServiceBaseImpl {
	public FAQ addFAQ(String question, String answer) throws SystemException {
		FAQ faq = FAQUtil.create(CounterLocalServiceUtil.increment());
		faq.setQuestion(question);
		faq.setAnswer(answer);
		return FAQUtil.update(faq, true);
	}
}