import com.vr.plotit.DependencyGraph;
import com.vr.plotit.Graph;
import com.vr.plotit.TextDependencyParser;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextDependencyParserTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void readDependencyFile() throws  Exception {
        TextDependencyParser parser = new TextDependencyParser("./src/main/resources/Test.dep");
        Graph g = parser.parse();
        assertNotNull(g);
    }

//    @Test
//    public void readDependencyFile() throws  Exception {
//        TextDependencyParser parser = new TextDependencyParser("Test.dep");
//        Graph g = parser.parse();
//        assertNotNull(g);
//    }

    @Test
    public void readDependencyGraph() throws  Exception {
        Graph g = new DependencyGraph(3);
        TextDependencyParser parser = new TextDependencyParser(g);
        Graph d = parser.parse();
        assertNotNull(d);
    }

}