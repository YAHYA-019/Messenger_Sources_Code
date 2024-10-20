package com.facebook.privacy.e2ee.backuprestore;

import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.Arrays;

/* loaded from: VestaServerFinishLoginResponse.class */
public final class VestaServerFinishLoginResponse {
    public final byte[] _loginPayload;
    public final Integer attemptsRemaining;
    public final boolean loginSuccess;

    public VestaServerFinishLoginResponse(byte[] bArr, boolean z, Integer num) {
        this.loginSuccess = z;
        this.attemptsRemaining = num;
        this._loginPayload = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            VestaServerFinishLoginResponse vestaServerFinishLoginResponse = (VestaServerFinishLoginResponse) obj;
            Integer num = this.attemptsRemaining;
            Integer num2 = vestaServerFinishLoginResponse.attemptsRemaining;
            boolean A1U = num == null ? AnonymousClass001.A1U(num2) : num.equals(num2);
            byte[] bArr = this._loginPayload;
            byte[] bArr2 = vestaServerFinishLoginResponse._loginPayload;
            boolean A1U2 = bArr == null ? AnonymousClass001.A1U(bArr2) : Arrays.equals(bArr, bArr2);
            if (this.loginSuccess != vestaServerFinishLoginResponse.loginSuccess || !A1U2 || !A1U) {
                return false;
            }
        }
        return true;
    }

    public final Integer getAttemptsRemaining() {
        return this.attemptsRemaining;
    }

    public final byte[] getLoginPayload() {
        byte[] bArr = this._loginPayload;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean getLoginSuccess() {
        return this.loginSuccess;
    }

    public int hashCode() {
        byte[] bArr = this._loginPayload;
        return ((((bArr == null ? 0 : Arrays.hashCode(bArr)) * 31) + AnonymousClass002.A00(this.loginSuccess ? 1 : 0)) * 31) + 4YU.A03(this.attemptsRemaining);
    }
}
