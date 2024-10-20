package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.rtc.links.join.ui.JoinVideoChatData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: I8o.class */
public final class I8o {
    public final Context A00;
    public final 1Br A05;
    public final 1Br A08;
    public final JoinVideoChatData A09;
    public final JIj A0A;
    public final 1Br A03 = 1Bq.A00(16687);
    public final 1Br A04 = 1BK.A0C();
    public final 1Br A01 = 1Bq.A00(16462);
    public final 1Br A07 = GOn.A0P();
    public final 1Br A06 = 1Bu.A00(115685);
    public final 1Br A02 = 1Bq.A00(115033);

    public I8o(Context context, JoinVideoChatData joinVideoChatData, JIj jIj) {
        this.A00 = context;
        this.A0A = jIj;
        this.A09 = joinVideoChatData;
        this.A08 = 1Bu.A01(context, 114819);
        this.A05 = 1Bu.A01(context, 114952);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0062, code lost:
    
        if (r0.A01 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.common.util.concurrent.SettableFuture A00(com.facebook.auth.usersession.FbUserSession r301, X.I8o r302) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I8o.A00(com.facebook.auth.usersession.FbUserSession, X.I8o):com.google.common.util.concurrent.SettableFuture");
    }

    public static final void A01(FbUserSession fbUserSession, I8o i8o, Throwable th, int i, int i2) {
        if (i < 3) {
            int max = Math.max(2000, i2);
            0fH.A0g(Integer.valueOf(max), "WakeupInfraDelegate", "Retry after interval(ms): %d");
            GOp.A1H(i8o.A07).schedule(new J22(fbUserSession, i8o, i, max), max, TimeUnit.MILLISECONDS);
            return;
        }
        IFc iFc = (IFc) 1Lm.A05(i8o.A00, fbUserSession, 67965);
        String str = null;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s, exception [%s], network connected [%s]", "unable_to_start_room_infra", th != null ? th.getMessage() : null, Boolean.valueOf(((FbNetworkManager) 1Br.A0B(i8o.A03)).A0M()));
        JoinVideoChatData joinVideoChatData = i8o.A09;
        iFc.A0O("link_resolve_failure", formatStrLocaleSafe, joinVideoChatData.A08, i8o.A02());
        i8o.A0A.BOA("load_link_progress_fragment", 0S2.A0C);
        JQN BGd = I7M.A00(i8o.A06).BGd(joinVideoChatData.A06);
        BGd.Bcv("wakeup_infra", 0Pz.A0T("retryCount:", i));
        if (th != null) {
            str = th.getMessage();
        }
        BGd.ARr(str);
    }

    public final String A02() {
        Integer num = this.A09.A05;
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        return intValue == 1 ? "messenger_dot_com" : intValue == 2 ? "m_dot_me" : intValue == 4 ? "facebook_dot_com" : intValue == 3 ? "msngr_dot_com" : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(FbUserSession fbUserSession, int i, int i2) {
        if (1Br.A07(this.A04).AZk(36315236977877597L)) {
            1FV A00 = ((Hnl) 1Br.A0B(this.A08)).A00(fbUserSession);
            1FV A002 = A00(fbUserSession, this);
            1Kd.A05(new ListenableFuture[]{A00, A002}).A00(new J3Q(fbUserSession, this, A00, A002, i, i2), 4YV.A11(this.A01));
        } else {
            JQN BGd = I7M.A00(this.A06).BGd(this.A09.A06);
            BGd.Bcw("wakeup_infra", (String) null);
            1Br.A0C(this.A02);
            1Br.A0D(this.A07, new InQ(fbUserSession, this, BGd, i, i2), ((Hnl) 1Br.A0B(this.A08)).A00(fbUserSession));
        }
    }
}
