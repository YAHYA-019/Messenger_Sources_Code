package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: I4d.class */
public final class I4d {
    public HashMap A02 = AnonymousClass001.A0u();
    public HashMap A00 = AnonymousClass001.A0u();
    public HashMap A01 = AnonymousClass001.A0u();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r306 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.I9V r301, X.HAy r302, X.I4d r303, com.facebook.videolite.transcoder.base.composition.MediaEffect r304) {
        /*
            X.RSc r0 = new X.RSc     // Catch: java.lang.IllegalArgumentException -> L45
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r304
            r0.<init>(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L45
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch: java.lang.IllegalArgumentException -> L45 java.lang.IllegalArgumentException -> L45
            r306 = r0
            r0 = r303
            java.util.HashMap r0 = r0.A00     // Catch: java.lang.IllegalArgumentException -> L45
            r307 = r0
            r0 = r307
            r1 = r302
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.IllegalArgumentException -> L45
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L31
            r0 = r302
            r1 = r307
            java.util.List r0 = X.GOn.A1I(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L45
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3b
        L31:
            r0 = r306
            r1 = r305
            boolean r0 = r0.add(r1)     // Catch: java.lang.IllegalArgumentException -> L45
        L3b:
            r0 = r307
            r1 = r302
            r2 = r306
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L45
            return
        L45:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4d.A00(X.I9V, X.HAy, X.I4d, com.facebook.videolite.transcoder.base.composition.MediaEffect):void");
    }

    public void A01(I9V i9v, HAy hAy, MediaEffect mediaEffect) {
        A00(i9v, hAy, this, mediaEffect);
    }

    public void A02(HAy hAy, MediaEffect mediaEffect) {
        long j = -1;
        A00(new I9V(TimeUnit.MILLISECONDS, j, j), hAy, this, mediaEffect);
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable, java.lang.Object] */
    public void A03(Huc huc) {
        int size;
        ?? put;
        try {
            IFX.A07(7zM.A1b(1BK.A17(huc.A04)), (String) null);
            HAy hAy = huc.A01;
            Iterator A1D = GOp.A1D(huc.A03.keySet());
            while (A1D.hasNext()) {
                Object next = A1D.next();
                AbstractMap abstractMap = (AbstractMap) this.A02.get(hAy);
                if (abstractMap != null) {
                    Iterator A1D2 = GOp.A1D(abstractMap.values());
                    do {
                        if (A1D2.hasNext()) {
                        }
                    } while (!((Huc) A1D2.next()).A03.containsKey(next));
                }
            }
            HashMap hashMap = this.A02;
            AbstractMap abstractMap2 = (AbstractMap) hashMap.get(hAy);
            if (abstractMap2 == null) {
                abstractMap2 = AnonymousClass001.A0u();
                size = 0;
            } else {
                size = abstractMap2.size();
            }
            abstractMap2.put(Integer.valueOf(size), huc);
            put = hashMap.put(hAy, abstractMap2);
        } catch (IllegalArgumentException unused) {
            throw AnonymousClass001.A0U(put);
        }
    }
}
