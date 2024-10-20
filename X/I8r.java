package X;

import android.content.Context;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: I8r.class */
public final class I8r {
    public ExecutorService A02;
    public Integer A03;
    public final Context A04;
    public final I8c A05;
    public final IFD A06;
    public final JO9 A07;
    public final JGy A09;
    public final JKb A0A;
    public final JLT A0B;
    public final Hkg A0C;
    public final JH6 A0D;
    public final File A0E;
    public final JMX A08 = new IjQ(this);
    public final HashMap A0F = AnonymousClass001.A0u();
    public final AtomicBoolean A0G = new AtomicBoolean();
    public List A00 = AnonymousClass001.A0s();
    public List A01 = AnonymousClass001.A0s();

    public I8r(Context context, I8c i8c, IFD ifd, JO9 jo9, JGy jGy, JKb jKb, JLT jlt, Ik6 ik6, Hkg hkg, File file, Integer num) {
        this.A04 = context;
        this.A07 = jo9;
        this.A0C = hkg;
        this.A06 = ifd;
        this.A0B = jlt;
        this.A09 = jGy;
        this.A0A = jKb;
        this.A05 = i8c;
        this.A0D = ik6;
        this.A0E = file;
        this.A03 = num;
    }

    private Hkg A00(Hqj hqj, JMX jmx, I9d i9d) {
        int i;
        int i2;
        Hkg hkg = this.A0C;
        I8v i8v = hkg.A06;
        if (i8v != null) {
            i = Math.max(i8v.A0C, i8v.A0A);
            i2 = i8v.A01;
        } else {
            I7N i7n = I7N.A04;
            i = i7n.A01;
            i2 = i7n.A00;
        }
        I8v A03 = ICy.A03(hqj, new I7N(i, i2), null, true);
        A03.A0F = new Hce(true, 1500000L);
        I0d i0d = new I0d(hkg);
        i0d.A06 = A03;
        i0d.A07 = jmx;
        i0d.A08 = i9d;
        i0d.A0I = false;
        return new Hkg(i0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.AbstractMap] */
    private void A01(HAy hAy, I4d i4d, I9d i9d) {
        HashMap A08 = i9d.A08(hAy);
        if (A08 != null) {
            int size = A08.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                Huc huc = (Huc) GOo.A0s(A08, i2);
                if (huc != null) {
                    I9H i9h = new I9H(huc.A01, huc.A02, huc.A00);
                    Iterator A1D = GOp.A1D(huc.A04);
                    while (A1D.hasNext()) {
                        HuY huY = (HuY) A1D.next();
                        File file = huY.A04;
                        I9V i9v = huY.A03;
                        HashMap hashMap = this.A0F;
                        if (hashMap.containsKey(huc)) {
                            file = (File) hashMap.get(huc);
                            if (this.A0C.A0M) {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                long max = Math.max(0L, i9v.A03(timeUnit));
                                long A02 = i9v.A02(timeUnit);
                                long j = huY.A01;
                                if (A02 < 0) {
                                    A02 = j;
                                }
                                long j2 = j - A02;
                                long j3 = j - max;
                                if (j2 == 0) {
                                    j2 = -1;
                                }
                                if (j3 == j) {
                                    j3 = -1;
                                }
                                i9v = new I9V(timeUnit, j2, j3);
                            } else {
                                long j4 = -1;
                                i9v = new I9V(TimeUnit.SECONDS, j4, j4);
                            }
                        }
                        Hpx hpx = new Hpx(file);
                        hpx.A03 = i9v;
                        hpx.A02 = huY.A02;
                        hpx.A00 = huY.A00;
                        hpx.A01 = huY.A01;
                        hpx.A05 = huY.A05;
                        i9h.A02(hpx.A00());
                    }
                    Iterator A1D2 = GOp.A1D(huc.A07);
                    while (A1D2.hasNext()) {
                        Rau rau = (Rau) A1D2.next();
                        float f = rau.A00;
                        if (f >= 0.0f || this.A0C.A0M) {
                            i9h.A01(rau.A01, Math.abs(f));
                        }
                    }
                    Iterator A1D3 = GOp.A1D(huc.A06);
                    while (A1D3.hasNext()) {
                        i9h.A06.add(A1D3.next());
                    }
                    i9h.A03.putAll(huc.A03);
                    Iterator it = huc.A05.iterator();
                    while (it.hasNext()) {
                        ?? next = it.next();
                        try {
                            next = i9h.A05;
                            next.add(next);
                        } catch (IllegalArgumentException unused) {
                            throw AnonymousClass001.A0U(next);
                        }
                    }
                    i4d.A03(new Huc(i9h));
                }
                i = i2 + 1;
            }
            HashMap hashMap2 = i9d.A01;
            if (hashMap2.containsKey(hAy)) {
                HashMap hashMap3 = i4d.A01;
                HashMap A0u = hashMap3.containsKey(hAy) ? (AbstractMap) hashMap3.get(hAy) : AnonymousClass001.A0u();
                A0u.getClass();
                HashMap hashMap4 = (HashMap) hashMap2.get(hAy);
                hashMap4.getClass();
                A0u.putAll(hashMap4);
                hashMap3.put(hAy, A0u);
            }
            List<RSc> A1I = GOn.A1I(hAy, i9d.A00);
            if (A1I != null) {
                for (RSc rSc : A1I) {
                    i4d.A01(rSc.A00, hAy, rSc.A01);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x06ba, code lost:
    
        if (r326.size() != r0.size()) goto L342;
     */
    /* JADX WARN: Type inference failed for: r0v242, types: [java.lang.Object, X.JGv] */
    /* JADX WARN: Type inference failed for: r0v335, types: [java.lang.Object, X.JJI] */
    /* JADX WARN: Type inference failed for: r0v406, types: [java.lang.Object, X.JGv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.I9d A02(boolean r302) {
        /*
            Method dump skipped, instructions count: 2346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8r.A02(boolean):X.I9d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A01.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03() {
        /*
            r301 = this;
            r0 = r301
            java.util.List r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L27
            r0 = r301
            java.util.List r0 = r0.A01
            r305 = r0
            r0 = r305
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 != 0) goto L2d
        L27:
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
        L2d:
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0G
            r308 = r0
            r0 = r308
            boolean r0 = r0.get()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lb0
            r0 = r306
            if (r0 != 0) goto Lb0
            r0 = r308
            r1 = r304
            r0.set(r1)
            r0 = r302
            java.util.Iterator r0 = r0.iterator()
            r308 = r0
        L50:
            r0 = r308
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L72
            r0 = r308
            java.lang.Object r0 = r0.next()
            X.JKY r0 = (X.JKY) r0
            r305 = r0
            r0 = r305
            r0.cancel()
            goto L50
        L72:
            r0 = r301
            java.util.List r0 = r0.A01
            r307 = r0
            r0 = r307
            java.util.Iterator r0 = r0.iterator()
            r308 = r0
        L81:
            r0 = r308
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La3
            r0 = r308
            java.lang.Object r0 = r0.next()
            X.JKY r0 = (X.JKY) r0
            r305 = r0
            r0 = r305
            r0.cancel()
            goto L81
        La3:
            r0 = r302
            r0.clear()
            r0 = r307
            r0.clear()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8r.A03():void");
    }
}
