/**
 * This Java source file was generated by the Gradle 'init' task.
 */

package ssg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ssg.myapplicationrunner.MyApplicationRunner;

/**
 * Main class.
 */
@Generated
public final class App {

    /**
     * Logger.
     */
    private static final Logger logger = LogManager.getLogger();

    /**
     * Private constructor to make app a utility class.
     */
    private App() {}

    /**
     * Main.
     *
     * @param args main arguments.
     */
    public static void main(String[] args) {

        logger.info("Launch app");
        MyApplicationRunner applicationRunner = new MyApplicationRunner(args);
        applicationRunner.run();
    }
}