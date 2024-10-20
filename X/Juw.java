package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Identity;
import java.util.AbstractMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Juw.class */
public final class Juw extends 1Jw implements MQZ {
    public final AwakeTimeSinceBootClock A00;
    public final HnI A01;
    public final C02q A02;
    public final C1hF A03;
    public final 1IU A04;
    public final AtomicReference A05 = new AtomicReference();
    public final C15h A06;
    public final C15h A07;
    public final Random A08;
    public final C15h A09;
    public final C15h A0A;
    public final C15h A0B;
    public final C15h A0C;
    public volatile int A0D;
    public volatile long A0E;
    public volatile long A0F;
    public volatile C3ly A0G;
    public volatile 1LS A0H;
    public volatile C30k A0I;
    public volatile C1nc A0J;

    public Juw(AwakeTimeSinceBootClock awakeTimeSinceBootClock, HnI hnI, C02q c02q, C1hF c1hF, 1IU r306, Random random, C15h c15h, C15h c15h2, C15h c15h3, C15h c15h4, C15h c15h5, C15h c15h6) {
        this.A02 = c02q;
        this.A06 = c15h;
        this.A09 = c15h2;
        this.A0B = c15h3;
        this.A0A = c15h4;
        this.A07 = c15h5;
        this.A0C = c15h6;
        this.A03 = c1hF;
        this.A04 = r306;
        this.A08 = random;
        this.A00 = awakeTimeSinceBootClock;
        this.A01 = hnI;
        c02q.execute(new LlN(this));
    }

    public static boolean A00(Identity identity, Identity identity2) {
        HyperThriftBase hyperThriftBase;
        Object A00;
        Object A002;
        if (identity != null) {
            if (identity2 == null) {
                return false;
            }
            HyperThriftBase hyperThriftBase2 = (HyperThriftBase) identity.A00(1);
            if (hyperThriftBase2 != null) {
                HyperThriftBase hyperThriftBase3 = (HyperThriftBase) identity2.A00(1);
                if (hyperThriftBase3 == null) {
                    return false;
                }
                if (!2Go.A00(hyperThriftBase2.A00(0), hyperThriftBase3.A00(0))) {
                    A00 = ((HyperThriftBase) identity.A00(1)).A00(2);
                    A002 = ((HyperThriftBase) identity2.A00(1)).A00(2);
                }
            } else {
                HyperThriftBase hyperThriftBase4 = (HyperThriftBase) identity.A00(0);
                if (hyperThriftBase4 == null || (hyperThriftBase = (HyperThriftBase) identity2.A00(0)) == null || !2Go.A00(hyperThriftBase4.A00(0), hyperThriftBase.A00(0))) {
                    return false;
                }
                A00 = ((HyperThriftBase) identity.A00(0)).A00(1);
                A002 = ((HyperThriftBase) identity2.A00(0)).A00(1);
            }
            return 2Go.A00(A00, A002);
        }
        if (identity2 != null) {
            return false;
        }
        return true;
    }

    public void A01(C3ly c3ly) {
        this.A0G = c3ly;
        long j = this.A0E;
        long j2 = this.A0F;
        int i = this.A0D;
        boolean z = true;
        if (j != 0) {
            c3ly.AHF(Math.abs(j), i, AnonymousClass001.A1P((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        }
        if (j2 != 0) {
            if (j2 <= 0) {
                z = false;
            }
            c3ly.AHG(Math.abs(j2), z);
        }
    }

    public InterfaceC00301ap Aet() {
        4VG r0 = (4VG) this.A05.get();
        return r0 != null ? r0.A06 : 49G.A00;
    }

    public long Axb(int i) {
        int indexOfKey;
        if (i == 36322981) {
            return -1;
        }
        4VG r0 = (4VG) this.A05.get();
        if (this.A0J == null) {
            this.A0J = (C1nc) this.A0B.get();
        }
        if (r0 == null) {
            if (this.A0I == null) {
                this.A0I = (C30k) this.A09.get();
            }
            return this.A0I.A00(i);
        }
        1Ke r02 = r0.A03.A00;
        if (r02 == null || (indexOfKey = r02.indexOfKey(i)) < 0) {
            return 0L;
        }
        return r02.valueAt(indexOfKey);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r0 != 3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long B8e(int r302) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Juw.B8e(int):long");
    }

    public boolean BU6(int i) {
        AnonymousClass042 anonymousClass042;
        int indexOfKey;
        4VG r0 = (4VG) this.A05.get();
        boolean z = false;
        if (r0 != null) {
            Khj khj = r0.A04;
            C00i c00i = ((KfZ) this.A0C.get()).A00;
            boolean z2 = 1Hj.A00;
            Long valueOf = Long.valueOf(((1QA) c00i.get()).BIX().A00);
            if (khj.A00.indexOfKey(i) < 0 || ((indexOfKey = (anonymousClass042 = r0.A02.A00).indexOfKey(i)) >= 0 && (!((MEy) anonymousClass042.valueAt(indexOfKey)).BUF(valueOf.longValue())))) {
                z = true;
            }
        }
        return z;
    }

    public void CTB() {
        this.A05.set(null);
        this.A02.execute(new LlN(this));
    }

    public void CTN() {
        this.A05.set(null);
        this.A06.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0.nextInt(r302) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Cam(int r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.Random r0 = r0.A08
            r303 = r0
            r0 = r302
            if (r0 <= 0) goto L1e
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L14
            r0 = 1
            r302 = r0
        L12:
            r0 = r302
            return r0
        L14:
            r0 = r303
            r1 = r302
            int r0 = r0.nextInt(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L12
        L1e:
            r0 = -1
            r1 = 1
            int r0 = r0 >>> r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Juw.Cam(int):int");
    }

    public int Ci6(int i, String str) {
        AbstractMap abstractMap;
        Number number;
        4VG r0 = (4VG) this.A05.get();
        if (r0 != null && (abstractMap = (AbstractMap) r0.A05.A00.get(i)) != null && (number = (Number) abstractMap.get(str)) != null) {
            i = number.intValue();
        }
        return i;
    }
}
