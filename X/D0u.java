package X;

import com.facebook.user.model.UserKey;

/* loaded from: D0u.class */
public final class D0u implements DHs {
    public final /* synthetic */ Cux A00;

    public D0u(Cux cux) {
        this.A00 = cux;
    }

    @Override // X.DHs
    public void CQU(boolean z) {
        Cux.A00(this.A00, "thread_updated_for_ui", z);
    }

    @Override // X.DHs
    public void CTT(UserKey userKey) {
        Cux.A00(this.A00, "user_updated_for_ui", false);
    }
}
