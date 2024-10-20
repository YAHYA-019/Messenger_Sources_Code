package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.30n, reason: invalid class name */
/* loaded from: 30n.class */
public final /* synthetic */ class C30n implements Runnable {
    public static final String __redex_internal_original_name = "ContactsLoader$$ExternalSyntheticLambda31";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 2TR A01;

    public /* synthetic */ C30n(FbUserSession fbUserSession, 2TR r303) {
        this.A01 = r303;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2TR r0 = this.A01;
        1FV A04 = 2TR.A04(this.A00, r0);
        1Kd.A0D(r0.A0H, new AC8(r0, 11), A04);
    }
}
