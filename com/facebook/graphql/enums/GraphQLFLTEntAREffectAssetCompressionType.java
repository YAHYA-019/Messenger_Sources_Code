package com.facebook.graphql.enums;

/* loaded from: GraphQLFLTEntAREffectAssetCompressionType.class */
public enum GraphQLFLTEntAREffectAssetCompressionType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    TAR_BROTLI("TAR_BROTLI"),
    /* JADX INFO: Fake field, exist only in values array */
    TAR_LZMA2("TAR_LZMA2"),
    /* JADX INFO: Fake field, exist only in values array */
    ZIP("ZIP");

    public final String serverValue;

    GraphQLFLTEntAREffectAssetCompressionType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
