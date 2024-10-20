package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.communitymessaging.plugins.adminactions.mutedmemberbanner.MutedMemberBannerImplementation;
import com.facebook.messaging.messageexpiration.plugins.ebrestoremewarningbanner.EbRestoreMeWarningBanner;
import com.facebook.messaging.messageexpiration.plugins.lowdiskspacebanner.LowDiskSpaceBanner;

/* renamed from: X.9za, reason: invalid class name */
/* loaded from: 9za.class */
public final class C9za implements AaA {
    public final int A00;
    public final Object A01;

    public C9za(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BuC(View view) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                EbRestoreMeWarningBanner ebRestoreMeWarningBanner = ((C8c6) this.A01).A00.A00;
                C00i c00i = ebRestoreMeWarningBanner.A04.A00;
                ((C2cw) c00i.get()).A02(0S2.A06, 0S2.A0G);
                ((C2cw) c00i.get()).A05("ME_RESTORE_BANNER_DISMISSED");
                ((C2cw) c00i.get()).A01();
                ebRestoreMeWarningBanner.A05.Bks("MESSAGE_EXPIRATION_WARNING_EB_RESTORE_BANNER");
                ((5Nt) 1Br.A0B(ebRestoreMeWarningBanner.A03)).A04(false);
                return;
            case 2:
                LowDiskSpaceBanner lowDiskSpaceBanner = ((C8c7) this.A01).A00.A00;
                lowDiskSpaceBanner.A05.Bks(1BJ.A00(792));
                ((C2cv) 1Br.A0B(lowDiskSpaceBanner.A03)).A02(false);
                return;
            default:
                ((8bF) this.A01).A00.BpM();
                return;
        }
    }

    public void CDo(View view) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                EbRestoreMeWarningBanner ebRestoreMeWarningBanner = ((C8c6) this.A01).A00.A00;
                C00i c00i = ebRestoreMeWarningBanner.A04.A00;
                ((C2cw) c00i.get()).A02(0S2.A06, 0S2.A0G);
                ((C2cw) c00i.get()).A05("ME_RESTORE_BANNER_CTA_CLICKED");
                ((C2cw) c00i.get()).A01();
                1Bn.A0A(67874);
                CAV.A00(ebRestoreMeWarningBanner.A00, "fb-messenger-secure://encrypted_backup/restore?source=ME_RESTORE_BANNER");
                ebRestoreMeWarningBanner.A05.Bks("MESSAGE_EXPIRATION_WARNING_EB_RESTORE_BANNER");
                ((5Nt) 1Br.A0B(ebRestoreMeWarningBanner.A03)).A04(false);
                return;
            case 2:
                LowDiskSpaceBanner lowDiskSpaceBanner = ((C8c7) this.A01).A00.A00;
                Context context = lowDiskSpaceBanner.A00;
                7zT.A12(context, 9C6.A00(context, (C96q) null, false), lowDiskSpaceBanner.A04);
                return;
            default:
                ((8bF) this.A01).A00.CDp();
                return;
        }
    }

    public void CJh(View view) {
        if (this.A00 == 0) {
            1Bn.A0A(83103);
            CAC.A00(((MutedMemberBannerImplementation) this.A01).A02);
        }
    }
}
