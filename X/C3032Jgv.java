package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.facebook.acra.constants.ActionId;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.FeaturedIncentiveDetails;
import com.facebookpay.incentives.model.IncentiveList;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jgv, reason: case insensitive filesystem */
/* loaded from: Jgv.class */
public final class C3032Jgv extends ViewModel {
    public MO1 A00;
    public ECPIncentive A01;
    public ECPIncentive A02;
    public LoggingContext A03;
    public boolean A05;
    public final MutableLiveData A07;
    public final MutableLiveData A08;
    public final MutableLiveData A09;
    public final MutableLiveData A0A;
    public final MutableLiveData A0B;
    public final MutableLiveData A0C = JQx.A0a();
    public final MutableLiveData A0D = JQx.A0a();
    public boolean A06 = true;
    public Integer A04 = 0S2.A00;

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3032Jgv() {
        MutableLiveData A0a = JQx.A0a();
        this.A0B = A0a;
        this.A0A = new LiveData(FJC.A03(new IncentiveList(C0ty.A00)));
        MutableLiveData A0a2 = JQx.A0a();
        JQz.A1A(A0a2, (Object) null);
        this.A09 = A0a2;
        this.A07 = JQx.A0a();
        this.A08 = new LiveData(FJC.A03(new FeaturedIncentiveDetails(null, null)));
        A0a.observeForever(LR9.A01(this, 9));
    }

    public static IncentiveItem A00(LiveData liveData, C3032Jgv c3032Jgv, List list) {
        return new IncentiveItem(KP0.A0e, list, L9M.A01(liveData).size(), c3032Jgv.A06);
    }

    public static final List A01(List list) {
        ECPOffsiteOffer eCPOffsiteOffer;
        ECPOnsiteOffer eCPOnsiteOffer;
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECPIncentive eCPIncentive = (ECPIncentive) it.next();
            0DA r0 = new 0DA();
            r0.A07("offer_id", eCPIncentive.getId());
            r0.A03("is_auto_applied", Boolean.valueOf(eCPIncentive.BQs()));
            KPI valueOf = KPI.valueOf(11T.A02(eCPIncentive.AqS()));
            if (valueOf == null) {
                valueOf = KPI.A01;
            }
            r0.A01(valueOf, "incentive_type");
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                r0.A07("credential_id", eCPOnsiteOffer.A01);
            }
            if ((eCPIncentive instanceof ECPOffsiteOffer) && (eCPOffsiteOffer = (ECPOffsiteOffer) eCPIncentive) != null) {
                String str = eCPOffsiteOffer.A02;
                if (str == null) {
                    str = eCPOffsiteOffer.A01;
                }
                r0.A07("offer_id", str);
                r0.A03("is_auto_applied", Boolean.valueOf(eCPOffsiteOffer.A03));
                KPI valueOf2 = KPI.valueOf(11T.A02(eCPOffsiteOffer.A00));
                if (valueOf2 == null) {
                    valueOf2 = KPI.A01;
                }
                r0.A01(valueOf2, "incentive_type");
                r0.A07("promo_code", eCPOffsiteOffer.A01);
            }
            A0z.add(r0);
        }
        return A0z;
    }

    public static final void A02(ECPIncentive eCPIncentive, C3032Jgv c3032Jgv) {
        MutableLiveData mutableLiveData = c3032Jgv.A0A;
        JQz.A19(mutableLiveData, new IncentiveList(0QD.A0P(eCPIncentive, 7zO.A10(L9M.A02(mutableLiveData), 0))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        if (r305 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.facebookpay.incentives.model.ECPIncentive] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void A03(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3032Jgv.A03(java.lang.String):java.lang.Void");
    }

    public final Void A04(String str) {
        Object obj;
        MutableLiveData mutableLiveData = this.A0A;
        Iterator it = L9M.A02(mutableLiveData).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (11T.A0O(((ECPIncentive) obj).getId(), str)) {
                break;
            }
        }
        ECPIncentive eCPIncentive = (ECPIncentive) obj;
        if (eCPIncentive == null) {
            return null;
        }
        this.A02 = eCPIncentive;
        LZv A0b = 7zU.A0b();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            11T.A0L("loggingContext");
            throw 0Q8.createAndThrow();
        }
        LZv.A03(AbF.A08(1BK.A08(A0b.A00, "client_remove_incentives_init"), ActionId.CONTROLLER_INITIATED), loggingContext, new M3s(3, loggingContext, null, A01(L9M.A02(mutableLiveData)), A01(11T.A03(eCPIncentive))));
        L9M.A00(eCPIncentive).CeO(eCPIncentive, this);
        return null;
    }

    public final List A05() {
        ECPOnsiteOffer eCPOnsiteOffer;
        List<ECPIncentive> A02 = L9M.A02(this.A0A);
        ArrayList A0z = 1BL.A0z(A02);
        for (ECPIncentive eCPIncentive : A02) {
            0DA r0 = new 0DA();
            r0.A07("code", eCPIncentive.BG6());
            r0.A07("offer_id", eCPIncentive.getId());
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                r0.A07("credential_id", eCPOnsiteOffer.A01);
            }
            A0z.add(r0);
        }
        return A0z;
    }

    public final List A06() {
        MutableLiveData mutableLiveData = this.A09;
        List<MOb> A01 = L9M.A01(mutableLiveData);
        ArrayList A0z = 1BL.A0z(A01);
        for (MOb mOb : A01) {
            MQR AAG = mOb.AAG();
            11T.A0A(AAG);
            boolean z = KXm.A00(AAG) instanceof ECPOffsiteOffer;
            MQR AAG2 = mOb.AAG();
            03Y A1G = 1BK.A1G("offer_id", z ? AAG2.B5H() : AAG2.AqR());
            03Y A1G2 = 1BK.A1G("title", mOb.AAG().BG6());
            03Y A1G3 = 1BK.A1G("description", mOb.AAG().BDT());
            03Y A1G4 = 1BK.A1G("expiration_date", mOb.AAG().Al8());
            String lowerCase = String.valueOf(mOb.AAG().AqS()).toLowerCase();
            11T.A0A(lowerCase);
            A0z.add(04R.A09(new 03Y[]{A1G, A1G2, A1G3, A1G4, 1BK.A1G("incentive_type", lowerCase)}));
        }
        for (ECPIncentive eCPIncentive : L9M.A02(this.A0A)) {
            List<MOb> A012 = L9M.A01(mutableLiveData);
            if (!(A012 instanceof Collection) || !A012.isEmpty()) {
                for (MOb mOb2 : A012) {
                    String B5H = mOb2.AAG().B5H();
                    String id = eCPIncentive.getId();
                    if (!11T.A0O(B5H, id) && !11T.A0O(mOb2.AAG().AqR(), id)) {
                    }
                }
            }
            03Y A1G5 = 1BK.A1G("offer_id", eCPIncentive.getId());
            03Y A1G6 = 1BK.A1G("title", eCPIncentive.BG6());
            03Y A1G7 = 1BK.A1G("description", "");
            03Y A1G8 = 1BK.A1G("expiration_date", "");
            String lowerCase2 = 11T.A02(KOg.PROMO_CODE).toLowerCase();
            11T.A0A(lowerCase2);
            A0z = 0QD.A0P(04R.A09(new 03Y[]{A1G5, A1G6, A1G7, A1G8, 1BK.A1G("incentive_type", lowerCase2)}), A0z);
        }
        return A0z;
    }

    public final List A07() {
        ECPOnsiteOffer eCPOnsiteOffer;
        ECPIncentive eCPIncentive = this.A01;
        if (eCPIncentive == null) {
            return C0ty.A00;
        }
        0DA r0 = new 0DA();
        r0.A07("code", eCPIncentive.BG6());
        ECPIncentive eCPIncentive2 = this.A01;
        r0.A07("offer_id", eCPIncentive2 != null ? eCPIncentive2.getId() : "");
        ECPIncentive eCPIncentive3 = this.A01;
        if ((eCPIncentive3 instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive3) != null) {
            r0.A07("credential_id", eCPOnsiteOffer.A01);
        }
        return 11T.A03(r0);
    }

    public final List A08() {
        List A02 = L9M.A02(this.A0A);
        ArrayList A0z = 1BL.A0z(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0z.add(((ECPIncentive) it.next()).getId());
        }
        return A0z;
    }

    public final void A09(L4l l4l, LoggingContext loggingContext) {
        if (this.A04 == 0S2.A00) {
            this.A04 = 0S2.A01;
            RHg rHg = C06014fk.A0A().A08;
            LZv A0b = 7zU.A0b();
            List A03 = 11T.A03(KOy.A07);
            String str = l4l.A09;
            boolean A0O = 11T.A0O(str, "PRE_WARM");
            OtcInput otcInput = l4l.A04;
            A0b.A0P(loggingContext, str, A03, JR1.A15(otcInput != null ? KwO.A00(otcInput) : null), A0O);
            l4l.A01 = 7zN.A0e("INCENTIVES");
            C06014fk.A08();
            2Jd r0 = new 2Jd(ActionId.RTMP_CONNECTION_CONNECTED);
            r0.A09(DKB.A00(43), null);
            l4l.A00 = r0;
            Transformations.map(K0G.A03(C06014fk.A0F(), Rki.A00, new LLk(l4l, rHg, 3)), new GBq(loggingContext, l4l, 14)).observeForever(LR9.A01(this, 10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f2, code lost:
    
        X.11T.A0L("loggingContext");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01fa, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A(com.facebookpay.expresscheckout.models.PromoCodeList r302) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3032Jgv.A0A(com.facebookpay.expresscheckout.models.PromoCodeList):void");
    }
}
