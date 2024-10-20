package com.facebook.graphql.enums;

/* loaded from: GraphQLXFBGenAIImageProvenanceType.class */
public enum GraphQLXFBGenAIImageProvenanceType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    C2PA("C2PA"),
    /* JADX INFO: Fake field, exist only in values array */
    C2PA_METADATA_EDITED("C2PA_METADATA_EDITED"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICIT("EXPLICIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICIT_IMAGINE("EXPLICIT_IMAGINE"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICIT_IMAGINE_ME("EXPLICIT_IMAGINE_ME"),
    /* JADX INFO: Fake field, exist only in values array */
    INVISIBLE_WATERMARK("INVISIBLE_WATERMARK"),
    /* JADX INFO: Fake field, exist only in values array */
    IPTC("IPTC"),
    /* JADX INFO: Fake field, exist only in values array */
    IPTC_METADATA_EDITED("IPTC_METADATA_EDITED");

    public final String serverValue;

    GraphQLXFBGenAIImageProvenanceType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
