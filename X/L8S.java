package X;

import android.os.Build;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.Executor;

/* loaded from: L8S.class */
public final class L8S {
    public 06Z A00;

    public L8S(KTP ktp, Fragment fragment, Executor executor) {
        C3027Jgq c3027Jgq;
        if (executor == null) {
            throw AnonymousClass001.A0L("Executor must not be null.");
        }
        FragmentActivity activity = fragment.getActivity();
        06Z childFragmentManager = fragment.getChildFragmentManager();
        if (activity != null) {
            c3027Jgq = (C3027Jgq) new ViewModelProvider(activity).get(C3027Jgq.class);
            if (c3027Jgq != null) {
                fragment.getLifecycle().addObserver(new LQv(c3027Jgq));
            }
        } else {
            c3027Jgq = null;
        }
        this.A00 = childFragmentManager;
        if (c3027Jgq != null) {
            c3027Jgq.A0H = executor;
            c3027Jgq.A04 = ktp;
        }
    }

    public L8S(KTP ktp, FragmentActivity fragmentActivity, Executor executor) {
        if (executor == null) {
            throw AnonymousClass001.A0L("Executor must not be null.");
        }
        06Z BDe = fragmentActivity.BDe();
        C3027Jgq c3027Jgq = (C3027Jgq) new ViewModelProvider(fragmentActivity).get(C3027Jgq.class);
        this.A00 = BDe;
        if (c3027Jgq != null) {
            c3027Jgq.A0H = executor;
            c3027Jgq.A04 = ktp;
        }
    }

    private void A00(LA1 la1, KlF klF) {
        String str;
        06Z r0 = this.A00;
        if (r0 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            if (!r0.A1U()) {
                BiometricFragment biometricFragment = (BiometricFragment) r0.A0b("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    biometricFragment = new BiometricFragment();
                    C06c c06c = new C06c(r0);
                    c06c.A0O(biometricFragment, "androidx.biometric.BiometricFragment");
                    c06c.A05();
                    r0.A0t();
                }
                biometricFragment.A0B(la1, klF);
                return;
            }
            str = "Unable to start authentication. Called after onSaveInstanceState().";
        }
        android.util.Log.e("BiometricPromptCompat", str);
    }

    public void A01() {
        String str;
        06Z r0 = this.A00;
        if (r0 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            BiometricFragment biometricFragment = (BiometricFragment) r0.A0b("androidx.biometric.BiometricFragment");
            if (biometricFragment != null) {
                biometricFragment.A09(3);
                return;
            }
            str = "Unable to cancel authentication. BiometricFragment not found.";
        }
        android.util.Log.e("BiometricPromptCompat", str);
    }

    public void A02(LA1 la1, KlF klF) {
        int i = klF.A00;
        if (i == 0) {
            i = 15;
        } else if ((i & 255) == 255) {
            throw AnonymousClass001.A0L("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && (i & Constants.LOAD_RESULT_PGO) != 0) {
            throw AnonymousClass001.A0L("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        A00(la1, klF);
    }

    public void A03(KlF klF) {
        A00(null, klF);
    }
}
