package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import java.util.List;

/* loaded from: C8f.class */
public abstract class C8f {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1PB A0A;
    public final Context A0B;

    public C8f() {
        Context A00 = FbInjector.A00();
        this.A0B = A00;
        11T.A0A(A00);
        this.A09 = 1Bu.A01(A00, 83557);
        this.A07 = 1Bu.A00(83248);
        this.A04 = 1Bq.A00(83168);
        this.A06 = 1Bq.A00(49797);
        this.A00 = 1Bq.A00(49843);
        this.A05 = 1Bu.A01(A00, 49844);
        1Br A002 = 1Bq.A00(16626);
        this.A08 = A002;
        this.A0A = ((1P8) 1Br.A0B(A002)).A00("notification_instance");
        this.A01 = 1Bq.A00(83820);
        this.A02 = 1Bu.A01(A00, 83821);
        this.A03 = AbG.A0Q();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.0Je, java.lang.Object] */
    public void A00(Context context, Intent intent, Bundle bundle, CommunityMessagingNotification communityMessagingNotification, String str, List list, int i) {
        1BK.A1K(str, 3, intent);
        CQ5 cq5 = (CQ5) 1Br.A0B(this.A09);
        ThreadKey A04 = communityMessagingNotification.A04();
        if (cq5.A09(A04)) {
            return;
        }
        CDE cde = (CDE) 1Br.A0B(this.A07);
        C5t c5t = new C5t(context, intent, bundle, communityMessagingNotification, this, str, list, i);
        int ordinal = ((MessagingNotification) communityMessagingNotification).A01.ordinal();
        if ((ordinal != 48 && ordinal != 49 && ordinal != 54 && ordinal != 68 && ordinal != 73) || !AbK.A0o(cde.A01).AZk(36319162578318980L)) {
            c5t.A00(false, "not_suppressed");
            return;
        }
        ?? obj = new Object();
        ((0CL) obj).element = "not_suppressed";
        ?? obj2 = new Object();
        if (A04 == null) {
            CDE.A00(communityMessagingNotification, cde, c5t, "not_suppressed", ((0Je) obj2).element);
        } else {
            7zP.A0N(cde.A00).Ciz(new DAP(communityMessagingNotification, cde, c5t, AbK.A0V(), A04, (0Je) obj2, (0CL) obj, i));
        }
    }

    public final void A01(Context context, Bitmap bitmap, C10924uz c10924uz, CommunityMessagingNotification communityMessagingNotification) {
        11T.A0H(context, communityMessagingNotification);
        ThreadKey A04 = communityMessagingNotification.A04();
        if (A04 == null || ((MessagingNotification) communityMessagingNotification).A01 != C5ap.A1G) {
            return;
        }
        C00i c00i = this.A03.A00;
        1WY r0 = (1WY) c00i.get();
        1BV A00 = 1BV.A00(83559);
        1Wd r02 = r0.A01;
        if (r02.A01() && r02.A01() && 1WY.A01(r0).AZk(36325291497771597L) && ((C5sd) A00.get()).A00()) {
            String A09 = communityMessagingNotification.A09();
            if (A09 == null) {
                A09 = "";
            }
            String A0D = communityMessagingNotification.A0D();
            String A0F = (A0D == null || !2yD.A03(AbK.A0k(c00i), 36315340066857765L)) ? communityMessagingNotification.A0F() : 0Pz.A0j(A0D, " · ", communityMessagingNotification.A0F());
            C7x A01 = ((C9H) 1Br.A0B(this.A01)).A01(context, bitmap, A04, A0F, A09);
            if (A01 != null) {
                C00i A0R = AbF.A0R(this.A02);
                if (!C5sb.A00(A01, A0F, A09)) {
                    ((C5sb) A0R.get()).A02(context, bitmap, A04, A0F, A09);
                }
                c10924uz.A0U = A01.A02.getId();
            }
        }
    }
}
