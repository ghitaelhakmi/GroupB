package org.mql.platform.dao;

import org.mql.platform.models.News;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface NewsRepository extends JpaRepository<News, Long> {

}
