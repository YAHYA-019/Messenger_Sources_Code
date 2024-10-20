package X;

import android.content.DialogInterface;

/* renamed from: X.9oG, reason: invalid class name */
/* loaded from: 9oG.class */
public final class C9oG implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C9oG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(JSp jSp, CharSequence charSequence, Object obj, int i) {
        jSp.A0G(new C9oG(obj, i), charSequence);
    }

    public static void A01(JSp jSp, Object obj, int i, int i2) {
        jSp.A0B(new C9oG(obj, i), i2);
    }

    public static void A02(JSp jSp, Object obj, int i, int i2) {
        jSp.A0D(new C9oG(obj, i), i2);
    }

    public static void A03(JSp jSp, Object obj, int i, int i2) {
        jSp.A0B(new C9oG(obj, i), i2);
        jSp.A04().show();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0c9b, code lost:
    
        if (r308 != null) goto L207;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v893, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.nux.fragment.EbNewUserOnboardingOptOutSettingFragment] */
    /* JADX WARN: Type inference failed for: r306v34, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment] */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.content.DialogInterface r302, int r303) {
        /*
            Method dump skipped, instructions count: 4415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9oG.onClick(android.content.DialogInterface, int):void");
    }
}
