package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.plugins.participation.participationcomposer.ParticipationComposerImplementation;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.9pg, reason: invalid class name */
/* loaded from: 9pg.class */
public final class C9pg implements View.OnClickListener {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 1Br A02;
    public final /* synthetic */ C1296Ad8 A03;
    public final /* synthetic */ ParticipationComposerImplementation A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Long A07;

    public C9pg(1Br r302, 1Br r303, 1Br r304, C1296Ad8 c1296Ad8, ParticipationComposerImplementation participationComposerImplementation, Long l, Long l2, Long l3) {
        this.A07 = l;
        this.A06 = l2;
        this.A05 = l3;
        this.A03 = c1296Ad8;
        this.A04 = participationComposerImplementation;
        this.A00 = r302;
        this.A02 = r303;
        this.A01 = r304;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        int A05 = 0FI.A05(815332967);
        Integer num = ParticipationComposerImplementation.A04;
        if (num == 0S2.A0C && (l3 = this.A07) != null && (l4 = this.A06) != null) {
            Long l5 = this.A05;
            String obj = l5 != null ? l5.toString() : null;
            String obj2 = l4.toString();
            String obj3 = l3.toString();
            this.A03.A04(new CommunityMessagingLoggerModel(null, null, obj, obj2, obj3, null, AbE.A00(569), 4YT.A00(1370), "render_learn_more_bottom_sheet", null, null, null));
            DKT dkt = (DKT) 1Br.A0B(this.A00);
            ParticipationComposerImplementation participationComposerImplementation = this.A04;
            Context context = participationComposerImplementation.A00;
            06Z r0 = participationComposerImplementation.A01;
            CP0 cp0 = new CP0("com.bloks.www.bloks.messenger.groups.chats.participation.education");
            cp0.A05("thread_id", obj3);
            cp0.A05("group_id", obj2);
            DKT.A05(context, r0, dkt, cp0.A03(), 50, 100);
        } else if (num == 0S2.A01 && (l = this.A05) != null && (l2 = this.A07) != null) {
            String obj4 = l.toString();
            Long l6 = this.A06;
            this.A03.A04(new CommunityMessagingLoggerModel(null, null, obj4, l6 != null ? l6.toString() : null, l2.toString(), null, "request_to_participate_button", "request_to_participate_bottom_sheet", "request_to_participate", null, null, null));
            ParticipationComposerImplementation participationComposerImplementation2 = this.A04;
            Context context2 = participationComposerImplementation2.A00;
            CfG A01 = ((CHy) 1Bu.A06(context2, 82650)).A01(context2, 2131967961);
            A01.ABm();
            MailboxFeature A0d = 7zP.A0d(this.A02);
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            A0x a0x = new A0x(0, A01, this.A01, this.A00, participationComposerImplementation2, l, l2, l6);
            1Um A0O = 1BK.A0O(A0d, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0O, a0x);
            1Um.A01(A0O, new A1Z(0, longValue2, longValue, A0Q, A0d, A0P), A0P, A0Q);
        }
        0FI.A0B(-373141156, A05);
    }
}
