package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.22x, reason: invalid class name */
/* loaded from: 22x.class */
public abstract class C22x {
    public static final Comparator A00 = new Object();
    public static final Comparator A01 = new Comparator() { // from class: X.230
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C3iq c3iq = (C3iq) obj;
            C3iq c3iq2 = (C3iq) obj2;
            if (!c3iq.hasNext() && !c3iq2.hasNext()) {
                return 0;
            }
            if (!c3iq.hasNext()) {
                return 1;
            }
            if (!c3iq2.hasNext()) {
                return -1;
            }
            Comparator comparator = C22x.A00;
            Object A002 = c3iq.A00();
            if (A002 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            Object A003 = c3iq2.A00();
            if (A003 != null) {
                return comparator.compare(A002, A003);
            }
            throw AnonymousClass001.A0N("Required value was null.");
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.messaging.model.threads.ThreadsCollection A00(java.util.Collection r301) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22x.A00(java.util.Collection):com.facebook.messaging.model.threads.ThreadsCollection");
    }

    public static final ImmutableList A01(List list) {
        11T.A0F(list, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadSummary threadSummary = (ThreadSummary) it.next();
            ThreadKey threadKey = threadSummary.A0n;
            11T.A0A(threadKey);
            if (!ThreadKey.A0j(threadKey)) {
                if (ThreadKey.A0d(threadKey)) {
                    threadKey = ThreadKey.A0H(threadKey.A02, threadKey.A05);
                } else {
                    linkedHashMap.put(threadKey, threadSummary);
                }
            }
            linkedHashMap.put(threadKey, threadSummary);
        }
        ImmutableList copyOf = ImmutableList.copyOf(linkedHashMap.values());
        11T.A0A(copyOf);
        return copyOf;
    }
}
