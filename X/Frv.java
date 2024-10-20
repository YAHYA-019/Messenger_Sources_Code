package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.privacyflowtrigger.messenger.MessengerPrivacyFlowActivity;

/* loaded from: Frv.class */
public final class Frv implements 16Y {
    public final int A00;
    public final Object A01;

    public Frv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean BXk(Context context, Uri uri) {
        boolean z;
        switch (this.A00) {
            case 0:
                11T.A0F(uri, 0);
                if (!11T.A0P("https://www.messenger.com/privacy_flow_trigger_close", 1, 11T.A02(uri))) {
                    return false;
                }
                ((FbFragmentActivity) this.A01).finish();
                return true;
            case 1:
                z = false;
                11T.A0F(uri, 0);
                if (11T.A0P("https://www.messenger.com/consent_framework_switch_account", 1, 11T.A02(uri))) {
                    MessengerPrivacyFlowActivity messengerPrivacyFlowActivity = (MessengerPrivacyFlowActivity) this.A01;
                    BKV bkv = messengerPrivacyFlowActivity.A01;
                    if (bkv == null) {
                        bkv = new BKV();
                        messengerPrivacyFlowActivity.A01 = bkv;
                    }
                    06Z BDe = messengerPrivacyFlowActivity.BDe();
                    bkv.A03 = 7zQ.A0m(messengerPrivacyFlowActivity.A0A);
                    if (!bkv.isAdded()) {
                        bkv.A0m(BDe, "MessengerPrivacyFlowActivity");
                        return true;
                    }
                    View view = bkv.mView;
                    if (view == null) {
                        return true;
                    }
                    view.invalidate();
                    return true;
                }
                break;
            default:
                11T.A0F(uri, 0);
                try {
                    Uri A03 = C0A2.A03(uri.toString());
                    if (A03 != null) {
                        z = new 1AI().BXk((Context) this.A01, A03);
                        break;
                    }
                } catch (SecurityException unused) {
                }
                0fH.A0o("GenericXmaYoutubePlayerWebviewPrimitiveComponent", "invalid uri and cannot be parsed");
                return false;
        }
        return z;
    }
}
