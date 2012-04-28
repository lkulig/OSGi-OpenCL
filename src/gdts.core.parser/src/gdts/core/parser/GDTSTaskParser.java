// $ANTLR 3.4 ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g 2011-09-20 15:37:50

  package gdts.core.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GDTSTaskParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GDTSTaskParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GDTSTaskParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[67+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return GDTSTaskParser.tokenNames; }
    public String getGrammarFileName() { return "..\\src\\gdts\\core\\parser\\GDTSTaskParser.g"; }


    public static class task_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "task"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:49:1: task : D_TASK ID ( COLON VERSION )? D_BEGIN ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* D_END SEMI -> ^( TASK ^( TASK_DESCR ID ( VERSION )? ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* ) ;
    public final GDTSTaskParser.task_return task() throws RecognitionException {
        GDTSTaskParser.task_return retval = new GDTSTaskParser.task_return();
        retval.start = input.LT(1);

        int task_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_TASK1=null;
        Token ID2=null;
        Token COLON3=null;
        Token VERSION4=null;
        Token D_BEGIN5=null;
        Token D_END12=null;
        Token SEMI13=null;
        GDTSTaskParser.modulesDescr_return modulesDescr6 =null;

        GDTSTaskParser.inputDataDescr_return inputDataDescr7 =null;

        GDTSTaskParser.outputDataDescr_return outputDataDescr8 =null;

        GDTSTaskParser.variables_return variables9 =null;

        GDTSTaskParser.flow_return flow10 =null;

        GDTSTaskParser.slavetask_return slavetask11 =null;


        CommonTree D_TASK1_tree=null;
        CommonTree ID2_tree=null;
        CommonTree COLON3_tree=null;
        CommonTree VERSION4_tree=null;
        CommonTree D_BEGIN5_tree=null;
        CommonTree D_END12_tree=null;
        CommonTree SEMI13_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_D_TASK=new RewriteRuleTokenStream(adaptor,"token D_TASK");
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_modulesDescr=new RewriteRuleSubtreeStream(adaptor,"rule modulesDescr");
        RewriteRuleSubtreeStream stream_slavetask=new RewriteRuleSubtreeStream(adaptor,"rule slavetask");
        RewriteRuleSubtreeStream stream_flow=new RewriteRuleSubtreeStream(adaptor,"rule flow");
        RewriteRuleSubtreeStream stream_outputDataDescr=new RewriteRuleSubtreeStream(adaptor,"rule outputDataDescr");
        RewriteRuleSubtreeStream stream_inputDataDescr=new RewriteRuleSubtreeStream(adaptor,"rule inputDataDescr");
        RewriteRuleSubtreeStream stream_variables=new RewriteRuleSubtreeStream(adaptor,"rule variables");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:49:6: ( D_TASK ID ( COLON VERSION )? D_BEGIN ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* D_END SEMI -> ^( TASK ^( TASK_DESCR ID ( VERSION )? ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:49:8: D_TASK ID ( COLON VERSION )? D_BEGIN ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* D_END SEMI
            {
            D_TASK1=(Token)match(input,D_TASK,FOLLOW_D_TASK_in_task208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_TASK.add(D_TASK1);


            ID2=(Token)match(input,ID,FOLLOW_ID_in_task210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID2);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:49:18: ( COLON VERSION )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==COLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:49:19: COLON VERSION
                    {
                    COLON3=(Token)match(input,COLON,FOLLOW_COLON_in_task213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON3);


                    VERSION4=(Token)match(input,VERSION,FOLLOW_VERSION_in_task215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VERSION.add(VERSION4);


                    }
                    break;

            }


            D_BEGIN5=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_task219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN5);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:50:3: ( modulesDescr )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==D_MODULES) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:50:3: modulesDescr
                    {
                    pushFollow(FOLLOW_modulesDescr_in_task223);
                    modulesDescr6=modulesDescr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modulesDescr.add(modulesDescr6.getTree());

                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:51:3: ( inputDataDescr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==D_IN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:51:3: inputDataDescr
                    {
                    pushFollow(FOLLOW_inputDataDescr_in_task228);
                    inputDataDescr7=inputDataDescr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inputDataDescr.add(inputDataDescr7.getTree());

                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:52:3: ( outputDataDescr )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==D_OUT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:52:3: outputDataDescr
                    {
                    pushFollow(FOLLOW_outputDataDescr_in_task233);
                    outputDataDescr8=outputDataDescr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputDataDescr.add(outputDataDescr8.getTree());

                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:53:3: ( variables )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==D_VARS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:53:3: variables
                    {
                    pushFollow(FOLLOW_variables_in_task238);
                    variables9=variables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variables.add(variables9.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_flow_in_task243);
            flow10=flow();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flow.add(flow10.getTree());

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:55:3: ( slavetask )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==D_SLAVETASK) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:55:3: slavetask
            	    {
            	    pushFollow(FOLLOW_slavetask_in_task247);
            	    slavetask11=slavetask();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slavetask.add(slavetask11.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            D_END12=(Token)match(input,D_END,FOLLOW_D_END_in_task252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END12);


            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_task254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI13);


            // AST REWRITE
            // elements: flow, inputDataDescr, modulesDescr, variables, ID, slavetask, outputDataDescr, VERSION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:3: -> ^( TASK ^( TASK_DESCR ID ( VERSION )? ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:57:6: ^( TASK ^( TASK_DESCR ID ( VERSION )? ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ( slavetask )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK, "TASK")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:58:4: ^( TASK_DESCR ID ( VERSION )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK_DESCR, "TASK_DESCR")
                , root_2);

                adaptor.addChild(root_2, 
                stream_ID.nextNode()
                );

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:58:20: ( VERSION )?
                if ( stream_VERSION.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_VERSION.nextNode()
                    );

                }
                stream_VERSION.reset();

                adaptor.addChild(root_1, root_2);
                }

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:59:4: ( modulesDescr )?
                if ( stream_modulesDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_modulesDescr.nextTree());

                }
                stream_modulesDescr.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:60:4: ( inputDataDescr )?
                if ( stream_inputDataDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_inputDataDescr.nextTree());

                }
                stream_inputDataDescr.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:61:4: ( outputDataDescr )?
                if ( stream_outputDataDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_outputDataDescr.nextTree());

                }
                stream_outputDataDescr.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:62:4: ( variables )?
                if ( stream_variables.hasNext() ) {
                    adaptor.addChild(root_1, stream_variables.nextTree());

                }
                stream_variables.reset();

                adaptor.addChild(root_1, stream_flow.nextTree());

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:64:4: ( slavetask )*
                while ( stream_slavetask.hasNext() ) {
                    adaptor.addChild(root_1, stream_slavetask.nextTree());

                }
                stream_slavetask.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, task_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "task"


    public static class modulesDescr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modulesDescr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:67:1: modulesDescr : D_MODULES D_BEGIN ( singleModuleDescr )* D_END SEMI -> ^( MODULES ( singleModuleDescr )* ) ;
    public final GDTSTaskParser.modulesDescr_return modulesDescr() throws RecognitionException {
        GDTSTaskParser.modulesDescr_return retval = new GDTSTaskParser.modulesDescr_return();
        retval.start = input.LT(1);

        int modulesDescr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_MODULES14=null;
        Token D_BEGIN15=null;
        Token D_END17=null;
        Token SEMI18=null;
        GDTSTaskParser.singleModuleDescr_return singleModuleDescr16 =null;


        CommonTree D_MODULES14_tree=null;
        CommonTree D_BEGIN15_tree=null;
        CommonTree D_END17_tree=null;
        CommonTree SEMI18_tree=null;
        RewriteRuleTokenStream stream_D_MODULES=new RewriteRuleTokenStream(adaptor,"token D_MODULES");
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_singleModuleDescr=new RewriteRuleSubtreeStream(adaptor,"rule singleModuleDescr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:68:2: ( D_MODULES D_BEGIN ( singleModuleDescr )* D_END SEMI -> ^( MODULES ( singleModuleDescr )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:68:4: D_MODULES D_BEGIN ( singleModuleDescr )* D_END SEMI
            {
            D_MODULES14=(Token)match(input,D_MODULES,FOLLOW_D_MODULES_in_modulesDescr329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_MODULES.add(D_MODULES14);


            D_BEGIN15=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_modulesDescr331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN15);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:69:3: ( singleModuleDescr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:69:3: singleModuleDescr
            	    {
            	    pushFollow(FOLLOW_singleModuleDescr_in_modulesDescr335);
            	    singleModuleDescr16=singleModuleDescr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_singleModuleDescr.add(singleModuleDescr16.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            D_END17=(Token)match(input,D_END,FOLLOW_D_END_in_modulesDescr340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END17);


            SEMI18=(Token)match(input,SEMI,FOLLOW_SEMI_in_modulesDescr342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI18);


            // AST REWRITE
            // elements: singleModuleDescr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 71:3: -> ^( MODULES ( singleModuleDescr )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:71:6: ^( MODULES ( singleModuleDescr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULES, "MODULES")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:71:16: ( singleModuleDescr )*
                while ( stream_singleModuleDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_singleModuleDescr.nextTree());

                }
                stream_singleModuleDescr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, modulesDescr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "modulesDescr"


    public static class singleModuleDescr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "singleModuleDescr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:74:1: singleModuleDescr : (moduleAlias= ID ARROW )? moduleName= ID ( COLON VERSION )? SEMI -> ^( MODULE $moduleName ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS ( $moduleAlias)? ) ) ;
    public final GDTSTaskParser.singleModuleDescr_return singleModuleDescr() throws RecognitionException {
        GDTSTaskParser.singleModuleDescr_return retval = new GDTSTaskParser.singleModuleDescr_return();
        retval.start = input.LT(1);

        int singleModuleDescr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token moduleAlias=null;
        Token moduleName=null;
        Token ARROW19=null;
        Token COLON20=null;
        Token VERSION21=null;
        Token SEMI22=null;

        CommonTree moduleAlias_tree=null;
        CommonTree moduleName_tree=null;
        CommonTree ARROW19_tree=null;
        CommonTree COLON20_tree=null;
        CommonTree VERSION21_tree=null;
        CommonTree SEMI22_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:75:2: ( (moduleAlias= ID ARROW )? moduleName= ID ( COLON VERSION )? SEMI -> ^( MODULE $moduleName ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS ( $moduleAlias)? ) ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:75:4: (moduleAlias= ID ARROW )? moduleName= ID ( COLON VERSION )? SEMI
            {
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:75:4: (moduleAlias= ID ARROW )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ARROW) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:75:5: moduleAlias= ID ARROW
                    {
                    moduleAlias=(Token)match(input,ID,FOLLOW_ID_in_singleModuleDescr371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(moduleAlias);


                    ARROW19=(Token)match(input,ARROW,FOLLOW_ARROW_in_singleModuleDescr373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(ARROW19);


                    }
                    break;

            }


            moduleName=(Token)match(input,ID,FOLLOW_ID_in_singleModuleDescr381); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(moduleName);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:75:46: ( COLON VERSION )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==COLON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:75:47: COLON VERSION
                    {
                    COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_singleModuleDescr384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON20);


                    VERSION21=(Token)match(input,VERSION,FOLLOW_VERSION_in_singleModuleDescr386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VERSION.add(VERSION21);


                    }
                    break;

            }


            SEMI22=(Token)match(input,SEMI,FOLLOW_SEMI_in_singleModuleDescr390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI22);


            // AST REWRITE
            // elements: VERSION, moduleName, moduleAlias
            // token labels: moduleName, moduleAlias
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_moduleName=new RewriteRuleTokenStream(adaptor,"token moduleName",moduleName);
            RewriteRuleTokenStream stream_moduleAlias=new RewriteRuleTokenStream(adaptor,"token moduleAlias",moduleAlias);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:3: -> ^( MODULE $moduleName ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS ( $moduleAlias)? ) )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:77:6: ^( MODULE $moduleName ^( MODULE_VERSION ( VERSION )? ) ^( MODULE_ALIAS ( $moduleAlias)? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE, "MODULE")
                , root_1);

                adaptor.addChild(root_1, stream_moduleName.nextNode());

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:77:27: ^( MODULE_VERSION ( VERSION )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_VERSION, "MODULE_VERSION")
                , root_2);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:77:44: ( VERSION )?
                if ( stream_VERSION.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_VERSION.nextNode()
                    );

                }
                stream_VERSION.reset();

                adaptor.addChild(root_1, root_2);
                }

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:77:54: ^( MODULE_ALIAS ( $moduleAlias)? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MODULE_ALIAS, "MODULE_ALIAS")
                , root_2);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:77:70: ( $moduleAlias)?
                if ( stream_moduleAlias.hasNext() ) {
                    adaptor.addChild(root_2, stream_moduleAlias.nextNode());

                }
                stream_moduleAlias.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, singleModuleDescr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "singleModuleDescr"


    public static class inputDataDescr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inputDataDescr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:80:1: inputDataDescr : D_IN D_BEGIN ( varDeclaration )* D_END SEMI -> ^( TASK_INPUT ( varDeclaration )* ) ;
    public final GDTSTaskParser.inputDataDescr_return inputDataDescr() throws RecognitionException {
        GDTSTaskParser.inputDataDescr_return retval = new GDTSTaskParser.inputDataDescr_return();
        retval.start = input.LT(1);

        int inputDataDescr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_IN23=null;
        Token D_BEGIN24=null;
        Token D_END26=null;
        Token SEMI27=null;
        GDTSTaskParser.varDeclaration_return varDeclaration25 =null;


        CommonTree D_IN23_tree=null;
        CommonTree D_BEGIN24_tree=null;
        CommonTree D_END26_tree=null;
        CommonTree SEMI27_tree=null;
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_IN=new RewriteRuleTokenStream(adaptor,"token D_IN");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:81:2: ( D_IN D_BEGIN ( varDeclaration )* D_END SEMI -> ^( TASK_INPUT ( varDeclaration )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:81:4: D_IN D_BEGIN ( varDeclaration )* D_END SEMI
            {
            D_IN23=(Token)match(input,D_IN,FOLLOW_D_IN_in_inputDataDescr432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_IN.add(D_IN23);


            D_BEGIN24=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_inputDataDescr434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN24);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:82:3: ( varDeclaration )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:82:3: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_inputDataDescr438);
            	    varDeclaration25=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDeclaration.add(varDeclaration25.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            D_END26=(Token)match(input,D_END,FOLLOW_D_END_in_inputDataDescr443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END26);


            SEMI27=(Token)match(input,SEMI,FOLLOW_SEMI_in_inputDataDescr445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI27);


            // AST REWRITE
            // elements: varDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:3: -> ^( TASK_INPUT ( varDeclaration )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:84:6: ^( TASK_INPUT ( varDeclaration )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK_INPUT, "TASK_INPUT")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:84:19: ( varDeclaration )*
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, inputDataDescr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inputDataDescr"


    public static class outputDataDescr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outputDataDescr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:87:1: outputDataDescr : D_OUT D_BEGIN ( varDeclaration )* D_END SEMI -> ^( TASK_OUTPUT ( varDeclaration )* ) ;
    public final GDTSTaskParser.outputDataDescr_return outputDataDescr() throws RecognitionException {
        GDTSTaskParser.outputDataDescr_return retval = new GDTSTaskParser.outputDataDescr_return();
        retval.start = input.LT(1);

        int outputDataDescr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_OUT28=null;
        Token D_BEGIN29=null;
        Token D_END31=null;
        Token SEMI32=null;
        GDTSTaskParser.varDeclaration_return varDeclaration30 =null;


        CommonTree D_OUT28_tree=null;
        CommonTree D_BEGIN29_tree=null;
        CommonTree D_END31_tree=null;
        CommonTree SEMI32_tree=null;
        RewriteRuleTokenStream stream_D_OUT=new RewriteRuleTokenStream(adaptor,"token D_OUT");
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:88:2: ( D_OUT D_BEGIN ( varDeclaration )* D_END SEMI -> ^( TASK_OUTPUT ( varDeclaration )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:88:4: D_OUT D_BEGIN ( varDeclaration )* D_END SEMI
            {
            D_OUT28=(Token)match(input,D_OUT,FOLLOW_D_OUT_in_outputDataDescr468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_OUT.add(D_OUT28);


            D_BEGIN29=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_outputDataDescr470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN29);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:89:3: ( varDeclaration )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:89:3: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_outputDataDescr474);
            	    varDeclaration30=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDeclaration.add(varDeclaration30.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            D_END31=(Token)match(input,D_END,FOLLOW_D_END_in_outputDataDescr479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END31);


            SEMI32=(Token)match(input,SEMI,FOLLOW_SEMI_in_outputDataDescr481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI32);


            // AST REWRITE
            // elements: varDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:3: -> ^( TASK_OUTPUT ( varDeclaration )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:91:6: ^( TASK_OUTPUT ( varDeclaration )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK_OUTPUT, "TASK_OUTPUT")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:91:20: ( varDeclaration )*
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, outputDataDescr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "outputDataDescr"


    public static class variables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variables"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:94:1: variables : D_VARS D_BEGIN ( varDeclaration )* D_END SEMI -> ^( TASK_VARS ( varDeclaration )* ) ;
    public final GDTSTaskParser.variables_return variables() throws RecognitionException {
        GDTSTaskParser.variables_return retval = new GDTSTaskParser.variables_return();
        retval.start = input.LT(1);

        int variables_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_VARS33=null;
        Token D_BEGIN34=null;
        Token D_END36=null;
        Token SEMI37=null;
        GDTSTaskParser.varDeclaration_return varDeclaration35 =null;


        CommonTree D_VARS33_tree=null;
        CommonTree D_BEGIN34_tree=null;
        CommonTree D_END36_tree=null;
        CommonTree SEMI37_tree=null;
        RewriteRuleTokenStream stream_D_VARS=new RewriteRuleTokenStream(adaptor,"token D_VARS");
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_varDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule varDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:95:2: ( D_VARS D_BEGIN ( varDeclaration )* D_END SEMI -> ^( TASK_VARS ( varDeclaration )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:95:4: D_VARS D_BEGIN ( varDeclaration )* D_END SEMI
            {
            D_VARS33=(Token)match(input,D_VARS,FOLLOW_D_VARS_in_variables504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_VARS.add(D_VARS33);


            D_BEGIN34=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_variables506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN34);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:96:3: ( varDeclaration )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:96:3: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_variables510);
            	    varDeclaration35=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDeclaration.add(varDeclaration35.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            D_END36=(Token)match(input,D_END,FOLLOW_D_END_in_variables517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END36);


            SEMI37=(Token)match(input,SEMI,FOLLOW_SEMI_in_variables519); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI37);


            // AST REWRITE
            // elements: varDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 98:3: -> ^( TASK_VARS ( varDeclaration )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:98:6: ^( TASK_VARS ( varDeclaration )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK_VARS, "TASK_VARS")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:98:18: ( varDeclaration )*
                while ( stream_varDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclaration.nextTree());

                }
                stream_varDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, variables_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variables"


    public static class inoutDataDescr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inoutDataDescr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:101:1: inoutDataDescr : D_INOUT D_BEGIN ( varDeclaration )* D_END SEMI ;
    public final GDTSTaskParser.inoutDataDescr_return inoutDataDescr() throws RecognitionException {
        GDTSTaskParser.inoutDataDescr_return retval = new GDTSTaskParser.inoutDataDescr_return();
        retval.start = input.LT(1);

        int inoutDataDescr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_INOUT38=null;
        Token D_BEGIN39=null;
        Token D_END41=null;
        Token SEMI42=null;
        GDTSTaskParser.varDeclaration_return varDeclaration40 =null;


        CommonTree D_INOUT38_tree=null;
        CommonTree D_BEGIN39_tree=null;
        CommonTree D_END41_tree=null;
        CommonTree SEMI42_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:102:2: ( D_INOUT D_BEGIN ( varDeclaration )* D_END SEMI )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:102:4: D_INOUT D_BEGIN ( varDeclaration )* D_END SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            D_INOUT38=(Token)match(input,D_INOUT,FOLLOW_D_INOUT_in_inoutDataDescr543); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            D_INOUT38_tree = 
            (CommonTree)adaptor.create(D_INOUT38)
            ;
            adaptor.addChild(root_0, D_INOUT38_tree);
            }

            D_BEGIN39=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_inoutDataDescr545); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            D_BEGIN39_tree = 
            (CommonTree)adaptor.create(D_BEGIN39)
            ;
            adaptor.addChild(root_0, D_BEGIN39_tree);
            }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:103:3: ( varDeclaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:103:3: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_inoutDataDescr549);
            	    varDeclaration40=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration40.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            D_END41=(Token)match(input,D_END,FOLLOW_D_END_in_inoutDataDescr554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            D_END41_tree = 
            (CommonTree)adaptor.create(D_END41)
            ;
            adaptor.addChild(root_0, D_END41_tree);
            }

            SEMI42=(Token)match(input,SEMI,FOLLOW_SEMI_in_inoutDataDescr556); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI42_tree = 
            (CommonTree)adaptor.create(SEMI42)
            ;
            adaptor.addChild(root_0, SEMI42_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, inoutDataDescr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inoutDataDescr"


    public static class varDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclaration"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:107:1: varDeclaration :ids+= ID ( COMMA ids+= ID )* COLON type SEMI -> ( ^( VAR type $ids) )* ;
    public final GDTSTaskParser.varDeclaration_return varDeclaration() throws RecognitionException {
        GDTSTaskParser.varDeclaration_return retval = new GDTSTaskParser.varDeclaration_return();
        retval.start = input.LT(1);

        int varDeclaration_StartIndex = input.index();

        CommonTree root_0 = null;

        Token COMMA43=null;
        Token COLON44=null;
        Token SEMI46=null;
        Token ids=null;
        List list_ids=null;
        GDTSTaskParser.type_return type45 =null;


        CommonTree COMMA43_tree=null;
        CommonTree COLON44_tree=null;
        CommonTree SEMI46_tree=null;
        CommonTree ids_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:108:2: (ids+= ID ( COMMA ids+= ID )* COLON type SEMI -> ( ^( VAR type $ids) )* )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:108:4: ids+= ID ( COMMA ids+= ID )* COLON type SEMI
            {
            ids=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ids);

            if (list_ids==null) list_ids=new ArrayList();
            list_ids.add(ids);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:108:14: ( COMMA ids+= ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:108:15: COMMA ids+= ID
            	    {
            	    COMMA43=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclaration575); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA43);


            	    ids=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration581); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ids);

            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            COLON44=(Token)match(input,COLON,FOLLOW_COLON_in_varDeclaration585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON44);


            pushFollow(FOLLOW_type_in_varDeclaration587);
            type45=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type45.getTree());

            SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclaration589); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI46);


            // AST REWRITE
            // elements: ids, type
            // token labels: 
            // rule labels: retval
            // token list labels: ids
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_ids=new RewriteRuleTokenStream(adaptor,"token ids", list_ids);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:3: -> ( ^( VAR type $ids) )*
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:109:6: ( ^( VAR type $ids) )*
                while ( stream_ids.hasNext()||stream_type.hasNext() ) {
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:109:6: ^( VAR type $ids)
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(VAR, "VAR")
                    , root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, stream_ids.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ids.reset();
                stream_type.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, varDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclaration"


    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:112:1: type : ( SIMPLETYPE -> SIMPLETYPE | containerType -> containerType );
    public final GDTSTaskParser.type_return type() throws RecognitionException {
        GDTSTaskParser.type_return retval = new GDTSTaskParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SIMPLETYPE47=null;
        GDTSTaskParser.containerType_return containerType48 =null;


        CommonTree SIMPLETYPE47_tree=null;
        RewriteRuleTokenStream stream_SIMPLETYPE=new RewriteRuleTokenStream(adaptor,"token SIMPLETYPE");
        RewriteRuleSubtreeStream stream_containerType=new RewriteRuleSubtreeStream(adaptor,"rule containerType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:113:2: ( SIMPLETYPE -> SIMPLETYPE | containerType -> containerType )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SIMPLETYPE) ) {
                alt15=1;
            }
            else if ( (LA15_0==CONTAINERTYPE) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:113:4: SIMPLETYPE
                    {
                    SIMPLETYPE47=(Token)match(input,SIMPLETYPE,FOLLOW_SIMPLETYPE_in_type616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIMPLETYPE.add(SIMPLETYPE47);


                    // AST REWRITE
                    // elements: SIMPLETYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 114:3: -> SIMPLETYPE
                    {
                        adaptor.addChild(root_0, 
                        stream_SIMPLETYPE.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:115:4: containerType
                    {
                    pushFollow(FOLLOW_containerType_in_type627);
                    containerType48=containerType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_containerType.add(containerType48.getTree());

                    // AST REWRITE
                    // elements: containerType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:3: -> containerType
                    {
                        adaptor.addChild(root_0, stream_containerType.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type"


    public static class containerType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "containerType"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:119:1: containerType : ( CONTAINERTYPE OF_OPER SIMPLETYPE -> ^( CONTAINERTYPE SIMPLETYPE ) | CONTAINERTYPE OF_OPER containerType -> ^( CONTAINERTYPE containerType ) );
    public final GDTSTaskParser.containerType_return containerType() throws RecognitionException {
        GDTSTaskParser.containerType_return retval = new GDTSTaskParser.containerType_return();
        retval.start = input.LT(1);

        int containerType_StartIndex = input.index();

        CommonTree root_0 = null;

        Token CONTAINERTYPE49=null;
        Token OF_OPER50=null;
        Token SIMPLETYPE51=null;
        Token CONTAINERTYPE52=null;
        Token OF_OPER53=null;
        GDTSTaskParser.containerType_return containerType54 =null;


        CommonTree CONTAINERTYPE49_tree=null;
        CommonTree OF_OPER50_tree=null;
        CommonTree SIMPLETYPE51_tree=null;
        CommonTree CONTAINERTYPE52_tree=null;
        CommonTree OF_OPER53_tree=null;
        RewriteRuleTokenStream stream_OF_OPER=new RewriteRuleTokenStream(adaptor,"token OF_OPER");
        RewriteRuleTokenStream stream_CONTAINERTYPE=new RewriteRuleTokenStream(adaptor,"token CONTAINERTYPE");
        RewriteRuleTokenStream stream_SIMPLETYPE=new RewriteRuleTokenStream(adaptor,"token SIMPLETYPE");
        RewriteRuleSubtreeStream stream_containerType=new RewriteRuleSubtreeStream(adaptor,"rule containerType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:120:2: ( CONTAINERTYPE OF_OPER SIMPLETYPE -> ^( CONTAINERTYPE SIMPLETYPE ) | CONTAINERTYPE OF_OPER containerType -> ^( CONTAINERTYPE containerType ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CONTAINERTYPE) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==OF_OPER) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==SIMPLETYPE) ) {
                        alt16=1;
                    }
                    else if ( (LA16_2==CONTAINERTYPE) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:120:4: CONTAINERTYPE OF_OPER SIMPLETYPE
                    {
                    CONTAINERTYPE49=(Token)match(input,CONTAINERTYPE,FOLLOW_CONTAINERTYPE_in_containerType645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINERTYPE.add(CONTAINERTYPE49);


                    OF_OPER50=(Token)match(input,OF_OPER,FOLLOW_OF_OPER_in_containerType647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF_OPER.add(OF_OPER50);


                    SIMPLETYPE51=(Token)match(input,SIMPLETYPE,FOLLOW_SIMPLETYPE_in_containerType649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIMPLETYPE.add(SIMPLETYPE51);


                    // AST REWRITE
                    // elements: SIMPLETYPE, CONTAINERTYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 121:3: -> ^( CONTAINERTYPE SIMPLETYPE )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:121:6: ^( CONTAINERTYPE SIMPLETYPE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINERTYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SIMPLETYPE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:122:4: CONTAINERTYPE OF_OPER containerType
                    {
                    CONTAINERTYPE52=(Token)match(input,CONTAINERTYPE,FOLLOW_CONTAINERTYPE_in_containerType664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTAINERTYPE.add(CONTAINERTYPE52);


                    OF_OPER53=(Token)match(input,OF_OPER,FOLLOW_OF_OPER_in_containerType666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF_OPER.add(OF_OPER53);


                    pushFollow(FOLLOW_containerType_in_containerType668);
                    containerType54=containerType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_containerType.add(containerType54.getTree());

                    // AST REWRITE
                    // elements: CONTAINERTYPE, containerType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 123:3: -> ^( CONTAINERTYPE containerType )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:123:6: ^( CONTAINERTYPE containerType )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CONTAINERTYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_containerType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, containerType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "containerType"


    public static class slavetask_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "slavetask"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:126:1: slavetask : D_SLAVETASK ID D_BEGIN ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow D_END SEMI -> ^( SLAVETASK ^( TASK_DESCR ID ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ) ;
    public final GDTSTaskParser.slavetask_return slavetask() throws RecognitionException {
        GDTSTaskParser.slavetask_return retval = new GDTSTaskParser.slavetask_return();
        retval.start = input.LT(1);

        int slavetask_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_SLAVETASK55=null;
        Token ID56=null;
        Token D_BEGIN57=null;
        Token D_END63=null;
        Token SEMI64=null;
        GDTSTaskParser.modulesDescr_return modulesDescr58 =null;

        GDTSTaskParser.inputDataDescr_return inputDataDescr59 =null;

        GDTSTaskParser.outputDataDescr_return outputDataDescr60 =null;

        GDTSTaskParser.variables_return variables61 =null;

        GDTSTaskParser.flow_return flow62 =null;


        CommonTree D_SLAVETASK55_tree=null;
        CommonTree ID56_tree=null;
        CommonTree D_BEGIN57_tree=null;
        CommonTree D_END63_tree=null;
        CommonTree SEMI64_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_SLAVETASK=new RewriteRuleTokenStream(adaptor,"token D_SLAVETASK");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_modulesDescr=new RewriteRuleSubtreeStream(adaptor,"rule modulesDescr");
        RewriteRuleSubtreeStream stream_flow=new RewriteRuleSubtreeStream(adaptor,"rule flow");
        RewriteRuleSubtreeStream stream_outputDataDescr=new RewriteRuleSubtreeStream(adaptor,"rule outputDataDescr");
        RewriteRuleSubtreeStream stream_inputDataDescr=new RewriteRuleSubtreeStream(adaptor,"rule inputDataDescr");
        RewriteRuleSubtreeStream stream_variables=new RewriteRuleSubtreeStream(adaptor,"rule variables");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:127:2: ( D_SLAVETASK ID D_BEGIN ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow D_END SEMI -> ^( SLAVETASK ^( TASK_DESCR ID ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:127:4: D_SLAVETASK ID D_BEGIN ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow D_END SEMI
            {
            D_SLAVETASK55=(Token)match(input,D_SLAVETASK,FOLLOW_D_SLAVETASK_in_slavetask691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_SLAVETASK.add(D_SLAVETASK55);


            ID56=(Token)match(input,ID,FOLLOW_ID_in_slavetask693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID56);


            D_BEGIN57=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_slavetask695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN57);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:128:3: ( modulesDescr )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==D_MODULES) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:128:3: modulesDescr
                    {
                    pushFollow(FOLLOW_modulesDescr_in_slavetask699);
                    modulesDescr58=modulesDescr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modulesDescr.add(modulesDescr58.getTree());

                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:129:3: ( inputDataDescr )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==D_IN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:129:3: inputDataDescr
                    {
                    pushFollow(FOLLOW_inputDataDescr_in_slavetask704);
                    inputDataDescr59=inputDataDescr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inputDataDescr.add(inputDataDescr59.getTree());

                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:130:3: ( outputDataDescr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==D_OUT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:130:3: outputDataDescr
                    {
                    pushFollow(FOLLOW_outputDataDescr_in_slavetask709);
                    outputDataDescr60=outputDataDescr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_outputDataDescr.add(outputDataDescr60.getTree());

                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:131:3: ( variables )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==D_VARS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:131:3: variables
                    {
                    pushFollow(FOLLOW_variables_in_slavetask714);
                    variables61=variables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variables.add(variables61.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_flow_in_slavetask719);
            flow62=flow();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flow.add(flow62.getTree());

            D_END63=(Token)match(input,D_END,FOLLOW_D_END_in_slavetask723); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END63);


            SEMI64=(Token)match(input,SEMI,FOLLOW_SEMI_in_slavetask725); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI64);


            // AST REWRITE
            // elements: modulesDescr, outputDataDescr, variables, ID, flow, inputDataDescr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:3: -> ^( SLAVETASK ^( TASK_DESCR ID ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:134:6: ^( SLAVETASK ^( TASK_DESCR ID ) ( modulesDescr )? ( inputDataDescr )? ( outputDataDescr )? ( variables )? flow )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SLAVETASK, "SLAVETASK")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:135:4: ^( TASK_DESCR ID )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK_DESCR, "TASK_DESCR")
                , root_2);

                adaptor.addChild(root_2, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:136:4: ( modulesDescr )?
                if ( stream_modulesDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_modulesDescr.nextTree());

                }
                stream_modulesDescr.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:137:4: ( inputDataDescr )?
                if ( stream_inputDataDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_inputDataDescr.nextTree());

                }
                stream_inputDataDescr.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:138:4: ( outputDataDescr )?
                if ( stream_outputDataDescr.hasNext() ) {
                    adaptor.addChild(root_1, stream_outputDataDescr.nextTree());

                }
                stream_outputDataDescr.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:139:4: ( variables )?
                if ( stream_variables.hasNext() ) {
                    adaptor.addChild(root_1, stream_variables.nextTree());

                }
                stream_variables.reset();

                adaptor.addChild(root_1, stream_flow.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, slavetask_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "slavetask"


    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:143:1: flow : D_FLOW flowBlock -> flowBlock ;
    public final GDTSTaskParser.flow_return flow() throws RecognitionException {
        GDTSTaskParser.flow_return retval = new GDTSTaskParser.flow_return();
        retval.start = input.LT(1);

        int flow_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_FLOW65=null;
        GDTSTaskParser.flowBlock_return flowBlock66 =null;


        CommonTree D_FLOW65_tree=null;
        RewriteRuleTokenStream stream_D_FLOW=new RewriteRuleTokenStream(adaptor,"token D_FLOW");
        RewriteRuleSubtreeStream stream_flowBlock=new RewriteRuleSubtreeStream(adaptor,"rule flowBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:143:6: ( D_FLOW flowBlock -> flowBlock )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:143:8: D_FLOW flowBlock
            {
            D_FLOW65=(Token)match(input,D_FLOW,FOLLOW_D_FLOW_in_flow788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_FLOW.add(D_FLOW65);


            pushFollow(FOLLOW_flowBlock_in_flow790);
            flowBlock66=flowBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flowBlock.add(flowBlock66.getTree());

            // AST REWRITE
            // elements: flowBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:3: -> flowBlock
            {
                adaptor.addChild(root_0, stream_flowBlock.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, flow_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "flow"


    public static class flowBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flowBlock"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:147:1: flowBlock : D_BEGIN ( statement )* D_END SEMI -> ^( FLOW_BLOCK ( statement )* ) ;
    public final GDTSTaskParser.flowBlock_return flowBlock() throws RecognitionException {
        GDTSTaskParser.flowBlock_return retval = new GDTSTaskParser.flowBlock_return();
        retval.start = input.LT(1);

        int flowBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_BEGIN67=null;
        Token D_END69=null;
        Token SEMI70=null;
        GDTSTaskParser.statement_return statement68 =null;


        CommonTree D_BEGIN67_tree=null;
        CommonTree D_END69_tree=null;
        CommonTree SEMI70_tree=null;
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:148:2: ( D_BEGIN ( statement )* D_END SEMI -> ^( FLOW_BLOCK ( statement )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:148:4: D_BEGIN ( statement )* D_END SEMI
            {
            D_BEGIN67=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_flowBlock807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_BEGIN.add(D_BEGIN67);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:148:12: ( statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==D_CALL||LA21_0==D_FOR||LA21_0==D_WHILE||LA21_0==ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:148:12: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_flowBlock809);
            	    statement68=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement68.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            D_END69=(Token)match(input,D_END,FOLLOW_D_END_in_flowBlock812); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_END.add(D_END69);


            SEMI70=(Token)match(input,SEMI,FOLLOW_SEMI_in_flowBlock814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI70);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 149:3: -> ^( FLOW_BLOCK ( statement )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:149:6: ^( FLOW_BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FLOW_BLOCK, "FLOW_BLOCK")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:149:19: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, flowBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "flowBlock"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:152:1: statement : ( forLoop -> forLoop | whileLoop -> whileLoop | assignStatement SEMI -> assignStatement | commandCall SEMI -> commandCall );
    public final GDTSTaskParser.statement_return statement() throws RecognitionException {
        GDTSTaskParser.statement_return retval = new GDTSTaskParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token SEMI74=null;
        Token SEMI76=null;
        GDTSTaskParser.forLoop_return forLoop71 =null;

        GDTSTaskParser.whileLoop_return whileLoop72 =null;

        GDTSTaskParser.assignStatement_return assignStatement73 =null;

        GDTSTaskParser.commandCall_return commandCall75 =null;


        CommonTree SEMI74_tree=null;
        CommonTree SEMI76_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_commandCall=new RewriteRuleSubtreeStream(adaptor,"rule commandCall");
        RewriteRuleSubtreeStream stream_assignStatement=new RewriteRuleSubtreeStream(adaptor,"rule assignStatement");
        RewriteRuleSubtreeStream stream_whileLoop=new RewriteRuleSubtreeStream(adaptor,"rule whileLoop");
        RewriteRuleSubtreeStream stream_forLoop=new RewriteRuleSubtreeStream(adaptor,"rule forLoop");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:153:2: ( forLoop -> forLoop | whileLoop -> whileLoop | assignStatement SEMI -> assignStatement | commandCall SEMI -> commandCall )
            int alt22=4;
            switch ( input.LA(1) ) {
            case D_FOR:
                {
                alt22=1;
                }
                break;
            case D_WHILE:
                {
                alt22=2;
                }
                break;
            case ID:
                {
                alt22=3;
                }
                break;
            case D_CALL:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:153:4: forLoop
                    {
                    pushFollow(FOLLOW_forLoop_in_statement837);
                    forLoop71=forLoop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forLoop.add(forLoop71.getTree());

                    // AST REWRITE
                    // elements: forLoop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 154:3: -> forLoop
                    {
                        adaptor.addChild(root_0, stream_forLoop.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:155:4: whileLoop
                    {
                    pushFollow(FOLLOW_whileLoop_in_statement848);
                    whileLoop72=whileLoop();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whileLoop.add(whileLoop72.getTree());

                    // AST REWRITE
                    // elements: whileLoop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 156:3: -> whileLoop
                    {
                        adaptor.addChild(root_0, stream_whileLoop.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:157:4: assignStatement SEMI
                    {
                    pushFollow(FOLLOW_assignStatement_in_statement860);
                    assignStatement73=assignStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignStatement.add(assignStatement73.getTree());

                    SEMI74=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI74);


                    // AST REWRITE
                    // elements: assignStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:3: -> assignStatement
                    {
                        adaptor.addChild(root_0, stream_assignStatement.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:159:5: commandCall SEMI
                    {
                    pushFollow(FOLLOW_commandCall_in_statement874);
                    commandCall75=commandCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commandCall.add(commandCall75.getTree());

                    SEMI76=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI76);


                    // AST REWRITE
                    // elements: commandCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 160:3: -> commandCall
                    {
                        adaptor.addChild(root_0, stream_commandCall.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class forLoop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forLoop"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:163:1: forLoop : D_FOR (initAssign= assignStatement )? SEMI booleanExpr SEMI actionAssign= assignStatement flowBlock -> ^( FOR_LOOP ( ^( FOR_INIT $initAssign) )? ^( CONDITION booleanExpr ) ^( FOR_ACTION $actionAssign) flowBlock ) ;
    public final GDTSTaskParser.forLoop_return forLoop() throws RecognitionException {
        GDTSTaskParser.forLoop_return retval = new GDTSTaskParser.forLoop_return();
        retval.start = input.LT(1);

        int forLoop_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_FOR77=null;
        Token SEMI78=null;
        Token SEMI80=null;
        GDTSTaskParser.assignStatement_return initAssign =null;

        GDTSTaskParser.assignStatement_return actionAssign =null;

        GDTSTaskParser.booleanExpr_return booleanExpr79 =null;

        GDTSTaskParser.flowBlock_return flowBlock81 =null;


        CommonTree D_FOR77_tree=null;
        CommonTree SEMI78_tree=null;
        CommonTree SEMI80_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_D_FOR=new RewriteRuleTokenStream(adaptor,"token D_FOR");
        RewriteRuleSubtreeStream stream_booleanExpr=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpr");
        RewriteRuleSubtreeStream stream_flowBlock=new RewriteRuleSubtreeStream(adaptor,"rule flowBlock");
        RewriteRuleSubtreeStream stream_assignStatement=new RewriteRuleSubtreeStream(adaptor,"rule assignStatement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:164:2: ( D_FOR (initAssign= assignStatement )? SEMI booleanExpr SEMI actionAssign= assignStatement flowBlock -> ^( FOR_LOOP ( ^( FOR_INIT $initAssign) )? ^( CONDITION booleanExpr ) ^( FOR_ACTION $actionAssign) flowBlock ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:164:4: D_FOR (initAssign= assignStatement )? SEMI booleanExpr SEMI actionAssign= assignStatement flowBlock
            {
            D_FOR77=(Token)match(input,D_FOR,FOLLOW_D_FOR_in_forLoop895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_FOR.add(D_FOR77);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:164:21: (initAssign= assignStatement )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:164:21: initAssign= assignStatement
                    {
                    pushFollow(FOLLOW_assignStatement_in_forLoop901);
                    initAssign=assignStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignStatement.add(initAssign.getTree());

                    }
                    break;

            }


            SEMI78=(Token)match(input,SEMI,FOLLOW_SEMI_in_forLoop904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI78);


            pushFollow(FOLLOW_booleanExpr_in_forLoop906);
            booleanExpr79=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_booleanExpr.add(booleanExpr79.getTree());

            SEMI80=(Token)match(input,SEMI,FOLLOW_SEMI_in_forLoop908); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI80);


            pushFollow(FOLLOW_assignStatement_in_forLoop914);
            actionAssign=assignStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignStatement.add(actionAssign.getTree());

            pushFollow(FOLLOW_flowBlock_in_forLoop916);
            flowBlock81=flowBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flowBlock.add(flowBlock81.getTree());

            // AST REWRITE
            // elements: booleanExpr, actionAssign, flowBlock, initAssign
            // token labels: 
            // rule labels: retval, actionAssign, initAssign
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_actionAssign=new RewriteRuleSubtreeStream(adaptor,"rule actionAssign",actionAssign!=null?actionAssign.tree:null);
            RewriteRuleSubtreeStream stream_initAssign=new RewriteRuleSubtreeStream(adaptor,"rule initAssign",initAssign!=null?initAssign.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 165:3: -> ^( FOR_LOOP ( ^( FOR_INIT $initAssign) )? ^( CONDITION booleanExpr ) ^( FOR_ACTION $actionAssign) flowBlock )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:165:6: ^( FOR_LOOP ( ^( FOR_INIT $initAssign) )? ^( CONDITION booleanExpr ) ^( FOR_ACTION $actionAssign) flowBlock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_LOOP, "FOR_LOOP")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:165:17: ( ^( FOR_INIT $initAssign) )?
                if ( stream_initAssign.hasNext() ) {
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:165:17: ^( FOR_INIT $initAssign)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(FOR_INIT, "FOR_INIT")
                    , root_2);

                    adaptor.addChild(root_2, stream_initAssign.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_initAssign.reset();

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:165:42: ^( CONDITION booleanExpr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_2);

                adaptor.addChild(root_2, stream_booleanExpr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:165:67: ^( FOR_ACTION $actionAssign)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_ACTION, "FOR_ACTION")
                , root_2);

                adaptor.addChild(root_2, stream_actionAssign.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_flowBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, forLoop_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forLoop"


    public static class whileLoop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileLoop"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:168:1: whileLoop : D_WHILE booleanExpr flowBlock -> ^( WHILE_LOOP ^( CONDITION booleanExpr ) flowBlock ) ;
    public final GDTSTaskParser.whileLoop_return whileLoop() throws RecognitionException {
        GDTSTaskParser.whileLoop_return retval = new GDTSTaskParser.whileLoop_return();
        retval.start = input.LT(1);

        int whileLoop_StartIndex = input.index();

        CommonTree root_0 = null;

        Token D_WHILE82=null;
        GDTSTaskParser.booleanExpr_return booleanExpr83 =null;

        GDTSTaskParser.flowBlock_return flowBlock84 =null;


        CommonTree D_WHILE82_tree=null;
        RewriteRuleTokenStream stream_D_WHILE=new RewriteRuleTokenStream(adaptor,"token D_WHILE");
        RewriteRuleSubtreeStream stream_booleanExpr=new RewriteRuleSubtreeStream(adaptor,"rule booleanExpr");
        RewriteRuleSubtreeStream stream_flowBlock=new RewriteRuleSubtreeStream(adaptor,"rule flowBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:169:2: ( D_WHILE booleanExpr flowBlock -> ^( WHILE_LOOP ^( CONDITION booleanExpr ) flowBlock ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:169:4: D_WHILE booleanExpr flowBlock
            {
            D_WHILE82=(Token)match(input,D_WHILE,FOLLOW_D_WHILE_in_whileLoop959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_WHILE.add(D_WHILE82);


            pushFollow(FOLLOW_booleanExpr_in_whileLoop961);
            booleanExpr83=booleanExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_booleanExpr.add(booleanExpr83.getTree());

            pushFollow(FOLLOW_flowBlock_in_whileLoop963);
            flowBlock84=flowBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flowBlock.add(flowBlock84.getTree());

            // AST REWRITE
            // elements: booleanExpr, flowBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 170:3: -> ^( WHILE_LOOP ^( CONDITION booleanExpr ) flowBlock )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:170:6: ^( WHILE_LOOP ^( CONDITION booleanExpr ) flowBlock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE_LOOP, "WHILE_LOOP")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:170:19: ^( CONDITION booleanExpr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_2);

                adaptor.addChild(root_2, stream_booleanExpr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_flowBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, whileLoop_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileLoop"


    public static class assignStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignStatement"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:173:1: assignStatement : varRef ( OPER_ASSIGN expr -> ^( ASSIGNMENT varRef expr ) | OPER_INC -> ^( ASSIGNMENT varRef INCREMENT ) | OPER_DEC -> ^( ASSIGNMENT varRef DECREMENT ) ) ;
    public final GDTSTaskParser.assignStatement_return assignStatement() throws RecognitionException {
        GDTSTaskParser.assignStatement_return retval = new GDTSTaskParser.assignStatement_return();
        retval.start = input.LT(1);

        int assignStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token OPER_ASSIGN86=null;
        Token OPER_INC88=null;
        Token OPER_DEC89=null;
        GDTSTaskParser.varRef_return varRef85 =null;

        GDTSTaskParser.expr_return expr87 =null;


        CommonTree OPER_ASSIGN86_tree=null;
        CommonTree OPER_INC88_tree=null;
        CommonTree OPER_DEC89_tree=null;
        RewriteRuleTokenStream stream_OPER_DEC=new RewriteRuleTokenStream(adaptor,"token OPER_DEC");
        RewriteRuleTokenStream stream_OPER_ASSIGN=new RewriteRuleTokenStream(adaptor,"token OPER_ASSIGN");
        RewriteRuleTokenStream stream_OPER_INC=new RewriteRuleTokenStream(adaptor,"token OPER_INC");
        RewriteRuleSubtreeStream stream_varRef=new RewriteRuleSubtreeStream(adaptor,"rule varRef");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:174:2: ( varRef ( OPER_ASSIGN expr -> ^( ASSIGNMENT varRef expr ) | OPER_INC -> ^( ASSIGNMENT varRef INCREMENT ) | OPER_DEC -> ^( ASSIGNMENT varRef DECREMENT ) ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:174:4: varRef ( OPER_ASSIGN expr -> ^( ASSIGNMENT varRef expr ) | OPER_INC -> ^( ASSIGNMENT varRef INCREMENT ) | OPER_DEC -> ^( ASSIGNMENT varRef DECREMENT ) )
            {
            pushFollow(FOLLOW_varRef_in_assignStatement991);
            varRef85=varRef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varRef.add(varRef85.getTree());

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:175:3: ( OPER_ASSIGN expr -> ^( ASSIGNMENT varRef expr ) | OPER_INC -> ^( ASSIGNMENT varRef INCREMENT ) | OPER_DEC -> ^( ASSIGNMENT varRef DECREMENT ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case OPER_ASSIGN:
                {
                alt24=1;
                }
                break;
            case OPER_INC:
                {
                alt24=2;
                }
                break;
            case OPER_DEC:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:175:4: OPER_ASSIGN expr
                    {
                    OPER_ASSIGN86=(Token)match(input,OPER_ASSIGN,FOLLOW_OPER_ASSIGN_in_assignStatement997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPER_ASSIGN.add(OPER_ASSIGN86);


                    pushFollow(FOLLOW_expr_in_assignStatement999);
                    expr87=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr87.getTree());

                    // AST REWRITE
                    // elements: varRef, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 176:3: -> ^( ASSIGNMENT varRef expr )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:176:6: ^( ASSIGNMENT varRef expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_varRef.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:177:5: OPER_INC
                    {
                    OPER_INC88=(Token)match(input,OPER_INC,FOLLOW_OPER_INC_in_assignStatement1018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPER_INC.add(OPER_INC88);


                    // AST REWRITE
                    // elements: varRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 178:3: -> ^( ASSIGNMENT varRef INCREMENT )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:178:6: ^( ASSIGNMENT varRef INCREMENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_varRef.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(INCREMENT, "INCREMENT")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:179:4: OPER_DEC
                    {
                    OPER_DEC89=(Token)match(input,OPER_DEC,FOLLOW_OPER_DEC_in_assignStatement1036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OPER_DEC.add(OPER_DEC89);


                    // AST REWRITE
                    // elements: varRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 180:3: -> ^( ASSIGNMENT varRef DECREMENT )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:180:6: ^( ASSIGNMENT varRef DECREMENT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

                        adaptor.addChild(root_1, stream_varRef.nextTree());

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(DECREMENT, "DECREMENT")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, assignStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignStatement"


    public static class booleanExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanExpr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:183:1: booleanExpr : expr operBool expr ;
    public final GDTSTaskParser.booleanExpr_return booleanExpr() throws RecognitionException {
        GDTSTaskParser.booleanExpr_return retval = new GDTSTaskParser.booleanExpr_return();
        retval.start = input.LT(1);

        int booleanExpr_StartIndex = input.index();

        CommonTree root_0 = null;

        GDTSTaskParser.expr_return expr90 =null;

        GDTSTaskParser.operBool_return operBool91 =null;

        GDTSTaskParser.expr_return expr92 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:184:2: ( expr operBool expr )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:184:4: expr operBool expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_booleanExpr1061);
            expr90=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr90.getTree());

            pushFollow(FOLLOW_operBool_in_booleanExpr1063);
            operBool91=operBool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operBool91.getTree());

            pushFollow(FOLLOW_expr_in_booleanExpr1065);
            expr92=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr92.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, booleanExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "booleanExpr"


    public static class commandCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandCall"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:187:1: commandCall : D_CALL (alias= ID DOT )? procName= ID ( parameterList )? -> ^( COMMAND_CALL ( $alias)? $procName ( parameterList )? ) ;
    public final GDTSTaskParser.commandCall_return commandCall() throws RecognitionException {
        GDTSTaskParser.commandCall_return retval = new GDTSTaskParser.commandCall_return();
        retval.start = input.LT(1);

        int commandCall_StartIndex = input.index();

        CommonTree root_0 = null;

        Token alias=null;
        Token procName=null;
        Token D_CALL93=null;
        Token DOT94=null;
        GDTSTaskParser.parameterList_return parameterList95 =null;


        CommonTree alias_tree=null;
        CommonTree procName_tree=null;
        CommonTree D_CALL93_tree=null;
        CommonTree DOT94_tree=null;
        RewriteRuleTokenStream stream_D_CALL=new RewriteRuleTokenStream(adaptor,"token D_CALL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:188:2: ( D_CALL (alias= ID DOT )? procName= ID ( parameterList )? -> ^( COMMAND_CALL ( $alias)? $procName ( parameterList )? ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:188:4: D_CALL (alias= ID DOT )? procName= ID ( parameterList )?
            {
            D_CALL93=(Token)match(input,D_CALL,FOLLOW_D_CALL_in_commandCall1077); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_D_CALL.add(D_CALL93);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:188:11: (alias= ID DOT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOT) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:188:12: alias= ID DOT
                    {
                    alias=(Token)match(input,ID,FOLLOW_ID_in_commandCall1084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(alias);


                    DOT94=(Token)match(input,DOT,FOLLOW_DOT_in_commandCall1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT94);


                    }
                    break;

            }


            procName=(Token)match(input,ID,FOLLOW_ID_in_commandCall1094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(procName);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:188:43: ( parameterList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:188:43: parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_commandCall1096);
                    parameterList95=parameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterList.add(parameterList95.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: parameterList, alias, procName
            // token labels: alias, procName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_alias=new RewriteRuleTokenStream(adaptor,"token alias",alias);
            RewriteRuleTokenStream stream_procName=new RewriteRuleTokenStream(adaptor,"token procName",procName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 189:3: -> ^( COMMAND_CALL ( $alias)? $procName ( parameterList )? )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:189:6: ^( COMMAND_CALL ( $alias)? $procName ( parameterList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COMMAND_CALL, "COMMAND_CALL")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:189:22: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextNode());

                }
                stream_alias.reset();

                adaptor.addChild(root_1, stream_procName.nextNode());

                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:189:39: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, commandCall_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "commandCall"


    public static class parameterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterList"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:192:1: parameterList :ids+= ID ARROW exprs+= expr ( COMMA ids+= ID ARROW exprs+= expr )* -> ( ^( PARAM $ids $exprs) )* ;
    public final GDTSTaskParser.parameterList_return parameterList() throws RecognitionException {
        GDTSTaskParser.parameterList_return retval = new GDTSTaskParser.parameterList_return();
        retval.start = input.LT(1);

        int parameterList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ARROW96=null;
        Token COMMA97=null;
        Token ARROW98=null;
        Token ids=null;
        List list_ids=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        CommonTree ARROW96_tree=null;
        CommonTree COMMA97_tree=null;
        CommonTree ARROW98_tree=null;
        CommonTree ids_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:193:2: (ids+= ID ARROW exprs+= expr ( COMMA ids+= ID ARROW exprs+= expr )* -> ( ^( PARAM $ids $exprs) )* )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:193:4: ids+= ID ARROW exprs+= expr ( COMMA ids+= ID ARROW exprs+= expr )*
            {
            ids=(Token)match(input,ID,FOLLOW_ID_in_parameterList1131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ids);

            if (list_ids==null) list_ids=new ArrayList();
            list_ids.add(ids);


            ARROW96=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameterList1133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARROW.add(ARROW96);


            pushFollow(FOLLOW_expr_in_parameterList1139);
            exprs=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:193:34: ( COMMA ids+= ID ARROW exprs+= expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:193:35: COMMA ids+= ID ARROW exprs+= expr
            	    {
            	    COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameterList1142); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA97);


            	    ids=(Token)match(input,ID,FOLLOW_ID_in_parameterList1148); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ids);

            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    ARROW98=(Token)match(input,ARROW,FOLLOW_ARROW_in_parameterList1150); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ARROW.add(ARROW98);


            	    pushFollow(FOLLOW_expr_in_parameterList1156);
            	    exprs=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // AST REWRITE
            // elements: ids, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: ids
            // rule list labels: exprs
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_ids=new RewriteRuleTokenStream(adaptor,"token ids", list_ids);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (CommonTree)adaptor.nil();
            // 194:3: -> ( ^( PARAM $ids $exprs) )*
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:194:6: ( ^( PARAM $ids $exprs) )*
                while ( stream_ids.hasNext()||stream_exprs.hasNext() ) {
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:194:6: ^( PARAM $ids $exprs)
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(PARAM, "PARAM")
                    , root_1);

                    adaptor.addChild(root_1, stream_ids.nextNode());

                    adaptor.addChild(root_1, stream_exprs.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ids.reset();
                stream_exprs.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parameterList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameterList"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:197:1: expr : ( ID | VALUE | arrayRef | matrixRef );
    public final GDTSTaskParser.expr_return expr() throws RecognitionException {
        GDTSTaskParser.expr_return retval = new GDTSTaskParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID99=null;
        Token VALUE100=null;
        GDTSTaskParser.arrayRef_return arrayRef101 =null;

        GDTSTaskParser.matrixRef_return matrixRef102 =null;


        CommonTree ID99_tree=null;
        CommonTree VALUE100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:197:6: ( ID | VALUE | arrayRef | matrixRef )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==OPEN_S) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==ID) ) {
                        int LA28_5 = input.LA(4);

                        if ( (LA28_5==COMMA) ) {
                            alt28=4;
                        }
                        else if ( (LA28_5==CLOSE_S) ) {
                            alt28=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA28_3==VALUE) ) {
                        int LA28_6 = input.LA(4);

                        if ( (LA28_6==COMMA) ) {
                            alt28=4;
                        }
                        else if ( (LA28_6==CLOSE_S) ) {
                            alt28=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 6, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA28_1==EOF||LA28_1==COMMA||LA28_1==D_BEGIN||(LA28_1 >= OPER_EQ && LA28_1 <= OPER_GE)||(LA28_1 >= OPER_L && LA28_1 <= SEMI)) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA28_0==VALUE) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:197:8: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID99=(Token)match(input,ID,FOLLOW_ID_in_expr1183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID99_tree = 
                    (CommonTree)adaptor.create(ID99)
                    ;
                    adaptor.addChild(root_0, ID99_tree);
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:197:13: VALUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    VALUE100=(Token)match(input,VALUE,FOLLOW_VALUE_in_expr1187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VALUE100_tree = 
                    (CommonTree)adaptor.create(VALUE100)
                    ;
                    adaptor.addChild(root_0, VALUE100_tree);
                    }

                    }
                    break;
                case 3 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:197:21: arrayRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_arrayRef_in_expr1191);
                    arrayRef101=arrayRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayRef101.getTree());

                    }
                    break;
                case 4 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:197:32: matrixRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_matrixRef_in_expr1195);
                    matrixRef102=matrixRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, matrixRef102.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class varRef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varRef"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:200:1: varRef : ( ID | arrayRef );
    public final GDTSTaskParser.varRef_return varRef() throws RecognitionException {
        GDTSTaskParser.varRef_return retval = new GDTSTaskParser.varRef_return();
        retval.start = input.LT(1);

        int varRef_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID103=null;
        GDTSTaskParser.arrayRef_return arrayRef104 =null;


        CommonTree ID103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:200:8: ( ID | arrayRef )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1 >= OPER_ASSIGN && LA29_1 <= OPER_DEC)||LA29_1==OPER_INC) ) {
                    alt29=1;
                }
                else if ( (LA29_1==OPEN_S) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:200:10: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID103=(Token)match(input,ID,FOLLOW_ID_in_varRef1205); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID103_tree = 
                    (CommonTree)adaptor.create(ID103)
                    ;
                    adaptor.addChild(root_0, ID103_tree);
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:200:15: arrayRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_arrayRef_in_varRef1209);
                    arrayRef104=arrayRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayRef104.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, varRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varRef"


    public static class arrayRef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayRef"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:203:1: arrayRef : ID ( OPEN_S arrayIndex CLOSE_S )+ -> ^( ARRAY_REF ID ( arrayIndex )+ ) ;
    public final GDTSTaskParser.arrayRef_return arrayRef() throws RecognitionException {
        GDTSTaskParser.arrayRef_return retval = new GDTSTaskParser.arrayRef_return();
        retval.start = input.LT(1);

        int arrayRef_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID105=null;
        Token OPEN_S106=null;
        Token CLOSE_S108=null;
        GDTSTaskParser.arrayIndex_return arrayIndex107 =null;


        CommonTree ID105_tree=null;
        CommonTree OPEN_S106_tree=null;
        CommonTree CLOSE_S108_tree=null;
        RewriteRuleTokenStream stream_OPEN_S=new RewriteRuleTokenStream(adaptor,"token OPEN_S");
        RewriteRuleTokenStream stream_CLOSE_S=new RewriteRuleTokenStream(adaptor,"token CLOSE_S");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_arrayIndex=new RewriteRuleSubtreeStream(adaptor,"rule arrayIndex");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:204:2: ( ID ( OPEN_S arrayIndex CLOSE_S )+ -> ^( ARRAY_REF ID ( arrayIndex )+ ) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:204:4: ID ( OPEN_S arrayIndex CLOSE_S )+
            {
            ID105=(Token)match(input,ID,FOLLOW_ID_in_arrayRef1221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID105);


            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:204:7: ( OPEN_S arrayIndex CLOSE_S )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OPEN_S) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:204:8: OPEN_S arrayIndex CLOSE_S
            	    {
            	    OPEN_S106=(Token)match(input,OPEN_S,FOLLOW_OPEN_S_in_arrayRef1224); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OPEN_S.add(OPEN_S106);


            	    pushFollow(FOLLOW_arrayIndex_in_arrayRef1226);
            	    arrayIndex107=arrayIndex();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arrayIndex.add(arrayIndex107.getTree());

            	    CLOSE_S108=(Token)match(input,CLOSE_S,FOLLOW_CLOSE_S_in_arrayRef1228); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_CLOSE_S.add(CLOSE_S108);


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            // AST REWRITE
            // elements: arrayIndex, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 204:36: -> ^( ARRAY_REF ID ( arrayIndex )+ )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:204:39: ^( ARRAY_REF ID ( arrayIndex )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARRAY_REF, "ARRAY_REF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                if ( !(stream_arrayIndex.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_arrayIndex.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayIndex.nextTree());

                }
                stream_arrayIndex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, arrayRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayRef"


    public static class matrixRef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matrixRef"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:207:1: matrixRef : ID OPEN_S indexY= arrayIndex COMMA indexX= arrayIndex CLOSE_S -> ^( MATRIX_REF ID $indexY $indexX) ;
    public final GDTSTaskParser.matrixRef_return matrixRef() throws RecognitionException {
        GDTSTaskParser.matrixRef_return retval = new GDTSTaskParser.matrixRef_return();
        retval.start = input.LT(1);

        int matrixRef_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID109=null;
        Token OPEN_S110=null;
        Token COMMA111=null;
        Token CLOSE_S112=null;
        GDTSTaskParser.arrayIndex_return indexY =null;

        GDTSTaskParser.arrayIndex_return indexX =null;


        CommonTree ID109_tree=null;
        CommonTree OPEN_S110_tree=null;
        CommonTree COMMA111_tree=null;
        CommonTree CLOSE_S112_tree=null;
        RewriteRuleTokenStream stream_OPEN_S=new RewriteRuleTokenStream(adaptor,"token OPEN_S");
        RewriteRuleTokenStream stream_CLOSE_S=new RewriteRuleTokenStream(adaptor,"token CLOSE_S");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayIndex=new RewriteRuleSubtreeStream(adaptor,"rule arrayIndex");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:208:2: ( ID OPEN_S indexY= arrayIndex COMMA indexX= arrayIndex CLOSE_S -> ^( MATRIX_REF ID $indexY $indexX) )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:208:4: ID OPEN_S indexY= arrayIndex COMMA indexX= arrayIndex CLOSE_S
            {
            ID109=(Token)match(input,ID,FOLLOW_ID_in_matrixRef1253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID109);


            OPEN_S110=(Token)match(input,OPEN_S,FOLLOW_OPEN_S_in_matrixRef1255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OPEN_S.add(OPEN_S110);


            pushFollow(FOLLOW_arrayIndex_in_matrixRef1261);
            indexY=arrayIndex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayIndex.add(indexY.getTree());

            COMMA111=(Token)match(input,COMMA,FOLLOW_COMMA_in_matrixRef1263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA111);


            pushFollow(FOLLOW_arrayIndex_in_matrixRef1269);
            indexX=arrayIndex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayIndex.add(indexX.getTree());

            CLOSE_S112=(Token)match(input,CLOSE_S,FOLLOW_CLOSE_S_in_matrixRef1271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLOSE_S.add(CLOSE_S112);


            // AST REWRITE
            // elements: indexX, indexY, ID
            // token labels: 
            // rule labels: retval, indexX, indexY
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexX=new RewriteRuleSubtreeStream(adaptor,"rule indexX",indexX!=null?indexX.tree:null);
            RewriteRuleSubtreeStream stream_indexY=new RewriteRuleSubtreeStream(adaptor,"rule indexY",indexY!=null?indexY.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 209:3: -> ^( MATRIX_REF ID $indexY $indexX)
            {
                // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:209:6: ^( MATRIX_REF ID $indexY $indexX)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MATRIX_REF, "MATRIX_REF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_indexY.nextTree());

                adaptor.addChild(root_1, stream_indexX.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, matrixRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "matrixRef"


    public static class arrayIndex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayIndex"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:212:1: arrayIndex : ( ID -> ^( INDEX_BY_VAR ID ) | VALUE -> ^( INDEX_BY_VALUE VALUE ) );
    public final GDTSTaskParser.arrayIndex_return arrayIndex() throws RecognitionException {
        GDTSTaskParser.arrayIndex_return retval = new GDTSTaskParser.arrayIndex_return();
        retval.start = input.LT(1);

        int arrayIndex_StartIndex = input.index();

        CommonTree root_0 = null;

        Token ID113=null;
        Token VALUE114=null;

        CommonTree ID113_tree=null;
        CommonTree VALUE114_tree=null;
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:213:2: ( ID -> ^( INDEX_BY_VAR ID ) | VALUE -> ^( INDEX_BY_VALUE VALUE ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==VALUE) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:213:4: ID
                    {
                    ID113=(Token)match(input,ID,FOLLOW_ID_in_arrayIndex1299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID113);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:8: -> ^( INDEX_BY_VAR ID )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:213:11: ^( INDEX_BY_VAR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INDEX_BY_VAR, "INDEX_BY_VAR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:214:5: VALUE
                    {
                    VALUE114=(Token)match(input,VALUE,FOLLOW_VALUE_in_arrayIndex1314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VALUE.add(VALUE114);


                    // AST REWRITE
                    // elements: VALUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:11: -> ^( INDEX_BY_VALUE VALUE )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:214:14: ^( INDEX_BY_VALUE VALUE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INDEX_BY_VALUE, "INDEX_BY_VALUE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VALUE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, arrayIndex_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayIndex"


    public static class operBool_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operBool"
    // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:217:1: operBool : ( OPER_L | OPER_G | OPER_LE | OPER_GE | OPER_EQ | OPER_NEQ );
    public final GDTSTaskParser.operBool_return operBool() throws RecognitionException {
        GDTSTaskParser.operBool_return retval = new GDTSTaskParser.operBool_return();
        retval.start = input.LT(1);

        int operBool_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set115=null;

        CommonTree set115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:218:2: ( OPER_L | OPER_G | OPER_LE | OPER_GE | OPER_EQ | OPER_NEQ )
            // ..\\src\\gdts\\core\\parser\\GDTSTaskParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set115=(Token)input.LT(1);

            if ( (input.LA(1) >= OPER_EQ && input.LA(1) <= OPER_GE)||(input.LA(1) >= OPER_L && input.LA(1) <= OPER_NEQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set115)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, operBool_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "operBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_D_TASK_in_task208 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_task210 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_COLON_in_task213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_VERSION_in_task215 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_task219 = new BitSet(new long[]{0x0000228900000000L});
    public static final BitSet FOLLOW_modulesDescr_in_task223 = new BitSet(new long[]{0x0000220900000000L});
    public static final BitSet FOLLOW_inputDataDescr_in_task228 = new BitSet(new long[]{0x0000220100000000L});
    public static final BitSet FOLLOW_outputDataDescr_in_task233 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_variables_in_task238 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_flow_in_task243 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_slavetask_in_task247 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_D_END_in_task252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_task254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_MODULES_in_modulesDescr329 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_modulesDescr331 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_singleModuleDescr_in_modulesDescr335 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_D_END_in_modulesDescr340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_modulesDescr342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_singleModuleDescr371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_singleModuleDescr373 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_singleModuleDescr381 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000010L});
    public static final BitSet FOLLOW_COLON_in_singleModuleDescr384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_VERSION_in_singleModuleDescr386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_singleModuleDescr390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_IN_in_inputDataDescr432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_inputDataDescr434 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_varDeclaration_in_inputDataDescr438 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_D_END_in_inputDataDescr443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_inputDataDescr445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_OUT_in_outputDataDescr468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_outputDataDescr470 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_varDeclaration_in_outputDataDescr474 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_D_END_in_outputDataDescr479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_outputDataDescr481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_VARS_in_variables504 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_variables506 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_varDeclaration_in_variables510 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_D_END_in_variables517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_variables519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_INOUT_in_inoutDataDescr543 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_inoutDataDescr545 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_varDeclaration_in_inoutDataDescr549 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_D_END_in_inoutDataDescr554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_inoutDataDescr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varDeclaration572 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_varDeclaration575 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration581 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COLON_in_varDeclaration585 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_varDeclaration587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_varDeclaration589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIMPLETYPE_in_type616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_containerType_in_type627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTAINERTYPE_in_containerType645 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_OF_OPER_in_containerType647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SIMPLETYPE_in_containerType649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTAINERTYPE_in_containerType664 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_OF_OPER_in_containerType666 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_containerType_in_containerType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_SLAVETASK_in_slavetask691 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_slavetask693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_D_BEGIN_in_slavetask695 = new BitSet(new long[]{0x0000228900000000L});
    public static final BitSet FOLLOW_modulesDescr_in_slavetask699 = new BitSet(new long[]{0x0000220900000000L});
    public static final BitSet FOLLOW_inputDataDescr_in_slavetask704 = new BitSet(new long[]{0x0000220100000000L});
    public static final BitSet FOLLOW_outputDataDescr_in_slavetask709 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_variables_in_slavetask714 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_flow_in_slavetask719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_D_END_in_slavetask723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_slavetask725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_FLOW_in_flow788 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_flowBlock_in_flow790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_BEGIN_in_flowBlock807 = new BitSet(new long[]{0x0002800200050000L});
    public static final BitSet FOLLOW_statement_in_flowBlock809 = new BitSet(new long[]{0x0002800200050000L});
    public static final BitSet FOLLOW_D_END_in_flowBlock812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_flowBlock814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forLoop_in_statement837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileLoop_in_statement848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_statement860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandCall_in_statement874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_FOR_in_forLoop895 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_assignStatement_in_forLoop901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_forLoop904 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_booleanExpr_in_forLoop906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_forLoop908 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_assignStatement_in_forLoop914 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_flowBlock_in_forLoop916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_WHILE_in_whileLoop959 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_booleanExpr_in_whileLoop961 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_flowBlock_in_whileLoop963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_assignStatement991 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OPER_ASSIGN_in_assignStatement997 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_assignStatement999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPER_INC_in_assignStatement1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPER_DEC_in_assignStatement1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_booleanExpr1061 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_operBool_in_booleanExpr1063 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_booleanExpr1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_CALL_in_commandCall1077 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_commandCall1084 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_commandCall1086 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_commandCall1094 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_parameterList_in_commandCall1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameterList1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_parameterList1133 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_parameterList1139 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_parameterList1142 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_parameterList1148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_parameterList1150 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_expr_in_parameterList1156 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ID_in_expr1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_expr1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayRef_in_expr1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matrixRef_in_expr1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_varRef1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayRef_in_varRef1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayRef1221 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_S_in_arrayRef1224 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_arrayIndex_in_arrayRef1226 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_S_in_arrayRef1228 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ID_in_matrixRef1253 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OPEN_S_in_matrixRef1255 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_arrayIndex_in_matrixRef1261 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_matrixRef1263 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_arrayIndex_in_matrixRef1269 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_S_in_matrixRef1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arrayIndex1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_arrayIndex1314 = new BitSet(new long[]{0x0000000000000002L});

}