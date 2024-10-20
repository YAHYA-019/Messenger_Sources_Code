package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: F95.class */
public final class F95 {
    public static final 1G2 A05 = 1G3.A01(1G0.A03, "p2p_fingerprint_nonce/");
    public 1BY A00;
    public final EX4 A04 = (EX4) 1Bn.A0E((Context) null, (1BY) null, 99363);
    public final C00i A02 = DKD.A0S();
    public final C00i A01 = 1BV.A01((1BY) null, 99396);
    public final C00i A03 = G7K.A00(this, 80);

    public F95(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(String str) {
        F8T f8t = (F8T) this.A03.get();
        if (str == null) {
            Eiq eiq = f8t.A02;
            DKE.A1L(eiq.A01, eiq.A00.edit(), "nonce_key/");
            return;
        }
        f8t.A01();
        try {
            Cipher cipher = (Cipher) f8t.A06.get();
            F80 f80 = f8t.A03;
            F80.A00(f80);
            PublicKey generatePublic = f8t.A04.generatePublic(new X509EncodedKeySpec(f80.A02.getCertificate("fingerprint_nonce_keystore_alias").getPublicKey().getEncoded()));
            if (generatePublic != null) {
                cipher.init(1, generatePublic);
                String A07 = Lix.A04(cipher.doFinal(Lix.A03(str).A0F())).A07();
                Eiq eiq2 = f8t.A02;
                1Ql edit = eiq2.A00.edit();
                DKE.A1M(eiq2.A01, edit, "nonce_key/", A07);
                edit.commit();
            }
        } catch (GeneralSecurityException e) {
            0fH.A0T(F8T.class, "Failed to write value for %s", new Object[]{"nonce_key/", e});
            throw 1BK.A0s(StringFormatUtil.formatStrLocaleSafe("Failed to put. key=%s, value=%s", "nonce_key/", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004e, code lost:
    
        if (com.google.common.base.Optional.fromNullable(r0.A00.BD0(X.1G3.A01(r0.A01, "nonce_key/"))).isPresent() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.F80 r0 = (X.F80) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A01()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L51
            r0 = r301
            X.00i r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.F8T r0 = (X.F8T) r0
            X.Eiq r0 = r0.A02
            r302 = r0
            java.lang.String r0 = "nonce_key/"
            r304 = r0
            r0 = r302
            com.facebook.prefs.shared.FbSharedPreferences r0 = r0.A00
            r305 = r0
            r0 = r302
            X.1G2 r0 = r0.A01
            r1 = r304
            X.1G2 r0 = X.1G3.A01(r0, r1)
            r302 = r0
            r0 = r305
            r1 = r302
            java.lang.String r0 = r0.BD0(r1)
            com.google.common.base.Optional r0 = com.google.common.base.Optional.fromNullable(r0)
            boolean r0 = r0.isPresent()
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r306
            if (r0 == 0) goto L53
        L51:
            r0 = 1
            r303 = r0
        L53:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F95.A01():boolean");
    }
}
