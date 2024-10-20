package X;

import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicksilver.webviewservice.QuicksilverSandboxConsentBottomSheetActivity;

/* loaded from: Fdw.class */
public final class Fdw implements InterfaceC06574hb {
    public final int A00;
    public final Object A01;

    public Fdw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC06574hb
    public final void Bu5(EAX eax) {
        switch (this.A00) {
            case 0:
                11T.A0F(eax, 0);
                7zL.A1T(this.A01, eax);
                return;
            case 1:
                ((FbFragmentActivity) this.A01).finish();
                return;
            case 2:
                Fcc fcc = (Fcc) this.A01;
                CallerContext callerContext = Fcc.A0B;
                fcc.A00 = null;
                return;
            default:
                QuicksilverSandboxConsentBottomSheetActivity.A16(EQZ.A04, (QuicksilverSandboxConsentBottomSheetActivity) this.A01, "dismiss");
                return;
        }
    }
}
