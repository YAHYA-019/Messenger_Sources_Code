package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jh1, reason: case insensitive filesystem */
/* loaded from: Jh1.class */
public final class C3038Jh1 extends ViewModel implements GKU {
    public static final KN0 A0N = KN0.A05;
    public SparseArray A00;
    public Ksw A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final MediatorLiveData A08;
    public final MediatorLiveData A09;
    public final MutableLiveData A0A;
    public final MutableLiveData A0B;
    public final MutableLiveData A0C;
    public final MutableLiveData A0E;
    public final Observer A0F;
    public final C3029Jgs A0G;
    public final java.util.Map A0I;
    public final java.util.Map A0J;
    public final MutableLiveData A0L;
    public final Observer A0M;
    public final LZq A0H = C06014fk.A0A().A0A;
    public final C01i A0K = C01g.A01(M2x.A00);
    public final MutableLiveData A0D = JQx.A0a();

    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3038Jh1(C3029Jgs c3029Jgs) {
        this.A0G = c3029Jgs;
        MutableLiveData A0a = JQx.A0a();
        this.A0E = A0a;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A09 = mediatorLiveData;
        this.A0B = JQx.A0a();
        this.A0L = JQx.A0a();
        this.A0A = JQx.A0a();
        this.A0I = 1BK.A1C();
        MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        JQz.A1A(mediatorLiveData2, (Object) null);
        this.A08 = mediatorLiveData2;
        this.A0C = new LiveData(A0N);
        this.A0F = LR9.A01(this, 12);
        LR9 A01 = LR9.A01(this, 13);
        this.A0M = A01;
        this.A0J = 1BK.A1C();
        this.A00 = DKC.A0E();
        mediatorLiveData2.addSource(A0a, A01);
        mediatorLiveData.addSource(A0a, A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0364, code lost:
    
        if (r302 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x035a, code lost:
    
        if (r302 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0350, code lost:
    
        if (r302 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0346, code lost:
    
        if (r302 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x033c, code lost:
    
        if (r302 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0156, code lost:
    
        if (X.7zM.A1b(r0) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x038c, code lost:
    
        if (r302 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0382, code lost:
    
        if (r302 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0378, code lost:
    
        if (r302 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x036e, code lost:
    
        if (r302 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebookpay.form.fragment.model.FormParams A00(X.C3038Jh1 r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A00(X.Jh1, boolean):com.facebookpay.form.fragment.model.FormParams");
    }

    public static final String A01(C3038Jh1 c3038Jh1) {
        Rb4 rb4;
        L07 l07;
        String str;
        L07 l072;
        MutableLiveData mutableLiveData = c3038Jh1.A0E;
        String str2 = null;
        FJC A0X = JQz.A0X(mutableLiveData);
        if (A0X == null || (l07 = (L07) A0X.A01) == null || (str = l07.A02) == null || 0CU.A0O(str)) {
            LZq lZq = c3038Jh1.A0H;
            String str3 = c3038Jh1.A05;
            if (str3 == null) {
                11T.A0L("productId");
                throw 0Q8.createAndThrow();
            }
            FJC A0X2 = JQz.A0X(lZq.A04(C3029Jgs.A00(KOy.A0B, c3038Jh1.A0G, str3)));
            if (A0X2 != null && (rb4 = (Rb4) A0X2.A01) != null) {
                return rb4.A06;
            }
        } else {
            FJC A0X3 = JQz.A0X(mutableLiveData);
            if (A0X3 != null && (l072 = (L07) A0X3.A01) != null) {
                str2 = l072.A02;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
    
        if (r301.A0G.A06() == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList A02(java.lang.String r302, java.util.List r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A02(java.lang.String, java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01d9, code lost:
    
        if (r312 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List A03(java.lang.Boolean r302, java.lang.String r303, java.util.List r304, java.util.List r305, java.util.List r306) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A03(java.lang.Boolean, java.lang.String, java.util.List, java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x014a, code lost:
    
        if (r301.A0G.A07() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A04(android.os.Bundle r302, androidx.fragment.app.Fragment r303, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r304) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A04(android.os.Bundle, androidx.fragment.app.Fragment, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem):void");
    }

    private final void A05(SelectionPaymentMethodItem selectionPaymentMethodItem) {
        Integer num;
        Integer num2;
        String AkU;
        L07 l07;
        PaymentMethod paymentMethod;
        KN0 kn0 = (KN0) this.A0C.getValue();
        if (kn0 != null) {
            boolean z = true;
            if (kn0.ordinal() == 1) {
                selectionPaymentMethodItem.CuR(0S2.A01);
                return;
            }
            FJC A0X = JQz.A0X(this.A08);
            String Aez = (A0X == null || (l07 = (L07) A0X.A01) == null || (paymentMethod = (PaymentMethod) l07.A01) == null) ? null : paymentMethod.Aez();
            MPh mPh = selectionPaymentMethodItem.A00;
            if ((mPh == null || (AkU = mPh.AkU()) == null || !7zL.A1V(AkU)) && (((num = selectionPaymentMethodItem.A02) == null || num.intValue() != 2131956166) && (A0E(this) || (num2 = selectionPaymentMethodItem.A02) == null || num2.intValue() != 2131956165))) {
                z = false;
            }
            KXi.A00(selectionPaymentMethodItem, Aez, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f7, code lost:
    
        if (r307 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A06(X.MPh r302, X.EnumC3490Mfk r303, long r304, boolean r306) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A06(X.MPh, X.Mfk, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A07(X.EnumC3490Mfk r302, java.lang.String r303) {
        /*
            r301 = this;
            X.Ks7 r0 = X.C06014fk.A0A()
            r304 = r0
            r0 = r304
            X.LZv r0 = r0.A02
            r305 = r0
            r0 = r301
            com.facebookpay.logging.LoggingContext r0 = r0.A03
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L1f
            java.lang.String r0 = "loggingContext"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L1f:
            r0 = r301
            X.Jgs r0 = r0.A0G
            X.Kzj r0 = r0.A04()
            r307 = r0
            r0 = r306
            r1 = r303
            java.util.LinkedHashMap r0 = X.JR1.A16(r0, r1)
            r308 = r0
            java.lang.String r0 = "CREDENTIAL_TYPE"
            r304 = r0
            r0 = r308
            r1 = r304
            r2 = r302
            java.lang.Object r0 = r0.put(r1, r2)
            java.lang.String r0 = "extra_data"
            r309 = r0
            r0 = r308
            r1 = r309
            java.lang.Object r0 = r0.get(r1)
            r306 = r0
            r0 = r306
            boolean r0 = X.C0B7.A08(r0)
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L64
            r0 = r306
            java.util.Map r0 = (java.util.Map) r0
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L69
        L64:
            java.util.LinkedHashMap r0 = X.1BK.A1C()
            r306 = r0
        L69:
            r0 = r307
            r1 = r306
            X.LEL.A08(r0, r1)
            r0 = r308
            r1 = r309
            r2 = r306
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r308
            com.google.common.collect.ImmutableMap r0 = X.GOo.A0k(r0)
            r306 = r0
            r0 = r305
            java.lang.String r1 = "user_add_credential_enter"
            r2 = r306
            r0.BZT(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A07(X.Mfk, java.lang.String):void");
    }

    public static final void A08(C3038Jh1 c3038Jh1) {
        CreditCard creditCard;
        FJC A00;
        L07 l07;
        L07 l072;
        L07 l073;
        L07 l074;
        String AkU;
        FJC A0X;
        L07 l075;
        PaymentMethod paymentMethod;
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        CreditCard creditCard2;
        List list;
        Object obj;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        L07 l076;
        MediatorLiveData mediatorLiveData = c3038Jh1.A08;
        FJC A0X2 = JQz.A0X(mediatorLiveData);
        String str = null;
        Parcelable parcelable = (A0X2 == null || (l076 = (L07) A0X2.A01) == null) ? null : (PaymentMethod) l076.A01;
        if (!(parcelable instanceof CreditCard) || (creditCard = (CreditCard) parcelable) == null) {
            return;
        }
        c3038Jh1.A0J.remove(creditCard.Aez());
        if (A0E(c3038Jh1) && (A0X = JQz.A0X(mediatorLiveData)) != null && (l075 = (L07) A0X.A01) != null && (paymentMethod = (PaymentMethod) l075.A01) != null) {
            FJC A0X3 = JQz.A0X(c3038Jh1.A09);
            Parcelable parcelable2 = null;
            if (A0X3 != null && (list = (List) A0X3.A01) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Object obj2 = ((FJC) obj).A01;
                    if (11T.A0O((!(obj2 instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) == null) ? null : selectionPaymentMethodItem2.A0F, paymentMethod.Aez())) {
                        break;
                    }
                }
                FJC fjc = (FJC) obj;
                if (fjc != null) {
                    parcelable2 = (BaseCheckoutItem) fjc.A01;
                }
            }
            if ((parcelable2 instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem = (SelectionPaymentMethodItem) parcelable2) != null) {
                selectionPaymentMethodItem.A07 = false;
                MQH mqh = selectionPaymentMethodItem.A08;
                if (mqh != null && (paymentMethod instanceof CreditCard) && (creditCard2 = (CreditCard) paymentMethod) != null) {
                    creditCard2.A00 = mqh;
                }
                selectionPaymentMethodItem.A02 = c3038Jh1.A0J(paymentMethod);
            }
        }
        Integer A0J = c3038Jh1.A0J(creditCard);
        MPh mPh = creditCard.A01;
        boolean z = false;
        if (mPh != null && (AkU = mPh.AkU()) != null && 7zL.A1V(AkU)) {
            z = true;
        }
        LxN lxN = ((A0J == null || A0J.intValue() == 0) && !z) ? null : new LxN(A0J);
        c3038Jh1.A0I.put(creditCard.Aez(), lxN);
        FJC A0X4 = JQz.A0X(mediatorLiveData);
        if (lxN != null) {
            Integer num = (A0X4 == null || (l074 = (L07) A0X4.A01) == null) ? null : l074.A00;
            FJC A0X5 = JQz.A0X(mediatorLiveData);
            if (A0X5 != null && (l073 = (L07) A0X5.A01) != null) {
                str = l073.A02;
            }
            A00 = FJC.A05(new L07(num, creditCard, str), lxN);
        } else {
            Integer num2 = (A0X4 == null || (l072 = (L07) A0X4.A01) == null) ? null : l072.A00;
            FJC A0X6 = JQz.A0X(mediatorLiveData);
            if (A0X6 != null && (l07 = (L07) A0X6.A01) != null) {
                str = l07.A02;
            }
            A00 = L07.A00(num2, creditCard, str);
        }
        mediatorLiveData.setValue(A00);
    }

    public static final void A09(C3038Jh1 c3038Jh1, FJC fjc) {
        List list;
        List list2;
        String str;
        Boolean bool;
        Object A05;
        List list3;
        List list4;
        String str2;
        Boolean bool2;
        Object obj;
        MutableLiveData mutableLiveData = c3038Jh1.A0D;
        mutableLiveData.setValue(FJC.A00(LM5.A00, fjc));
        MutableLiveData mutableLiveData2 = c3038Jh1.A0E;
        Object obj2 = null;
        if (FJC.A0C(fjc)) {
            c3038Jh1.A0B.setValue(FJC.A01(LM6.A00, fjc));
            c3038Jh1.A0L.setValue(FJC.A01(LM7.A00, fjc));
            MediatorLiveData mediatorLiveData = c3038Jh1.A09;
            FJC A0X = JQz.A0X(mutableLiveData);
            List list5 = A0X != null ? (List) A0X.A01 : null;
            Object obj3 = fjc.A01;
            Rb4 rb4 = (Rb4) obj3;
            if (rb4 != null) {
                list3 = rb4.A04;
                list4 = rb4.A03;
                str2 = rb4.A06;
                bool2 = Boolean.valueOf(rb4.A09);
            } else {
                list3 = null;
                list4 = null;
                str2 = null;
                bool2 = null;
            }
            JQz.A19(mediatorLiveData, c3038Jh1.A03(bool2, str2, list5, list3, list4));
            obj3.getClass();
            Iterator it = rb4.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object obj4 = ((FJC) obj).A01;
                if (obj4 != null) {
                    PaymentMethod paymentMethod = (PaymentMethod) obj4;
                    if (11T.A0O(paymentMethod != null ? paymentMethod.Aez() : null, rb4.A05)) {
                        break;
                    }
                    if (11T.A0O(paymentMethod != null ? paymentMethod.Aez() : null, c3038Jh1.A04)) {
                        break;
                    }
                }
            }
            FJC fjc2 = (FJC) obj;
            if (fjc2 != null) {
                c3038Jh1.A04 = null;
                LZq lZq = c3038Jh1.A0H;
                String str3 = c3038Jh1.A05;
                if (str3 == null) {
                    11T.A0L("productId");
                    throw 0Q8.createAndThrow();
                }
                lZq.A07(C3029Jgs.A00(KOy.A0B, c3038Jh1.A0G, str3));
                Object obj5 = fjc2.A01;
                obj5.getClass();
                A05 = L07.A00(0S2.A00, obj5, rb4.A06);
            }
            A05 = mutableLiveData2.getValue();
        } else if (FJC.A0A(fjc)) {
            MediatorLiveData mediatorLiveData2 = c3038Jh1.A09;
            Throwable th = fjc.A02;
            FJC A0X2 = JQz.A0X(mutableLiveData);
            List list6 = A0X2 != null ? (List) A0X2.A01 : null;
            Rb4 rb42 = (Rb4) fjc.A01;
            if (rb42 != null) {
                list = rb42.A04;
                list2 = rb42.A03;
                str = rb42.A06;
                bool = Boolean.valueOf(rb42.A09);
            } else {
                list = null;
                list2 = null;
                str = null;
                bool = null;
            }
            mediatorLiveData2.setValue(FJC.A05(c3038Jh1.A03(bool, str, list6, list, list2), th));
            FJC A0X3 = JQz.A0X(mutableLiveData2);
            if (A0X3 != null) {
                obj2 = A0X3.A01;
            }
            A05 = FJC.A05(obj2, th);
        } else {
            JQz.A1A(c3038Jh1.A09, (Object) null);
            A05 = mutableLiveData2.getValue();
        }
        mutableLiveData2.setValue(A05);
    }

    private final void A0A(List list, List list2, List list3) {
        if (list3.isEmpty()) {
            list.addAll(list2);
            return;
        }
        Integer num = 0S2.A00;
        KP0 kp0 = KP0.A0o;
        list.add(FJC.A04(new SelectionHeaderItem(kp0, 2131956016, num, null, null)));
        list.addAll(list2);
        list.add(FJC.A04(new SelectionHeaderItem(kp0, 2131956230, num, null, null)));
        list.addAll(list3);
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A06);
        }
        return false;
    }

    private final boolean A0C() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A07);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.contains(X.Qto.A01) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r0.contains(X.Qto.A03) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r0.contains(X.Qto.A01) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0D(com.facebookpay.paymentmethod.model.CreditCard r302, java.lang.Integer r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L9a
            r0 = r302
            X.MPh r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9a
            r0 = r305
            com.google.common.collect.ImmutableList r0 = r0.AmO()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L9a
            r0 = r306
            int r0 = r0.size()
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L65
            r0 = r307
            r1 = r308
            if (r0 == r1) goto La5
            r0 = 2
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 != r1) goto L9c
            X.Qto r0 = X.Qto.A01
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.contains(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L9c
        L52:
            X.Qto r0 = X.Qto.A03
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.contains(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L9c
        L65:
            r0 = 1
            r309 = r0
        L68:
            r0 = r301
            java.util.Map r0 = r0.A0J
            r310 = r0
            r0 = r302
            java.lang.String r0 = r0.Aez()
            r305 = r0
            r0 = r310
            r1 = r305
            boolean r0 = r0.containsKey(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L9a
            r0 = r309
            if (r0 == 0) goto L9a
            r0 = r303
            if (r0 == 0) goto L98
            r0 = r303
            int r0 = r0.intValue()
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L9a
        L98:
            r0 = 1
            r304 = r0
        L9a:
            r0 = r304
            return r0
        L9c:
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
            goto L68
        La5:
            X.Qto r0 = X.Qto.A01
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.contains(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L65
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.A0D(com.facebookpay.paymentmethod.model.CreditCard, java.lang.Integer):boolean");
    }

    public static final boolean A0E(C3038Jh1 c3038Jh1) {
        ECPPaymentRequest eCPPaymentRequest = c3038Jh1.A02;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A04);
        }
        return false;
    }

    public final ShippingAddress A0F() {
        CreditCard creditCard;
        MQH mqh;
        L07 l07;
        FJC A0X = JQz.A0X(this.A08);
        ShippingAddress shippingAddress = null;
        Parcelable parcelable = (A0X == null || (l07 = (L07) A0X.A01) == null) ? null : (PaymentMethod) l07.A01;
        if ((parcelable instanceof CreditCard) && (creditCard = (CreditCard) parcelable) != null && (mqh = creditCard.A00) != null) {
            shippingAddress = L6C.A01(mqh, creditCard.A03);
        }
        return shippingAddress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.lang.Throwable] */
    public final FJC A0G() {
        L07 l07;
        PaymentMethod paymentMethod;
        LxJ lxN;
        List list;
        PuxPaymentMethodItem puxPaymentMethodItem;
        MPh mPh;
        String AkU;
        L07 l072;
        List list2;
        FJC A0X = JQz.A0X(this.A09);
        boolean isEmpty = (A0X == null || (list2 = (List) A0X.A01) == null) ? true : list2.isEmpty();
        MediatorLiveData mediatorLiveData = this.A08;
        FJC A0X2 = JQz.A0X(mediatorLiveData);
        L07 l073 = (L07) A0X2.A01;
        PaymentMethod paymentMethod2 = l073 != null ? (PaymentMethod) l073.A01 : null;
        KP0 kp0 = KP0.A0g;
        FJC A02 = FJC.A02(A0X2, new PuxPaymentMethodItem(kp0, paymentMethod2, null, false, !isEmpty));
        if (!FJC.A0B(JQz.A0X(mediatorLiveData))) {
            FJC A0X3 = JQz.A0X(mediatorLiveData);
            CreditCard creditCard = null;
            if (((A0X3 == null || (l072 = (L07) A0X3.A01) == null) ? null : l072.A01) == null) {
                FJC A0X4 = JQz.A0X(mediatorLiveData);
                if (A0X4 != null) {
                    creditCard = A0X4.A02;
                }
                if (!(creditCard instanceof Lwy)) {
                    int i = 2131956055;
                    if (A0C()) {
                        i = 2131956068;
                    }
                    lxN = new LxJ(A0C() ? KOv.A1D : KOv.A0W, i);
                    puxPaymentMethodItem = new PuxPaymentMethodItem(kp0, null, 3, false, true);
                    A02 = FJC.A05(puxPaymentMethodItem, lxN);
                }
            } else {
                FJC A0X5 = JQz.A0X(mediatorLiveData);
                if (A0X5 == null || (l07 = (L07) A0X5.A01) == null || (paymentMethod = (PaymentMethod) l07.A01) == null) {
                    throw 1BK.A0h();
                }
                Integer A0J = A0J(paymentMethod);
                boolean z = paymentMethod instanceof CreditCard;
                if (z) {
                    creditCard = (CreditCard) paymentMethod;
                }
                if (A0D(creditCard, A0J)) {
                    A02 = FJC.A04(new PuxPaymentMethodItem(kp0, paymentMethod, null, false, true));
                } else {
                    if (z && (mPh = ((CreditCard) paymentMethod).A01) != null && (AkU = mPh.AkU()) != null && 7zL.A1V(AkU)) {
                        lxN = new LxN(2131956087);
                    } else if (A0J != null && A0J.intValue() != 0) {
                        FJC A0X6 = JQz.A0X(this.A0D);
                        lxN = (A0X6 == null || (list = (List) A0X6.A01) == null || list.size() != 1) ? new LxN(2131956087) : new LxN(A0J);
                    }
                    puxPaymentMethodItem = new PuxPaymentMethodItem(kp0, paymentMethod, 3, false, true);
                    A02 = FJC.A05(puxPaymentMethodItem, lxN);
                }
            }
        }
        11T.A0D(A02);
        return A02;
    }

    public final Boolean A0H() {
        Object obj = this.A00.get(45);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final Boolean A0I() {
        Object obj = this.A00.get(29);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final Integer A0J(PaymentMethod paymentMethod) {
        int i;
        if (!(paymentMethod instanceof CreditCard)) {
            return null;
        }
        if ((paymentMethod instanceof TokenizedCard) && ((TokenizedCard) paymentMethod).A01.BGM() == Qtm.A02) {
            i = 2131956166;
        } else {
            if (!A0O((CreditCard) paymentMethod, true)) {
                return null;
            }
            i = 2131956165;
        }
        return Integer.valueOf(i);
    }

    public final void A0K() {
        List<FJC> list;
        Parcelable parcelable;
        MediatorLiveData mediatorLiveData = this.A09;
        FJC A0X = JQz.A0X(mediatorLiveData);
        if (A0X == null || (list = (List) A0X.A01) == null) {
            return;
        }
        ArrayList A0z = 1BL.A0z(list);
        for (FJC fjc : list) {
            Object obj = fjc.A01;
            if (obj != null) {
                parcelable = (BaseCheckoutItem) obj;
                11T.A0F(parcelable, 0);
                if (parcelable instanceof SelectionPaymentMethodItem) {
                    SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) parcelable;
                    if (this.A0I.get(selectionPaymentMethodItem.A0F) == null) {
                        selectionPaymentMethodItem.A02 = null;
                    }
                    A05(selectionPaymentMethodItem);
                }
            } else {
                parcelable = null;
            }
            A0z.add(FJC.A02(fjc, parcelable));
        }
        Object value = mediatorLiveData.getValue();
        if (value == null) {
            throw 1BK.A0h();
        }
        JQz.A18(mediatorLiveData, (FJC) value, A0z);
    }

    public final void A0L(MQH mqh, PaymentMethod paymentMethod) {
        CreditCard creditCard;
        L07 l07;
        L07 l072;
        11T.A0F(mqh, 0);
        String str = null;
        if (!(paymentMethod instanceof CreditCard) || (creditCard = (CreditCard) paymentMethod) == null) {
            return;
        }
        CreditCard creditCard2 = new CreditCard(creditCard.A02, creditCard instanceof TokenizedCard ? ((TokenizedCard) creditCard).A05 : creditCard.A04, creditCard.A02());
        creditCard2.A00 = mqh;
        this.A0J.put(creditCard2.Aez(), mqh);
        if (A0D(creditCard2, A0J(creditCard2))) {
            this.A0I.put(creditCard2.Aez(), null);
        }
        MediatorLiveData mediatorLiveData = this.A08;
        FJC A0X = JQz.A0X(mediatorLiveData);
        Integer num = (A0X == null || (l072 = (L07) A0X.A01) == null) ? null : l072.A00;
        FJC A0X2 = JQz.A0X(mediatorLiveData);
        if (A0X2 != null && (l07 = (L07) A0X2.A01) != null) {
            str = l07.A02;
        }
        JQz.A19(mediatorLiveData, new L07(num, creditCard2, str));
        if (!A0C() || paymentMethod == null) {
            return;
        }
        JQz.A19(this.A0E, new L07(0S2.A01, paymentMethod, A01(this)));
        A0K();
    }

    public final void A0M(PaymentMethod paymentMethod) {
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        List list;
        Object obj;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        FJC A0X = JQz.A0X(this.A09);
        Parcelable parcelable = null;
        if (A0X != null && (list = (List) A0X.A01) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object obj2 = ((FJC) obj).A01;
                if (11T.A0O((!(obj2 instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) == null) ? null : selectionPaymentMethodItem2.A0F, paymentMethod != null ? paymentMethod.Aez() : null)) {
                    break;
                }
            }
            FJC fjc = (FJC) obj;
            if (fjc != null) {
                parcelable = (BaseCheckoutItem) fjc.A01;
            }
        }
        if (!(parcelable instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem = (SelectionPaymentMethodItem) parcelable) == null) {
            return;
        }
        selectionPaymentMethodItem.A07 = true;
    }

    public final boolean A0N() {
        CreditCard creditCard;
        L07 l07;
        java.util.Map map = this.A0J;
        FJC A0X = JQz.A0X(this.A08);
        String str = null;
        Parcelable parcelable = (A0X == null || (l07 = (L07) A0X.A01) == null) ? null : (PaymentMethod) l07.A01;
        if ((parcelable instanceof CreditCard) && (creditCard = (CreditCard) parcelable) != null) {
            str = creditCard.Aez();
        }
        return AnonymousClass001.A1T(map.get(str));
    }

    public final boolean A0O(CreditCard creditCard, boolean z) {
        MPY mpy;
        if (creditCard == null) {
            return false;
        }
        if ((z && this.A0J.containsKey(creditCard.Aez())) || !this.A06) {
            return false;
        }
        MQH mqh = creditCard.A00;
        FJC A0X = JQz.A0X(this.A0B);
        if (A0X == null || (mpy = (MPY) A0X.A01) == null) {
            throw 1BK.A0h();
        }
        return !KXp.A00(mpy, mqh, creditCard.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEd(android.os.Bundle r302, android.view.ContextThemeWrapper r303, androidx.fragment.app.Fragment r304, X.FJC r305) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.AEd(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.FJC):void");
    }

    public void AP7(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) fjc.A01;
        if (baseCheckoutItem != null) {
            A04(bundle, fragment, (SelectionPaymentMethodItem) baseCheckoutItem);
        }
    }

    public MutableLiveData Aft() {
        return this.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0390, code lost:
    
        if (r301.A0G.A06() == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BqA(android.os.Bundle r302, android.view.ContextThemeWrapper r303, androidx.fragment.app.Fragment r304, X.FJC r305) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3038Jh1.BqA(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.FJC):void");
    }

    public void Chj() {
        MutableLiveData mutableLiveData = this.A0C;
        if (mutableLiveData.getValue() != KN0.A04) {
            mutableLiveData.setValue(A0N);
            A0K();
        }
    }

    public LiveData CkP() {
        return this.A09;
    }

    public boolean Cx9() {
        L07 l07;
        PaymentMethod paymentMethod;
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        List list;
        Object obj;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        FJC A0X = JQz.A0X(this.A0E);
        boolean z = true;
        if (A0X != null && (l07 = (L07) A0X.A01) != null && (paymentMethod = (PaymentMethod) l07.A01) != null) {
            String Aez = paymentMethod.Aez();
            FJC A0X2 = JQz.A0X(this.A09);
            Parcelable parcelable = null;
            if (A0X2 != null && (list = (List) A0X2.A01) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Object obj2 = ((FJC) obj).A01;
                    if (11T.A0O((!(obj2 instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) == null) ? null : selectionPaymentMethodItem2.A0F, Aez)) {
                        break;
                    }
                }
                FJC fjc = (FJC) obj;
                if (fjc != null) {
                    parcelable = (BaseCheckoutItem) fjc.A01;
                }
            }
            if ((parcelable instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem = (SelectionPaymentMethodItem) parcelable) != null && selectionPaymentMethodItem.A07 && !this.A0J.containsKey(Aez)) {
                z = false;
            }
        }
        return z;
    }

    public void D3t() {
        MutableLiveData mutableLiveData = this.A0C;
        KN0 kn0 = (KN0) mutableLiveData.getValue();
        if (kn0 != null) {
            int ordinal = kn0.ordinal();
            if (ordinal == 1) {
                kn0 = KN0.A05;
            } else if (ordinal == 2) {
                kn0 = KN0.A03;
            }
            mutableLiveData.setValue(kn0);
        }
        A0K();
    }

    public void D75(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }
}
