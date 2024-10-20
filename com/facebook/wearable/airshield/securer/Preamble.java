package com.facebook.wearable.airshield.securer;

import X.11T;
import X.AnonymousClass001;
import X.C0il;
import X.KXR;
import X.KXV;
import X.KXc;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.datax.Connection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Preamble.class */
public final class Preamble {
    public static final KXR Companion = new Object();
    public Connection connection;
    public final Object connectionLock;
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KXR, java.lang.Object] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public Preamble(HybridData hybridData) {
        this.connectionLock = AnonymousClass001.A0R();
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public /* synthetic */ Preamble(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    private final native void acceptAuthenticationNative(byte[] bArr, boolean z);

    private final native boolean asMainNative();

    private final native long connectionNative();

    private final Connection createConnection() {
        KXc kXc = Connection.Companion;
        return new Connection(connectionNative());
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void rejectAuthenticationNative(int i);

    private final native byte[] rxChallengeNative();

    private final native int streamIdNative();

    private final native byte[] txChallengeNative();

    public final void acceptAuthentication(byte[] bArr, boolean z) {
        11T.A0F(bArr, 0);
        acceptAuthenticationNative(bArr, z);
    }

    public final boolean getAsMain() {
        return asMainNative();
    }

    public final Connection getConnection() {
        Connection connection;
        synchronized (this.connectionLock) {
            connection = this.connection;
            if (connection == null) {
                connection = createConnection();
                this.connection = connection;
            }
        }
        return connection;
    }

    public final Hash getRxChallenge() {
        KXV kxv = Hash.Companion;
        byte[] rxChallengeNative = rxChallengeNative();
        11T.A0F(rxChallengeNative, 0);
        Hash hash = new Hash(null);
        hash.setRaw(rxChallengeNative);
        return hash;
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final Hash getTxChallenge() {
        KXV kxv = Hash.Companion;
        byte[] txChallengeNative = txChallengeNative();
        11T.A0F(txChallengeNative, 0);
        Hash hash = new Hash(null);
        hash.setRaw(txChallengeNative);
        return hash;
    }

    public final void rejectAuthentication(int i) {
        rejectAuthenticationNative(i);
    }
}
