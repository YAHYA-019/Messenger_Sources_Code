package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import com.facebook.inject.FbInjector;
import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.5jd, reason: invalid class name */
/* loaded from: 5jd.class */
public final class C5jd extends AbstractC07504k2 {
    public final 1Br A00;
    public final 1Br A01;
    public final C5jf A02;
    public final C5jg A03;
    public final C5je A04;
    public final java.util.Map A05;
    public final C01i A06;
    public final 3oV A07;

    public C5jd(C5je c5je) {
        11T.A0F(c5je, 1);
        this.A04 = c5je;
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A01 = 1Bu.A01(A00, 392);
        this.A07 = (3oV) 1Bi.A03(Constants.LOAD_RESULT_PGO);
        this.A00 = 1Bq.A00(99390);
        java.util.Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        11T.A0A(synchronizedMap);
        this.A05 = synchronizedMap;
        this.A02 = new C5jf(this);
        this.A03 = new C5jg(this);
        this.A06 = C01g.A01(new C82x(this, 34));
    }
}
