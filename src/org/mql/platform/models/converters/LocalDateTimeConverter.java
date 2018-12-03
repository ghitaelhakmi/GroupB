package org.mql.platform.models.converters;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Converter that get's applied every time we save a {LocalDate} instance in our models
 *
 * @author mehdithe
 */
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Date> {

  @Override
  public Date convertToDatabaseColumn(LocalDateTime localDateTime) {
    return Date.valueOf(localDateTime.toLocalDate());
  }

  @Override
  public LocalDateTime convertToEntityAttribute(Date date) {
    return LocalDateTime.of(date.toLocalDate(), LocalTime.now());
  }
}
