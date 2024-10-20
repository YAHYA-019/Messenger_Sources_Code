package X;

import android.content.Context;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.translation.piiredaction.PiiRedaction;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9wl, reason: invalid class name */
/* loaded from: 9wl.class */
public final class C9wl implements C7yh {
    public final View A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final ThreadKey A08;
    public final MigColorScheme A09;
    public final MfU A0A;
    public final 2Og A0B;
    public final A3v A0C;

    public C9wl(View view, FbUserSession fbUserSession, ThreadKey threadKey, MigColorScheme migColorScheme, 2Og r306) {
        1BL.A1H(threadKey, fbUserSession, migColorScheme);
        11T.A0F(r306, 5);
        this.A08 = threadKey;
        this.A01 = fbUserSession;
        this.A09 = migColorScheme;
        this.A00 = view;
        this.A0B = r306;
        this.A07 = 7zM.A0U();
        this.A04 = 1Bu.A00(68345);
        this.A05 = 1Bq.A00(16504);
        this.A02 = 7zM.A0Q();
        this.A06 = 1Bu.A01(7zM.A0A(), 67929);
        this.A03 = 1Bq.A00(67724);
        this.A0A = MfU.A0f;
        this.A0C = new A3v(this);
    }

    public static final void A00(1Iw r301, C9wl c9wl, 5vW r303) {
        5vQ r0;
        5vQ r02;
        FbUserSession fbUserSession = c9wl.A01;
        5jA r03 = (5jA) 1Lm.A06(fbUserSession, 66324);
        ThreadKey threadKey = c9wl.A08;
        4kZ A00 = r03.A00(threadKey);
        9YO r04 = new 9YO(A00.A02, A00);
        5vV r05 = (5vV) r303;
        5gC r06 = r05.A00;
        11T.A0I(r06, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadview.model.text.TextMessage");
        5gC r07 = r06;
        5vU r08 = r05.A01;
        5vP r09 = (5vP) r08.A01.A00(5vP.A01);
        Integer num = null;
        if (r08.A06) {
            Integer num2 = (r09 == null || (r02 = r09.A00) == null) ? null : r02.A00;
            Integer num3 = 0S2.A0C;
            if (num2 == num3) {
                r04.A00(r07, 0S2.A0N);
                return;
            }
            if (r09 != null && (r0 = r09.A00) != null) {
                num = r0.A00;
            }
            if (num == 0S2.A0N) {
                r04.A00(r07, num3);
                return;
            }
        }
        r04.A00(r07, 0S2.A01);
        Context A0A = 7zL.A0A(r301);
        9yS r010 = (9yS) 1Lm.A05(A0A, fbUserSession, 68344);
        String A02 = 11T.A02(((1GS) 1Br.A0B(c9wl.A05)).A05());
        ARN arn = new ARN(34, c9wl, r04, A0A, r07);
        9cS r011 = (9cS) 1Br.A0B(c9wl.A06);
        String str = r07.A09;
        C1yg c1yg = threadKey.A06;
        11T.A09(c1yg);
        r011.A01(c1yg, str);
        if (!threadKey.A0z()) {
            r010.Cgn(str, A02, arn, threadKey.A04);
            return;
        }
        long parseLong = Long.parseLong(str);
        String str2 = r07.A03;
        9DX r012 = PiiRedaction.Companion;
        String redactedMessage = PiiRedaction.getRedactedMessage(str2, String.valueOf(parseLong));
        ARA ara = new ARA(4, parseLong, arn, r010);
        MailboxFeature A0d = 7zP.A0d(r010.A00);
        A1d a1d = new A1d((Function1) ara, ActionId.APP_WILL_ENTER_FOREGROUND);
        A1d a1d2 = new A1d((Function1) ara, ActionId.APP_MAIN);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a1d2);
        A0P.Cu4(a1d);
        1Um.A01(AQV, new A0o(A0d, A0Q, A0P, redactedMessage, A02, 2, parseLong), A0P, A0Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r303 == r305) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012b, code lost:
    
        if (((r0 == null || (r0 = r0.A00) == null) ? null : r0.A00) != X.0S2.A0N) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.9Zq, java.lang.Object] */
    @Override // X.C7yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C9c2 AKN(X.5vW r302) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9wl.AKN(X.5vW):X.9c2");
    }

    @Override // X.C7yh
    public MfU BHV() {
        return this.A0A;
    }

    @Override // X.C7yh
    public boolean BRz(Capabilities capabilities, C5fv c5fv) {
        11T.A0H(c5fv, capabilities);
        9OR r0 = (9OR) 1Br.A0B(this.A04);
        ThreadKey threadKey = this.A08;
        if (!(c5fv instanceof 5gC)) {
            return false;
        }
        5gC r02 = (5gC) c5fv;
        if (!7zL.A1V(r02.A03) || r02.A04 || !(!C5ul.A01(c5fv)) || ((C5fu) c5fv).A0H) {
            return false;
        }
        C00i c00i = r0.A01.A00;
        return !((C5jj) c00i.get()).A00().contains(((1GS) 1Br.A0B(r0.A00)).A05().toString()) && ((C5jj) c00i.get()).A03(threadKey);
    }
}
