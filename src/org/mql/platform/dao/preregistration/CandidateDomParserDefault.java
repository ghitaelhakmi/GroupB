package org.mql.platform.dao.preregistration;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Vector;
import org.mql.platform.models.preregistration.*;
import org.mql.platform.tools.preregistration.XMLNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Service;

/*
 *  DOM parser with :
 *  add method for adding a new candidate to the xml file
 *  update method for updating and saving candidate to the xml file
 *
 *  N.B : The path must be specified as a VM argument(named xmlPath)
 *
 *  @author OussamaElrh
 */
@Service
public class CandidateDomParserDefault implements CandidateDomParser {

  private List<Candidate> candidates;

  @Autowired
  private ConfigurableEnvironment conf;

  private String path;

  public CandidateDomParserDefault() {
  }

  public void addCandidate(Candidate candidate) {
    boolean exists = false;
    for (Candidate cand : candidates) {
      exists = candidate.getCin().equals(cand.getCin());
    }
    if (!exists) {
      candidates.add(candidate);
      saveCandidats();
    }
  }

  public boolean updateCandidate(Candidate can) {
    for (Candidate candidate : candidates) {
      if (candidate.getCin().equals(can.getCin())) {
        candidates.remove(candidate);
        candidates.add(can);
        saveCandidats();
        return true;
      }
    }
    return false;
  }

  // TODO: try JAX-B
  public List<Candidate> loadData() {
    path = conf.getProperty("filePath");
    candidates = new Vector<>();
    XMLNode root = new XMLNode(path);
    Vector<XMLNode> list = root.getChildren();
    for (XMLNode a : list) {
      Candidate candidate = new Candidate();
      candidates.add(candidate);
      candidate.setCin(a.getChild("cin").getValue());
      candidate.setCne(a.getChild("cne").getIntValue());
      candidate.setLastName(a.getChild("lastName").getValue());
      candidate.setFirstName(a.getChild("firstName").getValue());
      candidate.setYearOfBirth(a.getChild("age").getIntValue());
      candidate.setSituation(a.getChild("situation").getValue());
      candidate.setCity(a.getChild("city").getValue());
      candidate.setGender(a.getChild("gender").getValue());
      candidate.setHandicap(a.getChild("gender").getBooleanValue());
      /*****************/
      XMLNode dips = a.getChild("diplomas");
      Vector<XMLNode> listDip = dips.getChildren();

      Vector<Diploma> diplomas = new Vector<>();
      for (XMLNode b : listDip) {
        Diploma diploma = new Diploma();
        diplomas.add(diploma);

        diploma.setTitle(b.getChild("title").getValue());
        diploma.setUniversity(b.getChild("univercity").getValue());
        diploma.setCollege(b.getChild("college").getValue());
        diploma.setSpeciality(b.getChild("speciality").getValue());
        diploma.setDistrict(b.getChild("district").getValue());
        diploma.setYear(b.getIntAttribute("year"));
        diploma.setCoef(b.getIntAttribute("coef"));
//        diploma.setMention(b.getChild("mention").getValue());
        diploma.setGrade(b.getChild("grade").getDoubleValue());
        diploma.setCity(b.getChild("city").getValue());
        /*******************/
        XMLNode markks = b.getChild("marks");
        Vector<XMLNode> listMark = markks.getChildren();

        Vector<Mark> marks = new Vector<>();
        for (XMLNode c : listMark) {
          Mark mark = new Mark();
          marks.add(mark);

          mark.setSemester(c.getChild("semester").getValue());
          mark.setValue(c.getChild("value").getDoubleValue());
        }
        diploma.setMarks(marks);
      }
      candidate.setDiplomas(diplomas);
    }
    return candidates;
  }

  private void saveCandidats() {
    StringBuffer xml = new StringBuffer("<candidats>");
    for (Candidate candidate : candidates) {
      xml.append(candidate.toXml());
    }

    xml.append("</candidats>");
    // TODO: change to  File file = new File(path + File.separator + LocaDate.now().getYear());
    File file = new File(path);
    try {
      if (!file.exists()) {
        file.createNewFile();
      }
      PrintWriter writer = new PrintWriter(file);
      writer.print(xml.toString());
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
