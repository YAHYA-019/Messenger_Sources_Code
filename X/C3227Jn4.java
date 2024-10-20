package X;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;

/* renamed from: X.Jn4, reason: case insensitive filesystem */
/* loaded from: Jn4.class */
public final class C3227Jn4 extends AbstractC3228Jn5 {
    public static final String __redex_internal_original_name = "FacebookAutofillContactBottomSheetDialogFragment";
    public RYb A00;
    public final JnF A01 = new JnF();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(X.C3227Jn4 r301, int r302) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3227Jn4.A05(X.Jn4, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fd, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(X.C3227Jn4 r301, com.facebook.browser.lite.extensions.autofill.model.AutofillData r302, int r303) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3227Jn4.A06(X.Jn4, com.facebook.browser.lite.extensions.autofill.model.AutofillData, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x06f3, code lost:
    
        if (r301.A09.size() <= 1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 2524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3227Jn4.A0n(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r0 != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0s(int r302) {
        /*
            r301 = this;
            r0 = r301
            X.L8t r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L81
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L82
            java.lang.String r0 = "DISMISS_AUTOFILL_DIALOG_BY_SCROLL"
            r305 = r0
        L15:
            r0 = r303
            r1 = r305
            r2 = 0
            X.Ktt r0 = r0.A03(r1, r2)
            r303 = r0
            r0 = r301
            java.lang.String r0 = r0.A08
            r306 = r0
            r0 = r303
            r1 = r306
            r0.A0A = r1
            r0 = r301
            java.lang.String r0 = r0.A07
            r306 = r0
            r0 = r303
            r1 = r306
            r0.A08 = r1
            r0 = r301
            java.util.List r0 = r0.A09
            r306 = r0
            r0 = r306
            int r0 = r0.size()
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A00 = r1
            r0 = r301
            boolean r0 = r0.A0C
            r304 = r0
            r0 = r301
            boolean r0 = r0.A0A
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L5e
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 == 0) goto L63
        L5e:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L63:
            r0 = r303
            r1 = r304
            r0.A0P = r1
            r0 = r303
            X.L2l r0 = r0.A01()
            r303 = r0
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r305 = r0
            r0 = r301
            X.4wl r0 = r0.A03
            r306 = r0
            r0 = r305
            r1 = r306
            r2 = r303
            X.LEA.A07(r0, r1, r2)
        L81:
            return
        L82:
            java.lang.String r0 = "DISMISS_AUTOFILL_DIALOG_BY_CLICK_OUTSIDE"
            r305 = r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3227Jn4.A0s(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC3228Jn5
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-650698465);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = -1288270256;
        } else {
            this.A0C = bundle2.getBoolean("show_consent", false);
            this.A0A = this.mArguments.getBoolean("consent_accepted", false);
            this.A0B = this.mArguments.getBoolean("show_fbpay_disclosure", false);
            i = -805375492;
        }
        0FI.A08(i, A02);
    }

    public void onStart() {
        int i;
        int A02 = 0FI.A02(1900768431);
        super/*X.JgN*/.onStart();
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null) {
            i = -1479569409;
        } else {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.color.transparent);
            }
            i = 2043788806;
        }
        0FI.A08(i, A02);
    }
}
