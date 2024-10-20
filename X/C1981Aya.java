package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.status.suggestions.StatusSuggestion;
import com.facebook.ui.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Aya, reason: case insensitive filesystem */
/* loaded from: Aya.class */
public final class C1981Aya extends C1rj {
    public MigColorScheme A00;
    public Bnl A01;
    public List A02;

    public C1981Aya() {
        super("StatusSuggestionsList");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A02;
        List list = this.A02;
        Bnl bnl = this.A01;
        MigColorScheme migColorScheme = this.A00;
        11T.A0F(r302, 0);
        1BL.A1H(list, bnl, migColorScheme);
        C22a A0u = 7zQ.A0u();
        C90 c90 = (C90) 1Bn.A0A(83582);
        8T0 A00 = 8mB.A00(r302);
        ArrayList A0s = AnonymousClass001.A0s();
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                A00.A2Y(0DW.A00(A0s));
                A00.A0R();
                A00.A0J();
                8mB r0 = A00.A01;
                11T.A0A(r0);
                return r0;
            }
            StatusSuggestion statusSuggestion = (StatusSuggestion) list.get(i2);
            Emoji emoji = statusSuggestion.A01;
            Context context = r302.A0D;
            C6ka AjP = A0u.AjP(emoji, 3yG.A04(4YU.A0C(context), 24.0f));
            55A A002 = 5OL.A00(statusSuggestion.A02);
            if (A002 != null) {
                AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                A0V.A05 = new C58v(AjP, 0, 0, true);
                A0V.A03(A002);
                A0V.A01();
                long j = statusSuggestion.A00;
                if (statusSuggestion.A03) {
                    A02 = c90.A02(7zM.A0B(context), 2131955349, 2131955351, 2131955347, c90.A01(j));
                } else {
                    Resources resources = context.getResources();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    A02 = resources.getQuantityString(2131820588, (int) timeUnit.toHours(j), AnonymousClass001.A1a((int) timeUnit.toHours(j)));
                    11T.A0D(A02);
                }
                A0V.A07(A02);
                CvL cvL = new CvL(i2, 4, bnl, statusSuggestion);
                Rrz rrz = new Rrz(statusSuggestion, bnl, i2);
                A0V.A01 = cvL;
                A0V.A02 = rrz;
                A0V.A02(new 55G(new Rs0(statusSuggestion, bnl, i2)));
                AnonymousClass544 A003 = A0V.A00();
                if (A003 != null) {
                    A0s.add(A003);
                }
            }
            i = i2 + 1;
        }
    }
}
