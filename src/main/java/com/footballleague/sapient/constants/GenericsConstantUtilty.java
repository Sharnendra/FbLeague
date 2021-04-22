package com.footballleague.sapient.constants;

import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.footballleague.sapient.exception.RestTemplateResponseErrorHandler;

@Component
public class GenericsConstantUtilty {
	
	public static final RestTemplate REST_TEMPLATE =new RestTemplate();
	static
	{
		REST_TEMPLATE.setErrorHandler(new RestTemplateResponseErrorHandler());
	}
	
	public static final String REST_EXCEPTION_RESPONSE=" Returning Response : ";
	
	/**
	 * This method checks whether the source String is empty.
	 *
	 * @param source String
	 * @return true if source is empty, false if source is not empty.
	 */
	public static boolean isNullOrEmpty(String source) {

		return (null == source || "".equals(source.trim()));
	}

	/**
	 * This method checks whether the source Collection is empty.
	 *
	 * @param source Collection
	 * @return true if source Collection is empty, false if source Collection is not
	 *         empty.
	 */
	public static boolean isNullOrEmpty(Collection<?> source) {

		return (null == source || source.isEmpty());
	}

	/**
	 * This method checks whether the source Object is empty.
	 *
	 * @param source Object
	 * @return true if source is empty, false if source is not empty.
	 */
	public static boolean isNullOrEmpty(Object source) {

		return (null == source);
	}

	/**
	 * This method checks whether the source array is empty.
	 *
	 * @param source Object[]
	 * @return true if source array is empty, false if source array is not empty.
	 */
	public static boolean isNullOrEmpty(Object[] source) {

		return (null == source || source.length <= 0);
	}

	/**
	 * This method checks whether the source String is not empty.
	 *
	 * @param source String
	 * @return true if source is not empty, false if source is empty.
	 */
	public static boolean isNotEmpty(String source) {

		return !isNullOrEmpty(source);
	}

	/**
	 * This method checks whether the source Collection is not empty.
	 *
	 * @param source Collection
	 * @return true if source Collection is not empty, false if source Collection is
	 *         empty.
	 */
	public static boolean isNotEmpty(Collection<?> source) {

		return !isNullOrEmpty(source);
	}

	/**
	 * This method checks whether the source Object is not empty.
	 *
	 * @param source Object
	 * @return true if source is not empty, false if source is empty.
	 */
	public static boolean isNotEmpty(Object source) {

		return !isNullOrEmpty(source);
	}

	/**
	 * This method checks whether the source Object[] is not empty.
	 *
	 * @param source Object[]
	 * @return true if source array is not empty, false if source array is empty.
	 */
	public static boolean isNotEmpty(Object[] source) {

		return !isNullOrEmpty(source);
	}
}
