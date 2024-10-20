package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.google.common.collect.ImmutableList;

/* loaded from: B8D.class */
public final class B8D extends B8A {
    public Long A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;
    public final C10264sx A03;
    public final String A04;
    public final boolean A05;
    public final C1d A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8D(FbUserSession fbUserSession, ThreadSummary threadSummary, C10264sx c10264sx, C1d c1d, BhL bhL, String str, boolean z) {
        super(bhL);
        7zT.A1U(threadSummary, str, c10264sx);
        this.A01 = fbUserSession;
        this.A02 = threadSummary;
        this.A04 = str;
        this.A03 = c10264sx;
        this.A05 = z;
        this.A06 = c1d;
    }

    public static final void A00(B8D b8d, ImmutableList immutableList) {
        if (1BK.A1Y(immutableList)) {
            boolean z = b8d.A05;
            Long l = null;
            MessageSearchMessageModel messageSearchMessageModel = (MessageSearchMessageModel) 0QD.A0F(immutableList);
            if (z) {
                if (messageSearchMessageModel != null) {
                    l = messageSearchMessageModel.A06;
                }
            } else if (messageSearchMessageModel != null) {
                l = messageSearchMessageModel.A05;
            }
            b8d.A00 = l;
        }
        C1d c1d = b8d.A06;
        if (c1d != null) {
            c1d.A00(immutableList);
        }
        b8d.A06(immutableList);
    }

    @Override // X.B8A, X.C9a
    public void A04(Bundle bundle) {
        super.A04(bundle);
        if (bundle != null) {
            this.A00 = AbI.A10(bundle, "act_last_message_order");
        }
    }

    @Override // X.B8A, X.C9a
    public void A05(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.A05(bundle);
        Long l = this.A00;
        if (l != null) {
            bundle.putLong("act_last_message_order", l.longValue());
        }
    }
}
