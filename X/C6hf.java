package X;

import com.facebook.user.model.User;

/* renamed from: X.6hf, reason: invalid class name */
/* loaded from: 6hf.class */
public final class C6hf implements C6hg {
    public static final C6hf A00 = new C6hf();

    @Override // X.C6hg
    public final void CHU(C6hk c6hk) {
        if (c6hk != null) {
            1Du it = c6hk.A00.A03.iterator();
            while (it.hasNext()) {
                if (((User) it.next()).A02() != C1z1.NOT_BLOCKED) {
                    6oD.A00((6oD) 1Bi.A03(82525), true);
                    return;
                }
            }
        }
    }
}
