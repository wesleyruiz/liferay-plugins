/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.asset.entry.set.model.impl;

import com.liferay.asset.entry.set.model.AssetEntrySetLike;
import com.liferay.asset.entry.set.model.AssetEntrySetLikeModel;
import com.liferay.asset.entry.set.model.AssetEntrySetLikeSoap;
import com.liferay.asset.entry.set.service.persistence.AssetEntrySetLikePK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AssetEntrySetLike service. Represents a row in the &quot;AssetEntrySetLike&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.asset.entry.set.model.AssetEntrySetLikeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetEntrySetLikeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntrySetLikeImpl
 * @see com.liferay.asset.entry.set.model.AssetEntrySetLike
 * @see com.liferay.asset.entry.set.model.AssetEntrySetLikeModel
 * @generated
 */
@JSON(strict = true)
public class AssetEntrySetLikeModelImpl extends BaseModelImpl<AssetEntrySetLike>
	implements AssetEntrySetLikeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset entry set like model instance should use the {@link com.liferay.asset.entry.set.model.AssetEntrySetLike} interface instead.
	 */
	public static final String TABLE_NAME = "AssetEntrySetLike";
	public static final Object[][] TABLE_COLUMNS = {
			{ "assetEntrySetId", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table AssetEntrySetLike (assetEntrySetId LONG not null,classNameId LONG not null,classPK LONG not null,primary key (assetEntrySetId, classNameId, classPK))";
	public static final String TABLE_SQL_DROP = "drop table AssetEntrySetLike";
	public static final String ORDER_BY_JPQL = " ORDER BY assetEntrySetLike.id.assetEntrySetId ASC, assetEntrySetLike.id.classNameId ASC, assetEntrySetLike.id.classPK ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AssetEntrySetLike.assetEntrySetId ASC, AssetEntrySetLike.classNameId ASC, AssetEntrySetLike.classPK ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.asset.entry.set.model.AssetEntrySetLike"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.asset.entry.set.model.AssetEntrySetLike"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.asset.entry.set.model.AssetEntrySetLike"),
			true);
	public static long ASSETENTRYSETID_COLUMN_BITMASK = 1L;
	public static long CLASSNAMEID_COLUMN_BITMASK = 2L;
	public static long CLASSPK_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AssetEntrySetLike toModel(AssetEntrySetLikeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AssetEntrySetLike model = new AssetEntrySetLikeImpl();

		model.setAssetEntrySetId(soapModel.getAssetEntrySetId());
		model.setClassNameId(soapModel.getClassNameId());
		model.setClassPK(soapModel.getClassPK());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AssetEntrySetLike> toModels(
		AssetEntrySetLikeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AssetEntrySetLike> models = new ArrayList<AssetEntrySetLike>(soapModels.length);

		for (AssetEntrySetLikeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.asset.entry.set.model.AssetEntrySetLike"));

	public AssetEntrySetLikeModelImpl() {
	}

	@Override
	public AssetEntrySetLikePK getPrimaryKey() {
		return new AssetEntrySetLikePK(_assetEntrySetId, _classNameId, _classPK);
	}

	@Override
	public void setPrimaryKey(AssetEntrySetLikePK primaryKey) {
		setAssetEntrySetId(primaryKey.assetEntrySetId);
		setClassNameId(primaryKey.classNameId);
		setClassPK(primaryKey.classPK);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new AssetEntrySetLikePK(_assetEntrySetId, _classNameId, _classPK);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((AssetEntrySetLikePK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return AssetEntrySetLike.class;
	}

	@Override
	public String getModelClassName() {
		return AssetEntrySetLike.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetEntrySetId", getAssetEntrySetId());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetEntrySetId = (Long)attributes.get("assetEntrySetId");

		if (assetEntrySetId != null) {
			setAssetEntrySetId(assetEntrySetId);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}
	}

	@JSON
	@Override
	public long getAssetEntrySetId() {
		return _assetEntrySetId;
	}

	@Override
	public void setAssetEntrySetId(long assetEntrySetId) {
		_columnBitmask |= ASSETENTRYSETID_COLUMN_BITMASK;

		if (!_setOriginalAssetEntrySetId) {
			_setOriginalAssetEntrySetId = true;

			_originalAssetEntrySetId = _assetEntrySetId;
		}

		_assetEntrySetId = assetEntrySetId;
	}

	public long getOriginalAssetEntrySetId() {
		return _originalAssetEntrySetId;
	}

	@Override
	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	@Override
	public void setClassName(String className) {
		long classNameId = 0;

		if (Validator.isNotNull(className)) {
			classNameId = PortalUtil.getClassNameId(className);
		}

		setClassNameId(classNameId);
	}

	@JSON
	@Override
	public long getClassNameId() {
		return _classNameId;
	}

	@Override
	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	@JSON
	@Override
	public long getClassPK() {
		return _classPK;
	}

	@Override
	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public AssetEntrySetLike toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssetEntrySetLike)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssetEntrySetLikeImpl assetEntrySetLikeImpl = new AssetEntrySetLikeImpl();

		assetEntrySetLikeImpl.setAssetEntrySetId(getAssetEntrySetId());
		assetEntrySetLikeImpl.setClassNameId(getClassNameId());
		assetEntrySetLikeImpl.setClassPK(getClassPK());

		assetEntrySetLikeImpl.resetOriginalValues();

		return assetEntrySetLikeImpl;
	}

	@Override
	public int compareTo(AssetEntrySetLike assetEntrySetLike) {
		AssetEntrySetLikePK primaryKey = assetEntrySetLike.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetEntrySetLike)) {
			return false;
		}

		AssetEntrySetLike assetEntrySetLike = (AssetEntrySetLike)obj;

		AssetEntrySetLikePK primaryKey = assetEntrySetLike.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		AssetEntrySetLikeModelImpl assetEntrySetLikeModelImpl = this;

		assetEntrySetLikeModelImpl._originalAssetEntrySetId = assetEntrySetLikeModelImpl._assetEntrySetId;

		assetEntrySetLikeModelImpl._setOriginalAssetEntrySetId = false;

		assetEntrySetLikeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AssetEntrySetLike> toCacheModel() {
		AssetEntrySetLikeCacheModel assetEntrySetLikeCacheModel = new AssetEntrySetLikeCacheModel();

		assetEntrySetLikeCacheModel.assetEntrySetId = getAssetEntrySetId();

		assetEntrySetLikeCacheModel.classNameId = getClassNameId();

		assetEntrySetLikeCacheModel.classPK = getClassPK();

		return assetEntrySetLikeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{assetEntrySetId=");
		sb.append(getAssetEntrySetId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.asset.entry.set.model.AssetEntrySetLike");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetEntrySetId</column-name><column-value><![CDATA[");
		sb.append(getAssetEntrySetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = AssetEntrySetLike.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			AssetEntrySetLike.class
		};
	private long _assetEntrySetId;
	private long _originalAssetEntrySetId;
	private boolean _setOriginalAssetEntrySetId;
	private long _classNameId;
	private long _classPK;
	private long _columnBitmask;
	private AssetEntrySetLike _escapedModel;
}