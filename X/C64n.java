package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.64n, reason: invalid class name */
/* loaded from: 64n.class */
public final class C64n implements C64o {
    public AnonymousClass967 A00;
    public final 1Br A01;
    public final 1De A02;

    public C64n(1De r302) {
        this.A02 = r302;
        this.A01 = 1Bu.A03(r302.A00, 16428);
    }

    public static final AnonymousClass967 A00(AnonymousClass622 anonymousClass622) {
        C61n c61n = (C61n) anonymousClass622.A04.A01(C61n.class);
        Object obj = c61n != null ? c61n.A00 : null;
        if (obj instanceof C7Pe) {
            return (AnonymousClass967) ((C7Pe) obj).A00.get(anonymousClass622.A03.A1V);
        }
        return null;
    }

    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        11T.A0F(r304, 0);
        1BL.A1H(fbUserSession, anonymousClass622, r305);
        1Bi.A03(66517);
        Message message = anonymousClass622.A03;
        11T.A09(message);
        C61x A00 = C61v.A00(message);
        AnonymousClass967 A002 = A00(anonymousClass622);
        Bac(anonymousClass622);
        return new 8gS(r305, A002, new AKs(13, fbUserSession, r304, anonymousClass622, A002, this), anonymousClass622.A0Z, A00.BNj(message));
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
        Integer num;
        ThreadKey threadKey;
        11T.A0F(anonymousClass622, 0);
        AnonymousClass967 A00 = A00(anonymousClass622);
        int ordinal = A00 == null ? -1 : A00.ordinal();
        if (A00 != this.A00) {
            if (ordinal == 3) {
                num = 0S2.A0Y;
            } else if (ordinal == 2) {
                num = 0S2.A0u;
            } else if (ordinal != 1) {
                return;
            } else {
                num = 0S2.A1G;
            }
            this.A00 = A00(anonymousClass622);
            1BV r0 = new 1BV(this.A02.A00, 67929);
            ThreadSummary threadSummary = anonymousClass622.A05;
            if (threadSummary == null || (threadKey = threadSummary.A0n) == null) {
                return;
            }
            ((9cS) r0.get()).A00(1Br.A03(this.A01), threadKey, num);
        }
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        11T.A0F(anonymousClass622, 0);
        return anonymousClass622.A04.A03("translation_messsage_nux_eligibility");
    }
}
