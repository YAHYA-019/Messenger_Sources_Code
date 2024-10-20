package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelLazy;
import com.facebook.litho.LithoView;

/* renamed from: X.Gbh, reason: case insensitive filesystem */
/* loaded from: Gbh.class */
public final class C2380Gbh extends 1pK {
    public static final String __redex_internal_original_name = "CodecAvatarSurveyFragment";
    public LithoView A00;
    public JMS A01;
    public final 1Br A02;
    public final C01i A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C2380Gbh() {
        C01i A00 = J9s.A00(new J9s(this, 33), C03i.A02, 34);
        this.A03 = new ViewModelLazy(7zL.A18(8DB.class), new J9s(A00, 35), new AKX(A00, this, 37), new AKX((Object) null, A00, 36));
        this.A02 = 1Bu.A02(this, 16980);
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        this.A01 = HKy.A00(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-633806185);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541933, viewGroup, false);
        getParentFragmentManager().A1R("CODEC_AVATAR_SURVEY_ON_SHOW_SURVEY", Bundle.EMPTY);
        11T.A0D(inflate);
        0FI.A08(-2137454192, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-736921944);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A00 = null;
        0FI.A08(2066964974, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (LithoView) requireView().requireViewById(2131363329);
        ((8DB) this.A03.getValue()).A00.observe(getViewLifecycleOwner(), new ILT(this, 9));
    }
}
