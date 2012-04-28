package gdts.core.parser.util;

import gdts.core.parser.GDTSInstanceLexer;
import gdts.core.parser.GDTSInstanceParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

/**
 * Klasa narzędziowa służąca do parsowania Instancji.
 * 
 * @author Maciej Milczarek
 */
public class ParseUtil {
	
	private ParseUtil(){}
	
	public static CommonTree parseInstanceFile(File file) {
		try {
			
			ANTLRInputStream input = new ANTLRInputStream(
					new FileInputStream(file), "UTF-8");
			GDTSInstanceLexer lexer = new GDTSInstanceLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GDTSInstanceParser parser = new GDTSInstanceParser(tokens);
			return (CommonTree) parser.instance().getTree();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	

	@SuppressWarnings("unchecked")
	public static List<CommonTree> getChildNodes(CommonTree parent, int tokenType) {
	
		List<CommonTree> nodes = new ArrayList<CommonTree>();
		
		for(CommonTree childNode : (List<CommonTree>)parent.getChildren()) {
			if(childNode.getToken().getType() == tokenType) {
				nodes.add(childNode);
			}
		}
		
		return nodes;
	}
}

