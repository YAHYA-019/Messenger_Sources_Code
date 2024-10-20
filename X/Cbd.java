package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: Cbd.class */
public final class Cbd implements CallerContextable {
    public static final List A0P = Arrays.asList(4);
    public static final String __redex_internal_original_name = "MessengerMsysSecureMessage";
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A03;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0D;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0K;
    public final C00i A0O;
    public final C15h A0N = DBe.A00(this, 71);
    public final C00i A0C = 1BQ.A02(67858);
    public final C00i A0B = 1BV.A01((1BY) null, 49419);
    public final C00i A0I = 1BV.A01((1BY) null, 16671);
    public final C00i A02 = 1BV.A01((1BY) null, 67600);
    public final C00i A04 = 1BQ.A01();
    public final C00i A05 = 1BQ.A02(66498);
    public final C00i A0J = 1BV.A01((1BY) null, 115371);
    public final C00i A0L = 1BV.A01((1BY) null, 115263);
    public final C00i A0M = AbH.A0F();
    public final C00i A0F = 1BQ.A02(16485);
    public final C00i A0E = 1BV.A01((1BY) null, 82167);

    public Cbd(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A01 = fbUserSession;
        this.A0A = AbF.A0B(fbUserSession, (1BY) null, 49661);
        this.A0H = AbF.A0A(fbUserSession, (1BY) null, 83541);
        this.A0K = AbF.A0A(fbUserSession, (1BY) null, 49763);
        this.A0G = AbF.A0A(fbUserSession, (1BY) null, 33124);
        this.A07 = AbF.A0A(fbUserSession, (1BY) null, 67404);
        this.A06 = AbF.A0A(fbUserSession, (1BY) null, 67401);
        this.A08 = AbF.A0A(fbUserSession, (1BY) null, 84157);
        this.A0D = AbF.A0A(fbUserSession, (1BY) null, 115373);
        this.A03 = AbF.A0A(fbUserSession, (1BY) null, 115372);
        this.A0O = AbF.A0A(fbUserSession, (1BY) null, 84153);
        this.A09 = AbF.A0A(fbUserSession, (1BY) null, 67506);
    }

    public static 5Xd A00(Cbd cbd) {
        ((5Xc) cbd.A0K.get()).AQX();
        return (5Xd) cbd.A09.get();
    }

    public void A01(ThreadKey threadKey, DFQ dfq, Long l) {
        User A0x = AbF.A0x(this.A0N);
        if (A0x == null || A0x.A13.isEmpty()) {
            0fH.A0k(__redex_internal_original_name, "loadSecureMessagesInThread: userId is null");
            C1UI.A01(__redex_internal_original_name, "loadSecureMessagesInThread: userId is null");
            return;
        }
        5Xd A00 = A00(this);
        long A0r = threadKey.A0r();
        1Um AQV = A00.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
        1Um.A02(AQV, new Czh(A0P2, A00, l, 35, A0r), A0P2, false);
        A0P2.addResultCallback(Czg.A00(this, threadKey, dfq, 23));
    }

    public void A02(ThreadKey threadKey, Boolean bool, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        4YU.A1W(A0s, threadKey.A02);
        Long valueOf = Long.valueOf(threadKey.A05);
        A0s.add(valueOf);
        try {
            5Xd A00 = A00(this);
            Long A0l = 4YU.A0l(threadKey);
            Integer valueOf2 = Integer.valueOf(ThreadKey.A00(threadKey.A06));
            boolean booleanValue = bool.booleanValue();
            boolean A03 = AbG.A0p(this.A0I).A03();
            1Um AQV = A00.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
            1Um.A02(AQV, new Cyq(A0P2, A00, A0l, valueOf2, valueOf, str, A0s, booleanValue, A03), A0P2, false);
            A0P2.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            C1UI.A01(__redex_internal_original_name, "Failed to create secure thread");
            throw new RuntimeException("Failed to create secure thread", e);
        }
    }

    public boolean A03() {
        String str;
        5Xc r0 = (5Xc) this.A0K.get();
        synchronized (r0.A0B) {
            str = r0.A03;
        }
        if (str == null) {
            return false;
        }
        return "COMPLETED".equals(str);
    }
}
