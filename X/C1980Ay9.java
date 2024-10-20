package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.inbox.impressiontracker.model.InboxSourceLoggingData;

/* renamed from: X.Ay9, reason: case insensitive filesystem */
/* loaded from: Ay9.class */
public final class C1980Ay9 extends LithoView implements CallerContextable {
    public static final String __redex_internal_original_name = "MarketplaceInboxContentLithoView";
    public C2xd A00;
    public C00i A01;
    public C00i A02;
    public final 2O4 A03;
    public final FbUserSession A04;
    public final C2kx A05;
    public final 2YW A06;
    public final 2Vk A07;
    public final Blb A08;
    public final CDf A09;

    public C1980Ay9(Context context, ViewGroup viewGroup, 06Z r304, 2O4 r305, FbUserSession fbUserSession, 2S4 r307, 2S9 r308, RmO rmO) {
        super(context, (AttributeSet) null);
        this.A04 = fbUserSession;
        this.A01 = 1BV.A00(66544);
        this.A02 = 1BV.A00(968);
        this.A00 = (C2xd) 1Bn.A0A(17153);
        C1F6 A0P = AbF.A0P(this.A02);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            CDf cDf = new CDf(context, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A09 = cDf;
            2YD A09 = this.A00.A09(new InboxSourceLoggingData("MESSENGER_INBOX2", 0S2.A00, null));
            this.A03 = r305;
            this.A01.get();
            CallerContext A06 = CallerContext.A06(C1980Ay9.class);
            2SI r0 = 2SI.A0B;
            LifecycleOwner viewLifecycleOwner = ((Fragment) r304.A0T.A0A().get(0)).getViewLifecycleOwner();
            11T.A0F(viewGroup, 0);
            this.A06 = new 2YW(context, r304, viewLifecycleOwner, fbUserSession, A06, r307, new C5xd(viewGroup), (2YH) null, A09, new B5F(r308, this), r0, (2YX) null, C1311Ado.A00, "unknown");
            this.A07 = new ClO(this, rmO);
            this.A05 = new C2kx();
            this.A08 = new Blb(this, rmO);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
