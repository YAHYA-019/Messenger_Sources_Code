package X;

import com.facebook.bpf.BpfCounters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.47z, reason: invalid class name */
/* loaded from: 47z.class */
public final class C47z extends 2Lg {
    public static final 0Ia A00 = new 0Ia(0Yg.A00);

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.480] */
    public /* bridge */ /* synthetic */ Object A02() {
        0Ia r0 = A00;
        HashMap hashMap = new HashMap();
        int i = r0.A00;
        if (i > -1 && BpfCounters.A00) {
            BpfCounters.getBpfCountersImpl(hashMap, i);
        }
        ?? obj = new Object();
        obj.A00 = hashMap;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        AnonymousClass480 anonymousClass480 = (AnonymousClass480) obj;
        AnonymousClass480 anonymousClass4802 = (AnonymousClass480) obj2;
        if (anonymousClass480 != null && anonymousClass4802 != null && r302.A0D == null && 0Yg.A00.length() != 0) {
            java.util.Map map = anonymousClass480.A00;
            int size = map.size();
            String[] strArr = new String[size];
            long[] jArr = new long[size];
            Iterator A0y = AnonymousClass001.A0y(map);
            int i = 0;
            int i2 = 0;
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                strArr[i2] = A0z.getKey();
                jArr[i2] = C3o5.A08(A0z);
                i2++;
            }
            r302.AxQ().A06("bpf_field_names_start", strArr);
            r302.AxQ().A06("bpf_field_values_start", jArr);
            java.util.Map map2 = anonymousClass4802.A00;
            int size2 = map2.size();
            String[] strArr2 = new String[size2];
            long[] jArr2 = new long[size2];
            Iterator A0y2 = AnonymousClass001.A0y(map2);
            while (A0y2.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                strArr2[i] = A0z2.getKey();
                jArr2[i] = C3o5.A08(A0z2);
                i++;
            }
            r302.AxQ().A06("bpf_field_names_stop", strArr2);
            r302.AxQ().A06("bpf_field_values_stop", jArr2);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "bpf_stats";
    }

    public int B5R() {
        return 32;
    }

    public Class BBP() {
        return AnonymousClass480.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
