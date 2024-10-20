package X;

import android.content.Context;
import android.net.Uri;

/* loaded from: G3r.class */
public final class G3r implements Runnable {
    public static final String __redex_internal_original_name = "SilentSwitchAccountPostAction$maybeShowToastForAccountSwitched$1$onSuccess$1$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public G3r(Context context, String str, String str2) {
        this.A00 = context;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.GKV, X.Dg4, X.Dfl] */
    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        boolean z = 2jF.A00;
        String A13 = AbK.A13(context, str, 2131967371);
        1Iw A0W = 7zL.A0W(context);
        C2148Dfc c2148Dfc = new C2148Dfc(A0W);
        c2148Dfc.A0g(A13);
        ?? abstractC2157Dfl = new AbstractC2157Dfl(A0W);
        ENi eNi = ENi.A01;
        abstractC2157Dfl.A01 = eNi;
        abstractC2157Dfl.A00 = Uri.EMPTY;
        abstractC2157Dfl.A00 = C0A2.A03(str2);
        abstractC2157Dfl.A01 = eNi;
        c2148Dfc.A00 = new FEG((GKV) abstractC2157Dfl);
        FFJ ffj = new FFJ(A0W);
        ffj.A00 = c2148Dfc;
        FFJ.A01(ffj, "SilentSwitchAccountPostAction");
    }
}
