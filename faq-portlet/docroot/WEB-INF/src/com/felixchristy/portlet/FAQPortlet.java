/**
 * 
 */
package com.felixchristy.portlet;

import com.felixchristy.service.model.FAQ;
import com.felixchristy.service.service.FAQLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author christf
 * 
 */
public class FAQPortlet extends MVCPortlet {
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		try {
			List<FAQ> faqs = FAQLocalServiceUtil.getFAQs(QueryUtil.ALL_POS,
					QueryUtil.ALL_POS);
			System.out.println(faqs.size());
			for (FAQ faq : faqs) {
				System.out.println(faq.getQuestion());
				System.out.println(faq.getAnswer());
			}
			FAQLocalServiceUtil.addFAQ("What is my name?", "Felix Christy");
		} catch (Exception e) {
			// intentionally empty
		}
		super.doView(renderRequest, renderResponse);
	}

}
