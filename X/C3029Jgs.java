package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.otc.models.OtcOptionState;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jgs, reason: case insensitive filesystem */
/* loaded from: Jgs.class */
public final class C3029Jgs extends ViewModel {
    public MutableLiveData A00;
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public final LiveData A04;
    public final LiveData A05;
    public final SavedStateHandle A06;
    public final Function1 A07;

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3029Jgs(SavedStateHandle savedStateHandle, ECPPaymentRequest eCPPaymentRequest) {
        this.A06 = savedStateHandle;
        this.A01 = eCPPaymentRequest;
        ?? liveData = new LiveData(FJC.A03((Object) null));
        this.A00 = liveData;
        this.A07 = new GAb(this, 42);
        this.A05 = Transformations.map(liveData, SJN.A00);
        this.A04 = Transformations.map(this.A00, SJM.A00);
        if (this.A01 != null) {
            A01(this);
        }
    }

    public static Ksw A00(KOy kOy, C3029Jgs c3029Jgs, String str) {
        return new Ksw(c3029Jgs.A03(kOy, true), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r310 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0.A0D.contains(X.KNL.A03) != true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C3029Jgs r301) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3029Jgs.A01(X.Jgs):void");
    }

    public final KMs A02(KOy kOy) {
        OtcOptionState otcOptionState = (OtcOptionState) this.A06.get("OTC_SESSION_STATE_KEY");
        if (otcOptionState == null) {
            return KMs.A02;
        }
        KMs kMs = (KMs) otcOptionState.A03.get(kOy);
        if (kMs == null) {
            kMs = otcOptionState.A00;
        }
        return kMs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r303 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (A07() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebookpay.otc.models.OtcInput A03(X.KOy r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            androidx.lifecycle.SavedStateHandle r0 = r0.A06
            r304 = r0
            java.lang.String r0 = "OTC_SESSION_STATE_KEY"
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            com.facebookpay.otc.models.OtcOptionState r0 = (com.facebookpay.otc.models.OtcOptionState) r0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L45
            r0 = r302
            if (r0 != 0) goto L48
            r0 = r301
            boolean r0 = r0.A07()
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L45
        L2b:
            r0 = r306
            java.lang.String r0 = r0.A01
            r304 = r0
            r0 = r306
            java.lang.String r0 = r0.A02
            r305 = r0
            com.facebookpay.otc.models.OtcInput r0 = new com.facebookpay.otc.models.OtcInput
            r307 = r0
            r0 = r307
            r1 = r304
            r2 = r305
            r0.<init>(r1, r2)
        L45:
            r0 = r307
            return r0
        L48:
            r0 = r306
            java.util.Map r0 = r0.A03
            r305 = r0
            r0 = r305
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L62
            r0 = r306
            X.KMs r0 = r0.A00
            r304 = r0
        L62:
            X.KMs r0 = X.KMs.A03
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L2b
            X.KMs r0 = X.KMs.A04
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L45
            r0 = r303
            if (r0 == 0) goto L45
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3029Jgs.A03(X.KOy, boolean):com.facebookpay.otc.models.OtcInput");
    }

    public final Kzj A04() {
        boolean A07 = A07();
        OtcOptionState otcOptionState = (OtcOptionState) this.A06.get("OTC_SESSION_STATE_KEY");
        return new Kzj(A07, otcOptionState != null ? otcOptionState.A02 : null);
    }

    public final void A05() {
        this.A06.set("OTC_SESSION_STATE_KEY", new OtcOptionState(KMs.A02, 7zR.A0s(), "CARD", 04R.A0G()));
    }

    public final boolean A06() {
        SavedStateHandle savedStateHandle = this.A06;
        OtcOptionState otcOptionState = (OtcOptionState) savedStateHandle.get("OTC_SESSION_STATE_KEY");
        if (otcOptionState == null || !otcOptionState.A04) {
            return false;
        }
        OtcOptionState otcOptionState2 = (OtcOptionState) savedStateHandle.get("OTC_SESSION_STATE_KEY");
        return 11T.A0O(otcOptionState2 != null ? otcOptionState2.A02 : null, "CARD");
    }

    public final boolean A07() {
        OtcOptionState otcOptionState = (OtcOptionState) this.A06.get("OTC_SESSION_STATE_KEY");
        return otcOptionState != null && otcOptionState.A04;
    }
}
