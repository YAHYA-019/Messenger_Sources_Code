package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: Fj3.class */
public final class Fj3 implements MIS {
    public 1BY A00;
    public final Epv A01 = (Epv) 1Bn.A0B(100018);

    public Fj3(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public String Awg() {
        return "COPY_LINK";
    }

    public void BMD(Context context, Bundle bundle, java.util.Map map) {
        if (map.containsKey("url") && (map.get("url") instanceof String)) {
            Object obj = map.get("url");
            Epv epv = this.A01;
            11T.A0F(obj, 0);
            MS5 ms5 = epv.A00;
            ms5.sendMessage(ms5.obtainMessage(1, obj));
        }
    }
}
