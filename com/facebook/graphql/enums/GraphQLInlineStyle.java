package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLInlineStyle.class */
public final class GraphQLInlineStyle {
    public static final /* synthetic */ GraphQLInlineStyle[] A00;
    public static final GraphQLInlineStyle A01;
    public static final GraphQLInlineStyle A02;
    public static final GraphQLInlineStyle A03;
    public final String serverValue;

    static {
        GraphQLInlineStyle A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A03 = A002;
        GraphQLInlineStyle A003 = A00("BLUE_COMMENT", 1);
        GraphQLInlineStyle A004 = A00("BOLD", 2);
        A01 = A004;
        GraphQLInlineStyle A005 = A00("CODE", 3);
        GraphQLInlineStyle A006 = A00("COPYABLE", 4);
        GraphQLInlineStyle A007 = A00("EXPANDABLE", 5);
        GraphQLInlineStyle A008 = A00("EXPANDABLEBODY", 6);
        GraphQLInlineStyle A009 = A00("EXPANDABLECONTAINER", 7);
        GraphQLInlineStyle A0010 = A00("EXPANDABLESUMMARY", 8);
        GraphQLInlineStyle A0011 = A00("EXPANDABLETITLE", 9);
        GraphQLInlineStyle A0012 = A00("HEADLINE1", 10);
        GraphQLInlineStyle A0013 = A00("HEADLINE2", 11);
        GraphQLInlineStyle A0014 = A00("HEADLINE3", 12);
        GraphQLInlineStyle A0015 = A00("HEADLINE4", 13);
        GraphQLInlineStyle A0016 = A00("HORIZONTALRULER", 14);
        GraphQLInlineStyle A0017 = A00("ITALIC", 15);
        GraphQLInlineStyle A0018 = A00("LIGHTSTRIKETHROUGH", 16);
        GraphQLInlineStyle A0019 = A00("LINEBREAK", 17);
        GraphQLInlineStyle A0020 = A00("LISTITEM", 18);
        GraphQLInlineStyle A0021 = A00("MEDIUM_WEIGHT", 19);
        GraphQLInlineStyle A0022 = A00("NONE", 20);
        A02 = A0022;
        GraphQLInlineStyle A0023 = A00("ORDEREDLIST", 21);
        GraphQLInlineStyle A0024 = A00("PARAGRAPH", 22);
        GraphQLInlineStyle A0025 = A00("PRE", 23);
        GraphQLInlineStyle A0026 = A00("QUOTE", 24);
        GraphQLInlineStyle A0027 = A00("SELECTION_ANCHOR", 25);
        GraphQLInlineStyle A0028 = A00("SELECTION_FOCUS", 26);
        GraphQLInlineStyle[] graphQLInlineStyleArr = new GraphQLInlineStyle[37];
        System.arraycopy(new GraphQLInlineStyle[]{A00("SEMIBOLD", 27), A00("SPOILER", 28), A00("STRIKETHROUGH", 29), A00("SUBSCRIPT", 30), A00("SUPERSCRIPT", 31), A00("TABLE", 32), A00("TABLEDATA", 33), A00("TABLEROW", 34), A00("UNDERLINE", 35), A00("UNORDEREDLIST", 36)}, 1BK.A1W(new GraphQLInlineStyle[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLInlineStyleArr) ? 1 : 0, graphQLInlineStyleArr, 27, 10);
        A00 = graphQLInlineStyleArr;
    }

    public GraphQLInlineStyle(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLInlineStyle A00(String str, int i) {
        return new GraphQLInlineStyle(str, i, str);
    }

    public static GraphQLInlineStyle valueOf(String str) {
        return (GraphQLInlineStyle) Enum.valueOf(GraphQLInlineStyle.class, str);
    }

    public static GraphQLInlineStyle[] values() {
        return (GraphQLInlineStyle[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
