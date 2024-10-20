package X;

import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadata;

/* renamed from: X.3Zi, reason: invalid class name */
/* loaded from: 3Zi.class */
public final class C3Zi implements 7yV {
    public final AnonymousClass207 A00 = 7fC.A04;

    public /* bridge */ /* synthetic */ C7xu A4r(InterfaceC07874l5 interfaceC07874l5) {
        MYZ myz;
        MYa mYa;
        Double d;
        Integer num;
        Double d2;
        39Q marketplaceTrustSignalData;
        39Q marketplaceTrustSignalData2;
        ThreadMetadata AxP = interfaceC07874l5.AxP();
        Integer num2 = null;
        if (AxP == null || (marketplaceTrustSignalData2 = AxP.getMarketplaceTrustSignalData()) == null) {
            myz = null;
        } else {
            C23s A04 = marketplaceTrustSignalData2.A04(MYb.class, "ratings");
            myz = A04 != null ? A04.A03(MYZ.class) : null;
        }
        ThreadMetadata AxP2 = interfaceC07874l5.AxP();
        if (AxP2 == null || (marketplaceTrustSignalData = AxP2.getMarketplaceTrustSignalData()) == null) {
            mYa = null;
        } else {
            C23s A05 = marketplaceTrustSignalData.A05(MYc.class, "responsiveness", 1);
            mYa = A05 != null ? A05.A03(MYa.class) : null;
        }
        AnonymousClass207 anonymousClass207 = 7fC.A04;
        if (myz != null) {
            d = Double.valueOf(myz.A01("rating_average", 0));
            num = Integer.valueOf(myz.A02(1, "rating_count"));
        } else {
            d = null;
            num = null;
        }
        if (mYa != null) {
            d2 = Double.valueOf(mYa.A01("buyer_response_rate", 1));
            num2 = Integer.valueOf(mYa.A02(2, "buyer_responsiveness_level"));
        } else {
            d2 = null;
        }
        return new 7fC(d, d2, num, num2);
    }

    public AnonymousClass207 Asi() {
        return this.A00;
    }
}
