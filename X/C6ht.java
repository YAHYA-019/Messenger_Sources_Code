package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.6ht, reason: invalid class name */
/* loaded from: 6ht.class */
public final class C6ht {
    public int A00;
    public 06Z A02;
    public CfG A03;
    public 1BY A04;
    public ThreadSummary A05;
    public final C00i A0C = new 1BV((1BY) null, 65561);
    public final C00i A0B = new 1BV((1BY) null, 85089);
    public final C00i A0D = new 1BQ(16705);
    public final C00i A08 = new 1BQ(50016);
    public final C00i A07 = new 1BQ(49420);
    public final C00i A0A = new 1BQ(65609);
    public boolean A06 = true;
    public long A01 = 0;
    public final C6hu A0E = new C6hu(this);
    public final C6hv A0F = new C6hv(this);
    public final C00i A09 = new 1BV((1BY) null, 67527);

    public C6ht(1BO r302) {
        this.A04 = new 1BY(r302);
    }

    public static Activity A00(Context context, C6ht c6ht) {
        Activity activity = null;
        if (context != null && (context instanceof ContextWrapper)) {
            if (!(context instanceof Activity)) {
                return A00(((ContextWrapper) context).getBaseContext(), c6ht);
            }
            activity = (Activity) context;
        }
        return activity;
    }

    public void A01(Context context, Message message, boolean z, boolean z2) {
        Capabilities capabilities;
        String str = message.A1V;
        str.getClass();
        if (this.A03 == null) {
            CHy cHy = (CHy) 1Bn.A0E(context, (1BY) null, 82650);
            int i = this.A00;
            if (i == 0) {
                this.A0C.get();
                i = 2131959819;
                this.A00 = 2131959819;
            }
            CfG A01 = cHy.A01(context, i);
            this.A03 = A01;
            A01.ABm();
            1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428));
            C80o c80o = (C80o) this.A0C.get();
            1Wi r0 = (1Wi) 1Bi.A03(68470);
            ThreadKey threadKey = message.A0V;
            boolean z3 = true;
            if (threadKey == null || !threadKey.A1D() || (capabilities = message.A0h) == null || !4YU.A1Y(capabilities, 223) || !r0.A05(true)) {
                z3 = false;
            }
            ((9YY) c80o.A03.get()).A00(new 9uY(new 9TT(context, this, message, z, z2), c80o), str, z3);
        }
    }

    public void A02(06Z r302, Message message, ThreadSummary threadSummary, long j, boolean z) {
        ThreadKey threadKey;
        this.A02 = r302;
        this.A05 = threadSummary;
        this.A01 = j;
        C00i c00i = this.A0C;
        ((C80o) c00i.get()).A00 = threadSummary;
        c00i.get();
        this.A00 = 2131964284;
        c00i.get();
        C6ht c6ht = this.A0F.A00;
        06Z r0 = c6ht.A02;
        if (r0 == null || !C0D1.A01(r0)) {
            return;
        }
        ((UserFlowLogger) c6ht.A0D.get()).flowMarkPoint(c6ht.A01, "unsend_dialog_open");
        ThreadSummary threadSummary2 = c6ht.A05;
        Long l = null;
        if (threadSummary2 != null && (threadKey = threadSummary2.A0l) != null) {
            l = 4YU.A0l(threadKey);
        }
        message.getClass();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("message", new OpaqueParcelable(message));
        A05.putBoolean("is_action_chaining_eligible", z);
        A05.putLong("parent_thread_key", l.longValue());
        0D2 r02 = new 2Ov();
        r02.setArguments(A05);
        r02.A02 = c6ht.A0E;
        r02.A0m(c6ht.A02, "unsend_message_dialog_tag");
    }
}
