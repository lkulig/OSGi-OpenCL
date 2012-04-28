/**
 * Plik GDTSTaskParserTest.java.
 * Autor: Maciej Milczarek
 * Utworzono Aug 23, 2011.
 */
package gdts.core.parser.test;

import gdts.core.parser.GDTSLexer;
import gdts.core.parser.GDTSTaskParser;
import gdts.core.parser.VarWalker;
import gdts.core.parser.util.ParseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * GDTSTaskParserTest
 * 
 */
public class GDTSTaskParserTest {

	private static GDTSTaskParser parser1;
	private static CommonTree tree1;

	private static GDTSTaskParser parser2;
	private static CommonTree tree2;

	private static final String testFile1 = File.separator
			+ "gdts.core.parser.test" + File.separator
			+ "SimpleIntAddition-1.0.0.task";

	private static final String testFile2 = File.separator
			+ "gdts.core.parser.test" + File.separator
			+ "MatrixIntMultiplying-1.0.0.task";

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		String basePath = System.getenv("GDTS_WS") != null ? System.getenv("GDTS_WS") : "c:\\projects\\eclipse_3.7_ws\\";
		
		ANTLRInputStream input1 = new ANTLRInputStream(
				new FileInputStream(basePath + File.separator
						+ testFile1), "UTF-8");
		GDTSLexer lexer1 = new GDTSLexer(input1);
		CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
		parser1 = new GDTSTaskParser(tokens1);
		tree1 = (CommonTree) parser1.task().getTree();
		
		ANTLRInputStream input2 = new ANTLRInputStream(
				new FileInputStream(basePath + File.separator
						+ testFile2), "UTF-8");
		GDTSLexer lexer2 = new GDTSLexer(input2);
		CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
		parser2 = new GDTSTaskParser(tokens2);
		tree2 = (CommonTree) parser2.task().getTree();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		System.out.println(tree1.toStringTree());
		System.out.println(tree2.toStringTree());
		
		CommonTree taskInputTree1 = ParseUtil.getChildNodes(tree1, GDTSTaskParser.TASK_INPUT).get(0);
		CommonTree taskOutputTree1 = ParseUtil.getChildNodes(tree1, GDTSTaskParser.TASK_OUTPUT).get(0);
		CommonTree taskVarsTree1 = ParseUtil.getChildNodes(tree1, GDTSTaskParser.TASK_VARS).get(0);
		
		System.out.println(taskInputTree1.toStringTree());
		System.out.println(taskOutputTree1.toStringTree());
		System.out.println(taskVarsTree1.toStringTree());
		
		VarWalker varWalkerInput1 = new VarWalker(taskInputTree1);
		VarWalker varWalkerOutput1 = new VarWalker(taskOutputTree1);
		VarWalker varWalkerVars1 = new VarWalker(taskVarsTree1);
		
		System.out.println(varWalkerInput1.walk());
		System.out.println(varWalkerOutput1.walk());
		System.out.println(varWalkerVars1.walk());
		
		CommonTree taskInputTree2 = ParseUtil.getChildNodes(tree2, GDTSTaskParser.TASK_INPUT).get(0);
		CommonTree taskOutputTree2 = ParseUtil.getChildNodes(tree2, GDTSTaskParser.TASK_OUTPUT).get(0);
		CommonTree taskVarsTree2 = ParseUtil.getChildNodes(tree2, GDTSTaskParser.TASK_VARS).get(0);
		
		System.out.println(taskInputTree2.toStringTree());
		System.out.println(taskOutputTree2.toStringTree());
		System.out.println(taskVarsTree2.toStringTree());
		
		VarWalker varWalkerInput2 = new VarWalker(taskInputTree2);
		VarWalker varWalkerOutput2 = new VarWalker(taskOutputTree2);
		VarWalker varWalkerVars2 = new VarWalker(taskVarsTree2);
		
		System.out.println(varWalkerInput2.walk());
		System.out.println(varWalkerOutput2.walk());
		System.out.println(varWalkerVars2.walk());
	}
}
