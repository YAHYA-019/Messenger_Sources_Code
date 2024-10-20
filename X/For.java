package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.inject.FbInjector;
import com.google.common.base.Splitter;
import java.util.Calendar;

/* loaded from: For.class */
public final class For implements GIM {
    public final Resources A00;
    public final C0dp A01;
    public final Calendar A02;

    public For() {
        C0dp A0B = AbI.A0B();
        Context A00 = FbInjector.A00();
        this.A01 = A0B;
        this.A02 = Calendar.getInstance();
        this.A00 = A00.getResources();
    }

    public String AkS(GFy gFy) {
        return this.A00.getString(2131952357);
    }

    public boolean BTX(GFy gFy) {
        String Aqy = gFy.Aqy();
        boolean z = false;
        if (!1JF.A0B(Aqy) && Aqy.matches("\\d{2}\\/\\d{2}")) {
            long now = this.A01.now();
            Splitter.AnonymousClass5 anonymousClass5 = new Splitter.AnonymousClass5(Aqy);
            String str = (String) 2Ri.A0B(anonymousClass5, 0);
            String str2 = (String) 2Ri.A0B(anonymousClass5, 1);
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int i = parseInt - 1;
            if (i >= 0 && i <= 11) {
                Calendar calendar = this.A02;
                calendar.setTimeInMillis(now);
                int i2 = calendar.get(1) - 2000;
                int i3 = calendar.get(2);
                if (parseInt2 > i2 || (parseInt2 == i2 && i >= i3)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
