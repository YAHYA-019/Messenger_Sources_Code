package X;

import android.view.View;

/* renamed from: X.2jt, reason: invalid class name */
/* loaded from: 2jt.class */
public final class C2jt implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        29K r0 = c29k.A03;
        if (r0 == null || (r0.A0F & 524288) == 0) {
            return 1.0f;
        }
        return r0.A04;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        11T.A0F(obj, 0);
        View A02 = C2jm.A02(this, obj);
        float scaleX = A02.getScaleX();
        if (scaleX == A02.getScaleY()) {
            return scaleX;
        }
        throw AnonymousClass001.A0T("Tried to get scale of view, but scaleX and scaleY are different");
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        11T.A0F(obj, 0);
        View A02 = C2jm.A02(this, obj);
        A02.setScaleX(1.0f);
        A02.setScaleY(1.0f);
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        11T.A0F(obj, 0);
        View A02 = C2jm.A02(this, obj);
        A02.setScaleX(f);
        A02.setScaleY(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "scale";
    }
}
