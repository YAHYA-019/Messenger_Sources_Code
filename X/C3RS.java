package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3RS, reason: invalid class name */
/* loaded from: 3RS.class */
public abstract class C3RS {
    public static final java.util.Map A00 = 1BK.A1C();

    public static final ArrayList A00(List list) {
        11T.A0F(list, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            3M3 r0 = (3M3) it.next();
            0DA r02 = new 0DA();
            24X A0D = r0.A03.A0D("is_sponsored");
            boolean z = true;
            if (A0D == null ? r0.A00 == null : A0D.A03() <= 0) {
                z = false;
            }
            r02.A03("is_ad", Boolean.valueOf(z));
            String str = r0.A01;
            if (str != null) {
                r02.A07("tracking", str);
            }
            String str2 = r0.A00;
            if (str2 != null) {
                r02.A07("ad_id", str2);
            }
            String str3 = r0.A02;
            if (str3 != null) {
                r02.A07(DKB.A00(551), str3);
            }
            A0s.add(r02);
        }
        return A0s;
    }

    public static final ArrayList A01(List list) {
        11T.A0F(list, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            3KA r0 = (3KA) it.next();
            0DA r02 = new 0DA();
            r02.A01(r0.A00, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            Integer num = r0.A01;
            if (num != null) {
                r02.A06("index", 1BK.A0l(num.intValue()));
            }
            A0s.add(r02);
        }
        return A0s;
    }
}
