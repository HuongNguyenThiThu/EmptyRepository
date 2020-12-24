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

package com.liferay.practice.course.management.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Course service. Represents a row in the
 * &quot;CourseManagement_Course&quot; database table, with each column mapped
 * to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation
 * <code>com.liferay.practice.course.management.model.impl.CourseModelImpl</code>
 * exist only as a container for the default property accessors generated by
 * ServiceBuilder. Helper methods and all application logic should be put in
 * <code>com.liferay.practice.course.management.model.impl.CourseImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Course
 * @generated
 */
@ProviderType
public interface CourseModel extends BaseModel<Course>, GroupedModel, LocalizedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a
	 * course model instance should use the {@link Course} interface instead.
	 */

	/**
	 * Returns the primary key of this course.
	 *
	 * @return the primary key of this course
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this course.
	 *
	 * @param primaryKey the primary key of this course
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the course ID of this course.
	 *
	 * @return the course ID of this course
	 */
	public long getCourseId();

	/**
	 * Sets the course ID of this course.
	 *
	 * @param courseId the course ID of this course
	 */
	public void setCourseId(long courseId);

	/**
	 * Returns the group ID of this course.
	 *
	 * @return the group ID of this course
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this course.
	 *
	 * @param groupId the group ID of this course
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this course.
	 *
	 * @return the company ID of this course
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this course.
	 *
	 * @param companyId the company ID of this course
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this course.
	 *
	 * @return the user ID of this course
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this course.
	 *
	 * @param userId the user ID of this course
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this course.
	 *
	 * @return the user uuid of this course
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this course.
	 *
	 * @param userUuid the user uuid of this course
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this course.
	 *
	 * @return the user name of this course
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this course.
	 *
	 * @param userName the user name of this course
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this course.
	 *
	 * @return the create date of this course
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this course.
	 *
	 * @param createDate the create date of this course
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this course.
	 *
	 * @return the modified date of this course
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this course.
	 *
	 * @param modifiedDate the modified date of this course
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the course name of this course.
	 *
	 * @return the course name of this course
	 */
	public String getCourseName();

	/**
	 * Returns the localized course name of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized course name of this course
	 */
	@AutoEscape
	public String getCourseName(Locale locale);

	/**
	 * Returns the localized course name of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param locale     the local of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized course name of this course. If <code>useDefault</code>
	 *         is <code>false</code> and no localization exists for the requested
	 *         language, an empty string will be returned.
	 */
	@AutoEscape
	public String getCourseName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized course name of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized course name of this course
	 */
	@AutoEscape
	public String getCourseName(String languageId);

	/**
	 * Returns the localized course name of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized course name of this course
	 */
	@AutoEscape
	public String getCourseName(String languageId, boolean useDefault);

	@AutoEscape
	public String getCourseNameCurrentLanguageId();

	@AutoEscape
	public String getCourseNameCurrentValue();

	/**
	 * Returns a map of the locales and localized course names of this course.
	 *
	 * @return the locales and localized course names of this course
	 */
	public Map<Locale, String> getCourseNameMap();

	/**
	 * Sets the course name of this course.
	 *
	 * @param courseName the course name of this course
	 */
	public void setCourseName(String courseName);

	/**
	 * Sets the localized course name of this course in the language.
	 *
	 * @param courseName the localized course name of this course
	 * @param locale     the locale of the language
	 */
	public void setCourseName(String courseName, Locale locale);

	/**
	 * Sets the localized course name of this course in the language, and sets the
	 * default locale.
	 *
	 * @param courseName    the localized course name of this course
	 * @param locale        the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setCourseName(String courseName, Locale locale, Locale defaultLocale);

	public void setCourseNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized course names of this course from the map of locales and
	 * localized course names.
	 *
	 * @param courseNameMap the locales and localized course names of this course
	 */
	public void setCourseNameMap(Map<Locale, String> courseNameMap);

	/**
	 * Sets the localized course names of this course from the map of locales and
	 * localized course names, and sets the default locale.
	 *
	 * @param courseNameMap the locales and localized course names of this course
	 * @param defaultLocale the default locale
	 */
	public void setCourseNameMap(Map<Locale, String> courseNameMap, Locale defaultLocale);

	/**
	 * Returns the lecturer of this course.
	 *
	 * @return the lecturer of this course
	 */
	public String getLecturer();

	/**
	 * Returns the localized lecturer of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized lecturer of this course
	 */
	@AutoEscape
	public String getLecturer(Locale locale);

	/**
	 * Returns the localized lecturer of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param locale     the local of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized lecturer of this course. If <code>useDefault</code> is
	 *         <code>false</code> and no localization exists for the requested
	 *         language, an empty string will be returned.
	 */
	@AutoEscape
	public String getLecturer(Locale locale, boolean useDefault);

	/**
	 * Returns the localized lecturer of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized lecturer of this course
	 */
	@AutoEscape
	public String getLecturer(String languageId);

	/**
	 * Returns the localized lecturer of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized lecturer of this course
	 */
	@AutoEscape
	public String getLecturer(String languageId, boolean useDefault);

	@AutoEscape
	public String getLecturerCurrentLanguageId();

	@AutoEscape
	public String getLecturerCurrentValue();

	/**
	 * Returns a map of the locales and localized lecturers of this course.
	 *
	 * @return the locales and localized lecturers of this course
	 */
	public Map<Locale, String> getLecturerMap();

	/**
	 * Sets the lecturer of this course.
	 *
	 * @param lecturer the lecturer of this course
	 */
	public void setLecturer(String lecturer);

	/**
	 * Sets the localized lecturer of this course in the language.
	 *
	 * @param lecturer the localized lecturer of this course
	 * @param locale   the locale of the language
	 */
	public void setLecturer(String lecturer, Locale locale);

	/**
	 * Sets the localized lecturer of this course in the language, and sets the
	 * default locale.
	 *
	 * @param lecturer      the localized lecturer of this course
	 * @param locale        the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setLecturer(String lecturer, Locale locale, Locale defaultLocale);

	public void setLecturerCurrentLanguageId(String languageId);

	/**
	 * Sets the localized lecturers of this course from the map of locales and
	 * localized lecturers.
	 *
	 * @param lecturerMap the locales and localized lecturers of this course
	 */
	public void setLecturerMap(Map<Locale, String> lecturerMap);

	/**
	 * Sets the localized lecturers of this course from the map of locales and
	 * localized lecturers, and sets the default locale.
	 *
	 * @param lecturerMap   the locales and localized lecturers of this course
	 * @param defaultLocale the default locale
	 */
	public void setLecturerMap(Map<Locale, String> lecturerMap, Locale defaultLocale);

	/**
	 * Returns the description of this course.
	 *
	 * @return the description of this course
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this course
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param locale     the local of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized description of this course. If <code>useDefault</code>
	 *         is <code>false</code> and no localization exists for the requested
	 *         language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this course
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized description of this course
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this course.
	 *
	 * @return the locales and localized descriptions of this course
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this course.
	 *
	 * @param description the description of this course
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this course in the language.
	 *
	 * @param description the localized description of this course
	 * @param locale      the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this course in the language, and sets the
	 * default locale.
	 *
	 * @param description   the localized description of this course
	 * @param locale        the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(String description, Locale locale, Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this course from the map of locales and
	 * localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this course
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this course from the map of locales and
	 * localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this course
	 * @param defaultLocale  the default locale
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap, Locale defaultLocale);

	/**
	 * Returns the duration of this course.
	 *
	 * @return the duration of this course
	 */
	public String getDuration();

	/**
	 * Returns the localized duration of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized duration of this course
	 */
	@AutoEscape
	public String getDuration(Locale locale);

	/**
	 * Returns the localized duration of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param locale     the local of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized duration of this course. If <code>useDefault</code> is
	 *         <code>false</code> and no localization exists for the requested
	 *         language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDuration(Locale locale, boolean useDefault);

	/**
	 * Returns the localized duration of this course in the language. Uses the
	 * default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized duration of this course
	 */
	@AutoEscape
	public String getDuration(String languageId);

	/**
	 * Returns the localized duration of this course in the language, optionally
	 * using the default language if no localization exists for the requested
	 * language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization
	 *                   exists for the requested language
	 * @return the localized duration of this course
	 */
	@AutoEscape
	public String getDuration(String languageId, boolean useDefault);

	@AutoEscape
	public String getDurationCurrentLanguageId();

	@AutoEscape
	public String getDurationCurrentValue();

	/**
	 * Returns a map of the locales and localized durations of this course.
	 *
	 * @return the locales and localized durations of this course
	 */
	public Map<Locale, String> getDurationMap();

	/**
	 * Sets the duration of this course.
	 *
	 * @param duration the duration of this course
	 */
	public void setDuration(String duration);

	/**
	 * Sets the localized duration of this course in the language.
	 *
	 * @param duration the localized duration of this course
	 * @param locale   the locale of the language
	 */
	public void setDuration(String duration, Locale locale);

	/**
	 * Sets the localized duration of this course in the language, and sets the
	 * default locale.
	 *
	 * @param duration      the localized duration of this course
	 * @param locale        the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDuration(String duration, Locale locale, Locale defaultLocale);

	public void setDurationCurrentLanguageId(String languageId);

	/**
	 * Sets the localized durations of this course from the map of locales and
	 * localized durations.
	 *
	 * @param durationMap the locales and localized durations of this course
	 */
	public void setDurationMap(Map<Locale, String> durationMap);

	/**
	 * Sets the localized durations of this course from the map of locales and
	 * localized durations, and sets the default locale.
	 *
	 * @param durationMap   the locales and localized durations of this course
	 * @param defaultLocale the default locale
	 */
	public void setDurationMap(Map<Locale, String> durationMap, Locale defaultLocale);

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale) throws LocaleException;

}