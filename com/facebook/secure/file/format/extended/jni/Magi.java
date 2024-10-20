package com.facebook.secure.file.format.extended.jni;

import X.11T;
import X.C0il;
import X.C10h;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: Magi.class */
public final class Magi {
    public static final C10h Companion = new Object();
    public final HybridData mHybridData;

    /* loaded from: Magi$MatchResult.class */
    public final class MatchResult {
        public final String error;
        public final String extension;
        public final boolean match;
        public final String mimeType;

        public MatchResult(boolean z, String str, String str2, String str3) {
            11T.A0F(str, 2);
            11T.A0F(str2, 3);
            11T.A0F(str3, 4);
            this.match = z;
            this.extension = str;
            this.mimeType = str2;
            this.error = str3;
        }

        public final String getError() {
            return this.error;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final boolean getMatch() {
            return this.match;
        }

        public final String getMimeType() {
            return this.mimeType;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.10h] */
    static {
        C0il.A0B("magi-jni");
    }

    public Magi() {
        this(initHybrid0());
    }

    public Magi(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public static final native long nativeCreate();

    public static final native void nativeDispose(long j);

    public static final native MatchResult nativeMatch(long j, String str, List list, List list2);
}
