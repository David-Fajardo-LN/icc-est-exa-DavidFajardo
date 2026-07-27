package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.SoftwareProject;

public class ProjectController {

  public Set<SoftwareProject> filtrerAndOrderProjects(List<SoftwareProject> softwares, double minimumWorkload) {
    Set<SoftwareProject> result = new TreeSet<>((one, two) -> {
      int comparacion = Double.compare(two.getMetrics().getWorkLoad(), one.getMetrics().getWorkLoad());
      if (comparacion == 0) {
        comparacion = one.getProjectCode().compareTo(two.getProjectCode());
      }
      return comparacion;
    });
    for (SoftwareProject p : softwares) {
      if (p.getMetrics().getWorkLoad() >= minimumWorkload) {
        result.add(p);
      }
    }
    return result;
  }

  public List<SoftwareProject> classifyAndExtractProjects(List<SoftwareProject> projects, String requestedCategory) {
    Map<String, List<SoftwareProject>> map = new LinkedHashMap<>();

    List<SoftwareProject> critical = new ArrayList<>();
    List<SoftwareProject> standard = new ArrayList<>();
    List<SoftwareProject> small = new ArrayList<>();
    map.put("CRITICAL", critical);
    map.put("STANDARD", standard);
    map.put("SMALL", small);

    for (SoftwareProject p : projects) {
      if (p.getMetrics().getWorkLoad() >= 900) {
        critical.add(p);
      }
      if (p.getMetrics().getWorkLoad() >= 350) {
        standard.add(p);
      } else {
        small.add(p);
      }
    }

    return map.get(requestedCategory);
  }
}
