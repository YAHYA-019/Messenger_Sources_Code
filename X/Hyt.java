package X;

import com.facebook.acra.util.StatFsUtil;
import com.facebook.common.network.FbNetworkManager;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: Hyt.class */
public final class Hyt {
    public final FbNetworkManager A00 = (FbNetworkManager) 1Bi.A03(16687);
    public final C00i A01 = 1BQ.A02(116161);
    public final IAW A03 = (IAW) 1Bi.A03(116133);
    public final C00i A02 = 1BQ.A00();

    public static boolean A00(Hyt hyt, long j) {
        Object obj;
        C00i c00i = hyt.A02;
        long Auy = 1BK.A0N(c00i).Auy(36592670390944674L) * StatFsUtil.IN_MEGA_BYTE;
        if (j > Auy) {
            HaM A02 = hyt.A03.A02();
            Integer num = A02.A01;
            HAV hav = A02.A00;
            boolean equals = num.equals(0S2.A0C);
            String name = hav.name();
            switch (num.intValue()) {
                case 0:
                    obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                    break;
                case 1:
                    obj = "LOW";
                    break;
                default:
                    obj = "HIGH";
                    break;
            }
            0fH.A0a(name, obj, Double.valueOf(j / 1048576.0d), 4YT.A00(561), "Checking if we can ignore transcode failure. NetworkQuality = %s, NetworkQualityConfidence=%s, OriginalSizeMB = %f");
            if (equals) {
                if (!hyt.A00.A0L()) {
                    Auy = 26214400;
                }
                int ordinal = hav.ordinal();
                if ((ordinal == 5 || ordinal == 4) && j <= Auy) {
                    return true;
                }
            }
            long Auy2 = 1BK.A0N(c00i).Auy(36592223720309271L) * StatFsUtil.IN_MEGA_BYTE;
            if (!hyt.A00.A0K() || j > Auy2) {
                return false;
            }
        }
        return true;
    }
}
