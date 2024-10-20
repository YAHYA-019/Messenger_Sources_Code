package X;

import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9lD, reason: invalid class name */
/* loaded from: 9lD.class */
public final class C9lD {
    public long A00;
    public String A01;
    public Long A02;
    public String A03;
    public final 1Br A07 = 7zM.A0T();
    public final 1Br A04 = 1Bu.A00(68521);
    public final 1Br A06 = 1Bq.A00(68021);
    public final 1Br A05 = 1Bu.A00(68522);

    public static final UserFlowLogger A00(C9lD c9lD) {
        return 4YV.A0Z(c9lD.A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r301.A00 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.C9lD r301, java.lang.String r302) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A01
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3a
            r0 = r301
            X.1Br r0 = r0.A06
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.61c r0 = (X.C61c) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A07()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3a
            r0 = r301
            long r0 = r0.A00
            r305 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r304 = r0
            r0 = r309
            if (r0 != 0) goto L3e
        L3a:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L3e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lD.A01(X.9lD, java.lang.String):boolean");
    }

    public final void A02(C98M c98m, ThreadKey threadKey, String str) {
        ThreadSummary threadSummary;
        ThreadSummary threadSummary2;
        11T.A0F(c98m, 1);
        if (((C61c) 1Br.A0B(this.A06)).A07() && this.A00 == 0) {
            if (threadKey != null) {
                C00i c00i = this.A05.A00;
                c00i.get();
                ThreadSummaryDataModel A0y = 7zM.A0y(7zT.A07(threadKey));
                this.A03 = (A0y == null || (threadSummary2 = A0y.A00) == null || threadSummary2.A1T == null) ? "friends_and_family" : "community_chats";
                c00i.get();
                ThreadSummaryDataModel A0y2 = 7zM.A0y(7zT.A07(threadKey));
                this.A02 = (A0y2 == null || (threadSummary = A0y2.A00) == null) ? null : Long.valueOf(threadSummary.A06);
            }
            1Br r0 = this.A07;
            this.A00 = 4YV.A0Z(r0).generateNewFlowId(127407466);
            this.A01 = str;
            4YV.A0Z(r0).flowStart(this.A00, "RollCallCaptureCreationFunnelLogger", false);
            4YV.A0Z(r0).flowAnnotate(this.A00, AbE.A00(18), AnonymousClass001.A0b(c98m, ((9KH) 1Br.A0B(this.A04)).A00));
            4YV.A0Z(r0).flowAnnotate(this.A00, "source_type", this.A03);
            Long l = this.A02;
            if (l != null) {
                4YV.A0Z(r0).flowAnnotate(this.A00, "community_group_id", l.longValue());
            }
        }
    }

    public final void A03(String str) {
        if (A01(this, str)) {
            4YV.A0Z(this.A07).flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
            this.A01 = null;
            this.A00 = 0L;
        }
    }

    public final void A04(String str) {
        if (A01(this, str)) {
            4YV.A0Z(this.A07).flowMarkPoint(this.A00, "media_picker_cancel");
        }
    }
}
