package X;

import android.content.Context;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C37.class */
public final class C37 {
    public final /* synthetic */ ThreadSummary A00;
    public final /* synthetic */ Cs7 A01;

    public C37(ThreadSummary threadSummary, Cs7 cs7) {
        this.A01 = cs7;
        this.A00 = threadSummary;
    }

    public void A00() {
        Cs7 cs7 = this.A01;
        AcQ acQ = cs7.A06.A00;
        AcX acX = cs7.A09;
        DK4 dk4 = cs7.A08;
        Context context = cs7.A05;
        AcQ.A0C(context, acQ, dk4, acX);
        AbK.A0S(acQ).A09(acX.A0A);
        BP5 bp5 = cs7.A07;
        int i = cs7.A00;
        int i2 = cs7.A02;
        int i3 = cs7.A01;
        int i4 = cs7.A04;
        int i5 = cs7.A03;
        ThreadSummary threadSummary = this.A00;
        AcQ.A0A(context, (GroupInviteLinkData) null, threadSummary, acQ, bp5, dk4, acX, 5SW.A1Z, AnonymousClass545.A01((AnonymousClass545) 4YU.A0p(acQ.A0B), threadSummary, true), i, i2, i3, i4, i5, false);
        acQ.mFragmentManager.A0w();
        AcQ.A0D(context, acQ, 4YU.A0D(acQ.A13).getString(2131954460), 0);
    }
}
