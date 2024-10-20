package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.List;
import java.util.Set;

/* loaded from: L8l.class */
public final class L8l {
    public KmX A00;
    public KmX A01;
    public KmX A02;
    public C3032Jgv A03;
    public LoggingContext A04;
    public C3029Jgs A05;
    public FJC A06;
    public Set A07;
    public final MediatorLiveData A08 = new MediatorLiveData();
    public final MediatorLiveData A09;
    public final MutableLiveData A0A;
    public final Observer A0B;
    public final Observer A0C;

    public L8l() {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        JQz.A1A(mediatorLiveData, (Object) null);
        this.A09 = mediatorLiveData;
        this.A0A = JQx.A0a();
        this.A06 = FJC.A03((Object) null);
        this.A0C = LR9.A01(this, 1);
        this.A0B = LR9.A01(this, 0);
    }

    public static final void A00(L8l l8l) {
        KmX kmX = l8l.A01;
        if (kmX == null) {
            KmX kmX2 = l8l.A02;
            if (kmX2 == null) {
                11T.A0L("uiState");
                throw 0Q8.createAndThrow();
            }
            ShippingAddress shippingAddress = kmX2.A01;
            ShippingAddress shippingAddress2 = kmX2.A00;
            String str = kmX2.A0A;
            List list = kmX2.A0C;
            String str2 = kmX2.A07;
            java.util.Map map = kmX2.A0D;
            List list2 = kmX2.A0B;
            String str3 = kmX2.A06;
            String str4 = kmX2.A09;
            String str5 = kmX2.A04;
            kmX = new KmX(kmX2.A0E, shippingAddress, shippingAddress2, kmX2.A02, str, str2, kmX2.A0F, kmX2.A0G, str3, str4, str5, kmX2.A08, kmX2.A05, kmX2.A03, list, list2, map);
        }
        l8l.A01 = kmX;
        if (11T.A0O(kmX.A02, true)) {
            l8l.A0A.setValue(true);
        }
        A01(l8l, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (X.FJC.A0B(r301.A06) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.L8l r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L8l.A01(X.L8l, boolean):void");
    }

    public final void A02(LiveData liveData) {
        Observer observer = this.A0B;
        if (observer != null) {
            this.A08.addSource(liveData, observer);
        }
    }

    public final void A03(C3032Jgv c3032Jgv, LoggingContext loggingContext, C3029Jgs c3029Jgs, String str, String str2, List list, Set set) {
        List list2 = list;
        this.A07 = set;
        this.A04 = loggingContext;
        this.A05 = c3029Jgs;
        this.A03 = c3032Jgv;
        if (list == null) {
            list2 = C0ty.A00;
        }
        List A03 = L9M.A03(c3032Jgv.A0C);
        if (A03 == null) {
            A03 = C0ty.A00;
        }
        this.A02 = new KmX(loggingContext, null, null, null, null, null, str, str2, null, null, null, null, null, null, list2, A03, 04R.A0G());
    }

    public final void A04(String str) {
        KmX kmX = this.A02;
        if (kmX != null) {
            String str2 = kmX.A0F;
            String str3 = kmX.A0G;
            LoggingContext loggingContext = this.A04;
            if (loggingContext == null) {
                11T.A0L("loggingContext");
                throw 0Q8.createAndThrow();
            }
            List list = kmX.A0C;
            List list2 = kmX.A0B;
            this.A02 = new KmX(loggingContext, kmX.A01, null, kmX.A02, kmX.A0A, null, str, str3, null, null, null, kmX.A08, kmX.A05, null, list, list2, 04R.A0G());
            if (str2 == null) {
                A00(this);
            }
        }
    }
}
