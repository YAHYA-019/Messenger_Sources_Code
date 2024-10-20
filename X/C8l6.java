package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import java.util.List;

/* renamed from: X.8l6, reason: invalid class name */
/* loaded from: 8l6.class */
public final class C8l6 extends C1rj {
    public View.OnClickListener A00;
    public FbUserSession A01;
    public 1LI A02;
    public 9Nh A03;
    public C9K4 A04;
    public 2Of A05;
    public C5nC A06;
    public C5fv A07;
    public 5eF A08;
    public C5eR A09;
    public 5eX A0A;

    public C8l6() {
        super("ReplySwipeComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A00, this.A06, this.A01, this.A07, this.A0A, this.A03, this.A02, this.A04, this.A09, this.A08};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8l6 c8l6 = (C8l6) super.A0l();
        c8l6.A02 = 4YV.A0J(c8l6.A02);
        return c8l6;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A02;
        C5fv c5fv = this.A07;
        C5eR c5eR = this.A09;
        5eF r02 = this.A08;
        5eX r03 = this.A0A;
        C5nC c5nC = this.A06;
        String A0C = r302.A0C();
        9bT r04 = new 9bT(this.A04, this.A08, A0C);
        8CE r314 = (8CE) r302.A0B(r04, A0C, 0);
        if (r314 == null) {
            C9K4 c9k4 = this.A04;
            5eF r05 = this.A08;
            11T.A0F(c9k4, 1);
            r314 = r05 == null ? null : new 8CE(7zL.A0A(r302), c9k4.A00, r05);
            r302.A0I(r04, r314, A0C, 0);
        }
        1BL.A1H(r0, c5fv, c5eR);
        11T.A0F(c5nC, 6);
        8CE r309 = null;
        2cM A0L = 7zN.A0L(r0, r302);
        7zN.A1D(A0L, r302, C8l6.class, "ReplySwipeComponent", -463795336);
        A0L.A2O(c5nC.BRy(c5fv));
        2cL r06 = A0L.A00;
        8CE r312 = null;
        if (r02 == 5eF.A02) {
            r312 = r314;
        }
        if (r02 == 5eF.A03) {
            r309 = r314;
        }
        1Im A09 = 1LI.A09(r302, C8l6.class, "ReplySwipeComponent", 1508933417);
        List A12 = C0s8.A12(r02);
        11T.A0D(A09);
        return new C8ip(r06, A09, r312, r309, c5eR, r03, A12);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == -463795336) {
            1Is r0 = r302.A00.A01;
            View view = ((3xC) obj).A00;
            View.OnClickListener onClickListener = ((C8l6) r0).A00;
            11T.A0F(view, 2);
            if (onClickListener == null) {
                return null;
            }
            onClickListener.onClick(view);
            return null;
        }
        if (i != 1508933417) {
            return null;
        }
        1Is r02 = r302.A00.A01;
        5eF r03 = ((RHd) obj).A00;
        C8l6 c8l6 = (C8l6) r02;
        FbUserSession fbUserSession = c8l6.A01;
        2Of r04 = c8l6.A05;
        C5fv c5fv = c8l6.A07;
        5eF r05 = c8l6.A08;
        9Nh r06 = c8l6.A03;
        1BL.A1H(fbUserSession, r04, c5fv);
        11T.A0F(r03, 6);
        if (r05 != r03) {
            return null;
        }
        r04.AQN(new C7Ag(c5fv));
        if (C5v6.A02(c5fv)) {
            C87v.A00(r04, null);
        }
        if (r06 == null) {
            return null;
        }
        6Q7 r07 = (6Q7) 1Bu.A06(r06.A00, 67958);
        ThreadKey threadKey = r06.A01;
        82T AxW = c5fv.AxW(C5le.A00);
        boolean z = AxW == null ? false : AxW.A01;
        BotResponseMetadata botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00);
        6Q7.A01(fbUserSession, r07, threadKey, "message_swipe_event", botResponseMetadata != null ? botResponseMetadata.A0A : null, z, false);
        return null;
    }
}
