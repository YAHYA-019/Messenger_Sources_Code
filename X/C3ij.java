package X;

import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadParticipant;
import java.util.Comparator;

/* renamed from: X.3ij, reason: invalid class name */
/* loaded from: 3ij.class */
public final class C3ij implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ThreadParticipant threadParticipant = (ThreadParticipant) obj;
        ThreadParticipant threadParticipant2 = (ThreadParticipant) obj2;
        int compareTo = Long.valueOf(threadParticipant.A02).compareTo(Long.valueOf(threadParticipant2.A02));
        if (compareTo == 0) {
            compareTo = ParticipantInfo.A0O.compare(threadParticipant.A05, threadParticipant2.A05);
        }
        return compareTo;
    }
}
