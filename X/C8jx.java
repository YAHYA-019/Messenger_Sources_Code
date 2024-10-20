package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.messaging.polling.datamodels.PollingDraftOption;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8jx, reason: invalid class name */
/* loaded from: 8jx.class */
public final class C8jx extends C1rj {
    public C57a A00;

    public C8jx() {
        super("PollVotingDraftOptionComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        AwZ A00;
        Class cls;
        String str;
        int i;
        C57a c57a = this.A00;
        C1u2 A0R = 7zP.A0R();
        C1rq A0Q = 7zN.A0Q(r302, 0);
        A0Q.A2b();
        C26z c26z = C26z.START;
        2RH r0 = 2RH.A04;
        4YU.A1O(A0Q, r0, c26z);
        C26z c26z2 = C26z.END;
        4YU.A1O(A0Q, 2RH.A03, c26z2);
        PollingDraftOption pollingDraftOption = c57a.A03;
        String str2 = pollingDraftOption.A05;
        boolean z = !TextUtils.isEmpty(str2.trim());
        boolean z2 = pollingDraftOption.A09;
        MigColorScheme migColorScheme = c57a.A04;
        if (z) {
            A00 = Dyc.A00(r302);
            A00.A2Y(z2);
            A00.A2X(migColorScheme);
            7zO.A1M(A00, r0, c26z2);
            cls = C8jx.class;
            str = "PollVotingDraftOptionComponent";
            i = -1850725627;
        } else {
            A00 = C2cl.A00(r302);
            7zN.A18(A00, C1u3.A53, A0R);
            A00.A2X(migColorScheme.AqM());
            A00.A0z(36.0f);
            7zO.A1M(A00, 2RH.A09, c26z);
            A00.A24(c26z2, 14.0f);
            A00.A1J(2131963453);
            cls = C8jx.class;
            str = "PollVotingDraftOptionComponent";
            i = 733243285;
        }
        7zN.A1D(A00, r302, cls, str, i);
        A00.A0S();
        A0Q.A2e(A00);
        8TP r02 = new 8TP(r302, new C8na());
        r02.A2J(str);
        r02.A2a(str2);
        r02.A2Z(r302.A0D(2131963436));
        r02.A2Y(migColorScheme);
        r02.A2X(c57a.A01);
        int i2 = c57a.A00;
        C8na c8na = r02.A01;
        c8na.A00 = i2;
        c8na.A06 = c57a.A05;
        c8na.A08 = true;
        r02.A0R();
        return 7zL.A0c(r02, A0Q);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C2ko A0E;
        int i = r302.A01;
        if (i == -1850725627) {
            1Is r0 = r302.A00.A01;
            View view = ((3xC) obj).A00;
            C57a c57a = ((C8jx) r0).A00;
            view.performHapticFeedback(1);
            c57a.A02.CUz(c57a.A00, !c57a.A03.A09);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 733243285 || (A0E = 1LI.A0E(r302.A00.A00, "PollVotingDraftOptionComponent", 1301724706)) == null) {
            return null;
        }
        7zO.A1P(A0E, new Object());
        return null;
    }
}
