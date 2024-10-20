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
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.Jgz, reason: case insensitive filesystem */
/* loaded from: Jgz.class */
public final class C3036Jgz extends ViewModel implements GKU {
    public LoggingContext A00;
    public Integer A01;
    public Integer A02;
    public final MediatorLiveData A03;
    public final MutableLiveData A04;
    public final MutableLiveData A05 = new LiveData(FJC.A04(C0ty.A00));
    public final MutableLiveData A06;
    public final MutableLiveData A07;
    public final MutableLiveData A08;
    public final MutableLiveData A09;
    public final Observer A0A;
    public final C3029Jgs A0B;
    public final MutableLiveData A0C;
    public final Observer A0D;
    public final Observer A0E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3036Jgz(C3029Jgs c3029Jgs) {
        this.A0B = c3029Jgs;
        MutableLiveData A0a = JQx.A0a();
        this.A08 = A0a;
        this.A02 = 0S2.A00;
        this.A06 = JQx.A0a();
        this.A09 = JQx.A0a();
        this.A04 = JQx.A0a();
        ?? liveData = new LiveData(FJC.A03((Object) null));
        this.A07 = liveData;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A03 = mediatorLiveData;
        this.A0C = new LiveData(KN0.A02);
        LR9 A01 = LR9.A01(this, 6);
        this.A0D = A01;
        LR9 A012 = LR9.A01(this, 8);
        this.A0E = A012;
        this.A0A = LR9.A01(this, 7);
        mediatorLiveData.addSource(A0a, A01);
        mediatorLiveData.addSource(liveData, A012);
    }

    public static final String A00(C3036Jgz c3036Jgz) {
        L07 l07;
        FulfillmentOptionComponent fulfillmentOptionComponent;
        FJC A0X = JQz.A0X(c3036Jgz.A03);
        if (A0X == null || (l07 = (L07) A0X.A01) == null || (fulfillmentOptionComponent = (FulfillmentOptionComponent) l07.A01) == null) {
            return null;
        }
        return fulfillmentOptionComponent.A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x033c  */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C3036Jgz r301, java.util.List r302) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3036Jgz.A01(X.Jgz, java.util.List):void");
    }

    public final boolean A02() {
        FJC A0X;
        List list;
        EL6 el6;
        MutableLiveData mutableLiveData = this.A04;
        FJC A0X2 = JQz.A0X(mutableLiveData);
        boolean z = false;
        if (((A0X2 == null || (el6 = A0X2.A00) == null) ? -1 : el6.ordinal()) == 0 && (A0X = JQz.A0X(mutableLiveData)) != null && (list = (List) A0X.A01) != null && !list.isEmpty() && list.size() == 1) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEd(android.os.Bundle r302, android.view.ContextThemeWrapper r303, androidx.fragment.app.Fragment r304, X.FJC r305) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3036Jgz.AEd(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.FJC):void");
    }

    public void AP7(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
    }

    public MutableLiveData Aft() {
        return this.A0C;
    }

    public void BqA(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
    }

    public void Chj() {
    }

    public LiveData CkP() {
        MutableLiveData mutableLiveData = this.A05;
        11T.A0I(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
        return mutableLiveData;
    }

    public /* synthetic */ boolean Cx9() {
        return true;
    }

    public void D3t() {
    }

    public void D75(SparseArray sparseArray) {
    }
}
