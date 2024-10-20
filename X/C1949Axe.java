package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.GenAIChatSuggestion;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Axe, reason: case insensitive filesystem */
/* loaded from: Axe.class */
public final class C1949Axe extends 1LH {
    public final CIp A00;
    public final 9Hk A01;
    public final GenAIChatSuggestion A02;
    public final String A03;
    public final Function1 A04;
    public final MigColorScheme A05;

    public C1949Axe(CIp cIp, 9Hk r303, GenAIChatSuggestion genAIChatSuggestion, MigColorScheme migColorScheme, String str, Function1 function1) {
        11T.A0F(migColorScheme, 3);
        this.A02 = genAIChatSuggestion;
        this.A03 = str;
        this.A05 = migColorScheme;
        this.A01 = r303;
        this.A00 = cIp;
        this.A04 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Context context = r0.A0D;
        FbUserSession A01 = 1Fw.A01(context);
        2fZ r02 = (2fZ) 1Lm.A05(context, A01, 17067);
        GenAIChatSuggestion genAIChatSuggestion = this.A02;
        long j = genAIChatSuggestion.A00;
        11T.A0F(A01, 0);
        boolean A00 = AbK.A0T(context, A01).A00(1, j);
        int i = 2131966512;
        if (A00) {
            i = 2131955224;
        }
        8Lf r03 = new 8Lf(new CZB(0, this, A00), new C9py(this, 37), 3yH.A09(c2k5, i), 3yH.A09(c2k5, 2131964407));
        8Tn A002 = C8nn.A00(r0);
        A002.A2a(this.A05);
        String str = genAIChatSuggestion.A06;
        String str2 = genAIChatSuggestion.A02;
        String str3 = genAIChatSuggestion.A05;
        if (str3 == null) {
            str3 = "";
        }
        Uri uri = null;
        try {
            uri = C0A2.A03(str3);
        } catch (SecurityException unused) {
        }
        A002.A2Y(new 8NJ(r03, new BCz(r02.A0B(uri, C2fd.A0T)), str2, (CharSequence) null, str, (List) null, true));
        A002.A2X();
        A002.A1m(7zO.A0U(new AR7(c2k5, this, 18)));
        return A002.A2W();
    }
}
