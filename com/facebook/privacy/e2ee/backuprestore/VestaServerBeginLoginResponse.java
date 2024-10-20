package com.facebook.privacy.e2ee.backuprestore;

import X.11T;
import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.JQx;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VestaServerBeginLoginResponse.class */
public final class VestaServerBeginLoginResponse {
    public final byte[] _opaqueL2;
    public final byte[] _opaqueL2Sig;
    public final Integer loginAttemptsRemaining;
    public final Integer loginTimeoutSecsOnFailure;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VestaServerBeginLoginResponse(byte[] bArr, byte[] bArr2) {
        this(bArr, bArr2, null, null);
        1BL.A1F(bArr, bArr2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VestaServerBeginLoginResponse(byte[] bArr, byte[] bArr2, Integer num) {
        this(bArr, bArr2, num, null);
        1BL.A1F(bArr, bArr2);
    }

    public VestaServerBeginLoginResponse(byte[] bArr, byte[] bArr2, Integer num, Integer num2) {
        1BL.A1F(bArr, bArr2);
        this.loginAttemptsRemaining = num;
        this.loginTimeoutSecsOnFailure = num2;
        this._opaqueL2 = JQx.A1b(bArr);
        this._opaqueL2Sig = JQx.A1b(bArr2);
    }

    public /* synthetic */ VestaServerBeginLoginResponse(byte[] bArr, byte[] bArr2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, bArr2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            VestaServerBeginLoginResponse vestaServerBeginLoginResponse = (VestaServerBeginLoginResponse) obj;
            if (!Arrays.equals(this._opaqueL2, vestaServerBeginLoginResponse._opaqueL2) || !Arrays.equals(this._opaqueL2Sig, vestaServerBeginLoginResponse._opaqueL2Sig) || !11T.A0O(this.loginAttemptsRemaining, vestaServerBeginLoginResponse.loginAttemptsRemaining) || !11T.A0O(this.loginTimeoutSecsOnFailure, vestaServerBeginLoginResponse.loginTimeoutSecsOnFailure)) {
                return false;
            }
        }
        return true;
    }

    public final Integer getLoginAttemptsRemaining() {
        return this.loginAttemptsRemaining;
    }

    public final Integer getLoginTimeoutSecsOnFailure() {
        return this.loginTimeoutSecsOnFailure;
    }

    public final byte[] getOpaqueL2() {
        return JQx.A1b(this._opaqueL2);
    }

    public final byte[] getOpaqueL2Sig() {
        return JQx.A1b(this._opaqueL2Sig);
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this._opaqueL2) * 31) + Arrays.hashCode(this._opaqueL2Sig)) * 31) + AnonymousClass001.A02(this.loginTimeoutSecsOnFailure)) * 31) + 4YU.A03(this.loginAttemptsRemaining);
    }
}
