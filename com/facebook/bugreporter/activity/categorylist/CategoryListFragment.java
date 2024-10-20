package com.facebook.bugreporter.activity.categorylist;

import X.0FI;
import X.0V5;
import X.1Bn;
import X.1Du;
import X.1iF;
import X.1pK;
import X.7zL;
import X.7zO;
import X.AbF;
import X.AbG;
import X.DKG;
import X.DPa;
import X.FH6;
import X.FXr;
import X.FYO;
import X.G6d;
import X.GHX;
import X.KAH;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.bugreporter.ConstBugReporterConfig;
import com.facebook.common.util.TriState;

/* loaded from: CategoryListFragment.class */
public final class CategoryListFragment extends 1pK implements NavigableFragment {
    public GHX A00;
    public DPa A01;
    public FH6 A02;
    public G6d A03;
    public TriState A04;

    public 1iF A1R() {
        return DKG.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = (DPa) 7zO.A0l(this, 98509);
        this.A02 = (FH6) 1Bn.A0A(100320);
        this.A03 = (G6d) 1Bn.A0A(98510);
        this.A04 = (TriState) 1Bn.A0A(83429);
    }

    @Override // com.facebook.base.fragment.NavigableFragment
    public void Crb(GHX ghx) {
        this.A00 = ghx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-849331418);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        Toolbar toolbar = (Toolbar) 7zL.A0F(this, 2131362691);
        toolbar.A0M(2131953548);
        FXr.A04(toolbar, this, 20);
        ConstBugReporterConfig constBugReporterConfig = (ConstBugReporterConfig) requireArguments().getParcelable("reporter_config");
        G6d g6d = this.A03;
        g6d.getClass();
        KAH kah = new KAH(g6d);
        1Du it = constBugReporterConfig.A00.iterator();
        while (it.hasNext()) {
            CategoryInfo categoryInfo = (CategoryInfo) it.next();
            TriState triState = TriState.YES;
            TriState triState2 = this.A04;
            triState2.getClass();
            if (triState.equals(triState2) || categoryInfo.A04) {
                kah.A0A(categoryInfo);
            }
        }
        DPa dPa = this.A01;
        dPa.getClass();
        dPa.A00 = kah.A09().A00;
        0V5.A00(dPa, 2115796802);
        AbsListView absListView = (AbsListView) 7zL.A0F(this, R.id.list);
        DPa dPa2 = this.A01;
        dPa2.getClass();
        absListView.setAdapter((ListAdapter) dPa2);
        absListView.setOnItemClickListener(new FYO(this, 1));
        if (requireArguments().getBoolean("retry", false) && this.A00 != null) {
            Intent A05 = AbF.A05();
            A05.putExtra("retry", true);
            this.A00.Byj(A05, this);
        }
        0FI.A08(1897240750, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(85093292);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542092);
        0FI.A08(-1753220126, A02);
        return A08;
    }
}
