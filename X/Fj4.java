package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: Fj4.class */
public final class Fj4 implements MIS {
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 98695);
    public final C00i A01 = 1BV.A01((1BY) null, 98444);

    public Fj4(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public String Awg() {
        return "ACTION_REPORT";
    }

    public void BMD(Context context, Bundle bundle, java.util.Map map) {
        if (map.containsKey("url") && (map.get("url") instanceof String)) {
            String A0b = AnonymousClass001.A0b("screenshot_uri", map);
            map.get("url");
            C00i c00i = this.A02;
            c00i.get();
            c00i.get();
            String string = bundle != null ? bundle.getString("thread_id") : null;
            F6X f6x = (F6X) this.A01.get();
            Context context2 = f6x.A01;
            L5x.A01(context2, null, "ACTION_REPORT_START", true, false);
            1BK.A1E(f6x.A04).execute(new G4t(4YV.A0D(context2), f6x, A0b, string));
        }
    }
}
