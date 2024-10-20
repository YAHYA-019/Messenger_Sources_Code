package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.1xi, reason: invalid class name */
/* loaded from: 1xi.class */
public final class C1xi {
    public ListenableFuture A00;
    public final Context A01 = FbInjector.A00();
    public final 1Br A05 = 1Bq.A00(100169);
    public final 1Br A02 = 1Bq.A00(67765);
    public final 1Br A06 = 1Bq.A00(83604);
    public final 1Br A03 = 1Bq.A00(16765);
    public final 1Br A08 = 1Bu.A00(83606);
    public final 1Br A04 = 1Bq.A00(66351);
    public final 1Br A07 = 1Bq.A00(67262);

    public static final ListenableFuture A00(final Intent intent, final C1xi c1xi) {
        1QH r305;
        Context context = c1xi.A01;
        11T.A09(context);
        if (((Boolean) 1Bn.A0E(context, (1BY) null, 99943)).booleanValue() && ((1Rv) c1xi.A07.A00.get()).A0B()) {
            intent.putExtra(C1xj.A0Q, ((1Fv) c1xi.A04.A00.get()).A04().A02);
            if (c1xi.A06.A00.get() == C0et.A0P) {
                C1iq c1iq = (C1iq) c1xi.A03.A00.get();
                if (C1iq.A01(c1iq, ((C0dr) c1iq.A0A.get()).now())) {
                    r305 = ((1FP) c1xi.A02.A00.get()).D3D(3Ds.A02, 0S2.A01, new Runnable() { // from class: X.2sQ
                        public static final String __redex_internal_original_name = "ChatHeadsBroadcaster$broadcastChatHeadIntent$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1xi.A01(intent, c1xi);
                        }
                    }, "ChatHeadsInitializer initAfterUiIdle");
                    11T.A0A(r305);
                    return r305;
                }
            }
            A01(intent, c1xi);
        }
        r305 = 1hM.A01;
        11T.A0A(r305);
        return r305;
    }

    public static final void A01(Intent intent, C1xi c1xi) {
        if (!((PackageManager) c1xi.A05.A00.get()).queryBroadcastReceivers(intent, 0).isEmpty()) {
            c1xi.A01.sendOrderedBroadcast(intent, String.format("com.facebook.permission.%s.FB_APP_COMMUNICATION", ((0Zf) c1xi.A08.A00.get()).name().toLowerCase()));
        }
    }

    public static final void A02(C1xi c1xi, String str, boolean z) {
        ListenableFuture listenableFuture = c1xi.A00;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            c1xi.A00 = null;
        }
        Intent intent = new Intent(z ? C1xj.A0F : C1xj.A04);
        if (str != null) {
            intent.putExtra(C1xj.A0T, str);
        }
        ListenableFuture A00 = A00(intent, c1xi);
        if (A00.isDone()) {
            return;
        }
        c1xi.A00 = A00;
        1Kd.A0F(new C3dl(c1xi, 1), A00, 1JU.A01);
    }

    public final void A03() {
        A00(new Intent(C1xj.A03), this);
    }
}
