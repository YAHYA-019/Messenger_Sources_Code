package X;

import android.content.Context;

/* loaded from: AHg.class */
public final class AHg implements C15h {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AHg(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        switch (this.A00) {
            case 0:
                i = 68167;
                break;
            case 1:
                i = 32912;
                break;
            case 2:
                i = 50148;
                break;
            default:
                i = 66682;
                break;
        }
        return 1Hv.A02((Context) this.A02, i);
    }
}
