package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.140, reason: invalid class name */
/* loaded from: 140.class */
public final class AnonymousClass140 extends 0Tc implements C0lv {
    public static final int A01;
    public Random A00 = new Random();

    static {
        C0lw c0lw = TriggerRegistry.A00;
        A01 = c0lw.A02("qpl");
        c0lw.A02("sequence_qpl");
    }

    public int A01(C0ld c0ld, Object obj, long j) {
        02T r0 = (02T) A07(c0ld);
        int binarySearch = Arrays.binarySearch(r0.A00, (int) j);
        if (binarySearch < 0) {
            return -100;
        }
        C02U c02u = r0.A01[binarySearch];
        int i = c02u.A00;
        if (i == 1 || this.A00.nextInt(i) == 0) {
            return c02u.A02;
        }
        return -101;
    }

    public boolean A04() {
        return true;
    }

    public boolean A05(Object obj, Object obj2, long j, long j2) {
        boolean z = false;
        if (j == j2) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.02T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.02U, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A06(C0ld c0ld) {
        int[] traceConfigIdxs = c0ld.getTraceConfigIdxs("qpl", "start");
        ?? obj = new Object();
        int length = traceConfigIdxs.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            int i3 = traceConfigIdxs[i2];
            ?? obj2 = new Object();
            if (!c0ld.optTraceConfigParamBool(i3, "trace_config.is_cold_start", false)) {
                obj2.A02 = i3;
                obj2.A01 = c0ld.getTraceConfigTriggerParamInt(i3, "qpl", "start", "trigger.qpl.marker");
                obj2.A00 = c0ld.getTraceConfigParamInt(i3, "trace_config.coinflip_sample_rate");
                A0t.add(obj2);
            }
            i = i2 + 1;
        }
        int i4 = 0;
        C02U[] c02uArr = (C02U[]) A0t.toArray(new C02U[0]);
        ((02T) obj).A01 = c02uArr;
        Arrays.sort(c02uArr, C02U.A03);
        C02U[] c02uArr2 = ((02T) obj).A01;
        int length2 = c02uArr2.length;
        int[] iArr = new int[length2];
        ((02T) obj).A00 = iArr;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i4 >= length2) {
                return obj;
            }
            iArr[i6] = c02uArr2[i4].A01;
            i4++;
            i5 = i6 + 1;
        }
    }
}
