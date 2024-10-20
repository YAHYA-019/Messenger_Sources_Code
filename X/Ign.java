package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* loaded from: Ign.class */
public final class Ign implements JGb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Ign(FbUserSession fbUserSession, Igi igi, int i) {
        this.A00 = i;
        this.A01 = igi;
        this.A02 = fbUserSession;
    }

    @Override // X.JGb
    public final void CFj(ImmutableList immutableList) {
        int i = this.A00;
        Igi igi = (Igi) this.A01;
        FbUserSession fbUserSession = (FbUserSession) this.A02;
        C2736Gml c2736Gml = igi.A00;
        if (i == 0) {
            C2736Gml.A0A(c2736Gml, 3);
        }
        if (!C2736Gml.A0D(c2736Gml)) {
            C2736Gml.A06(fbUserSession, c2736Gml);
        }
    }
}
