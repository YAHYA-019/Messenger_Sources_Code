package X;

import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.service.model.ModifyThreadParams;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: L0p.class */
public final class L0p {
    public int A00;
    public long A01;
    public 1IC A02;
    public ModifyThreadParams A03;
    public java.util.Map A04;
    public final C00i A05 = 1BQ.A00();
    public final FbSharedPreferences A06;
    public final ScheduledExecutorService A07;
    public final BlueServiceOperationFactory A08;

    public L0p() {
        FbSharedPreferences A0i = AbJ.A0i();
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0A(33031);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16464);
        this.A06 = A0i;
        this.A08 = blueServiceOperationFactory;
        this.A07 = scheduledExecutorService;
    }

    public static void A00(L0p l0p) {
        synchronized (l0p) {
            java.util.Map map = l0p.A04;
            if (map != null && l0p.A02 == null) {
                Iterator A1A = 1BK.A1A(map);
                if (A1A.hasNext()) {
                    ModifyThreadParams modifyThreadParams = (ModifyThreadParams) A1A.next();
                    A1A.remove();
                    l0p.A03 = modifyThreadParams;
                    0fH.A07(L0p.class, modifyThreadParams.A02.toString(), "Starting server update for thread %s");
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable(1BJ.A00(98), modifyThreadParams);
                    1IB A00 = 1Ho.A00(l0p.A08.newInstance_DEPRECATED(1BJ.A00(99), A05), true);
                    l0p.A02 = A00;
                    LfN.A00(A00, l0p, 16);
                } else {
                    l0p.A04 = null;
                }
            }
        }
    }
}
