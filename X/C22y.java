package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.Comparator;

/* renamed from: X.22y, reason: invalid class name */
/* loaded from: 22y.class */
public final class C22y implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str;
        ThreadSummary threadSummary = (ThreadSummary) obj;
        ThreadSummary threadSummary2 = (ThreadSummary) obj2;
        11T.A0H(threadSummary, threadSummary2);
        long j = threadSummary.A0N;
        long j2 = threadSummary2.A0N;
        if (j > j2) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        String obj3 = threadSummary.A0n.toString();
        str = "";
        if (obj3 == null) {
            obj3 = str;
        }
        String obj4 = threadSummary2.A0n.toString();
        return obj3.compareTo(obj4 != null ? obj4 : "");
    }
}
