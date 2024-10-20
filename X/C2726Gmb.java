package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.Gmb, reason: case insensitive filesystem */
/* loaded from: Gmb.class */
public final class C2726Gmb extends HnN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ RFI A02;
    public final /* synthetic */ Hlw A03;
    public final /* synthetic */ Hzd A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2726Gmb(Context context, FbUserSession fbUserSession, RFI rfi, Hlw hlw, Hzd hzd, String str, String str2) {
        super(context, hzd);
        this.A04 = hzd;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A06 = str;
        this.A02 = rfi;
        this.A05 = str2;
        this.A03 = hlw;
    }

    public void A00() {
        Hzd hzd = this.A04;
        FbUserSession fbUserSession = this.A01;
        if (!((2QO) 4YU.A0n(fbUserSession, hzd.A01, 99977)).BQf()) {
            Hzd.A00(this.A00, fbUserSession, this.A02, hzd, this.A06);
        } else {
            1Br.A0C(hzd.A05);
            ((I1y) 1Br.A0B(hzd.A03)).A01(fbUserSession, this.A05, this.A06, this.A02.A00);
            Hlw hlw = this.A03;
            if (hlw != null) {
                hlw.A00();
            }
        }
    }
}
