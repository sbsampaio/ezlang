package typing;

import parser.EZLexer;

public enum EZType {
    INT_TYPE,
    REAL_TYPE,
    BOOL_TYPE,
    STR_TYPE;

    public static EZType getVarType(int lexerTokenType) {
        switch (lexerTokenType) {
            case EZLexer.INT:
                return INT_TYPE;
            case EZLexer.REAL:
                return REAL_TYPE;
            case EZLexer.BOOL:
                return BOOL_TYPE;
            case EZLexer.STRING:
                return STR_TYPE;
        }
        return null;
    }

    public String toString() {
        switch (this) {
            case INT_TYPE:
                return "int";
            case REAL_TYPE:
                return "real";
            case BOOL_TYPE:
                return "bool";
            case STR_TYPE:
                return "string";
        }
        return null;
    }
}
