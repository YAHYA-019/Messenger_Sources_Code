package com.facebook.messaging.photos.editing.photolayer.photopicker;

import X.0FI;
import X.11T;
import X.1BY;
import X.1Bn;
import X.53S;
import X.6zX;
import X.7zN;
import X.9De;
import X.AbR;
import X.C09s;
import X.C37r;
import X.C6r6;
import X.Cm5;
import X.HT0;
import X.IEh;
import X.IVR;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import java.io.Serializable;

/* loaded from: PhotoPickerBottomSheetFragment.class */
public final class PhotoPickerBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public View A00;
    public HT0 A01;
    public C6r6 A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        this.A00 = frameLayout;
        Serializable serializable = requireArguments().getSerializable("MONTAGE_COMPOSER_ENTRY_POINT");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.montage.composer.model.MontageComposerEntryPoint");
        this.A02 = (C6r6) serializable;
        Context context = frameLayout.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        11T.A0A(from);
        from.inflate(2132542656, frameLayout);
        C09s.A01(frameLayout, 2131365512).setBackground(null);
        6zX r0 = new 6zX();
        r0.A07 = false;
        r0.A0K = true;
        r0.A0M = false;
        r0.A0N = false;
        r0.A0I = true;
        r0.A0L = false;
        IEh A0a = ((AbR) 7zN.A0k(context, 537)).A0a(frameLayout, new MediaPickerEnvironment(r0), this.A02);
        A0a.A06();
        A0a.A09 = new IVR(this);
        A0a.A08 = new Cm5(this);
        A0a.A0A(((53S) 1Bn.A0E(context, (1BY) null, 49478)).A01(this));
        A0a.A07();
        return frameLayout;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37r(70);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(2038207171);
        super.onDestroyView();
        this.A00 = null;
        0FI.A08(-1248244806, A02);
    }
}
