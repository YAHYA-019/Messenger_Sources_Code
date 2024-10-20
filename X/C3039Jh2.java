package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jh2, reason: case insensitive filesystem */
/* loaded from: Jh2.class */
public final class C3039Jh2 extends ViewModel implements GKU {
    public static final KN0 A0M = KN0.A05;
    public SparseArray A00;
    public Ksw A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final MediatorLiveData A0A;
    public final MediatorLiveData A0B;
    public final MutableLiveData A0C;
    public final MutableLiveData A0D;
    public final MutableLiveData A0E;
    public final MutableLiveData A0F;
    public final MutableLiveData A0G;
    public final MutableLiveData A0H;
    public final Observer A0I;
    public final Observer A0J;
    public final C3029Jgs A0K;
    public final C01i A0L = C01g.A01(M2s.A00);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3039Jh2(C3029Jgs c3029Jgs) {
        this.A0K = c3029Jgs;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A0B = mediatorLiveData;
        MutableLiveData A0a = JQx.A0a();
        JQz.A1A(A0a, (Object) null);
        this.A0D = A0a;
        ?? liveData = new LiveData(FJC.A03((Object) null));
        this.A0H = liveData;
        this.A0C = new LiveData(A0M);
        MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        JQz.A1A(mediatorLiveData2, (Object) null);
        this.A0A = mediatorLiveData2;
        this.A0F = JQx.A0a();
        this.A0E = JQx.A0a();
        this.A0G = JQx.A0a();
        this.A0I = LR8.A00(this, 22);
        LR8 A00 = LR8.A00(this, 23);
        this.A0J = A00;
        this.A00 = DKC.A0E();
        mediatorLiveData2.addSource(liveData, A00);
        mediatorLiveData.addSource(liveData, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0236, code lost:
    
        if (r319 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebookpay.common.recyclerview.adapteritems.InlineFormItem A00(com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r301, X.C3039Jh2 r302) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3039Jh2.A00(com.facebookpay.common.recyclerview.adapteritems.InlineFormItem, X.Jh2):com.facebookpay.common.recyclerview.adapteritems.InlineFormItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r301.A00.A03.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r301.A02.A03.isEmpty() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05cf, code lost:
    
        if (r303 != null) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0679  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List A01(X.KtF r301, X.C3039Jh2 r302) {
        /*
            Method dump skipped, instructions count: 1674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3039Jh2.A01(X.KtF, X.Jh2):java.util.List");
    }

    private final void A02(BaseSelectionCheckoutItem baseSelectionCheckoutItem) {
        L07 l07;
        KtE ktE;
        Integer num;
        KN0 kn0 = (KN0) this.A0C.getValue();
        if (kn0 != null) {
            if (kn0.ordinal() != 1) {
                FJC A0X = JQz.A0X(this.A0H);
                if (A0X == null || (l07 = (L07) A0X.A01) == null || (ktE = (KtE) l07.A01) == null) {
                    return;
                }
                KP0 AsX = baseSelectionCheckoutItem.AsX();
                int ordinal = AsX.ordinal();
                String str = null;
                if (ordinal == 30) {
                    Ktj ktj = ktE.A00;
                    if (ktj != null) {
                        str = ktj.A01;
                    }
                } else if (ordinal == 31) {
                    Kte kte = ktE.A01;
                    if (kte != null) {
                        str = kte.A02;
                    }
                } else {
                    if (ordinal != 29) {
                        throw 1BL.A0h(AsX, "Invalid contact item type: ", AnonymousClass001.A0k());
                    }
                    num = 0S2.A00;
                }
                KXi.A00(baseSelectionCheckoutItem, str, false);
                return;
            }
            num = 0S2.A01;
            baseSelectionCheckoutItem.CuR(num);
        }
    }

    private final void A03(KtS ktS, List list, boolean z, boolean z2) {
        String Asw = ktS.A00.Asw();
        A0A(Asw, list);
        List<Ktj> list2 = ktS.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Ktj ktj : list2) {
            String str = ktj.A02;
            if (str != null) {
                String str2 = ktj.A01;
                if (str2 == null) {
                    throw 1BK.A0h();
                }
                SelectionEmailViewItem selectionEmailViewItem = new SelectionEmailViewItem(KP0.A0n, 0S2.A0N, str2, str, Asw, ktj.A00, z2, ktj.A04);
                A02(selectionEmailViewItem);
                JQz.A1K(selectionEmailViewItem, A0s);
            }
        }
        list.addAll(A0s);
        if (z) {
            list.add(FJC.A04(new SelectionActionViewItem(KP0.A0m, 7zN.A0i(), Integer.valueOf(A0C() ? 2131956005 : 2131956004), Asw, null)));
        }
    }

    private final void A04(Ksx ksx, List list) {
        String Asw = ksx.A00.Asw();
        A0A(Asw, list);
        String str = ksx.A01;
        list.add(FJC.A04((str == null || 0CU.A0O(str)) ? new SelectionActionViewItem(KP0.A0m, 5, 2131956006, Asw, null) : new SelectionNameViewItem(KP0.A0p, 0S2.A00, "", str, Asw)));
    }

    private final void A05(KtT ktT, List list, boolean z, boolean z2) {
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem;
        String Asw = ktT.A00.Asw();
        A0A(Asw, list);
        List<Kte> list2 = ktT.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Kte kte : list2) {
            String str = kte.A01;
            if (str != null) {
                String str2 = kte.A02;
                if (str2 == null) {
                    throw 1BK.A0h();
                }
                selectionPhoneNumberViewItem = new SelectionPhoneNumberViewItem(KP0.A0r, 0S2.A0N, str2, str, Asw, kte.A00, z2, kte.A05);
                A02(selectionPhoneNumberViewItem);
            } else {
                selectionPhoneNumberViewItem = null;
            }
            JQz.A1K(selectionPhoneNumberViewItem, A0s);
        }
        list.addAll(A0s);
        if (z) {
            list.add(FJC.A04(new SelectionActionViewItem(KP0.A0m, 4YU.A0k(), Integer.valueOf(A0C() ? 2131956175 : 2131956007), Asw, null)));
        }
    }

    public static final void A06(C3039Jh2 c3039Jh2) {
        List<FJC> list;
        BaseCheckoutItem baseCheckoutItem;
        MediatorLiveData mediatorLiveData = c3039Jh2.A0B;
        FJC A0X = JQz.A0X(mediatorLiveData);
        if (A0X == null || (list = (List) A0X.A01) == null) {
            return;
        }
        ArrayList A0z = 1BL.A0z(list);
        for (FJC fjc : list) {
            Object obj = fjc.A01;
            if (obj != null) {
                baseCheckoutItem = (BaseCheckoutItem) obj;
                11T.A0F(baseCheckoutItem, 0);
                if (baseCheckoutItem instanceof InlineFormItem) {
                    baseCheckoutItem = A00((InlineFormItem) baseCheckoutItem, c3039Jh2);
                } else if (baseCheckoutItem instanceof BaseSelectionCheckoutItem) {
                    c3039Jh2.A02((BaseSelectionCheckoutItem) baseCheckoutItem);
                }
            } else {
                baseCheckoutItem = null;
            }
            A0z.add(FJC.A02(fjc, baseCheckoutItem));
        }
        Object value = mediatorLiveData.getValue();
        if (value == null) {
            throw 1BK.A0h();
        }
        JQz.A18(mediatorLiveData, (FJC) value, A0z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0360, code lost:
    
        if (r313 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025e, code lost:
    
        if (r312 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
    
        if (r314 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011b, code lost:
    
        r0 = r301.A0H;
        r0 = X.JQz.A0X(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
    
        r0 = (X.L07) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013c, code lost:
    
        r0 = (X.KtE) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014b, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0154, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0157, code lost:
    
        r304 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016e, code lost:
    
        if (X.11T.A0O(r304, r314.A01) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0173, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0176, code lost:
    
        r313 = null;
        r0 = r0.A02.A03.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0195, code lost:
    
        if (r0.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0198, code lost:
    
        r0 = r0.next();
        r0 = (X.Kte) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ad, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b0, code lost:
    
        r304 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c7, code lost:
    
        if (X.11T.A0O(r304, r314.A00) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ca, code lost:
    
        r313 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ce, code lost:
    
        r0 = (X.Kte) r313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d7, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01da, code lost:
    
        r0 = X.JQz.A0X(r0);
        r0 = (X.L07) r0.A01;
        r0 = (X.KtE) r0.A01;
        X.JQz.A18(r0, r0, new X.L07(r0.A00, new X.KtE(r0.A00, r0, r0.A02), null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0392, code lost:
    
        throw X.AnonymousClass001.A0N("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0244, code lost:
    
        r304 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0398, code lost:
    
        throw X.AnonymousClass001.A0N("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022b, code lost:
    
        r0 = X.JR0.A0h(r301);
        r0 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0237, code lost:
    
        if (r0 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x023a, code lost:
    
        X.11T.A0L("productID");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0243, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x043a, code lost:
    
        r304 = r0.A06(X.C3029Jgs.A00(X.KOy.A04, r301.A0K, r0));
        X.11T.A0I(r304, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        r0 = X.JQz.A0X(r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0466, code lost:
    
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0469, code lost:
    
        r306 = X.FJC.A01(X.LLl.A00, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x047a, code lost:
    
        r306 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0249, code lost:
    
        r304 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0373, code lost:
    
        if (r314 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(X.C3039Jh2 r301, X.FJC r302) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3039Jh2.A07(X.Jh2, X.FJC):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (r305 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A08(java.lang.Long r302, java.lang.String r303, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            androidx.lifecycle.MutableLiveData r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            r305 = r0
            X.KN0 r0 = X.KN0.A03
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L3f
            r0 = r304
            if (r0 != 0) goto L3f
            java.lang.String r0 = "user_click_contact_atomic"
            r307 = r0
        L1e:
            X.Ks7 r0 = X.C06014fk.A0A()
            r306 = r0
            r0 = r306
            X.LZv r0 = r0.A02
            r308 = r0
            r0 = r301
            com.facebookpay.logging.LoggingContext r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L47
            java.lang.String r0 = "loggingContext"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L3f:
            java.lang.String r0 = "user_edit_contact_enter"
            r307 = r0
            goto L1e
        L47:
            r0 = r301
            X.Jgs r0 = r0.A0K
            r306 = r0
            r0 = r306
            X.Kzj r0 = r0.A04()
            r309 = r0
            r0 = r305
            r1 = r303
            java.util.LinkedHashMap r0 = X.JR1.A16(r0, r1)
            r310 = r0
            r0 = r302
            r1 = r310
            X.JR1.A1I(r0, r1)
            java.lang.String r0 = "extra_data"
            r311 = r0
            r0 = r310
            r1 = r311
            java.lang.Object r0 = r0.get(r1)
            r305 = r0
            r0 = r305
            boolean r0 = X.C0B7.A08(r0)
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L88
            r0 = r305
            java.util.Map r0 = (java.util.Map) r0
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L8d
        L88:
            java.util.LinkedHashMap r0 = X.1BK.A1C()
            r305 = r0
        L8d:
            r0 = r309
            r1 = r305
            X.LEL.A08(r0, r1)
            r0 = r308
            r1 = r311
            r2 = r305
            r3 = r307
            r4 = r310
            X.DKH.A1P(r0, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3039Jh2.A08(java.lang.Long, java.lang.String, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        if (r305 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A09(java.lang.String r302) {
        /*
            r301 = this;
            X.Ks7 r0 = X.C06014fk.A0A()
            r303 = r0
            r0 = r303
            X.LZv r0 = r0.A02
            r304 = r0
            r0 = r301
            com.facebookpay.logging.LoggingContext r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L1e
            java.lang.String r0 = "loggingContext"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L1e:
            r0 = r301
            X.Jgs r0 = r0.A0K
            r303 = r0
            r0 = r303
            X.Kzj r0 = r0.A04()
            r306 = r0
            r0 = r305
            r1 = r302
            java.util.LinkedHashMap r0 = X.JR1.A16(r0, r1)
            r307 = r0
            java.lang.String r0 = "extra_data"
            r308 = r0
            r0 = r307
            r1 = r308
            java.lang.Object r0 = r0.get(r1)
            r305 = r0
            r0 = r305
            boolean r0 = X.C0B7.A08(r0)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L57
            r0 = r305
            java.util.Map r0 = (java.util.Map) r0
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L5c
        L57:
            java.util.LinkedHashMap r0 = X.1BK.A1C()
            r305 = r0
        L5c:
            r0 = r306
            r1 = r305
            X.LEL.A08(r0, r1)
            r0 = r307
            r1 = r308
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r307
            com.google.common.collect.ImmutableMap r0 = X.GOo.A0k(r0)
            r305 = r0
            r0 = r304
            java.lang.String r1 = "user_add_contact_enter"
            r2 = r305
            r0.BZT(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3039Jh2.A09(java.lang.String):void");
    }

    public static final void A0A(String str, List list) {
        if (str != null) {
            list.add(FJC.A04(new SelectionHeaderItem(KP0.A0o, null, 0S2.A01, str, null)));
        }
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A05);
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
            return 7zR.A1X(checkoutConfiguration.A06);
        }
        return false;
    }

    private final boolean A0D() {
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

    private final boolean A0E(KtF ktF, String str) {
        Object obj;
        Iterator it = ktF.A00.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (11T.A0O(((Ktj) obj).A01, str)) {
                break;
            }
        }
        Ktj ktj = (Ktj) obj;
        if (ktj == null) {
            return false;
        }
        MutableLiveData mutableLiveData = this.A0H;
        FJC A0X = JQz.A0X(mutableLiveData);
        KtE ktE = (KtE) ((L07) A0X.A01).A01;
        JQz.A18(mutableLiveData, A0X, new L07(0S2.A00, new KtE(ktj, ktE.A01, ktE.A02), null));
        return true;
    }

    private final boolean A0F(KtF ktF, String str) {
        Object obj;
        Iterator it = ktF.A02.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (11T.A0O(((Kte) obj).A02, str)) {
                break;
            }
        }
        Kte kte = (Kte) obj;
        if (kte == null) {
            return false;
        }
        MutableLiveData mutableLiveData = this.A0H;
        FJC A0X = JQz.A0X(mutableLiveData);
        KtE ktE = (KtE) ((L07) A0X.A01).A01;
        JQz.A18(mutableLiveData, A0X, new L07(0S2.A00, new KtE(ktE.A00, kte, ktE.A02), null));
        return true;
    }

    public final FJC A0G() {
        L07 l07;
        FJC A05;
        String str = null;
        KP0 kp0 = KP0.A0b;
        FJC A03 = FJC.A03(new PuxContactItem(kp0, null, null, null, null, null, null, false));
        FJC A0X = JQz.A0X(this.A0A);
        if (A0X != null && (l07 = (L07) A0X.A01) != null) {
            KtE ktE = (KtE) l07.A01;
            String str2 = ktE.A02;
            Ktj ktj = ktE.A00;
            String str3 = null;
            String str4 = ktj != null ? ktj.A02 : null;
            Kte kte = ktE.A01;
            String str5 = kte != null ? kte.A01 : null;
            boolean z = this.A08 && (str2 == null || 0CU.A0O(str2));
            boolean z2 = this.A07 && (str4 == null || 0CU.A0O(str4));
            boolean z3 = this.A09 && (str5 == null || 0CU.A0O(str5));
            Boolean[] boolArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
            int i = 0;
            int i2 = 0;
            do {
                if (boolArr[i].booleanValue()) {
                    i2++;
                }
                i++;
            } while (i < 3);
            if (i2 != 1) {
                if (!this.A08) {
                    str2 = null;
                }
                if (!this.A07) {
                    str4 = null;
                }
                if (!this.A09) {
                    str5 = null;
                }
                List A14 = C0s8.A14(str2, str4, str5);
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj : A14) {
                    String str6 = (String) obj;
                    if (str6 != null && !0CU.A0O(str6)) {
                        A0s.add(obj);
                    }
                }
                if (!z && !z2 && !z3) {
                    if (this.A07) {
                        if (ktj != null) {
                            str = ktj.A01;
                        }
                    } else if (this.A09) {
                        if (kte != null) {
                            str = kte.A02;
                        }
                    }
                    str3 = String.valueOf(str);
                }
                PuxContactItem puxContactItem = new PuxContactItem(kp0, null, null, (String) 0QD.A0J(A0s, 0), (String) 0QD.A0J(A0s, 1), (String) 0QD.A0J(A0s, 2), str3, false);
                if (z || z2 || z3) {
                    A05 = FJC.A05(puxContactItem, new LxJ(A0D() ? KOv.A1D : KOv.A0W, A0D() ? 2131956059 : 2131956053));
                } else {
                    A05 = FJC.A04(puxContactItem);
                }
                11T.A0D(A05);
                return A05;
            }
            this.A0D.getValue();
            A03 = FJC.A05(z ? new PuxContactItem(kp0, 5, null, null, null, null, null, false) : z2 ? new PuxContactItem(kp0, 1, null, null, null, null, null, false) : new PuxContactItem(kp0, 0, null, null, null, null, null, false), new LxJ(A0D() ? KOv.A1D : KOv.A0W, A0D() ? 2131956059 : 2131956053));
        }
        return A03;
    }

    public final boolean A0H(String str) {
        boolean z = false;
        Ksw A00 = C3029Jgs.A00(KOy.A04, this.A0K, str);
        if ((this.A08 && !JR0.A0h(this).A0B(A00)) || ((this.A07 && !JR0.A0h(this).A0A(A00)) || (this.A09 && !JR0.A0h(this).A0C(A00)))) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void AEd(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
        KtF ktF;
        Object obj;
        FJC A0X;
        L07 l07;
        KtE ktE;
        KtE ktE2;
        KtF ktF2;
        Object obj2;
        FJC A0X2;
        L07 l072;
        KtE ktE3;
        String str = null;
        FJC A05 = FJC.A05((Object) null, AnonymousClass001.A0Q("Selected item not in the list"));
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) fjc.A01;
        if (baseCheckoutItem != null && (baseCheckoutItem instanceof BaseSelectionCheckoutItem)) {
            int ordinal = baseCheckoutItem.AsX().ordinal();
            if (ordinal == 30) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                A08(1BK.A0n(selectionEmailViewItem.A04), "select_existing_email", false);
                FJC A0X3 = JQz.A0X(this.A0D);
                if (A0X3 != null && (ktF = (KtF) A0X3.A01) != null) {
                    Iterator it = ktF.A00.A03.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (11T.A0O(((Ktj) obj).A02, selectionEmailViewItem.A01)) {
                                break;
                            }
                        }
                    }
                    Ktj ktj = (Ktj) obj;
                    if (ktj != null && (A0X = JQz.A0X(this.A0H)) != null && (l07 = (L07) A0X.A01) != null && (ktE = (KtE) l07.A01) != null) {
                        String id = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        Ktj ktj2 = ktE.A00;
                        if (ktj2 != null) {
                            str = ktj2.A01;
                        }
                        if (!11T.A0O(id, str)) {
                            ktE2 = new KtE(ktj, ktE.A01, ktE.A02);
                            A05 = FJC.A04(new L07(0S2.A01, ktE2, null));
                        }
                    }
                }
            } else if (ordinal == 31) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                A08(1BK.A0n(selectionPhoneNumberViewItem.A04), "select_existing_phone", false);
                FJC A0X4 = JQz.A0X(this.A0D);
                if (A0X4 != null && (ktF2 = (KtF) A0X4.A01) != null) {
                    Iterator it2 = ktF2.A02.A03.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it2.next();
                            if (11T.A0O(((Kte) obj2).A01, selectionPhoneNumberViewItem.A01)) {
                                break;
                            }
                        }
                    }
                    Kte kte = (Kte) obj2;
                    if (kte != null && (A0X2 = JQz.A0X(this.A0H)) != null && (l072 = (L07) A0X2.A01) != null && (ktE3 = (KtE) l072.A01) != null) {
                        String id2 = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        Kte kte2 = ktE3.A01;
                        if (kte2 != null) {
                            str = kte2.A02;
                        }
                        if (!11T.A0O(id2, str)) {
                            ktE2 = new KtE(ktE3.A00, kte, ktE3.A02);
                            A05 = FJC.A04(new L07(0S2.A01, ktE2, null));
                        }
                    }
                }
            }
        }
        if (A05.A01 != null) {
            this.A0H.setValue(A05);
        }
        ((MLm) fragment).BrB();
    }

    public void AP7(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
        11T.A0F(contextThemeWrapper, 2);
        BqA(bundle, contextThemeWrapper, fragment, fjc);
    }

    public MutableLiveData Aft() {
        return this.A0C;
    }

    public void BqA(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
        Integer AnA;
        MQK mqk;
        FormParams A01;
        MQK mqk2;
        MQK mqk3;
        MQK mqk4;
        MQK mqk5;
        MQK mqk6;
        11T.A0F(contextThemeWrapper, 2);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) fjc.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionNameViewItem) {
                A08(null, "edit_name", A0C());
                RZh rZh = RCs.A00;
                int i = 2131956154;
                if (A0C()) {
                    i = 2131956153;
                }
                FJC A0X = JQz.A0X(this.A0F);
                if (A0X == null || (mqk6 = (MQK) A0X.A01) == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A01 = rZh.A01(mqk6, ((SelectionNameViewItem) baseCheckoutItem).A01, i, A0C(), A0B());
            } else if (baseCheckoutItem instanceof SelectionEmailViewItem) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                String str = selectionEmailViewItem.A04;
                A08(1BK.A0n(str), "edit_email", A0C());
                RZg rZg = RCr.A00;
                int i2 = 2131956152;
                if (A0C()) {
                    i2 = 2131956151;
                }
                FJC A0X2 = JQz.A0X(this.A0E);
                if (A0X2 == null || (mqk5 = (MQK) A0X2.A01) == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A01 = rZg.A01(mqk5, 2131956159, str, selectionEmailViewItem.A01, i2, A0C(), A0B());
            } else if (baseCheckoutItem instanceof SelectionPhoneNumberViewItem) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                String str2 = selectionPhoneNumberViewItem.A04;
                A08(1BK.A0n(str2), "edit_phone", A0C());
                RZi rZi = RCt.A00;
                FJC A0X3 = JQz.A0X(this.A0G);
                if (A0X3 == null || (mqk4 = (MQK) A0X3.A01) == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                A01 = rZi.A01(mqk4, 2131956162, str2, selectionPhoneNumberViewItem.A01, 2131956155, A0C(), A0B());
            } else {
                if (!(baseCheckoutItem instanceof MFo) || (AnA = ((MFo) baseCheckoutItem).AnA()) == null) {
                    return;
                }
                int intValue = AnA.intValue();
                if (intValue == 0) {
                    A09("add_phone");
                    RZi rZi2 = RCt.A00;
                    FJC A0X4 = JQz.A0X(this.A0G);
                    if (A0X4 == null || (mqk = (MQK) A0X4.A01) == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    A01 = rZi2.A01(mqk, (Integer) null, (String) null, (String) null, 2131956146, A0C(), A0B());
                } else if (intValue == 1) {
                    A09("add_email");
                    RZg rZg2 = RCr.A00;
                    int i3 = 2131956143;
                    if (A0C()) {
                        i3 = 2131956142;
                    }
                    FJC A0X5 = JQz.A0X(this.A0E);
                    if (A0X5 == null || (mqk2 = (MQK) A0X5.A01) == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    A01 = rZg2.A01(mqk2, (Integer) null, (String) null, (String) null, i3, A0C(), A0B());
                } else {
                    if (intValue != 5) {
                        return;
                    }
                    A09("add_name");
                    RZh rZh2 = RCs.A00;
                    int i4 = 2131956145;
                    if (A0C()) {
                        i4 = 2131956144;
                    }
                    FJC A0X6 = JQz.A0X(this.A0F);
                    if (A0X6 == null || (mqk3 = (MQK) A0X6.A01) == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    A01 = rZh2.A01(mqk3, (String) null, i4, A0C(), A0B());
                }
            }
            bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", A01);
            Rf1.A00(bundle, fragment, "content_form_fragment", true, false);
        }
    }

    public void Chj() {
        MutableLiveData mutableLiveData = this.A0C;
        if (mutableLiveData.getValue() != KN0.A04) {
            mutableLiveData.setValue(A0M);
            A06(this);
        }
    }

    public LiveData CkP() {
        return this.A0B;
    }

    public boolean Cx9() {
        List A14 = C0s8.A14(Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), Boolean.valueOf(this.A09));
        if ((A14 instanceof Collection) && A14.isEmpty()) {
            return false;
        }
        Iterator it = A14.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AnonymousClass001.A1V(it.next())) {
                i++;
                if (i < 0) {
                    C0s8.A17();
                    throw 0Q8.createAndThrow();
                }
            }
        }
        return i == 1;
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
        A06(this);
    }

    public void D75(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }
}
