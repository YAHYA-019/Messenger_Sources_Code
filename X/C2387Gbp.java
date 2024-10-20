package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.lang.ref.WeakReference;

/* renamed from: X.Gbp, reason: case insensitive filesystem */
/* loaded from: Gbp.class */
public final class C2387Gbp extends 1pK implements AaW, DF3, JOf {
    public static final String __redex_internal_original_name = "EncryptedLocationShareMapFragment";
    public View A00;
    public View A01;
    public C2375GbC A02;
    public 6Je A03;
    public ITm A04;
    public ITW A05;
    public RpQ A06;
    public WeakReference A07;
    public final 1Br A08 = 1Bq.A00(116305);
    public final 1Br A09 = 1Bu.A02(this, 16979);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("thread_key");
        if (parcelable == null) {
            throw AnonymousClass001.A0L("ThreadKey required");
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        String string = requireArguments.getString(Property.SYMBOL_Z_ORDER_SOURCE);
        UserKey userKey = (UserKey) AbG.A14();
        GmD gmD = new GmD(requireContext(), this, this.A03);
        11T.A0F(threadKey, 0);
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        String str = userKey.id;
        if (TextUtils.isEmpty(A0u)) {
            throw AnonymousClass001.A0L("\"groupishId\" must not be null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0L("\"userId\" must not be null or empty");
        }
        this.A02 = new C2375GbC(gmD, this, A0u, string, "M_ARMADILLO_THREAD", __redex_internal_original_name, str, true);
    }

    public void BiL() {
    }

    public void BiM() {
    }

    public boolean Bkd() {
        return false;
    }

    public void BlA() {
    }

    public void CSS() {
    }

    @Override // X.JDy
    public /* bridge */ /* synthetic */ void CfT(Hth hth) {
        11T.A0F(hth, 0);
        View view = !1Br.A07(((HRS) 1Br.A0B(this.A08)).A00).AZk(36322100335887442L) ? this.A00 : this.A01;
        if (view != null) {
            boolean z = !hth.A03;
            view.setEnabled(z);
            view.setClickable(z);
            view.setVisibility(GOp.A01(((Hss) hth.A00.A00(hth.A01)).A0B ? 1 : 0));
        }
        ITm iTm = this.A04;
        if (iTm != null) {
            iTm.A00(hth);
        }
        ITW itw = this.A05;
        if (itw != null) {
            itw.A00(hth);
        }
        RpQ rpQ = this.A06;
        if (rpQ != null) {
            rpQ.A00(hth);
        }
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A03 = r302;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(338591859);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132541930, false);
        0FI.A08(-1564438002, A02);
        return A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1744215020);
        C2375GbC c2375GbC = this.A02;
        if (c2375GbC == null) {
            11T.A0L("locationSharingPresenter");
            throw 0Q8.createAndThrow();
        }
        c2375GbC.A07();
        ITm iTm = this.A04;
        if (iTm != null) {
            iTm.A06.A01();
        }
        RpQ rpQ = this.A06;
        if (rpQ != null) {
            ViewPager2 viewPager2 = rpQ.A03;
            viewPager2.A05.A00.remove(rpQ.A04);
        }
        this.A00 = null;
        this.A01 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(2012535743, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-602062681);
        C2375GbC c2375GbC = this.A02;
        if (c2375GbC == null) {
            11T.A0L("locationSharingPresenter");
            throw 0Q8.createAndThrow();
        }
        c2375GbC.A09();
        ITm iTm = this.A04;
        if (iTm != null) {
            iTm.A06.A02();
        }
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(1972693079, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(385275808);
        super/*androidx.fragment.app.Fragment*/.onResume();
        C2375GbC c2375GbC = this.A02;
        if (c2375GbC == null) {
            11T.A0L("locationSharingPresenter");
            throw 0Q8.createAndThrow();
        }
        c2375GbC.A08();
        ITm iTm = this.A04;
        if (iTm != null) {
            iTm.A06.A03();
        }
        0FI.A08(-1113423089, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        C2375GbC c2375GbC = this.A02;
        if (c2375GbC == null) {
            11T.A0L("locationSharingPresenter");
            throw 0Q8.createAndThrow();
        }
        c2375GbC.A0B("onSaveInstanceState", new Object[0]);
        bundle.putParcelable("location_sharing_presenter_state", C2375GbC.A00(c2375GbC));
        ITm iTm = this.A04;
        if (iTm != null) {
            iTm.A06.A06(bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00fa, code lost:
    
        if (X.1Br.A07(((X.HRS) r0.get()).A00).AZk(36322100335690831L) == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2387Gbp.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
