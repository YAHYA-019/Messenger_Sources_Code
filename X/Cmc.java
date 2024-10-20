package X;

import com.facebook.fbtrace.FbTraceNode;
import com.facebook.messaging.service.model.AddMembersParams;
import com.facebook.user.model.UserIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Cmc.class */
public final class Cmc implements DHC {
    public Cmc() {
    }

    public Cmc(int i) {
    }

    public RyF ACq(FbTraceNode fbTraceNode, Integer num, Object obj, long j) {
        AddMembersParams addMembersParams = (AddMembersParams) obj;
        Long A0l = 4YU.A0l(addMembersParams.A00);
        try {
            C29V A0s = AbK.A0s();
            ImmutableList immutableList = addMembersParams.A01;
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                builder.m11011add((Object) new S1H(1BK.A0n(((UserIdentifier) it.next()).getId()), "", ""));
            }
            return new RyF(A0l, A0s.A00(new Rz8(Boolean.valueOf(addMembersParams.A02), A0l, builder.build(), AnonymousClass001.A0u())));
        } catch (2LA e) {
            throw new SGD(RVH.A01(e, BOu.A09.errorCode));
        }
    }

    public boolean BWi(DHB dhb) {
        return AnonymousClass001.A1W(dhb, Qut.A02);
    }
}
