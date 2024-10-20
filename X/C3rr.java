package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoConsistencyStackJNI;
import com.facebook.pando.PandoFlipperUtil;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import java.util.concurrent.Executor;

/* renamed from: X.3rr, reason: invalid class name */
/* loaded from: 3rr.class */
public final class C3rr {
    public final PandoGraphQLConsistencyJNI A00;

    public C3rr() {
        Executor executor = (Executor) 1Bn.A0A(16450);
        Executor executor2 = (Executor) 1Bn.A0A(16450);
        2yD r0 = (2yD) 1Bi.A03(16385);
        PandoConsistencyStackJNI create = PandoConsistencyStackJNI.create(false, false, false, 0, 0, 0, false);
        create = executor2 != null ? PandoFlipperUtil.createConsistencyStack(create, executor2) : create;
        C3rw c3rw = PandoGraphQLConsistencyJNI.Companion;
        C3s8 c3s8 = PandoConsistencyServiceJNI.Companion;
        this.A00 = new PandoGraphQLConsistencyJNI(PandoConsistencyServiceJNI.create(create, executor, (int) r0.Auy(36598648984965384L), false, 500, false, 0, false, false));
    }
}
