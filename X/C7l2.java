package X;

import com.facebook.messaging.model.threads.ThreadParticipant;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7l2, reason: invalid class name */
/* loaded from: 7l2.class */
public abstract class C7l2 {
    public static final ImmutableList A00(ImmutableList immutableList) {
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            ThreadParticipant A0W = 4YU.A0W(it);
            if (A0W.A00() != C1zL.A04) {
                builder.m11011add((Object) A0W);
            }
        }
        return 1Fj.A01(builder);
    }
}
