package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.6mU, reason: invalid class name */
/* loaded from: 6mU.class */
public final class C6mU implements Runnable {
    public static final String __redex_internal_original_name = "ConversationTypingContext$cancelTypingStateRunnable$1";
    public final /* synthetic */ 6mR A00;

    public C6mU(6mR r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long valueOf;
        D16 d16;
        6mR r0 = this.A00;
        synchronized (r0) {
            r0.A00 = 0L;
            ScheduledFuture scheduledFuture = r0.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
        C6mS c6mS = r0.A07;
        Integer num = 0S2.A00;
        String str = null;
        String str2 = null;
        Integer num2 = r0.A0A;
        UserKey userKey = r0.A09;
        if (userKey != null) {
            str2 = userKey.id;
        }
        ThreadKey threadKey = r0.A06;
        Integer num3 = 0S2.A01;
        if (num2 == num3) {
            str = String.valueOf(threadKey.A0r());
        } else {
            UserKey userKey2 = r0.A08;
            if (userKey2 != null) {
                str = userKey2.id;
            }
        }
        if (((C1m1) c6mS.A00.A00.get()).A04()) {
            6QP r02 = 6QP.A01;
            if (num2 == num3) {
                d16 = new D16(C4Ri.GROUP, str);
                valueOf = null;
            } else {
                valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                d16 = null;
            }
            try {
                byte[] A00 = new C29V(new 29S()).A00(new D1C(d16, r02, valueOf, str2 != null ? Long.valueOf(Long.parseLong(str2)) : null));
                int length = A00.length;
                byte[] bArr = new byte[length + 1];
                System.arraycopy(A00, 0, bArr, 1, length);
                ((2At) c6mS.A01.A00.get()).A00((InterfaceC01073pn) null, num, "/t_st", bArr);
            } catch (2LA e) {
                0fH.A0O(C6mS.class, "TException: %s", e, new Object[]{e.getMessage()});
            }
        }
    }
}
