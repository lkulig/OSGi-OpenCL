// $ANTLR 3.4 ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g 2011-09-20 15:37:52

  package gdts.core.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GDTSModulesWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "BOOLEAN", "CLOSE_B", "CLOSE_S", "COLON", "COMMA", "COMMENT", "CONTAINERTYPE", "DIGIT", "DOT", "D_ALIAS", "D_BEGIN", "D_CALL", "D_ELSE", "D_END", "D_END_FLOW", "D_END_FOR", "D_END_IF", "D_END_IN", "D_END_MASTER", "D_END_MODULE", "D_END_MODULES", "D_END_OUT", "D_END_SLAVE", "D_END_SLAVETASK", "D_END_TASK", "D_END_VARS", "D_END_WHILE", "D_FLOW", "D_FOR", "D_IF", "D_IN", "D_INOUT", "D_MASTER", "D_MODULE", "D_MODULES", "D_NAME", "D_OUT", "D_SLAVES", "D_SLAVETASK", "D_TASK", "D_VARS", "D_VERSION", "D_WHILE", "FLOAT", "ID", "INTEGER", "LETTER", "LOWER_CASE", "ML_COMMENT", "NEWLINE", "NULL", "OF_OPER", "OPEN_B", "OPEN_S", "OPER_ASSIGN", "OPER_DEC", "OPER_EQ", "OPER_G", "OPER_GE", "OPER_INC", "OPER_L", "OPER_LE", "OPER_NEQ", "SEMI", "SIMPLETYPE", "STRING", "UNDERSCORE", "UPPER_CASE", "VALUE", "VERSION", "WS", "ARRAY_REF", "ASSIGNMENT", "COMMAND_CALL", "CONDITION", "DECREMENT", "FLOW_BLOCK", "FOR_ACTION", "FOR_INIT", "FOR_LOOP", "INCREMENT", "INDEX_BY_VALUE", "INDEX_BY_VAR", "MATRIX_REF", "MODULE", "MODULES", "MODULE_ALIAS", "MODULE_VERSION", "PARAM", "PARAMETERS", "SLAVETASK", "TASK", "TASK_DESCR", "TASK_FLOW", "TASK_INPUT", "TASK_OUTPUT", "TASK_VARS", "VAR", "WHILE_LOOP"
    };

    public static final int EOF=-1;
    public static final int ARROW=4;
    public static final int BOOLEAN=5;
    public static final int CLOSE_B=6;
    public static final int CLOSE_S=7;
    public static final int COLON=8;
    public static final int COMMA=9;
    public static final int COMMENT=10;
    public static final int CONTAINERTYPE=11;
    public static final int DIGIT=12;
    public static final int DOT=13;
    public static final int D_ALIAS=14;
    public static final int D_BEGIN=15;
    public static final int D_CALL=16;
    public static final int D_ELSE=17;
    public static final int D_END=18;
    public static final int D_END_FLOW=19;
    public static final int D_END_FOR=20;
    public static final int D_END_IF=21;
    public static final int D_END_IN=22;
    public static final int D_END_MASTER=23;
    public static final int D_END_MODULE=24;
    public static final int D_END_MODULES=25;
    public static final int D_END_OUT=26;
    public static final int D_END_SLAVE=27;
    public static final int D_END_SLAVETASK=28;
    public static final int D_END_TASK=29;
    public static final int D_END_VARS=30;
    public static final int D_END_WHILE=31;
    public static final int D_FLOW=32;
    public static final int D_FOR=33;
    public static final int D_IF=34;
    public static final int D_IN=35;
    public static final int D_INOUT=36;
    public static final int D_MASTER=37;
    public static final int D_MODULE=38;
    public static final int D_MODULES=39;
    public static final int D_NAME=40;
    public static final int D_OUT=41;
    public static final int D_SLAVES=42;
    public static final int D_SLAVETASK=43;
    public static final int D_TASK=44;
    public static final int D_VARS=45;
    public static final int D_VERSION=46;
    public static final int D_WHILE=47;
    public static final int FLOAT=48;
    public static final int ID=49;
    public static final int INTEGER=50;
    public static final int LETTER=51;
    public static final int LOWER_CASE=52;
    public static final int ML_COMMENT=53;
    public static final int NEWLINE=54;
    public static final int NULL=55;
    public static final int OF_OPER=56;
    public static final int OPEN_B=57;
    public static final int OPEN_S=58;
    public static final int OPER_ASSIGN=59;
    public static final int OPER_DEC=60;
    public static final int OPER_EQ=61;
    public static final int OPER_G=62;
    public static final int OPER_GE=63;
    public static final int OPER_INC=64;
    public static final int OPER_L=65;
    public static final int OPER_LE=66;
    public static final int OPER_NEQ=67;
    public static final int SEMI=68;
    public static final int SIMPLETYPE=69;
    public static final int STRING=70;
    public static final int UNDERSCORE=71;
    public static final int UPPER_CASE=72;
    public static final int VALUE=73;
    public static final int VERSION=74;
    public static final int WS=75;
    public static final int ARRAY_REF=76;
    public static final int ASSIGNMENT=77;
    public static final int COMMAND_CALL=78;
    public static final int CONDITION=79;
    public static final int DECREMENT=80;
    public static final int FLOW_BLOCK=81;
    public static final int FOR_ACTION=82;
    public static final int FOR_INIT=83;
    public static final int FOR_LOOP=84;
    public static final int INCREMENT=85;
    public static final int INDEX_BY_VALUE=86;
    public static final int INDEX_BY_VAR=87;
    public static final int MATRIX_REF=88;
    public static final int MODULE=89;
    public static final int MODULES=90;
    public static final int MODULE_ALIAS=91;
    public static final int MODULE_VERSION=92;
    public static final int PARAM=93;
    public static final int PARAMETERS=94;
    public static final int SLAVETASK=95;
    public static final int TASK=96;
    public static final int TASK_DESCR=97;
    public static final int TASK_FLOW=98;
    public static final int TASK_INPUT=99;
    public static final int TASK_OUTPUT=100;
    public static final int TASK_VARS=101;
    public static final int VAR=102;
    public static final int WHILE_LOOP=103;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public GDTSModulesWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public GDTSModulesWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[5+1];
         

    }

    public String[] getTokenNames() { return GDTSModulesWalker.tokenNames; }
    public String getGrammarFileName() { return "..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g"; }



      protected TaskParseHelper helper;



    // $ANTLR start "modules"
    // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:51:1: modules : ^( MODULES ( moduleDeclaration )* ) ;
    public final void modules() throws RecognitionException {
        int modules_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:52:2: ( ^( MODULES ( moduleDeclaration )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:52:4: ^( MODULES ( moduleDeclaration )* )
            {
            match(input,MODULES,FOLLOW_MODULES_in_modules189); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:52:14: ( moduleDeclaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==MODULE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:52:14: moduleDeclaration
                	    {
                	    pushFollow(FOLLOW_moduleDeclaration_in_modules191);
                	    moduleDeclaration();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, modules_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "modules"



    // $ANTLR start "moduleDeclaration"
    // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:55:1: moduleDeclaration : ^( MODULE moduleId= ID ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS (alias= ID )? ) ) ;
    public final void moduleDeclaration() throws RecognitionException {
        int moduleDeclaration_StartIndex = input.index();

        CommonTree moduleId=null;
        CommonTree alias=null;
        CommonTree VERSION1=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:56:2: ( ^( MODULE moduleId= ID ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS (alias= ID )? ) ) )
            // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:56:4: ^( MODULE moduleId= ID ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS (alias= ID )? ) )
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDeclaration205); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            moduleId=(CommonTree)match(input,ID,FOLLOW_ID_in_moduleDeclaration211); if (state.failed) return ;

            match(input,MODULE_VERSION,FOLLOW_MODULE_VERSION_in_moduleDeclaration214); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:56:44: ( VERSION )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VERSION) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:56:44: VERSION
                        {
                        VERSION1=(CommonTree)match(input,VERSION,FOLLOW_VERSION_in_moduleDeclaration216); if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input,MODULE_ALIAS,FOLLOW_MODULE_ALIAS_in_moduleDeclaration221); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:56:75: (alias= ID )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // ..\\src\\gdts\\core\\parser\\GDTSModulesWalker.g:56:75: alias= ID
                        {
                        alias=(CommonTree)match(input,ID,FOLLOW_ID_in_moduleDeclaration227); if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) {
            			helper.addModule(moduleId, VERSION1, alias);
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, moduleDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "moduleDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULES_in_modules189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_moduleDeclaration_in_modules191 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_MODULE_in_moduleDeclaration205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_moduleDeclaration211 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_MODULE_VERSION_in_moduleDeclaration214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VERSION_in_moduleDeclaration216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODULE_ALIAS_in_moduleDeclaration221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_moduleDeclaration227 = new BitSet(new long[]{0x0000000000000008L});

}