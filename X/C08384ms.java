package X;

import com.facebook.inject.FbInjector;
import com.facebook.jsi.module.JsiHeapInfo;

/* renamed from: X.4ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ms.class */
public final class C08384ms {
    public static final String[] A0D = {"videoplayer", "browser"};
    public final C00i A06 = new 1BQ(116355);
    public final C00i A01 = new 1BQ(16944);
    public final C00i A0B = new 1BQ(17132);
    public final C00i A05 = new 1BQ(32898);
    public final C00i A0A = new 1BQ(49252);
    public final C00i A03 = new 1BQ(67911);
    public final C00i A02 = FbInjector.A00;
    public final C00i A09 = new 1BQ(67292);
    public final C00i A07 = new 1BQ(116354);
    public final C00i A04 = new 1BQ(98487);
    public final C00i A00 = new 1BQ(16616);
    public final C00i A0C = new 1BQ(67691);
    public final C00i A08 = new 1BQ(16385);

    public static void A00(C08384ms c08384ms, 2DM r302, String str, String str2) {
        JsiHeapInfo A00 = ((C3No) c08384ms.A0C.get()).A00();
        long stat = A00.getStat(1BJ.A00(940), str2);
        if (stat > 0) {
            r302.A0j(0Pz.A0W(str, "allocated"), stat);
        }
        long stat2 = A00.getStat("heapSize", str2) + A00.getStat("blockBytes", str2);
        if (stat2 > 0) {
            r302.A0j(0Pz.A0W(str, "size"), stat2);
        }
        long stat3 = A00.getStat("numCollections", str2);
        if (stat3 > 0) {
            r302.A0j(0Pz.A0W(str, "collections"), stat3);
        }
        long stat4 = A00.getStat("totalAllocatedBytes", str2);
        if (stat4 > 0) {
            r302.A0j(0Pz.A0W(str, "total_allocated_bytes"), stat4);
        }
        long stat5 = A00.getStat(1BJ.A00(1534), str2) + A00.getStat("mallocBytes", str2);
        if (stat5 > 0) {
            r302.A0j(0Pz.A0W(str, "malloc_size"), stat5);
        }
        long stat6 = A00.getStat("va", str2);
        if (stat6 > 0) {
            r302.A0j(0Pz.A0W(str, "va"), stat6);
        }
        String[] strArr = JsiHeapInfo.COMMON_STATS;
        int i = 0;
        do {
            String str3 = strArr[i];
            long stat7 = A00.getStat(str3, str2);
            if (stat7 != 0) {
                r302.A0j(0Pz.A0W(str, str3), stat7);
            }
            i++;
        } while (i < 15);
    }
}
