package com.facebook.graphservice.interfaces;

import com.google.common.collect.ImmutableList;

/* loaded from: Tree.class */
public interface Tree {

    /* loaded from: Tree$DeepEqualGuess.class */
    public enum DeepEqualGuess {
        TRUE,
        FALSE,
        UNKNOWN
    }

    /* loaded from: Tree$FieldType.class */
    public enum FieldType {
        NONE,
        BOOL,
        DOUBLE,
        INT,
        TIME,
        STRING,
        DYNAMIC,
        BOOL_LIST,
        DOUBLE_LIST,
        INT_LIST,
        TIME_LIST,
        STRING_LIST,
        TREE,
        TREE_LIST
    }

    String getString(int i);

    ImmutableList getStringList(int i);

    Tree getTree(String str);

    String getTypeName();

    int getTypeTag();

    boolean isPandoBacked();

    boolean isValidGraphServicesJNIModel();

    boolean isValidGraphServicesJNIModelWithLogging();

    String toExpensiveHumanReadableDebugString();
}
