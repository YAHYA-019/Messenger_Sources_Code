package X;

import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgf.class */
public final class Cgf implements 1Ro {
    public static final String __redex_internal_original_name = "MsgrDeviceSharingFilterMethod";
    public final C00i A01 = AbH.A0T();
    public final C00i A00 = 1BQ.A02(16617);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Bo9 bo9 = (Bo9) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("user_id", bo9.A02));
        A0s.add(new BasicNameValuePair("universe_name", bo9.A01));
        A0s.add(new BasicNameValuePair("param_name", bo9.A00));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A01)));
        String A04 = ((1Oe) this.A00.get()).A04(C1fe.A2Q);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        C04083zw c04083zw = new C04083zw();
        String A00 = 1BJ.A00(201);
        AbF.A1P(c04083zw, A00);
        return AbK.A0M(c04083zw, A00, A0s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0.A0O() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object B7m(X.AnonymousClass439 r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            X.24X r0 = X.AbH.A0w(r0)
            r304 = r0
            r0 = r304
            java.lang.String r1 = "is_passed"
            X.24X r0 = r0.A0D(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L21
            r0 = r305
            boolean r0 = r0.A0O()
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L26
        L21:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
        L26:
            com.facebook.auth.protocol.MsgrDeviceSharingFilterResult r0 = new com.facebook.auth.protocol.MsgrDeviceSharingFilterResult
            r305 = r0
            r0 = r305
            r1 = r307
            r0.<init>(r1)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cgf.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
