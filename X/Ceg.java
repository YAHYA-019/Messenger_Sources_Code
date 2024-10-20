package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: Ceg.class */
public final class Ceg implements C4Av {
    public final BlueServiceOperationFactory A00 = (BlueServiceOperationFactory) 1Bn.A0B(33031);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        String str;
        String str2;
        if (!r302.A01()) {
            return false;
        }
        1IB A0M = 4YU.A0M(1BK.A05(), (CallerContext) null, this.A00, 1BJ.A00(578), true);
        Boolean bool = false;
        if (A0M != null) {
            try {
                1Yz.A00(A0M);
            } catch (CancellationException e) {
                e = e;
                str = "FetchContactsCoefficientConditionalWorker";
                str2 = "CancellationException";
                0fH.A0r(str, str2, e);
                return bool.booleanValue();
            } catch (ExecutionException e2) {
                e = e2;
                str = "FetchContactsCoefficientConditionalWorker";
                str2 = "ExecutionException";
                0fH.A0r(str, str2, e);
                return bool.booleanValue();
            } catch (Exception e3) {
                e = e3;
                str = "FetchContactsCoefficientConditionalWorker";
                str2 = "Error";
                0fH.A0r(str, str2, e);
                return bool.booleanValue();
            }
        }
        bool = true;
        return bool.booleanValue();
    }
}
