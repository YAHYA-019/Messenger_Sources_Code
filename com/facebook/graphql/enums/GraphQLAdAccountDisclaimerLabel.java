package com.facebook.graphql.enums;

/* loaded from: GraphQLAdAccountDisclaimerLabel.class */
public enum GraphQLAdAccountDisclaimerLabel {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    PAID_FOR_BY("PAID_FOR_BY"),
    /* JADX INFO: Fake field, exist only in values array */
    PROPAGANDA_ELEITORAL_BR("PROPAGANDA_ELEITORAL_BR"),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLISHED_BY("PUBLISHED_BY");

    public final String serverValue;

    GraphQLAdAccountDisclaimerLabel(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
