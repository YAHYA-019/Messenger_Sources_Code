package com.facebook.crypto.keychain;

import X.04J;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.1CO;
import X.1Fi;
import X.1UD;
import X.1UG;
import X.1UQ;
import X.1VR;
import X.1VU;
import X.1Vd;
import X.1ZG;
import X.1Zs;
import X.1aA;
import X.1aD;
import X.2L6;
import X.2LB;
import X.AnonymousClass001;
import X.C00131a8;
import X.C01s;
import X.C1Zv;
import X.C3Pv;
import X.C3X4;
import X.InterfaceC00051a0;
import android.util.Log;
import com.facebook.crypto.module.LightSharedPreferencesPersistence;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: UserStorageKeyChainV2.class */
public class UserStorageKeyChainV2 implements 1VR {
    public static boolean A0B;
    public int A00;
    public int A01;
    public String A02;
    public boolean A03 = false;
    public byte[] A04;
    public 1Zs A05;
    public final 1UQ A06;
    public final LightSharedPreferencesPersistence A07;
    public final 1Vd A08;
    public final 1CO A09;
    public final SecureRandom A0A;
    public static final Integer A0D = 0S2.A01;
    public static final 1VU A0C = new 1VU("device_key".getBytes(1VU.A01));
    public static final byte[] A0E = {0, 0, 0, 0};

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f9, code lost:
    
        if (r301.A01 <= r301.A00) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UserStorageKeyChainV2(X.1Zs r302, X.1UQ r303, com.facebook.crypto.module.LightSharedPreferencesPersistence r304, X.1Vd r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.crypto.keychain.UserStorageKeyChainV2.<init>(X.1Zs, X.1UQ, com.facebook.crypto.module.LightSharedPreferencesPersistence, X.1Vd, java.lang.String):void");
    }

    private int A00(String str) {
        if (this.A00 == -1) {
            1Fi r0 = this.A07.A00;
            int i = r0.getInt(0Pz.A0W("user_storage_device_key_version#", str), 0);
            this.A00 = i;
            InterfaceC00051a0 AP5 = r0.AP5();
            AP5.CaD(0Pz.A0W("user_storage_device_key_version#", str), i);
            AP5.commit();
        }
        return this.A00;
    }

    public static void A01(UserStorageKeyChainV2 userStorageKeyChainV2, Integer num, String str, String str2, String str3, int i, int i2) {
        String str4;
        1UG A00 = 1UD.A00((04J) userStorageKeyChainV2.A05.A00.A00.get(), 1ZG.A01, "dek_generation");
        if (A00.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str4 = "DEK_GENERATION_ATTEMPT";
                    break;
                case 1:
                    str4 = "DEK_GENERATION_NO_OP";
                    break;
                case 2:
                    str4 = "DEK_GENERATION_SUCCESS";
                    break;
                default:
                    str4 = "DEK_GENERATION_FAILED";
                    break;
            }
            A00.A7R("event_type", str4);
            A00.A6H("local_storage_key_version", Long.valueOf(i));
            A00.A6H("server_storage_key_version", Long.valueOf(i2));
            A00.A7R("error_info", str);
            A00.A7R("exception_type", str2);
            A00.A7R("extra_info", str3);
            A00.BZL();
        }
    }

    private void A02(String str) {
        LightSharedPreferencesPersistence lightSharedPreferencesPersistence = this.A07;
        String A0W = 0Pz.A0W("has_migrated_to_versioned_storage", str);
        1Fi r0 = lightSharedPreferencesPersistence.A00;
        if (r0.getBoolean(A0W, false)) {
            return;
        }
        0fH.A0l("com.facebook.crypto.keychain.UserStorageKeyChainV2", "Start key versioned storage migration");
        byte[] A02 = LightSharedPreferencesPersistence.A02(lightSharedPreferencesPersistence, "user_storage_device_key");
        C00131a8 A03 = lightSharedPreferencesPersistence.A03(str);
        if (A02 != null && A03.A01 == null) {
            A03 = new C00131a8(A03.A00, A02);
        }
        lightSharedPreferencesPersistence.A06(A03, str, this.A00);
        String A0W2 = 0Pz.A0W("has_migrated_to_versioned_storage", str);
        InterfaceC00051a0 AP5 = r0.AP5();
        AP5.Ca2(A0W2, true);
        AP5.commit();
        InterfaceC00051a0 AP52 = r0.AP5();
        if (r0.contains("user_storage_device_key")) {
            AP52.Cdi("user_storage_device_key");
        }
        AP52.commit();
        String A0W3 = 0Pz.A0W("user_storage_encrypted_key.", str);
        String A0W4 = 0Pz.A0W("user_storage_not_encrypted_key.", str);
        if (r0.contains(A0W3) || r0.contains(A0W4)) {
            String A0W5 = 0Pz.A0W("user_storage_encrypted_key.", str);
            String A0W6 = 0Pz.A0W("user_storage_not_encrypted_key.", str);
            InterfaceC00051a0 AP53 = r0.AP5();
            if (r0.contains(A0W5)) {
                AP53.Cdi(A0W5);
            }
            if (r0.contains(A0W6)) {
                AP53.Cdi(A0W6);
            }
            AP53.commit();
        }
    }

    public static byte[] A03(UserStorageKeyChainV2 userStorageKeyChainV2, byte[] bArr, byte[] bArr2) {
        bArr2.getClass();
        try {
            try {
                return new 1aD(new C3X4(userStorageKeyChainV2, bArr), userStorageKeyChainV2.A06.A00, 0S2.A01).A01(A0C, bArr2);
            } catch (2LB | 2L6 e) {
                throw new Exception("Crypto library is unavailable", e);
            }
        } catch (IOException e2) {
            throw new Exception("Crypto library is unavailable", e2);
        }
    }

    private void A04(String str, Throwable th) {
        if (this instanceof C1Zv) {
            ((C01s) ((C1Zv) this).A00.A04.get()).softReport(UserStorageKeyChainV2.class.getName(), str, th);
        } else {
            Log.d("com.facebook.crypto.keychain.UserStorageKeyChainV2", str, th);
        }
    }

    public boolean BN6() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A04 != null) {
                z = true;
            }
        }
        return z;
    }

    public void Bc7(String str, byte[] bArr, byte[] bArr2) {
        C3Pv c3Pv;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(2);
            if (bArr != null) {
                int length = bArr.length;
                Integer num = A0D;
                int A00 = 1aA.A00(num);
                if (length == A00) {
                    arrayList.add(bArr);
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        int A002 = 1aA.A00(num);
                        if (length2 == A002) {
                            arrayList.add(bArr2);
                        } else {
                            new Exception(0Pz.A0C(length2, A002, "Incorrect key length: ", ". It should be: "), null);
                        }
                    }
                } else {
                    new Exception(0Pz.A0C(length, A00, "Incorrect key length: ", ". It should be: "), null);
                }
                throw th;
            }
            try {
                this.A03 = true;
                this.A00 = A00(str);
                int i = this.A01;
                if (i == -1) {
                    i = (int) this.A09.Auy(36593464959370556L);
                    this.A01 = i;
                }
                this.A01 = i;
                A02(str);
                LightSharedPreferencesPersistence lightSharedPreferencesPersistence = this.A07;
                C00131a8 A04 = lightSharedPreferencesPersistence.A04(str, this.A00);
                byte[] bArr3 = A04.A01;
                if (bArr3 == null || !arrayList.isEmpty()) {
                    byte[] bArr4 = A04.A00;
                    if (bArr4 != null) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= arrayList.size()) {
                                A04("Cannot decrypt device-key with either user-key!", null);
                                break;
                            }
                            try {
                                try {
                                    new C3Pv(new 1aD(new C3X4(this, (byte[]) arrayList.get(i3)), this.A06.A00, 0S2.A01).A00(A0C, bArr4), i3);
                                    break;
                                } catch (2LB | 2L6 e) {
                                    throw new Exception("Crypto library is unavailable", e);
                                }
                            } catch (IOException e2) {
                                A04("Wrong user-key", e2);
                                i2 = i3 + 1;
                            }
                        }
                    }
                    new C3Pv();
                } else {
                    new C3Pv();
                }
                byte[] bArr5 = c3Pv.A01;
                if (bArr5 == null) {
                    bArr5 = bArr3;
                    if (bArr3 != null) {
                        int length3 = bArr3.length;
                        if (length3 != 1aA.A00(A0D) && !Arrays.equals(bArr3, A0E)) {
                            A04(0Pz.A0T("Device key stored plain was not valid!!! Length: ", length3), null);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        bArr5 = new byte[1aA.A00(A0D)];
                        this.A0A.nextBytes(bArr5);
                    } else {
                        bArr5 = A0E;
                    }
                }
                byte[] bArr6 = A04.A00;
                if (c3Pv.A00 != 0 && !arrayList.isEmpty()) {
                    bArr6 = A03(this, (byte[]) arrayList.get(0), bArr5);
                }
                lightSharedPreferencesPersistence.A06(new C00131a8(bArr6, bArr5), str, this.A00);
                this.A04 = bArr5;
                this.A02 = str;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Arrays.fill((byte[]) it.next(), (byte) 0);
                }
            } catch (Throwable th) {
                th = th;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Arrays.fill((byte[]) it2.next(), (byte) 0);
                }
            }
        }
    }

    public void Bc8(boolean z) {
        synchronized (this) {
            if (this.A04 != null) {
                LightSharedPreferencesPersistence lightSharedPreferencesPersistence = this.A07;
                byte[] bArr = lightSharedPreferencesPersistence.A04(this.A02, this.A00).A00;
                boolean z2 = false;
                if (bArr == null) {
                    z2 = true;
                }
                if (z2 || z) {
                    lightSharedPreferencesPersistence.A06(new C00131a8(bArr, this.A04), this.A02, 0);
                } else {
                    lightSharedPreferencesPersistence.A06(new C00131a8(bArr, null), this.A02, this.A00);
                }
                this.A02 = null;
                Arrays.fill(this.A04, (byte) 0);
                this.A04 = null;
            }
            this.A00 = -1;
            this.A01 = -1;
            A0B = false;
            this.A03 = false;
        }
    }

    public byte[] getCipherKey() {
        byte[] bArr;
        synchronized (this) {
            byte[] bArr2 = this.A04;
            if (bArr2 == null) {
                Exception exc = new Exception("User storage key is not configured");
                A04(exc.getMessage(), exc);
                throw exc;
            }
            if (Arrays.equals(bArr2, A0E)) {
                byte[] bArr3 = new byte[1aA.A00(A0D)];
                this.A0A.nextBytes(bArr3);
                this.A07.A06(new C00131a8(null, bArr3), this.A02, this.A00);
                this.A04 = bArr3;
            }
            bArr = this.A04;
        }
        return bArr;
    }

    public byte[] getMacKey() {
        throw AnonymousClass001.A0p();
    }

    public byte[] getNewIV() {
        byte[] bArr = new byte[12];
        this.A0A.nextBytes(bArr);
        return bArr;
    }
}
