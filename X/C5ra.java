package X;

import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5ra, reason: invalid class name */
/* loaded from: 5ra.class */
public final class C5ra {
    public final 5bF A02 = (5bF) 1Bi.A03(49797);
    public final C12104yr A03 = (C12104yr) 1Bn.A0A(49419);
    public final C00i A00 = FbInjector.A00;
    public final C00i A01 = new 1BV(68249);

    public static ArrayList A00(ThreadKey threadKey, C5ra c5ra, List list, int i) {
        5bF r0 = c5ra.A02;
        MessagesCollection A05 = r0.A05(threadKey, i + 1);
        ImmutableList reverse = (A05 == null ? ImmutableList.copyOf((Collection) list) : 5bF.A01(A05, list)).reverse();
        ArrayList arrayList = new ArrayList(i);
        Object A0A = 1Bn.A0A(83438);
        int size = reverse.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Message message = (Message) reverse.get(size);
            ParticipantInfo A06 = r0.A06(message);
            if (A0A == null || !A0A.equals(A06.A0F)) {
                arrayList.add(message);
                i--;
                if (i == 0) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
