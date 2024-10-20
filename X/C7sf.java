package X;

import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.platformmetadata.types.persona.MessagePlatformPersona;
import com.facebook.messaging.typingattribution.TypingAttributionData;

/* renamed from: X.7sf, reason: invalid class name */
/* loaded from: 7sf.class */
public final class C7sf {
    public final ParticipantInfo A00;
    public final MessagePlatformPersona A01;
    public final TypingAttributionData A02;

    public C7sf(ParticipantInfo participantInfo, MessagePlatformPersona messagePlatformPersona, TypingAttributionData typingAttributionData) {
        this.A00 = participantInfo;
        this.A02 = typingAttributionData;
        this.A01 = messagePlatformPersona;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && obj.getClass() == getClass()) {
            C7sf c7sf = (C7sf) obj;
            TypingAttributionData typingAttributionData = this.A02;
            TypingAttributionData typingAttributionData2 = c7sf.A02;
            boolean A1U = typingAttributionData == null ? AnonymousClass001.A1U(typingAttributionData2) : typingAttributionData.equals(typingAttributionData2);
            ParticipantInfo participantInfo = this.A00;
            ParticipantInfo participantInfo2 = c7sf.A00;
            boolean A1U2 = participantInfo == null ? AnonymousClass001.A1U(participantInfo2) : participantInfo.equals(participantInfo2);
            MessagePlatformPersona messagePlatformPersona = this.A01;
            MessagePlatformPersona messagePlatformPersona2 = c7sf.A01;
            boolean A1U3 = messagePlatformPersona == null ? AnonymousClass001.A1U(messagePlatformPersona2) : messagePlatformPersona.equals(messagePlatformPersona2);
            if (A1U && A1U2 && A1U3) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(this.A02, this.A00, this.A01);
    }
}
