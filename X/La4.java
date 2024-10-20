package X;

import android.content.Context;

/* loaded from: La4.class */
public final class La4 implements MFq {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public La4(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.MFq
    public final void C3Z(RYu rYu) {
        if (this.A00 == 0) {
            ((AbstractC3052Jhk) this.A02).A00.onClick(((Q3H) this.A01).A00);
            return;
        }
        String str = rYu.A03;
        if (str != null) {
            Context context = (Context) this.A02;
            boolean z = rYu.A00;
            ETd A0G = C06014fk.A0G();
            if (z) {
                A0G.A00(context, str);
            } else {
                A0G.A01(context, str);
            }
        }
    }
}
