package X;

import android.content.Context;

/* loaded from: E8a.class */
public final class E8a extends E8c implements C1r0 {
    public static final int[] A02 = new int[2];
    public final FqZ A00;
    public final FqZ A01;

    public E8a(Context context) {
        super(context);
        this.A00 = new FqZ(this);
        this.A01 = new E8k(this);
    }

    public void A0Z(FrB frB) {
        2AS r306;
        FqZ fqZ = this.A01;
        if (11T.A0O(fqZ.A00, frB)) {
            return;
        }
        FrB frB2 = fqZ.A00;
        if (frB2 != null) {
            frB2.A01 = null;
        }
        fqZ.A00 = frB;
        if (frB != null) {
            FqZ fqZ2 = frB.A01;
            if (fqZ2 != null && !fqZ2.equals(fqZ)) {
                throw AnonymousClass001.A0T("Must detach from previous host listener first");
            }
            frB.A01 = fqZ;
            r306 = frB.A00;
        } else {
            r306 = null;
        }
        if (11T.A0O(fqZ.A01, r306)) {
            return;
        }
        if (r306 == null) {
            (fqZ instanceof E8k ? ((E8k) fqZ).A00 : fqZ.A04).A0F();
        }
        fqZ.A01 = r306;
        fqZ.A03.requestLayout();
    }

    @Override // X.C1r0
    public void Bgo() {
        this.A01.Bgo();
    }

    @Override // android.view.View
    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        Bgo();
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        Bgo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1522178918);
        super.onAttachedToWindow();
        FqZ fqZ = this.A01;
        (fqZ instanceof E8k ? ((E8k) fqZ).A00 : fqZ.A04).A0D();
        0FI.A0C(-2142187806, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1729796356);
        super.onDetachedFromWindow();
        FqZ fqZ = this.A01;
        (fqZ instanceof E8k ? ((E8k) fqZ).A00 : fqZ.A04).A0E();
        0FI.A0C(1596863422, A06);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        FqZ fqZ = this.A01;
        long A00 = 23U.A00(i, i2);
        int[] iArr = A02;
        11T.A0F(iArr, 1);
        if (C26P.A08(A00) && C26P.A07(A00)) {
            fqZ.A02 = true;
            iArr[0] = C26P.A01(A00);
            iArr[1] = C26P.A00(A00);
        } else {
            FrB frB = fqZ.A00;
            if (frB == null) {
                super.onMeasure(i, i2);
                return;
            } else {
                frB.A05(A00, iArr);
                fqZ.A02 = false;
            }
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        Bgo();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        Bgo();
    }
}
