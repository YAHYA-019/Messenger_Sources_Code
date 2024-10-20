package X;

import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8j1, reason: invalid class name */
/* loaded from: 8j1.class */
public final class C8j1 extends C1rj {
    public ImmutableList A00;

    public C8j1() {
        super("CoPresenceHeadsCollectionComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        UserKey userKey;
        ImmutableList immutableList = this.A00;
        C1rh c1rh = null;
        if (!immutableList.isEmpty() && (userKey = (UserKey) immutableList.get(0)) != null) {
            C1rq A0m = 7zM.A0m(r302);
            A0m.A2i(C1rp.FLEX_END);
            7zO.A1F(A0m, 2RH.A03);
            4YU.A1L(A0m, 2RH.A05);
            QDV qdv = new QDV(r302, new QLK());
            qdv.A01.A00 = userKey;
            qdv.A02.set(0);
            qdv.A0z(28.0f);
            qdv.A0l(28.0f);
            qdv.A1g(C5B1.A02());
            c1rh = 7zL.A0c(qdv, A0m);
        }
        return c1rh;
    }
}
