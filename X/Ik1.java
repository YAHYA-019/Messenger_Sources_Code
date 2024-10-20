package X;

import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: Ik1.class */
public final class Ik1 implements JNR {
    public JNV A00;
    public I8v A01;
    public Hud A02;
    public final /* synthetic */ Ik2 A03;

    public Ik1(Ik2 ik2) {
        this.A03 = ik2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r306.A0P() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(android.content.Context r302, android.view.Surface r303, X.I8v r304, X.HuZ r305, X.I9e r306) {
        /*
            r301 = this;
            r0 = r301
            X.Ik2 r0 = r0.A03
            r307 = r0
            r0 = r307
            X.Hcf r0 = r0.A00
            r308 = r0
            r0 = r307
            X.JJI r0 = r0.A03
            r309 = r0
            r0 = r307
            X.I9d r0 = r0.A01
            r310 = r0
            r0 = r309
            boolean r0 = r0.BND()
            r311 = r0
            r0 = r306
            r312 = r0
            r0 = r311
            if (r0 == 0) goto L3c
            r0 = r306
            boolean r0 = r0.A0P()
            r313 = r0
            r0 = 1
            r311 = r0
            r0 = r313
            if (r0 != 0) goto L42
        L3c:
            r0 = 0
            r311 = r0
            r0 = 0
            r307 = r0
        L42:
            r0 = r308
            r1 = r311
            r0.A01 = r1
            r0 = r311
            if (r0 == 0) goto L73
            X.Ijo r0 = new X.Ijo
            r307 = r0
            r0 = r307
            r1 = r302
            r2 = r303
            r3 = 0
            r4 = r304
            r5 = r310
            r6 = r309
            r7 = r308
            r8 = r305
            r9 = 0
            r10 = r312
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L67:
            r0 = r301
            r1 = r307
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A01 = r1
            return
        L73:
            X.Ijp r0 = new X.Ijp
            r307 = r0
            r0 = r307
            r1 = r302
            r2 = r303
            r3 = 0
            r4 = r304
            r5 = r310
            r6 = r309
            r7 = r308
            r8 = r305
            r9 = 0
            r10 = r312
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ik1.A00(android.content.Context, android.view.Surface, X.I8v, X.HuZ, X.I9e):void");
    }

    public void A5a(MediaEffect mediaEffect, int i) {
        JNV jnv = this.A00;
        jnv.getClass();
        jnv.A5a(mediaEffect, i);
    }

    public void A7a(int i) {
        JNV jnv = this.A00;
        jnv.getClass();
        jnv.A7a(i);
    }

    public IjV AMr(long j) {
        try {
            Hud hud = this.A02;
            hud.getClass();
            return hud.A01(250000L);
        } catch (Throwable th) {
            I8v i8v = this.A01;
            i8v.getClass();
            throw new IllegalStateException(0Pz.A0W("mMediaTranscodeParams.mDebugStats: ", i8v.A0I), th);
        }
    }

    public void ANx(long j) {
        JNV jnv = this.A00;
        jnv.getClass();
        jnv.ANx(j * 1000);
    }

    public String Ajl() {
        Hud hud = this.A02;
        hud.getClass();
        String str = null;
        try {
            str = hud.A05.getName();
        } catch (IllegalStateException unused) {
        }
        return str;
    }

    public MediaFormat B0h() {
        Hud hud = this.A02;
        hud.getClass();
        return hud.A00;
    }

    public int B0n() {
        I8v i8v = this.A01;
        i8v.getClass();
        return (i8v.A0B + i8v.A05) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x030e, code lost:
    
        if (r306.A0P() == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x034e  */
    /* JADX WARN: Type inference failed for: r322v4, types: [X.Qxw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CYq(android.content.Context r302, X.Hqj r303, X.I8v r304, X.HLh r305, X.I9e r306, int r307) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ik1.CYq(android.content.Context, X.Hqj, X.I8v, X.HLh, X.I9e, int):void");
    }

    public void Ccu(IjV ijV) {
        Hud hud = this.A02;
        hud.getClass();
        hud.A08.append("releaseOutputBuffer,");
        hud.A04(ijV, hud.A0A);
    }

    public void CeD(MediaEffect mediaEffect, int i) {
        JNV jnv = this.A00;
        jnv.getClass();
        jnv.CeD(mediaEffect, i);
    }

    public void CfH(int i) {
        this.A00.getClass();
    }

    public void CfX(long j) {
        JNV jnv = this.A00;
        jnv.getClass();
        jnv.AOV(j * 1000);
    }

    public void D0a() {
        Hud hud = this.A02;
        hud.getClass();
        IFX.A07(AnonymousClass001.A1W(hud.A07, 0S2.A01), (String) null);
        hud.A05.signalEndOfInputStream();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.I3R] */
    public void finish() {
        ?? obj = new Object();
        new H3f((I3R) obj, this.A02).A00();
        JNV jnv = this.A00;
        if (jnv != null) {
            jnv.release();
        }
        obj.A02();
    }

    public void flush() {
        JNV jnv = this.A00;
        jnv.getClass();
        jnv.flush();
    }
}
