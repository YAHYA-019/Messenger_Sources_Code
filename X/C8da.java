package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;
import java.util.List;

/* renamed from: X.8da, reason: invalid class name */
/* loaded from: 8da.class */
public final class C8da extends 1LH {
    public final MigColorScheme A00;
    public final RichStatus A01;
    public final AaB A02;
    public final User A03;
    public final String A04;
    public final FbUserSession A05;
    public final List A06;
    public final boolean A07;

    public C8da(FbUserSession fbUserSession, MigColorScheme migColorScheme, RichStatus richStatus, AaB aaB, User user, String str, List list, boolean z) {
        1BL.A1F(fbUserSession, migColorScheme);
        1BK.A1L(list, 5, aaB);
        this.A05 = fbUserSession;
        this.A00 = migColorScheme;
        this.A03 = user;
        this.A01 = richStatus;
        this.A06 = list;
        this.A04 = str;
        this.A07 = z;
        this.A02 = aaB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0084, code lost:
    
        if (r0.A08 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8da.A0s(X.2k5):X.1LI");
    }
}
