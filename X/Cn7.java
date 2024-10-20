package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cn7.class */
public final class Cn7 implements DFR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ ThreadSummary A02;
    public final /* synthetic */ Integer A03;

    public Cn7(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, Integer num) {
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = threadSummary;
        this.A03 = num;
    }

    public final void C8q(CfG cfG) {
        1Bn.A0A(147889);
        Context context = this.A00;
        RRK rrk = new RRK(context, this.A01, "delete_thread_dialog");
        ThreadSummary threadSummary = this.A02;
        rrk.A00(context, threadSummary);
        Integer num = this.A03;
        AbJ.A0W().A0H(threadSummary.A0n.A04, num.intValue() != 1 ? "long_press_menu" : "thread_details", "channel_delete_dialog");
    }
}
