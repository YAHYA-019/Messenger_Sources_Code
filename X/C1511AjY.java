package X;

import com.facebook.push.init.PushInitializer;

/* renamed from: X.AjY, reason: case insensitive filesystem */
/* loaded from: AjY.class */
public final class C1511AjY extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$109";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511AjY(Ezc ezc, Class cls, boolean z) {
        super(cls, "UnregisterPushToken", "PushInitializer", "unregisterPushToken");
        this.A00 = ezc;
        this.A01 = z;
    }

    public void A02() {
        PushInitializer pushInitializer = (PushInitializer) this.A00.A0q.get();
        String A00 = 1BJ.A00(27);
        boolean z = this.A01;
        0fH.A0A(PushInitializer.class, "unregisterPushToken");
        C00j.A05("PushInitializer.unregisterPushToken", -1009668307);
        try {
            for (C49j c49j : pushInitializer.A04) {
                C00j.A05(AnonymousClass001.A0Y(c49j), -778441243);
                try {
                    c49j.D67(A00, z);
                    C00j.A01(-1762145086);
                } finally {
                }
            }
            C00j.A01(-1708161397);
        } catch (Throwable th) {
            C00j.A01(-376232048);
            throw th;
        }
    }
}
