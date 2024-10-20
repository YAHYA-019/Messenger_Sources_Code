package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsaction.MuteUnmuteAction;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cd9.class */
public final class Cd9 implements DHu {
    public MuteUnmuteAction A01;
    public Object A02;
    public String[] A03;
    public final Context A04;
    public final 06Z A05;
    public final FbUserSession A06;
    public final ThreadKey A07;
    public final ThreadSummary A08;
    public final DJX A0A;
    public final DHb A0B;
    public final DHc A0C;
    public final DHd A0D;
    public final User A0E;
    public final Capabilities A0F;
    public final 2Sh A0G;
    public final String A0H;
    public int A00 = -1;
    public final 1YC A09 = 1YC.A03;

    public Cd9(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, User user, Capabilities capabilities, 2Sh r313, String str) {
        this.A04 = context;
        this.A07 = threadKey;
        this.A05 = r303;
        this.A0E = user;
        this.A0F = capabilities;
        this.A08 = threadSummary;
        this.A0G = r313;
        this.A0B = dHb;
        this.A0A = djx;
        this.A0D = dHd;
        this.A0H = str;
        this.A06 = fbUserSession;
        this.A0C = dHc;
    }

    private boolean A00() {
        Object obj;
        if (this.A02 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A09;
            String A0w = AbM.A0w(r0, andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BZP.A00(r0, atomicInteger)) {
                        Context context = this.A04;
                        Capabilities capabilities = this.A0F;
                        ThreadKey threadKey = this.A07;
                        ThreadSummary threadSummary = this.A08;
                        if (BUs.A00(threadKey, threadSummary, capabilities, this.A0H)) {
                            this.A01 = new MuteUnmuteAction(context, this.A05, threadKey, threadSummary, this.A0A, this.A0G);
                            obj = C1Y6.A02;
                            this.A02 = obj;
                            r0.A07("messaging.notify.mutexapp.threadsettingsaction.MuteUnmuteAction", A0w, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A02 = obj;
                    r0.A07("messaging.notify.mutexapp.threadsettingsaction.MuteUnmuteAction", A0w, andIncrement, 1BL.A1U(obj));
                } catch (Throwable th) {
                    th = th;
                    r0.A03(exc, "messaging.notify.mutexapp.threadsettingsaction.MuteUnmuteAction", A0w, andIncrement, 1BL.A1U(this.A02));
                    throw th;
                }
            } catch (Exception e) {
                this.A02 = C1Y6.A03;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    exc = e;
                    r0.A03(exc, "messaging.notify.mutexapp.threadsettingsaction.MuteUnmuteAction", A0w, andIncrement, 1BL.A1U(this.A02));
                    throw th;
                }
            }
        }
        return 1BK.A1U(this.A02);
    }

    @Override // X.DHu
    public C8R AVD(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.actionbutton.ActionButtonInterfaceSpec", "messaging.threadsettings.actionbutton.ActionButtonInterfaceSpec", "getActionButton", andIncrement);
        C8R c8r = null;
        Exception e = null;
        try {
            if (AbF.A1a(str) && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A10 = AbJ.A10(r0, andIncrement2);
                try {
                    try {
                        c8r = this.A01.A00();
                        r0.A09(A10, "messaging.threadsettings.actionbutton.ActionButtonInterfaceSpec", "getActionButton", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, A10, "messaging.threadsettings.actionbutton.ActionButtonInterfaceSpec", "getActionButton", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.actionbutton.ActionButtonInterfaceSpec", "getActionButton", andIncrement);
            return c8r;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadsettings.actionbutton.ActionButtonInterfaceSpec", "getActionButton", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v4 */
    /* JADX WARN: Type inference failed for: r303v5 */
    @Override // X.DHu
    public String[] Ayr() {
        String[] strArr = this.A03;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A00 = A00();
                this.A00 = A00 ? 1 : 0;
                i2 = A00;
            }
            strArr = new String[i2];
            AbG.A1Z(strArr, A00() ? 1 : 0, 0);
            this.A03 = strArr;
        }
        return strArr;
    }

    @Override // X.DHu
    public AbstractC1755Arp BLA(String str) {
        AbN.A1E(this.A09, 1BK.A00());
        return null;
    }
}
