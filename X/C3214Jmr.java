package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.Jmr, reason: case insensitive filesystem */
/* loaded from: Jmr.class */
public final class C3214Jmr extends L3E {
    public C3214Jmr() {
        super("ACTION_INSTALL_APP");
    }

    public static C3214Jmr A00(Context context, JgX jgX, JgX jgX2) {
        Intent intent;
        if (jgX == null || jgX.A0T() == null || (intent = (Intent) jgX.A0T().getParcelableExtra("extra_install_intent")) == null || !jgX2.A0e()) {
            return null;
        }
        String stringExtra = intent.getStringExtra("extra_app_name");
        C3214Jmr c3214Jmr = new C3214Jmr();
        c3214Jmr.A00 = 2132344951;
        c3214Jmr.A03 = !TextUtils.isEmpty(stringExtra) ? 1BK.A0v(context, stringExtra, 2131951795) : context.getString(2131951794);
        return c3214Jmr;
    }
}
