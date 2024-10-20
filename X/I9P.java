package X;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.editing.trimmer.VideoEditGalleryTrimmerFilmstripView;
import com.facebook.messaging.montage.composer.CanvasEditorView;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.player.RichVideoPlayer;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: I9P.class */
public final class I9P {
    public Context A00;
    public HhM A01;
    public Hzt A02;
    public ICZ A03;
    public Hjp A04;
    public VideoPlayerParams A05;
    public 2Wo A06;
    public Future A07;
    public boolean A08;
    public 1BY A09;
    public final Uri A0A;
    public final CanvasEditorView A0D;
    public final HkO A0E;
    public final C00i A0G = 1BQ.A02(98404);
    public final AbR A0C = GOn.A0O((1BY) null, 504);
    public final AbR A0B = GOn.A0O((1BY) null, 503);
    public final ExecutorService A0F = (ExecutorService) 1Bi.A03(16457);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.Hjo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.Hjp, X.Hjo, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.Hjp, X.Hjo, boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.Hjp, X.Hjo, boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.Hjp, X.Hjo, boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.Hjp, X.Hjo, boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int, X.Hjp, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int, X.Hjp, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int, X.Hjp, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.Hrt, com.facebook.auth.usersession.FbUserSession] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int, X.Hjo] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int, X.Hjo] */
    public I9P(Uri uri, 1BO r303, HhM hhM, CanvasEditorView canvasEditorView, HkO hkO, 2Wo r307) {
        Hjo hjo;
        this.A09 = 7zL.A0Q(r303);
        this.A0D = canvasEditorView;
        this.A06 = r307;
        this.A0A = uri;
        this.A0E = hkO;
        this.A01 = hhM;
        this.A00 = canvasEditorView.getContext();
        if (this.A04 == null) {
            new Hjo();
            1.A09 = true;
            1.A07 = true;
            ?? r0 = hhM.A00;
            r0.A00 = r0;
            ?? r02 = hhM.A01;
            r02.A01 = r02;
            ?? A00 = A00(this).A00();
            A00.A03 = A00;
            hjo = A00;
        } else {
            ?? obj = new Object();
            obj.A05 = null;
            obj.A04 = null;
            obj.A09 = false;
            obj.A08 = false;
            obj.A06 = false;
            obj.A07 = false;
            obj.A02 = 1000;
            (-1).A00 = -1;
            (-1).A01 = -1;
            (-1).A03 = 0;
            ?? r03 = (-1).A05;
            r03.A05 = r03;
            HhM hhM2 = r03.A04;
            hhM2.A04 = hhM2;
            ?? r04 = hhM2.A09;
            r04.A09 = r04;
            ?? r05 = r04.A08;
            r05.A08 = r05;
            ?? r06 = r05.A06;
            r06.A06 = r06;
            ?? r07 = r06.A07;
            r07.A07 = r07;
            ?? r08 = r07.A02;
            r08.A02 = r08;
            ?? r09 = r08.A00;
            r09.A00 = r09;
            ?? r010 = r09.A01;
            r010.A01 = r010;
            ?? r011 = r010.A03;
            r011.A03 = r011;
            ?? A002 = A00(this).A00();
            A002.A03 = A002;
            hjo = A002;
        }
        this.A04 = new Hjp(hjo);
        1Fw.A05((1BY) null);
        AbR abR = this.A0C;
        Context context = this.A00;
        Uri uri2 = this.A0A;
        7Xn r012 = 7Xn.A03;
        He1 he1 = this.A01.A02;
        Hjp hjp = this.A04;
        A03(A00(this));
        ICZ A01 = FbInjector.A01();
        AbL.A0y(A01);
        try {
            A01 = new ICZ(A01, A01, A01, this, this, A01, A01, A01, A01, A01);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = A01;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static Hrt A00(I9P i9p) {
        CanvasEditorView canvasEditorView = i9p.A0D;
        CanvasEditorView.A01(canvasEditorView);
        canvasEditorView.A03.getClass();
        CanvasEditorView.A01(canvasEditorView);
        return canvasEditorView.A03;
    }

    public static void A01(I9P i9p, int i) {
        Hzt hzt;
        Uri fromFile;
        Hjp hjp = i9p.A04;
        hjp.getClass();
        if (!hjp.A07 || (hzt = i9p.A02) == null) {
            return;
        }
        int i2 = hzt.A05;
        int i3 = (i / i2) * i2;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(hzt.A03.getPath());
        A0k.append(File.separator);
        A0k.append("video_editing_frame_");
        A0k.append(hzt.A04);
        A0k.append("_");
        A0k.append(i3);
        File A0E = AnonymousClass001.A0E(AnonymousClass001.A0d(".jpg", A0k));
        if (!A0E.exists() || (fromFile = Uri.fromFile(A0E)) == null) {
            i9p.A0D.A0H.setVisibility(8);
            return;
        }
        ImageView imageView = i9p.A0D.A0H;
        if (!imageView.isShown()) {
            imageView.setVisibility(0);
        }
        imageView.setImageURI(fromFile);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006b, code lost:
    
        if (r0 != (-1)) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.HhM, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.HhM A02() {
        /*
            r301 = this;
            r0 = r301
            X.HhM r0 = r0.A01
            r302 = r0
            X.HhM r0 = new X.HhM
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r302
            X.He1 r0 = r0.A02
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A02 = r1
            r0 = r302
            boolean r0 = r0.A04
            r305 = r0
            r0 = r303
            r1 = r305
            r0.A04 = r1
            r0 = r302
            boolean r0 = r0.A03
            r305 = r0
            r0 = r303
            r1 = r305
            r0.A03 = r1
            r0 = r302
            int r0 = r0.A00
            r305 = r0
            r0 = r303
            r1 = r305
            r0.A00 = r1
            r0 = r302
            int r0 = r0.A01
            r305 = r0
            r0 = r303
            r1 = r305
            r0.A01 = r1
            r0 = r301
            X.ICZ r0 = r0.A03
            r304 = r0
            r0 = r304
            int r0 = r0.A04()
            r306 = r0
            r0 = r304
            int r0 = r0.A03()
            r307 = r0
            r0 = -1
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L6e
            r0 = 0
            r308 = r0
            r0 = 0
            r302 = r0
            r0 = r307
            r1 = r305
            if (r0 == r1) goto L71
        L6e:
            r0 = 1
            r308 = r0
        L71:
            X.He1 r0 = new X.He1
            r304 = r0
            r0 = r304
            r1 = r307
            r2 = r306
            r3 = r308
            r0.<init>(r1, r2, r3)
            r0 = r303
            r1 = r304
            r0.A02 = r1
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9P.A02():X.HhM");
    }

    public File A03(FbUserSession fbUserSession) {
        return ((1MC) this.A0G.get()).AUq(new 2Jm((1Zj) null, 0Pz.A02("USER_SCOPED_TEMP_FOLDER_", "MONTAGE_VIDEO_TRIMMING", ((HnB) 1Lo.A04((Context) null, fbUserSession, this.A09, 99907)).A00.getCacheDir()), (java.util.Map) null, (java.util.Map) null), 451743877);
    }

    public void A04(int i) {
        this.A01.A03 = true;
        A00(this).A01();
        2Wo r0 = A00(this).A02;
        if (r0.A00 != null) {
            ((RichVideoPlayer) r0.A01()).CkD(C52j.A2Z, i);
        }
        A01(this, i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.HhM, java.lang.Object] */
    public void A05(FbUserSession fbUserSession) {
        this.A01.A03 = false;
        this.A01 = new Object();
        if (this.A02 != null) {
            ImageView imageView = this.A0D.A0H;
            if (!imageView.isShown()) {
                imageView.setVisibility(0);
            }
            imageView.setImageURI(null);
            Future future = this.A07;
            if (future != null) {
                if (!future.isDone() && !this.A07.isCancelled()) {
                    this.A07.cancel(true);
                }
                this.A07 = null;
            }
            this.A02 = null;
        }
        ICZ icz = this.A03;
        IPm iPm = icz.A0N;
        iPm.A03 = null;
        IPm.A00(iPm);
        Hso hso = icz.A0K;
        hso.A04 = false;
        hso.A00.removeCallbacks(hso.A03);
        hso.A03 = hso.A09;
        this.A0F.execute(new IwB(fbUserSession, this));
        hso.A00();
        Hru hru = icz.A0M;
        ICZ.A02(icz, hru.A01(0));
        int i = (int) icz.A00;
        int i2 = icz.A0E;
        if (i2 > 0 && i > i2) {
            i = i2;
        }
        int A01 = hru.A01(i);
        hso.A00();
        VideoEditGalleryTrimmerFilmstripView videoEditGalleryTrimmerFilmstripView = icz.A0J.A03;
        if (videoEditGalleryTrimmerFilmstripView != null) {
            videoEditGalleryTrimmerFilmstripView.A0V(A01);
        }
    }

    public void A06(FbUserSession fbUserSession) {
        float f;
        int i;
        6A9 r0 = new 6A9();
        Uri uri = this.A0A;
        uri.getClass();
        r0.A03 = uri;
        6TA A0X = AbstractC2326GOr.A0X(6AB.A03, r0);
        A0X.A1g = true;
        A0X.A1h = false;
        A0X.A03(GOq.A10(uri));
        VideoPlayerParams videoPlayerParams = new VideoPlayerParams(A0X);
        this.A05 = videoPlayerParams;
        this.A0D.A0Y(null, videoPlayerParams, false, this.A01.A04);
        this.A08 = true;
        GOo.A1N(this.A06, 0);
        HkO hkO = this.A0E;
        hkO.getClass();
        Hjp hjp = this.A04;
        hjp.getClass();
        if (hjp.A07) {
            if (this.A02 == null) {
                if (hkO.A0A % 180 == 0) {
                    f = hkO.A0B;
                    i = hkO.A09;
                } else {
                    f = hkO.A09;
                    i = hkO.A0B;
                }
                float f2 = f / i;
                AbR abR = this.A0B;
                Context context = this.A00;
                long j = hkO.A0C;
                File A03 = A03(fbUserSession);
                Context A01 = FbInjector.A01();
                AbL.A0y(abR);
                try {
                    Hzt hzt = new Hzt(context, uri, A03, f2, j);
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    this.A02 = hzt;
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    throw th;
                }
            }
            if (this.A07 == null) {
                this.A07 = this.A0F.submit((Runnable) new IqO(this));
            }
        }
        ICZ icz = this.A03;
        if (icz.A00 > 0) {
            boolean z = icz.A09;
            VideoEditGalleryTrimmerFilmstripView videoEditGalleryTrimmerFilmstripView = icz.A06;
            if (z) {
                videoEditGalleryTrimmerFilmstripView.setVisibility(0);
                return;
            }
            icz.A05 = videoEditGalleryTrimmerFilmstripView.A05;
            icz.A04 = videoEditGalleryTrimmerFilmstripView.A04;
            icz.A03 = videoEditGalleryTrimmerFilmstripView.A03;
            icz.A01 = videoEditGalleryTrimmerFilmstripView.A01;
            icz.A02 = videoEditGalleryTrimmerFilmstripView.A02;
            videoEditGalleryTrimmerFilmstripView.getViewTreeObserver().addOnPreDrawListener(new IKy(icz));
            icz.A09 = true;
        }
    }
}
