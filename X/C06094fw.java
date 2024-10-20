package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fw.class */
public final class C06094fw extends AnonymousClass013 {
    public final Context A00;
    public final Handler A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03;
    public final boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006f, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642165988962L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C06094fw(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = -1
            r303 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r304 = r0
            r0 = r304
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0.A03 = r1
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r304 = r0
            r0 = r304
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r302
            r304 = r0
            r0 = r302
            X.00z r0 = (X.C00z) r0
            android.content.Context r0 = r0.A01
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r302
            android.os.Handler r0 = r0.AYc()
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L72
            r0 = r304
            X.00i r0 = r0.A02
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r305 = r0
            r0 = 36317642165988962(0x8106b400622e62, double:3.030761372953875E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            if (r0 != 0) goto L77
        L72:
            r0 = 0
            r308 = r0
            r0 = 0
            r304 = r0
        L77:
            r0 = r301
            r1 = r308
            r0.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06094fw.<init>(X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "AsyncAudioService";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A04) {
            try {
                Context context = this.A00;
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, new GSQ(audioManager, this.A01));
                    01Q.A01(new C3277Jol(this, 2));
                    01Q.A00(context, "audio");
                }
            } catch (Throwable unused) {
            }
        }
    }
}
