package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.AiShareBackInitParamsMetadata;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewAiBotParamsMetadata;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewQuickReplyTrayParamsMetadata;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* renamed from: X.8uU, reason: invalid class name */
/* loaded from: 8uU.class */
public final class C8uU extends 6wI {
    public final Context A00;
    public final Fragment A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final 6xC A04;
    public final 6xM A05;
    public final C15h A06;
    public final Bundle A07;
    public final FrameLayout A08;
    public final FbUserSession A09;
    public final 2S4 A0A;
    public final 1Iw A0B;
    public final LithoView A0C;
    public final C9ma A0D;
    public final AWx A0E;
    public final AaO A0F;
    public final C6tS A0G;
    public final C6wz A0H;
    public final C6wy A0I;
    public final 6xC A0J;
    public final C5j5 A0K;
    public final C6w3 A0L;
    public final C6ri A0M;
    public final HeterogeneousMap A0N;
    public final boolean A0O;

    public C8uU(Context context, Bundle bundle, FrameLayout frameLayout, Fragment fragment, FbUserSession fbUserSession, 2S4 r307, 1Iw r308, LithoView lithoView, C9ma c9ma, ThreadKey threadKey, AaO aaO, C6tS c6tS, C5j5 c5j5, C6w3 c6w3, C6ri c6ri, HeterogeneousMap heterogeneousMap, String str) {
        super(context, bundle, frameLayout, fragment, fbUserSession, r307, r308, lithoView, c9ma, threadKey, aaO, c6tS, c5j5, c6w3, c6ri, heterogeneousMap, str);
        this.A00 = context;
        this.A0B = r308;
        this.A0K = c5j5;
        this.A0C = lithoView;
        this.A03 = threadKey;
        this.A09 = fbUserSession;
        this.A01 = fragment;
        this.A08 = frameLayout;
        this.A0M = c6ri;
        this.A0N = heterogeneousMap;
        this.A0A = r307;
        this.A0F = aaO;
        this.A0G = c6tS;
        this.A07 = bundle;
        this.A0L = c6w3;
        this.A0D = c9ma;
        boolean z = false;
        ImmutableSet immutableSet = null;
        this.A0I = A0G().AZk(36324673021431709L) ? new C6wy(false) : null;
        this.A0H = A0G().AZk(36324673021431709L) ? new C6wz(c6ri, false) : null;
        1Br A00 = 1Bu.A00(67253);
        this.A02 = A00;
        this.A06 = new AHf(this, 10);
        6xC r0 = new 6xC(((C6x0) 1Br.A0B(A00)).A02(threadKey, A0Y() ? immutableSet : 6rJ.A1N), AK4.A00);
        this.A04 = r0;
        this.A0J = r0;
        this.A0E = new AWx() { // from class: X.9wf
        };
        6xM A002 = C75m.A00(AnonymousClass843.A00(this, 5), A0V());
        11T.A0A(A002);
        this.A05 = A002;
        ThreadViewQuickReplyTrayParamsMetadata threadViewQuickReplyTrayParamsMetadata = (ThreadViewQuickReplyTrayParamsMetadata) heterogeneousMap.A00(ThreadViewQuickReplyTrayParamsMetadata.A02);
        this.A0O = threadViewQuickReplyTrayParamsMetadata != null ? threadViewQuickReplyTrayParamsMetadata.A01 : z;
    }

    public 7Km A08() {
        if (1Br.A07(((77U) 1Bn.A0A(67278)).A00).AZk(72340241540844940L)) {
            return (7Km) 1Bn.A0A(66566);
        }
        return null;
    }

    public AWx A09() {
        return this.A0E;
    }

    public C6wz A0A() {
        return this.A0H;
    }

    public C6wy A0B() {
        return this.A0I;
    }

    public 6xC A0C() {
        return this.A0J;
    }

    public C15h A0R() {
        return this.A06;
    }

    public void A72(6xH r302) {
        A6h a6h;
        11T.A0F(r302, 0);
        super.A72(r302);
        C6xh c6xh = (C6xh) 1Br.A0B(((6rJ) this).A0N);
        FbUserSession fbUserSession = this.A09;
        ThreadKey threadKey = this.A03;
        HeterogeneousMap heterogeneousMap = this.A0N;
        5oY A00 = C6xh.A00(c6xh);
        AiShareBackInitParamsMetadata aiShareBackInitParamsMetadata = (AiShareBackInitParamsMetadata) heterogeneousMap.A00(AiShareBackInitParamsMetadata.A01);
        A6a a6a = null;
        ThreadKey threadKey2 = aiShareBackInitParamsMetadata != null ? aiShareBackInitParamsMetadata.A00 : null;
        6xM A002 = C75t.A00(AnonymousClass843.A00(this, 4), A0V());
        boolean z = false;
        6xM A003 = 77S.A00(AVH.A00(A00, this, 35), A0V());
        if (!1Br.A07(((77U) 1Bn.A0A(67278)).A00).AZk(72340241540844940L)) {
            A003 = null;
        }
        if (this.A0O) {
            a6h = null;
        } else {
            ThreadViewAiBotParamsMetadata threadViewAiBotParamsMetadata = (ThreadViewAiBotParamsMetadata) heterogeneousMap.A00(ThreadViewAiBotParamsMetadata.A0Q);
            if (threadViewAiBotParamsMetadata != null) {
                z = threadViewAiBotParamsMetadata.A07;
            }
            a6h = new A6h(threadKey, 7zO.A1Y(z), A07().A0U(1BK.A0w(threadKey)));
        }
        if (threadKey2 != null) {
            threadKey.getClass();
            List list = 76C.A01;
            76C r0 = new 76C(A0P());
            fbUserSession.getClass();
            Fragment fragment = this.A01;
            fragment.getClass();
            a6a = new A6a(fragment, fbUserSession, threadKey, threadKey2, r0);
        }
        r302.A00(new 6xM[]{A002, A003, a6h, a6a});
    }
}
