package com.facebook.privacy.e2ee.genericimpl.backup.common;

import X.11T;
import X.1BL;
import X.4YU;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQx;
import java.util.Arrays;

/* loaded from: VestaServerInitResponse.class */
public final class VestaServerInitResponse {
    public final byte[] _islandRsaPub;
    public final byte[] _islandRsaPubSignature;
    public final byte[] _opaquePub;
    public final byte[] _opaquePubSignature;
    public final boolean isRegistered;
    public final byte[] islandEd25519Pub;
    public final byte[] islandEd25519PubSignature;
    public final Integer loginAttemptsRemaining;
    public final Integer loginTimeoutRemainingSecs;

    public VestaServerInitResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, Integer num, Integer num2, byte[] bArr5, byte[] bArr6) {
        7zT.A1W(bArr, bArr2, bArr3, bArr4);
        11T.A0F(bArr5, 8);
        11T.A0F(bArr6, 9);
        this.isRegistered = z;
        this.loginAttemptsRemaining = num;
        this.loginTimeoutRemainingSecs = num2;
        this._islandRsaPub = JQx.A1b(bArr);
        this._islandRsaPubSignature = JQx.A1b(bArr2);
        this._opaquePub = JQx.A1b(bArr3);
        this._opaquePubSignature = JQx.A1b(bArr4);
        this.islandEd25519Pub = JQx.A1b(bArr5);
        this.islandEd25519PubSignature = JQx.A1b(bArr6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VestaServerInitResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, Integer num, byte[] bArr5, byte[] bArr6) {
        this(bArr, bArr2, bArr3, bArr4, z, num, null, bArr5, bArr6);
        7zT.A1W(bArr, bArr2, bArr3, bArr4);
        11T.A0F(bArr5, 7);
        11T.A0F(bArr6, 8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            VestaServerInitResponse vestaServerInitResponse = (VestaServerInitResponse) obj;
            Integer num = this.loginAttemptsRemaining;
            Integer num2 = vestaServerInitResponse.loginAttemptsRemaining;
            boolean A1U = num == null ? AnonymousClass001.A1U(num2) : num.equals(num2);
            Integer num3 = this.loginTimeoutRemainingSecs;
            Integer num4 = vestaServerInitResponse.loginTimeoutRemainingSecs;
            boolean A1U2 = num3 == null ? AnonymousClass001.A1U(num4) : num3.equals(num4);
            if (!Arrays.equals(this._islandRsaPub, vestaServerInitResponse._islandRsaPub) || !Arrays.equals(this._islandRsaPubSignature, vestaServerInitResponse._islandRsaPubSignature) || !Arrays.equals(this._opaquePub, vestaServerInitResponse._opaquePub) || !Arrays.equals(this._opaquePubSignature, vestaServerInitResponse._opaquePubSignature) || this.isRegistered != vestaServerInitResponse.isRegistered || !A1U || !A1U2 || !Arrays.equals(this.islandEd25519Pub, vestaServerInitResponse.islandEd25519Pub) || !Arrays.equals(this.islandEd25519PubSignature, vestaServerInitResponse.islandEd25519PubSignature)) {
                return false;
            }
        }
        return true;
    }

    public final boolean getIsRegistered() {
        return this.isRegistered;
    }

    public final byte[] getIslandEd25519Pub() {
        return this.islandEd25519Pub;
    }

    public final byte[] getIslandEd25519PubSignature() {
        return this.islandEd25519PubSignature;
    }

    public final byte[] getIslandRsaPub() {
        return JQx.A1b(this._islandRsaPub);
    }

    public final byte[] getIslandRsaPubSignature() {
        return JQx.A1b(this._islandRsaPubSignature);
    }

    public final Integer getLoginAttemptsRemaining() {
        return this.loginAttemptsRemaining;
    }

    public final Integer getLoginTimeoutRemainingSecs() {
        return this.loginTimeoutRemainingSecs;
    }

    public final byte[] getOpaquePub() {
        return JQx.A1b(this._opaquePub);
    }

    public final byte[] getOpaquePubSignature() {
        return JQx.A1b(this._opaquePubSignature);
    }

    public int hashCode() {
        return (((((((((((((((Arrays.hashCode(this._islandRsaPub) * 31) + Arrays.hashCode(this._islandRsaPubSignature)) * 31) + Arrays.hashCode(this._opaquePub)) * 31) + Arrays.hashCode(this._opaquePubSignature)) * 31) + AnonymousClass002.A00(this.isRegistered ? 1 : 0)) * 31) + AnonymousClass001.A02(this.loginAttemptsRemaining)) * 31) + 4YU.A03(this.loginTimeoutRemainingSecs)) * 31) + Arrays.hashCode(this.islandEd25519Pub)) * 31) + Arrays.hashCode(this.islandEd25519PubSignature);
    }

    public final boolean isRegistered() {
        return this.isRegistered;
    }
}
