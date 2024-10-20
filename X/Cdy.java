package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow.ThreadSettingsSharedContentRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdy.class */
public final class Cdy implements DIM {
    public C9fe A01;
    public C1v5 A02;
    public Object A03;
    public boolean A04;
    public String[] A05;
    public final Context A06;
    public final 06Z A07;
    public final FbUserSession A08;
    public final ThreadKey A09;
    public final ThreadSummary A0A;
    public final DJX A0C;
    public final DHb A0D;
    public final DHc A0E;
    public final DHd A0F;
    public final MigColorScheme A0G;
    public final User A0H;
    public final Capabilities A0I;
    public final 2Sh A0J;
    public final C1783AsH A0K;
    public final ImmutableList A0L;
    public int A00 = -1;
    public final 1YC A0B = 1YC.A03;

    public Cdy(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A06 = context;
        this.A08 = fbUserSession;
        this.A09 = threadKey;
        this.A0I = capabilities;
        this.A0A = threadSummary;
        this.A0J = r314;
        this.A0K = c1783AsH;
        this.A07 = r303;
        this.A0H = user;
        this.A0L = immutableList;
        this.A0E = dHc;
        this.A0D = dHb;
        this.A0F = dHd;
        this.A0C = djx;
        this.A0G = migColorScheme;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A04) {
                if (this.A06 == null) {
                    throw AbG.A13();
                }
                this.A02 = C1v5.A01;
                this.A04 = true;
            }
        }
    }

    private boolean A01() {
        boolean A01;
        if (this.A03 == null) {
            A00();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0B;
            r0.A0B("com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.core.SharedContentCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A02;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.sharedcontent.plugins.core.SharedContentCoreKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !ThreadSettingsSharedContentRow.A01(this.A0A, this.A0I)) ? C1Y6.A03 : C1Y6.A02;
                            this.A03 = obj;
                            r0.A07("messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    int i = C1Y6.A00;
                    Boolean A002 = CBq.A00(i);
                    if (A002 != null) {
                        A01 = A002.booleanValue();
                    } else {
                        C9fe c9fe = this.A01;
                        if (c9fe == null) {
                            c9fe = AbI.A0c(this.A06);
                            this.A01 = c9fe;
                        }
                        A01 = CBq.A01(r0, c9fe, atomicInteger, i);
                    }
                    if (A01) {
                    }
                    this.A03 = obj;
                    r0.A07("messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A03 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A03));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A03));
                throw th;
            }
        }
        return 1BK.A1U(this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v4 */
    /* JADX WARN: Type inference failed for: r303v5 */
    public String[] Ayr() {
        String[] strArr = this.A05;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                this.A00 = A01 ? 1 : 0;
                i2 = A01;
            }
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "shared_media";
            }
            this.A05 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
        String A18 = AbF.A18(r0, andIncrement);
        try {
            A00();
            Cug cug = null;
            if (str.equals("shared_media") && A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A14 = AbJ.A14(r0, A18, andIncrement2);
                try {
                    try {
                        cug = ThreadSettingsSharedContentRow.A00(this.A06, this.A0A, this.A0F, this.A0H);
                        r0.A09(A14, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A14, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            return cug;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            throw th2;
        }
    }

    public ImmutableList B8Q(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0B;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
            throw th;
        }
    }

    public AtG BLB(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0B;
        String A19 = AbF.A19(r0, A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.threadsettings.row.RowInterfaceSpec", A19, A00);
            throw th;
        }
    }
}
