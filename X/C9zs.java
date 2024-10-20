package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9zs, reason: invalid class name */
/* loaded from: 9zs.class */
public final class C9zs implements 7La {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 6Az A01;
    public final /* synthetic */ 6BK A02;
    public final /* synthetic */ AnonymousClass622 A03;
    public final /* synthetic */ 7Wh A04;
    public final /* synthetic */ 9hF A05;
    public final /* synthetic */ MigColorScheme A06;

    public C9zs(FbUserSession fbUserSession, 6Az r303, 6BK r304, AnonymousClass622 anonymousClass622, 7Wh r306, 9hF r307, MigColorScheme migColorScheme) {
        this.A05 = r307;
        this.A00 = fbUserSession;
        this.A06 = migColorScheme;
        this.A03 = anonymousClass622;
        this.A01 = r303;
        this.A04 = r306;
        this.A02 = r304;
    }

    public final void BoZ(final View view, 1Iw r303, final 7Lj r304, final 7LX r305) {
        11T.A0F(r303, 0);
        1BL.A1H(view, r305, r304);
        final 9hF r0 = this.A05;
        final FbUserSession fbUserSession = this.A00;
        final MigColorScheme migColorScheme = this.A06;
        final AnonymousClass622 anonymousClass622 = this.A03;
        final 7X1 r02 = new 7X1(this.A01, (String) null);
        final 7Wh r03 = this.A04;
        2JY r04 = this.A02;
        2JY r05 = r04;
        final int intValue = r05.getIntValue(-1350568534);
        final String BHd = r04.BHd();
        final String A0o = r05.A0o();
        if (BHd == null) {
            1Br.A04(r0.A02).D0v("SharedStackCtaHandler", 4YT.A00(559));
            return;
        }
        ((9XI) 1Br.A0B(r0.A03)).A00(fbUserSession, new DFN() { // from class: X.9wd
            public final void CHW(6BK r302) {
                try {
                    if (r302 != null) {
                        7Ww r06 = r0.A04;
                        String str = BHd;
                        View view2 = view;
                        Message message = anonymousClass622.A03;
                        7X1 r07 = r02;
                        r06.A07(view2, fbUserSession, r302, message, r03, r07, r304, r305, str, str, (String) null);
                        return;
                    }
                    9hF r08 = r0;
                    C01s A04 = 1Br.A04(r08.A02);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Unable to load cta. type: ");
                    A0k.append(BHd);
                    A0k.append(", title: ");
                    A0k.append(A0o);
                    A0k.append(", ctaId: ");
                    A0k.append(intValue);
                    A04.D0v("SharedStackCtaHandler", A0k.toString());
                    9hF.A00(view, r08, migColorScheme);
                } catch (AIB unused) {
                    9hF.A00(view, r0, migColorScheme);
                }
            }
        }, 4YV.A11(r0.A00), intValue);
    }
}
