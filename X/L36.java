package X;

import android.content.Intent;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;

/* loaded from: L36.class */
public final class L36 {
    public static int A03;
    public static L36 A04;
    public static String A05;
    public MKr A00;
    public DqK A01;
    public final Kin A02 = new Kin();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.MKr, java.lang.Object] */
    public L36(Intent intent) {
        LU8 lu9;
        this.A00 = new Object();
        Integer num = 0S2.A00;
        this.A01 = new DqK(num, num, (Long) null, (String) null, (String) null, (String) null, (String) null);
        IabCommonTrait iabCommonTrait = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
        if (iabCommonTrait == null || !(iabCommonTrait instanceof IABAdsContext)) {
            return;
        }
        IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = ((IABAdsContext) iabCommonTrait).A00;
        if (iABAdsBwIntegrationExtension == null) {
            LCd.A05("BwIContext", "Null BwI Extension!", new Object[0]);
            return;
        }
        Integer num2 = iABAdsBwIntegrationExtension.A01;
        if (num2 == num || num2 == 0S2.A0C) {
            return;
        }
        this.A01 = new DqK(iABAdsBwIntegrationExtension);
        Kin kin = this.A02;
        long intValue = iABAdsBwIntegrationExtension.A00 != null ? r0.intValue() : 0L;
        kin.A02 = iABAdsBwIntegrationExtension.A04;
        kin.A00 = intValue;
        Integer num3 = 0S2.A0N;
        kin.A01 = num3;
        LCd.A03("BwIAccessToken", AnonymousClass001.A0h(AnonymousClass001.A0n("Extracted token from ad with ttl "), intValue), new Object[0]);
        Object obj = this.A01.A03;
        if (obj != num3) {
            Integer num4 = 0S2.A01;
            lu9 = (num2 == num4 && obj == num4) ? new LU9(intent) : lu9;
            LCd.A03("BwIContext", AnonymousClass001.A0Z(iABAdsBwIntegrationExtension, "Recharged with ", AnonymousClass001.A0k()), new Object[0]);
        }
        lu9 = new LU8(intent);
        this.A00 = (MKr) lu9;
        LCd.A03("BwIContext", AnonymousClass001.A0Z(iABAdsBwIntegrationExtension, "Recharged with ", AnonymousClass001.A0k()), new Object[0]);
    }

    public static final L36 A00(Intent intent) {
        11T.A0F(intent, 0);
        L36 l36 = A04;
        if (l36 == null) {
            A03 = LCd.A00(intent, "BwIContext");
            l36 = new L36(intent);
        }
        if (A03 != intent.hashCode() && A04 != null) {
            A03 = LCd.A00(intent, "BwIContext");
            l36 = new L36(intent);
        }
        if (!11T.A0O(A04, l36)) {
            A04 = l36;
        }
        return l36;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (A02() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.DqK r0 = r0.A01
            java.lang.Object r0 = r0.A01
            r302 = r0
            java.lang.Integer r0 = X.0S2.A0N
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1f
            r0 = r301
            boolean r0 = r0.A02()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L1f:
            r0 = 1
            r305 = r0
        L22:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L36.A01():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A01.A01 != X.0S2.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02() {
        /*
            r301 = this;
            r0 = r301
            X.MKr r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = r0.BR0()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L27
            r0 = r301
            X.DqK r0 = r0.A01
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.A01
            r304 = r0
            java.lang.Integer r0 = X.0S2.A01
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L2b
        L27:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L2b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L36.A02():boolean");
    }
}
