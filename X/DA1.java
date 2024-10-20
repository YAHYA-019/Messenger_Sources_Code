package X;

import android.content.Context;

/* loaded from: DA1.class */
public final class DA1 implements Runnable {
    public static final String __redex_internal_original_name = "ChatSuggestionHelper$handleMenuItemClick$1$onSuccess$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CfG A01;
    public final /* synthetic */ CHV A02;
    public final /* synthetic */ BSl A03;
    public final /* synthetic */ Boolean A04;

    public DA1(Context context, CfG cfG, CHV chv, BSl bSl, Boolean bool) {
        this.A01 = cfG;
        this.A04 = bool;
        this.A02 = chv;
        this.A03 = bSl;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.D2v();
        if (7zR.A1X(this.A04)) {
            this.A02.A01();
            return;
        }
        DR6 A02 = 7zQ.A0l().A02(this.A00);
        A02.A00(2131954134);
        A02.A06(2131954132);
        A02.A0D(CRc.A00, 2131954133);
        A02.A05();
    }
}
