package typing;

import static ast.NodeKind.*;

import ast.AST;

public enum Conversion {
    B2I, // Bool to Int
    B2R, // Bool to Real
    B2S, // Bool to String
    I2R, // Int to Real
    I2S, // Int to String
    R2S, // Real to String
    NONE;

    public static AST createConversionNode(Conversion conversion, AST node) {
        switch (conversion) {
            case B2I:
                return AST.newSubtree(B2I_NODE, EZType.INT_TYPE, node);
            case B2R:
                return AST.newSubtree(B2R_NODE, EZType.REAL_TYPE, node);
            case B2S:
                return AST.newSubtree(B2S_NODE, EZType.STR_TYPE, node);
            case I2R:
                return AST.newSubtree(I2R_NODE, EZType.REAL_TYPE, node);
            case I2S:
                return AST.newSubtree(I2S_NODE, EZType.STR_TYPE, node);
            case R2S:
                return AST.newSubtree(R2S_NODE, EZType.STR_TYPE, node);
            case NONE:
                return node;
            default:
                System.err.printf("INTERNAL ERROR: invalid conversion of types!\n");
                System.exit(1);
                return null;
        }
    }

    public static final class Unify {
        public final EZType type;
        public final Conversion leftConversion;
        public final Conversion rightConversion;

        public Unify(EZType type, Conversion leftConversion, Conversion rightConversion) {
            this.type = type;
            this.leftConversion = leftConversion;
            this.rightConversion = rightConversion;
        }
    }
}
