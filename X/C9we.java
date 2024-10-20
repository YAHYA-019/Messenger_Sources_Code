package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9we, reason: invalid class name */
/* loaded from: 9we.class */
public final class C9we implements DFN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ 6BK A03;
    public final /* synthetic */ Message A04;
    public final /* synthetic */ 7Wh A05;
    public final /* synthetic */ 7X1 A06;
    public final /* synthetic */ 7X0 A07;
    public final /* synthetic */ 7Ww A08;
    public final /* synthetic */ MigColorScheme A09;
    public final /* synthetic */ 7Lj A0A;
    public final /* synthetic */ 7LX A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;

    public C9we(View view, FbUserSession fbUserSession, 6BK r304, Message message, 7Wh r306, 7X1 r307, 7X0 r308, 7Ww r309, MigColorScheme migColorScheme, 7Lj r311, 7LX r312, String str, String str2, int i) {
        this.A07 = r308;
        this.A0D = str;
        this.A0C = str2;
        this.A03 = r304;
        this.A00 = i;
        this.A09 = migColorScheme;
        this.A01 = view;
        this.A08 = r309;
        this.A04 = message;
        this.A06 = r307;
        this.A05 = r306;
        this.A0A = r311;
        this.A0B = r312;
        this.A02 = fbUserSession;
    }

    public final void CHW(6BK r302) {
        try {
            if (r302 != null) {
                7Ww r0 = this.A08;
                String str = this.A0C;
                View view = this.A01;
                Message message = this.A04;
                7X1 r02 = this.A06;
                r0.A07(view, this.A02, r302, message, this.A05, r02, this.A0A, this.A0B, str, str, (String) null);
                return;
            }
            7X0 r03 = this.A07;
            C01s A04 = 1Br.A04(r03.A07);
            String str2 = this.A0D;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Unable to load cta; type: ");
            A0k.append(this.A0C);
            A0k.append(", title: ");
            A0k.append(this.A03.A0o());
            A0k.append(", ctaId: ");
            A0k.append(this.A00);
            A04.D0v(str2, A0k.toString());
            7X0.A01(this.A01, r03, this.A09, str2);
        } catch (AIB unused) {
            7X0.A01(this.A01, this.A07, this.A09, this.A0D);
        }
    }
}
