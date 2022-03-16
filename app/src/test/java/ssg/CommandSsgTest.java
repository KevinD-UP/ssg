package ssg;

import org.junit.jupiter.api.Test;
import picocli.CommandLine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Junit test class for CommandSsg.
 */
public class CommandSsgTest {

    /**
     * Tests if CommandSsg can be created properly.
     */
    @Test
    void createInstanceProperlyTest(){
        CommandSsg commandSsg = new CommandSsg();
        assertNotNull(commandSsg,
                "CommandSsg objet was created but got null object");
    }

    @Test
    void exitCodeOnSuccessTest(){
        CommandSsg commandSsg = new CommandSsg();
        int exitCode = new CommandLine(commandSsg).execute();
        assertEquals(0,exitCode,
                "CommandSsg should have suceeded but got non 0 exit code");
    }
}
