package com.facebook.messaging.msys.thread.customization.theme.fragment;

import X.0FI;
import X.11T;
import X.1Bn;
import X.1iF;
import X.9BA;
import X.AnonymousClass001;
import X.F4v;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.xapp.messaging.composer.theme.customization.model.ThemeCustomizationPickerParams;

/* loaded from: ThemeCustomizationPickerFragment.class */
public final class ThemeCustomizationPickerFragment extends SlidingSheetDialogFragment {
    public ThemeCustomizationPickerParams A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public 1iF A17() {
        return new 1iF(557220298628848L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(1567939966);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        ThemeCustomizationPickerParams themeCustomizationPickerParams = bundle2 != null ? (ThemeCustomizationPickerParams) bundle2.getParcelable("args_picker_params_model") : null;
        if (themeCustomizationPickerParams != null) {
            this.A00 = themeCustomizationPickerParams;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                boolean z = bundle3.getBoolean("is_generated_theme_creation_enabled");
                if (Boolean.valueOf(z) != null) {
                    this.A02 = z;
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null) {
                        boolean z2 = bundle4.getBoolean("is_in_account_theme_picker_mode");
                        if (Boolean.valueOf(z2) != null) {
                            this.A03 = z2;
                            Bundle bundle5 = this.mArguments;
                            if (bundle5 != null) {
                                str = bundle5.getString("account_theme_picker_entry_point");
                            }
                            this.A01 = str;
                            Bundle bundle6 = this.mArguments;
                            if (bundle6 != null) {
                                boolean z3 = bundle6.getBoolean("should_finish_activity_on_dismiss");
                                if (Boolean.valueOf(z3) != null) {
                                    this.A04 = z3;
                                    0FI.A08(1142808785, A02);
                                    return;
                                }
                            }
                            A0N = AnonymousClass001.A0N("Required value was null.");
                            i = 2144809902;
                        }
                    }
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 500329574;
                }
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -804807981;
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -235585820;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e5, code lost:
    
        r318 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0259, code lost:
    
        if (X.77G.A00((X.77G) X.1Br.A0B(X.9FE.A00)).AZk(36325278611427874L) != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.customization.theme.fragment.ThemeCustomizationPickerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity;
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        if (!this.A04 || (activity = getActivity()) == null) {
            return;
        }
        9BA.A00(activity);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (this.A03) {
            F4v.A00((F4v) 1Bn.A0A(68062), "branded_chat_theme_picker", "impression", "theme", this.A01, null);
        }
    }
}
