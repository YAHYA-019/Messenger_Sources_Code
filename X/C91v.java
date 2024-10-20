package X;

import com.facebook.base.activity.FbFragmentActivity;

/* renamed from: X.91v, reason: invalid class name */
/* loaded from: 91v.class */
public final class C91v extends C5ij {
    public final int A00;
    public final Object A01;

    public C91v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5ij, X.C1ph
    public void Bth(2Ov r302) {
        if (1 - this.A00 != 0) {
            11T.A0F(r302, 0);
        }
        ((FbFragmentActivity) this.A01).finish();
    }
}
