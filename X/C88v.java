package X;

import com.facebook.messaging.communitymessaging.plugins.multireact.reactiondecoration.MultiReactPillDecoration;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.88v, reason: invalid class name */
/* loaded from: 88v.class */
public final class C88v implements AYr {
    public final /* synthetic */ MultiReactPillDecoration A00;
    public final /* synthetic */ 7Y0 A01;

    public C88v(MultiReactPillDecoration multiReactPillDecoration, 7Y0 r303) {
        this.A00 = multiReactPillDecoration;
        this.A01 = r303;
    }

    @Override // X.AYr
    public void CUp(int i) {
        ParticipantInfo participantInfo;
        MultiReactPillDecoration multiReactPillDecoration = this.A00;
        5lO r0 = (5lO) 1Br.A0B(multiReactPillDecoration.A09);
        AnonymousClass622 anonymousClass622 = multiReactPillDecoration.A0B;
        ThreadSummary threadSummary = anonymousClass622.A05;
        String str = null;
        if (5lO.A00(threadSummary != null ? threadSummary.A0n : null) && 1Br.A07(r0.A00).AZk(36324887769993402L)) {
            7Y0 r02 = this.A01;
            Message message = anonymousClass622.A03;
            if (message != null && (participantInfo = message.A0K) != null) {
                str = participantInfo.A00();
            }
            r02.A01(message, (Integer) null, "thread_view", "multi_reaction_impression", (String) null, (String) null, str, 1BK.A1D("pill_count", String.valueOf(i)));
        }
    }
}
