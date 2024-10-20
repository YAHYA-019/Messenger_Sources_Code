package com.facebook.privacy.e2ee.genericimpl.store;

import X.0Q8;
import X.11T;

/* loaded from: PeerPublicKeyWireModel.class */
public final class PeerPublicKeyWireModel {
    public int creationTimeOnDevice;
    public String deviceUuid;
    public String keyType;
    public byte[] publicKey;
    public String version;

    public final int getCreationTimeOnDevice() {
        return this.creationTimeOnDevice;
    }

    public final String getDeviceUuid() {
        return this.deviceUuid;
    }

    public final String getKeyType() {
        String str = this.keyType;
        if (str != null) {
            return str;
        }
        11T.A0L("keyType");
        throw 0Q8.createAndThrow();
    }

    public final byte[] getPublicKey() {
        byte[] bArr = this.publicKey;
        if (bArr != null) {
            return bArr;
        }
        11T.A0L("publicKey");
        throw 0Q8.createAndThrow();
    }

    public final String getVersion() {
        String str = this.version;
        if (str != null) {
            return str;
        }
        11T.A0L(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY);
        throw 0Q8.createAndThrow();
    }

    public final void setCreationTimeOnDevice(int i) {
        this.creationTimeOnDevice = i;
    }

    public final void setDeviceUuid(String str) {
        this.deviceUuid = str;
    }

    public final void setKeyType(String str) {
        11T.A0F(str, 0);
        this.keyType = str;
    }

    public final void setPublicKey(byte[] bArr) {
        11T.A0F(bArr, 0);
        this.publicKey = bArr;
    }

    public final void setVersion(String str) {
        11T.A0F(str, 0);
        this.version = str;
    }
}
