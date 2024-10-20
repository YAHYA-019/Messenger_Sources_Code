package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jgu, reason: case insensitive filesystem */
/* loaded from: Jgu.class */
public final class C3031Jgu extends ViewModel {
    public AuthScreenStyle A00;
    public RTy A01;
    public final LiveData A02;
    public final MediatorLiveData A03;
    public final MediatorLiveData A04;
    public final Observer A07;
    public final Observer A08;
    public final Observer A09;
    public final C3029Jgs A0A;
    public final List A0B;
    public final C3032Jgv A0C;
    public final MutableLiveData A06 = JQx.A0a();
    public final MediatorLiveData A05 = new MediatorLiveData();

    public C3031Jgu(C3032Jgv c3032Jgv, C3029Jgs c3029Jgs) {
        this.A0A = c3029Jgs;
        this.A0C = c3032Jgv;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(1BK.A0d());
        this.A04 = mediatorLiveData;
        MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        this.A03 = mediatorLiveData2;
        this.A02 = mediatorLiveData2;
        this.A0B = AnonymousClass001.A0s();
        this.A08 = LR9.A01(this, 15);
        this.A07 = LR9.A01(this, 14);
        this.A09 = LR9.A01(this, 16);
    }

    public static final void A00(KmG kmG, C3031Jgu c3031Jgu) {
        if (A02(kmG, c3031Jgu)) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        RTy rTy = c3031Jgu.A01;
        if (rTy != null) {
            A0s.addAll(rTy.A01);
            PaymentMethod paymentMethod = kmG.A03;
            A0s.add(new RU6(11T.A03(new EzS((Raw) null, (String) null, paymentMethod.Aez(), (String) null, (String) null, paymentMethod.BG6(), "CSC", (String) null, (String) null, (String) null)), 1, false));
            RTy rTy2 = c3031Jgu.A01;
            if (rTy2 != null) {
                c3031Jgu.A01 = new RTy(A0s, rTy2.A00 + 1);
                return;
            }
        }
        11T.A0L("authFactorRequirement");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r303 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C3031Jgu r301) {
        /*
            r0 = r301
            java.util.List r0 = r0.A0B
            r302 = r0
            r0 = r302
            java.util.Iterator r0 = r0.iterator()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = 1
            r305 = r0
        L11:
            r0 = r303
            boolean r0 = r0.hasNext()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5c
            r0 = r303
            java.lang.Object r0 = r0.next()
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            r302 = r0
            r0 = r302
            X.FJC r0 = X.JQz.A0X(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L56
            r0 = r307
            boolean r0 = X.FJC.A0B(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L44
            r0 = 0
            r304 = r0
            goto L11
        L44:
            r0 = r307
            boolean r0 = X.FJC.A0A(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L11
            r0 = 0
            r305 = r0
            goto L11
        L56:
            java.lang.String r0 = "Empty components value found"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L5c:
            r0 = r301
            androidx.lifecycle.MutableLiveData r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            com.facebookpay.common.models.CurrencyAmount r0 = (com.facebookpay.common.models.CurrencyAmount) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto Lc2
            r0 = r302
            java.lang.String r0 = r0.A00
            r307 = r0
            r0 = r302
            java.lang.String r0 = r0.A01
            r302 = r0
            X.F5F r0 = new X.F5F
            r303 = r0
            r0 = r303
            r1 = r307
            r2 = r302
            r0.<init>(r1, r2)
        L81:
            r0 = r301
            androidx.lifecycle.MediatorLiveData r0 = r0.A05
            r307 = r0
            r0 = r304
            if (r0 == 0) goto La9
            r0 = r303
            if (r0 == 0) goto Lad
            r0 = r305
            if (r0 != 0) goto La1
            r0 = r303
            r1 = 0
            X.FJC r0 = X.FJC.A05(r0, r1)
            r302 = r0
        L9a:
            r0 = r307
            r1 = r302
            r0.setValue(r1)
            return
        La1:
            r0 = r303
            X.FJC r0 = X.FJC.A04(r0)
            r302 = r0
            goto L9a
        La9:
            r0 = r303
            if (r0 != 0) goto Lba
        Lad:
            java.lang.String r0 = ""
            r302 = r0
            X.F5F r0 = new X.F5F
            r303 = r0
            r0 = r303
            r1 = r302
            r2 = r302
            r0.<init>(r1, r2)
        Lba:
            r0 = r303
            X.FJC r0 = X.FJC.A03(r0)
            r302 = r0
            goto L9a
        Lc2:
            r0 = 0
            r303 = r0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3031Jgu.A01(X.Jgu):void");
    }

    public static final boolean A02(KmG kmG, C3031Jgu c3031Jgu) {
        RTy rTy = c3031Jgu.A01;
        if (rTy != null) {
            Iterator it = rTy.A01.iterator();
            while (it.hasNext()) {
                List<EzS> list = ((RU6) it.next()).A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (EzS ezS : list) {
                        if (11T.A0O(ezS.A00, "CSC")) {
                            String str = ezS.A02;
                            PaymentMethod paymentMethod = kmG.A03;
                            if (11T.A0O(str, paymentMethod.Aez()) && 11T.A0O(ezS.A06, paymentMethod.BG6())) {
                                return true;
                            }
                        }
                    }
                }
            }
            ArrayList A0s = AnonymousClass001.A0s();
            RTy rTy2 = c3031Jgu.A01;
            if (rTy2 != null) {
                int i = rTy2.A00;
                for (RU6 ru6 : rTy2.A01) {
                    List list2 = ru6.A00;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (11T.A0O(((EzS) it2.next()).A00, "CSC")) {
                                i--;
                                break;
                            }
                        }
                    }
                    A0s.add(ru6);
                }
                c3031Jgu.A01 = new RTy(A0s, i);
                return false;
            }
        }
        11T.A0L("authFactorRequirement");
        throw 0Q8.createAndThrow();
    }
}
