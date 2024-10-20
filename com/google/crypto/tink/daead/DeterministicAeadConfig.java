package com.google.crypto.tink.daead;

import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.KBp;
import X.KCu;
import X.KMC;
import X.KbC;
import X.Kcu;
import X.KdG;
import X.Kjk;
import X.KyR;
import X.L1Y;
import X.L1Z;
import X.L1l;
import X.L3p;
import X.L81;
import X.L8M;
import X.LCx;
import X.Lfk;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: DeterministicAeadConfig.class */
public abstract class DeterministicAeadConfig {
    public static final KCu A00;
    public static final KCu A01;

    static {
        KCu kCu = KCu.DEFAULT_INSTANCE;
        A01 = kCu;
        A00 = kCu;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        L3p l3p = L3p.A01;
        l3p.A01(Lfk.A00);
        l3p.A02(Lfk.A01);
        if (KyR.A00.get()) {
            return;
        }
        Kjk kjk = Kcu.A03;
        if (!KMC.A00.A00()) {
            throw JQx.A10("Registering AES SIV is not supported in FIPS mode");
        }
        LCx lCx = LCx.A01;
        lCx.A0B(KdG.A03);
        lCx.A0A(KdG.A02);
        lCx.A09(KdG.A01);
        lCx.A08(KdG.A00);
        l3p.A02(Kcu.A03);
        L1Z l1z = L1Z.A01;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("AES256_SIV", KbC.A00);
        JQy.A1L(l1z, "AES256_SIV_RAW", new KBp(L1l.A02, 64), A0u);
        L1Y.A01.A00(Kcu.A02, KBp.class);
        L81.A02.A01(Kcu.A01, KBp.class);
        L8M.A02.A02(Kcu.A00);
    }
}
