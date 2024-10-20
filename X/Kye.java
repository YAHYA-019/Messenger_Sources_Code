package X;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: Kye.class */
public abstract class Kye {
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
        l3p.A01(Lfj.A00);
        l3p.A02(Lfj.A01);
        Kyf.A00();
        KMC kmc = Kd6.A00;
        if (!kmc.A00()) {
            throw JQx.A10("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        LCx lCx = LCx.A01;
        lCx.A0B(L9f.A03);
        lCx.A0A(L9f.A02);
        lCx.A09(L9f.A01);
        lCx.A08(L9f.A00);
        l3p.A02(Kd6.A04);
        L1Z l1z = L1Z.A01;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("AES128_CTR_HMAC_SHA256", KdJ.A00);
        L1f l1f = L1f.A02;
        L1p l1p = L1p.A03;
        A0u.put("AES128_CTR_HMAC_SHA256_RAW", KYS.A00(l1p, l1f, 16, 32, 16, 16));
        A0u.put("AES256_CTR_HMAC_SHA256", KdJ.A01);
        JQy.A1L(l1z, "AES256_CTR_HMAC_SHA256_RAW", KYS.A00(l1p, l1f, 32, 32, 16, 32), A0u);
        L1Y l1y = L1Y.A01;
        l1y.A00(Kd6.A03, KBi.class);
        L81 l81 = L81.A02;
        l81.A01(Kd6.A02, KBi.class);
        L8M l8m = L8M.A02;
        l8m.A01(kmc, Kd6.A01);
        KMC kmc2 = Kd7.A00;
        if (!kmc2.A00()) {
            throw JQx.A10("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        lCx.A0B(L7C.A03);
        lCx.A0A(L7C.A02);
        lCx.A09(L7C.A01);
        lCx.A08(L7C.A00);
        l3p.A02(Kd7.A04);
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put("AES128_GCM", KdJ.A04);
        L1h l1h = L1h.A02;
        A0u2.put("AES128_GCM_RAW", new KBg(l1h, 16));
        A0u2.put("AES256_GCM", KdJ.A05);
        JQy.A1L(l1z, "AES256_GCM_RAW", new KBg(l1h, 32), A0u2);
        l1y.A00(Kd7.A03, KBg.class);
        l81.A01(Kd7.A02, KBg.class);
        l8m.A01(kmc2, Kd7.A01);
        if (KyR.A00.get()) {
            return;
        }
        Kjk kjk = Kcf.A02;
        KMC kmc3 = KMC.A00;
        if (!kmc3.A00()) {
            throw JQx.A10("Registering AES EAX is not supported in FIPS mode");
        }
        lCx.A0B(L7B.A03);
        lCx.A0A(L7B.A02);
        lCx.A09(L7B.A01);
        lCx.A08(L7B.A00);
        l3p.A02(Kcf.A02);
        HashMap A0u3 = AnonymousClass001.A0u();
        A0u3.put("AES128_EAX", KdJ.A02);
        L1g l1g = L1g.A02;
        A0u3.put("AES128_EAX_RAW", KYU.A00(l1g, 16, 16));
        A0u3.put("AES256_EAX", KdJ.A03);
        JQy.A1L(l1z, "AES256_EAX_RAW", KYU.A00(l1g, 16, 32), A0u3);
        l81.A01(Kcf.A01, KBf.class);
        l8m.A02(Kcf.A00);
        Kjk kjk2 = Kcs.A03;
        if (!kmc3.A00()) {
            throw JQx.A10("Registering AES GCM SIV is not supported in FIPS mode");
        }
        lCx.A0B(Kyr.A03);
        lCx.A0A(Kyr.A02);
        lCx.A09(Kyr.A01);
        lCx.A08(Kyr.A00);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            l3p.A02(Kcs.A03);
            HashMap A0u4 = AnonymousClass001.A0u();
            L1i l1i = L1i.A02;
            L1i l1i2 = L1i.A03;
            A0u4.put("AES128_GCM_SIV", new KBd(l1i2, 16));
            A0u4.put("AES128_GCM_SIV_RAW", new KBd(l1i, 16));
            A0u4.put("AES256_GCM_SIV", new KBd(l1i2, 32));
            JQy.A1L(l1z, "AES256_GCM_SIV_RAW", new KBd(l1i, 32), A0u4);
            l1y.A00(Kcs.A02, KBd.class);
            l81.A01(Kcs.A01, KBd.class);
            l8m.A02(Kcs.A00);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        Kjk kjk3 = Kcg.A02;
        if (!kmc3.A00()) {
            throw JQx.A10("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        lCx.A0B(Kys.A03);
        lCx.A0A(Kys.A02);
        lCx.A09(Kys.A01);
        lCx.A08(Kys.A00);
        l3p.A02(Kcg.A02);
        l81.A01(Kcg.A01, KBb.class);
        HashMap A0u5 = AnonymousClass001.A0u();
        A0u5.put("CHACHA20_POLY1305", new KBb(L1j.A03));
        JQy.A1L(l1z, "CHACHA20_POLY1305_RAW", new KBb(L1j.A02), A0u5);
        l8m.A02(Kcg.A00);
        MDW mdw = Kch.A01;
        if (!kmc3.A00()) {
            throw JQx.A10("Registering KMS AEAD is not supported in FIPS mode");
        }
        lCx.A0B(Kd8.A03);
        lCx.A0A(Kd8.A02);
        lCx.A09(Kd8.A01);
        lCx.A08(Kd8.A00);
        l3p.A02(Kch.A02);
        l81.A01(Kch.A01, KBe.class);
        l8m.A02(Kch.A00);
        MDW mdw2 = Kci.A01;
        if (!kmc3.A00()) {
            throw JQx.A10("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        lCx.A0B(L7A.A03);
        lCx.A0A(L7A.A02);
        lCx.A09(L7A.A01);
        lCx.A08(L7A.A00);
        l81.A01(Kci.A01, KBh.class);
        l3p.A02(Kci.A02);
        l8m.A02(Kci.A00);
        MDW mdw3 = Kct.A01;
        if (!kmc3.A00()) {
            throw JQx.A10("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        lCx.A0B(Kyt.A03);
        lCx.A0A(Kyt.A02);
        lCx.A09(Kyt.A01);
        lCx.A08(Kyt.A00);
        l3p.A02(Kct.A03);
        HashMap A0u6 = AnonymousClass001.A0u();
        A0u6.put("XCHACHA20_POLY1305", new KBc(L1k.A03));
        JQy.A1L(l1z, "XCHACHA20_POLY1305_RAW", new KBc(L1k.A02), A0u6);
        l81.A01(Kct.A01, KBc.class);
        l1y.A00(Kct.A02, KBc.class);
        l8m.A02(Kct.A00);
    }
}
