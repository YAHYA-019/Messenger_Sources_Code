package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.Akw, reason: case insensitive filesystem */
/* loaded from: Akw.class */
public final class C1543Akw extends 1pK {
    public static final String __redex_internal_original_name = "SelectCategoryFragment";
    public LithoView A00;
    public DI0 A01;
    public ThreadKey A02;
    public CommunityCategory A03;
    public String A05;
    public final 1Br A07 = 7zM.A0Y();
    public ImmutableList A04 = 1BK.A0b();
    public Boolean A06 = 1BK.A0d();
    public final CxF A08 = new CxF(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1543Akw c1543Akw) {
        MigColorScheme A0j = 7zS.A0j(c1543Akw);
        LithoView lithoView = c1543Akw.A00;
        if (lithoView != null) {
            QBs qBs = new QBs(lithoView.A09, new QK1());
            1LI r0 = qBs.A01;
            ((QK1) r0).A01 = A0j;
            BitSet bitSet = qBs.A02;
            bitSet.set(0);
            7zM.A1O(qBs, A0j);
            qBs.A2N(true);
            ((QK1) r0).A00 = c1543Akw.A08;
            bitSet.set(3);
            ((QK1) r0).A02 = c1543Akw.A03;
            bitSet.set(4);
            ((QK1) r0).A03 = c1543Akw.A04;
            bitSet.set(1);
            ((QK1) r0).A04 = c1543Akw.A06;
            bitSet.set(2);
            C1rs.A04(bitSet, qBs.A03);
            qBs.A0J();
            LithoView lithoView2 = c1543Akw.A00;
            if (lithoView2 != null) {
                lithoView2.A0x(r0);
                return;
            }
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A03 = (CommunityCategory) bundle.getParcelable("selected_category");
        String string = requireArguments().getString("group_id");
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A05 = string;
        Parcelable parcelable = requireArguments().getParcelable("folder_thread_key");
        if (parcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = (ThreadKey) parcelable;
        this.A06 = Boolean.valueOf(bundle.getBoolean("hide_add_category_button"));
        ThreadKey threadKey = this.A02;
        if (threadKey == null) {
            11T.A0L("folderThreadKey");
            throw 0Q8.createAndThrow();
        }
        if (!threadKey.A1E()) {
            throw 1BK.A0g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-819898640);
        1Br A0O = AbM.A0O(this, 7zV.A09(this, this.A07), 68874);
        2aK.A03((Integer) null, (0DE) null, new AJW(A0O, this, null, 28), 7zO.A16(getViewLifecycleOwner()), 3);
        LithoView lithoView = new LithoView(requireContext(), (AttributeSet) null);
        this.A00 = lithoView;
        0FI.A08(220305617, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1436989007);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A03(this);
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        AbO.A0N(lithoView, this);
        0FI.A08(-947972090, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("selected_category", this.A03);
    }
}
