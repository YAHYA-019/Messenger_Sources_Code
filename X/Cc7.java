package X;

import com.facebook.common.callercontext.CallerContextable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cc7.class */
public final class Cc7 implements 2SQ, CallerContextable {
    public static final AtomicInteger A09 = new AtomicInteger();
    public static final String __redex_internal_original_name = "ThreadsMetadataLoader";
    public int A00;
    public 2eS A01;
    public 2TV A02;
    public 1BY A03;
    public final C00i A05 = 7zN.A0D(33031);
    public final C00i A06 = 1BQ.A02(65837);
    public final C00i A08 = 1BQ.A02(16470);
    public final C00i A07 = AbH.A0M();
    public final 20A A04 = (20A) 1Bi.A03(100043);

    public Cc7(1BO r302) {
        this.A03 = 7zL.A0Q(r302);
    }

    public void AEC() {
        if (this.A01 != null) {
            1BK.A0U(this.A07).markerEnd(5505187, this.A00, (short) 4);
            this.A01.A00(false);
            this.A01 = null;
        }
    }

    public void CmR(2TV r302) {
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
