package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.viewdata.viewstate.ViewState;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbMigrationPinCreationFragment;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.fragment.EbOneTimeCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData;

/* renamed from: X.9sj, reason: invalid class name */
/* loaded from: 9sj.class */
public final class C9sj implements InterfaceC00733og {
    public final int A00;
    public final Object A01;

    public C9sj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [X.B4e, androidx.fragment.app.Fragment] */
    @Override // X.InterfaceC00733og
    public void CCx() {
        LithoView A1c;
        C2iw c2iw;
        String str;
        String str2;
        EbOneTimeCodeRestoreFragment ebOneTimeCodeRestoreFragment;
        switch (this.A00) {
            case 0:
                8rY r0 = (8rY) this.A01;
                ((MessagingPerformanceLogger) r0.A08.get()).A0a(C2rv.A00(r0.getContext()));
                return;
            case 1:
                HsmPinCodeRestoreFragment hsmPinCodeRestoreFragment = (HsmPinCodeRestoreFragment) this.A01;
                if (!hsmPinCodeRestoreFragment.A05) {
                    hsmPinCodeRestoreFragment.A1c();
                    8oE.A01(hsmPinCodeRestoreFragment.A0A, hsmPinCodeRestoreFragment.A1m().A02);
                    hsmPinCodeRestoreFragment.A05 = true;
                }
                if (11T.A0O(hsmPinCodeRestoreFragment.A1m().A08.getValue(), ViewState.Loading.A00)) {
                    return;
                }
                HsmPinCodeRestoreFragment.A0B(hsmPinCodeRestoreFragment);
                return;
            case 2:
                HsmPinCodeRestoreFragment hsmPinCodeRestoreFragment2 = (HsmPinCodeRestoreFragment) this.A01;
                hsmPinCodeRestoreFragment2.A1c();
                C2iw c2iw2 = hsmPinCodeRestoreFragment2.A0A;
                8oE.A01(c2iw2, hsmPinCodeRestoreFragment2.A1m().A02);
                hsmPinCodeRestoreFragment2.A1c();
                7zT.A1K(c2iw2, -1401700402);
                A1c = hsmPinCodeRestoreFragment2.A1c();
                A1c.A03 = null;
                return;
            case 3:
                HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment = (HsmPinCodeSetupBaseFragment) this.A01;
                if (!hsmPinCodeSetupBaseFragment.A06) {
                    hsmPinCodeSetupBaseFragment.A06 = true;
                    hsmPinCodeSetupBaseFragment.A1c();
                    8oE.A01(hsmPinCodeSetupBaseFragment.A08, hsmPinCodeSetupBaseFragment.A1m().A01);
                }
                if (9lN.A01(hsmPinCodeSetupBaseFragment)) {
                    return;
                }
                hsmPinCodeSetupBaseFragment.A1s();
                return;
            case 4:
                EbMigrationPinCreationFragment ebMigrationPinCreationFragment = (EbMigrationPinCreationFragment) this.A01;
                ebMigrationPinCreationFragment.A1c();
                c2iw = ebMigrationPinCreationFragment.A06;
                9lO r02 = ebMigrationPinCreationFragment.A01;
                if (r02 != null) {
                    str = r02.A02;
                    ebOneTimeCodeRestoreFragment = ebMigrationPinCreationFragment;
                    8oE.A01(c2iw, str);
                    ebOneTimeCodeRestoreFragment.A1c().A03 = null;
                    return;
                }
                str2 = "viewData";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            case 5:
                EbOneTimeCodeRestoreFragment ebOneTimeCodeRestoreFragment2 = (EbOneTimeCodeRestoreFragment) this.A01;
                ebOneTimeCodeRestoreFragment2.A1c();
                c2iw = ebOneTimeCodeRestoreFragment2.A09;
                EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = ebOneTimeCodeRestoreFragment2.A04;
                if (ebOneTimeCodeRestoreViewData != null) {
                    str = ebOneTimeCodeRestoreViewData.A00;
                    ebOneTimeCodeRestoreFragment = ebOneTimeCodeRestoreFragment2;
                    8oE.A01(c2iw, str);
                    ebOneTimeCodeRestoreFragment.A1c().A03 = null;
                    return;
                }
                str2 = "viewData";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            default:
                ?? r03 = (B4e) this.A01;
                ((MessagingPerformanceLogger) 1Br.A0B(r03.A0X)).A0a(C2rv.A00(r03.getContext()));
                A1c = r03.A05;
                if (A1c == null) {
                    str2 = "contactsListView";
                    11T.A0L(str2);
                    throw 0Q8.createAndThrow();
                }
                A1c.A03 = null;
                return;
        }
    }
}
