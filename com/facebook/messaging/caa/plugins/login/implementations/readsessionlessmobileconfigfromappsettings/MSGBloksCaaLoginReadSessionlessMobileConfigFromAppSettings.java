package com.facebook.messaging.caa.plugins.login.implementations.readsessionlessmobileconfigfromappsettings;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.3oR;
import X.AnonymousClass001;
import X.C3TJ;
import X.CME;
import X.DKc;
import X.FEK;
import X.FGb;
import X.FHh;
import X.FyG;
import X.GJj;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: MSGBloksCaaLoginReadSessionlessMobileConfigFromAppSettings.class */
public final class MSGBloksCaaLoginReadSessionlessMobileConfigFromAppSettings {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v137, types: [java.lang.Boolean] */
    public static final HashMap A00(FHh fHh, DKc dKc) {
        AbstractMap abstractMap;
        AbstractMap abstractMap2;
        Double valueOf;
        String str;
        GJj gJj = ((FGb) dKc.A01(1)).A00;
        FyG fyG = fHh.A03;
        if (fyG == null || fyG.A00 == null) {
            throw 1BK.A0h();
        }
        CME cme = (CME) 1Bn.A0A(83236);
        AtomicReference atomicReference = CME.A05;
        if (atomicReference.get() == null) {
            ReentrantLock reentrantLock = CME.A06;
            reentrantLock.lock();
            try {
                if (atomicReference.get() == null) {
                    atomicReference.set(CME.A00(cme));
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        Map map = (Map) atomicReference.get();
        HashMap A0u = AnonymousClass001.A0u();
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Object key = A0z.getKey();
                if (!A0u.containsKey(key)) {
                    A0u.put(key, AnonymousClass001.A0u());
                }
                Iterator A0y2 = AnonymousClass001.A0y((Map) A0z.getValue());
                while (A0y2.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                    Object key2 = A0z2.getKey();
                    int i = ((3oR) A0z2.getValue()).A06;
                    long A00 = ((3oR) A0z2.getValue()).A00();
                    AbstractMap abstractMap3 = (AbstractMap) A0u.get(key);
                    if (abstractMap3 != null) {
                        abstractMap3.put(key2, AnonymousClass001.A0u());
                    }
                    if (i == 1) {
                        AbstractMap abstractMap4 = (AbstractMap) A0u.get(key);
                        if (abstractMap4 != null) {
                            abstractMap2 = (AbstractMap) abstractMap4.get(key2);
                            if (abstractMap2 != null) {
                                valueOf = Boolean.valueOf(((C3TJ) 1Br.A0B(cme.A04)).A09(A00));
                                str = "bln";
                                abstractMap2.put(str, valueOf);
                            }
                        }
                    } else if (i == 2) {
                        AbstractMap abstractMap5 = (AbstractMap) A0u.get(key);
                        if (abstractMap5 != null) {
                            abstractMap2 = (AbstractMap) abstractMap5.get(key2);
                            if (abstractMap2 != null) {
                                valueOf = Long.valueOf(((C3TJ) 1Br.A0B(cme.A04)).A05(A00));
                                str = "i64";
                                abstractMap2.put(str, valueOf);
                            }
                        }
                    } else if (i == 3) {
                        AbstractMap abstractMap6 = (AbstractMap) A0u.get(key);
                        if (abstractMap6 != null) {
                            abstractMap2 = (AbstractMap) abstractMap6.get(key2);
                            if (abstractMap2 != null) {
                                valueOf = ((C3TJ) 1Br.A0B(cme.A04)).A07(A00);
                                11T.A0A(valueOf);
                                str = "str";
                                abstractMap2.put(str, valueOf);
                            }
                        }
                    } else if (i == 4 && (abstractMap = (AbstractMap) A0u.get(key)) != null) {
                        abstractMap2 = (AbstractMap) abstractMap.get(key2);
                        if (abstractMap2 != null) {
                            valueOf = Double.valueOf(((C3TJ) 1Br.A0B(cme.A04)).A03(A00));
                            str = "dbl";
                            abstractMap2.put(str, valueOf);
                        }
                    }
                }
            }
        }
        FEK.A00(fHh, DKc.A01, gJj);
        return A0u;
    }
}
