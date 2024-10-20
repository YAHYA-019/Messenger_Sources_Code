package X;

import android.os.Process;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0v4, reason: invalid class name */
/* loaded from: 0v4.class */
public final class C0v4 extends 0Wn implements 0XB {
    public int A00 = 0;
    public 0Wh A01 = new 0Wh(Process.myPid());
    public 0Wh A02;
    public long[][] A03;
    public final boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r0.A01 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0v4() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = 0
            r0.A00 = r1
            int r0 = android.os.Process.myPid()
            r302 = r0
            X.0Wh r0 = new X.0Wh
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r301
            r1 = r303
            r0.A01 = r1
            X.0Wh r0 = new X.0Wh
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            X.0Wh r0 = r0.A01
            r303 = r0
            r0 = r303
            boolean r0 = r0.A01
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L47
            r0 = r304
            boolean r0 = r0.A01
            r302 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            if (r0 != 0) goto L4c
        L47:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L4c:
            r0 = r301
            r1 = r305
            r0.A04 = r1
            r0 = 2
            r302 = r0
            r0 = r305
            if (r0 == 0) goto L80
            r0 = 15
            r307 = r0
            r0 = 5
            r305 = r0
            r0 = r302
            int[] r0 = new int[r0]
            r304 = r0
            r0 = r304
            r1 = r306
            r2 = r305
            r0[r1] = r2
            r0 = r304
            r1 = 0
            r2 = r307
            r0[r1] = r2
        L6f:
            java.lang.Class r0 = java.lang.Long.TYPE
            r1 = r304
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            long[][] r0 = (long[][]) r0
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A03 = r1
            return
        L80:
            r0 = r302
            int[] r0 = new int[r0]
            r304 = r0
            r0 = r304
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r1 = 1
            r2 = 0
            r0[r1] = r2
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0v4.<init>():void");
    }

    private void A00() {
        long[][] jArr;
        int length;
        if (!this.A04 || (length = (jArr = this.A03).length) == 0) {
            return;
        }
        0Wh r0 = this.A01;
        r0.A00();
        0Wh r02 = this.A02;
        r02.A00();
        long[] jArr2 = jArr[this.A00];
        jArr2[0] = r0.A00;
        System.arraycopy(r0.A02, 0, jArr2, 1, 2);
        System.arraycopy(r02.A02, 0, jArr2, 3, 2);
        int i = this.A00 + 1;
        this.A00 = i;
        this.A00 = i % length;
    }

    public void A02(JSONObject jSONObject, long j) {
        long[][] jArr = this.A03;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("io_history", jSONArray);
            int i = this.A00;
            StringBuilder A0k = AnonymousClass001.A0k();
            long j2 = j - 60000;
            int i2 = i;
            do {
                int i3 = i2 + 1;
                long[] jArr2 = jArr[i2];
                long j3 = jArr2[0];
                if (j3 != 0 && j3 >= j2) {
                    A0k.append(j3);
                    int i4 = 1;
                    while (true) {
                        int i5 = i4;
                        if (i5 >= jArr2.length) {
                            break;
                        }
                        A0k.append(',');
                        A0k.append(jArr2[i5]);
                        i4 = i5 + 1;
                    }
                    jSONArray.put(A0k.toString());
                    A0k.setLength(0);
                }
                i2 = i3 % length;
            } while (i2 != i);
        } catch (Throwable unused) {
        }
    }

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (this.A04) {
            A00();
        }
    }

    public void D6O() {
        if (this.A04) {
            A00();
        }
    }

    public String getName() {
        return "io";
    }
}
