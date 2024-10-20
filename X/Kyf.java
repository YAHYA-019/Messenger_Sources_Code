package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: Kyf.class */
public abstract class Kyf {
    public static final KCu A00;
    public static final KCu A01;
    public static final KCu A02;

    static {
        KCu kCu = KCu.DEFAULT_INSTANCE;
        A01 = kCu;
        A02 = kCu;
        A00 = kCu;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        L3p l3p = L3p.A01;
        l3p.A01(Lfl.A01);
        l3p.A02(Lfl.A00);
        l3p.A01(Lfi.A00);
        KMC kmc = KdE.A00;
        if (!kmc.A00()) {
            throw JQx.A10("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        LCx lCx = LCx.A01;
        lCx.A0B(Kyw.A05);
        lCx.A0A(Kyw.A04);
        lCx.A09(Kyw.A03);
        lCx.A08(Kyw.A02);
        l3p.A02(KdE.A04);
        l3p.A02(KdE.A05);
        L1Z l1z = L1Z.A01;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("HMAC_SHA256_128BITTAG", Kd9.A01);
        L1n l1n = L1n.A03;
        L1q l1q = L1q.A03;
        A0u.put("HMAC_SHA256_128BITTAG_RAW", KYc.A00(l1q, l1n, 32, 16));
        L1n l1n2 = L1n.A04;
        A0u.put("HMAC_SHA256_256BITTAG", KYc.A00(l1q, l1n2, 32, 32));
        A0u.put("HMAC_SHA256_256BITTAG_RAW", KYc.A00(l1q, l1n, 32, 32));
        L1q l1q2 = L1q.A05;
        A0u.put("HMAC_SHA512_128BITTAG", KYc.A00(l1q2, l1n2, 64, 16));
        A0u.put("HMAC_SHA512_128BITTAG_RAW", KYc.A00(l1q2, l1n, 64, 16));
        A0u.put("HMAC_SHA512_256BITTAG", KYc.A00(l1q2, l1n2, 64, 32));
        A0u.put("HMAC_SHA512_256BITTAG_RAW", KYc.A00(l1q2, l1n, 64, 32));
        A0u.put("HMAC_SHA512_512BITTAG", Kd9.A04);
        JQy.A1L(l1z, "HMAC_SHA512_512BITTAG_RAW", KYc.A00(l1q2, l1n, 64, 64), A0u);
        L81 l81 = L81.A02;
        l81.A01(KdE.A02, KBt.class);
        L1Y.A01.A00(KdE.A03, KBt.class);
        L8M l8m = L8M.A02;
        l8m.A01(kmc, KdE.A01);
        if (KyR.A00.get()) {
            return;
        }
        Kjk kjk = Kcv.A02;
        if (!KMC.A00.A00()) {
            throw JQx.A10("Registering AES CMAC is not supported in FIPS mode");
        }
        lCx.A0B(L7D.A03);
        lCx.A0A(L7D.A02);
        lCx.A09(L7D.A01);
        lCx.A08(L7D.A00);
        l81.A01(Kcv.A01, KBs.class);
        l3p.A02(Kcv.A02);
        l3p.A02(Kcv.A03);
        HashMap A0u2 = AnonymousClass001.A0u();
        KBs kBs = Kd9.A00;
        A0u2.put("AES_CMAC", kBs);
        A0u2.put("AES256_CMAC", kBs);
        JQy.A1L(l1z, "AES256_CMAC_RAW", KYa.A00(L1m.A03, 32, 16), A0u2);
        l8m.A02(Kcv.A00);
    }
}
