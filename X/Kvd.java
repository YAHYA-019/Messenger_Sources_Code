package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: Kvd.class */
public abstract class Kvd {
    public static final 03Y A00(L4Z l4z) {
        String str;
        Object[] objArr;
        String str2;
        String A00 = KVi.A00(l4z.A01.A04);
        Boolean bool = false;
        String str3 = "";
        if (AnonymousClass001.A1O(A00.length())) {
            str = "BwPCookieWorks";
            objArr = new Object[0];
            str2 = "Invalid url";
        } else {
            str = "BwPCookieWorks";
            objArr = new Object[0];
            if (l4z.A03(A00)) {
                LCd.A03(str, "URL is validated", objArr);
                bool = true;
                Uri A03 = C0A2.A03(A00);
                11T.A0A(A03);
                str3 = 11T.A02(A03.buildUpon().clearQuery().build());
                return 1BK.A1G(bool, str3);
            }
            str2 = "Domain not allowed to set cookies or local storage";
        }
        LCd.A03(str, str2, objArr);
        return 1BK.A1G(bool, str3);
    }

    public static final void A01(Context context, L4Z l4z) {
        11T.A0F(l4z, 1);
        03Y A00 = A00(l4z);
        boolean A1V = AnonymousClass001.A1V(A00.first);
        String str = (String) A00.second;
        if (A1V) {
            HashMap A0u = AnonymousClass001.A0u();
            ArrayList A0s = AnonymousClass001.A0s();
            L52 l52 = new L52();
            KmT kmT = l4z.A04;
            String str2 = kmT.A02;
            DqM dqM = l4z.A01;
            String str3 = dqM.A02;
            StringBuilder sb = l52.A00;
            JR0.A1J(sb, str2);
            JR0.A1I(sb, str3);
            Object obj = dqM.A01;
            Integer num = 0S2.A01;
            L52.A00(l52, obj == num ? kmT.A03 : kmT.A04);
            long j = kmT.A00;
            JR0.A1J(sb, "Max-Age");
            sb.append(j);
            String A0d = AnonymousClass001.A0d(";", sb);
            11T.A0A(A0d);
            A0s.add(A0d);
            Kio kio = l4z.A03;
            String str4 = kio.A02;
            if (str4 != null && str4.length() != 0) {
                L52 l522 = new L52();
                String str5 = kmT.A01;
                StringBuilder sb2 = l522.A00;
                JR0.A1J(sb2, str5);
                JR0.A1I(sb2, str4);
                L52.A00(l522, obj == num ? kmT.A03 : kmT.A04);
                l522.A04(kio.A00);
                A0s.add(11T.A02(sb2));
            }
            A0u.put(l4z.A02 ? "https://.shop-external.amazon" : str, A0s);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("For url ");
            A0k.append(str);
            LCd.A03("BwPCookieWorks", AnonymousClass001.A0Z(A0u, ", setting bwp cookies- ", A0k), new Object[0]);
            L9d.A02(context, A0u, true);
        }
    }
}
