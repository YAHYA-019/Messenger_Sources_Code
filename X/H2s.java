package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cowatch.player.plugins.CoWatchLiveStatusView;

/* loaded from: H2s.class */
public final class H2s extends C6d6 {
    public String A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final FbUserSession A05;
    public final CoWatchLiveStatusView A06;
    public final JIf A07;
    public final 2Qn A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H2s(Context context, FbUserSession fbUserSession) {
        super(context, null, 0);
        1BL.A1F(context, fbUserSession);
        this.A05 = fbUserSession;
        this.A03 = 1Bu.A01(context, 114922);
        this.A04 = GOn.A0V(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 99500);
        this.A08 = IYv.A00(this, 3);
        this.A07 = new Gpp(this, 0);
        A0C(2132541794);
        this.A06 = C09s.A01(this, 2131363435);
    }

    public static final void A00(H2s h2s) {
        CoWatchLiveStatusView coWatchLiveStatusView;
        int i;
        if (GOp.A0U(h2s.A02).A02 || GOq.A1S(h2s.A04) || !h2s.A01) {
            coWatchLiveStatusView = h2s.A06;
            i = 8;
        } else {
            coWatchLiveStatusView = h2s.A06;
            i = 0;
        }
        coWatchLiveStatusView.setVisibility(i);
    }

    @Override // X.C6d6
    public String A0H() {
        return "CoWatchLiveStatusPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        if (this.A00 != null && this.A01) {
            ((IF4) 1Br.A0B(this.A03)).A06();
        }
        GOp.A0e(this.A04).A03(this.A08);
        GOp.A0U(this.A02).A04(this.A07);
        this.A00 = null;
        this.A01 = false;
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        GOp.A0e(this.A04).A02(this.A08);
        GOp.A0U(this.A02).A03(this.A07);
        this.A01 = r302.A04();
        A00(this);
        String str = r302.A03.A0k;
        this.A00 = str;
        if (str == null || !this.A01) {
            return;
        }
        IF4 if4 = (IF4) 1Br.A0B(this.A03);
        FbUserSession fbUserSession = this.A05;
        String str2 = this.A00;
        11T.A0F(fbUserSession, 0);
        if4.A0E = "unknown";
        IF4.A02(fbUserSession, if4, str2);
    }
}
