package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cnl.class */
public final class Cnl implements C5pz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C7x A01;
    public final /* synthetic */ C5sb A02;
    public final /* synthetic */ ThreadSummary A03;

    public Cnl(Context context, C7x c7x, C5sb c5sb, ThreadSummary threadSummary) {
        this.A02 = c5sb;
        this.A00 = context;
        this.A03 = threadSummary;
        this.A01 = c7x;
    }

    @Override // X.C5pz
    public void Blg() {
        0fH.A14("BubblesShortcutsUpdater", "Failed to fetch Bitmap for threadKey: %s", new Object[]{this.A03.A0n});
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        11T.A0F(r302, 0);
        try {
            Bitmap bitmap = null;
            if (AbG.A1a(r302)) {
                Object A09 = r302.A09();
                11T.A0I(A09, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                bitmap = ((2EY) A09).A04;
            }
            r302.close();
            if (bitmap != null) {
                this.A02.A01(this.A00, bitmap, this.A01, this.A03);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass127.A00(r302, th);
                throw th2;
            }
        }
    }
}
