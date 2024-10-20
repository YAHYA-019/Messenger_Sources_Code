package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.NewMessageResult;
import java.util.Queue;

/* loaded from: Cwa.class */
public final class Cwa implements DHm {
    public final 1CO A00;
    public final java.util.Map A01 = AnonymousClass001.A0u();
    public final C15h A02;

    public Cwa() {
        DBe A00 = DBe.A00(this, 150);
        1CO A0e = AbJ.A0e();
        this.A02 = A00;
        this.A00 = A0e;
    }

    @Override // X.DHm
    public QqR AEm(FbUserSession fbUserSession, NewMessageResult newMessageResult) {
        ThreadKey threadKey;
        Number number;
        int A00 = C1Ur.A00(this.A00, 3, 36592077684867323L);
        if (A00 <= 0) {
            return QqR.A08;
        }
        Message message = newMessageResult.A00;
        if (!AbN.A1Y(message, this.A02) && (threadKey = message.A0V) != null) {
            java.util.Map map = this.A01;
            if (!map.containsKey(threadKey)) {
                map.put(threadKey, new RLY(A00));
            }
            Object obj = map.get(threadKey);
            obj.getClass();
            RLY rly = (RLY) obj;
            long j = message.A05;
            Queue queue = rly.A02;
            int size = queue.size();
            int i = rly.A01;
            if (size == i) {
                queue.poll();
            }
            Long valueOf = Long.valueOf(j);
            queue.add(valueOf);
            ThreadSummary threadSummary = newMessageResult.A02;
            if ((threadSummary == null ? -1 : threadSummary.A0O) < A00) {
                rly.A00 = null;
            } else {
                Long l = rly.A00;
                if (l != null && j - l.longValue() < 300000) {
                    return QqR.A05;
                }
                if (queue.size() >= i && (number = (Number) queue.peek()) != null && j - number.longValue() < 60000) {
                    rly.A00 = valueOf;
                    return QqR.A05;
                }
            }
        }
        return QqR.A01;
    }

    @Override // X.DHm
    public String name() {
        return "FrequencyRule";
    }
}
