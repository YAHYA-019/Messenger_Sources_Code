package com.facebook.pando.primaryexecution.cache;

import X.1BL;
import X.C0il;
import X.HJj;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PandoResponseCache.class */
public final class PandoResponseCache {
    public static final HJj Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJj] */
    static {
        C0il.A0B("pando-client-cache-jni");
    }

    public PandoResponseCache(Executor executor, FileStash fileStash, boolean z, int i, boolean z2) {
        1BL.A1F(executor, fileStash);
        this.mHybridData = initHybridData(executor, fileStash, z, i, z2);
    }

    public /* synthetic */ PandoResponseCache(Executor executor, FileStash fileStash, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, fileStash, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(Executor executor, FileStash fileStash, boolean z, int i, boolean z2);
}
