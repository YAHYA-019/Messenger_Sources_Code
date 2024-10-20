package X;

import com.facebook.push.init.PushInitializer;

/* renamed from: X.AjV, reason: case insensitive filesystem */
/* loaded from: AjV.class */
public final class C1508AjV extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$38";
    public final /* synthetic */ Ezc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508AjV(Ezc ezc, Class cls) {
        super(cls, "AfterLogin", "PushInitializer", "onAfterLogin");
        this.A00 = ezc;
    }

    public void A02() {
        PushInitializer pushInitializer = (PushInitializer) this.A00.A0q.get();
        if (pushInitializer.A01 == C0et.A0U) {
            C00j.A05("PushInitializer.onAfterLogin", 1559437990);
            try {
                0fH.A0A(PushInitializer.class, "onLogin");
                pushInitializer.A03("PushInitializer.onLogin");
                PushInitializer.A00(pushInitializer);
                C00j.A01(2121270015);
            } catch (Throwable th) {
                C00j.A01(-1981702409);
                throw th;
            }
        }
    }
}
