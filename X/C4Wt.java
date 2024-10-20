package X;

import com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent;

/* renamed from: X.4Wt, reason: invalid class name */
/* loaded from: 4Wt.class */
public final /* synthetic */ class C4Wt implements Runnable {
    public static final String __redex_internal_original_name = "MontageOmnistoreComponent$$ExternalSyntheticLambda0";
    public final /* synthetic */ MontageOmnistoreComponent A00;

    @Override // java.lang.Runnable
    public final void run() {
        MontageOmnistoreComponent montageOmnistoreComponent = this.A00;
        C00j.A05("MontageOmnistoreComponent:tryToGetMontageCollection", 1885544347);
        try {
            2ZF r0 = (2ZF) C3o5.A0N(montageOmnistoreComponent.A02, 17038);
            if (MontageOmnistoreComponent.A00(montageOmnistoreComponent)) {
                r0.A01();
                ((C01273qk) montageOmnistoreComponent.A09.get()).A00(montageOmnistoreComponent, AnonymousClass001.A0k());
            }
            montageOmnistoreComponent.A0B.set(false);
            C00j.A01(-1940879919);
        } catch (Throwable th) {
            C00j.A01(-1644730290);
            throw th;
        }
    }
}
