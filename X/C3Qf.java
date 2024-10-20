package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3Qf, reason: invalid class name */
/* loaded from: 3Qf.class */
public final class C3Qf {
    public DKT A00;
    public C5yd A01;
    public C3RJ A02;
    public C60b A03;
    public 6In A04;
    public AcY A05;
    public C1v5 A06;
    public 9XW A07;
    public MigColorScheme A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public Object A0F;
    public Object A0G;
    public Object A0H;
    public Object A0I;
    public Object A0J;
    public Object A0K;
    public Object A0L;
    public Object A0M;
    public Object A0N;
    public boolean A0O;
    public final Context A0P;
    public final 06Z A0Q;
    public final 5zD A0R;
    public final GenericAdminMessageInfo A0S;
    public final ThreadKey A0T;
    public final ThreadSummary A0U;
    public final 1YC A0V = 1YC.A03;
    public final 63D A0W;
    public final String A0X;
    public final FbUserSession A0Y;

    public C3Qf(Context context, 06Z r303, FbUserSession fbUserSession, 5zD r305, GenericAdminMessageInfo genericAdminMessageInfo, ThreadKey threadKey, ThreadSummary threadSummary, 63D r309, String str) {
        this.A0P = context;
        this.A0S = genericAdminMessageInfo;
        this.A0X = str;
        this.A0T = threadKey;
        this.A0U = threadSummary;
        this.A0Q = r303;
        this.A0W = r309;
        this.A0R = r305;
        this.A0Y = fbUserSession;
    }

    public static void A00(C3Qf c3Qf) {
        synchronized (c3Qf) {
            if (!c3Qf.A0O) {
                if (c3Qf.A0P == null) {
                    throw AnonymousClass001.A0Q("The context passed in the AdminMessageWithLinkInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                c3Qf.A06 = C1v5.A01;
                c3Qf.A0O = true;
            }
        }
    }
}
