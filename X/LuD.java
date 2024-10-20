package X;

import android.content.Context;

/* loaded from: LuD.class */
public final class LuD implements C15h {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LuD(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        switch (this.A00) {
            case 0:
                i = 66714;
                break;
            case 1:
                i = 68747;
                break;
            default:
                i = 83534;
                break;
        }
        return 1Hv.A02((Context) this.A02, i);
    }
}
