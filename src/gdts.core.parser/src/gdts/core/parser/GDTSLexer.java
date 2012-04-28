// $ANTLR 3.4 ..\\src\\gdts\\core\\parser\\GDTSLexer.g 2011-09-20 15:37:49

  package gdts.core.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GDTSLexer extends Lexer {
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

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GDTSLexer() {} 
    public GDTSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GDTSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "..\\src\\gdts\\core\\parser\\GDTSLexer.g"; }

    // $ANTLR start "OF_OPER"
    public final void mOF_OPER() throws RecognitionException {
        try {
            int _type = OF_OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:8:2: ( 'OF' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:8:4: 'OF'
            {
            match("OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OF_OPER"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:10:6: ( ';' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:10:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:12:7: ( ':' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:14:5: ( '.' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:14:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "OPEN_B"
    public final void mOPEN_B() throws RecognitionException {
        try {
            int _type = OPEN_B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:16:8: ( '(' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:16:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_B"

    // $ANTLR start "CLOSE_B"
    public final void mCLOSE_B() throws RecognitionException {
        try {
            int _type = CLOSE_B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:18:9: ( ')' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:18:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_B"

    // $ANTLR start "OPEN_S"
    public final void mOPEN_S() throws RecognitionException {
        try {
            int _type = OPEN_S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:20:8: ( '[' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:20:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_S"

    // $ANTLR start "CLOSE_S"
    public final void mCLOSE_S() throws RecognitionException {
        try {
            int _type = CLOSE_S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:23:2: ( ']' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:23:5: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_S"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:25:7: ( ',' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:28:2: ( '_' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:28:4: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:30:7: ( '->' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:30:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "OPER_ASSIGN"
    public final void mOPER_ASSIGN() throws RecognitionException {
        try {
            int _type = OPER_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:33:2: ( '=' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:33:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_ASSIGN"

    // $ANTLR start "OPER_L"
    public final void mOPER_L() throws RecognitionException {
        try {
            int _type = OPER_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:36:8: ( '<' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:36:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_L"

    // $ANTLR start "OPER_G"
    public final void mOPER_G() throws RecognitionException {
        try {
            int _type = OPER_G;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:39:8: ( '>' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:39:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_G"

    // $ANTLR start "OPER_LE"
    public final void mOPER_LE() throws RecognitionException {
        try {
            int _type = OPER_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:42:9: ( '<=' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:42:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_LE"

    // $ANTLR start "OPER_GE"
    public final void mOPER_GE() throws RecognitionException {
        try {
            int _type = OPER_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:45:9: ( '>=' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:45:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_GE"

    // $ANTLR start "OPER_EQ"
    public final void mOPER_EQ() throws RecognitionException {
        try {
            int _type = OPER_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:48:9: ( '==' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:48:11: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_EQ"

    // $ANTLR start "OPER_NEQ"
    public final void mOPER_NEQ() throws RecognitionException {
        try {
            int _type = OPER_NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:51:2: ( '!=' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:51:4: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_NEQ"

    // $ANTLR start "OPER_INC"
    public final void mOPER_INC() throws RecognitionException {
        try {
            int _type = OPER_INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:53:9: ( '++' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:53:11: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_INC"

    // $ANTLR start "OPER_DEC"
    public final void mOPER_DEC() throws RecognitionException {
        try {
            int _type = OPER_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:55:9: ( '--' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:55:11: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER_DEC"

    // $ANTLR start "D_BEGIN"
    public final void mD_BEGIN() throws RecognitionException {
        try {
            int _type = D_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:57:9: ( 'BEGIN' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:57:11: 'BEGIN'
            {
            match("BEGIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_BEGIN"

    // $ANTLR start "D_END"
    public final void mD_END() throws RecognitionException {
        try {
            int _type = D_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:59:7: ( 'END' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:59:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END"

    // $ANTLR start "D_TASK"
    public final void mD_TASK() throws RecognitionException {
        try {
            int _type = D_TASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:61:8: ( 'TASK' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:61:10: 'TASK'
            {
            match("TASK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_TASK"

    // $ANTLR start "D_END_TASK"
    public final void mD_END_TASK() throws RecognitionException {
        try {
            int _type = D_END_TASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:64:2: ( D_END WS D_TASK )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:64:4: D_END WS D_TASK
            {
            mD_END(); 


            mWS(); 


            mD_TASK(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_TASK"

    // $ANTLR start "D_NAME"
    public final void mD_NAME() throws RecognitionException {
        try {
            int _type = D_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:66:8: ( 'NAME' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:66:10: 'NAME'
            {
            match("NAME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_NAME"

    // $ANTLR start "D_VERSION"
    public final void mD_VERSION() throws RecognitionException {
        try {
            int _type = D_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:69:2: ( 'VERSION' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:69:4: 'VERSION'
            {
            match("VERSION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_VERSION"

    // $ANTLR start "D_MODULES"
    public final void mD_MODULES() throws RecognitionException {
        try {
            int _type = D_MODULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:72:2: ( 'MODULES' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:72:4: 'MODULES'
            {
            match("MODULES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_MODULES"

    // $ANTLR start "D_END_MODULES"
    public final void mD_END_MODULES() throws RecognitionException {
        try {
            int _type = D_END_MODULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:75:2: ( D_END D_MODULES )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:75:4: D_END D_MODULES
            {
            mD_END(); 


            mD_MODULES(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_MODULES"

    // $ANTLR start "D_MASTER"
    public final void mD_MASTER() throws RecognitionException {
        try {
            int _type = D_MASTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:78:2: ( 'MASTER' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:78:4: 'MASTER'
            {
            match("MASTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_MASTER"

    // $ANTLR start "D_END_MASTER"
    public final void mD_END_MASTER() throws RecognitionException {
        try {
            int _type = D_END_MASTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:81:2: ( D_END D_MASTER )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:81:4: D_END D_MASTER
            {
            mD_END(); 


            mD_MASTER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_MASTER"

    // $ANTLR start "D_MODULE"
    public final void mD_MODULE() throws RecognitionException {
        try {
            int _type = D_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:84:2: ( 'MODULE' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:84:4: 'MODULE'
            {
            match("MODULE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_MODULE"

    // $ANTLR start "D_END_MODULE"
    public final void mD_END_MODULE() throws RecognitionException {
        try {
            int _type = D_END_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:87:2: ( D_END D_MODULE )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:87:4: D_END D_MODULE
            {
            mD_END(); 


            mD_MODULE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_MODULE"

    // $ANTLR start "D_ALIAS"
    public final void mD_ALIAS() throws RecognitionException {
        try {
            int _type = D_ALIAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:89:9: ( 'ALIAS' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:89:11: 'ALIAS'
            {
            match("ALIAS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_ALIAS"

    // $ANTLR start "D_SLAVES"
    public final void mD_SLAVES() throws RecognitionException {
        try {
            int _type = D_SLAVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:92:2: ( 'SLAVES' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:92:4: 'SLAVES'
            {
            match("SLAVES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_SLAVES"

    // $ANTLR start "D_END_SLAVE"
    public final void mD_END_SLAVE() throws RecognitionException {
        try {
            int _type = D_END_SLAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:95:2: ( D_END D_SLAVES )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:95:4: D_END D_SLAVES
            {
            mD_END(); 


            mD_SLAVES(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_SLAVE"

    // $ANTLR start "D_IN"
    public final void mD_IN() throws RecognitionException {
        try {
            int _type = D_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:97:6: ( 'IN' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:97:8: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_IN"

    // $ANTLR start "D_END_IN"
    public final void mD_END_IN() throws RecognitionException {
        try {
            int _type = D_END_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:100:2: ( D_END D_IN )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:100:4: D_END D_IN
            {
            mD_END(); 


            mD_IN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_IN"

    // $ANTLR start "D_OUT"
    public final void mD_OUT() throws RecognitionException {
        try {
            int _type = D_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:102:7: ( 'OUT' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:102:9: 'OUT'
            {
            match("OUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_OUT"

    // $ANTLR start "D_INOUT"
    public final void mD_INOUT() throws RecognitionException {
        try {
            int _type = D_INOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:104:9: ( 'INOUT' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:104:11: 'INOUT'
            {
            match("INOUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_INOUT"

    // $ANTLR start "D_END_OUT"
    public final void mD_END_OUT() throws RecognitionException {
        try {
            int _type = D_END_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:107:2: ( D_END D_OUT )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:107:4: D_END D_OUT
            {
            mD_END(); 


            mD_OUT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_OUT"

    // $ANTLR start "D_VARS"
    public final void mD_VARS() throws RecognitionException {
        try {
            int _type = D_VARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:109:8: ( 'VARS' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:109:10: 'VARS'
            {
            match("VARS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_VARS"

    // $ANTLR start "D_END_VARS"
    public final void mD_END_VARS() throws RecognitionException {
        try {
            int _type = D_END_VARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:112:2: ( D_END D_VARS )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:112:4: D_END D_VARS
            {
            mD_END(); 


            mD_VARS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_VARS"

    // $ANTLR start "D_SLAVETASK"
    public final void mD_SLAVETASK() throws RecognitionException {
        try {
            int _type = D_SLAVETASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:115:2: ( 'SLAVETASK' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:115:4: 'SLAVETASK'
            {
            match("SLAVETASK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_SLAVETASK"

    // $ANTLR start "D_END_SLAVETASK"
    public final void mD_END_SLAVETASK() throws RecognitionException {
        try {
            int _type = D_END_SLAVETASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:118:2: ( D_END D_SLAVETASK )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:118:4: D_END D_SLAVETASK
            {
            mD_END(); 


            mD_SLAVETASK(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_SLAVETASK"

    // $ANTLR start "D_FLOW"
    public final void mD_FLOW() throws RecognitionException {
        try {
            int _type = D_FLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:120:8: ( 'FLOW' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:120:10: 'FLOW'
            {
            match("FLOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_FLOW"

    // $ANTLR start "D_END_FLOW"
    public final void mD_END_FLOW() throws RecognitionException {
        try {
            int _type = D_END_FLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:122:11: ( D_END D_FLOW )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:122:13: D_END D_FLOW
            {
            mD_END(); 


            mD_FLOW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_FLOW"

    // $ANTLR start "D_IF"
    public final void mD_IF() throws RecognitionException {
        try {
            int _type = D_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:124:6: ( 'IF' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:124:8: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_IF"

    // $ANTLR start "D_END_IF"
    public final void mD_END_IF() throws RecognitionException {
        try {
            int _type = D_END_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:127:2: ( D_END D_IF )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:127:4: D_END D_IF
            {
            mD_END(); 


            mD_IF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_IF"

    // $ANTLR start "D_FOR"
    public final void mD_FOR() throws RecognitionException {
        try {
            int _type = D_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:129:7: ( 'FOR' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:129:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_FOR"

    // $ANTLR start "D_END_FOR"
    public final void mD_END_FOR() throws RecognitionException {
        try {
            int _type = D_END_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:132:2: ( D_END D_FOR )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:132:4: D_END D_FOR
            {
            mD_END(); 


            mD_FOR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_FOR"

    // $ANTLR start "D_ELSE"
    public final void mD_ELSE() throws RecognitionException {
        try {
            int _type = D_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:134:8: ( 'ELSE' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:134:10: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_ELSE"

    // $ANTLR start "D_WHILE"
    public final void mD_WHILE() throws RecognitionException {
        try {
            int _type = D_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:136:9: ( 'WHILE' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:136:11: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_WHILE"

    // $ANTLR start "D_END_WHILE"
    public final void mD_END_WHILE() throws RecognitionException {
        try {
            int _type = D_END_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:139:2: ( D_END D_WHILE )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:139:4: D_END D_WHILE
            {
            mD_END(); 


            mD_WHILE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_END_WHILE"

    // $ANTLR start "D_CALL"
    public final void mD_CALL() throws RecognitionException {
        try {
            int _type = D_CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:141:8: ( 'CALL' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:141:10: 'CALL'
            {
            match("CALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_CALL"

    // $ANTLR start "SIMPLETYPE"
    public final void mSIMPLETYPE() throws RecognitionException {
        try {
            int _type = SIMPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:144:2: ( 'INTEGER' | 'FLOAT' | 'BOOLEAN' | 'STRING' | 'SLAVETASKOBJ' | 'SLAVEOBJ' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'I':
                {
                alt1=1;
                }
                break;
            case 'F':
                {
                alt1=2;
                }
                break;
            case 'B':
                {
                alt1=3;
                }
                break;
            case 'S':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='T') ) {
                    alt1=4;
                }
                else if ( (LA1_4=='L') ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6=='A') ) {
                        int LA1_7 = input.LA(4);

                        if ( (LA1_7=='V') ) {
                            int LA1_8 = input.LA(5);

                            if ( (LA1_8=='E') ) {
                                int LA1_9 = input.LA(6);

                                if ( (LA1_9=='T') ) {
                                    alt1=5;
                                }
                                else if ( (LA1_9=='O') ) {
                                    alt1=6;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 9, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:144:4: 'INTEGER'
                    {
                    match("INTEGER"); 



                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:145:4: 'FLOAT'
                    {
                    match("FLOAT"); 



                    }
                    break;
                case 3 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:146:4: 'BOOLEAN'
                    {
                    match("BOOLEAN"); 



                    }
                    break;
                case 4 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:147:5: 'STRING'
                    {
                    match("STRING"); 



                    }
                    break;
                case 5 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:148:5: 'SLAVETASKOBJ'
                    {
                    match("SLAVETASKOBJ"); 



                    }
                    break;
                case 6 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:149:5: 'SLAVEOBJ'
                    {
                    match("SLAVEOBJ"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMPLETYPE"

    // $ANTLR start "CONTAINERTYPE"
    public final void mCONTAINERTYPE() throws RecognitionException {
        try {
            int _type = CONTAINERTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:153:2: ( 'ARRAY' | 'MATRIX' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='A') ) {
                alt2=1;
            }
            else if ( (LA2_0=='M') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:153:4: 'ARRAY'
                    {
                    match("ARRAY"); 



                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:153:14: 'MATRIX'
                    {
                    match("MATRIX"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINERTYPE"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:156:2: ( INTEGER | FLOAT | STRING | BOOLEAN | NULL )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:156:4: INTEGER
                    {
                    mINTEGER(); 


                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:157:5: FLOAT
                    {
                    mFLOAT(); 


                    }
                    break;
                case 3 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:158:4: STRING
                    {
                    mSTRING(); 


                    }
                    break;
                case 4 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:159:4: BOOLEAN
                    {
                    mBOOLEAN(); 


                    }
                    break;
                case 5 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:160:4: NULL
                    {
                    mNULL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:163:7: ( '0' .. '9' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LOWER_CASE"
    public final void mLOWER_CASE() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:167:2: ( 'a' .. 'z' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWER_CASE"

    // $ANTLR start "UPPER_CASE"
    public final void mUPPER_CASE() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:171:2: ( 'A' .. 'Z' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPPER_CASE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:175:2: ( UPPER_CASE | LOWER_CASE )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:180:2: ( ( DIGIT )+ )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:180:4: ( DIGIT )+
            {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:180:4: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:183:7: ( ( DIGIT )* DOT ( DIGIT )+ )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:183:9: ( DIGIT )* DOT ( DIGIT )+
            {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:183:9: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            mDOT(); 


            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:183:20: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:186:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:187:4: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:187:8: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:191:2: ( 'NULL' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:191:4: 'NULL'
            {
            match("NULL"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:195:2: ( 'TRUE' | 'FALSE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='T') ) {
                alt8=1;
            }
            else if ( (LA8_0=='F') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:195:4: 'TRUE'
                    {
                    match("TRUE"); 



                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:195:13: 'FALSE'
                    {
                    match("FALSE"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:197:4: ( LETTER ( LETTER | DIGIT | UNDERSCORE )* )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:197:6: LETTER ( LETTER | DIGIT | UNDERSCORE )*
            {
            mLETTER(); 


            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:197:13: ( LETTER | DIGIT | UNDERSCORE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "VERSION"
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:200:2: ( DIGIT DOT DIGIT DOT DIGIT )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:200:4: DIGIT DOT DIGIT DOT DIGIT
            {
            mDIGIT(); 


            mDOT(); 


            mDIGIT(); 


            mDOT(); 


            mDIGIT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERSION"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:9: ( ( ( '\\r' )? '\\n' ) | '\\r' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='\n') ) {
                    alt11=1;
                }
                else {
                    alt11=2;
                }
            }
            else if ( (LA11_0=='\n') ) {
                alt11=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:11: ( ( '\\r' )? '\\n' )
                    {
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:11: ( ( '\\r' )? '\\n' )
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:12: ( '\\r' )? '\\n'
                    {
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:12: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:12: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }


                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:202:26: '\\r'
                    {
                    match('\r'); 

                    skip();

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:204:4: ( ( ' ' | '\\t' | NEWLINE )+ )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:204:6: ( ' ' | '\\t' | NEWLINE )+
            {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:204:6: ( ' ' | '\\t' | NEWLINE )+
            int cnt12=0;
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt12=1;
                    }
                    break;
                case '\t':
                    {
                    alt12=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt12=3;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:204:7: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:204:13: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:204:20: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:206:9: ( '//' ( options {greedy=false; } : ( . )* NEWLINE ) )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:207:2: '//' ( options {greedy=false; } : ( . )* NEWLINE )
            {
            match("//"); 



            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:207:7: ( options {greedy=false; } : ( . )* NEWLINE )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:207:37: ( . )* NEWLINE
            {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:207:37: ( . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\r') ) {
                    alt13=2;
                }
                else if ( (LA13_0=='\n') ) {
                    alt13=2;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:207:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            mNEWLINE(); 


            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:210:2: ( '/*' ( options {greedy=false; } : ( . )* ) '*/' )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:210:4: '/*' ( options {greedy=false; } : ( . )* ) '*/'
            {
            match("/*"); 



            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:210:9: ( options {greedy=false; } : ( . )* )
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:210:39: ( . )*
            {
            // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:210:39: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:210:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            match("*/"); 



            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    public void mTokens() throws RecognitionException {
        // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:8: ( OF_OPER | SEMI | COLON | DOT | OPEN_B | CLOSE_B | OPEN_S | CLOSE_S | COMMA | UNDERSCORE | ARROW | OPER_ASSIGN | OPER_L | OPER_G | OPER_LE | OPER_GE | OPER_EQ | OPER_NEQ | OPER_INC | OPER_DEC | D_BEGIN | D_END | D_TASK | D_END_TASK | D_NAME | D_VERSION | D_MODULES | D_END_MODULES | D_MASTER | D_END_MASTER | D_MODULE | D_END_MODULE | D_ALIAS | D_SLAVES | D_END_SLAVE | D_IN | D_END_IN | D_OUT | D_INOUT | D_END_OUT | D_VARS | D_END_VARS | D_SLAVETASK | D_END_SLAVETASK | D_FLOW | D_END_FLOW | D_IF | D_END_IF | D_FOR | D_END_FOR | D_ELSE | D_WHILE | D_END_WHILE | D_CALL | SIMPLETYPE | CONTAINERTYPE | VALUE | ID | VERSION | NEWLINE | WS | COMMENT | ML_COMMENT )
        int alt15=63;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:10: OF_OPER
                {
                mOF_OPER(); 


                }
                break;
            case 2 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:18: SEMI
                {
                mSEMI(); 


                }
                break;
            case 3 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:23: COLON
                {
                mCOLON(); 


                }
                break;
            case 4 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:29: DOT
                {
                mDOT(); 


                }
                break;
            case 5 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:33: OPEN_B
                {
                mOPEN_B(); 


                }
                break;
            case 6 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:40: CLOSE_B
                {
                mCLOSE_B(); 


                }
                break;
            case 7 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:48: OPEN_S
                {
                mOPEN_S(); 


                }
                break;
            case 8 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:55: CLOSE_S
                {
                mCLOSE_S(); 


                }
                break;
            case 9 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:63: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 10 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:69: UNDERSCORE
                {
                mUNDERSCORE(); 


                }
                break;
            case 11 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:80: ARROW
                {
                mARROW(); 


                }
                break;
            case 12 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:86: OPER_ASSIGN
                {
                mOPER_ASSIGN(); 


                }
                break;
            case 13 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:98: OPER_L
                {
                mOPER_L(); 


                }
                break;
            case 14 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:105: OPER_G
                {
                mOPER_G(); 


                }
                break;
            case 15 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:112: OPER_LE
                {
                mOPER_LE(); 


                }
                break;
            case 16 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:120: OPER_GE
                {
                mOPER_GE(); 


                }
                break;
            case 17 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:128: OPER_EQ
                {
                mOPER_EQ(); 


                }
                break;
            case 18 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:136: OPER_NEQ
                {
                mOPER_NEQ(); 


                }
                break;
            case 19 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:145: OPER_INC
                {
                mOPER_INC(); 


                }
                break;
            case 20 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:154: OPER_DEC
                {
                mOPER_DEC(); 


                }
                break;
            case 21 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:163: D_BEGIN
                {
                mD_BEGIN(); 


                }
                break;
            case 22 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:171: D_END
                {
                mD_END(); 


                }
                break;
            case 23 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:177: D_TASK
                {
                mD_TASK(); 


                }
                break;
            case 24 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:184: D_END_TASK
                {
                mD_END_TASK(); 


                }
                break;
            case 25 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:195: D_NAME
                {
                mD_NAME(); 


                }
                break;
            case 26 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:202: D_VERSION
                {
                mD_VERSION(); 


                }
                break;
            case 27 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:212: D_MODULES
                {
                mD_MODULES(); 


                }
                break;
            case 28 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:222: D_END_MODULES
                {
                mD_END_MODULES(); 


                }
                break;
            case 29 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:236: D_MASTER
                {
                mD_MASTER(); 


                }
                break;
            case 30 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:245: D_END_MASTER
                {
                mD_END_MASTER(); 


                }
                break;
            case 31 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:258: D_MODULE
                {
                mD_MODULE(); 


                }
                break;
            case 32 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:267: D_END_MODULE
                {
                mD_END_MODULE(); 


                }
                break;
            case 33 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:280: D_ALIAS
                {
                mD_ALIAS(); 


                }
                break;
            case 34 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:288: D_SLAVES
                {
                mD_SLAVES(); 


                }
                break;
            case 35 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:297: D_END_SLAVE
                {
                mD_END_SLAVE(); 


                }
                break;
            case 36 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:309: D_IN
                {
                mD_IN(); 


                }
                break;
            case 37 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:314: D_END_IN
                {
                mD_END_IN(); 


                }
                break;
            case 38 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:323: D_OUT
                {
                mD_OUT(); 


                }
                break;
            case 39 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:329: D_INOUT
                {
                mD_INOUT(); 


                }
                break;
            case 40 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:337: D_END_OUT
                {
                mD_END_OUT(); 


                }
                break;
            case 41 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:347: D_VARS
                {
                mD_VARS(); 


                }
                break;
            case 42 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:354: D_END_VARS
                {
                mD_END_VARS(); 


                }
                break;
            case 43 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:365: D_SLAVETASK
                {
                mD_SLAVETASK(); 


                }
                break;
            case 44 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:377: D_END_SLAVETASK
                {
                mD_END_SLAVETASK(); 


                }
                break;
            case 45 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:393: D_FLOW
                {
                mD_FLOW(); 


                }
                break;
            case 46 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:400: D_END_FLOW
                {
                mD_END_FLOW(); 


                }
                break;
            case 47 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:411: D_IF
                {
                mD_IF(); 


                }
                break;
            case 48 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:416: D_END_IF
                {
                mD_END_IF(); 


                }
                break;
            case 49 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:425: D_FOR
                {
                mD_FOR(); 


                }
                break;
            case 50 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:431: D_END_FOR
                {
                mD_END_FOR(); 


                }
                break;
            case 51 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:441: D_ELSE
                {
                mD_ELSE(); 


                }
                break;
            case 52 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:448: D_WHILE
                {
                mD_WHILE(); 


                }
                break;
            case 53 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:456: D_END_WHILE
                {
                mD_END_WHILE(); 


                }
                break;
            case 54 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:468: D_CALL
                {
                mD_CALL(); 


                }
                break;
            case 55 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:475: SIMPLETYPE
                {
                mSIMPLETYPE(); 


                }
                break;
            case 56 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:486: CONTAINERTYPE
                {
                mCONTAINERTYPE(); 


                }
                break;
            case 57 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:500: VALUE
                {
                mVALUE(); 


                }
                break;
            case 58 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:506: ID
                {
                mID(); 


                }
                break;
            case 59 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:509: VERSION
                {
                mVERSION(); 


                }
                break;
            case 60 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:517: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 61 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:525: WS
                {
                mWS(); 


                }
                break;
            case 62 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:528: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 63 :
                // ..\\src\\gdts\\core\\parser\\GDTSLexer.g:1:536: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA3_eotS =
        "\1\uffff\1\6\5\uffff";
    static final String DFA3_eofS =
        "\7\uffff";
    static final String DFA3_minS =
        "\1\42\1\56\5\uffff";
    static final String DFA3_maxS =
        "\1\124\1\71\5\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\1";
    static final String DFA3_specialS =
        "\7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\13\uffff\1\2\1\uffff\12\1\14\uffff\1\4\7\uffff\1\5\5\uffff"+
            "\1\4",
            "\1\2\1\uffff\12\1",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "155:1: VALUE : ( INTEGER | FLOAT | STRING | BOOLEAN | NULL );";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\37\2\uffff\1\46\7\uffff\1\52\1\54\1\56\2\uffff\14\37"+
        "\1\36\2\uffff\2\107\2\uffff\1\112\1\37\11\uffff\20\37\1\137\1\140"+
        "\5\37\5\uffff\1\147\2\37\1\152\20\37\2\uffff\1\37\1\u0085\3\37\1"+
        "\36\1\uffff\2\37\2\uffff\7\37\1\u0096\1\u0097\1\36\1\u0098\1\36"+
        "\1\37\1\u009a\11\37\1\u00a4\1\37\1\uffff\2\37\1\u00a8\1\uffff\1"+
        "\u00a9\4\37\1\u00ae\1\u00af\5\37\3\uffff\1\37\1\uffff\3\37\1\u00b9"+
        "\1\u00ba\2\37\1\u00bf\1\37\1\uffff\1\u00c1\1\36\1\u00c2\2\uffff"+
        "\4\37\2\uffff\1\u00c7\2\37\1\u00ca\2\37\1\u00ce\1\u00cf\1\u00ba"+
        "\2\uffff\1\u00d0\2\37\1\u00c1\1\uffff\1\37\2\uffff\1\u00c1\3\37"+
        "\1\uffff\1\u00d7\1\u00d8\1\uffff\1\37\1\u00da\1\u00db\3\uffff\2"+
        "\37\1\u00c1\3\37\2\uffff\1\u00e2\2\uffff\1\37\1\u00c1\1\u00e5\1"+
        "\u00e6\1\u00e7\1\37\1\uffff\1\u00ea\1\u00eb\3\uffff\2\37\2\uffff"+
        "\2\37\1\u00f0\1\u00c1\1\uffff";
    static final String DFA15_eofS =
        "\u00f1\uffff";
    static final String DFA15_minS =
        "\1\11\1\106\2\uffff\1\60\6\uffff\1\55\3\75\2\uffff\1\105\1\114\4"+
        "\101\2\114\1\106\1\101\1\110\1\101\1\56\2\uffff\2\11\1\uffff\1\52"+
        "\1\60\1\124\11\uffff\1\107\1\117\1\104\2\123\1\125\1\115\1\114\2"+
        "\122\1\104\1\123\1\111\1\122\1\101\1\122\2\60\1\117\1\122\1\114"+
        "\1\111\1\114\1\60\4\uffff\1\60\1\111\1\114\1\11\1\105\1\113\2\105"+
        "\1\114\2\123\1\125\1\124\1\122\2\101\1\126\1\111\1\125\1\105\2\uffff"+
        "\1\101\1\60\1\123\2\114\1\56\1\uffff\1\116\1\105\2\uffff\1\101\1"+
        "\114\1\106\1\125\1\101\1\114\1\110\5\60\1\111\1\60\1\114\1\105\1"+
        "\111\1\123\1\131\1\105\1\116\1\124\1\107\1\60\1\124\1\uffff\2\105"+
        "\1\60\1\uffff\1\60\1\101\1\104\1\123\1\101\2\60\1\124\1\122\1\117"+
        "\1\122\1\111\3\uffff\1\117\1\uffff\1\105\1\122\1\130\2\60\1\117"+
        "\1\107\1\60\1\105\1\uffff\3\60\2\uffff\1\116\1\125\1\124\1\126\2"+
        "\uffff\1\60\1\123\1\127\1\60\1\114\1\116\3\60\2\uffff\1\60\1\101"+
        "\1\102\1\60\1\uffff\1\122\2\uffff\1\60\1\114\2\105\1\uffff\2\60"+
        "\1\uffff\1\105\2\60\3\uffff\1\123\1\112\1\60\1\105\1\122\1\123\2"+
        "\uffff\1\60\2\uffff\1\113\4\60\1\101\1\uffff\2\60\3\uffff\1\123"+
        "\1\102\2\uffff\1\113\1\112\2\60\1\uffff";
    static final String DFA15_maxS =
        "\1\172\1\125\2\uffff\1\71\6\uffff\1\76\3\75\2\uffff\1\117\1\116"+
        "\1\122\1\125\1\105\1\117\1\122\1\124\1\116\1\117\1\110\1\101\1\56"+
        "\2\uffff\2\40\1\uffff\1\57\1\172\1\124\11\uffff\1\107\1\117\1\104"+
        "\2\123\1\125\1\115\1\114\2\122\1\104\1\124\1\111\1\122\1\101\1\122"+
        "\2\172\1\117\1\122\1\114\1\111\1\114\1\71\4\uffff\1\172\1\111\1"+
        "\114\1\172\1\105\1\113\2\105\1\114\2\123\1\125\1\124\1\122\2\101"+
        "\1\126\1\111\1\125\1\105\2\uffff\1\127\1\172\1\123\2\114\1\56\1"+
        "\uffff\1\116\1\105\2\uffff\1\117\1\114\1\116\1\125\1\101\1\117\1"+
        "\110\5\172\1\111\1\172\1\114\1\105\1\111\1\123\1\131\1\105\1\116"+
        "\1\124\1\107\1\172\1\124\1\uffff\2\105\1\172\1\uffff\1\172\1\101"+
        "\1\104\1\123\1\101\2\172\1\124\1\122\1\117\1\122\1\111\3\uffff\1"+
        "\117\1\uffff\1\105\1\122\1\130\2\172\1\124\1\107\1\172\1\105\1\uffff"+
        "\3\172\2\uffff\1\116\1\125\1\124\1\126\2\uffff\1\172\1\123\1\127"+
        "\1\172\1\114\1\116\3\172\2\uffff\1\172\1\101\1\102\1\172\1\uffff"+
        "\1\122\2\uffff\1\172\1\114\2\105\1\uffff\2\172\1\uffff\1\105\2\172"+
        "\3\uffff\1\123\1\112\1\172\1\105\1\122\1\124\2\uffff\1\172\2\uffff"+
        "\1\113\4\172\1\101\1\uffff\2\172\3\uffff\1\123\1\102\2\uffff\1\113"+
        "\1\112\2\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff\1\22"+
        "\1\23\15\uffff\1\71\1\72\2\uffff\1\75\3\uffff\1\4\1\13\1\24\1\21"+
        "\1\14\1\17\1\15\1\20\1\16\30\uffff\1\74\1\76\1\77\1\1\24\uffff\1"+
        "\44\1\57\6\uffff\1\46\2\uffff\1\26\1\30\31\uffff\1\61\3\uffff\1"+
        "\73\14\uffff\1\63\1\27\1\31\1\uffff\1\51\11\uffff\1\55\3\uffff\1"+
        "\66\1\25\4\uffff\1\45\1\60\11\uffff\1\41\1\70\4\uffff\1\47\1\uffff"+
        "\1\67\1\64\4\uffff\1\50\2\uffff\1\62\3\uffff\1\37\1\35\1\42\6\uffff"+
        "\1\52\1\56\1\uffff\1\32\1\33\6\uffff\1\65\2\uffff\1\40\1\36\1\43"+
        "\2\uffff\1\53\1\34\4\uffff\1\54";
    static final String DFA15_specialS =
        "\u00f1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\42\1\41\2\uffff\1\40\22\uffff\1\42\1\17\1\36\5\uffff\1\5"+
            "\1\6\1\uffff\1\20\1\11\1\13\1\4\1\43\12\35\1\3\1\2\1\15\1\14"+
            "\1\16\2\uffff\1\27\1\21\1\34\1\37\1\22\1\32\2\37\1\31\3\37\1"+
            "\26\1\24\1\1\3\37\1\30\1\23\1\37\1\25\1\33\3\37\1\7\1\uffff"+
            "\1\10\1\uffff\1\12\1\uffff\32\37",
            "\1\44\16\uffff\1\45",
            "",
            "",
            "\12\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\20\uffff\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "",
            "",
            "\1\57\11\uffff\1\60",
            "\1\62\1\uffff\1\61",
            "\1\63\20\uffff\1\64",
            "\1\65\23\uffff\1\66",
            "\1\70\3\uffff\1\67",
            "\1\72\15\uffff\1\71",
            "\1\73\5\uffff\1\74",
            "\1\75\7\uffff\1\76",
            "\1\100\7\uffff\1\77",
            "\1\103\12\uffff\1\101\2\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "\1\42\1\41\2\uffff\1\42\22\uffff\1\42",
            "\2\42\2\uffff\1\42\22\uffff\1\42",
            "",
            "\1\111\4\uffff\1\110",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\37\7\uffff\16\37\1\135\4\37\1\136\6\37\4\uffff\1\37\1\uffff"+
            "\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\146",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\150",
            "\1\151",
            "\2\153\2\uffff\1\153\22\uffff\1\153\17\uffff\12\37\7\uffff"+
            "\5\37\1\161\2\37\1\156\3\37\1\154\1\37\1\157\3\37\1\155\2\37"+
            "\1\160\1\162\3\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\1\u0084\25\uffff\1\u0083",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008d\15\uffff\1\u008c",
            "\1\u008e",
            "\1\u0090\7\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\2\uffff\1\u0094",
            "\1\u0095",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0099",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00bd\3\uffff\1\u00bb\1\u00bc",
            "\1\u00be",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c0",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00c8",
            "\1\u00c9",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00cb",
            "\1\u00cc",
            "\12\37\7\uffff\22\37\1\u00cd\7\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d1",
            "\1\u00d2",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00d3",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00d9",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0\1\u00e1",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00e3",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\22\37\1\u00e4\7\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00e8",
            "",
            "\12\37\7\uffff\16\37\1\u00e9\13\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( OF_OPER | SEMI | COLON | DOT | OPEN_B | CLOSE_B | OPEN_S | CLOSE_S | COMMA | UNDERSCORE | ARROW | OPER_ASSIGN | OPER_L | OPER_G | OPER_LE | OPER_GE | OPER_EQ | OPER_NEQ | OPER_INC | OPER_DEC | D_BEGIN | D_END | D_TASK | D_END_TASK | D_NAME | D_VERSION | D_MODULES | D_END_MODULES | D_MASTER | D_END_MASTER | D_MODULE | D_END_MODULE | D_ALIAS | D_SLAVES | D_END_SLAVE | D_IN | D_END_IN | D_OUT | D_INOUT | D_END_OUT | D_VARS | D_END_VARS | D_SLAVETASK | D_END_SLAVETASK | D_FLOW | D_END_FLOW | D_IF | D_END_IF | D_FOR | D_END_FOR | D_ELSE | D_WHILE | D_END_WHILE | D_CALL | SIMPLETYPE | CONTAINERTYPE | VALUE | ID | VERSION | NEWLINE | WS | COMMENT | ML_COMMENT );";
        }
    }
 

}