package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.selectmessages.ReviewSelectedMessagesFragment;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: B5L.class */
public final class B5L extends 6Hk {
    public 1BY A00;
    public FRXParams A01;
    public QyF A02;
    public C0o A03;
    public ThreadSummary A04;
    public String A05;
    public String A06;
    public ArrayList A07;
    public final 6Io A08 = (6Io) 1Bn.A0B(67893);

    public B5L(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(FbUserSession fbUserSession, B5L b5l, boolean z) {
        QyF qyF;
        ThreadSummary threadSummary;
        b5l.A01.getClass();
        if (b5l.A06 == null || b5l.A01.A04 == null || (qyF = b5l.A02) == null || b5l.A04 == null || b5l.A07 == null) {
            return;
        }
        MessagesCollection A00 = qyF.A00();
        ImmutableList immutableList = b5l.A02.A00.A01;
        Object obj = ((6Hk) b5l).A00;
        if (obj != null && (threadSummary = b5l.A04) != null) {
            ((ReviewSelectedMessagesFragment) obj).A1D(A00, threadSummary, true);
        }
        ClX clX = new ClX(b5l, A00);
        C1741Arb c1741Arb = (C1741Arb) 1Bn.A0E((Context) null, b5l.A00, 84905);
        FRXParams fRXParams = b5l.A01;
        UserKey userKey = fRXParams.A08;
        c1741Arb.A00(fRXParams, userKey != null ? userKey.id : null).A01(fbUserSession, clX, b5l.A01.A04, immutableList, ImmutableList.copyOf((Collection) b5l.A07), b5l.A06);
        if (z) {
            return;
        }
        6Io r0 = b5l.A08;
        FRXParams fRXParams2 = b5l.A01;
        r0.A0A(fbUserSession, fRXParams2.A00, fRXParams2.A04, b5l.A01.A09, b5l.A05, A00.A01.size());
    }

    public void A05() {
        Object obj = ((6Hk) this).A00;
        if (obj != null) {
            7zL.A1Q(obj);
        }
        if (this.A01 != null) {
            FbUserSession A05 = 1Fw.A05(this.A00);
            6Io r0 = this.A08;
            FRXParams fRXParams = this.A01;
            ThreadKey threadKey = fRXParams.A04;
            C5yq c5yq = fRXParams.A00;
            String str = this.A05;
            C5yl c5yl = fRXParams.A09;
            4YV.A1N(A05, c5yq);
            1UG A08 = 1BK.A08(AbM.A0D(r0, c5yl), 1BJ.A00(1349));
            if (!A08.isSampled() || threadKey == null) {
                return;
            }
            6Io.A03(A08, r0);
            CPB.A03(A08, A05, r0, c5yq, threadKey);
            AbM.A1H(A08, c5yl);
            6Io.A02(A08, A05, r0, threadKey, str);
        }
    }
}
