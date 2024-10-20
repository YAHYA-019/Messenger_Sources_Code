package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.sdk.mca.MailboxSDK$Reply;

/* renamed from: X.70g, reason: invalid class name */
/* loaded from: 70g.class */
public final class C70g implements 5Q4 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 4kB A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 5oZ A06;

    public C70g(Context context, FbUserSession fbUserSession, 4kB r304, 5oZ r305) {
        11T.A0F(r305, 3);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A06 = r305;
        this.A03 = r304;
        this.A00 = 1Lm.A00(context, fbUserSession, 65961);
        this.A02 = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A01 = 1Bq.A00(68077);
    }

    public boolean BQg(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        return c5fv instanceof 94A;
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        long A00;
        Long A0e;
        1BK.A1M(threadKey, r304);
        11T.A0F(c5fv, 2);
        94A r0 = (94A) c5fv;
        String str3 = r0.A0A;
        if (str3 != null) {
            this.A06.Bc6(this.A04, threadKey, str3, false);
        }
        String str4 = r0.A0B;
        if (str4 == null || (A0e = 0CW.A0e(str4)) == null) {
            1Br.A0C(this.A02);
            A00 = 0Mt.A00();
        } else {
            A00 = A0e.longValue();
        }
        int hashCode = String.valueOf(A00).hashCode();
        4kB r02 = this.A03;
        if (r02 != null) {
            r02.A73(hashCode, "SEND_MESSAGE_API_START");
        }
        5P8 r03 = (5P8) 1Br.A0B(this.A00);
        1Br.A0C(this.A01);
        String A002 = 5QA.A00(threadKey);
        String str5 = r0.A01;
        String path = r0.A00.getPath();
        String str6 = r0.A02;
        if (str6 == null) {
            str6 = "";
        }
        r03.A0P((LoggingOption) null, (MailboxSDK$Reply) null, r304.Alk(), A002, "", str5, path, str6).A00(new Cxf(hashCode, 2, this));
    }
}
