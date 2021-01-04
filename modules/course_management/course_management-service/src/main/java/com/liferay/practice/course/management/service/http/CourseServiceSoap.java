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

package com.liferay.practice.course.management.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.practice.course.management.service.CourseServiceUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * <code>CourseServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.practice.course.management.model.CourseSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.practice.course.management.model.Course</code>, that is translated to a
 * <code>com.liferay.practice.course.management.model.CourseSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseServiceHttp
 * @generated
 */
public class CourseServiceSoap {

	public static com.liferay.practice.course.management.model.CourseSoap
			addCourse(
				long groupId, String[] courseNameMapLanguageIds,
				String[] courseNameMapValues,
				String[] descriptionMapLanguageIds,
				String[] descriptionMapValues, String[] lecturerMapLanguageIds,
				String[] lecturerMapValues, Long duration, int courseStatus,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> courseNameMap =
				LocalizationUtil.getLocalizationMap(
					courseNameMapLanguageIds, courseNameMapValues);
			Map<Locale, String> descriptionMap =
				LocalizationUtil.getLocalizationMap(
					descriptionMapLanguageIds, descriptionMapValues);
			Map<Locale, String> lecturerMap =
				LocalizationUtil.getLocalizationMap(
					lecturerMapLanguageIds, lecturerMapValues);

			com.liferay.practice.course.management.model.Course returnValue =
				CourseServiceUtil.addCourse(
					groupId, courseNameMap, descriptionMap, lecturerMap,
					duration, courseStatus, serviceContext);

			return com.liferay.practice.course.management.model.CourseSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.practice.course.management.model.CourseSoap
			deleteCourse(long courseId)
		throws RemoteException {

		try {
			com.liferay.practice.course.management.model.Course returnValue =
				CourseServiceUtil.deleteCourse(courseId);

			return com.liferay.practice.course.management.model.CourseSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.practice.course.management.model.CourseSoap
			getCourse(long courseId)
		throws RemoteException {

		try {
			com.liferay.practice.course.management.model.Course returnValue =
				CourseServiceUtil.getCourse(courseId);

			return com.liferay.practice.course.management.model.CourseSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.practice.course.management.model.CourseSoap[]
			getCoursesByGroupId(long groupId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.practice.course.management.model.Course>
				returnValue = CourseServiceUtil.getCoursesByGroupId(groupId);

			return com.liferay.practice.course.management.model.CourseSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.practice.course.management.model.CourseSoap[]
			getCoursesByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.practice.course.management.model.Course>
						orderByComparator)
		throws RemoteException {

		try {
			java.util.List<com.liferay.practice.course.management.model.Course>
				returnValue = CourseServiceUtil.getCoursesByKeywords(
					groupId, keywords, start, end, orderByComparator);

			return com.liferay.practice.course.management.model.CourseSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long getCoursesCountByKeywords(long groupId, String keywords)
		throws RemoteException {

		try {
			long returnValue = CourseServiceUtil.getCoursesCountByKeywords(
				groupId, keywords);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.practice.course.management.model.CourseSoap
			updateCourse(
				long courseId, String[] courseNameMapLanguageIds,
				String[] courseNameMapValues,
				String[] descriptionMapLanguageIds,
				String[] descriptionMapValues, String[] lecturerMapLanguageIds,
				String[] lecturerMapValues, Long duration, int courseStatus,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			Map<Locale, String> courseNameMap =
				LocalizationUtil.getLocalizationMap(
					courseNameMapLanguageIds, courseNameMapValues);
			Map<Locale, String> descriptionMap =
				LocalizationUtil.getLocalizationMap(
					descriptionMapLanguageIds, descriptionMapValues);
			Map<Locale, String> lecturerMap =
				LocalizationUtil.getLocalizationMap(
					lecturerMapLanguageIds, lecturerMapValues);

			com.liferay.practice.course.management.model.Course returnValue =
				CourseServiceUtil.updateCourse(
					courseId, courseNameMap, descriptionMap, lecturerMap,
					duration, courseStatus, serviceContext);

			return com.liferay.practice.course.management.model.CourseSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static Long[] getListCourseByUserId(long userId)
		throws RemoteException {

		try {
			java.util.List<Long> returnValue =
				CourseServiceUtil.getListCourseByUserId(userId);

			return returnValue.toArray(new Long[returnValue.size()]);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CourseServiceSoap.class);

}