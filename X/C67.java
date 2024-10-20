package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: C67.class */
public final class C67 {
    public 06Z A00;
    public EnumC3499Mfu A01;
    public FbUserSession A02;
    public ThreadSummary A03;
    public MigColorScheme A04;
    public String A05;
    public String A06;
    public String A07;
    public final Context A08;
    public final String A09;

    public C67(Context context, String str) {
        this.A09 = str;
        this.A08 = context;
    }

    public BdH A00() {
        return new BdH((BaV) C1Y6.A00(this.A08, "com_facebook_messaging_communitymessaging_plugins_interfaces_externalsharehscrollbutton_ExternalShareHscrollButtonInterfaceSpec", this.A09, new Object[]{this.A04, this.A00, this.A03, this.A06, this.A07, this.A05, this.A02, this.A01}));
    }
}
