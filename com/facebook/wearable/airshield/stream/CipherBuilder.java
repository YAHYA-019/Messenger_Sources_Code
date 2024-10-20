package com.facebook.wearable.airshield.stream;

import X.11T;
import X.AnonymousClass001;
import X.C01i;
import X.C0il;
import X.R3p;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.security.Random;

/* loaded from: CipherBuilder.class */
public final class CipherBuilder {
    public static final int CHALLENGE_SIZE = 16;
    public static final R3p Companion = new Object();
    public static final int SEED_SIZE = 32;
    public byte[] challenge;
    public InitializationVector initializationVector;
    public final HybridData mHybridData = initHybrid();
    public PrivateKey privateKey;
    public PublicKey remotePublicKey;
    public byte[] seed;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.R3p, java.lang.Object] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public CipherBuilder() {
        PrivateKey privateKey = new PrivateKey();
        privateKey.generate();
        setPrivateKey(privateKey.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
        this.privateKey = privateKey;
        byte[] bArr = new byte[16];
        C01i c01i = Random.instance;
        Random.access$bytesNative((Random) c01i.getValue(), bArr);
        setChallengeNative(bArr);
        this.challenge = bArr;
        byte[] bArr2 = new byte[32];
        Random.access$bytesNative((Random) c01i.getValue(), bArr2);
        setSeedNative(bArr2);
        this.seed = bArr2;
        InitializationVector initializationVector = new InitializationVector();
        initializationVector.generate();
        setInitializationVectorNative(initializationVector.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
        this.initializationVector = initializationVector;
    }

    private final native Framing buildDecryptionFramingNative(int i, boolean z);

    private final native Framing buildEncryptionFramingNative(int i, boolean z);

    private final native Hash buildRxChallengeNative();

    private final native Hash buildTxChallengeNative();

    private final void checkValues() {
        if (this.remotePublicKey == null) {
            throw AnonymousClass001.A0N("RemotePublicKey was not set");
        }
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void setChallengeNative(byte[] bArr);

    private final native void setInitializationVectorNative(long j);

    private final native void setPrivateKey(long j);

    private final native void setRemotePublicKeyNative(long j);

    private final native void setSeedNative(byte[] bArr);

    public final Framing buildDecryptionFraming(int i, boolean z) {
        checkValues();
        return buildDecryptionFramingNative(i, z);
    }

    public final Framing buildEncryptionFraming(int i, boolean z) {
        checkValues();
        return buildEncryptionFramingNative(i, z);
    }

    public final Hash buildRxChallenge() {
        checkValues();
        return buildRxChallengeNative();
    }

    public final Hash buildTxChallenge() {
        checkValues();
        return buildTxChallengeNative();
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final InitializationVector getInitializationVector() {
        return this.initializationVector;
    }

    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public final PublicKey getPublicKey() {
        return this.privateKey.recoverPublicKey();
    }

    public final PublicKey getRemotePublicKey() {
        return this.remotePublicKey;
    }

    public final byte[] getSeed() {
        return this.seed;
    }

    public final void setChallenge(byte[] bArr) {
        11T.A0F(bArr, 0);
        this.challenge = bArr;
        setChallengeNative(bArr);
    }

    public final void setInitializationVector(InitializationVector initializationVector) {
        11T.A0F(initializationVector, 0);
        this.initializationVector = initializationVector;
        setInitializationVectorNative(initializationVector.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public final void setPrivateKey(PrivateKey privateKey) {
        11T.A0F(privateKey, 0);
        this.privateKey = privateKey;
        setPrivateKey(privateKey.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public final void setRemotePublicKey(PublicKey publicKey) {
        if (publicKey == null) {
            throw AnonymousClass001.A0N("remote public key is null");
        }
        this.remotePublicKey = publicKey;
        setRemotePublicKeyNative(publicKey.getNative());
    }

    public final void setSeed(byte[] bArr) {
        11T.A0F(bArr, 0);
        this.seed = bArr;
        setSeedNative(bArr);
    }
}
