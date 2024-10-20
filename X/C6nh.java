package X;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import java.util.Arrays;

/* renamed from: X.6nh, reason: invalid class name */
/* loaded from: 6nh.class */
public final class C6nh {
    public int A00;
    public C1qo A01;
    public final C6ni A02 = new C6ni();
    public final PathEffect[] A03 = new PathEffect[2];

    public C6nh(1Iw r302) {
        this.A01 = r302.A0E;
    }

    private final C1qo A00() {
        C1qo c1qo = this.A01;
        if (c1qo != null) {
            return c1qo;
        }
        throw AnonymousClass001.A0N("This builder has already been disposed / built!");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C6ni A01() {
        /*
            r301 = this;
            r0 = r301
            X.1qo r0 = r0.A00()
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            r0.A01 = r1
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L89
            r0 = r301
            X.6ni r0 = r0.A02
            r306 = r0
            r0 = r301
            android.graphics.PathEffect[] r0 = r0.A03
            r302 = r0
            r0 = r302
            r1 = 0
            r0 = r0[r1]
            r307 = r0
            r0 = r302
            r1 = r304
            r0 = r0[r1]
            r308 = r0
            android.graphics.ComposePathEffect r0 = new android.graphics.ComposePathEffect
            r302 = r0
            r0 = r302
            r1 = r307
            r2 = r308
            r0.<init>(r1, r2)
        L3d:
            r0 = r306
            r1 = r302
            r0.A00 = r1
        L43:
            r0 = r301
            X.6ni r0 = r0.A02
            r309 = r0
            r0 = r309
            android.graphics.PathEffect r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L9d
            r0 = r309
            int[] r0 = r0.A03
            r310 = r0
            r0 = r310
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 4
            r311 = r0
            r0 = r310
            r1 = 0
            r0 = r0[r1]
            r303 = r0
            r0 = 1
            r304 = r0
        L6a:
            r0 = r310
            r1 = r304
            r0 = r0[r1]
            r305 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L7c
            java.lang.String r0 = "Borders do not currently support different widths with a path effect"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        L7c:
            r0 = r304
            r1 = 1
            int r0 = r0 + r1
            r304 = r0
            r0 = r304
            r1 = r311
            if (r0 >= r1) goto L9d
            goto L6a
        L89:
            r0 = r303
            if (r0 <= 0) goto L43
            r0 = r301
            X.6ni r0 = r0.A02
            r306 = r0
            r0 = r301
            android.graphics.PathEffect[] r0 = r0.A03
            r1 = 0
            r0 = r0[r1]
            r302 = r0
            goto L3d
        L9d:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6nh.A01():X.6ni");
    }

    public final void A02(float f) {
        A04(A00().A02(f));
    }

    public final void A03(float f, int i) {
        A06(i, A00().A02(f));
    }

    public final void A04(int i) {
        A00();
        Arrays.fill(this.A02.A01, 0, 4, i);
    }

    public final void A05(int i) {
        A04(A00().A06(i));
    }

    public final void A06(int i, int i2) {
        A00();
        float f = i2;
        if (f < 0.0f) {
            throw AnonymousClass001.A0L("Can't have a negative radius value");
        }
        this.A02.A01[i] = f;
    }

    public final void A07(C26z c26z, float f) {
        A0A(c26z, A00().A02(f));
    }

    public final void A08(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        A00();
        C6ni.A04.A02(c26z, this.A02.A02, i);
    }

    public final void A09(C26z c26z, int i) {
        A08(c26z, A00().A04(i));
    }

    public final void A0A(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        A00();
        C6ni c6ni = this.A02;
        if (i < 0) {
            throw AnonymousClass001.A0L(0Pz.A0E(i, "Given negative border width value: ", " for edge ", c26z.name()));
        }
        C6ni.A04.A02(c26z, c6ni.A03, i);
    }

    public final void A0B(C26z c26z, int i) {
        A0A(c26z, A00().A06(i));
    }

    public final void A0C(float[] fArr) {
        A00();
        int i = this.A00;
        if (i >= 2) {
            throw AnonymousClass001.A0L("You cannot specify more than 2 effects to compose");
        }
        PathEffect[] pathEffectArr = this.A03;
        this.A00 = i + 1;
        pathEffectArr[i] = new DashPathEffect(fArr, 0.0f);
    }
}
