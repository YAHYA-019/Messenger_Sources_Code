package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I9V.class */
public final class I9V {
    public final long A00;
    public final long A01;
    public final TimeUnit A02;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r303 < r305) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I9V(java.util.concurrent.TimeUnit r302, long r303, long r305) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = 0
            r307 = r0
            r0 = r303
            r309 = r0
            r0 = r303
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = r305
            r312 = r0
            r0 = r311
            if (r0 <= 0) goto L33
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = r311
            if (r0 <= 0) goto L33
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = 0
            r314 = r0
            r0 = r311
            if (r0 >= 0) goto L36
        L33:
            r0 = 1
            r314 = r0
        L36:
            java.lang.String r0 = "startTime: "
            java.lang.String r1 = " endTime: "
            r2 = r309
            r3 = r312
            java.lang.String r0 = X.0Pz.A0i(r0, r1, r2, r3)
            r315 = r0
            r0 = r314
            r1 = r315
            X.0RZ.A05(r0, r1)
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = r301
            r1 = r302
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9V.<init>(java.util.concurrent.TimeUnit, long, long):void");
    }

    public static I9V A00(JSONObject jSONObject) {
        long j = jSONObject.getLong("mStartTime");
        long j2 = jSONObject.getLong("mEndTime");
        String string = jSONObject.getString("mTimeUnit");
        TimeUnit[] values = TimeUnit.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new JSONException("invalid jsonObject for TimeRange");
            }
            TimeUnit timeUnit = values[i2];
            if (string.equals(A01(timeUnit))) {
                return new I9V(timeUnit, j, j2);
            }
            i = i2 + 1;
        }
    }

    public static String A01(TimeUnit timeUnit) {
        switch (RCi.A00[timeUnit.ordinal()]) {
            case 1:
                return "DAYS";
            case 2:
                return "HOURS";
            case 3:
                return "MINUTES";
            case 4:
                return "SECONDS";
            case 5:
                return "NANOSECONDS";
            case 6:
                return "MICROSECONDS";
            case 7:
                return "MILLISECONDS";
            default:
                return "";
        }
    }

    public long A02(TimeUnit timeUnit) {
        return timeUnit.convert(this.A00, this.A02);
    }

    public long A03(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01, this.A02);
    }

    public JSONObject A04() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("mStartTime", this.A01);
        A12.put("mEndTime", this.A00);
        A12.put("mTimeUnit", A01(this.A02));
        return A12;
    }

    public boolean A05(I9V i9v, boolean z) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (A06(timeUnit, i9v.A03(timeUnit), z)) {
            return true;
        }
        if ((A06(timeUnit, i9v.A02(timeUnit), z) && (!z || i9v.A02(timeUnit) != A03(timeUnit))) || i9v.A06(timeUnit, A03(timeUnit), z)) {
            return true;
        }
        if (i9v.A06(timeUnit, A02(timeUnit), z)) {
            return (z && A02(timeUnit) == i9v.A03(timeUnit)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r303 >= A03(r302)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06(java.util.concurrent.TimeUnit r302, long r303, boolean r305) {
        /*
            r301 = this;
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r303
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 < 0) goto L62
            r0 = r301
            r1 = r302
            long r0 = r0.A03(r1)
            r310 = r0
            r0 = r303
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r305
            if (r0 == 0) goto L65
            r0 = r309
            if (r0 < 0) goto L3a
            r0 = r301
            r1 = r302
            long r0 = r0.A02(r1)
            r310 = r0
            r0 = r303
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 < 0) goto L5f
        L3a:
            r0 = r301
            r1 = r302
            long r0 = r0.A02(r1)
            r310 = r0
            r0 = r310
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 >= 0) goto L62
            r0 = r301
            r1 = r302
            long r0 = r0.A03(r1)
            r310 = r0
            r0 = r303
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 < 0) goto L62
        L5f:
            r0 = 1
            r306 = r0
        L62:
            r0 = r306
            return r0
        L65:
            r0 = r309
            if (r0 < 0) goto L3a
            r0 = r301
            r1 = r302
            long r0 = r0.A02(r1)
            r310 = r0
            r0 = r303
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 <= 0) goto L5f
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9V.A06(java.util.concurrent.TimeUnit, long, boolean):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            I9V i9v = (I9V) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (A03(timeUnit) != i9v.A03(timeUnit) || A02(timeUnit) != i9v.A02(timeUnit)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A01), Long.valueOf(this.A00), this.A02});
    }

    public String toString() {
        try {
            return A04().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
