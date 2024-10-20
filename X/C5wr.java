package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5wr, reason: invalid class name */
/* loaded from: 5wr.class */
public abstract class C5wr {
    public static final 03Y A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        23F r0 = (23F) 1Lo.A04(context, fbUserSession, (1BY) null, 33102);
        ImmutableList immutableList = threadSummary.A1L;
        11T.A0A(immutableList);
        ArrayList arrayList = new ArrayList(C1A3.A1D(immutableList, 10));
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            11T.A0D(threadParticipant);
            arrayList.add(r0.A00(C28p.A01(threadParticipant)));
        }
        return A01(arrayList);
    }

    public static final 03Y A01(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (user != null) {
                if (user.A02() != C1z1.NOT_BLOCKED) {
                    arrayList.add(user);
                }
                if (C5ws.A00(user)) {
                    arrayList2.add(user);
                }
            }
        }
        return new 03Y(arrayList, arrayList2);
    }
}
