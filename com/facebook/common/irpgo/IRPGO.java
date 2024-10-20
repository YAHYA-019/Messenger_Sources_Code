package com.facebook.common.irpgo;

import X.0CU;
import X.11T;
import X.C03r;
import X.C0il;
import X.C1A9;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: IRPGO.class */
public final class IRPGO {
    public static final IRPGO INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.common.irpgo.IRPGO, java.lang.Object] */
    static {
        C0il.A0B("irpgoclient");
    }

    public static final int computeModuleId(String str) {
        11T.A0F(str, 0);
        String name = new File(str).getName();
        11T.A0A(name);
        int A03 = 0CU.A03(name, ".", name.length() - 1);
        if (A03 != -1) {
            name = name.substring(0, A03);
            11T.A0A(name);
        }
        int i = 0;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            11T.A0A(messageDigest);
            byte[] bytes = name.getBytes(C03r.A05);
            11T.A0A(bytes);
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            11T.A0A(digest);
            byte[] A0J = C1A9.A0J(digest, 0, 4);
            int length = A0J.length;
            int i2 = (length / 2) - 1;
            if (i2 >= 0) {
                int i3 = length - 1;
                int i4 = 0;
                while (true) {
                    byte b = A0J[i4];
                    A0J[i4] = A0J[i3];
                    A0J[i3] = b;
                    i3--;
                    if (i4 == i2) {
                        break;
                    }
                    i4++;
                }
            }
            i = ByteBuffer.wrap(A0J).getInt();
        } catch (NoSuchAlgorithmException unused) {
        }
        return i;
    }

    private final native int[] dumpIRPGOProfiles(String str);

    public final native byte[] dumpProfileRawDataToFiles(String str, boolean z);

    public final native long[] getExecutedFunctionIds();

    public final native byte[] getProfileRawData(boolean z);

    public final native void resetIRPGOProfileCounters();
}
