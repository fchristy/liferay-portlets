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

import com.felixchristy.service.NoSuchFAQException;
import com.felixchristy.service.model.FAQ;
import com.felixchristy.service.model.impl.FAQImpl;
import com.felixchristy.service.model.impl.FAQModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the f a q service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQPersistence
 * @see FAQUtil
 * @generated
 */
public class FAQPersistenceImpl extends BasePersistenceImpl<FAQ>
	implements FAQPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FAQUtil} to access the f a q persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FAQImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FAQModelImpl.ENTITY_CACHE_ENABLED,
			FAQModelImpl.FINDER_CACHE_ENABLED, FAQImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FAQModelImpl.ENTITY_CACHE_ENABLED,
			FAQModelImpl.FINDER_CACHE_ENABLED, FAQImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQModelImpl.ENTITY_CACHE_ENABLED,
			FAQModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the f a q in the entity cache if it is enabled.
	 *
	 * @param faq the f a q
	 */
	public void cacheResult(FAQ faq) {
		EntityCacheUtil.putResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
			FAQImpl.class, faq.getPrimaryKey(), faq);

		faq.resetOriginalValues();
	}

	/**
	 * Caches the f a qs in the entity cache if it is enabled.
	 *
	 * @param faqs the f a qs
	 */
	public void cacheResult(List<FAQ> faqs) {
		for (FAQ faq : faqs) {
			if (EntityCacheUtil.getResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
						FAQImpl.class, faq.getPrimaryKey()) == null) {
				cacheResult(faq);
			}
			else {
				faq.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all f a qs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FAQImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FAQImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the f a q.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FAQ faq) {
		EntityCacheUtil.removeResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
			FAQImpl.class, faq.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FAQ> faqs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FAQ faq : faqs) {
			EntityCacheUtil.removeResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
				FAQImpl.class, faq.getPrimaryKey());
		}
	}

	/**
	 * Creates a new f a q with the primary key. Does not add the f a q to the database.
	 *
	 * @param faqId the primary key for the new f a q
	 * @return the new f a q
	 */
	public FAQ create(long faqId) {
		FAQ faq = new FAQImpl();

		faq.setNew(true);
		faq.setPrimaryKey(faqId);

		return faq;
	}

	/**
	 * Removes the f a q with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param faqId the primary key of the f a q
	 * @return the f a q that was removed
	 * @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQ remove(long faqId) throws NoSuchFAQException, SystemException {
		return remove(Long.valueOf(faqId));
	}

	/**
	 * Removes the f a q with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q
	 * @return the f a q that was removed
	 * @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FAQ remove(Serializable primaryKey)
		throws NoSuchFAQException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FAQ faq = (FAQ)session.get(FAQImpl.class, primaryKey);

			if (faq == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFAQException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faq);
		}
		catch (NoSuchFAQException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FAQ removeImpl(FAQ faq) throws SystemException {
		faq = toUnwrappedModel(faq);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, faq);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(faq);

		return faq;
	}

	@Override
	public FAQ updateImpl(com.felixchristy.service.model.FAQ faq, boolean merge)
		throws SystemException {
		faq = toUnwrappedModel(faq);

		boolean isNew = faq.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, faq, merge);

			faq.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
			FAQImpl.class, faq.getPrimaryKey(), faq);

		return faq;
	}

	protected FAQ toUnwrappedModel(FAQ faq) {
		if (faq instanceof FAQImpl) {
			return faq;
		}

		FAQImpl faqImpl = new FAQImpl();

		faqImpl.setNew(faq.isNew());
		faqImpl.setPrimaryKey(faq.getPrimaryKey());

		faqImpl.setFaqId(faq.getFaqId());
		faqImpl.setQuestion(faq.getQuestion());
		faqImpl.setAnswer(faq.getAnswer());

		return faqImpl;
	}

	/**
	 * Returns the f a q with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q
	 * @return the f a q
	 * @throws com.liferay.portal.NoSuchModelException if a f a q with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FAQ findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the f a q with the primary key or throws a {@link com.felixchristy.service.NoSuchFAQException} if it could not be found.
	 *
	 * @param faqId the primary key of the f a q
	 * @return the f a q
	 * @throws com.felixchristy.service.NoSuchFAQException if a f a q with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQ findByPrimaryKey(long faqId)
		throws NoSuchFAQException, SystemException {
		FAQ faq = fetchByPrimaryKey(faqId);

		if (faq == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + faqId);
			}

			throw new NoSuchFAQException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				faqId);
		}

		return faq;
	}

	/**
	 * Returns the f a q with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q
	 * @return the f a q, or <code>null</code> if a f a q with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FAQ fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the f a q with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param faqId the primary key of the f a q
	 * @return the f a q, or <code>null</code> if a f a q with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQ fetchByPrimaryKey(long faqId) throws SystemException {
		FAQ faq = (FAQ)EntityCacheUtil.getResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
				FAQImpl.class, faqId);

		if (faq == _nullFAQ) {
			return null;
		}

		if (faq == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				faq = (FAQ)session.get(FAQImpl.class, Long.valueOf(faqId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (faq != null) {
					cacheResult(faq);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FAQModelImpl.ENTITY_CACHE_ENABLED,
						FAQImpl.class, faqId, _nullFAQ);
				}

				closeSession(session);
			}
		}

		return faq;
	}

	/**
	 * Returns all the f a qs.
	 *
	 * @return the f a qs
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQ> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FAQ> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<FAQ> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<FAQ> list = (List<FAQ>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FAQ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQ;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FAQ>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FAQ>)QueryUtil.list(q, getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the f a qs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FAQ faq : findAll()) {
			remove(faq);
		}
	}

	/**
	 * Returns the number of f a qs.
	 *
	 * @return the number of f a qs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAQ);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the f a q persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.felixchristy.service.model.FAQ")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FAQ>> listenersList = new ArrayList<ModelListener<FAQ>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FAQ>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FAQImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = FAQPersistence.class)
	protected FAQPersistence faqPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_FAQ = "SELECT faq FROM FAQ faq";
	private static final String _SQL_COUNT_FAQ = "SELECT COUNT(faq) FROM FAQ faq";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faq.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQ exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FAQPersistenceImpl.class);
	private static FAQ _nullFAQ = new FAQImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FAQ> toCacheModel() {
				return _nullFAQCacheModel;
			}
		};

	private static CacheModel<FAQ> _nullFAQCacheModel = new CacheModel<FAQ>() {
			public FAQ toEntityModel() {
				return _nullFAQ;
			}
		};
}