package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8h1, reason: invalid class name */
/* loaded from: 8h1.class */
public final class C8h1 extends 1LH {
    public static final CallerContext A07 = CallerContext.A0B("MemoryViewerComponent");
    public final LithoView A00;
    public final C9mY A01;
    public final MemoryViewModel A02;
    public final C9Jf A03;
    public final 9lM A04;
    public final MigColorScheme A05;
    public final boolean A06;

    public C8h1(LithoView lithoView, C9mY c9mY, MemoryViewModel memoryViewModel, C9Jf c9Jf, 9lM r306, MigColorScheme migColorScheme, boolean z) {
        7zP.A1L(migColorScheme, 2, c9mY);
        this.A00 = lithoView;
        this.A05 = migColorScheme;
        this.A02 = memoryViewModel;
        this.A06 = z;
        this.A04 = r306;
        this.A01 = c9mY;
        this.A03 = c9Jf;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI c8c4;
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        FbUserSession A01 = 1Fw.A01(r0.A0D);
        2lQ r02 = 2lO.A02;
        2lO A04 = C82m.A04(C82m.A06(0S2.A01, 100.0f, 0), 0S2.A00, 100.0f, 0);
        C2sn A0U = 7zQ.A0U(r0);
        new C2sn(A0U.AeS(), AnonymousClass001.A0s());
        MemoryViewModel memoryViewModel = this.A02;
        if (memoryViewModel.A0R) {
            MigColorScheme migColorScheme = this.A05;
            c8c4 = new C8c5(memoryViewModel, this.A03, this.A04, migColorScheme, new AQd(A01, this, 21), this.A06);
        } else {
            LithoView lithoView = this.A00;
            MigColorScheme migColorScheme2 = this.A05;
            c8c4 = new C8c4(lithoView, memoryViewModel, this.A03, this.A04, migColorScheme2, new AQr(this, 31));
        }
        return 7zM.A0l(c8c4, A0U, c2k5, A04);
    }
}
