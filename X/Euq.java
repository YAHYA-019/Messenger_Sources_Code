package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* loaded from: Euq.class */
public final class Euq {
    public final ARDFileCache A00;
    public final F48 A01;
    public final C01s A02;
    public final EzC A03;
    public final 1Ve A04;

    public Euq(EzC ezC, ARDFileCache aRDFileCache, F48 f48, C01s c01s, 1Ve r306) {
        C3o5.A0k(f48, 2, c01s);
        this.A03 = ezC;
        this.A01 = f48;
        this.A04 = r306;
        this.A00 = aRDFileCache;
        this.A02 = c01s;
        ezC.A01.add(FZB.A00(this, 2));
        EOp eOp = ezC.A04;
        eOp = eOp == null ? EOp.A05 : eOp;
        if (eOp == EOp.A05) {
            ezC.A00();
        } else {
            A00(eOp);
        }
    }

    public final void A00(EOp eOp) {
        1Ql putBoolean;
        EOp eOp2 = EOp.A06;
        1Br r0 = this.A01.A00;
        if (eOp != eOp2) {
            putBoolean = 1Br.A08(r0);
            putBoolean.Cdj(F48.A00());
        } else {
            C00i c00i = r0.A00;
            if (1BK.A0S(c00i).AZn(F48.A00(), false)) {
                return;
            }
            Set allKeys = this.A00.getAllKeys();
            11T.A0A(allKeys);
            if (!allKeys.isEmpty()) {
                ImmutableList A0a = 1BL.A0a(allKeys);
                try {
                    Ffv ffv = (Ffv) ((GCU) DKE.A0p(F0i.class, "create", 0));
                    ffv.A01.A06("effect_ids", A0a);
                    ffv.A02 = true;
                    C3s4 ACe = ffv.ACe();
                    11T.A0A(ACe);
                    ACe.setMaxToleratedCacheAgeMs(60000L);
                    ACe.setFreshCacheAgeMs(60000L);
                    FfP.A00(new FfU(this, allKeys, 0), this.A04, ACe, this, 2);
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    throw AnonymousClass001.A0U(F0i.class);
                }
            }
            putBoolean = 1BL.A0U(c00i).putBoolean(F48.A00(), true);
        }
        putBoolean.commit();
    }
}
