package X;

import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function1;

/* loaded from: D9g.class */
public final class D9g implements Runnable {
    public static final String __redex_internal_original_name = "BuyerViewCatalogEntrypointVisibilityFetcher$fetchEntrypointVisibility$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 7Qy A01;
    public final /* synthetic */ Function1 A02;
    public final /* synthetic */ 0CL A03;

    public D9g(FbUserSession fbUserSession, 7Qy r303, Function1 function1, 0CL r305) {
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A03 = r305;
        this.A02 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        7Qy r0 = this.A01;
        AbI.A0o(r0.A03).A04(new C1606Amn(this.A02, 5), AeR.A00(7zT.A09(r0.A01), (C3s4) this.A03.element), 4YT.A00(903));
    }
}
