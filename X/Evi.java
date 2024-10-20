package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;

/* loaded from: Evi.class */
public final class Evi {
    public ExV A00;
    public 1BY A01;
    public volatile DRp A0J;
    public final Handler A02 = AnonymousClass001.A07();
    public final C00i A0F = AbH.A0E();
    public final C00i A0A = 1BV.A01((1BY) null, 100308);
    public final C00i A0D = 1BQ.A02(100321);
    public final C00i A0B = 1BV.A01((1BY) null, 100320);
    public final C00i A03 = 1BQ.A02(45);
    public final C00i A0H = 1BV.A01((1BY) null, 83606);
    public final C00i A04 = 1BQ.A02(66191);
    public final C00i A0C = 1BQ.A02(100306);
    public final C00i A08 = 1BQ.A02(100305);
    public final C00i A07 = 1BQ.A02(114693);
    public final C00i A09 = 1BV.A01((1BY) null, 318);
    public final C00i A0E = 1BQ.A02(100325);
    public final C00i A06 = 1BQ.A02(100324);
    public final C00i A05 = 1BV.A01((1BY) null, 100319);
    public final C00i A0G = 1BQ.A00();
    public final C00i A0I = AbI.A0J(AbI.A03((1BY) null));

    public Evi(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A00(Context context) {
        Dialog dialog;
        if ((context instanceof C1em) && C0D1.A01(((C1em) context).BDe()) && this.A0J != null && (dialog = ((0D2) this.A0J).A01) != null && dialog.isShowing()) {
            this.A0J.A0o();
        }
        this.A0J = null;
    }
}
