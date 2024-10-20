package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: B8C.class */
public final class B8C extends B8A {
    public Integer A00;
    public Long A01;
    public final FbUserSession A02;
    public final ThreadSummary A03;
    public final C10264sx A04;
    public final C1d A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8C(FbUserSession fbUserSession, ThreadSummary threadSummary, C10264sx c10264sx, C1d c1d, BhL bhL, Long l, String str) {
        super(bhL);
        7zT.A1U(threadSummary, str, c10264sx);
        this.A02 = fbUserSession;
        this.A03 = threadSummary;
        this.A06 = str;
        this.A04 = c10264sx;
        this.A01 = l;
        this.A05 = c1d;
    }

    @Override // X.B8A, X.C9a
    public void A04(Bundle bundle) {
        super.A04(bundle);
        if (bundle != null) {
            this.A00 = Integer.valueOf(bundle.getInt("open_next_cursor"));
            this.A01 = AbI.A10(bundle, "open_thread_id");
        }
    }

    @Override // X.B8A, X.C9a
    public void A05(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.A05(bundle);
        Integer num = this.A00;
        if (num != null) {
            bundle.putInt("open_next_cursor", num.intValue());
        }
        Long l = this.A01;
        if (l != null) {
            bundle.putLong("open_thread_id", l.longValue());
        }
    }
}
