package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9zt, reason: invalid class name */
/* loaded from: 9zt.class */
public final class C9zt implements 7La {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ Message A02;
    public final /* synthetic */ 7Wh A03;
    public final /* synthetic */ 7X0 A04;
    public final /* synthetic */ 7Ww A05;
    public final /* synthetic */ MigColorScheme A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public C9zt(Context context, FbUserSession fbUserSession, Message message, 7Wh r305, 7X0 r306, 7Ww r307, MigColorScheme migColorScheme, String str, String str2, String str3) {
        this.A04 = r306;
        this.A02 = message;
        this.A00 = context;
        this.A07 = str;
        this.A05 = r307;
        this.A09 = str2;
        this.A03 = r305;
        this.A01 = fbUserSession;
        this.A06 = migColorScheme;
        this.A08 = str3;
    }

    public final void BoZ(View view, 1Iw r303, 7Lj r304, 7LX r305) {
        11T.A0F(r303, 0);
        1BL.A1H(view, r305, r304);
        7X0 r0 = this.A04;
        7Lt r02 = (7Lt) 1Br.A0B(r0.A09);
        Message message = this.A02;
        r02.A0K(this.A00, message, (String) null);
        9Xb r03 = (9Xb) 1Br.A0B(r0.A04);
        String str = this.A07;
        String A00 = 4YT.A00(81);
        r03.A00(message, A00, str);
        try {
            7Ww r04 = this.A05;
            String str2 = this.A09;
            r04.A07(view, this.A01, (6BK) null, message, this.A03, (7X1) null, r304, r305, A00, A00, str2);
        } catch (AIB unused) {
            7X0.A01(view, r0, this.A06, this.A08);
        }
    }
}
