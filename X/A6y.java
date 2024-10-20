package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A6y.class */
public final class A6y implements 4kV {
    public final /* synthetic */ 87E A00;

    public A6y(87E r302) {
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void C9B(Object obj) {
        4kO r0;
        4kN r02 = (4kN) obj;
        87E r03 = this.A00;
        C07674kd c07674kd = (r02 == null || (r0 = r02.A00) == null) ? null : (C07674kd) r0.A03;
        r03.A01 = c07674kd;
        if (c07674kd != null) {
            1qX r04 = c07674kd.A09;
            ThreadKey threadKey = r03.A06;
            if (!threadKey.A1A()) {
                ((C6qk) 1Br.A0B(r03.A04)).A00(Long.valueOf(threadKey.A04)).addResultCallback(4YV.A11(r03.A05), A1d.A00(r03, 37));
                return;
            }
            Long nullableLong = r04.mResultSet.getNullableLong(0, 63);
            if (nullableLong == null) {
                nullableLong = 0L;
            }
            long longValue = nullableLong.longValue();
            if (longValue > 0 && 87E.A01(r03)) {
                r03.A00 = (int) longValue;
                87E.A00(r03);
                return;
            }
        }
        r03.A05(null);
    }
}
