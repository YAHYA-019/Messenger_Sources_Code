package com.facebook.crypto.keychain;

import X.0Pz;
import X.0S2;
import X.1BK;
import X.1UQ;
import X.1VR;
import X.1VU;
import X.1aA;
import X.1aD;
import X.2L6;
import X.2LB;
import X.35Y;
import X.AnonymousClass001;
import X.C00131a8;
import X.C3Pu;
import android.util.Log;
import com.facebook.crypto.keychain.UserStorageKeyChainLegacy;
import com.facebook.crypto.module.LightSharedPreferencesPersistence;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: UserStorageKeyChainLegacy.class */
public class UserStorageKeyChainLegacy implements 1VR {
    public String A00;
    public byte[] A01;
    public final 1UQ A02;
    public final LightSharedPreferencesPersistence A03;
    public final SecureRandom A04;
    public static final Integer A06 = 0S2.A01;
    public static final 1VU A05 = new 1VU("device_key".getBytes(1VU.A01));
    public static final byte[] A07 = {0, 0, 0, 0};

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UserStorageKeyChainLegacy(X.1UQ r302, com.facebook.crypto.module.LightSharedPreferencesPersistence r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.crypto.keychain.UserStorageKeyChainLegacy.<init>(X.1UQ, com.facebook.crypto.module.LightSharedPreferencesPersistence, java.lang.String):void");
    }

    private void A00(String str, Throwable th) {
        if (this instanceof 35Y) {
            1BK.A09(((35Y) this).A00.A04).softReport(UserStorageKeyChainLegacy.class.getName(), str, th);
        } else {
            Log.d("com.facebook.crypto.keychain.UserStorageKeyChainLegacy", str, th);
        }
    }

    public boolean BN6() {
        boolean A1T;
        synchronized (this) {
            A1T = AnonymousClass001.A1T(this.A01);
        }
        return A1T;
    }

    public void Bc7(String str, byte[] bArr, byte[] bArr2) {
        Throwable th;
        C3Pu c3Pu;
        synchronized (this) {
            ArrayList A0t = AnonymousClass001.A0t(2);
            if (bArr != null) {
                int length = bArr.length;
                Integer num = A06;
                int A00 = 1aA.A00(num);
                if (length == A00) {
                    A0t.add(bArr);
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        int A002 = 1aA.A00(num);
                        if (length2 == A002) {
                            A0t.add(bArr2);
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
                LightSharedPreferencesPersistence lightSharedPreferencesPersistence = this.A03;
                C00131a8 A03 = lightSharedPreferencesPersistence.A03(str);
                byte[] bArr3 = A03.A01;
                if (bArr3 == null || !A0t.isEmpty()) {
                    byte[] bArr4 = A03.A00;
                    if (bArr4 != null) {
                        int i = 0;
                        while (true) {
                            if (i >= A0t.size()) {
                                A00("Cannot decrypt device-key with either user-key!", null);
                                break;
                            }
                            final byte[] bArr5 = (byte[]) A0t.get(i);
                            try {
                                try {
                                    new C3Pu(new 1aD(new KeyChain() { // from class: X.3X3
                                        @Override // com.facebook.crypto.keychain.KeyChain
                                        public byte[] getCipherKey() {
                                            return bArr5;
                                        }

                                        @Override // com.facebook.crypto.keychain.KeyChain
                                        public byte[] getMacKey() {
                                            throw AnonymousClass001.A0p();
                                        }

                                        @Override // com.facebook.crypto.keychain.KeyChain
                                        public byte[] getNewIV() {
                                            Integer num2 = UserStorageKeyChainLegacy.A06;
                                            byte[] bArr6 = new byte[12];
                                            UserStorageKeyChainLegacy.this.A04.nextBytes(bArr6);
                                            return bArr6;
                                        }
                                    }, this.A02.A00, 0S2.A01).A00(A05, bArr4), i);
                                    break;
                                } catch (IOException e) {
                                    A00("Wrong user-key", e);
                                    i++;
                                }
                            } catch (2LB | 2L6 e2) {
                                new Exception("Crypto library is unavailable", e2);
                                throw th;
                            }
                        }
                    }
                    new C3Pu();
                } else {
                    new C3Pu();
                }
                byte[] bArr6 = c3Pu.A01;
                if (bArr6 == null) {
                    bArr6 = bArr3;
                    if (bArr3 != null) {
                        int length3 = bArr3.length;
                        if (length3 != 1aA.A00(A06) && !Arrays.equals(bArr3, A07)) {
                            A00(0Pz.A0T("Device key stored plain was not valid!!! Length: ", length3), null);
                        }
                    }
                    if (!A0t.isEmpty()) {
                        bArr6 = new byte[1aA.A00(A06)];
                        this.A04.nextBytes(bArr6);
                    } else {
                        bArr6 = A07;
                    }
                }
                bArr6.getClass();
                byte[] bArr7 = A03.A00;
                if (c3Pu.A00 != 0 && !A0t.isEmpty()) {
                    final byte[] bArr8 = (byte[]) A0t.get(0);
                    try {
                        try {
                            bArr7 = new 1aD(new KeyChain() { // from class: X.3X3
                                @Override // com.facebook.crypto.keychain.KeyChain
                                public byte[] getCipherKey() {
                                    return bArr8;
                                }

                                @Override // com.facebook.crypto.keychain.KeyChain
                                public byte[] getMacKey() {
                                    throw AnonymousClass001.A0p();
                                }

                                @Override // com.facebook.crypto.keychain.KeyChain
                                public byte[] getNewIV() {
                                    Integer num2 = UserStorageKeyChainLegacy.A06;
                                    byte[] bArr62 = new byte[12];
                                    UserStorageKeyChainLegacy.this.A04.nextBytes(bArr62);
                                    return bArr62;
                                }
                            }, this.A02.A00, 0S2.A01).A01(A05, bArr6);
                        } catch (IOException e3) {
                            throw new Exception("Crypto library is unavailable", e3);
                        }
                    } catch (2LB | 2L6 e4) {
                        new Exception("Crypto library is unavailable", e4);
                        throw th;
                    }
                }
                lightSharedPreferencesPersistence.A05(new C00131a8(bArr7, bArr6), str);
                lightSharedPreferencesPersistence.A07(bArr6);
                this.A01 = bArr6;
                this.A00 = str;
                Iterator it = A0t.iterator();
                while (it.hasNext()) {
                    Arrays.fill((byte[]) it.next(), (byte) 0);
                }
            } catch (Throwable th2) {
                th = th2;
                Iterator it2 = A0t.iterator();
                while (it2.hasNext()) {
                    Arrays.fill((byte[]) it2.next(), (byte) 0);
                }
            }
        }
    }

    public void Bc8(boolean z) {
        synchronized (this) {
            if (this.A01 != null) {
                LightSharedPreferencesPersistence lightSharedPreferencesPersistence = this.A03;
                byte[] bArr = lightSharedPreferencesPersistence.A03(this.A00).A00;
                if (AnonymousClass001.A1U(bArr) || z) {
                    lightSharedPreferencesPersistence.A05(new C00131a8(bArr, this.A01), this.A00);
                } else {
                    lightSharedPreferencesPersistence.A05(new C00131a8(bArr, null), this.A00);
                    lightSharedPreferencesPersistence.A07(null);
                }
                this.A00 = null;
                Arrays.fill(this.A01, (byte) 0);
                this.A01 = null;
            }
        }
    }

    public byte[] getCipherKey() {
        byte[] bArr;
        synchronized (this) {
            byte[] bArr2 = this.A01;
            if (bArr2 == null) {
                Exception exc = new Exception("Key is not configured");
                A00(exc.getMessage(), exc);
                throw exc;
            }
            if (Arrays.equals(bArr2, A07)) {
                byte[] bArr3 = new byte[1aA.A00(A06)];
                this.A04.nextBytes(bArr3);
                this.A03.A07(bArr3);
                this.A01 = bArr3;
            }
            bArr = this.A01;
        }
        return bArr;
    }

    public byte[] getMacKey() {
        throw AnonymousClass001.A0p();
    }

    public byte[] getNewIV() {
        byte[] bArr = new byte[12];
        this.A04.nextBytes(bArr);
        return bArr;
    }
}
