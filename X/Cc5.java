package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.service.model.FetchThreadKeyByParticipantsParams;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.concurrent.Executor;

/* loaded from: Cc5.class */
public final class Cc5 implements 2SQ, CallerContextable {
    public static final String __redex_internal_original_name = "ThreadByParticipantsLoader";
    public 2eS A00;
    public 2TV A01;
    public CED A02;
    public Executor A03;
    public final C01s A04;
    public final BlueServiceOperationFactory A05;

    public Cc5() {
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0B(33031);
        Executor A1D = AbJ.A1D();
        C01s A0I = 1BL.A0I();
        this.A05 = blueServiceOperationFactory;
        this.A03 = A1D;
        this.A04 = A0I;
    }

    public void A00(CED ced) {
        ImmutableSet immutableSet = ced.A01;
        if (immutableSet == null || immutableSet.isEmpty()) {
            return;
        }
        if (this.A00 != null) {
            if (Objects.equal(this.A02.A01, immutableSet)) {
                return;
            } else {
                AEC();
            }
        }
        this.A01.getClass();
        this.A02 = ced;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("fetch_thread_with_participants_key", new FetchThreadKeyByParticipantsParams(ced.A00, immutableSet, ced.A02, ced.A04, ced.A03));
        1IB A00 = 1Ho.A00(this.A05.newInstance_DEPRECATED(1BJ.A00(419), A05, 1, CallerContext.A06(Cc5.class)), false);
        this.A01.C4n(A00, ced);
        ApQ apQ = new ApQ(ced, this, 7);
        this.A00 = new 2eS(apQ, A00);
        1Kd.A0F(apQ, A00, this.A03);
    }

    public void AEC() {
        2eS r0 = this.A00;
        if (r0 != null) {
            r0.A00(false);
            this.A00 = null;
            this.A02 = null;
        }
    }

    public void CmR(2TV r302) {
        this.A01 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
