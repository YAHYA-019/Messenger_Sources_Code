package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* loaded from: Kud.class */
public final class Kud {
    public LBU A00;
    public LBU A01;
    public LBU A02;
    public LBU A03;
    public LBU A04;
    public LBU A05;
    public LBU A06;
    public C3110Jjh A07;
    public C3110Jjh A08;
    public final float[] A09;
    public final Matrix A0A = GOn.A0F();
    public final Matrix A0B;
    public final Matrix A0C;
    public final Matrix A0D;
    public final boolean A0E;

    public Kud(LSd lSd) {
        LSN lsn = lSd.A07;
        this.A00 = lsn == null ? null : lsn.AJ3();
        MJT mjt = lSd.A09;
        this.A03 = mjt == null ? null : mjt.AJ3();
        C3118Jjp c3118Jjp = lSd.A08;
        this.A05 = c3118Jjp == null ? null : new C3108Jjf(((LSO) c3118Jjp).A00);
        C3114Jjl c3114Jjl = lSd.A02;
        this.A04 = c3114Jjl == null ? null : AbstractC3112Jjj.A01(c3114Jjl);
        C3114Jjl c3114Jjl2 = lSd.A03;
        C3110Jjh A01 = c3114Jjl2 == null ? null : AbstractC3112Jjj.A01(c3114Jjl2);
        this.A07 = A01;
        this.A0E = lSd.A00;
        if (A01 != null) {
            this.A0B = GOn.A0F();
            this.A0C = GOn.A0F();
            this.A0D = GOn.A0F();
            this.A09 = new float[9];
        }
        C3114Jjl c3114Jjl3 = lSd.A04;
        this.A08 = c3114Jjl3 == null ? null : AbstractC3112Jjj.A01(c3114Jjl3);
        C3116Jjn c3116Jjn = lSd.A06;
        if (c3116Jjn != null) {
            this.A02 = new LBU(((LSO) c3116Jjn).A00);
        }
        C3114Jjl c3114Jjl4 = lSd.A05;
        if (c3114Jjl4 != null) {
            this.A06 = AbstractC3112Jjj.A01(c3114Jjl4);
        } else {
            this.A06 = null;
        }
        C3114Jjl c3114Jjl5 = lSd.A01;
        if (c3114Jjl5 != null) {
            this.A01 = AbstractC3112Jjj.A01(c3114Jjl5);
        } else {
            this.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0337, code lost:
    
        if (r306 != 0.0f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Matrix A00() {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kud.A00():android.graphics.Matrix");
    }

    public Matrix A01(float f) {
        float f2;
        LBU lbu = this.A03;
        PointF pointF = null;
        PointF A04 = lbu == null ? null : LBU.A04(lbu);
        LBU lbu2 = this.A05;
        Kp9 kp9 = lbu2 == null ? null : (Kp9) lbu2.A07();
        Matrix matrix = this.A0A;
        matrix.reset();
        if (A04 != null) {
            matrix.preTranslate(A04.x * f, A04.y * f);
        }
        if (kp9 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(kp9.A00, d), (float) Math.pow(kp9.A01, d));
        }
        LBU lbu3 = this.A04;
        if (lbu3 != null) {
            float A02 = LBU.A02(lbu3);
            LBU lbu4 = this.A00;
            if (lbu4 != null) {
                pointF = LBU.A04(lbu4);
            }
            float f3 = A02 * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public void A02(MEj mEj) {
        LBU lbu = this.A02;
        if (lbu != null) {
            lbu.A0A(mEj);
        }
        LBU lbu2 = this.A06;
        if (lbu2 != null) {
            lbu2.A0A(mEj);
        }
        LBU lbu3 = this.A01;
        if (lbu3 != null) {
            lbu3.A0A(mEj);
        }
        LBU lbu4 = this.A00;
        if (lbu4 != null) {
            lbu4.A0A(mEj);
        }
        LBU lbu5 = this.A03;
        if (lbu5 != null) {
            lbu5.A0A(mEj);
        }
        LBU lbu6 = this.A05;
        if (lbu6 != null) {
            lbu6.A0A(mEj);
        }
        LBU lbu7 = this.A04;
        if (lbu7 != null) {
            lbu7.A0A(mEj);
        }
        C3110Jjh c3110Jjh = this.A07;
        if (c3110Jjh != null) {
            c3110Jjh.A0A(mEj);
        }
        C3110Jjh c3110Jjh2 = this.A08;
        if (c3110Jjh2 != null) {
            c3110Jjh2.A0A(mEj);
        }
    }

    public void A03(LSJ lsj) {
        lsj.A0C(this.A02);
        lsj.A0C(this.A06);
        lsj.A0C(this.A01);
        lsj.A0C(this.A00);
        lsj.A0C(this.A03);
        lsj.A0C(this.A05);
        lsj.A0C(this.A04);
        lsj.A0C(this.A07);
        lsj.A0C(this.A08);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v128, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.LBU] */
    /* JADX WARN: Type inference failed for: r305v1, types: [X.LBU, X.Jjh] */
    /* JADX WARN: Type inference failed for: r305v3, types: [X.LBU, X.Jjh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(X.L34 r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kud.A04(X.L34, java.lang.Object):boolean");
    }
}
