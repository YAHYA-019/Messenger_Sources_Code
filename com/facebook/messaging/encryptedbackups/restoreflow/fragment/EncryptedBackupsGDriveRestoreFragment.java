package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BL;
import X.1Bi;
import X.7zQ;
import X.7zR;
import X.7zS;
import X.7zT;
import X.96C;
import X.96R;
import X.AXm;
import X.AnonymousClass001;
import X.C1ud;
import X.C5ic;
import X.C97j;
import X.C9oG;
import X.C9up;
import X.DR6;
import X.FAn;
import X.GF6;
import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EncryptedBackupsGDriveRestoreFragment.class */
public final class EncryptedBackupsGDriveRestoreFragment extends GDriveSetupRestoreFragment implements GF6, AXm {
    public C5ic A00;
    public MigColorScheme A01;
    public C1ud A02;
    public FAn A03;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r307 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r307 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A06(com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsGDriveRestoreFragment r301, java.lang.String r302) {
        /*
            r0 = r301
            boolean r0 = r0.A1g()
            r303 = r0
            java.lang.String r0 = "intentBuilder"
            r304 = r0
            java.lang.String r0 = "finish with state: "
            r305 = r0
            java.lang.String r0 = "EncryptedBackupsGDriveRestoreFragment"
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L68
            r0 = r305
            r1 = r302
            java.lang.String r2 = " in NUX flow"
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r307 = r0
            r0 = r306
            r1 = r307
            X.0fH.A0j(r0, r1)
            r0 = r301
            X.FAn r0 = r0.A03
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb2
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L49
            r0 = r306
            java.lang.String r1 = "com.facebook.fragment.BUNDLE_EXTRAS"
            android.os.Bundle r0 = r0.getBundle(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L53
        L49:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r307 = r0
            r0 = r307
            X.11T.A0B(r0)
        L53:
            r0 = r307
            r1 = r301
            r2 = r302
            android.content.Intent r0 = X.FAn.A00(r0, r1, r2)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L67
        L61:
            r0 = r301
            r1 = r307
            r0.A1Y(r1)
        L67:
            return
        L68:
            r0 = r305
            r1 = r302
            java.lang.String r2 = " in Setting flow"
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r307 = r0
            r0 = r306
            r1 = r307
            X.0fH.A0j(r0, r1)
            r0 = r301
            X.FAn r0 = r0.A03
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb2
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L9d
            r0 = r306
            java.lang.String r1 = "com.facebook.fragment.BUNDLE_EXTRAS"
            android.os.Bundle r0 = r0.getBundle(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto La7
        L9d:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r307 = r0
            r0 = r307
            X.11T.A0B(r0)
        La7:
            r0 = r302
            r1 = r307
            android.content.Intent r0 = X.FAn.A01(r0, r1)
            r307 = r0
            goto L61
        Lb2:
            r0 = r304
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsGDriveRestoreFragment.A06(com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsGDriveRestoreFragment, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A03 = 7zR.A0Y();
        this.A00 = 7zQ.A0l();
        this.A01 = 7zS.A0j(this);
        this.A02 = (C1ud) 1Bi.A03(65997);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            0fH.A0j("EncryptedBackupsGDriveRestoreFragment", "onFragmentCreate with argument null");
            7zT.A1B(this, "flow_type", 96R.A02.value);
            return;
        }
        1BL.A1I(bundle2, "onFragmentCreate with argument ", "EncryptedBackupsGDriveRestoreFragment", AnonymousClass001.A0k());
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            bundle3.putString("flow_type", 96R.A02.value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF6
    public boolean Bkd() {
        String str;
        C9up c9up = this.A0A;
        if (c9up != null) {
            c9up.A07("RESTORE_WITH_GDRIVE_BACK_BUTTON_TAP");
            if (this.mFragmentManager.A0U() > 0 || !A1g()) {
                return false;
            }
            0fH.A0j("EncryptedBackupsGDriveRestoreFragment", "cancel restore backup");
            C9up c9up2 = this.A0A;
            if (c9up2 != null) {
                c9up2.A07("RESTORE_SKIP_CONFIRMATION_ALERT_SHOW");
                if (this.A00 == null) {
                    str = "dialogBuilder";
                } else {
                    Context requireContext = requireContext();
                    MigColorScheme migColorScheme = this.A01;
                    if (migColorScheme != null) {
                        DR6 dr6 = new DR6(requireContext, migColorScheme);
                        dr6.A00(2131964500);
                        dr6.A06(2131964498);
                        C9oG.A02(dr6, this, 34, 2131956450);
                        C9oG.A01(dr6, this, 35, 2131964499);
                        dr6.A05();
                        return true;
                    }
                    str = "colorScheme";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        str = "restoreFlowLogger";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.AXm
    public void BoN(96C r302) {
        C97j c97j;
        int ordinal = r302.ordinal();
        if (ordinal == 3) {
            c97j = C97j.A0e;
        } else if (ordinal == 1) {
            c97j = C97j.A0Y;
        } else {
            if (ordinal != 0) {
                0fH.A0k("EncryptedBackupsGDriveRestoreFragment", AnonymousClass001.A0Z(r302, "invalid restore option presented: ", AnonymousClass001.A0k()));
                return;
            }
            c97j = C97j.A0a;
        }
        A06(this, c97j.key);
    }
}
