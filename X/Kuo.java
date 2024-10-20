package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: Kuo.class */
public final class Kuo {
    public static int A0E;
    public double A01;
    public double A03;
    public Kzt A05;
    public boolean A06;
    public L3C A08;
    public final String A0C;
    public final Khk A09 = new Object();
    public final Khk A0A = new Object();
    public final Khk A0B = new Object();
    public boolean A07 = true;
    public double A02 = 0.005d;
    public double A00 = 0.005d;
    public double A04 = 0.0d;
    public final CopyOnWriteArraySet A0D = new CopyOnWriteArraySet();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Khk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Khk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Khk, java.lang.Object] */
    public Kuo(L3C l3c) {
        this.A08 = l3c;
        int i = A0E;
        A0E = i + 1;
        this.A0C = 0Pz.A0T("spring:", i);
        A04(Kzt.A02);
    }

    public void A00() {
        Khk khk = this.A09;
        double d = khk.A00;
        this.A01 = d;
        this.A0B.A00 = d;
        khk.A01 = 0.0d;
    }

    public void A01(double d) {
        L3C l3c = this.A08;
        this.A03 = d;
        this.A09.A00 = d;
        l3c.A02(this.A0C);
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            ((MIh) it.next()).CMU(this);
        }
        A00();
    }

    public void A02(double d) {
        if (this.A01 == d && A06()) {
            return;
        }
        L3C l3c = this.A08;
        this.A03 = this.A09.A00;
        this.A01 = d;
        l3c.A02(this.A0C);
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void A03(double d) {
        Khk khk = this.A09;
        if (d != khk.A01) {
            L3C l3c = this.A08;
            khk.A01 = d;
            l3c.A02(this.A0C);
        }
    }

    public void A04(Kzt kzt) {
        if (kzt == null) {
            throw AnonymousClass001.A0L("springConfig is required");
        }
        this.A05 = kzt;
    }

    public void A05(MIh mIh) {
        if (mIh == null) {
            throw AnonymousClass001.A0L("newListener is required");
        }
        this.A0D.add(mIh);
    }

    public boolean A06() {
        Khk khk = this.A09;
        if (Math.abs(khk.A01) <= this.A02) {
            return JQx.A01(this.A01, khk.A00) <= this.A00 || this.A05.A01 == 0.0d;
        }
        return false;
    }
}
