package com.facebook.graphql.enums;

/* loaded from: GraphQLMessengerPlatformWebviewPerformanceOption.class */
public enum GraphQLMessengerPlatformWebviewPerformanceOption {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    WARMUP("WARMUP");

    public final String serverValue;

    GraphQLMessengerPlatformWebviewPerformanceOption(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
