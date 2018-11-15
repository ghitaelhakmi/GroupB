package org.mql.platform.dao.preregistration;


import java.util.List;

import org.mql.platform.models.preregistration.Candidate;

/**
 * @author abdelaliboumaiz
 */
public interface CandidateDomParser {

  List<Candidate> loadData();

  void addCandidate(Candidate candidate);

  boolean updateCandidate(Candidate candidate);
}
