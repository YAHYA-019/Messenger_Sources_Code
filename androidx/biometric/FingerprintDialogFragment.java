package androidx.biometric;

import X.0D2;
import X.0FI;
import X.AbF;
import X.AnonymousClass001;
import X.C3027Jgq;
import X.DKF;
import X.GOn;
import X.JQx;
import X.JR1;
import X.JSp;
import X.JZj;
import X.KlF;
import X.LFM;
import X.LR8;
import X.Ljo;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.common.dextricks.Constants;

/* loaded from: FingerprintDialogFragment.class */
public final class FingerprintDialogFragment extends 0D2 {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public C3027Jgq A04;
    public final Handler A05 = AnonymousClass001.A07();
    public final Runnable A06 = new Ljo(this);

    /* JADX WARN: Multi-variable type inference failed */
    private int A05(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(JR1.A0Y(context, i).data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        CharSequence charSequence;
        JSp jSp = new JSp(requireContext());
        KlF klF = this.A04.A06;
        jSp.A03(klF != null ? klF.A04 : null);
        View A0B = DKF.A0B(LayoutInflater.from(jSp.A00.A0Q), 2132542021);
        TextView A06 = AbF.A06(A0B, 2131364126);
        if (A06 != null) {
            KlF klF2 = this.A04.A06;
            CharSequence charSequence2 = klF2 != null ? klF2.A03 : null;
            if (TextUtils.isEmpty(charSequence2)) {
                A06.setVisibility(8);
            } else {
                A06.setVisibility(0);
                A06.setText(charSequence2);
            }
        }
        TextView A062 = AbF.A06(A0B, 2131364120);
        if (A062 != null) {
            KlF klF3 = this.A04.A06;
            CharSequence charSequence3 = klF3 != null ? klF3.A01 : null;
            if (TextUtils.isEmpty(charSequence3)) {
                A062.setVisibility(8);
            } else {
                A062.setVisibility(0);
                A062.setText(charSequence3);
            }
        }
        this.A02 = GOn.A0I(A0B, 2131364125);
        this.A03 = AbF.A06(A0B, 2131364121);
        C3027Jgq c3027Jgq = this.A04;
        if ((c3027Jgq.A01() & Constants.LOAD_RESULT_PGO) != 0) {
            charSequence = getString(2131954786);
        } else {
            charSequence = c3027Jgq.A0G;
            if (charSequence == null) {
                KlF klF4 = c3027Jgq.A06;
                if (klF4 != null) {
                    charSequence = klF4.A02;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                } else {
                    charSequence = null;
                }
            }
        }
        jSp.A0E(new LFM(this, 0), charSequence);
        jSp.A0I(A0B);
        JZj A04 = jSp.A04();
        A04.setCanceledOnTouchOutside(false);
        return A04;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C3027Jgq c3027Jgq = this.A04;
        MutableLiveData mutableLiveData = c3027Jgq.A0E;
        if (mutableLiveData == null) {
            mutableLiveData = JQx.A0a();
            c3027Jgq.A0E = mutableLiveData;
        }
        C3027Jgq.A00(mutableLiveData, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1792436741);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C3027Jgq c3027Jgq = (C3027Jgq) new ViewModelProvider(activity).get(C3027Jgq.class);
            this.A04 = c3027Jgq;
            MutableLiveData mutableLiveData = c3027Jgq.A0C;
            if (mutableLiveData == null) {
                mutableLiveData = JQx.A0a();
                c3027Jgq.A0C = mutableLiveData;
            }
            LR8.A01(this, mutableLiveData, 6);
            C3027Jgq c3027Jgq2 = this.A04;
            MutableLiveData mutableLiveData2 = c3027Jgq2.A0B;
            if (mutableLiveData2 == null) {
                mutableLiveData2 = JQx.A0a();
                c3027Jgq2.A0B = mutableLiveData2;
            }
            LR8.A01(this, mutableLiveData2, 7);
        }
        this.A00 = A05(2130969147);
        this.A01 = A05(R.attr.textColorSecondary);
        0FI.A08(-1212182408, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-227822491);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A05.removeCallbacksAndMessages(null);
        0FI.A08(1872654175, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-267701365);
        super/*androidx.fragment.app.Fragment*/.onResume();
        C3027Jgq c3027Jgq = this.A04;
        c3027Jgq.A01 = 0;
        c3027Jgq.A02(1);
        this.A04.A03(getString(2131956945));
        0FI.A08(2131559532, A02);
    }
}
