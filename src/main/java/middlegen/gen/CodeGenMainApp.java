package middlegen.gen;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

/**
 * Hello world!
 *
 */
public class CodeGenMainApp
{
    public static void main( String[] args )
    {
        File buildFile = new File(CodeGenMainApp.class.getClassLoader().getResource("").getPath() + "/gen-build.xml");
        Project p = new Project();
        //添加日志输出
        DefaultLogger consoleLogger = new DefaultLogger();
        consoleLogger.setErrorPrintStream(System.err);
        consoleLogger.setOutputPrintStream(System.out);
        //输出信息级别
        //consoleLogger.setMessageOutputLevel(level);
        p.addBuildListener(consoleLogger);
        try {
            p.fireBuildStarted();
            p.init();
            ProjectHelper helper = ProjectHelper.getProjectHelper();
            helper.parse(p, buildFile);
            p.executeTarget("gen-hbm");
            p.fireBuildFinished(null);
        } catch (BuildException e) {
            p.fireBuildFinished(e);
        }
    }
}
