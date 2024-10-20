package X;

import java.lang.reflect.InvocationTargetException;

/* loaded from: Erc.class */
public final class Erc {
    public final 1Ve A00;

    public Erc(1Ve r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public void A00(GHb gHb) {
        try {
            C3s4 ACe = ((GEs) DKE.A0p(F0d.class, "create", 0)).ACe();
            11T.A0A(ACe);
            FfP.A00(new FfR(gHb, 0), this.A00, ACe, gHb, 1);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(F0d.class);
        }
    }
}
