package com.facebook.graphql.enums;

/* loaded from: GraphQLTextWithEntitiesMetadataType.class */
public enum GraphQLTextWithEntitiesMetadataType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CONCEPT("CONCEPT"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT("INTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE");

    public final String serverValue;

    GraphQLTextWithEntitiesMetadataType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
