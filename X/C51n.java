package X;

import java.util.List;

/* renamed from: X.51n, reason: invalid class name */
/* loaded from: 51n.class */
public final class C51n implements C51o {
    public final /* synthetic */ 2uH A00;

    public C51n(2uH r302) {
        this.A00 = r302;
    }

    @Override // X.C51o
    public void Bpv(C4Ez c4Ez) {
        String A00;
        if (c4Ez.A0E()) {
            Object A05 = c4Ez.A05();
            A05.getClass();
            A00 = String.format("%d states", Integer.valueOf(((List) A05).size()));
        } else {
            A00 = 2uH.A00(c4Ez);
        }
        2uH.A02(this.A00, "getSessionStates completed: %s ", new Object[]{A00});
    }
}
