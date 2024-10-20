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
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jh0, reason: case insensitive filesystem */
/* loaded from: Jh0.class */
public final class C3037Jh0 extends ViewModel implements GKU {
    public static final KN0 A0H = KN0.A05;
    public Ksw A00;
    public ECPPaymentRequest A01;
    public LoggingContext A02;
    public String A03;
    public String A04;
    public SparseArray A05;
    public final MediatorLiveData A06;
    public final MediatorLiveData A07;
    public final MutableLiveData A08;
    public final MutableLiveData A09;
    public final MutableLiveData A0A;
    public final Observer A0B;
    public final C3029Jgs A0C;
    public final java.util.Map A0D;
    public final C01i A0E = C01g.A01(M2y.A00);
    public final MutableLiveData A0F;
    public final Observer A0G;

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3037Jh0(C3029Jgs c3029Jgs) {
        this.A0C = c3029Jgs;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A07 = mediatorLiveData;
        this.A09 = JQx.A0a();
        MutableLiveData A0a = JQx.A0a();
        this.A0F = A0a;
        this.A08 = new LiveData(A0H);
        MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        JQz.A1A(mediatorLiveData2, (Object) null);
        this.A06 = mediatorLiveData2;
        this.A0A = JQx.A0a();
        this.A0D = 1BK.A1C();
        this.A0B = LR9.A01(this, 18);
        Observer A01 = LR9.A01(this, 19);
        this.A0G = A01;
        this.A05 = DKC.A0E();
        mediatorLiveData2.addSource(A0a, A01);
        mediatorLiveData.addSource(A0a, A01);
    }

    public static final PuxShippingAddressItem A00(ShippingAddress shippingAddress) {
        if (shippingAddress == null) {
            return new PuxShippingAddressItem(KP0.A0k, null, null, null, null, false);
        }
        return new PuxShippingAddressItem(KP0.A0k, shippingAddress, shippingAddress.A00, KwJ.A01(shippingAddress), KwJ.A00(shippingAddress), false);
    }

    public static final FormParams A01(C3037Jh0 c3037Jh0) {
        CheckoutConfiguration checkoutConfiguration;
        AddressFormFieldsConfig A00 = L9L.A00((MPY) JR1.A0p(c3037Jh0.A0A));
        SparseArray sparseArray = c3037Jh0.A05;
        String A02 = A02(sparseArray, 2);
        String A022 = A02(sparseArray, 5);
        String A023 = A02(sparseArray, 6);
        String A024 = A02(sparseArray, 30);
        sparseArray.get(31);
        String A025 = A02(sparseArray, 7);
        String A026 = A02(sparseArray, 9);
        Object obj = sparseArray.get(8);
        String str = obj instanceof String ? (String) obj : null;
        String A027 = A02(sparseArray, 21);
        boolean A09 = c3037Jh0.A09();
        ECPPaymentRequest eCPPaymentRequest = c3037Jh0.A01;
        FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09, true, (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) ? false : 7zR.A1X(checkoutConfiguration.A05));
        LoggingContext loggingContext = c3037Jh0.A02;
        if (loggingContext != null) {
            return RVz.A01(featureConfiguration, A00, loggingContext, (ImmutableList) null, (Integer) null, (String) null, A02, A022, A023, A024, A025, A026, str, A027, 2131956082, 0, 2131956148, false, true);
        }
        11T.A0L("loggingContext");
        throw 0Q8.createAndThrow();
    }

    public static String A02(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r309 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List A03(java.util.List r302) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3037Jh0.A03(java.util.List):java.util.List");
    }

    private final void A04(Bundle bundle, Fragment fragment, SelectionShippingAddressItem selectionShippingAddressItem) {
        ErrorDialogContent errorDialogContent;
        CheckoutConfiguration checkoutConfiguration;
        List list;
        int i;
        ImmutableList immutableList = null;
        List<EN6> list2 = selectionShippingAddressItem.A06;
        if (list2 == null || list2.isEmpty()) {
            errorDialogContent = null;
        } else {
            ArrayList A0z = 1BL.A0z(list2);
            for (EN6 en6 : list2) {
                11T.A0F(en6, 0);
                switch (en6.ordinal()) {
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 10;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 9;
                        break;
                    case 6:
                        i = 11;
                        break;
                    default:
                        throw AnonymousClass001.A0N("Invalid Error Field");
                }
                AnonymousClass001.A1J(A0z, i);
            }
            immutableList = ImmutableList.copyOf((Collection) A0z);
            int i2 = 2131956111;
            int i3 = 2131956110;
            if (list2.size() == 1) {
                int ordinal = ((EN6) 1BK.A0r(list2)).ordinal();
                if (ordinal == 1) {
                    i2 = 2131956108;
                } else if (ordinal != 3) {
                    i2 = 2131956113;
                    if (ordinal != 5) {
                        i2 = 2131956111;
                    }
                } else {
                    i2 = 2131956112;
                }
                i3 = 2131956109;
            }
            errorDialogContent = new ErrorDialogContent(KOE.A02, null, null, null, Integer.valueOf(i2), Integer.valueOf(i3), null, null, null, null);
        }
        FJC A0X = JQz.A0X(this.A09);
        if (A0X != null && (list = (List) A0X.A01) != null) {
            Iterator it = list.iterator();
            while (it.hasNext() && !11T.A0O(((ShippingAddress) it.next()).A04, selectionShippingAddressItem.A0A)) {
            }
        }
        int i4 = A09() ? 2131956140 : 2131956147;
        int i5 = A09() ? 2131956149 : 2131956156;
        MutableLiveData mutableLiveData = this.A0A;
        AddressFormFieldsConfig A00 = L9L.A00((MPY) JR1.A0p(mutableLiveData));
        String str = selectionShippingAddressItem.A0A;
        String str2 = selectionShippingAddressItem.A03;
        String str3 = selectionShippingAddressItem.A0E;
        String str4 = selectionShippingAddressItem.A0F;
        String str5 = selectionShippingAddressItem.A0B;
        String str6 = selectionShippingAddressItem.A07;
        String str7 = selectionShippingAddressItem.A0C;
        String str8 = selectionShippingAddressItem.A0D;
        String str9 = selectionShippingAddressItem.A08;
        boolean A09 = A09();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09, false, (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) ? false : 7zR.A1X(checkoutConfiguration.A05));
        LoggingContext loggingContext = this.A02;
        if (loggingContext == null) {
            11T.A0L("loggingContext");
            throw 0Q8.createAndThrow();
        }
        FormParams A01 = RVz.A01(featureConfiguration, A00, loggingContext, immutableList, 2131956157, str, str2, str3, str4, str5, str6, str7, str8, str9, i4, i5, 2131956163, A0B(str), false);
        bundle.putAll(RVt.A00(mutableLiveData, (FeatureConfiguration) null, (LoggingContext) null));
        bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", A01);
        if (errorDialogContent != null) {
            bundle.putParcelable("ECP_FORM_FRAGMENT_ERROR_MESSAGE", errorDialogContent);
        }
        Rf1.A00(bundle, fragment, "content_form_fragment", true, false);
    }

    private final void A05(BaseSelectionCheckoutItem baseSelectionCheckoutItem) {
        L07 l07;
        ShippingAddress shippingAddress;
        KN0 kn0 = (KN0) this.A08.getValue();
        if (kn0 != null) {
            if (kn0.ordinal() == 1) {
                baseSelectionCheckoutItem.CuR(0S2.A01);
                return;
            }
            FJC A0X = JQz.A0X(this.A06);
            String str = null;
            if (A0X != null && (l07 = (L07) A0X.A01) != null && (shippingAddress = (ShippingAddress) l07.A01) != null) {
                str = shippingAddress.A04;
            }
            KXi.A00(baseSelectionCheckoutItem, str, false);
        }
    }

    private final void A06(LoggingContext loggingContext, long j, boolean z) {
        if (this.A08.getValue() != KN0.A03 && !z) {
            7zU.A0b().A0F(loggingContext, Long.valueOf(j), "select_existing_shipping_address", DKH.A0t(this.A0C));
            return;
        }
        LZv.A03(AbF.A08(1BK.A08(7zU.A0b().A00, "user_edit_shippingaddress_enter"), 317), loggingContext, new AV9(loggingContext, Long.valueOf(j), "edit_shipping_address", DKH.A0t(this.A0C), 12));
    }

    public static final void A07(C3037Jh0 c3037Jh0) {
        List<FJC> list;
        Parcelable parcelable;
        MediatorLiveData mediatorLiveData = c3037Jh0.A07;
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
                if (parcelable instanceof SelectionShippingAddressItem) {
                    c3037Jh0.A05((BaseSelectionCheckoutItem) parcelable);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A08(X.C3037Jh0 r301, X.FJC r302) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3037Jh0.A08(X.Jh0, X.FJC):void");
    }

    private final boolean A09() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
            return false;
        }
        return 7zR.A1X(checkoutConfiguration.A06);
    }

    public final boolean A0A() {
        List list;
        FJC A0X = JQz.A0X(this.A09);
        if (A0X == null || (list = (List) A0X.A01) == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final boolean A0B(String str) {
        List list;
        Object obj;
        FJC A0X = JQz.A0X(this.A09);
        if (A0X == null || (list = (List) A0X.A01) == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (11T.A0O(((ShippingAddress) obj).A04, str)) {
                break;
            }
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        if (shippingAddress != null) {
            return shippingAddress.A0E;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x027f, code lost:
    
        if (r0.inlineError != null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEd(android.os.Bundle r302, android.view.ContextThemeWrapper r303, androidx.fragment.app.Fragment r304, X.FJC r305) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3037Jh0.AEd(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.FJC):void");
    }

    public void AP7(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) fjc.A01;
        if (baseCheckoutItem != null) {
            LoggingContext loggingContext = this.A02;
            if (loggingContext == null) {
                11T.A0L("loggingContext");
                throw 0Q8.createAndThrow();
            }
            SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
            A06(loggingContext, Long.parseLong(selectionShippingAddressItem.A0A), A09());
            A04(bundle, fragment, selectionShippingAddressItem);
        }
    }

    public MutableLiveData Aft() {
        return this.A08;
    }

    public void BqA(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
        CheckoutConfiguration checkoutConfiguration;
        11T.A0F(contextThemeWrapper, 2);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) fjc.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionActionViewItem) {
                LZv A0b = 7zU.A0b();
                LoggingContext loggingContext = this.A02;
                if (loggingContext != null) {
                    LZv.A02(AbF.A08(1BK.A08(A0b.A00, "user_add_shippingaddress_enter"), 300), loggingContext, DKH.A0t(this.A0C), "add_shipping_address", 16);
                    MutableLiveData mutableLiveData = this.A0A;
                    boolean A09 = A09();
                    ECPPaymentRequest eCPPaymentRequest = this.A01;
                    FeatureConfiguration featureConfiguration = new FeatureConfiguration(A09, false, (eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) ? false : 7zR.A1X(checkoutConfiguration.A05));
                    LoggingContext loggingContext2 = this.A02;
                    if (loggingContext2 != null) {
                        11T.A0F(mutableLiveData, 1);
                        bundle.putAll(RVt.A00(mutableLiveData, featureConfiguration, loggingContext2));
                        Rf1.A00(bundle, fragment, "content_form_fragment", true, false);
                        return;
                    }
                }
            } else {
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
                LoggingContext loggingContext3 = this.A02;
                if (loggingContext3 != null) {
                    A06(loggingContext3, Long.parseLong(selectionShippingAddressItem.A0A), false);
                    A04(bundle, fragment, selectionShippingAddressItem);
                    return;
                }
            }
            11T.A0L("loggingContext");
            throw 0Q8.createAndThrow();
        }
    }

    public void Chj() {
        MutableLiveData mutableLiveData = this.A08;
        if (mutableLiveData.getValue() != KN0.A04) {
            mutableLiveData.setValue(A0H);
            A07(this);
        }
    }

    public LiveData CkP() {
        return this.A07;
    }

    public /* synthetic */ boolean Cx9() {
        return true;
    }

    public void D3t() {
        MutableLiveData mutableLiveData = this.A08;
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
        A07(this);
    }

    public void D75(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A05 = sparseArray;
        }
    }
}
