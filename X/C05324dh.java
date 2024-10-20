package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dh.class */
public final class C05324dh {
    public final 1Br A02 = 1Bq.A00(98768);
    public final 1Br A03 = 1Bq.A00(6);
    public final 1Br A00 = 1Bq.A00(16458);
    public final 1Br A01 = 1Bq.A00(16457);

    public static final boolean A00(Context context, C05324dh c05324dh, 2tJ r303, InterstitialTrigger interstitialTrigger, Object obj) {
        boolean z;
        if (r303 instanceof C7y4) {
            ((C7y4) r303).CX6(context, interstitialTrigger, obj);
            z = true;
        } else {
            z = false;
        }
        if (r303 instanceof 2vX) {
            Intent Arh = ((2vX) r303).Arh(context);
            if (Arh == null) {
                return false;
            }
            Arh.setFlags(268435456 | Arh.getFlags());
            if (!(r303 instanceof 2vR)) {
                ((C08f) ((08O) 1Br.A0B(c05324dh.A03)).A04.get()).A0A(context, Arh);
                return true;
            }
            ((2vR) r303).A0A(Arh, context);
        } else if (!z) {
            throw AnonymousClass001.A0T(AnonymousClass001.A0Z(r303, "Unknown InterstitialController: ", AnonymousClass001.A0k()));
        }
        return true;
    }

    public static final boolean A01(Context context, C05324dh c05324dh, InterstitialTrigger interstitialTrigger, Class cls, Object obj, boolean z) {
        1BV r0 = new 1BV(98767);
        if (z && ((2tK) r0.get()).A01.AZk(72339270881706378L)) {
            ((ExecutorService) 1Br.A0B(c05324dh.A01)).submit(new G5h(context, c05324dh, interstitialTrigger, cls, obj));
            return false;
        }
        C00i c00i = c05324dh.A02.A00;
        2tJ A0O = ((C2t1) c00i.get()).A0O(interstitialTrigger, cls);
        if (A0O == null) {
            return false;
        }
        ((C2t1) c00i.get()).A0S().A00(A0O.Arn());
        return A00(context, c05324dh, A0O, interstitialTrigger, obj);
    }

    public final void A02(InterfaceC04564bc interfaceC04564bc, InterstitialTrigger interstitialTrigger, WeakReference weakReference) {
        11T.A0F(weakReference, 0);
        1GU r0 = (1GU) this.A00.A00.get();
        r0.AAr("Starting the interstitial async should occur off the UI thread.");
        C2t1 c2t1 = (C2t1) this.A02.A00.get();
        FbUserSession A04 = 1Fw.A04((1EZ) c2t1.A0G.A00.get());
        C2t2 c2t2 = c2t1.A05;
        c2t2.A00();
        try {
            if (C2t1.A01(A04, c2t1, interstitialTrigger, 2tJ.class) != null) {
                r0.CY3(new D9d(interfaceC04564bc, this, interstitialTrigger, weakReference));
            }
        } finally {
            c2t2.A01();
        }
    }
}
