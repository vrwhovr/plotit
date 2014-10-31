package com.vr.plotit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Description:
 * <p/>
 * Compilation: {@code javac TextDependencyParser.java}
 * <p/>
 * Execution: {@code java TextDependencyParser}
 * <p/>
 * Dependencies:
 * <p/>
 * {@author Vijay Ananth}
 * <p/>
 * Email: vijay.hassan@gmail.com
 * <p/>
 * Date: 31/10/14
 */
public class TextDependencyParser implements DependencyParser{
    private  Graph dep;

    public TextDependencyParser(String filename) {

        List<String> lines = getLines(filename);
        dep = new DependencyGraph(lines.size());
        prepareDepencyGraph(lines);
    }

    public TextDependencyParser(Graph dep) {
        this.dep = dep;
    }

    @Override
    public Graph parse() {
        return dep;
    }

    public List<String> getLines(String fileName) {
        List<String> lines = new ArrayList<String>();


        try {
            Scanner scanner  = new Scanner(new FileInputStream(fileName));
            while(scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private final void prepareDepencyGraph(List<String> lines) {
        for (String dependency: lines) {
            StringTokenizer tokenizer = new StringTokenizer(dependency, ":");
            String sourceVertex = tokenizer.nextToken();

            if (!tokenizer.hasMoreElements()) break;

            String targetVerteces = tokenizer.nextToken();
            StringTokenizer targets = new StringTokenizer(targetVerteces, ",");

            while (targets.hasMoreElements()) {
                String target = targets.nextToken();
                dep.addEdge(sourceVertex, target);
                //System.out.println(sourceVertex +" --> " + target) ;
            }
        }
    }
}
