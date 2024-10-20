package com.facebook.crypto.module;

import X.0Pz;
import X.1Fe;
import X.1Fi;
import X.1PN;
import X.C00131a8;
import X.C01s;
import X.InterfaceC00051a0;

/* loaded from: LightSharedPreferencesPersistence.class */
public final class LightSharedPreferencesPersistence {
    public static final 1PN A02 = 1PN.A00.A01();
    public final 1Fi A00;
    public final C01s A01;

    public LightSharedPreferencesPersistence(C01s c01s, 1Fe r303) {
        this.A00 = r303.A00("user_storage_device_key");
        this.A01 = c01s;
    }

    public static String A00(String str, int i) {
        StringBuilder sb;
        String num;
        if (i <= 0 || str.equals("user_storage_device_key")) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(".v");
            num = Integer.toString(i);
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("v");
            sb.append(Integer.toString(i));
            num = ".";
        }
        sb.append(num);
        return sb.toString();
    }

    public static void A01(InterfaceC00051a0 interfaceC00051a0, String str, byte[] bArr) {
        if (bArr == null) {
            interfaceC00051a0.Cdi(str);
        } else {
            interfaceC00051a0.CaK(str, A02.A03(bArr));
        }
    }

    public static byte[] A02(LightSharedPreferencesPersistence lightSharedPreferencesPersistence, String str) {
        1Fi r0 = lightSharedPreferencesPersistence.A00;
        String string = r0.getString(str, "");
        if (string.isEmpty()) {
            return null;
        }
        try {
            return A02.A05(string);
        } catch (IllegalArgumentException unused) {
            lightSharedPreferencesPersistence.A01.D0v("com.facebook.crypto.module.LightSharedPreferencesPersistence", 0Pz.A0v("Error loading hex key, ", str, " = ", string));
            InterfaceC00051a0 AP5 = r0.AP5();
            AP5.Cdi(str);
            AP5.commit();
            return null;
        }
    }

    public C00131a8 A03(String str) {
        String A0W = 0Pz.A0W("user_storage_encrypted_key.", str);
        return new C00131a8(A02(this, A0W), A02(this, 0Pz.A0W("user_storage_not_encrypted_key.", str)));
    }

    public C00131a8 A04(String str, int i) {
        String A0W = 0Pz.A0W(A00("user_storage_encrypted_key.", i), str);
        return new C00131a8(A02(this, A0W), A02(this, 0Pz.A0W(A00("user_storage_not_encrypted_key.", i), str)));
    }

    public void A05(C00131a8 c00131a8, String str) {
        String A0W = 0Pz.A0W("user_storage_encrypted_key.", str);
        String A0W2 = 0Pz.A0W("user_storage_not_encrypted_key.", str);
        InterfaceC00051a0 AP5 = this.A00.AP5();
        A01(AP5, A0W, c00131a8.A00);
        A01(AP5, A0W2, c00131a8.A01);
        AP5.commit();
    }

    public void A06(C00131a8 c00131a8, String str, int i) {
        String A0W = 0Pz.A0W(A00("user_storage_encrypted_key.", i), str);
        String A0W2 = 0Pz.A0W(A00("user_storage_not_encrypted_key.", i), str);
        InterfaceC00051a0 AP5 = this.A00.AP5();
        A01(AP5, A0W, c00131a8.A00);
        A01(AP5, A0W2, c00131a8.A01);
        AP5.commit();
    }

    public void A07(byte[] bArr) {
        InterfaceC00051a0 AP5 = this.A00.AP5();
        A01(AP5, "user_storage_device_key", bArr);
        AP5.commit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r0.contains(r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08(java.lang.String r302, int r303) {
        /*
            r301 = this;
            java.lang.String r0 = "user_storage_encrypted_key."
            r1 = r303
            java.lang.String r0 = A00(r0, r1)
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r304 = r0
            java.lang.String r0 = "user_storage_not_encrypted_key."
            r1 = r303
            java.lang.String r0 = A00(r0, r1)
            r305 = r0
            r0 = r305
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r306 = r0
            r0 = r301
            X.1Fi r0 = r0.A00
            r307 = r0
            r0 = r307
            r1 = r304
            boolean r0 = r0.contains(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L46
            r0 = r307
            r1 = r306
            boolean r0 = r0.contains(r1)
            r309 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r305 = r0
            r0 = r309
            if (r0 == 0) goto L49
        L46:
            r0 = 1
            r308 = r0
        L49:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.crypto.module.LightSharedPreferencesPersistence.A08(java.lang.String, int):boolean");
    }
}
