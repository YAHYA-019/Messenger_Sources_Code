package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6tR, reason: invalid class name */
/* loaded from: 6tR.class */
public final class C6tR {
    public static final 1Br A0O = 1Bq.A00(66409);
    public 2EU A00;
    public LithoView A01;
    public C2a2 A02;
    public C2a2 A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final LifecycleOwner A07;
    public final ThreadKey A0B;
    public final C9Jw A0C;
    public final C9wm A0D;
    public final 9Z9 A0E;
    public final 9OL A0F;
    public final 9aJ A0G;
    public final MigColorScheme A0H;
    public final C6ri A0I;
    public final 1Va A0J;
    public final boolean A0N;
    public final 1Br A0A = 1Bu.A00(68259);
    public final 1Br A09 = 1Bq.A00(65609);
    public final AtomicInteger A0K = new AtomicInteger(0);
    public final AtomicInteger A0L = new AtomicInteger(0);
    public final 1Br A08 = 1Bq.A00(66409);
    public final C01i A0M = C01g.A00(C03i.A02, new AQT(this, 44));

    /* JADX WARN: Type inference failed for: r0v56, types: [X.9Jw] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.9wm] */
    public C6tR(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, ThreadKey threadKey, 9aJ r306, C6ri c6ri, 1Va r308, boolean z) {
        this.A06 = context;
        this.A07 = lifecycleOwner;
        this.A0I = c6ri;
        this.A0J = r308;
        this.A0G = r306;
        this.A0N = z;
        this.A0B = threadKey;
        9Z9 r310 = null;
        this.A0F = 4YV.A0V(this.A08.A00).AZk(36322796126095235L) ? (9OL) 1Lo.A04(context, fbUserSession, (1BY) null, 68257) : null;
        this.A0E = ((1qI) 1Br.A0B(A0O)).A0M(threadKey) ? (9Z9) 1Lo.A04(context, fbUserSession, (1BY) null, 68256) : r310;
        this.A01 = new LithoView(context);
        this.A0H = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
        this.A0C = new Object() { // from class: X.9Jw
        };
        this.A0D = new C6s9() { // from class: X.9wm
            @Override // X.C6s9
            public void C3A(int i) {
            }

            @Override // X.C6s9
            public void C3H(boolean z2, int i) {
                C6tR c6tR = C6tR.this;
                if (!c6tR.A0N || z2) {
                    return;
                }
                c6tR.A0G.A00();
            }

            @Override // X.C6s9
            public void CDO(boolean z2) {
            }
        };
    }

    public static final void A00(Bitmap bitmap, C6tR c6tR) {
        c6tR.A00 = 2EU.A00(2EU.A05, new 2EW() { // from class: X.7v3
            public /* bridge */ /* synthetic */ void Cci(Object obj) {
            }
        }, bitmap);
        LithoView lithoView = c6tR.A01;
        if (lithoView != null) {
            lithoView.A0x(new 8UK(bitmap));
        }
        c6tR.A0G.A01();
    }

    public final void A01() {
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            lithoView.A0x(null);
        }
        C2a2 c2a2 = this.A03;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        this.A03 = null;
        C2a2 c2a22 = this.A02;
        if (c2a22 != null) {
            c2a22.AE0(null);
        }
        this.A02 = null;
        2EU r0 = this.A00;
        if (r0 != null) {
            r0.close();
        }
        this.A00 = null;
        this.A0K.set(this.A0L.incrementAndGet());
        this.A0G.A00();
    }
}
