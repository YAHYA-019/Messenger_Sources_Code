package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.AdCallToAction;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.montageads.models.MontageAdsMediaInfo;
import com.facebook.messaging.business.montageads.models.SingleMontageAd;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: Evv.class */
public final class Evv {
    public final /* synthetic */ C2398Gc0 A00;

    public Evv(C2398Gc0 c2398Gc0) {
        this.A00 = c2398Gc0;
    }

    public void A00(3TI r302, Integer num, Integer num2, String str) {
        HGD hgd;
        String str2;
        3TI r306 = r302;
        C2398Gc0 c2398Gc0 = this.A00;
        EqN eqN = c2398Gc0.A0I;
        if (eqN != null) {
            SingleMontageAd singleMontageAd = c2398Gc0.A0J;
            int i = c2398Gc0.A00;
            11T.A0F(singleMontageAd, 0);
            ImmutableList immutableList = singleMontageAd.A04;
            AdCallToAction adCallToAction = ((MontageAdsMediaInfo) immutableList.get(i)).A03;
            if (adCallToAction != null) {
                F9F f9f = (F9F) 1Br.A0B(eqN.A04);
                String str3 = singleMontageAd.A08;
                String valueOf = String.valueOf(((CallToAction) adCallToAction).A00);
                int i2 = singleMontageAd.A00;
                String str4 = ((MontageAdsMediaInfo) immutableList.get(i)).A06;
                if (r302 == null) {
                    AbR abR = f9f.A00;
                    f9f.A06.get();
                    Context A01 = FbInjector.A01();
                    AbL.A0y(abR);
                    try {
                        3IW r0 = new 3IW((Ebh) 4YU.A0m(99707));
                        1Bn.A0K();
                        FbInjector.A04(A01);
                        C03353xs A00 = F6z.A00(str3);
                        r306 = new 3TI(r0, (3TI) null, A00, "LCF");
                        r306.A05(A00);
                    } catch (Throwable th) {
                        1Bn.A0K();
                        FbInjector.A04(A01);
                        throw th;
                    }
                }
                int i3 = 321;
                if ("cta_click".equals(str)) {
                    i3 = 86;
                }
                3G0.A00(r306, i3, -2);
                if (valueOf != null) {
                    try {
                        if ("fbrpc".equals(C0A2.A03(valueOf).getScheme())) {
                            ((C3Nv) f9f.A01.get()).A00(r306);
                        }
                    } catch (Exception unused) {
                    }
                }
                C3Nv c3Nv = (C3Nv) f9f.A01.get();
                if (r306 != null && r306.A03 != null && r306.A00 != null) {
                    String A002 = C2w2.A00();
                    ((C2w2) c3Nv.A00.get()).A0C(valueOf);
                    3TI.A00(r306, valueOf, "message_montage_ads", valueOf, A002);
                    ((FFC) c3Nv.A01.get()).A02(r306, AnonymousClass002.A0H(System.currentTimeMillis()));
                }
                1UG A0A = AbG.A0A(1ZG.A02, 1BK.A07(f9f.A04), 1BJ.A00(1757));
                if (A0A.isSampled()) {
                    A0A.A7R("client_token", str3);
                    A0A.A7R(GOm.A00(12), str);
                    A0A.A7R("tap_context", num2.intValue() != 0 ? "business_profile" : "story_ads");
                    switch (num.intValue()) {
                        case 0:
                            str2 = "background";
                            break;
                        case 1:
                            str2 = "caption";
                            break;
                        case 2:
                            str2 = "cta_button";
                            break;
                        case 3:
                            str2 = "ctm_reply";
                            break;
                        case 4:
                            str2 = "profile_picture";
                            break;
                        default:
                            str2 = "title";
                            break;
                    }
                    A0A.A7R("tap_surface", str2);
                    A0A.A6H("ad_position", 1BK.A0l(i2));
                    A0A.A7R("item_id", str4);
                    A0A.BZL();
                }
                if (singleMontageAd.A05.contains("MESSENGER_DESTINATION") && (hgd = eqN.A06) != null) {
                    ((CH0) eqN.A01.get()).A01(1Br.A03(eqN.A05), singleMontageAd.A0A, singleMontageAd.A0B, str3, i, false, false);
                    hgd.A03();
                    return;
                }
                4iI r02 = (4iI) eqN.A02.get();
                String str5 = singleMontageAd.A0B;
                11T.A0A(str5);
                ThreadKey A02 = r02.A02(Long.parseLong(str5));
                CFh cFh = new CFh();
                cFh.A01 = eqN.A00;
                cFh.A05 = A02;
                cFh.A02 = BMF.A0S;
                ((COy) eqN.A07.get()).A03(new CallToActionContextParams(cFh), adCallToAction);
            }
        }
    }

    public void A01(Integer num) {
        C2398Gc0 c2398Gc0 = this.A00;
        if (c2398Gc0.A0N && c2398Gc0.A00 < DKC.A06(c2398Gc0.A0J.A04)) {
            c2398Gc0.A00++;
            c2398Gc0.A1X();
        } else if (num == 0S2.A00) {
            c2398Gc0.BrH();
        } else {
            c2398Gc0.A0L.A00();
        }
    }
}
