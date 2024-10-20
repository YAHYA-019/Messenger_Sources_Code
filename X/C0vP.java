package X;

import android.os.SystemClock;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0vP, reason: invalid class name */
/* loaded from: 0vP.class */
public final class C0vP extends 0Wn implements 0Wk {
    public int A00;
    public final long[] A01 = new long[5];

    public C0vP() {
        0Wm.A02.A00(this);
    }

    public void A02(JSONObject jSONObject, long j) {
        int i;
        try {
            long[] jArr = this.A01;
            int length = jArr.length;
            long[] jArr2 = new long[length];
            synchronized (jArr) {
                jSONObject.put("is_currently_fg", 0Wm.A02.A01.get());
                System.arraycopy(jArr, 0, jArr2, 0, length);
            }
            Arrays.sort(jArr2);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("app_status_history", jSONArray);
            for (i = 0; i < length; i++) {
                long j2 = jArr2[i];
                if (j2 != 0) {
                    jSONArray.put(j - j2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void AQk(boolean z) {
        long[] jArr = this.A01;
        synchronized (jArr) {
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            jArr[i] = SystemClock.uptimeMillis();
            this.A00 = i2 % jArr.length;
        }
    }
}
