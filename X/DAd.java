package X;

import com.facebook.messaging.model.messages.Message;
import java.util.Comparator;

/* loaded from: DAd.class */
public final class DAd implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        long A00 = C1q7.A00((Message) obj);
        long A002 = C1q7.A00((Message) obj2);
        if (A00 > A002) {
            i = -1;
        } else {
            i = 0;
            if (A00 < A002) {
                return 1;
            }
        }
        return i;
    }
}
