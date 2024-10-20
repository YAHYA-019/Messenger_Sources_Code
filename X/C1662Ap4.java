package X;

import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessagingNotification;

/* renamed from: X.Ap4, reason: case insensitive filesystem */
/* loaded from: Ap4.class */
public final class C1662Ap4 extends 2rI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C10924uz A02;
    public final /* synthetic */ C5rg A03;
    public final /* synthetic */ FbUserSession A04;
    public final /* synthetic */ Message A05;
    public final /* synthetic */ ThreadSummary A06;
    public final /* synthetic */ C5rj A07;
    public final /* synthetic */ 5rY A08;
    public final /* synthetic */ MessagingNotification A09;
    public final /* synthetic */ CharSequence A0A;

    public C1662Ap4(C10924uz c10924uz, C5rg c5rg, FbUserSession fbUserSession, Message message, ThreadSummary threadSummary, C5rj c5rj, 5rY r308, MessagingNotification messagingNotification, CharSequence charSequence, int i, int i2) {
        this.A08 = r308;
        this.A02 = c10924uz;
        this.A0A = charSequence;
        this.A03 = c5rg;
        this.A00 = i;
        this.A09 = messagingNotification;
        this.A05 = message;
        this.A06 = threadSummary;
        this.A01 = i2;
        this.A07 = c5rj;
        this.A04 = fbUserSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    public void A02(1OW r302) {
        C10924uz c10924uz = this.A02;
        ?? r0 = new 4vI();
        r0.A08(this.A0A);
        c10924uz.A0J(r0);
        5rY r02 = this.A08;
        Message message = this.A05;
        ThreadSummary threadSummary = this.A06;
        int i = this.A01;
        C5rj c5rj = this.A07;
        C5rg c5rg = this.A03;
        int i2 = this.A00;
        5rY.A01(c5rg, this.A04, message, threadSummary, c5rj, r02, this.A09, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [androidx.core.app.NotificationCompat$BigPictureStyle, X.4vI] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.core.app.NotificationCompat$BigPictureStyle, X.4vI] */
    public void A03(1OW r302) {
        2EU r0 = (2EU) r302.B7p();
        if (r0 == null || !AbG.A1a(r0)) {
            C10924uz c10924uz = this.A02;
            ?? r02 = new 4vI();
            r02.A08(this.A0A);
            c10924uz.A0J(r02);
        } else {
            try {
                Bitmap A04 = AbH.A04(r0);
                C10924uz c10924uz2 = this.A02;
                ?? r03 = new 4vI();
                r03.A08(A04);
                ((4vI) r03).A02 = C10924uz.A02(this.A0A);
                ((4vI) r03).A03 = true;
                c10924uz2.A0J(r03);
                C5rg c5rg = this.A03;
                5rY r04 = this.A08;
                C10914uy A00 = AbG.A0l(r04.A0A).A00(r04.A01, null, this.A09, this.A00);
                ?? r05 = new 4vI();
                r05.A08(A04);
                A00.A0J(r05);
                C5rg c5rg2 = new C5rg();
                c5rg2.A05 |= 4;
                A00.A0I(c5rg2);
                c5rg.A0D.add(A00.A07());
            } finally {
                r0.close();
            }
        }
        5rY r06 = this.A08;
        Message message = this.A05;
        ThreadSummary threadSummary = this.A06;
        int i = this.A01;
        C5rj c5rj = this.A07;
        5rY.A01(this.A03, this.A04, message, threadSummary, c5rj, r06, this.A09, i, this.A00);
    }
}
