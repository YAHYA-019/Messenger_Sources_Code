package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: C64.class */
public final class C64 {
    public Context A00;
    public JZj A01;
    public ThreadKey A02;
    public C6t2 A03;
    public BIl A04;
    public String A05;
    public String A06;
    public final 1Br A07 = 1Bq.A00(33154);
    public final 1Br A08 = 1Bq.A00(98546);

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public final void A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, C6t2 c6t2) {
        ?? A1W = 1BL.A1W(fbUserSession, context);
        this.A00 = context;
        this.A02 = threadSummary.A0n;
        MigColorScheme A0c = 7zR.A0c(context);
        BIl bIl = new BIl(context, fbUserSession, threadSummary, new BgH(this), A0c);
        if (bIl.A06.getCount() >= A1W) {
            this.A06 = "inbox_cta";
            this.A05 = "inbox_cta_video";
            this.A03 = c6t2;
            this.A04 = bIl;
            1Bn.A0A(67527);
            DR6 A01 = C5ic.A01(context, A0c);
            A01.A0I(bIl);
            CQx.A00(A01, this, 5);
            JZj A04 = A01.A04();
            this.A01 = A04;
            A04.show();
        }
    }
}
