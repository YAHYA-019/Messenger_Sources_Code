package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;

/* renamed from: X.Jm1, reason: case insensitive filesystem */
/* loaded from: Jm1.class */
public final class C3196Jm1 extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$9";
    public final /* synthetic */ AuthenticationResult A00;
    public final /* synthetic */ Ezc A01;
    public final /* synthetic */ EnC A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3196Jm1(AuthenticationResult authenticationResult, Ezc ezc, EnC enC, Class cls) {
        super(cls, "LoginLogoutListener", "onLoginComplete");
        this.A01 = ezc;
        this.A00 = authenticationResult;
        this.A02 = enC;
    }

    public void A02() {
        C1vv c1vv = (C1vv) this.A01.A0W.get();
        0fH.A0j("LoginLogoutListener", "onLoginComplete");
        C1vi c1vi = c1vv.A00;
        if (c1vi != null) {
            1BK.A1E(c1vi.A00.A05).execute(new AnonymousClass357(c1vi, true));
        }
    }
}
