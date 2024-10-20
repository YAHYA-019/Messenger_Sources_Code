package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;

/* loaded from: C1U.class */
public final /* synthetic */ class C1U {
    public final /* synthetic */ C49 A00;

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6, int i, long j) {
        C49 c49 = this.A00;
        7zP.A1S(str, str2, str3);
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(2971616476299527L));
        C00683ob c00683ob = (C00683ob) c49.A00.get();
        Integer valueOf = Integer.valueOf((-1) >>> 1);
        1Um AQV = c00683ob.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new N7i(A0P, newPrivacyContextNative, c00683ob, valueOf, str, str2, str3, str4, str5, str6, i, j), A0P, false);
        A0P.addResultCallback(null);
    }
}
