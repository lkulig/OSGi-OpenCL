// $ANTLR 3.4 ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g 2011-09-20 15:37:50

  package gdts.core.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GDTSInstanceLexer extends Lexer {
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

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GDTSInstanceLexer() {} 
    public GDTSInstanceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GDTSInstanceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g"; }

    // $ANTLR start "D_MINUS"
    public final void mD_MINUS() throws RecognitionException {
        try {
            int _type = D_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:8:2: ( '-' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:8:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_MINUS"

    // $ANTLR start "D_SEMI"
    public final void mD_SEMI() throws RecognitionException {
        try {
            int _type = D_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:12:2: ( ';' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:12:4: ';'
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
    // $ANTLR end "D_SEMI"

    // $ANTLR start "D_BEGIN"
    public final void mD_BEGIN() throws RecognitionException {
        try {
            int _type = D_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:16:2: ( 'BEGIN' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:16:4: 'BEGIN'
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
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:20:2: ( 'END' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:20:4: 'END'
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
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:24:2: ( 'TASK' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:24:4: 'TASK'
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

    // $ANTLR start "D_ID"
    public final void mD_ID() throws RecognitionException {
        try {
            int _type = D_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:28:2: ( 'ID' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:28:4: 'ID'
            {
            match("ID"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_ID"

    // $ANTLR start "D_VERSION"
    public final void mD_VERSION() throws RecognitionException {
        try {
            int _type = D_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:32:2: ( 'VERSION' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:32:4: 'VERSION'
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

    // $ANTLR start "D_COLON"
    public final void mD_COLON() throws RecognitionException {
        try {
            int _type = D_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:37:2: ( ':' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:37:4: ':'
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
    // $ANTLR end "D_COLON"

    // $ANTLR start "D_TRUE"
    public final void mD_TRUE() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:42:2: ( 'TRUE' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:42:4: 'TRUE'
            {
            match("TRUE"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_TRUE"

    // $ANTLR start "D_FALSE"
    public final void mD_FALSE() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:47:2: ( 'FALSE' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:47:4: 'FALSE'
            {
            match("FALSE"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_FALSE"

    // $ANTLR start "D_COMMA"
    public final void mD_COMMA() throws RecognitionException {
        try {
            int _type = D_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:51:2: ( ',' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:51:4: ','
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
    // $ANTLR end "D_COMMA"

    // $ANTLR start "D_EQUAL"
    public final void mD_EQUAL() throws RecognitionException {
        try {
            int _type = D_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:54:2: ( '=' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:54:4: '='
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
    // $ANTLR end "D_EQUAL"

    // $ANTLR start "D_DOT"
    public final void mD_DOT() throws RecognitionException {
        try {
            int _type = D_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:57:2: ( '.' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:57:4: '.'
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
    // $ANTLR end "D_DOT"

    // $ANTLR start "D_DQUOTE"
    public final void mD_DQUOTE() throws RecognitionException {
        try {
            int _type = D_DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:60:2: ( '\"' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:60:4: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D_DQUOTE"

    // $ANTLR start "D_UNDERSCORE"
    public final void mD_UNDERSCORE() throws RecognitionException {
        try {
            int _type = D_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:63:2: ( '_' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:63:4: '_'
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
    // $ANTLR end "D_UNDERSCORE"

    // $ANTLR start "D_OPENSB"
    public final void mD_OPENSB() throws RecognitionException {
        try {
            int _type = D_OPENSB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:67:2: ( '[' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:67:4: '['
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
    // $ANTLR end "D_OPENSB"

    // $ANTLR start "D_CLOSESB"
    public final void mD_CLOSESB() throws RecognitionException {
        try {
            int _type = D_CLOSESB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:71:2: ( ']' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:71:4: ']'
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
    // $ANTLR end "D_CLOSESB"

    // $ANTLR start "VSTRING"
    public final void mVSTRING() throws RecognitionException {
        try {
            int _type = VSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:74:9: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:75:4: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:75:8: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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
            	    break loop1;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VSTRING"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:79:2: ( '0' .. '9' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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

    // $ANTLR start "VINTEGER"
    public final void mVINTEGER() throws RecognitionException {
        try {
            int _type = VINTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:83:2: ( ( D_MINUS )? ( DIGIT )+ )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:83:4: ( D_MINUS )? ( DIGIT )+
            {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:83:4: ( D_MINUS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
                    {
                    if ( input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:83:13: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VINTEGER"

    // $ANTLR start "VFLOAT"
    public final void mVFLOAT() throws RecognitionException {
        try {
            int _type = VFLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:87:2: ( ( D_MINUS )? ( DIGIT )* D_DOT ( DIGIT )+ )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:87:4: ( D_MINUS )? ( DIGIT )* D_DOT ( DIGIT )+
            {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:87:4: ( D_MINUS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
                    {
                    if ( input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:87:13: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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


            mD_DOT(); 


            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:87:26: ( DIGIT )+
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
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VFLOAT"

    // $ANTLR start "VBOOLEAN"
    public final void mVBOOLEAN() throws RecognitionException {
        try {
            int _type = VBOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:91:2: ( D_TRUE | D_FALSE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='T') ) {
                alt7=1;
            }
            else if ( (LA7_0=='F') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:91:4: D_TRUE
                    {
                    mD_TRUE(); 


                    }
                    break;
                case 2 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:91:13: D_FALSE
                    {
                    mD_FALSE(); 


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
    // $ANTLR end "VBOOLEAN"

    // $ANTLR start "VERSION"
    public final void mVERSION() throws RecognitionException {
        try {
            int _type = VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:95:2: ( DIGIT D_DOT DIGIT D_DOT DIGIT )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:95:4: DIGIT D_DOT DIGIT D_DOT DIGIT
            {
            mDIGIT(); 


            mD_DOT(); 


            mDIGIT(); 


            mD_DOT(); 


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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:99:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:102:2: ( ( LETTER ) ( LETTER | D_UNDERSCORE | DIGIT )* )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:102:4: ( LETTER ) ( LETTER | D_UNDERSCORE | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:102:12: ( LETTER | D_UNDERSCORE | DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:
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
            	    break loop8;
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:2: ( ( ( '\\r' )? '\\n' ) | '\\r' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\n') ) {
                    alt10=1;
                }
                else {
                    alt10=2;
                }
            }
            else if ( (LA10_0=='\n') ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:4: ( ( '\\r' )? '\\n' )
                    {
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:4: ( ( '\\r' )? '\\n' )
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:5: ( '\\r' )? '\\n'
                    {
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:5: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:5: '\\r'
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
                    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:106:19: '\\r'
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
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:109:4: ( ( ' ' | '\\t' | NEWLINE )+ )
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:109:6: ( ' ' | '\\t' | NEWLINE )+
            {
            // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:109:6: ( ' ' | '\\t' | NEWLINE )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt11=1;
                    }
                    break;
                case '\t':
                    {
                    alt11=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:109:7: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:109:13: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:109:20: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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

    public void mTokens() throws RecognitionException {
        // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:8: ( D_MINUS | D_SEMI | D_BEGIN | D_END | D_TASK | D_ID | D_VERSION | D_COLON | D_COMMA | D_EQUAL | D_DOT | D_DQUOTE | D_UNDERSCORE | D_OPENSB | D_CLOSESB | VSTRING | VINTEGER | VFLOAT | VBOOLEAN | VERSION | ID | NEWLINE | WS )
        int alt12=23;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:10: D_MINUS
                {
                mD_MINUS(); 


                }
                break;
            case 2 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:18: D_SEMI
                {
                mD_SEMI(); 


                }
                break;
            case 3 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:25: D_BEGIN
                {
                mD_BEGIN(); 


                }
                break;
            case 4 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:33: D_END
                {
                mD_END(); 


                }
                break;
            case 5 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:39: D_TASK
                {
                mD_TASK(); 


                }
                break;
            case 6 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:46: D_ID
                {
                mD_ID(); 


                }
                break;
            case 7 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:51: D_VERSION
                {
                mD_VERSION(); 


                }
                break;
            case 8 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:61: D_COLON
                {
                mD_COLON(); 


                }
                break;
            case 9 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:69: D_COMMA
                {
                mD_COMMA(); 


                }
                break;
            case 10 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:77: D_EQUAL
                {
                mD_EQUAL(); 


                }
                break;
            case 11 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:85: D_DOT
                {
                mD_DOT(); 


                }
                break;
            case 12 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:91: D_DQUOTE
                {
                mD_DQUOTE(); 


                }
                break;
            case 13 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:100: D_UNDERSCORE
                {
                mD_UNDERSCORE(); 


                }
                break;
            case 14 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:113: D_OPENSB
                {
                mD_OPENSB(); 


                }
                break;
            case 15 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:122: D_CLOSESB
                {
                mD_CLOSESB(); 


                }
                break;
            case 16 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:132: VSTRING
                {
                mVSTRING(); 


                }
                break;
            case 17 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:140: VINTEGER
                {
                mVINTEGER(); 


                }
                break;
            case 18 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:149: VFLOAT
                {
                mVFLOAT(); 


                }
                break;
            case 19 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:156: VBOOLEAN
                {
                mVBOOLEAN(); 


                }
                break;
            case 20 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:165: VERSION
                {
                mVERSION(); 


                }
                break;
            case 21 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:173: ID
                {
                mID(); 


                }
                break;
            case 22 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:176: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 23 :
                // ..\\src\\gdts\\core\\parser\\GDTSInstanceLexer.g:1:184: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\26\1\uffff\5\22\3\uffff\1\37\1\40\3\uffff\1\42\1\22\1"+
        "\uffff\2\45\2\uffff\1\42\1\uffff\4\22\1\52\1\22\5\uffff\1\22\1\uffff"+
        "\1\22\1\57\2\22\1\uffff\1\22\1\30\2\22\1\uffff\1\66\1\67\1\22\1"+
        "\uffff\1\22\1\72\2\uffff\1\22\1\67\1\uffff\1\22\1\75\1\uffff";
    static final String DFA12_eofS =
        "\76\uffff";
    static final String DFA12_minS =
        "\1\11\1\56\1\uffff\1\105\1\116\1\101\1\104\1\105\3\uffff\1\60\1"+
        "\0\3\uffff\1\56\1\101\1\uffff\2\11\2\uffff\1\56\1\uffff\1\107\1"+
        "\104\1\123\1\125\1\60\1\122\4\uffff\1\60\1\114\1\uffff\1\111\1\60"+
        "\1\113\1\105\1\uffff\1\123\1\56\1\123\1\116\1\uffff\2\60\1\111\1"+
        "\uffff\1\105\1\60\2\uffff\1\117\1\60\1\uffff\1\116\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\172\1\71\1\uffff\1\105\1\116\1\122\1\104\1\105\3\uffff\1\71\1"+
        "\uffff\3\uffff\1\71\1\101\1\uffff\2\40\2\uffff\1\71\1\uffff\1\107"+
        "\1\104\1\123\1\125\1\172\1\122\4\uffff\1\71\1\114\1\uffff\1\111"+
        "\1\172\1\113\1\105\1\uffff\1\123\1\56\1\123\1\116\1\uffff\2\172"+
        "\1\111\1\uffff\1\105\1\172\2\uffff\1\117\1\172\1\uffff\1\116\1\172"+
        "\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\5\uffff\1\10\1\11\1\12\2\uffff\1\15\1\16\1\17\2\uffff"+
        "\1\25\2\uffff\1\27\1\1\1\uffff\1\22\6\uffff\1\13\1\14\1\20\1\21"+
        "\2\uffff\1\26\4\uffff\1\6\4\uffff\1\4\3\uffff\1\24\2\uffff\1\5\1"+
        "\23\2\uffff\1\3\2\uffff\1\7";
    static final String DFA12_specialS =
        "\14\uffff\1\0\61\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\25\1\24\2\uffff\1\23\22\uffff\1\25\1\uffff\1\14\11\uffff"+
            "\1\11\1\1\1\13\1\uffff\12\20\1\10\1\2\1\uffff\1\12\3\uffff\1"+
            "\22\1\3\2\22\1\4\1\21\2\22\1\6\12\22\1\5\1\22\1\7\4\22\1\16"+
            "\1\uffff\1\17\1\uffff\1\15\1\uffff\32\22",
            "\1\30\1\uffff\12\27",
            "",
            "\1\31",
            "\1\32",
            "\1\33\20\uffff\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "\12\30",
            "\12\41\1\uffff\2\41\1\uffff\ufff2\41",
            "",
            "",
            "",
            "\1\43\1\uffff\12\27",
            "\1\44",
            "",
            "\1\25\1\24\2\uffff\1\25\22\uffff\1\25",
            "\2\25\2\uffff\1\25\22\uffff\1\25",
            "",
            "",
            "\1\30\1\uffff\12\27",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\53",
            "",
            "",
            "",
            "",
            "\12\54",
            "\1\55",
            "",
            "\1\56",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\60",
            "\1\61",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\70",
            "",
            "\1\71",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\1\73",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\1\74",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( D_MINUS | D_SEMI | D_BEGIN | D_END | D_TASK | D_ID | D_VERSION | D_COLON | D_COMMA | D_EQUAL | D_DOT | D_DQUOTE | D_UNDERSCORE | D_OPENSB | D_CLOSESB | VSTRING | VINTEGER | VFLOAT | VBOOLEAN | VERSION | ID | NEWLINE | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12 >= '\u0000' && LA12_12 <= '\t')||(LA12_12 >= '\u000B' && LA12_12 <= '\f')||(LA12_12 >= '\u000E' && LA12_12 <= '\uFFFF')) ) {s = 33;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}