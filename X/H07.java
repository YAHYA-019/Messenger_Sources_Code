package X;

import android.view.View;

/* loaded from: H07.class */
public final class H07 extends C66m {
    public final /* synthetic */ H4C A00;

    public H07(H4C h4c) {
        this.A00 = h4c;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        if (GOq.A01(c66i) == 0.0d) {
            H4C.A00(this.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, X.H4C] */
    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float A01 = (float) GOq.A01(c66i);
        if (A01 != 0.0f) {
            ?? r0 = this.A00;
            if (r0.A02 == 0 || (i = r0.A03) == 0) {
                return;
            }
            float width = (r0.getWidth() - ((i * r0.getHeight()) / r0.A02)) / 2.0f;
            float height = ((r0.getHeight() - ((r0.A02 * r0.getWidth()) / r0.A03)) / 2.0f) + r0.A04;
            int i4 = r0.A03;
            int i5 = r0.A02;
            float f3 = i5 / i4;
            if (r0.getWidth() == 0 || f3 <= DKC.A03((View) r0) / DKC.A02((View) r0)) {
                int A03 = GOn.A03(r0.getWidth() - i4, A01) + i4;
                int i6 = (i5 * A03) / i4;
                float f4 = r0.A00;
                f = ((0.0f - f4) * A01) + f4;
                float f5 = r0.A01;
                f2 = ((height - f5) * A01) + f5;
                i2 = A03;
                i3 = i6;
            } else {
                i3 = GOn.A03(r0.getHeight() - i5, A01) + i5;
                i2 = (i4 * i3) / i5;
                float f6 = r0.A00;
                f = ((width - f6) * A01) + f6;
                float f7 = r0.A01;
                f2 = ((r0.A04 - f7) * A01) + f7;
            }
            float f8 = f2 - r0.A04;
            6cT r02 = r0.A0B;
            81T.A00(r02, i2, i3);
            r02.setX(f);
            r02.setY(f8);
            r0.A07.mutate().setAlpha((int) (255.0f * C0ed.A00(A01, 0.0f, 1.0f)));
        }
    }
}
