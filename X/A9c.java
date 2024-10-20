package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionCount;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.google.common.collect.ImmutableList;

/* loaded from: A9c.class */
public final class A9c implements C5kd {
    public final 5kA A00;
    public final C5g3 A01;
    public final Integer A02;

    public A9c(5kA r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A01 = 5vB.A00;
        this.A02 = Integer.valueOf(ActionId.APP_FIRST_VIEW_CONTROLLER);
    }

    @Override // X.C5kd
    public C5g3 Asj() {
        return this.A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        11T.A0F(r303, 0);
        1qX r0 = (1qX) this.A00.AUa(r303, i);
        ImmutableList.Builder builder = ImmutableList.builder();
        boolean z = false;
        long j = 0;
        if (r0 != null) {
            int A00 = 1qX.A00(r0);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= A00) {
                    break;
                }
                String A0k = 7zP.A0k(r0, i3);
                if (A0k != null && A0k.length() > 0) {
                    boolean z2 = r0.mResultSet.getBoolean(i3, 3);
                    long A0E = 7zQ.A0E(r0, i3);
                    builder.m11011add((Object) new MessageReactionCount(A0k, null, 7zP.A0l(r0, i3), (int) A0E, 7zQ.A0F(r0, i3), z2));
                    j += A0E;
                    if (z2) {
                        z = true;
                    }
                }
                i2 = i3 + 1;
            }
        }
        ImmutableList.of();
        ImmutableList build = builder.build();
        C1pq.A08("reactions", build);
        return new MessageReactionsCount(build, j, z);
    }

    @Override // X.C5kd
    public Integer B7X() {
        return this.A02;
    }
}
