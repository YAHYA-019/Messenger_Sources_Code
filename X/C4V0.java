package X;

import android.content.Intent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.4V0, reason: invalid class name */
/* loaded from: 4V0.class */
public final class C4V0 {
    public final 04J A00;

    public C4V0(04J r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public static final ArrayList A00(Intent intent, String str) {
        String stringExtra = intent != null ? intent.getStringExtra(str) : null;
        ArrayList A0s = AnonymousClass001.A0s();
        if (stringExtra != null) {
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    11T.A0A(string);
                    A0s.add(string);
                }
            } catch (JSONException unused) {
            }
        }
        return A0s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0245, code lost:
    
        if (r312 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (r0 == (-1)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0426  */
    /* JADX WARN: Type inference failed for: r0v145, types: [X.0Jj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v166, types: [X.0Jj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(android.content.Context r302, android.content.Intent r303, android.content.Intent r304, android.content.Intent r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4V0.A01(android.content.Context, android.content.Intent, android.content.Intent, android.content.Intent, java.lang.String):void");
    }
}
