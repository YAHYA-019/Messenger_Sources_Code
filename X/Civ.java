package X;

import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Civ.class */
public final class Civ implements DGi {
    public final /* synthetic */ B4N A00;

    public Civ(B4N b4n) {
        this.A00 = b4n;
    }

    @Override // X.DGi
    public void BLt() {
        String str;
        B4N b4n = this.A00;
        int i = AbstractC1551Al6.A09;
        ThreadKey threadKey = b4n.A03;
        if (threadKey == null) {
            str = "threadKey";
        } else {
            String A0w = 1BK.A0w(threadKey);
            GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint = b4n.A01;
            if (graphQLEventCreationEntryPoint != null) {
                b4n.A1Y(graphQLEventCreationEntryPoint, A0w);
                return;
            }
            str = "eventCreationEntrypoint";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.DGi
    public void CvW(String str) {
        B4N b4n = this.A00;
        int i = AbstractC1551Al6.A09;
        6Je r0 = b4n.A02;
        if (r0 != null) {
            r0.CvW(str);
        }
    }
}
