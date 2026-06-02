package typing;

import static typing.Conversion.*;

import parser.EZLexer;
import typing.Conversion.Unify;

public enum EZType {
    INT_TYPE,
    REAL_TYPE,
    BOOL_TYPE,
    STR_TYPE,
    NO_TYPE;

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
            case NO_TYPE:
                return "no_type";
            default:
                System.err.println("ERROR: Fall through in Type enumeration!");
                System.exit(1);
                return "";
        }
    }

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

    private static Unify plus[][] = {
            { new Unify(INT_TYPE, NONE, NONE), new Unify(REAL_TYPE, I2R, NONE), new Unify(INT_TYPE, NONE, B2I),
                    new Unify(STR_TYPE, I2S, NONE) },
            { new Unify(REAL_TYPE, NONE, I2R), new Unify(REAL_TYPE, NONE, NONE), new Unify(REAL_TYPE, NONE, B2R),
                    new Unify(STR_TYPE, R2S, NONE) },
            { new Unify(INT_TYPE, B2I, NONE), new Unify(REAL_TYPE, B2R, NONE), new Unify(BOOL_TYPE, NONE, NONE),
                    new Unify(STR_TYPE, B2S, NONE) },
            { new Unify(STR_TYPE, NONE, I2S), new Unify(STR_TYPE, NONE, R2S), new Unify(STR_TYPE, NONE, B2S),
                    new Unify(STR_TYPE, NONE, NONE) },
    };

    public Unify unifyPlus(EZType that) {
        return plus[this.ordinal()][that.ordinal()];
    }

    private static Unify other[][] = {
            { new Unify(INT_TYPE, NONE, NONE), new Unify(REAL_TYPE, I2R, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) },
            { new Unify(REAL_TYPE, NONE, I2R), new Unify(REAL_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) },
            { new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) },
            { new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) }
    };

    public Unify unifyOtherArith(EZType that) {
        return other[this.ordinal()][that.ordinal()];
    }

    private static Unify comp[][] = {
            { new Unify(BOOL_TYPE, NONE, NONE), new Unify(BOOL_TYPE, I2R, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) },
            { new Unify(BOOL_TYPE, NONE, I2R), new Unify(BOOL_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) },
            { new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(NO_TYPE, NONE, NONE) },
            { new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE), new Unify(NO_TYPE, NONE, NONE),
                    new Unify(BOOL_TYPE, NONE, NONE) }
    };

    public Unify unifyComp(EZType that) {
        return comp[this.ordinal()][that.ordinal()];
    }
}
