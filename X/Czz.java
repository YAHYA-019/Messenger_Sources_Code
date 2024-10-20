package X;

import com.facebook.common.util.JSONUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Czz.class */
public final class Czz implements DHn {
    public final /* synthetic */ BwA A00;

    public Czz(BwA bwA) {
        this.A00 = bwA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if ((r302 instanceof X.2DM) == false) goto L8;
     */
    @Override // X.DHn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSM(X.24X r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L18
            r0 = r302
            boolean r0 = r0.A0W()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L18
            r0 = r302
            boolean r0 = r0 instanceof X.2DM
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1a
        L18:
            r0 = 0
            r303 = r0
        L1a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czz.BSM(X.24X):boolean");
    }

    @Override // X.DHn
    public /* bridge */ /* synthetic */ Object CZK(24X r302) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0N = r302.A0N();
        while (A0N.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0N);
            String A0j = AnonymousClass001.A0j(A0z);
            int A02 = JSONUtil.A02(((24X) A0z.getValue()).A0D("result_type"), -1);
            float A01 = JSONUtil.A01(((24X) A0z.getValue()).A0D("score"), -1.0f);
            if (A02 != -1 && A01 != -1.0f) {
                A0s.add(new RLU(A0j, A02, A01));
            }
        }
        return A0s;
    }
}
