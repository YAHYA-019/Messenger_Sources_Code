package com.facebook.crypto.module;

import X.1UO;
import java.util.Arrays;

/* loaded from: SecureMessageDEKConfigureSetter.class */
public class SecureMessageDEKConfigureSetter implements 1UO {
    public static SecureMessageDEKConfigureSetter A00;
    public static byte[] A01;

    public void CqL(byte[] bArr) {
        A01 = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
    }

    public void D6D() {
        synchronized (this) {
            byte[] bArr = A01;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
            A01 = null;
        }
    }
}
