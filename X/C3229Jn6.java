package X;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* renamed from: X.Jn6, reason: case insensitive filesystem */
/* loaded from: Jn6.class */
public final class C3229Jn6 extends AbstractC3230Jn7 {
    public static final MFG A04 = EZn.A00;
    public static final MFG A05 = FeI.A00;
    public static final String __redex_internal_original_name = "FacebookSaveAutofillBottomSheetDialogFragment";
    public final View.OnClickListener A00;
    public final View.OnClickListener A01;
    public final View.OnClickListener A02;
    public final View.OnClickListener A03;

    public C3229Jn6(L8t l8t) {
        super(l8t);
        this.A02 = LKO.A00(this, 40);
        this.A03 = LKO.A00(this, 41);
        this.A01 = LKO.A00(this, 42);
        this.A00 = LKO.A00(this, 43);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0243, code lost:
    
        if (X.KW4.A00(r0, false) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v232, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v304, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r0v312, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.Jn6, X.Jn7, X.JnD, androidx.fragment.app.Fragment, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 2128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3229Jn6.A0n(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(1135100287);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = 123851848;
        } else {
            this.A0D = bundle2.getBoolean("show_consent", false);
            this.A0C = this.mArguments.getBoolean("consent_accepted", false);
            i = -1990172602;
        }
        0FI.A08(i, A02);
    }

    @Override // X.AbstractC3230Jn7
    public void onStart() {
        int i;
        int A02 = 0FI.A02(1925372954);
        super.onStart();
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null) {
            i = -345475874;
        } else {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.color.transparent);
            }
            i = 112375042;
        }
        0FI.A08(i, A02);
    }
}
