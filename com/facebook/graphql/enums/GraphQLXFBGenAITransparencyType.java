package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAITransparencyType.class */
public enum GraphQLXFBGenAITransparencyType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICIT_IMAGINE_MADE_WITH_AI("EXPLICIT_IMAGINE_MADE_WITH_AI"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICIT_IMAGINE_ME_MADE_WITH_AI("EXPLICIT_IMAGINE_ME_MADE_WITH_AI"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PROVENANCE_DETECTED_CREATED("PROVENANCE_DETECTED_CREATED"),
    /* JADX INFO: Fake field, exist only in values array */
    PROVENANCE_DETECTED_EDITED("PROVENANCE_DETECTED_EDITED");

    public final String serverValue;

    GraphQLXFBGenAITransparencyType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
