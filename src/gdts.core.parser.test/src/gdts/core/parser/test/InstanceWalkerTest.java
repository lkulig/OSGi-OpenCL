/**
 * Plik InstanceWalkerTest.java.
 * Autor: Maciej Milczarek
 * Utworzono Sep 19, 2011.
 */
package gdts.core.parser.test;

import gdts.core.parser.GDTSInstanceLexer;
import gdts.core.parser.GDTSInstanceParser;
import gdts.core.parser.InstanceWalker;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * InstanceWalkerTest
 *
 */
public class InstanceWalkerTest {

	private static GDTSInstanceParser parser1;
	private static CommonTree tree1;

	
	private static final String testFile1 = File.separator
			+ "gdts.core.parser.test" + File.separator
			+ "testInstance.inst";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		String basePath = System.getenv("GDTS_WS") != null ? System.getenv("GDTS_WS") : "c:\\projects\\eclipse_3.7_ws\\";
		
		ANTLRInputStream input1 = new ANTLRInputStream(
				new FileInputStream(basePath + File.separator
						+ testFile1), "UTF-8");
		GDTSInstanceLexer lexer1 = new GDTSInstanceLexer(input1);
		CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
		parser1 = new GDTSInstanceParser(tokens1);
		tree1 = (CommonTree) parser1.instance().getTree();
	}
	
	@Test
	public void test() {
		InstanceWalker walker = new InstanceWalker(tree1);
		walker.walk();
		
		System.out.println(walker.getTaskDescriptor());
		System.out.println(walker.getData());
	}
}
