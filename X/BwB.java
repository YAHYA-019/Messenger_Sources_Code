package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.inject.FbInjector;

/* loaded from: BwB.class */
public final class BwB {
    public final Resources A00;
    public final BlueServiceOperationFactory A01;
    public final C00i A02;
    public final 9Uj A03;
    public final 08O A04;
    public final 6HM A05;

    public BwB() {
        Context A00 = FbInjector.A00();
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0E((Context) null, (1BY) null, 33031);
        9Uj r0 = (9Uj) 1Bn.A0E((Context) null, (1BY) null, 67237);
        08O r02 = (08O) 1Bi.A03(6);
        this.A02 = 1BV.A01((1BY) null, 67527);
        this.A00 = A00.getResources();
        this.A01 = blueServiceOperationFactory;
        this.A03 = r0;
        this.A05 = (6HM) 1Hv.A02(A00, 50020);
        this.A04 = r02;
    }
}
