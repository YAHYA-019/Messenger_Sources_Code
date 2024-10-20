package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.zero.cms.ZeroCmsUtil;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: Cel.class */
public final class Cel implements C4Av {
    public final ZeroCmsUtil A00 = (ZeroCmsUtil) 1Bi.A03(49293);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        String str;
        String str2;
        Boolean A0d = 1BK.A0d();
        FbUserSession A00 = r302.A00();
        try {
            if (r302.A01()) {
                1Yz.A00(this.A00.A02(A00, true));
                A0d = true;
            }
        } catch (CancellationException e) {
            e = e;
            str = "ZeroCmsConditionalWorker";
            str2 = "CancellationException";
            0fH.A0r(str, str2, e);
            return A0d.booleanValue();
        } catch (ExecutionException e2) {
            e = e2;
            str = "ZeroCmsConditionalWorker";
            str2 = "ExecutionException";
            0fH.A0r(str, str2, e);
            return A0d.booleanValue();
        } catch (Exception e3) {
            e = e3;
            str = "ZeroCmsConditionalWorker";
            str2 = "Error";
            0fH.A0r(str, str2, e);
            return A0d.booleanValue();
        }
        return A0d.booleanValue();
    }
}
