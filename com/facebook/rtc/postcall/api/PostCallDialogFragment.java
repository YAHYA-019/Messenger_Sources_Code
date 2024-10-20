package com.facebook.rtc.postcall.api;

import X.11T;
import X.1BM;
import X.1Bn;
import X.2Ov;
import X.4YU;
import X.5VU;
import X.7zO;
import X.DKC;
import X.GOo;
import X.Gpw;
import X.HKy;
import X.I4j;
import X.JGT;
import X.JMS;
import X.JZj;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.widget.Button;
import com.facebook.rtc.postcall.RatingDialogFragment;
import com.facebook.rtc.postcall.SurveyDialogFragment;
import com.facebook.user.model.User;

/* loaded from: PostCallDialogFragment.class */
public abstract class PostCallDialogFragment extends 2Ov implements JGT {
    public JMS A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1C(int i, String str, String str2, String str3) {
        User user;
        JMS jms = this.A00;
        if (jms != null) {
            jms.CPZ(getContext(), str, str2, str3, i);
            jms.CPY(i);
        }
        if (!((5VU) 7zO.A0l(this, 68298)).A01() || (user = (User) 1Bn.A0A(83430)) == null) {
            return;
        }
        DKC.A1I(requireContext(), 4YU.A0u(7zO.A0D(this), user.A0X.displayName, 2131953636), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1D(JZj jZj) {
        Window window = jZj.getWindow();
        if (window != null) {
            if (((I4j) GOo.A0n(jZj.getContext(), 1BM.A01(this), 114859)).A00 instanceof Gpw) {
                window.getAttributes().gravity = 80;
                jZj.show();
            }
        }
    }

    public final void A1E(boolean z) {
        Button button;
        JZj jZj = this instanceof SurveyDialogFragment ? ((SurveyDialogFragment) this).A00 : ((RatingDialogFragment) this).A02;
        if (jZj == null || (button = jZj.A00.A0H) == null) {
            return;
        }
        button.setEnabled(z);
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.0D2*/.onAttach(context);
        this.A00 = HKy.A00(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        if (this.mFragmentManager != null) {
            A0p();
        }
    }
}
