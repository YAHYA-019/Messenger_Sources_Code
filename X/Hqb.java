package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;

/* loaded from: Hqb.class */
public final class Hqb {
    public int A00;
    public long A01;
    public C2613Gj2 A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final 1Br A09 = 1BK.A0C();
    public final Context A0A;
    public final H9g A0B;
    public final String A0C;
    public final /* synthetic */ HrH A0D;

    public Hqb(Context context, HrH hrH, H9g h9g, String str) {
        this.A0D = hrH;
        this.A0A = context;
        this.A0B = h9g;
        this.A0C = str;
    }

    public Intent A00() {
        4zJ r0 = 4zI.A03;
        H9g h9g = this.A0B;
        r0.A05("InCallActivityIntentBuilderFactoryImpl", "Building Fragment Intent with action %s", new Object[]{h9g});
        Intent A0D = C3o5.A0D(this.A0A, this.A0D.A01());
        A0D.setAction(h9g.ordinal() != 0 ? "com.facebook.rtc.fbwebrtc.intent.action.HOSTED_FRAGMENT_INCOMING_CALL" : "com.facebook.rtc.fbwebrtc.intent.action.HOSTED_FRAGMENT_SHOW_UI");
        long j = this.A01;
        if (j != 0) {
            A0D.putExtra("CONTACT_ID", j);
        }
        String str = this.A0C;
        if (str != null) {
            A0D.putExtra("LOCAL_CALL_ID", str);
        } else if (h9g != H9g.A03) {
            r0.A09("InCallActivityIntentBuilderFactoryImpl", "localCallId == null when building call Activity Intent", new Object[0]);
            if (!AbG.A1b(1Br.A07(this.A09), 36320232024849579L)) {
                throw AnonymousClass001.A0N("Attempted to create InCallActivity without localCallId");
            }
        }
        if (this.A06) {
            A0D.putExtra("END_CALL", true);
        }
        if (this.A04) {
            A0D.putExtra("ACCEPT_WITHOUT_UI", true);
        }
        if (this.A05) {
            A0D.putExtra("AUTO_ACCEPT", true);
        }
        if (this.A08) {
            A0D.putExtra("STOP_SCREEN_SHARING", true);
        }
        if (this.A07) {
            A0D.putExtra("SHOULD_LAUNCH_IN_PICTURE_IN_PICTURE", true);
        } else {
            this.A00 |= 65536;
        }
        String str2 = this.A03;
        if (str2 != null) {
            A0D.putExtra(JQw.A00(ActionId.VIEW_DID_APPEAR_BEGIN), str2);
        }
        C2613Gj2 c2613Gj2 = this.A02;
        if (c2613Gj2 != null) {
            A0D.putExtra("multi_call_bundle", (Bundle) c2613Gj2.A02.getValue());
        }
        A0D.addFlags(this.A00);
        return A0D;
    }
}
