package X;

import android.content.Context;
import android.content.IntentFilter;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.viewercontext.ViewerContext;
import org.apache.http.client.ResponseHandler;

/* loaded from: L88.class */
public final class L88 {
    public static final ResponseHandler A05 = new Lwd();
    public static volatile boolean A06;
    public 1BY A00;
    public final String A04;
    public final Kiz A02 = (Kiz) 1Bi.A03(116221);
    public final Keu A03 = (Keu) 1Bi.A03(131142);
    public final C2tx A01 = (C2tx) 1Bi.A03(17131);

    public L88(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        ViewerContext viewerContext = (ViewerContext) 1Bn.A0B(83431);
        1Bi.A03(83603);
        this.A04 = viewerContext != null ? viewerContext.mAuthToken : 0Pz.A0j("256002347743983", "|", AnonymousClass000.A00(ActionId.APP_WILL_ENTER_FOREGROUND));
    }

    public void A01() {
        if (A06) {
            return;
        }
        1CO A0e = AbJ.A0e();
        Context context = (Context) 1Bn.A0E((Context) null, this.A00, 83719);
        int A00 = C1Ur.A00(A0e, -1, 36593172902708311L);
        if (A00 > 0) {
            synchronized (LBx.class) {
                int i = LBx.A01;
                synchronized (LBx.class) {
                    if (LBx.A03 == null) {
                        LBx.A03 = new LTR(i, A00);
                    } else {
                        android.util.Log.w("GrandCentralDispatch", "GrandCentralDispatch already inited, reinitilazation skipped");
                    }
                }
            }
        }
        AnonymousClass420 anonymousClass420 = new AnonymousClass420(A0e.BCy(36875618541830666L), A0e.BCy(36875618541961739L), null, null, null, (-1) >>> 1);
        KaI.A00 = new LTV(context);
        Kiz kiz = this.A02;
        synchronized (LBH.class) {
            if (LBH.A07 != kiz) {
                LBH.A07 = kiz;
            }
        }
        String str = this.A04;
        C41z.A03 = this.A03;
        C41z.A0E = str;
        C41z.A02 = context.getApplicationContext();
        C41z.A00 = 0L;
        C41z.A08 = true;
        C41z.A0D = anonymousClass420;
        if (C41z.A01 == null) {
            JUk jUk = new JUk();
            C41z.A01 = jUk;
            AnonymousClass023.A00(jUk, C41z.A02, new IntentFilter(1BJ.A00(77)));
        }
        KoN.A01 = new DV8(this);
        A06 = true;
    }
}
