package typing;

import parser.EZLexer;

public enum EZType {
    INT_TYPE,
    REAL_TYPE,
    BOOL_TYPE,
    STR_TYPE,
    NO_TYPE;

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

    private static EZType plus[][] = {
            { INT_TYPE, REAL_TYPE, INT_TYPE, STR_TYPE },
            { REAL_TYPE, REAL_TYPE, REAL_TYPE, STR_TYPE },
            { INT_TYPE, REAL_TYPE, BOOL_TYPE, STR_TYPE },
            { STR_TYPE, STR_TYPE, STR_TYPE, STR_TYPE }
    };

    public EZType unifyPlus(EZType that) {
        return plus[this.ordinal()][that.ordinal()];
    }

    private static EZType other[][] = {
            { INT_TYPE, REAL_TYPE, NO_TYPE, NO_TYPE },
            { REAL_TYPE, REAL_TYPE, NO_TYPE, NO_TYPE },
            { NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE },
            { NO_TYPE, NO_TYPE, NO_TYPE, NO_TYPE }
    };

    public EZType unifyOtherArith(EZType that) {
        return other[this.ordinal()][that.ordinal()];
    }

    private static EZType comp[][] = {
            { BOOL_TYPE, BOOL_TYPE, NO_TYPE, NO_TYPE },
            { BOOL_TYPE, BOOL_TYPE, NO_TYPE, NO_TYPE },
            { NO_TYPE, NO_TYPE, BOOL_TYPE, NO_TYPE },
            { NO_TYPE, NO_TYPE, NO_TYPE, BOOL_TYPE }
    };

    public EZType unifyComp(EZType that) {
        return comp[this.ordinal()][that.ordinal()];
    }
}
