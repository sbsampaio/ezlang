package ast;

import java.util.ArrayList;
import java.util.List;

import typing.EZType;

public class AST {
    public final NodeKind kind;
    public final int intData;
    public final float floatData;
    public final EZType type;
    private final List<AST> children;

    private AST(NodeKind kind, int intData, float floatData, EZType type) {
        this.kind = kind;
        this.intData = intData;
        this.floatData = floatData;
        this.type = type;
        this.children = new ArrayList<>();
    }

    public AST(NodeKind kind, int intData, EZType type) {
        this(kind, intData, 0.0f, type);
    }

    public AST(NodeKind kind, float floatData, EZType type) {
        this(kind, 0, floatData, type);
    }

    public void addChild(AST child) {
        this.children.add(child);
    }

    public static AST newSubtree(NodeKind kind, EZType type, AST... children) {
        AST node = new AST(kind, 0, type);
        for (AST child : children)
            node.addChild(child);
        return node;
    }
}
