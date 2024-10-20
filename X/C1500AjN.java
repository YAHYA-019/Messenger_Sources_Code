package X;

import com.facebook.assistant.stella.ipc.common.model.StellaContactGroupParticipant;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadParticipant;

/* renamed from: X.AjN, reason: case insensitive filesystem */
/* loaded from: AjN.class */
public final class C1500AjN extends StellaContactGroupParticipant {
    public final /* synthetic */ C28m A00;
    public final /* synthetic */ ThreadParticipant A01;
    public final /* synthetic */ B9t A02;

    public C1500AjN(C28m c28m, ThreadParticipant threadParticipant, B9t b9t) {
        this.A02 = b9t;
        this.A01 = threadParticipant;
        this.A00 = c28m;
        ParticipantInfo participantInfo = threadParticipant.A05;
        this.name = c28m.A00(participantInfo);
        this.id = participantInfo.A00();
    }
}
