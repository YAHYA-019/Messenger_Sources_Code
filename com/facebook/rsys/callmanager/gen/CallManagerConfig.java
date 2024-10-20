package com.facebook.rsys.callmanager.gen;

import X.0Pz;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallManagerConfig.class */
public class CallManagerConfig {
    public static 2JQ CONVERTER = N6e.A00(11);
    public static long sMcfTypeId;
    public final boolean allowMultipleActiveCalls;

    /* loaded from: CallManagerConfig$Builder.class */
    public class Builder {
        public boolean allowMultipleActiveCalls;

        public CallManagerConfig build() {
            return new CallManagerConfig(this);
        }
    }

    public CallManagerConfig() {
        this.allowMultipleActiveCalls = false;
    }

    public CallManagerConfig(Builder builder) {
        this.allowMultipleActiveCalls = builder.allowMultipleActiveCalls;
    }

    public static native CallManagerConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CallManagerConfig)) {
                return false;
            }
            if (this.allowMultipleActiveCalls != ((CallManagerConfig) obj).allowMultipleActiveCalls) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 527 + (this.allowMultipleActiveCalls ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A19("CallManagerConfig{allowMultipleActiveCalls=", "}", this.allowMultipleActiveCalls);
    }
}
