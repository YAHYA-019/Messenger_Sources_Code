package X;

import android.content.Context;

/* renamed from: X.30y, reason: invalid class name */
/* loaded from: 30y.class */
public final class C30y implements C15h {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C30y(Context context, 2OZ r303, int i) {
        this.A00 = i;
        this.A01 = r303;
        this.A02 = context;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        switch (this.A00) {
            case 0:
                i = 50093;
                break;
            case 1:
                i = 83438;
                break;
            default:
                i = 68548;
                break;
        }
        return 1Bn.A0E((Context) this.A02, (1BY) null, i);
    }
}
