package models;

public class ProjectMetrics {
  private double estimatedHours;
  private int temSize;
  private int completedTask;
  private int pendingTask;

  public ProjectMetrics(double estimatedHours, int temSize, int completedTask, int pendingTask) {
    this.estimatedHours = estimatedHours;
    this.temSize = temSize;
    this.completedTask = completedTask;
    this.pendingTask = pendingTask;
  }

  public double getEstimatedHours() {
    return estimatedHours;
  }

  public void setEstimatedHours(double estimatedHours) {
    this.estimatedHours = estimatedHours;
  }

  public int getTemSize() {
    return temSize;
  }

  public void setTemSize(int temSize) {
    this.temSize = temSize;
  }

  public int getCompletedTask() {
    return completedTask;
  }

  public void setCompletedTask(int completedTask) {
    this.completedTask = completedTask;
  }

  public int getPendingTask() {
    return pendingTask;
  }

  public void setPendingTask(int pendingTask) {
    this.pendingTask = pendingTask;
  }

  public double getWorkLoad() {
    return estimatedHours * temSize;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ProjectMetrics other = (ProjectMetrics) obj;
    if (pendingTask != other.pendingTask)
      return false;
    return true;
  }
}
