package X;

import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6je, reason: invalid class name */
/* loaded from: 6je.class */
public final class C6je implements 1Vf {
    public final 1Br A00;
    public final 1Br A01 = 1Bq.A00(16385);
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final HashSet A09;
    public final List A0A;

    public C6je() {
        1Br A00 = 1Bq.A00(66327);
        this.A06 = A00;
        this.A08 = 1Bq.A00(66788);
        this.A02 = 1Bq.A00(66107);
        this.A04 = 1Bq.A00(66109);
        this.A03 = 1Bq.A00(66108);
        this.A07 = 1Bq.A00(33074);
        this.A0A = C0s8.A14((1SG) A00.A00.get(), (1SG) this.A08.A00.get(), (1SG) this.A02.A00.get(), (1SG) this.A03.A00.get(), (1SG) this.A04.A00.get(), (1SG) this.A07.A00.get());
        this.A05 = 1Bq.A00(66441);
        this.A00 = 1Bq.A00(85048);
        this.A09 = new HashSet();
    }

    private final void A00(PRELoggingEvent pRELoggingEvent) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(pRELoggingEvent.A02);
        A0k.append(' ');
        A0k.append(AnonymousClass001.A0X(pRELoggingEvent));
        A0k.append(", timestamp = ");
        A0k.append(pRELoggingEvent.A00);
        0fH.A0j("MessengerThreadViewTTRCEventHandler", A0k.toString());
    }

    public static final boolean A01(String str) {
        2yD A0Q;
        long j;
        boolean z = true;
        if (11T.A0O(str, C1yg.COMMUNITY_CHANNEL.toString())) {
            A0Q = 1BL.A0Q();
            j = 36320970759880572L;
        } else if (11T.A0O(str, C1yg.BROADCAST_CHANNEL.toString())) {
            A0Q = 1BL.A0Q();
            j = 36320970759946109L;
        } else {
            if (!11T.A0O(str, C1yg.ONE_TO_ONE.toString()) && !11T.A0O(str, C1yg.GROUP.toString()) && !11T.A0O(str, C1yg.MARKETPLACE.toString())) {
                if (!11T.A0O(str, C1yg.ADVANCED_CRYPTO_ONE_TO_ONE.toString()) && !11T.A0O(str, C1yg.ADVANCED_CRYPTO_GROUP.toString())) {
                    return false;
                }
                return z;
            }
            A0Q = 1BL.A0Q();
            j = 36320970760011646L;
        }
        z = A0Q.AZk(j);
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x052c A[LOOP:5: B:73:0x051e->B:75:0x052c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BQC(X.1Q5 r302, X.1Vp r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 3117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6je.BQC(X.1Q5, X.1Vp, java.lang.String):void");
    }
}
