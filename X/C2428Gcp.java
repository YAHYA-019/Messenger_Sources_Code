package X;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* renamed from: X.Gcp, reason: case insensitive filesystem */
/* loaded from: Gcp.class */
public final class C2428Gcp extends Ic7 implements JQ1 {
    public final I4V A00;
    public final boolean A01;
    public final Context A02;
    public final TextureView.SurfaceTextureListener A03;
    public volatile int A04;
    public volatile int A05;
    public volatile TextureView A06;
    public volatile I5d A07;

    public C2428Gcp(JOW jow, boolean z) {
        super.A00 = jow;
        jow.getClass();
        Context context = jow.getContext();
        11T.A0A(context);
        this.A02 = context;
        this.A00 = I4V.A00();
        this.A01 = z;
        this.A03 = new IJK(this, 2);
    }

    @Override // X.JQ1
    public void A78(JLp jLp) {
        11T.A0F(jLp, 0);
        if (this.A00.A02(jLp)) {
            if (this.A06 != null) {
                jLp.CDl(this.A06);
            }
            I5d i5d = this.A07;
            if (i5d != null) {
                jLp.CDg(i5d);
                int i = this.A05;
                int i2 = this.A04;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                jLp.CDi(i5d, i, i2);
            }
        }
    }

    @Override // X.JQ1
    public View AeA() {
        return B4V();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:15|16|17|18|(3:20|21|(3:23|24|(13:26|27|28|29|30|31|32|33|34|35|36|11|12)))|37|38|39|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        r304 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        new java.lang.IllegalStateException("Failed to acquire bitmap", r304);
     */
    @Override // X.JQ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B4H(X.IOF r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            android.view.TextureView r0 = r0.A06     // Catch: java.lang.Throwable -> La7
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1b
            java.lang.String r0 = "Preview view is null"
            r304 = r0
            r0 = r304
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)     // Catch: java.lang.Throwable -> La7
            r303 = r0
        L13:
            r0 = r302
            r1 = r303
            r0.BnG(r1)     // Catch: java.lang.Throwable -> La7
            goto La4
        L1b:
            r0 = r303
            int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> La7
            r305 = r0
            r0 = r303
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> La7
            r306 = r0
            r0 = r301
            boolean r0 = r0.A01     // Catch: java.lang.Throwable -> La7
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L85
            r0 = r301
            X.I5d r0 = r0.A07     // Catch: java.lang.Throwable -> La7
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L85
            r0 = r304
            android.view.Surface r0 = r0.A00()     // Catch: java.lang.Throwable -> La7
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L85
            r0 = r303
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> La7
            r303 = r0
            X.HJS r0 = X.JQ7.A00     // Catch: java.lang.Throwable -> La7
            r304 = r0
            r0 = r301
            r1 = r304
            X.JG5 r0 = X.Ic7.A08(r0, r1)     // Catch: java.lang.Throwable -> La7
            r309 = r0
            r0 = r309
            X.JQ7 r0 = (X.JQ7) r0     // Catch: java.lang.Throwable -> La7
            r309 = r0
            java.lang.String r0 = "Lite-Controller-Thread"
            r304 = r0
            r0 = r309
            r1 = r304
            android.os.Handler r0 = r0.AoV(r1)     // Catch: java.lang.Throwable -> La7
            r304 = r0
            X.J2X r0 = new X.J2X     // Catch: java.lang.Throwable -> La7
            r309 = r0
            r0 = r309
            r1 = r303
            r2 = r308
            r3 = r302
            r4 = r305
            r5 = r306
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
            r0 = r304
            r1 = r309
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> La7
            goto La4
        L85:
            java.lang.String r0 = "Failed to acquire bitmap"
            r309 = r0
            r0 = r303
            r1 = r302
            r2 = r305
            r3 = r306
            X.IOF.A00(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L95
            goto La4
        L95:
            r304 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7
            r303 = r0
            r0 = r303
            r1 = r309
            r2 = r304
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> La7
            goto L13
        La4:
            r0 = r301
            monitor-exit(r0)
            return
        La7:
            r304 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2428Gcp.B4H(X.IOF):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 3, list:
          (r302v2 ??) from 0x0065: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x0008, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:android.view.TextureView) from 0x0020: INVOKE (r302v2 ?? I:android.view.TextureView), (r0v13 ?? I:android.view.TextureView$SurfaceTextureListener) VIRTUAL call: android.view.TextureView.setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener):void A[Catch: all -> 0x0069, MD:(android.view.TextureView$SurfaceTextureListener):void (c)]
          (r302v2 ?? I:android.view.TextureView) from 0x0025: IPUT (r302v2 ?? I:android.view.TextureView), (r301v0 'this' ?? I:X.Gcp A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0069] X.Gcp.A06 android.view.TextureView
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // X.JQ1
    public android.view.View B4V() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            android.view.TextureView r0 = r0.A06     // Catch: java.lang.Throwable -> L69
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L65
            r0 = r301
            android.content.Context r0 = r0.A02     // Catch: java.lang.Throwable -> L69
            r303 = r0
            android.view.TextureView r0 = new android.view.TextureView     // Catch: java.lang.Throwable -> L69
            r302 = r0
            r0 = r302
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L69
            r0 = r301
            android.view.TextureView$SurfaceTextureListener r0 = r0.A03     // Catch: java.lang.Throwable -> L69
            r303 = r0
            r0 = r302
            r1 = r303
            r0.setSurfaceTextureListener(r1)     // Catch: java.lang.Throwable -> L69
            r0 = r301
            r1 = r302
            r0.A06 = r1     // Catch: java.lang.Throwable -> L69
            r0 = r301
            X.I4V r0 = r0.A00     // Catch: java.lang.Throwable -> L69
            r303 = r0
            r0 = r303
            java.util.List r0 = r0.A00     // Catch: java.lang.Throwable -> L69
            r303 = r0
            r0 = r303
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            r304 = r0
        L39:
            r0 = r304
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L65
            r0 = r304
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            r306 = r0
            r0 = r306
            X.JLp r0 = (X.JLp) r0     // Catch: java.lang.Throwable -> L69
            r306 = r0
            r0 = r301
            android.view.TextureView r0 = r0.A06     // Catch: java.lang.Throwable -> L69
            r303 = r0
            r0 = r306
            r1 = r303
            r0.CDl(r1)     // Catch: java.lang.Throwable -> L69
            goto L39
        L65:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L69:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2428Gcp.B4V():android.view.View");
    }

    @Override // X.JQ1
    public boolean BNN() {
        return AnonymousClass001.A1T(this.A06);
    }

    @Override // X.JQ1
    public void Cf0(JLp jLp) {
        11T.A0F(jLp, 0);
        this.A00.A03(jLp);
    }

    @Override // X.JQ1
    public void CtI(View view) {
        throw AnonymousClass001.A0q("setPreviewView() is not supported");
    }
}
