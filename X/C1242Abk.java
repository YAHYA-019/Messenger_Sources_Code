package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.payments.p2m.messenger.plugins.quickpromotion.threadviewbottomsheet.ThreadViewPaymentNotificationBottomSheet;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* renamed from: X.Abk, reason: case insensitive filesystem */
/* loaded from: Abk.class */
public final class C1242Abk extends C21h {
    public final int A00 = 2;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242Abk(6oJ r302) {
        super("orca_contact_list");
        this.A01 = r302;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242Abk(C6yv c6yv) {
        super("sticker_collection");
        this.A01 = c6yv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242Abk(7Ej r302) {
        super("CutoverFetchFromThreadPk");
        this.A01 = r302;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242Abk(C7PU c7pu) {
        super("get_seen_count_for_message");
        this.A01 = c7pu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242Abk(ThreadViewPaymentNotificationBottomSheet threadViewPaymentNotificationBottomSheet) {
        super("payments_p2m_payment_detection_data");
        this.A01 = threadViewPaymentNotificationBottomSheet;
    }

    @Override // X.C21h
    public void A00(Set set) {
        switch (this.A00) {
            case 0:
                C7PU.A00((C7PU) this.A01);
                return;
            case 1:
                7Ej r0 = (7Ej) this.A01;
                r0.A00 = ((5xU) 1Br.A0B(r0.A03)).A01(new A1d(r0, 45), r0.A05.A01);
                return;
            case 2:
                6oJ r02 = (6oJ) this.A01;
                Capabilities capabilities = 6oJ.A0C;
                if (r02.A00 != -1) {
                    ((C2eo) 1Br.A0B(r02.A03)).A07(new C9wa(r02, 0), ImmutableList.of((Object) Long.valueOf(r02.A00)));
                    return;
                }
                return;
            case 3:
                ThreadViewPaymentNotificationBottomSheet threadViewPaymentNotificationBottomSheet = (ThreadViewPaymentNotificationBottomSheet) this.A01;
                ThreadKey BF7 = threadViewPaymentNotificationBottomSheet.A05.BF7();
                11T.A0D(BF7);
                MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 1Lm.A05(threadViewPaymentNotificationBottomSheet.A02, threadViewPaymentNotificationBottomSheet.A03, 16686));
                long A0r = BF7.A0r();
                Czj A00 = Czj.A00(BF7, threadViewPaymentNotificationBottomSheet, 83);
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0Q = 1BK.A0Q(AQV, A00);
                1Um.A02(AQV, Czf.A00(mailboxFeature, A0Q, 33, A0r), A0Q, false);
                return;
            default:
                C00m c00m = ((C6yv) this.A01).A00;
                if (c00m != null) {
                    c00m.invoke();
                    return;
                }
                return;
        }
    }
}
