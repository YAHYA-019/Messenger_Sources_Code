package X;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.resources.ui.FbEditText;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.resources.ui.FbTextView;

/* loaded from: E4t.class */
public final class E4t extends DYe implements GJe {
    public static final String __redex_internal_original_name = "DDInputCodeFragment";
    public TextWatcher A00;
    public FbEditText A01;
    public FbLinearLayout A02;
    public DLP A03;
    public FbTextView A04;

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() {
        View view = this.mView;
        if (view != null) {
            this.A04 = DKC.A0e(view, 2131363931);
            this.A02 = (FbLinearLayout) view.findViewById(2131363072);
            this.A01 = (FbEditText) view.findViewById(2131363546);
            DKF.A0F(view, 2131363547).setText(((DYe) this).A00.A09);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A06() {
        if (((DYe) this).A00 == null || getContext() == null) {
            return;
        }
        A03();
        DKG.A1J(this.A04);
        FbLinearLayout fbLinearLayout = this.A02;
        if (fbLinearLayout != null) {
            ((GradientDrawable) fbLinearLayout.getBackground()).setStroke((int) 7zO.A0D(this).getDimension(2132279351), 7zM.A02(getContext(), 2MR.A0m));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1M(Bundle bundle, LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        super/*X.1pK*/.A1M(bundle, layoutInflater, view, viewGroup);
        if (this.mView != null) {
            A03();
            FbLinearLayout fbLinearLayout = this.A02;
            if (fbLinearLayout != null && this.A01 != null) {
                FXq.A01(fbLinearLayout, this, 12);
            }
        }
        A06();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a() {
        if (((DYe) this).A00 == null || getContext() == null) {
            return;
        }
        A03();
        2OB r0 = this.A04;
        if (r0 != null) {
            r0.setVisibility(0);
            DKC.A1K(7zO.A0D(this), this.A04, 2131957899);
        }
        FbLinearLayout fbLinearLayout = this.A02;
        if (fbLinearLayout != null) {
            ((GradientDrawable) fbLinearLayout.getBackground()).setStroke((int) 7zO.A0D(this).getDimension(2132279351), 7zM.A02(getContext(), 2MR.A1v));
        }
        6P9 r02 = this.A01;
        if (r02 != null) {
            DKC.A1Q(r02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1b(String str) {
        if (((DYe) this).A00 == null || getContext() == null) {
            return;
        }
        A03();
        2OB r0 = this.A04;
        if (r0 != null) {
            r0.setVisibility(0);
            this.A04.setText(str);
        }
        FbLinearLayout fbLinearLayout = this.A02;
        if (fbLinearLayout != null) {
            ((GradientDrawable) fbLinearLayout.getBackground()).setStroke((int) 7zO.A0D(this).getDimension(2132279351), getContext().getColor(2132214247));
        }
        6P9 r02 = this.A01;
        if (r02 != null) {
            DKC.A1Q(r02);
        }
    }

    @Override // X.GJe
    public void CM7() {
    }

    @Override // X.GJe
    public void CM8(int i) {
    }

    @Override // X.GJe
    public void CM9(int i) {
        A06();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView A06;
        int A02 = 0FI.A02(619029857);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null && this.A00 != null && (A06 = AbF.A06(onCreateView, 2131363546)) != null) {
            A06.addTextChangedListener(this.A00);
            A06.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(4)});
            A06.setTextIsSelectable(false);
            A06.setInputType(ActionId.BEGIN_START_ACTIVITY);
        }
        View A00 = Qyd.A00(getActivity());
        if (A00 != null) {
            DLP dlp = new DLP(A00, false);
            this.A03 = dlp;
            dlp.A02(this);
        }
        0FI.A08(166845830, A02);
        return onCreateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-165316072);
        DLP dlp = this.A03;
        if (dlp != null) {
            dlp.A03(this);
        }
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(490939910, A02);
    }
}
