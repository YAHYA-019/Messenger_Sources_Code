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
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PickupInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jgy, reason: case insensitive filesystem */
/* loaded from: Jgy.class */
public final class C3035Jgy extends ViewModel implements GKU {
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public SparseArray A00 = DKC.A0E();
    public final MutableLiveData A08 = new LiveData(KN0.A03);
    public final MutableLiveData A06 = new LiveData(FJC.A03((Object) null));
    public final MediatorLiveData A05 = new MediatorLiveData();
    public final Observer A07 = LR9.A01(this, 17);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r301 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.03Y A00(com.facebookpay.expresscheckout.models.PickupInfo r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            if (r0 == 0) goto L86
            r0 = r301
            java.lang.String r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L86
            java.lang.String r0 = "\\s+"
            r305 = r0
            r0 = r304
            r1 = r305
            r2 = 0
            java.util.List r0 = X.C3o5.A0U(r0, r1, r2)
            r301 = r0
        L1d:
            r0 = 1
            r306 = r0
            r0 = r301
            if (r0 == 0) goto L7d
            r0 = r301
            boolean r0 = X.1BK.A1Y(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L7d
            r0 = r301
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r302 = r0
        L37:
            r0 = r301
            boolean r0 = X.1BK.A1Y(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L77
            r0 = r301
            int r0 = r0.size()
            r308 = r0
            r0 = 2
            r307 = r0
            r0 = r308
            r1 = r307
            if (r0 < r1) goto L77
            r0 = r301
            int r0 = r0.size()
            r307 = r0
            r0 = r301
            r1 = r306
            r2 = r307
            java.util.List r0 = r0.subList(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L77
            java.lang.String r0 = " "
            r305 = r0
            r0 = r305
            r1 = r304
            r2 = 0
            java.lang.String r0 = X.4YV.A0t(r0, r1, r2)
            r303 = r0
        L77:
            r0 = r302
            r1 = r303
            X.03Y r0 = X.1BK.A1G(r0, r1)
            return r0
        L7d:
            r0 = 0
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L77
            goto L37
        L86:
            r0 = 0
            r301 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3035Jgy.A00(com.facebookpay.expresscheckout.models.PickupInfo):X.03Y");
    }

    public final FJC A01() {
        L07 l07;
        KP0 kp0 = KP0.A0b;
        FJC A03 = FJC.A03(new PuxContactItem(kp0, null, null, null, null, null, null, false));
        FJC A0X = JQz.A0X(this.A06);
        if (A0X != null && (l07 = (L07) A0X.A01) != null) {
            List A14 = C0s8.A14(this.A03 ? ((PickupInfo) l07.A01).A01 : null, this.A02 ? ((PickupInfo) l07.A01).A00 : null, this.A04 ? ((PickupInfo) l07.A01).A03 : null);
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : A14) {
                String str = (String) obj;
                if (str != null && !0CU.A0O(str)) {
                    A0s.add(obj);
                }
            }
            PuxContactItem puxContactItem = new PuxContactItem(kp0, null, null, (String) 0QD.A0J(A0s, 0), (String) 0QD.A0J(A0s, 1), (String) 0QD.A0J(A0s, 2), null, false);
            A03 = A03() ? FJC.A05(puxContactItem, new LxJ(KOv.A1D, 2131956073)) : FJC.A04(puxContactItem);
            11T.A0D(A03);
        }
        return A03;
    }

    public final void A02(PickupInfo pickupInfo) {
        if (this.A03) {
            03Y A00 = A00(pickupInfo);
            SparseArray sparseArray = this.A00;
            sparseArray.put(41, A00.first);
            sparseArray.put(42, A00.second);
        }
        if (this.A04) {
            this.A00.put(0, pickupInfo.A03);
        }
        if (this.A02) {
            this.A00.put(1, pickupInfo.A00);
        }
        JQz.A19(this.A06, new L07(0S2.A00, pickupInfo, null));
    }

    public final boolean A03() {
        L07 l07;
        String str;
        FJC A0X = JQz.A0X(this.A06);
        boolean z = true;
        if (A0X != null && (l07 = (L07) A0X.A01) != null) {
            PickupInfo pickupInfo = (PickupInfo) l07.A01;
            String str2 = pickupInfo.A01;
            String str3 = pickupInfo.A00;
            String str4 = pickupInfo.A03;
            boolean z2 = this.A03 && (str2 == null || 0CU.A0O(str2) || (str = (String) this.A00.get(42)) == null || 0CU.A0O(str));
            boolean z3 = this.A02 && (str3 == null || 0CU.A0O(str3));
            boolean z4 = this.A04 && (str4 == null || 0CU.A0O(str4));
            if (!z2 && !z3 && !z4) {
                z = false;
            }
        }
        return z;
    }

    public void AEd(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
    }

    public void AP7(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
    }

    public MutableLiveData Aft() {
        return this.A08;
    }

    public void BqA(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, FJC fjc) {
    }

    public void Chj() {
    }

    public LiveData CkP() {
        return this.A05;
    }

    public /* synthetic */ boolean Cx9() {
        return true;
    }

    public void D3t() {
    }

    public void D75(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }
}
