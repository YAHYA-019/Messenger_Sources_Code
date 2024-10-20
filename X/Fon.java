package X;

import android.content.res.Resources;
import com.facebook.inject.FbInjector;

/* loaded from: Fon.class */
public final class Fon implements GIM {
    public final Resources A00 = FbInjector.A00().getResources();

    public String AkS(GFy gFy) {
        return this.A00.getString(2131953853);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r0.matches("^[\\u0014-\\u007E]*$") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BTX(X.GFy r302) {
        /*
            r301 = this;
            r0 = r302
            java.lang.String r0 = r0.Aqy()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L41
            r0 = r303
            java.lang.String r0 = r0.trim()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L41
            r0 = r304
            int r0 = r0.length()
            r305 = r0
            r0 = 2
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 < r1) goto L41
            r0 = 45
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 > r1) goto L41
            java.lang.String r0 = "^[\\u0014-\\u007E]*$"
            r303 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.matches(r1)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L44
        L41:
            r0 = 0
            r305 = r0
        L44:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fon.BTX(X.GFy):boolean");
    }
}
