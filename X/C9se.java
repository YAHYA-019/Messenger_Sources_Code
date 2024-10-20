package X;

import com.facebook.litho.BaseMountingView;

/* renamed from: X.9se, reason: invalid class name */
/* loaded from: 9se.class */
public final class C9se implements InterfaceC00723of {
    public final /* synthetic */ 8Gq A00;

    public C9se(8Gq r302) {
        this.A00 = r302;
    }

    @Override // X.InterfaceC00723of
    public final void Btn(BaseMountingView baseMountingView) {
        8Gq r0 = this.A00;
        int i = r0.A00;
        if (i == 0) {
            i = baseMountingView.getHeight();
            r0.A00 = i;
        }
        8Gq.A03(new 8Kr(r0.A01.A03, 4YV.A1W(i, baseMountingView.getHeight())), r0);
    }
}
