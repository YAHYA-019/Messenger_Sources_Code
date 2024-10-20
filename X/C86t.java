package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import kotlin.jvm.functions.Function1;

/* renamed from: X.86t, reason: invalid class name */
/* loaded from: 86t.class */
public final class C86t implements AnonymousClass703 {
    public static final CallerContext A0X = CallerContext.A0B("VideoMessageRenderer");
    public static final C06974ih A0Y;
    public final Context A00;
    public final Fragment A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final C86s A0F;
    public final 74E A0G;
    public final 6oP A0H;
    public final C66e A0I;
    public final C01i A0J;
    public final C01i A0K;
    public final C01i A0L;
    public final Function1 A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final 1Fv A0Q;
    public final 5HO A0R;
    public final 1Uj A0S;
    public final C6zf A0T;
    public final 5VY A0U;
    public final 7Tf A0V;
    public final C70i A0W;

    static {
        C07004ik A00 = C06984ii.A00();
        A00.A02(-16777216);
        A0Y = 7zL.A0L(A00);
    }

    public C86t(Context context, Fragment fragment, 5HO r304, C86s c86s, 5VY r306, 7Tf r307, 74E r308, C70i c70i, 6oP r310, C66e c66e, Function1 function1, boolean z, boolean z2, boolean z3) {
        7zR.A1N(context, r304);
        this.A00 = context;
        this.A0O = z;
        this.A0R = r304;
        this.A0W = c70i;
        this.A0G = r308;
        this.A0H = r310;
        this.A0F = c86s;
        this.A0P = z2;
        this.A0I = c66e;
        this.A01 = fragment;
        this.A0U = r306;
        this.A0V = r307;
        this.A0N = z3;
        this.A0M = function1;
        this.A0T = C6ze.A0c;
        this.A0E = 1Bu.A01(context, 67752);
        C03i c03i = C03i.A03;
        this.A0J = AQa.A00(this, c03i, 34);
        this.A0B = 7zM.A0f(context);
        this.A07 = 1Bu.A01(context, 147924);
        this.A0A = 1Bu.A01(context, 66811);
        this.A09 = 1Bu.A01(context, 67671);
        this.A08 = 1Bu.A01(context, 67567);
        this.A0C = 1BK.A0C();
        this.A06 = 1Bq.A00(16922);
        this.A0D = 1Bq.A00(67861);
        this.A0L = AQa.A00(this, c03i, 36);
        1Fv A0N = 7zQ.A0N();
        this.A0Q = A0N;
        FbUserSession A04 = A0N.A04();
        this.A02 = A04;
        this.A0S = (1Uj) 1Lm.A05(context, A04, 16686);
        this.A03 = 1Bq.A00(16708);
        this.A04 = 1Bq.A00(16687);
        this.A05 = 1Bq.A00(32976);
        this.A0K = AQa.A00(this, c03i, 35);
    }

    public static final 2Dp A00(VideoAttachment videoAttachment, int i) {
        Uri uri = videoAttachment.A0B;
        if (uri == null) {
            return null;
        }
        2IA A01 = 2IA.A01(uri);
        A01.A0C = new C2592Gib(i, 1.0f, 16777215);
        return A01.A04();
    }

    private final 3xX A01(5vW r302) {
        7Hg r0 = (7Hg) ((5vV) r302).A01.A01.A00(7Hg.A01);
        if ((r0 != null ? r0.A00 : null) == 7Jy.A03) {
            return ((7Ju) 1Br.A0B(this.A0A)).A00();
        }
        return null;
    }

    private final boolean A02(5gR r302) {
        int A00;
        int A002;
        if (!this.A0O) {
            return 1Br.A06(this.A0C).AZk(36325218482672082L);
        }
        int i = (int) r302.A00.A07;
        if (i < 0) {
            i = 0;
        }
        C00i c00i = this.A04.A00;
        if (!((FbNetworkManager) c00i.get()).A0K() || i <= 0 || (A002 = 2yD.A00(1Br.A06(this.A0C), 36606693460024841L)) <= 0 || i > A002) {
            return ((FbNetworkManager) c00i.get()).A0N() && i > 0 && (A00 = 2yD.A00(1Br.A06(this.A0C), 36606693460090378L)) > 0 && i <= A00;
        }
        return true;
    }

    private final boolean A03(boolean z) {
        1Br r0 = this.A0C;
        if (1Br.A06(r0).AZk(36322040206083104L)) {
            return true;
        }
        1CO A06 = 1Br.A06(r0);
        return z ? A06.AZk(36322040206410786L) : A06.AZk(36322040206476323L);
    }

    @Override // X.AnonymousClass703
    public C6zf B77() {
        return this.A0T;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x04ef, code lost:
    
        if (r0.A00 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x053c, code lost:
    
        if (r332 != null) goto L64;
     */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.HLR, java.lang.Object] */
    @Override // X.AnonymousClass703
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI Cfc(X.C1qb r302, X.C5j5 r303, X.5vW r304, java.util.List r305, int r306) {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86t.Cfc(X.1qb, X.5j5, X.5vW, java.util.List, int):X.1LI");
    }
}
