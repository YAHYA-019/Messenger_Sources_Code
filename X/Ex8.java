package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.google.common.base.Preconditions;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;

/* loaded from: Ex8.class */
public final class Ex8 {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final Eej A03;
    public final F95 A04;

    public Ex8(1BO r302) {
        Eej eej = (Eej) 1Bi.A03(99362);
        1HH A0Q = AbF.A0Q(AbF.A04((1BY) null), 100176);
        F95 f95 = (F95) 1Bn.A0E((Context) null, (1BY) null, 99353);
        1BV A01 = 1BV.A01((1BY) null, 99313);
        this.A02 = A0Q;
        this.A03 = eej;
        this.A04 = f95;
        this.A01 = A01;
        this.A00 = 7zL.A0Q(r302);
    }

    public Integer A00(F95 f95) {
        Integer num;
        LC7 lc7 = this.A03.A00;
        Preconditions.checkState(4YV.A1W(lc7.A04(255), 12), "Please check isFingerprintSupported() before calling this method");
        if (!((KeyguardManager) this.A02.get()).isKeyguardSecure()) {
            return 0S2.A00;
        }
        if (!AnonymousClass001.A1O(lc7.A04(255))) {
            return 0S2.A01;
        }
        if (f95 != null) {
            try {
                1G1 A05 = 1Fw.A05(f95.A00);
                if (DKC.A0Z(f95.A02).A07()) {
                    F80 f80 = (F80) f95.A01.get();
                    try {
                        KeyStore keyStore = f80.A02;
                        String str = A05.A02;
                        PrivateKey privateKey = (PrivateKey) keyStore.getKey(0Pz.A0W(str, "_fbpay_client_auth_keystore_alias"), null);
                        num = 0S2.A00;
                        if (privateKey != null) {
                            try {
                                Signature.getInstance("SHA256withRSA").initSign(privateKey);
                                num = 0S2.A01;
                            } catch (KeyPermanentlyInvalidatedException unused) {
                                num = 0S2.A0C;
                            }
                        }
                        KeyPairGenerator keyPairGenerator = f80.A01;
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(0Pz.A0W(str, "_fbpay_client_auth_keystore_alias"), 12).setDigests("SHA-256").setUserAuthenticationRequired(true).setSignaturePaddings("PKCS1").build());
                        keyPairGenerator.generateKeyPair();
                    } catch (GeneralSecurityException e) {
                        throw AnonymousClass001.A0U(e);
                    }
                } else {
                    num = ((F8T) f95.A03.get()).A01();
                }
            } catch (Exception e2) {
                num = 0S2.A0C;
                0fH.A0r("FingerprintAvailabilityManager", "Failed to prepare key store", e2);
            }
            Integer num2 = 0S2.A0C;
            if (num == num2) {
                ((F8y) this.A01.get()).A00(1Fw.A05(this.A00), false);
                return num2;
            }
        }
        return 0S2.A0N;
    }

    public boolean A01() {
        return 4YV.A1W(this.A03.A00.A04(255), 12);
    }
}
