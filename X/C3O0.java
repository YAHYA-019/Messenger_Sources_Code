package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3O0, reason: invalid class name */
/* loaded from: 3O0.class */
public final class C3O0 {
    public boolean A00;
    public final C1zc A01;
    public final 1De A02;

    public C3O0(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A01 = (C1zc) 1Lo.A04((Context) null, fbUserSession, r303.A00, 66073);
        this.A00 = true;
    }

    public boolean A00() {
        if (!1BK.A0N(((C50f) 1De.A00(this.A02, 49447)).A00).AZk(36314755943178410L)) {
            return this.A00;
        }
        Boolean bool = (Boolean) this.A01.A01("payments_dcp_sync_required").orNull();
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
