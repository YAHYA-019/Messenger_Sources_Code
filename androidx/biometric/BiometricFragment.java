package androidx.biometric;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0R3;
import X.AnonymousClass001;
import X.C3027Jgq;
import X.DKE;
import X.JQx;
import X.KgI;
import X.KiP;
import X.KlF;
import X.Kv2;
import X.LA1;
import X.LC7;
import X.LR8;
import X.Ljl;
import X.Ljm;
import X.Ljn;
import X.Lma;
import X.Lp2;
import X.Ltn;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.Executor;

/* loaded from: BiometricFragment.class */
public final class BiometricFragment extends Fragment {
    public Handler A00 = AnonymousClass001.A07();
    public C3027Jgq A01;

    private void A01() {
        06Z parentFragmentManager;
        0D2 A0b;
        this.A01.A0N = false;
        if (!isAdded() || (A0b = (parentFragmentManager = getParentFragmentManager()).A0b("androidx.biometric.FingerprintDialogFragment")) == null) {
            return;
        }
        if (A0b.isAdded()) {
            A0b.A0p();
        } else {
            DKE.A1J(A0b, parentFragmentManager);
        }
    }

    public static void A02(BiometricFragment biometricFragment) {
        int i;
        int i2;
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService(KeyguardManager.class);
        if (keyguardManager == null) {
            i = 12;
            i2 = 2131957319;
        } else {
            KlF klF = biometricFragment.A01.A06;
            CharSequence charSequence = klF != null ? klF.A04 : null;
            CharSequence charSequence2 = klF != null ? klF.A03 : null;
            CharSequence charSequence3 = klF != null ? klF.A01 : null;
            if (charSequence2 == null) {
                charSequence2 = charSequence3;
            }
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
            if (createConfirmDeviceCredentialIntent != null) {
                biometricFragment.A01.A0J = true;
                if (A06(biometricFragment)) {
                    biometricFragment.A01();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                biometricFragment.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
            i = 14;
            i2 = 2131957318;
        }
        A04(biometricFragment, biometricFragment.getString(i2), i);
        biometricFragment.A07();
    }

    public static void A03(BiometricFragment biometricFragment, KgI kgI) {
        C3027Jgq c3027Jgq = biometricFragment.A01;
        if (c3027Jgq.A0I) {
            c3027Jgq.A0I = false;
            Executor executor = c3027Jgq.A0H;
            if (executor == null) {
                executor = new Ltn();
            }
            executor.execute(new Lma(biometricFragment, kgI));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        biometricFragment.A07();
    }

    public static void A04(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        C3027Jgq c3027Jgq = biometricFragment.A01;
        if (c3027Jgq.A0J) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!c3027Jgq.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        c3027Jgq.A0I = false;
        Executor executor = c3027Jgq.A0H;
        if (executor == null) {
            executor = new Ltn();
        }
        executor.execute(new Lp2(biometricFragment, charSequence, i));
    }

    public static boolean A05(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        String[] stringArray = context.getResources().getStringArray(2130903074);
        int length = stringArray.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return false;
            }
            if (str.startsWith(stringArray[i2])) {
                return true;
            }
            i = i2 + 1;
        }
    }

    public static boolean A06(BiometricFragment biometricFragment) {
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity != null && biometricFragment.A01.A05 != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28) {
                if (str != null) {
                    for (String str3 : activity.getResources().getStringArray(2130903042)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                if (str2 != null) {
                    for (String str4 : activity.getResources().getStringArray(2130903041)) {
                        if (str2.startsWith(str4)) {
                            return true;
                        }
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Context context = biometricFragment.getContext();
        return context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint");
    }

    public void A07() {
        this.A01.A0N = false;
        A01();
        if (!this.A01.A0J && isAdded()) {
            DKE.A1J(this, getParentFragmentManager());
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29 || str == null) {
                return;
            }
            for (String str2 : context.getResources().getStringArray(2130903065)) {
                if (str.equals(str2)) {
                    C3027Jgq c3027Jgq = this.A01;
                    c3027Jgq.A0K = true;
                    this.A00.postDelayed(new Ljm(c3027Jgq), 600L);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0399, code lost:
    
        if (r0.A05 != false) goto L149;
     */
    /* JADX WARN: Type inference failed for: r312v4, types: [X.0R3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A08() {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A08():void");
    }

    public void A09(int i) {
        if (i == 3 || !this.A01.A0M) {
            if (A06(this)) {
                this.A01.A00 = i;
                if (i == 1) {
                    Context context = getContext();
                    A04(this, context == null ? "" : context.getString(2131956952), 10);
                }
            }
            C3027Jgq c3027Jgq = this.A01;
            KiP kiP = c3027Jgq.A07;
            if (kiP == null) {
                kiP = new KiP();
                c3027Jgq.A07 = kiP;
            }
            CancellationSignal cancellationSignal = kiP.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                kiP.A00 = null;
            }
            0R3 r0 = kiP.A01;
            if (r0 != null) {
                try {
                    r0.A00();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                kiP.A01 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (r0 != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0230, code lost:
    
        if (A05(r0, android.os.Build.MODEL) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(int r302, java.lang.CharSequence r303) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A0A(int, java.lang.CharSequence):void");
    }

    public void A0B(LA1 la1, KlF klF) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        C3027Jgq c3027Jgq = this.A01;
        c3027Jgq.A06 = klF;
        int i = klF.A00;
        if (i == 0) {
            i = 255;
            if (la1 != null) {
                i = 15;
            }
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && la1 == null) {
            la1 = Kv2.A01();
        }
        c3027Jgq.A05 = la1;
        this.A01.A0G = A0C() ? getString(2131954786) : null;
        if (A0C() && LC7.A03(activity).A04(255) != 0) {
            this.A01.A0I = true;
            A02(this);
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new Ljl(this), 600L);
        } else {
            A08();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if ((r301.A01.A01() & com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO) == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C() {
        /*
            r301 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r302 = r0
            r0 = 28
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 > r1) goto L20
            r0 = r301
            X.Jgq r0 = r0.A01
            r304 = r0
            r0 = r304
            int r0 = r0.A01()
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L24
        L20:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L24:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A0C():boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A03(this, new KgI((LA1) null, 1));
            } else {
                A04(this, getString(2131957320), 10);
                A07();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-847091015);
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C3027Jgq c3027Jgq = (C3027Jgq) new ViewModelProvider(activity).get(C3027Jgq.class);
            this.A01 = c3027Jgq;
            MutableLiveData mutableLiveData = c3027Jgq.A0A;
            if (mutableLiveData == null) {
                mutableLiveData = JQx.A0a();
                c3027Jgq.A0A = mutableLiveData;
            }
            LR8.A01(this, mutableLiveData, 0);
            C3027Jgq c3027Jgq2 = this.A01;
            MutableLiveData mutableLiveData2 = c3027Jgq2.A08;
            if (mutableLiveData2 == null) {
                mutableLiveData2 = JQx.A0a();
                c3027Jgq2.A08 = mutableLiveData2;
            }
            LR8.A01(this, mutableLiveData2, 1);
            C3027Jgq c3027Jgq3 = this.A01;
            MutableLiveData mutableLiveData3 = c3027Jgq3.A09;
            if (mutableLiveData3 == null) {
                mutableLiveData3 = JQx.A0a();
                c3027Jgq3.A09 = mutableLiveData3;
            }
            LR8.A01(this, mutableLiveData3, 2);
            C3027Jgq c3027Jgq4 = this.A01;
            MutableLiveData mutableLiveData4 = c3027Jgq4.A0D;
            if (mutableLiveData4 == null) {
                mutableLiveData4 = JQx.A0a();
                c3027Jgq4.A0D = mutableLiveData4;
            }
            LR8.A01(this, mutableLiveData4, 3);
            C3027Jgq c3027Jgq5 = this.A01;
            MutableLiveData mutableLiveData5 = c3027Jgq5.A0F;
            if (mutableLiveData5 == null) {
                mutableLiveData5 = JQx.A0a();
                c3027Jgq5.A0F = mutableLiveData5;
            }
            LR8.A01(this, mutableLiveData5, 4);
            C3027Jgq c3027Jgq6 = this.A01;
            MutableLiveData mutableLiveData6 = c3027Jgq6.A0E;
            if (mutableLiveData6 == null) {
                mutableLiveData6 = JQx.A0a();
                c3027Jgq6.A0E = mutableLiveData6;
            }
            LR8.A01(this, mutableLiveData6, 5);
        }
        0FI.A08(-1337394849, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = 0FI.A02(-18546844);
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            C3027Jgq c3027Jgq = this.A01;
            if ((c3027Jgq.A01() & Constants.LOAD_RESULT_PGO) != 0) {
                c3027Jgq.A0M = true;
                this.A00.postDelayed(new Ljn(c3027Jgq), 250L);
            }
        }
        0FI.A08(-892217803, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        FragmentActivity activity;
        int A02 = 0FI.A02(-575955297);
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J && ((activity = getActivity()) == null || !activity.isChangingConfigurations())) {
            A09(0);
        }
        0FI.A08(-868057281, A02);
    }
}
