package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.store.converter.MontageFBConverter;

/* renamed from: X.4Uw, reason: invalid class name */
/* loaded from: 4Uw.class */
public final class C4Uw {
    public final CNI A00;
    public final CbD A01;
    public final 6uX A02;
    public final MontageFBConverter A03;
    public final String A04 = C4Uw.class.getName();

    public C4Uw(FbUserSession fbUserSession) {
        this.A03 = (MontageFBConverter) 1Lo.A07(fbUserSession, 85185);
        this.A00 = (CNI) 1Lo.A07(fbUserSession, 85180);
        this.A01 = (CbD) 1Lo.A07(fbUserSession, 85184);
        this.A02 = (6uX) 1Lo.A07(fbUserSession, 85200);
    }

    public static final C4Uw A00(Object obj) {
        return new C4Uw((FbUserSession) obj);
    }
}
