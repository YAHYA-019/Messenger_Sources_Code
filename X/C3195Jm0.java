package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;

/* renamed from: X.Jm0, reason: case insensitive filesystem */
/* loaded from: Jm0.class */
public final class C3195Jm0 extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$32";
    public final /* synthetic */ AuthenticationResult A00;
    public final /* synthetic */ Ezc A01;
    public final /* synthetic */ EnC A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3195Jm0(AuthenticationResult authenticationResult, Ezc ezc, EnC enC, Class cls) {
        super(cls, "FbQPLAuthListener", "onUserAuthenticated");
        this.A01 = ezc;
        this.A00 = authenticationResult;
        this.A02 = enC;
    }

    public void A02() {
        ((C3m6) ((Kj7) this.A01.A0M.get()).A02.get()).Adl().CTB();
    }
}
