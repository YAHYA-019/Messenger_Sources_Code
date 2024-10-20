package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ceb.class */
public final class Ceb implements GJL {
    public final 1Br A01 = 1Bu.A00(147859);
    public final 1Br A02 = 1Bu.A00(84009);
    public final 1Br A03 = 1Bq.A00(84013);
    public final 1Br A00 = 1Bq.A00(84964);

    public Intent Arc(Context context, String str) {
        11T.A0F(str, 1);
        if (context == null) {
            return null;
        }
        if (((context instanceof ContextThemeWrapper) && ((ContextWrapper) context).getBaseContext() == null) || !"/checkpoint/block".equals(str)) {
            return null;
        }
        1Br.A0C(this.A01);
        Brn brn = (Brn) 1Br.A0B(this.A02);
        String str2 = ((C5H) 1Br.A0B(this.A00)).A01;
        FbUserSession A03 = 1Br.A03(brn.A02);
        FIu fIu = (FIu) 1Br.A0B(brn.A00);
        Uri build = ((C00241ai) 1Br.A0B(brn.A01)).A01().Axy().path("/checkpoint/block").build();
        11T.A0A(build);
        return FIu.A00(context, build, A03, fIu, BSU.A00(str2));
    }

    public Intent Ard(Context context, String str) {
        11T.A0H(context, str);
        return Cec.A00(context, (Cec) 1Br.A0B(this.A03), str);
    }

    public Intent Arj(Context context, String str) {
        11T.A0H(context, str);
        return Ard(context, str);
    }
}
