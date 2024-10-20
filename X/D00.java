package X;

import com.facebook.common.util.JSONUtil;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: D00.class */
public final class D00 implements DHn {
    public final /* synthetic */ Bw5 A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ String A02;

    public D00(Bw5 bw5, ImmutableList immutableList, String str) {
        this.A00 = bw5;
        this.A02 = str;
        this.A01 = immutableList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r301.A02.equals(r0.A0I()) == false) goto L10;
     */
    @Override // X.DHn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSM(X.24X r302) {
        /*
            r301 = this;
            java.lang.String r0 = "id"
            r303 = r0
            r0 = r302
            r1 = r303
            X.24X r0 = r0.A0D(r1)
            r304 = r0
            r0 = r302
            boolean r0 = r0.A0W()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3e
            r0 = r302
            boolean r0 = r0 instanceof X.2DM
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3e
            r0 = r304
            if (r0 == 0) goto L3e
            r0 = r301
            java.lang.String r0 = r0.A02
            r306 = r0
            r0 = r304
            java.lang.String r0 = r0.A0I()
            r303 = r0
            r0 = r306
            r1 = r303
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L43
        L3e:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L43:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D00.BSM(X.24X):boolean");
    }

    @Override // X.DHn
    public /* bridge */ /* synthetic */ Object CZK(24X r302) {
        RYU ryu;
        ImmutableList immutableList = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        24X A0D = r302.A0D("candidates_and_scores");
        if (A0D == null) {
            ryu = RYU.A02;
        } else {
            Iterator A0N = A0D.A0N();
            while (A0N.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0N);
                A0s.add(new BmG(AnonymousClass001.A0j(A0z), JSONUtil.A01((24X) A0z.getValue(), 0.0f)));
            }
            Collections.sort(A0s, new DAj(3));
            RYU ryu2 = RYU.A02;
            ryu = new RYU(immutableList, ImmutableList.copyOf((Collection) A0s));
        }
        return ryu;
    }
}
