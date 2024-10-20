package X;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: L8C.class */
public final class L8C {
    public int A00;
    public java.util.Map A01;
    public Set A02;
    public final int A03;
    public final MK5 A04;
    public final Kek A05;
    public final KqG A06;
    public final 2DX A07;
    public final ConcurrentHashMap A08;
    public final Kej A09;
    public volatile int A0A;
    public volatile boolean A0B;

    public L8C(MK5 mk5, Kej kej, KqG kqG, 2DX r305, int i) {
        this.A07 = r305;
        this.A06 = kqG;
        this.A09 = kej;
        this.A04 = mk5;
        int A00 = (A00(mk5) * i) / 1000;
        A00 = A00 < 1 ? 1 : A00;
        this.A03 = A00;
        this.A08 = JQx.A13();
        this.A05 = new Kek(this.A04.getFrameCount());
        this.A00 = -1;
        this.A01 = 04R.A0G();
        this.A02 = C0uA.A00;
        A02(A00(this.A04));
        this.A0A = (int) (A00 * 0.5f);
    }

    public static final int A00(MK5 mk5) {
        long millis = TimeUnit.SECONDS.toMillis(1L) / (mk5.AvA() / mk5.getFrameCount());
        if (millis < 1) {
            millis = 1;
        }
        return (int) millis;
    }

    public static final void A01(L8C l8c, int i, int i2) {
        if (l8c.A0B) {
            return;
        }
        l8c.A0B = true;
        ThreadFactory threadFactory = Kbw.A01;
        Kbw.A00.execute(new LpR(l8c, i, i2));
    }

    public void A02(int i) {
        MK5 mk5 = this.A04;
        int AvA = mk5.AvA();
        int loopCount = mk5.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = AvA * loopCount;
        Kej kej = this.A09;
        int frameCount = mk5.getFrameCount();
        int A00 = A00(mk5);
        if (i > A00) {
            i = A00;
        }
        if (i < 1) {
            i = 1;
        }
        int i3 = kej.A00;
        if (i > i3) {
            i = i3;
        }
        float f = i * (i2 / 1000.0f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = frameCount;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i4 = 0;
        07E A07 = 07C.A07(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A07));
        for (Object obj : A07) {
            int A03 = AnonymousClass001.A03(obj);
            if (((int) (A03 % f3)) == 0) {
                i4 = A03;
            }
            1BK.A1P(obj, linkedHashMap, i4);
        }
        this.A01 = linkedHashMap;
        this.A02 = 0QD.A0f(linkedHashMap.values());
    }
}
