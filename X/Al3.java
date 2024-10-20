package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.BitSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Al3.class */
public final class Al3 extends 1pK {
    public static final String __redex_internal_original_name = "CategoryOrganizationFragment";
    public 1pI A00;
    public ThreadKey A02;
    public ParcelableSecondaryData A03;
    public String A04;
    public FbUserSession A05;
    public LithoView A06;
    public 8Lu A01 = new 8Lu((ImmutableList) null, (ImmutableMap) null, (DefaultConstructorMarker) null, 3, 10);
    public final 1Br A09 = 7zN.A0I(this);
    public final 1Br A08 = 1Bq.A00(82687);
    public final 1Br A07 = 1Bu.A00(147538);
    public final Observer A0A = CaE.A00(this, 24);
    public final Bcq A0B = new Bcq(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(Al3 al3) {
        LithoView lithoView = al3.A06;
        String str = "lithoView";
        if (lithoView != null) {
            C1822Atv c1822Atv = new C1822Atv(AbF.A0U(lithoView), new AzZ());
            FbUserSession fbUserSession = al3.A05;
            if (fbUserSession == null) {
                str = "fbUserSession";
            } else {
                1LI r0 = c1822Atv.A01;
                ((AzZ) r0).A02 = fbUserSession;
                BitSet bitSet = c1822Atv.A02;
                bitSet.set(3);
                C00i c00i = al3.A09.A00;
                ((AzZ) r0).A06 = 7zM.A11(c00i);
                bitSet.set(2);
                7zM.A1O(c1822Atv, 7zM.A11(c00i));
                c1822Atv.A2N(true);
                ((AzZ) r0).A00 = 2131954041;
                bitSet.set(6);
                ((AzZ) r0).A07 = CxE.A00(al3, 21);
                bitSet.set(7);
                ((AzZ) r0).A05 = al3.A0B;
                bitSet.set(5);
                ((AzZ) r0).A03 = CallerContext.A0B(__redex_internal_original_name);
                bitSet.set(0);
                ((AzZ) r0).A01 = al3.getChildFragmentManager();
                bitSet.set(4);
                ((AzZ) r0).A04 = al3.A01;
                bitSet.set(1);
                7zP.A17(c1822Atv, bitSet, c1822Atv.A03);
                LithoView lithoView2 = al3.A06;
                if (lithoView2 != null) {
                    lithoView2.A0x(r0);
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1E() {
        super.A1E();
        A03(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = 1BM.A01(this);
        if (bundle == null) {
            bundle = requireArguments();
        }
        Parcelable parcelable = bundle.getParcelable("thread_key");
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        this.A02 = (ThreadKey) parcelable;
        this.A03 = (ParcelableSecondaryData) bundle.getParcelable("extra_data");
        ThreadKey threadKey = this.A02;
        if (threadKey == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        if (!threadKey.A1E()) {
            throw 1BK.A0g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(707753984);
        LithoView A0M = 7zR.A0M(this);
        this.A06 = A0M;
        0FI.A08(147402215, A02);
        return A0M;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        ThreadKey threadKey = this.A02;
        if (threadKey == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        AbF.A1J(bundle, threadKey);
        bundle.putParcelable("extra_data", this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        CommunityExtraData communityExtraData;
        String str;
        String str2;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
        ParcelableSecondaryData parcelableSecondaryData = this.A03;
        if (parcelableSecondaryData == null || (communityExtraData = (CommunityExtraData) ParcelableSecondaryData.A00(parcelableSecondaryData, CommunityExtraData.class, null)) == null || (str = communityExtraData.A06) == null) {
            throw AnonymousClass001.A0N("groupId shouldn't be null");
        }
        this.A04 = str;
        1Br.A0C(this.A08);
        ThreadKey threadKey = this.A02;
        if (threadKey == null) {
            str2 = "threadKey";
        } else {
            String str3 = this.A04;
            if (str3 == null) {
                str2 = "groupId";
            } else {
                FbUserSession fbUserSession = this.A05;
                if (fbUserSession != null) {
                    Transformations.map(CAQ.A00(fbUserSession, (1Hb) null, threadKey, str3, false), new DD3(this, 7)).observe(this, this.A0A);
                    A03(this);
                    return;
                }
                str2 = "fbUserSession";
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }
}
