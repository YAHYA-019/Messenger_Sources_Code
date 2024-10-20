package X;

import android.content.Context;
import com.meta.analytics.dsp.correlation.fb.impl.FbDspCorrelationManagerImpl;
import java.util.Set;

/* renamed from: X.3j9, reason: invalid class name */
/* loaded from: 3j9.class */
public final class C3j9 implements C15h {
    public final int A00;
    public final Object A01;

    public C3j9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        1BY r306;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                1iZ r0 = (1iZ) this.A01;
                Set set = 1iZ.A0T;
                return ((1Fv) 1Br.A0B(r0.A0H)).A04().A02;
            case 1:
                i2 = 83591;
                return 1Bn.A0A(i2);
            case 2:
                i2 = 66169;
                return 1Bn.A0A(i2);
            case 3:
                i2 = 17056;
                return 1Bn.A0A(i2);
            case 4:
                return 1Bn.A0B(65841);
            case 5:
                i2 = 83594;
                return 1Bn.A0A(i2);
            case 6:
                i2 = 83431;
                return 1Bn.A0A(i2);
            case 7:
                i2 = 84631;
                return 1Bn.A0A(i2);
            case 8:
                i2 = 83595;
                return 1Bn.A0A(i2);
            case 9:
                i2 = 98824;
                return 1Bn.A0A(i2);
            case 10:
                i2 = 33058;
                return 1Bn.A0A(i2);
            case 11:
                1BY r02 = ((2fI) this.A01).A00;
                return 1Lo.A04((Context) null, 1Fw.A05(r02), r02, 49418);
            case 12:
                r306 = ((2Pg) this.A01).A03;
                i = 33058;
                return 1Bn.A0E((Context) null, r306, i);
            case 13:
                return 1Bn.A0B(83430);
            case 14:
                r306 = ((2Ph) this.A01).A00;
                i = 33058;
                return 1Bn.A0E((Context) null, r306, i);
            case 15:
                r306 = ((2Ph) this.A01).A00;
                i = 66307;
                return 1Bn.A0E((Context) null, r306, i);
            case 16:
                r306 = ((2Ph) this.A01).A00;
                i = 83430;
                return 1Bn.A0E((Context) null, r306, i);
            case 17:
                r306 = ((2Qb) this.A01).A02;
                i = 83436;
                return 1Bn.A0E((Context) null, r306, i);
            case 18:
                return 1BK.A0d();
            case 19:
                return AnonymousClass001.A0K();
            default:
                String str = ((1Od) 1Br.A0B(((FbDspCorrelationManagerImpl) this.A01).A00)).A01;
                if (str == null) {
                    str = "dummy_session_id";
                }
                return str;
        }
    }
}
