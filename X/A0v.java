package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: A0v.class */
public final class A0v implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public A0v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, long j) {
        this.A00 = i;
        this.A07 = obj2;
        this.A06 = obj4;
        this.A03 = obj3;
        this.A02 = obj5;
        this.A04 = obj;
        this.A01 = j;
        this.A05 = obj6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        if (this.A00 == 0) {
            MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, false, 0, 1, GOm.A00(38), "CreateStaticLocationShare", A1g.A01(this, 66));
            return;
        }
        if (((5Qb) obj).A00 == 0) {
            C9mb.A00((C9mb) this.A07).A03("fetch_join_flow_data_with_community_id_succeed");
            7zL.A1R(this.A06);
            return;
        }
        Long l = (Long) this.A03;
        if (l != null && (obj2 = this.A02) != null) {
            22I r0 = (22I) this.A04;
            long j = this.A01;
            r0.A0A(new CyB(6, j, obj2, this.A05, this.A07, l), j, 0L);
        } else {
            C9mb c9mb = (C9mb) this.A07;
            C9mb.A00(c9mb).A02(Long.valueOf(this.A01), l, "failed_to_fetch_community_join_info");
            C00m c00m = (C00m) this.A05;
            if (c00m != null) {
                c00m.invoke();
            }
            7zU.A0w(c9mb.A00, c9mb.A0J, 2131957423);
        }
    }
}
