package X;

import android.text.TextUtils;
import java.util.Random;

/* renamed from: X.5qd, reason: invalid class name */
/* loaded from: 5qd.class */
public abstract class C5qd {
    public final Random A00 = new Random();

    public int A00(String str) {
        if (!(this instanceof C5qc)) {
            return 1;
        }
        C5qc c5qc = (C5qc) this;
        int i = c5qc.A00;
        if (TextUtils.isEmpty(str) || "empty".equals(str)) {
            str = "MISSING_ENDPOINT_KEY";
        }
        java.util.Map map = c5qc.A01;
        if (map.containsKey(str)) {
            i = ((Number) map.get(str)).intValue();
        }
        return i;
    }
}
