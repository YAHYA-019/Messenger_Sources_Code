package X;

import com.facebook.attribution.AttributionStateSerializer;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.526, reason: invalid class name */
/* loaded from: 526.class */
public final class AnonymousClass526 {
    public int A00;
    public final C00i A01 = new 1BQ(83303);
    public final C00i A07 = new 1BQ(84633);
    public final C00i A03 = new 1BQ(99390);
    public final C00i A06 = new 1BQ(16385);
    public final C00i A05 = new 1BQ(16634);
    public final C00i A04 = new 1BQ(16617);
    public final C00i A08 = new 1BQ(33032);
    public final C00i A02 = new 1BQ(66346);

    public static void A00(AnonymousClass526 anonymousClass526, Exception exc, String str, int i) {
        if (A01(anonymousClass526, i)) {
            1UG A00 = 1UD.A00(1BK.A07(anonymousClass526.A05), 1ZG.A02, "ads_tracking_status");
            if (A00.isSampled()) {
                if (exc != null) {
                    str = AnonymousClass001.A0Z(exc, " ", AnonymousClass001.A0n(str));
                }
                A00.A5q(TraceFieldType.ErrorCode, Integer.valueOf(i));
                A00.A7R("error", str);
                A00.BZL();
                AttributionStateSerializer attributionStateSerializer = (AttributionStateSerializer) anonymousClass526.A02.get();
                long A08 = 1BL.A08(anonymousClass526.A03);
                1Ql A0V = 1BL.A0V(attributionStateSerializer.A00);
                A0V.CaH(AttributionStateSerializer.A00(0Pz.A0T("ErrorCode", i)), A08);
                A0V.commit();
            }
        }
    }

    public static boolean A01(AnonymousClass526 anonymousClass526, int i) {
        long j = -1;
        long Av1 = 1BK.A0R(((AttributionStateSerializer) anonymousClass526.A02.get()).A00).Av1(AttributionStateSerializer.A00(0Pz.A0T("ErrorCode", i)), j);
        if (Av1 == j || Long.valueOf(Av1) == null) {
            return true;
        }
        return AnonymousClass001.A1P((1BL.A08(anonymousClass526.A03) > (Av1 + (anonymousClass526.A00 * 3600000)) ? 1 : (1BL.A08(anonymousClass526.A03) == (Av1 + (anonymousClass526.A00 * 3600000)) ? 0 : -1)));
    }
}
