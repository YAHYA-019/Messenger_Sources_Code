package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.PlatformLogger;
import java.util.ArrayList;

/* loaded from: A57.class */
public final class A57 implements 5Q4 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 4kB A05;
    public final Context A06;
    public final FbUserSession A07;
    public final 1De A08;
    public final 5oZ A09;

    public A57(FbUserSession fbUserSession, 1De r303, 4kB r304, 5oZ r305) {
        11T.A0F(r305, 3);
        this.A08 = r303;
        this.A07 = fbUserSession;
        this.A09 = r305;
        this.A05 = r304;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 65962);
        this.A00 = 1Bu.A03(r0, 67778);
        this.A04 = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A03 = 1BK.A0C();
        this.A02 = 1Bq.A00(68243);
        this.A06 = 7zQ.A0I(r0);
    }

    public boolean BQg(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        if (!(c5fv instanceof 5gC)) {
            return false;
        }
        5gC r0 = (5gC) c5fv;
        return r0.A01 == null || ((7T7) 1Br.A0B(this.A02)).A02(r0.A02);
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        5gC r0;
        long A00;
        Long A0e;
        11T.A0F(threadKey, 0);
        11T.A0G(r304, 1, c5fv);
        ArrayList arrayList = null;
        if (!(c5fv instanceof 5gC) || (r0 = (5gC) c5fv) == null) {
            return;
        }
        C5fu c5fu = (C5fu) c5fv;
        String str3 = c5fu.A0B;
        if (str3 == null || (A0e = 0CW.A0e(str3)) == null) {
            1Br.A0C(this.A04);
            A00 = 0Mt.A00();
        } else {
            A00 = A0e.longValue();
        }
        String valueOf = String.valueOf(A00);
        if (threadKey.A12() && 1Br.A07(this.A03).AZk(36326416777762404L)) {
            PlatformLogger.platformEventStartS2STrace(valueOf);
            PlatformLogger.platformEventLogS2STraceStartPointAnnotation(valueOf, "TamTextMessageSendBinder");
            PlatformLogger.platformEventStructuredLoggerFBNS2SEventThreadTypeAnnotation(valueOf, threadKey.A06.toString());
            Context context = this.A06;
            PlatformLogger.platformEventStructuredLoggerFBNS2SEventSendEntryPointAnnotation(valueOf, 5Pq.A00(context));
            long j = threadKey.A01;
            FbUserSession fbUserSession = this.A07;
            11T.A0F(context, 3);
            ((5P5) 1Lo.A04(context, fbUserSession, (1BY) null, 67488)).A00(new A01(valueOf), j);
            String str4 = c5fu.A0A;
            if (str4 != null) {
                PlatformLogger.platformEventStructuredLoggerAdd1TidTraceIdWithAliasId(valueOf, str4);
            }
        }
        String str5 = c5fu.A0A;
        if (str5 != null) {
            5oZ r02 = this.A09;
            Context context2 = this.A06;
            r02.Bc6(context2, threadKey, str5, true);
            if (!1Br.A07(this.A03).AZk(36326416777762404L)) {
                PlatformLogger.platformEventStructuredLoggerFBNS2SEventSendEntryPointAnnotation(valueOf, 5Pq.A00(context2));
            }
        }
        if (str3 != null) {
            int hashCode = str3.hashCode();
            4kB r03 = this.A05;
            if (r03 != null) {
                r03.A73(hashCode, "SEND_MESSAGE_API_START");
            }
        }
        CharSequence charSequence = r0.A02;
        ArrayList A01 = charSequence != null ? ((7T7) 1Br.A0B(this.A02)).A01(threadKey, charSequence) : null;
        22C r04 = (22C) 1Br.A0B(this.A01);
        long A0s = threadKey.A0s();
        Long B33 = r304.B33();
        if (B33 == null) {
            throw 1BK.A0h();
        }
        long longValue = B33.longValue();
        String str6 = r0.A03;
        int A002 = 7TE.A00((5uJ) 1Br.A0B(this.A00), r0);
        String A012 = C5vD.A01(c5fv);
        Long A0n = A012 != null ? 1BK.A0n(A012) : null;
        if (A01 != null && !A01.isEmpty()) {
            arrayList = A01;
        }
        r04.A0A((5oV) null, A1f.A00(c5fv, this, 79), A0n, Long.valueOf(A00), str6, str5, str, str2, arrayList, A002, A0s, longValue, false);
    }
}
