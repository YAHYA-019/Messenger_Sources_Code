package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.rtc.interfaces.CallSurfaceLoggingParams;
import com.facebook.rtc.launch.CallStartOutcome;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3u.class */
public final class D3u implements 2eF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ B9r A03;
    public final /* synthetic */ CbW A04;
    public final /* synthetic */ C5V0 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public D3u(Context context, FbUserSession fbUserSession, B9r b9r, CbW cbW, C5V0 c5v0, String str, long j, boolean z, boolean z2) {
        this.A03 = b9r;
        this.A04 = cbW;
        this.A00 = j;
        this.A07 = z;
        this.A01 = context;
        this.A08 = z2;
        this.A06 = str;
        this.A05 = c5v0;
        this.A02 = fbUserSession;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        if (AnonymousClass001.A1V(obj)) {
            return C3o5.A0J(new CallStartOutcome(H9h.A02, "Try to call thread in vanish mode"));
        }
        CbW cbW = this.A04;
        long j = this.A00;
        boolean AZk = 1BK.A0N(this.A03.A00).AZk(36313407328688439L);
        boolean z = this.A07;
        Context context = this.A01;
        ThreadKey A01 = cbW.A01(context, j, false, AZk, z);
        0fH.A0g(A01.A06.toString(), B9r.__redex_internal_original_name, "Generate %s threadkey for 1 to 1 calling");
        String A0t = 1BK.A0t();
        boolean z2 = this.A08;
        String str = this.A06;
        C9b bHl = new BHl(A01, (CallSurfaceLoggingParams) null, A0t, "stella_call", (String) null, "stella", str, j, z2, false, false, false);
        RhC.A01(str).A04();
        return this.A05.A0B(context, this.A02, bHl);
    }
}
