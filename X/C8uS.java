package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.analytics.perf.events.events.AIBotSuggestedPromptsQueryStart;
import com.facebook.messaging.analytics.perf.events.events.AIBotSuggestedPromptsRender;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewAiBotParamsMetadata;
import java.util.List;

/* renamed from: X.8uS, reason: invalid class name */
/* loaded from: 8uS.class */
public final class C8uS extends C9cp {
    public 8Cd A00;
    public 8Cf A01;
    public List A02;
    public C2a2 A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final ThreadKey A0A;
    public final C9Jx A0B;
    public final ThreadViewAiBotParamsMetadata A0C;
    public final C6ri A0D;
    public final 1Va A0E;
    public final 2Og A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8uS(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 2S4 r305, ThreadKey threadKey, C9Jx c9Jx, ThreadViewAiBotParamsMetadata threadViewAiBotParamsMetadata, C6ri c6ri, 1Va r310, 2Og r311) {
        super(context, lifecycleOwner, fbUserSession, r305, threadKey, threadViewAiBotParamsMetadata, c6ri);
        7zT.A1W(context, lifecycleOwner, threadKey, fbUserSession);
        1BL.A1G(r305, threadViewAiBotParamsMetadata);
        7zS.A18(7, c6ri, r310, r311);
        this.A04 = context;
        this.A0A = threadKey;
        this.A05 = fbUserSession;
        this.A0C = threadViewAiBotParamsMetadata;
        this.A0D = c6ri;
        this.A0E = r310;
        this.A0F = r311;
        this.A0B = c9Jx;
        this.A07 = 1Bq.A00(66421);
        this.A09 = 1HG.A00(context, 68747);
        this.A06 = 7zM.A0a();
        this.A08 = 1Bq.A00(68748);
        this.A0G = threadViewAiBotParamsMetadata.A0D;
        this.A02 = C0ty.A00;
    }

    public static final void A00(C8uS c8uS) {
        8Cf r0 = c8uS.A01;
        if (r0 != null) {
            r0.A0K(c8uS.A02);
            2dU.A01((6Bw) null, new AIBotSuggestedPromptsRender(c8uS.A0A, c8uS.A02.size()));
        }
    }

    @Override // X.C9cp
    public void A02() {
        C2aj A1G;
        super.A02();
        boolean z = this.A0C.A0C;
        C2a2 c2a2 = this.A03;
        if (z) {
            if (c2a2 != null && c2a2.BQN()) {
                return;
            }
            A1G = 7zM.A1G(2Zo.A02(0S2.A01), new AJX(this, (0DR) null, 0), (2aI) super.A0A.getValue());
        } else {
            if (c2a2 != null && c2a2.BQN()) {
                return;
            }
            2dU.A01((6Bw) null, new AIBotSuggestedPromptsQueryStart(this.A0A));
            A1G = 7zM.A1G(2Zo.A02(0S2.A01), new AJf(this, (0DR) null, 1), (2aI) super.A0A.getValue());
        }
        this.A03 = A1G;
    }

    @Override // X.C9cp
    public void A03() {
        8Cf r0;
        super.A03();
        8CW r02 = super.A01;
        if (r02 == null || !r02.A08 || (r0 = this.A01) == null) {
            return;
        }
        r0.A08 = false;
        8Cf.A01(r0);
    }

    @Override // X.C9cp
    public void A04() {
        super.A02();
        C2a2 c2a2 = this.A03;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        this.A03 = null;
        8Cf r0 = this.A01;
        if (r0 != null) {
            r0.A0H();
        }
    }
}
