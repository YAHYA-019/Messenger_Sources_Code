package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C1t.class */
public final class C1t {
    public final C6V A00;

    public C1t(FbUserSession fbUserSession) {
        this.A00 = (C6V) 1Lo.A07(fbUserSession, 84451);
    }

    public D0d A00(BI7 bi7) {
        C00i A00 = this.A00.A00(bi7.setField_);
        if (A00 != null) {
            return (D0d) A00.get();
        }
        throw AnonymousClass001.A0T(0Pz.A0T("Unsupported client only delta type: ", bi7.setField_));
    }
}
