// $ANTLR 3.4 ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g 2011-09-20 15:37:51

  package gdts.core.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GDTSInstanceParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "D_BEGIN", "D_CLOSESB", "D_COLON", "D_COMMA", "D_DOT", "D_DQUOTE", "D_END", "D_EQUAL", "D_FALSE", "D_ID", "D_MINUS", "D_OPENSB", "D_SEMI", "D_TASK", "D_TRUE", "D_UNDERSCORE", "D_VERSION", "ID", "LETTER", "NEWLINE", "VBOOLEAN", "VERSION", "VFLOAT", "VINTEGER", "VSTRING", "WS", "DATA", "DESCRIPTION", "TARRAY", "TASK", "TBOOLEAN", "TFLOAT", "TINTEGER", "TMATRIX", "TSTRING", "VALUE", "VAR"
    };

    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int D_BEGIN=5;
    public static final int D_CLOSESB=6;
    public static final int D_COLON=7;
    public static final int D_COMMA=8;
    public static final int D_DOT=9;
    public static final int D_DQUOTE=10;
    public static final int D_END=11;
    public static final int D_EQUAL=12;
    public static final int D_FALSE=13;
    public static final int D_ID=14;
    public static final int D_MINUS=15;
    public static final int D_OPENSB=16;
    public static final int D_SEMI=17;
    public static final int D_TASK=18;
    public static final int D_TRUE=19;
    public static final int D_UNDERSCORE=20;
    public static final int D_VERSION=21;
    public static final int ID=22;
    public static final int LETTER=23;
    public static final int NEWLINE=24;
    public static final int VBOOLEAN=25;
    public static final int VERSION=26;
    public static final int VFLOAT=27;
    public static final int VINTEGER=28;
    public static final int VSTRING=29;
    public static final int WS=30;
    public static final int DATA=31;
    public static final int DESCRIPTION=32;
    public static final int TARRAY=33;
    public static final int TASK=34;
    public static final int TBOOLEAN=35;
    public static final int TFLOAT=36;
    public static final int TINTEGER=37;
    public static final int TMATRIX=38;
    public static final int TSTRING=39;
    public static final int VALUE=40;
    public static final int VAR=41;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GDTSInstanceParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GDTSInstanceParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return GDTSInstanceParser.tokenNames; }
    public String getGrammarFileName() { return "..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g"; }


    public static class instance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instance"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:28:1: instance : taskDescription data -> ^( TASK taskDescription ^( DATA data ) ) ;
    public final GDTSInstanceParser.instance_return instance() throws RecognitionException {
        GDTSInstanceParser.instance_return retval = new GDTSInstanceParser.instance_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        GDTSInstanceParser.taskDescription_return taskDescription1 =null;

        GDTSInstanceParser.data_return data2 =null;


        RewriteRuleSubtreeStream stream_data=new RewriteRuleSubtreeStream(adaptor,"rule data");
        RewriteRuleSubtreeStream stream_taskDescription=new RewriteRuleSubtreeStream(adaptor,"rule taskDescription");
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:29:2: ( taskDescription data -> ^( TASK taskDescription ^( DATA data ) ) )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:29:4: taskDescription data
            {
            pushFollow(FOLLOW_taskDescription_in_instance109);
            taskDescription1=taskDescription();

            state._fsp--;

            stream_taskDescription.add(taskDescription1.getTree());

            pushFollow(FOLLOW_data_in_instance113);
            data2=data();

            state._fsp--;

            stream_data.add(data2.getTree());

            // AST REWRITE
            // elements: data, taskDescription
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:3: -> ^( TASK taskDescription ^( DATA data ) )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:31:6: ^( TASK taskDescription ^( DATA data ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TASK, "TASK")
                , root_1);

                adaptor.addChild(root_1, stream_taskDescription.nextTree());

                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:31:29: ^( DATA data )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DATA, "DATA")
                , root_2);

                adaptor.addChild(root_2, stream_data.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instance"


    public static class taskDescription_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "taskDescription"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:34:1: taskDescription : D_TASK D_BEGIN D_ID D_COLON ID D_SEMI D_VERSION D_COLON VERSION D_SEMI D_END -> ^( DESCRIPTION ID VERSION ) ;
    public final GDTSInstanceParser.taskDescription_return taskDescription() throws RecognitionException {
        GDTSInstanceParser.taskDescription_return retval = new GDTSInstanceParser.taskDescription_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token D_TASK3=null;
        Token D_BEGIN4=null;
        Token D_ID5=null;
        Token D_COLON6=null;
        Token ID7=null;
        Token D_SEMI8=null;
        Token D_VERSION9=null;
        Token D_COLON10=null;
        Token VERSION11=null;
        Token D_SEMI12=null;
        Token D_END13=null;

        CommonTree D_TASK3_tree=null;
        CommonTree D_BEGIN4_tree=null;
        CommonTree D_ID5_tree=null;
        CommonTree D_COLON6_tree=null;
        CommonTree ID7_tree=null;
        CommonTree D_SEMI8_tree=null;
        CommonTree D_VERSION9_tree=null;
        CommonTree D_COLON10_tree=null;
        CommonTree VERSION11_tree=null;
        CommonTree D_SEMI12_tree=null;
        CommonTree D_END13_tree=null;
        RewriteRuleTokenStream stream_D_SEMI=new RewriteRuleTokenStream(adaptor,"token D_SEMI");
        RewriteRuleTokenStream stream_D_VERSION=new RewriteRuleTokenStream(adaptor,"token D_VERSION");
        RewriteRuleTokenStream stream_VERSION=new RewriteRuleTokenStream(adaptor,"token VERSION");
        RewriteRuleTokenStream stream_D_ID=new RewriteRuleTokenStream(adaptor,"token D_ID");
        RewriteRuleTokenStream stream_D_COLON=new RewriteRuleTokenStream(adaptor,"token D_COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_D_TASK=new RewriteRuleTokenStream(adaptor,"token D_TASK");
        RewriteRuleTokenStream stream_D_BEGIN=new RewriteRuleTokenStream(adaptor,"token D_BEGIN");
        RewriteRuleTokenStream stream_D_END=new RewriteRuleTokenStream(adaptor,"token D_END");

        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:35:2: ( D_TASK D_BEGIN D_ID D_COLON ID D_SEMI D_VERSION D_COLON VERSION D_SEMI D_END -> ^( DESCRIPTION ID VERSION ) )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:35:4: D_TASK D_BEGIN D_ID D_COLON ID D_SEMI D_VERSION D_COLON VERSION D_SEMI D_END
            {
            D_TASK3=(Token)match(input,D_TASK,FOLLOW_D_TASK_in_taskDescription141);  
            stream_D_TASK.add(D_TASK3);


            D_BEGIN4=(Token)match(input,D_BEGIN,FOLLOW_D_BEGIN_in_taskDescription143);  
            stream_D_BEGIN.add(D_BEGIN4);


            D_ID5=(Token)match(input,D_ID,FOLLOW_D_ID_in_taskDescription148);  
            stream_D_ID.add(D_ID5);


            D_COLON6=(Token)match(input,D_COLON,FOLLOW_D_COLON_in_taskDescription150);  
            stream_D_COLON.add(D_COLON6);


            ID7=(Token)match(input,ID,FOLLOW_ID_in_taskDescription152);  
            stream_ID.add(ID7);


            D_SEMI8=(Token)match(input,D_SEMI,FOLLOW_D_SEMI_in_taskDescription154);  
            stream_D_SEMI.add(D_SEMI8);


            D_VERSION9=(Token)match(input,D_VERSION,FOLLOW_D_VERSION_in_taskDescription158);  
            stream_D_VERSION.add(D_VERSION9);


            D_COLON10=(Token)match(input,D_COLON,FOLLOW_D_COLON_in_taskDescription160);  
            stream_D_COLON.add(D_COLON10);


            VERSION11=(Token)match(input,VERSION,FOLLOW_VERSION_in_taskDescription162);  
            stream_VERSION.add(VERSION11);


            D_SEMI12=(Token)match(input,D_SEMI,FOLLOW_D_SEMI_in_taskDescription164);  
            stream_D_SEMI.add(D_SEMI12);


            D_END13=(Token)match(input,D_END,FOLLOW_D_END_in_taskDescription168);  
            stream_D_END.add(D_END13);


            // AST REWRITE
            // elements: ID, VERSION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:3: -> ^( DESCRIPTION ID VERSION )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:39:6: ^( DESCRIPTION ID VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESCRIPTION, "DESCRIPTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VERSION.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "taskDescription"


    public static class data_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:42:1: data : ( variable )* ;
    public final GDTSInstanceParser.data_return data() throws RecognitionException {
        GDTSInstanceParser.data_return retval = new GDTSInstanceParser.data_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        GDTSInstanceParser.variable_return variable14 =null;



        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:43:2: ( ( variable )* )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:43:4: ( variable )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:43:4: ( variable )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:43:4: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_data191);
            	    variable14=variable();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variable14.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data"


    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:46:1: variable : ID D_EQUAL value D_SEMI -> ^( VAR ID value ) ;
    public final GDTSInstanceParser.variable_return variable() throws RecognitionException {
        GDTSInstanceParser.variable_return retval = new GDTSInstanceParser.variable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID15=null;
        Token D_EQUAL16=null;
        Token D_SEMI18=null;
        GDTSInstanceParser.value_return value17 =null;


        CommonTree ID15_tree=null;
        CommonTree D_EQUAL16_tree=null;
        CommonTree D_SEMI18_tree=null;
        RewriteRuleTokenStream stream_D_SEMI=new RewriteRuleTokenStream(adaptor,"token D_SEMI");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_D_EQUAL=new RewriteRuleTokenStream(adaptor,"token D_EQUAL");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:47:2: ( ID D_EQUAL value D_SEMI -> ^( VAR ID value ) )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:47:4: ID D_EQUAL value D_SEMI
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_variable205);  
            stream_ID.add(ID15);


            D_EQUAL16=(Token)match(input,D_EQUAL,FOLLOW_D_EQUAL_in_variable207);  
            stream_D_EQUAL.add(D_EQUAL16);


            pushFollow(FOLLOW_value_in_variable209);
            value17=value();

            state._fsp--;

            stream_value.add(value17.getTree());

            D_SEMI18=(Token)match(input,D_SEMI,FOLLOW_D_SEMI_in_variable211);  
            stream_D_SEMI.add(D_SEMI18);


            // AST REWRITE
            // elements: ID, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:3: -> ^( VAR ID value )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:48:6: ^( VAR ID value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:51:1: value : ( simple | container );
    public final GDTSInstanceParser.value_return value() throws RecognitionException {
        GDTSInstanceParser.value_return retval = new GDTSInstanceParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        GDTSInstanceParser.simple_return simple19 =null;

        GDTSInstanceParser.container_return container20 =null;



        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:52:2: ( simple | container )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VBOOLEAN||(LA2_0 >= VFLOAT && LA2_0 <= VSTRING)) ) {
                alt2=1;
            }
            else if ( (LA2_0==D_OPENSB) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:52:4: simple
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_in_value235);
                    simple19=simple();

                    state._fsp--;

                    adaptor.addChild(root_0, simple19.getTree());

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:53:4: container
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_container_in_value240);
                    container20=container();

                    state._fsp--;

                    adaptor.addChild(root_0, container20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class simple_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:56:1: simple : ( VINTEGER -> ^( TINTEGER VINTEGER ) | VFLOAT -> ^( TFLOAT VFLOAT ) | VSTRING -> ^( TSTRING VSTRING ) | VBOOLEAN -> ^( TBOOLEAN VBOOLEAN ) );
    public final GDTSInstanceParser.simple_return simple() throws RecognitionException {
        GDTSInstanceParser.simple_return retval = new GDTSInstanceParser.simple_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VINTEGER21=null;
        Token VFLOAT22=null;
        Token VSTRING23=null;
        Token VBOOLEAN24=null;

        CommonTree VINTEGER21_tree=null;
        CommonTree VFLOAT22_tree=null;
        CommonTree VSTRING23_tree=null;
        CommonTree VBOOLEAN24_tree=null;
        RewriteRuleTokenStream stream_VSTRING=new RewriteRuleTokenStream(adaptor,"token VSTRING");
        RewriteRuleTokenStream stream_VFLOAT=new RewriteRuleTokenStream(adaptor,"token VFLOAT");
        RewriteRuleTokenStream stream_VBOOLEAN=new RewriteRuleTokenStream(adaptor,"token VBOOLEAN");
        RewriteRuleTokenStream stream_VINTEGER=new RewriteRuleTokenStream(adaptor,"token VINTEGER");

        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:57:2: ( VINTEGER -> ^( TINTEGER VINTEGER ) | VFLOAT -> ^( TFLOAT VFLOAT ) | VSTRING -> ^( TSTRING VSTRING ) | VBOOLEAN -> ^( TBOOLEAN VBOOLEAN ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case VINTEGER:
                {
                alt3=1;
                }
                break;
            case VFLOAT:
                {
                alt3=2;
                }
                break;
            case VSTRING:
                {
                alt3=3;
                }
                break;
            case VBOOLEAN:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:57:4: VINTEGER
                    {
                    VINTEGER21=(Token)match(input,VINTEGER,FOLLOW_VINTEGER_in_simple252);  
                    stream_VINTEGER.add(VINTEGER21);


                    // AST REWRITE
                    // elements: VINTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 58:3: -> ^( TINTEGER VINTEGER )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:58:6: ^( TINTEGER VINTEGER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TINTEGER, "TINTEGER")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VINTEGER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:59:4: VFLOAT
                    {
                    VFLOAT22=(Token)match(input,VFLOAT,FOLLOW_VFLOAT_in_simple267);  
                    stream_VFLOAT.add(VFLOAT22);


                    // AST REWRITE
                    // elements: VFLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 60:3: -> ^( TFLOAT VFLOAT )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:60:6: ^( TFLOAT VFLOAT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TFLOAT, "TFLOAT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VFLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:61:4: VSTRING
                    {
                    VSTRING23=(Token)match(input,VSTRING,FOLLOW_VSTRING_in_simple282);  
                    stream_VSTRING.add(VSTRING23);


                    // AST REWRITE
                    // elements: VSTRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:3: -> ^( TSTRING VSTRING )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:62:6: ^( TSTRING VSTRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TSTRING, "TSTRING")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VSTRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:63:5: VBOOLEAN
                    {
                    VBOOLEAN24=(Token)match(input,VBOOLEAN,FOLLOW_VBOOLEAN_in_simple298);  
                    stream_VBOOLEAN.add(VBOOLEAN24);


                    // AST REWRITE
                    // elements: VBOOLEAN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:3: -> ^( TBOOLEAN VBOOLEAN )
                    {
                        // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:64:6: ^( TBOOLEAN VBOOLEAN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TBOOLEAN, "TBOOLEAN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VBOOLEAN.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple"


    public static class container_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "container"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:67:1: container : ( array | matrix );
    public final GDTSInstanceParser.container_return container() throws RecognitionException {
        GDTSInstanceParser.container_return retval = new GDTSInstanceParser.container_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        GDTSInstanceParser.array_return array25 =null;

        GDTSInstanceParser.matrix_return matrix26 =null;



        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:68:2: ( array | matrix )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==D_OPENSB) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==VBOOLEAN||(LA4_1 >= VFLOAT && LA4_1 <= VSTRING)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==D_OPENSB) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:68:4: array
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_container320);
                    array25=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array25.getTree());

                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:69:4: matrix
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_matrix_in_container325);
                    matrix26=matrix();

                    state._fsp--;

                    adaptor.addChild(root_0, matrix26.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "container"


    public static class array_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:72:1: array : D_OPENSB values+= simple ( D_COMMA values+= simple )* D_CLOSESB -> ^( TARRAY ( $values)+ ) ;
    public final GDTSInstanceParser.array_return array() throws RecognitionException {
        GDTSInstanceParser.array_return retval = new GDTSInstanceParser.array_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token D_OPENSB27=null;
        Token D_COMMA28=null;
        Token D_CLOSESB29=null;
        List list_values=null;
        RuleReturnScope values = null;
        CommonTree D_OPENSB27_tree=null;
        CommonTree D_COMMA28_tree=null;
        CommonTree D_CLOSESB29_tree=null;
        RewriteRuleTokenStream stream_D_OPENSB=new RewriteRuleTokenStream(adaptor,"token D_OPENSB");
        RewriteRuleTokenStream stream_D_CLOSESB=new RewriteRuleTokenStream(adaptor,"token D_CLOSESB");
        RewriteRuleTokenStream stream_D_COMMA=new RewriteRuleTokenStream(adaptor,"token D_COMMA");
        RewriteRuleSubtreeStream stream_simple=new RewriteRuleSubtreeStream(adaptor,"rule simple");
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:73:2: ( D_OPENSB values+= simple ( D_COMMA values+= simple )* D_CLOSESB -> ^( TARRAY ( $values)+ ) )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:73:4: D_OPENSB values+= simple ( D_COMMA values+= simple )* D_CLOSESB
            {
            D_OPENSB27=(Token)match(input,D_OPENSB,FOLLOW_D_OPENSB_in_array337);  
            stream_D_OPENSB.add(D_OPENSB27);


            pushFollow(FOLLOW_simple_in_array343);
            values=simple();

            state._fsp--;

            stream_simple.add(values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());


            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:73:30: ( D_COMMA values+= simple )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==D_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:73:31: D_COMMA values+= simple
            	    {
            	    D_COMMA28=(Token)match(input,D_COMMA,FOLLOW_D_COMMA_in_array346);  
            	    stream_D_COMMA.add(D_COMMA28);


            	    pushFollow(FOLLOW_simple_in_array352);
            	    values=simple();

            	    state._fsp--;

            	    stream_simple.add(values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            D_CLOSESB29=(Token)match(input,D_CLOSESB,FOLLOW_D_CLOSESB_in_array357);  
            stream_D_CLOSESB.add(D_CLOSESB29);


            // AST REWRITE
            // elements: values
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: values
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"token values",list_values);
            root_0 = (CommonTree)adaptor.nil();
            // 74:3: -> ^( TARRAY ( $values)+ )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:74:6: ^( TARRAY ( $values)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TARRAY, "TARRAY")
                , root_1);

                if ( !(stream_values.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_values.hasNext() ) {
                    adaptor.addChild(root_1, stream_values.nextTree());

                }
                stream_values.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class matrix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "matrix"
    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:77:1: matrix : D_OPENSB array ( D_COMMA array )* D_CLOSESB -> ^( TMATRIX ( array )* ) ;
    public final GDTSInstanceParser.matrix_return matrix() throws RecognitionException {
        GDTSInstanceParser.matrix_return retval = new GDTSInstanceParser.matrix_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token D_OPENSB30=null;
        Token D_COMMA32=null;
        Token D_CLOSESB34=null;
        GDTSInstanceParser.array_return array31 =null;

        GDTSInstanceParser.array_return array33 =null;


        CommonTree D_OPENSB30_tree=null;
        CommonTree D_COMMA32_tree=null;
        CommonTree D_CLOSESB34_tree=null;
        RewriteRuleTokenStream stream_D_OPENSB=new RewriteRuleTokenStream(adaptor,"token D_OPENSB");
        RewriteRuleTokenStream stream_D_CLOSESB=new RewriteRuleTokenStream(adaptor,"token D_CLOSESB");
        RewriteRuleTokenStream stream_D_COMMA=new RewriteRuleTokenStream(adaptor,"token D_COMMA");
        RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:78:2: ( D_OPENSB array ( D_COMMA array )* D_CLOSESB -> ^( TMATRIX ( array )* ) )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:78:4: D_OPENSB array ( D_COMMA array )* D_CLOSESB
            {
            D_OPENSB30=(Token)match(input,D_OPENSB,FOLLOW_D_OPENSB_in_matrix381);  
            stream_D_OPENSB.add(D_OPENSB30);


            pushFollow(FOLLOW_array_in_matrix383);
            array31=array();

            state._fsp--;

            stream_array.add(array31.getTree());

            // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:78:19: ( D_COMMA array )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==D_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:78:20: D_COMMA array
            	    {
            	    D_COMMA32=(Token)match(input,D_COMMA,FOLLOW_D_COMMA_in_matrix386);  
            	    stream_D_COMMA.add(D_COMMA32);


            	    pushFollow(FOLLOW_array_in_matrix388);
            	    array33=array();

            	    state._fsp--;

            	    stream_array.add(array33.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            D_CLOSESB34=(Token)match(input,D_CLOSESB,FOLLOW_D_CLOSESB_in_matrix392);  
            stream_D_CLOSESB.add(D_CLOSESB34);


            // AST REWRITE
            // elements: array
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:3: -> ^( TMATRIX ( array )* )
            {
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:79:6: ^( TMATRIX ( array )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TMATRIX, "TMATRIX")
                , root_1);

                // ..\\src\\gdts\\core\\parser\\GDTSInstanceParser.g:79:16: ( array )*
                while ( stream_array.hasNext() ) {
                    adaptor.addChild(root_1, stream_array.nextTree());

                }
                stream_array.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "matrix"

    // Delegated rules


 

    public static final BitSet FOLLOW_taskDescription_in_instance109 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_data_in_instance113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_TASK_in_taskDescription141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_D_BEGIN_in_taskDescription143 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_D_ID_in_taskDescription148 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_D_COLON_in_taskDescription150 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_taskDescription152 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_D_SEMI_in_taskDescription154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_D_VERSION_in_taskDescription158 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_D_COLON_in_taskDescription160 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_VERSION_in_taskDescription162 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_D_SEMI_in_taskDescription164 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_D_END_in_taskDescription168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_data191 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ID_in_variable205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_D_EQUAL_in_variable207 = new BitSet(new long[]{0x000000003A010000L});
    public static final BitSet FOLLOW_value_in_variable209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_D_SEMI_in_variable211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_value235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_container_in_value240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VINTEGER_in_simple252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VFLOAT_in_simple267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VSTRING_in_simple282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VBOOLEAN_in_simple298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_container320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matrix_in_container325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_OPENSB_in_array337 = new BitSet(new long[]{0x000000003A000000L});
    public static final BitSet FOLLOW_simple_in_array343 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_D_COMMA_in_array346 = new BitSet(new long[]{0x000000003A000000L});
    public static final BitSet FOLLOW_simple_in_array352 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_D_CLOSESB_in_array357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_D_OPENSB_in_matrix381 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_array_in_matrix383 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_D_COMMA_in_matrix386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_array_in_matrix388 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_D_CLOSESB_in_matrix392 = new BitSet(new long[]{0x0000000000000002L});

}