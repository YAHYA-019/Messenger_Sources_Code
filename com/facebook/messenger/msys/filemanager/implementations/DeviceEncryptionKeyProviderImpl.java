package com.facebook.messenger.msys.filemanager.implementations;

import X.1BQ;
import X.1UM;
import X.C00i;
import java.util.Arrays;

/* loaded from: DeviceEncryptionKeyProviderImpl.class */
public final class DeviceEncryptionKeyProviderImpl {
    public static 1UM A01;
    public static byte[] A02;
    public final C00i A00 = new 1BQ(65742);

    public static void A00(byte[] bArr) {
        byte[] copyOf;
        synchronized (DeviceEncryptionKeyProviderImpl.class) {
            if (bArr == null) {
                byte[] bArr2 = A02;
                if (bArr2 != null) {
                    Arrays.fill(bArr2, (byte) 0);
                }
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr, bArr.length);
            }
            A02 = copyOf;
        }
    }
}
