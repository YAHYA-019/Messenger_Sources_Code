package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8um, reason: invalid class name */
/* loaded from: 8um.class */
public final class C8um extends Gqk {
    public C00m A00;
    public boolean A01;
    public int[] A02;
    public final Context A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Function1 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8um(Context context, FbUserSession fbUserSession, String str) {
        super(str);
        7zR.A1O(fbUserSession, context);
        this.A03 = context;
        this.A04 = 1Bq.A00(99793);
        this.A05 = 1Bq.A00(67196);
        this.A06 = 83U.A01(fbUserSession, this, 16);
        this.A02 = I6p.A00();
    }

    public void A0b() {
        C00m c00m = this.A00;
        if (c00m != null) {
            c00m.invoke();
        }
        this.A00 = null;
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        this.A00 = C9lt.A00(super.A00).A00(new A30(this.A06, 0), ATA.A00, true);
    }

    @Override // X.Gqk
    public String A0d() {
        return "GradientCallBackgroundPresenter";
    }
}
