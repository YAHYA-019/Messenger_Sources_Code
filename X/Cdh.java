package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: Cdh.class */
public final class Cdh implements DIM {
    public String[] A01;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final ThreadSummary A06;
    public final DJX A08;
    public final DHb A09;
    public final DHc A0A;
    public final DHd A0B;
    public final MigColorScheme A0C;
    public final User A0D;
    public final Capabilities A0E;
    public final 2Sh A0F;
    public final C1783AsH A0G;
    public final ImmutableList A0H;
    public int A00 = -1;
    public final 1YC A07 = 1YC.A03;

    public Cdh(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A02 = context;
        this.A04 = fbUserSession;
        this.A05 = threadKey;
        this.A0E = capabilities;
        this.A06 = threadSummary;
        this.A0F = r314;
        this.A0G = c1783AsH;
        this.A03 = r303;
        this.A0D = user;
        this.A0H = immutableList;
        this.A0A = dHc;
        this.A09 = dHb;
        this.A0B = dHd;
        this.A08 = djx;
        this.A0C = migColorScheme;
    }

    public String[] Ayr() {
        String[] strArr = this.A01;
        if (strArr == null) {
            int i = this.A00;
            if (i == -1) {
                i = 0;
                this.A00 = 0;
            }
            strArr = new String[i];
            this.A01 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        return AbN.A0R(this.A07, 1BK.A00());
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A07, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A07, 1BK.A00());
    }
}
