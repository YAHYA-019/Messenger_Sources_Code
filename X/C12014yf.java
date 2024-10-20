package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.4yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yf.class */
public final class C12014yf {
    public final C00i A00 = new 1BQ(16822);
    public final Comparator A01 = new AHU(this, 3);

    public static MessagesCollection A00(MessagesCollection messagesCollection, MessagesCollection messagesCollection2, C12014yf c12014yf, boolean z) {
        ImmutableList copyOf;
        Message message;
        ThreadKey threadKey = messagesCollection.A00;
        ThreadKey threadKey2 = messagesCollection2.A00;
        boolean equal = Objects.equal(threadKey, threadKey2);
        boolean z2 = false;
        Object[] objArr = {threadKey, threadKey2};
        if (!equal) {
            throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("ThreadKeys mismatch in new messages(ThreadKey: %s) and old messages(ThreadKey: %s).", objArr));
        }
        ImmutableList immutableList = messagesCollection2.A01;
        if (!immutableList.isEmpty()) {
            ImmutableList immutableList2 = messagesCollection.A01;
            if (immutableList2.isEmpty()) {
                return messagesCollection2;
            }
            HashMap hashMap = new HashMap(immutableList.size());
            HashMap hashMap2 = new HashMap(immutableList.size());
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Message A0V = 4YU.A0V(it);
                String str = A0V.A1V;
                hashMap.put(str, A0V);
                String str2 = A0V.A1g;
                if (str2 != null) {
                    hashMap2.put(str2, str);
                }
            }
            1Du it2 = immutableList2.iterator();
            while (it2.hasNext()) {
                Message A0V2 = 4YU.A0V(it2);
                String str3 = A0V2.A1V;
                Object obj = str3;
                if (!hashMap.containsKey(str3)) {
                    obj = hashMap2.get(A0V2.A1g);
                    if (obj == null) {
                        obj = str3;
                    }
                }
                if (!A0V2.A21 || (message = (Message) hashMap.get(obj)) == null || message.A21) {
                    hashMap.put(obj, A0V2);
                }
            }
            if (z) {
                if (immutableList.size() + immutableList2.size() != hashMap.size()) {
                    02W.A05(4YV.A1X(immutableList.size() + immutableList2.size(), hashMap.size()));
                }
            }
            Collection values = hashMap.values();
            if (values.isEmpty()) {
                copyOf = ImmutableList.of();
            } else {
                ArrayList A17 = 1BK.A17(values);
                Collections.sort(A17, c12014yf.A01);
                copyOf = ImmutableList.copyOf((Collection) A17);
            }
            if (messagesCollection.A02 || messagesCollection2.A02) {
                z2 = true;
            }
            Message A04 = messagesCollection.A04();
            A04.getClass();
            long j = A04.A05;
            Message A042 = messagesCollection2.A04();
            A042.getClass();
            boolean z3 = j >= A042.A05 ? messagesCollection.A03 : messagesCollection2.A03;
            C5pv c5pv = new C5pv();
            c5pv.A00 = threadKey;
            c5pv.A01(copyOf);
            c5pv.A03 = z2;
            c5pv.A04 = z3;
            c5pv.A02 = true;
            return new MessagesCollection(c5pv);
        }
        return messagesCollection;
    }

    public boolean A01(MessagesCollection messagesCollection, MessagesCollection messagesCollection2) {
        ImmutableList immutableList = messagesCollection.A01;
        if ((!immutableList.isEmpty() || !messagesCollection2.A01.isEmpty()) && !immutableList.isEmpty()) {
            ImmutableList immutableList2 = messagesCollection2.A01;
            if (!immutableList2.isEmpty()) {
                Message A05 = messagesCollection.A05();
                1Du it = immutableList2.iterator();
                while (it.hasNext()) {
                    Message A0V = 4YU.A0V(it);
                    if (!Objects.equal(A0V.A1V, A05.A1V)) {
                        C00i c00i = this.A00;
                        c00i.get();
                        ImmutableList immutableList3 = C1q7.A07;
                        String str = A0V.A1g;
                        if (!1JF.A0B(str)) {
                            c00i.get();
                            String str2 = A05.A1g;
                            if ((!1JF.A0B(str2)) && Objects.equal(str, str2)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
