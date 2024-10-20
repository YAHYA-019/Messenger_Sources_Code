package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rtc.interfaces.RtcCallStartParams;
import com.facebook.rtc.launch.CallStartOutcome;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Hsq.class */
public final class Hsq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ JOJ A02;
    public final /* synthetic */ IEA A03;
    public final /* synthetic */ C5V0 A04;
    public final /* synthetic */ RtcCallStartParams A05;
    public final /* synthetic */ JQN A06;
    public final /* synthetic */ SettableFuture A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public Hsq(Context context, FbUserSession fbUserSession, JOJ joj, IEA iea, C5V0 c5v0, RtcCallStartParams rtcCallStartParams, JQN jqn, SettableFuture settableFuture, String str, boolean z) {
        this.A02 = joj;
        this.A09 = z;
        this.A07 = settableFuture;
        this.A04 = c5v0;
        this.A05 = rtcCallStartParams;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A08 = str;
        this.A03 = iea;
        this.A06 = jqn;
    }

    public void A00() {
        this.A02.BZf(this.A09);
        I3Z i3z = (I3Z) 1Br.A0B(this.A04.A0B);
        RtcCallStartParams rtcCallStartParams = this.A05;
        String str = rtcCallStartParams.A0E;
        String str2 = this.A08;
        String str3 = rtcCallStartParams.A0H;
        11T.A0A(str3);
        i3z.A01(str, str2, "P2P", str3, "UserAborted", rtcCallStartParams.A0M);
        IEA.A04(this.A03, 16252929, (short) 4);
        this.A06.ARr("UserAborted");
        this.A07.setFuture(new 1hM(new CallStartOutcome(H9h.A02, "UserAborted")));
    }

    public void A01() {
        IZI izi = this.A02;
        boolean z = this.A09;
        IZI izi2 = izi;
        I9I.A00(izi2.A01, (JGR) null, AbN.A0X(izi2), 1BK.A0d(), z ? "soft_caller_friction_accepted_e2ee" : "soft_caller_friction_accepted", (String) null);
        this.A07.setFuture(C5V0.A03(this.A00, this.A01, this.A04, this.A05));
    }
}
