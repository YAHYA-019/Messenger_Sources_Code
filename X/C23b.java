package X;

import android.graphics.Point;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.23b, reason: invalid class name */
/* loaded from: 23b.class */
public final class C23b implements 1tI {
    public Point A00 = new Point(0, 0);
    public 1Iw A01;
    public 23S A02;
    public 23S A03;
    public C1sq A04;
    public C1s8 A05;
    public List A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final 1tF A0B;
    public final C23a A0C;
    public final boolean A0D;

    public C23b(1Iw r302, 23S r303, 1tF r304, C1sq c1sq, C1s8 c1s8, C23a c23a, int i, int i2, int i3, boolean z) {
        this.A0A = i;
        this.A0B = r304;
        this.A08 = i2;
        this.A09 = i3;
        this.A0D = z;
        this.A0C = c23a;
        this.A05 = c1s8;
        this.A04 = c1sq;
        this.A01 = r302;
        this.A02 = r303;
    }

    public 1tF AaW() {
        return this.A0B;
    }

    public List Ake() {
        return this.A06;
    }

    public int AtX() {
        return this.A08;
    }

    public int B8E() {
        return this.A09;
    }

    public int BH1() {
        return this.A0A;
    }

    public C1s8 BH3() {
        C1s8 c1s8 = this.A05;
        if (c1s8 != null) {
            return c1s8;
        }
        throw 1BK.A0h();
    }

    public boolean BQK() {
        return this.A0D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A08 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BT2() {
        /*
            r301 = this;
            r0 = r301
            X.1sq r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A08
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23b.BT2():boolean");
    }

    public void CbU(1Im r302, String str) {
        11T.A0F(str, 0);
        11T.A0F(r302, 1);
        List list = this.A06;
        if (list == null) {
            list = new ArrayList();
        }
        this.A06 = list;
        list.add(new Pair(str, r302));
    }
}
