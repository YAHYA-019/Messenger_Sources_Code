package X;

import android.content.Context;

/* renamed from: X.7fm, reason: invalid class name */
/* loaded from: 7fm.class */
public final class C7fm extends C1rj {
    public 5zD A00;
    public String A01;

    public C7fm() {
        super("AudioFileSizeComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A01;
        5zD r0 = this.A00;
        11T.A0G(r302, 0, r0);
        2KD A01 = 2K3.A01(r302, 0);
        A01.A2z(str);
        A01.A2i();
        A01.A2x(r0.Axg());
        A01.A2c();
        A01.A0a();
        Context context = r302.A0D;
        11T.A0A(context);
        A01.A1L(C0A8.A02(context, 16.0f));
        return A01.A2W();
    }
}
