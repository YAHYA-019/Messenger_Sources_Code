package X;

import com.facebook.rsys.state.gen.State;

/* loaded from: A2z.class */
public final class A2z implements Ab9, AXA {
    public final int A00;
    public final Object A01;

    public A2z(C0Bd c0Bd, int i) {
        this.A00 = i;
        this.A01 = c0Bd;
    }

    @Override // X.Ab9
    public final void BQ7(8LW r302, Object obj, Object obj2) {
        int i = this.A00;
        11T.A0F(r302, 0);
        C0Bd c0Bd = (C0Bd) this.A01;
        switch (i) {
            case 1:
                if (!(obj instanceof 9DA)) {
                    obj = null;
                }
                if (!(obj2 instanceof 9DA)) {
                    obj2 = null;
                    break;
                }
                break;
            case 3:
                if (!(obj instanceof State)) {
                    obj = null;
                }
                if (!(obj2 instanceof State)) {
                    obj2 = null;
                    break;
                }
                break;
            default:
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                if (!(obj2 instanceof Integer)) {
                    obj2 = null;
                    break;
                }
                break;
        }
        c0Bd.invoke(r302, obj, obj2);
    }
}
