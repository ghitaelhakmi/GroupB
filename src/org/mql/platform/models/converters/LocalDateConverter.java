package org.mql.platform.models.converters;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Converter that get's applied every time we save a {LocalDate} instance in our models
 *
 * @author mehdithe
 */
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

  @Override
  public Date convertToDatabaseColumn(LocalDate date) {
    return date == null ? null : Date.valueOf(date);
  }

  @Override
  public LocalDate convertToEntityAttribute(Date date) {
    return date == null ? null : date.toLocalDate();
  }
}
