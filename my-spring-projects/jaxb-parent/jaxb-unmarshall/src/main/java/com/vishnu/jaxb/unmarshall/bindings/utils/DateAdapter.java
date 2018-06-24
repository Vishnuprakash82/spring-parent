package com.vishnu.jaxb.unmarshall.bindings.utils;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;

public class DateAdapter {

	private static DateTimeFormatter parser = dateParser();
	private static DateTimeFormatter formatter = dateFormatter();

	public static String marshallDate(final LocalDate v) {
		if (v == null) {
			return null;
		}
		return formatter.print(v);
	}

	public static LocalDate unmarshallDate(final String v) {
		if (v == null) {
			return null;
		}
		return parser.parseLocalDate(v);
	}

	public static DateTime unmarshallDateTime(final String v) {
		if (v == null) {
			return null;
		}
		return new DateTime(v);
	}

	public static String marshallDateTime(final DateTime v) {
		if (v == null) {
			return null;
		}
		return v.toString();
	}

	private static DateTimeFormatter dateFormatter() {
		final DateTimeFormatter offsetFormatter = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4)
				.toFormatter();
		final DateTimeFormatter tOffset = new DateTimeFormatterBuilder().append(offsetFormatter).toFormatter();
		return new DateTimeFormatterBuilder().append(DateTimeFormat.forPattern("yyyy-MM-dd")).append(tOffset)
				.toFormatter();
	}

	private static DateTimeFormatter dateParser() {
		final DateTimeFormatter offsetFormatter = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4)
				.toFormatter();
		final DateTimeParser tOffset = new DateTimeFormatterBuilder().append(offsetFormatter).toParser();
		return new DateTimeFormatterBuilder().append(DateTimeFormat.forPattern("yyyy-MM-dd")).appendOptional(tOffset)
				.toFormatter();
	}
}
