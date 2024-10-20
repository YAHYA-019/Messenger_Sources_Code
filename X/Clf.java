package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Clf.class */
public final class Clf implements DFD {
    public final /* synthetic */ CFj A00;

    public Clf(CFj cFj) {
        this.A00 = cFj;
    }

    public void C4W(ImmutableList immutableList, ImmutableList immutableList2) {
        CFj cFj = this.A00;
        CGe cGe = cFj.A06;
        FbUserSession fbUserSession = cFj.A03;
        DFE dfe = cFj.A01;
        MigColorScheme migColorScheme = cFj.A0A;
        CFj.A00(cFj, (ImmutableList) null, cGe.A01(fbUserSession, dfe, migColorScheme, immutableList), immutableList2 != null ? cGe.A01(fbUserSession, cFj.A01, migColorScheme, immutableList2) : null);
    }
}
