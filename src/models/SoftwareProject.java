package models;

public class SoftwareProject {
  private String projectCode;
  private String projectName;
  private ProjectMetrics metrics;
  private int priority;

  public SoftwareProject(String projectCode, String projectName, ProjectMetrics metrics, int priority) {
    this.projectCode = projectCode;
    this.projectName = projectName;
    this.metrics = metrics;
    this.priority = priority;
  }

  public String getProjectCode() {
    return projectCode;
  }

  public void setProjectCode(String projectCode) {
    this.projectCode = projectCode;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ProjectMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(ProjectMetrics metrics) {
    this.metrics = metrics;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((projectCode == null) ? 0 : projectCode.hashCode());
    result = prime * result + ((metrics == null) ? 0 : metrics.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SoftwareProject other = (SoftwareProject) obj;
    if (projectCode == null) {
      if (other.projectCode != null)
        return false;
    } else if (!projectCode.equalsIgnoreCase(other.projectCode))
      return false;
    if (metrics == null) {
      if (other.metrics != null)
        return false;
    } else if (metrics.getWorkLoad() != other.metrics.getWorkLoad())
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "SoftwareProject [" + projectCode + "    " + projectName + "    " + priority + "    Carga de trabajo :"
        + metrics.getWorkLoad() + "]";
  }

}
