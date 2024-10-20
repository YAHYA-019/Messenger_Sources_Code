package com.facebook.rtc.photosnapshots.jni;

import X.0RZ;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Du;
import X.1FX;
import X.2Cb;
import X.2Dx;
import X.2EA;
import X.2EU;
import X.7zL;
import X.AnonymousClass001;
import X.GOq;
import X.HlI;
import X.J7D;
import X.QpT;
import X.S68;
import android.content.Context;
import com.facebook.jni.HybridClassBase;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: NativeSnapshotHelper.class */
public final class NativeSnapshotHelper extends HybridClassBase {
    public static final HlI Companion = new Object();
    public Context context;
    public long id;
    public final Object pendingResultsLock = AnonymousClass001.A0R();
    public final Object longTermStateLock = AnonymousClass001.A0R();
    public final List pendingResults = AnonymousClass001.A0s();

    public NativeSnapshotHelper() {
        0fH.A0j("NativeSnapshotHelper", "NativeSnapshotHelper constructor called");
        initHybrid();
    }

    public static final ByteBuffer getDirectByteBuffer(int i) {
        ByteBuffer A17 = GOq.A17(i);
        11T.A0A(A17);
        return A17;
    }

    private final native void initHybrid();

    public final boolean hasPendingRequests() {
        boolean A1Y;
        synchronized (this.pendingResultsLock) {
            A1Y = 1BK.A1Y(this.pendingResults);
        }
        return A1Y;
    }

    public final void init(Context context, long j) {
        synchronized (this.longTermStateLock) {
            if (this.context == null && context != null) {
                this.context = context.getApplicationContext();
                this.id = j;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v82, types: [X.S68, java.io.Closeable, java.lang.Object] */
    public final void onSnapshotReady(ByteBuffer byteBuffer, int i, int i2) {
        Context context;
        ImmutableList A0a;
        11T.A0F(byteBuffer, 0);
        Object obj = this.longTermStateLock;
        synchronized (obj) {
            try {
                context = this.context;
            } catch (Throwable th) {
                throw th;
            }
        }
        obj = this.pendingResultsLock;
        synchronized (obj) {
            A0a = 1BL.A0a(this.pendingResults);
            this.pendingResults.clear();
        }
        if (context == null) {
            Iterator it = A0a.iterator();
            while (it.hasNext()) {
                ((1FX) it.next()).setException(new J7D(QpT.A06, "NativeSnapshotHelper::mContext is null"));
            }
            return;
        }
        byteBuffer.rewind();
        2EU r312 = null;
        try {
            2EU A04 = new 2Cb(new 2Dx(new 2EA(context))).A06().A04(i, i2);
            try {
                try {
                    7zL.A0C(A04).copyPixelsFromBuffer(byteBuffer);
                    0RZ.A04(A04.A0A());
                    2EU A07 = A04.A07();
                    ?? obj2 = new Object();
                    ((S68) obj2).A00 = A07;
                    r312 = 2EU.A02((Closeable) obj2);
                } catch (IllegalArgumentException unused) {
                    Iterator it2 = A0a.iterator();
                    while (it2.hasNext()) {
                        ((SettableFuture) it2.next()).setException(new J7D(QpT.A06, "NativeSnapshotHelper: invalid bitmapReference"));
                    }
                }
                2EU.A04(A04);
                if (r312 != null) {
                    1Du it3 = A0a.iterator();
                    while (it3.hasNext()) {
                        SettableFuture settableFuture = (SettableFuture) it3.next();
                        if (!settableFuture.isCancelled()) {
                            settableFuture.set(r312.A07());
                        }
                    }
                }
            } catch (Throwable th2) {
                2EU.A04(A04);
                throw th2;
            }
        } finally {
            2EU.A04(r312);
        }
    }
}
