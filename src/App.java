import java.util.List;
import java.util.Set;

import controller.ProjectController;
import data.ProjectData;
import models.SoftwareProject;

public class App {
    public static void main(String[] args) throws Exception {

        List<SoftwareProject> projects = ProjectData.createProjects();
        ProjectController controller = new ProjectController();

        Set<SoftwareProject> ordered = controller.filtrerAndOrderProjects(projects, 500);
        List<SoftwareProject> critical = controller.classifyAndExtractProjects(projects, "CRITICAL");

        System.out.println("============= PROGRAMA =============");
        System.out.println("METODO A:" + ordered.size());
        System.out.println("Arreglo clasificado");
        for (SoftwareProject p : ordered) {
            System.out.println(p);
        }
        System.out.println();
        System.out.println();

        System.out.println("METODO B:" + critical.size());
        System.out.println("CRITICAL lista:");
        for (SoftwareProject p : critical) {
            System.out.println(p);
        }

    }
}
