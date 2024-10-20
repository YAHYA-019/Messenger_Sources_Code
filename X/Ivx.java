package X;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ivx.class */
public final class Ivx implements Runnable {
    public static final String __redex_internal_original_name = "UnifiedVideoAudioSettings$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ISf A01;

    public Ivx(Context context, ISf iSf) {
        this.A01 = iSf;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52e c52e;
        ISf iSf = this.A01;
        Context context = this.A00;
        11T.A0D(context);
        C52f c52f = iSf.A00;
        AudioManager audioManager = c52f.A01;
        if (audioManager == null) {
            C52f.A00(c52f);
        } else if (audioManager.isMusicActive()) {
            c52e = C52e.A03;
            iSf.A0D = c52e;
            iSf.A08.set(c52f.A02());
            iSf.A09.set(c52f.A02.A03);
            AtomicBoolean atomicBoolean = iSf.A07;
            atomicBoolean.set(c52f.A03());
            ISf.A01(iSf, true);
            boolean A03 = c52f.A03();
            C52j c52j = C52j.A1x;
            atomicBoolean.set(A03);
            iSf.A05.set(false);
            iSf.A06.set(ISf.A01(iSf, false));
            DKE.A0K(iSf.A02).post(new Ivy(iSf, c52j));
            GOo.A15(new 0LQ(new C08j[]{new IgS(iSf)}), context, 4YT.A00(50));
        }
        c52e = C52e.A02;
        iSf.A0D = c52e;
        iSf.A08.set(c52f.A02());
        iSf.A09.set(c52f.A02.A03);
        AtomicBoolean atomicBoolean2 = iSf.A07;
        atomicBoolean2.set(c52f.A03());
        ISf.A01(iSf, true);
        boolean A032 = c52f.A03();
        C52j c52j2 = C52j.A1x;
        atomicBoolean2.set(A032);
        iSf.A05.set(false);
        iSf.A06.set(ISf.A01(iSf, false));
        DKE.A0K(iSf.A02).post(new Ivy(iSf, c52j2));
        GOo.A15(new 0LQ(new C08j[]{new IgS(iSf)}), context, 4YT.A00(50));
    }
}
