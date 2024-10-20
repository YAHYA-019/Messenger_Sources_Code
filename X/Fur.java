package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Fur.class */
public final class Fur implements GKt, C00g {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;
    public final S4i A03;

    public Fur(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        1Br A0D = 1BK.A0D();
        this.A00 = A0D;
        this.A01 = 1Bq.A00(99114);
        this.A03 = new S4i(1Br.A02(A0D), (Fuq) 1Br.A0B(this.A01));
    }

    @Override // X.GKt
    public void BZT(String str, java.util.Map map) {
        11T.A0F(str, 0);
        if (map != null) {
            HashMap A1C = DKC.A1C(map);
            Object obj = map.get("logger_data");
            if (obj == null) {
                throw 1BK.A0h();
            }
            R2q.A00((Throwable) map.get("throwable"), A1C);
            2DM A0f = 4YU.A0f();
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                boolean z = A0z.getValue() instanceof Integer;
                String A0j = AnonymousClass001.A0j(A0z);
                Object value = A0z.getValue();
                if (z) {
                    A0f.A0f((Integer) value, A0j);
                } else {
                    A0f.A0o(A0j, 4YV.A0u(value));
                }
            }
            String A02 = 11T.A02(A0f);
            if (!TextUtils.isEmpty(A02)) {
                A1C.put("paymod_extra_data", A02);
            }
            A1C.put("logger_data", obj);
            this.A03.BZT(str, Collections.unmodifiableMap(A1C));
        }
    }

    @Override // X.C00g
    public Context getContext() {
        return this.A02;
    }
}
