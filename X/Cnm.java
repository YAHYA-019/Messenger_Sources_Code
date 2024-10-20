package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Cnm.class */
public final class Cnm implements C5pz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ C1254Abw A02;
    public final /* synthetic */ ThreadSummary A03;
    public final /* synthetic */ SettableFuture A04;

    public Cnm(Context context, FbUserSession fbUserSession, C1254Abw c1254Abw, ThreadSummary threadSummary, SettableFuture settableFuture) {
        this.A04 = settableFuture;
        this.A02 = c1254Abw;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A03 = threadSummary;
    }

    @Override // X.C5pz
    public void Blg() {
        SettableFuture settableFuture = this.A04;
        C1254Abw c1254Abw = this.A02;
        FbUserSession fbUserSession = this.A01;
        Context context = this.A00;
        11T.A0D(context);
        AbG.A1W(settableFuture, C1254Abw.A06(context, null, fbUserSession, c1254Abw, this.A03));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r0.AZk(36324771805483050L) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        r0 = java.lang.Math.min(r0.getWidth(), r0.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        r0 = java.lang.Math.max((r0.getWidth() / 2) - (r0.getHeight() / 2), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        r0 = java.lang.Math.max((r0.getHeight() / 2) - (r0.getWidth() / 2), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        X.0gF.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        r307 = android.graphics.Bitmap.createBitmap(r0, r0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0127, code lost:
    
        if (r0.AZk(36324771805548587L) != false) goto L26;
     */
    @Override // X.C5pz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BpV(X.2EU r302) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cnm.BpV(X.2EU):void");
    }
}
