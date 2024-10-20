package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.90s, reason: invalid class name */
/* loaded from: 90s.class */
public final class C90s extends 2Lg {
    public 1BY A00;
    public final 1EZ A01 = (1EZ) 1Bn.A0B(16428);

    public C90s(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        return ((2Kq) 1Lo.A04((Context) null, 1Fw.A04(this.A01), this.A00, 65959)).A06();
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        if (obj != null) {
            r302.AxQ().A06("attribution_id_v2_at_start", obj);
        }
        if (obj2 != null) {
            if (obj == null) {
                r302.AxQ().A06("attribution_id_v2_at_start", obj2);
            }
            r302.AxQ().A06("attribution_id_v2_at_stop", obj2);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "navigation_data";
    }

    public int B5R() {
        return 50;
    }

    public Class BBP() {
        return String.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
