package com.facebook.messaging.montage.composer.capturebutton;

import X.0FI;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.4YV;
import X.5II;
import X.5WA;
import X.AbJ;
import X.AbstractC2326GOr;
import X.AbstractC2421Gci;
import X.AnonymousClass001;
import X.C0ed;
import X.C1oo;
import X.C1pl;
import X.C2420Gch;
import X.C2427Gco;
import X.C2608Gix;
import X.C2786Go3;
import X.C2787Go4;
import X.C62l;
import X.C66h;
import X.C66i;
import X.C66n;
import X.C6r6;
import X.C6x4;
import X.C6x9;
import X.C7o3;
import X.C7tz;
import X.C9lD;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GTi;
import X.GnK;
import X.GuV;
import X.H0T;
import X.H4T;
import X.HAq;
import X.HGW;
import X.HSk;
import X.HSl;
import X.HTb;
import X.Had;
import X.Hae;
import X.Hfz;
import X.Hjs;
import X.Hk2;
import X.HnB;
import X.HnX;
import X.Hvi;
import X.I0M;
import X.I1R;
import X.I4C;
import X.I4U;
import X.I58;
import X.I7W;
import X.I9K;
import X.ICU;
import X.IFl;
import X.IHZ;
import X.IL3;
import X.IOA;
import X.IOD;
import X.IQ1;
import X.Ic7;
import X.Ida;
import X.JMN;
import X.JO1;
import X.JPt;
import X.JQ9;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerView;
import com.facebook.messaging.montage.composer.cameracore.view.CameraPreviewFlashView;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.widget.CustomLinearLayout;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CaptureButton.class */
public final class CaptureButton extends View implements C66n {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public LinearGradient A06;
    public Had A07;
    public Hae A08;
    public Integer A09;
    public Long A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K;
    public final Matrix A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final RectF A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final C1pl A0U;
    public final Paint A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final Paint A0Y;
    public final GestureDetector A0Z;
    public final C66i A0a;
    public static final float A0b = GOn.A02(TypedValue.applyDimension(1, 5.92f, DKD.A08()));
    public static final float A0d = GOn.A02(TypedValue.applyDimension(1, 2.96f, DKD.A08()));
    public static final float A0c = GOn.A02(TypedValue.applyDimension(1, 5.92f, DKD.A08()));

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureButton(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptureButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0S = 1Bu.A00(49939);
        this.A0T = 1HG.A00(context, 99435);
        this.A0P = 1Bq.A00(131273);
        this.A0L = GOn.A0F();
        this.A0O = DKC.A0D();
        this.A0G = 1.0f;
        this.A00 = 1.0f;
        this.A0R = 1Bq.A00(67926);
        this.A0Q = 1Bu.A00(115987);
        this.A0E = true;
        this.A09 = 0S2.A00;
        this.A0U = new H0T(this, 1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1oo.A0J, 0, 0);
        11T.A0A(obtainStyledAttributes);
        this.A0H = A0b;
        this.A0I = A0c;
        try {
            this.A02 = getResources().getColor(2132213887);
            int color = obtainStyledAttributes.getColor(6, 0);
            this.A0J = obtainStyledAttributes.getColor(4, -1);
            this.A0K = obtainStyledAttributes.getColor(5, 0);
            this.A0H = obtainStyledAttributes.getDimension(1, this.A0H);
            this.A0I = obtainStyledAttributes.getDimension(2, this.A0I);
            this.A03 = 2132607890;
            obtainStyledAttributes.recycle();
            Paint A0A = DKC.A0A(1);
            this.A0X = A0A;
            A0A.setColor(this.A0J);
            DKC.A1L(A0A);
            A0A.setStrokeWidth(this.A0H);
            Paint A0A2 = DKC.A0A(1);
            this.A0W = A0A2;
            A0A2.setColor(-1);
            Paint.Style style = Paint.Style.FILL;
            A0A2.setStyle(style);
            Paint A0A3 = DKC.A0A(1);
            this.A0V = A0A3;
            A0A3.setColor(1476395007);
            A0A3.setStyle(style);
            Paint A0A4 = DKC.A0A(5);
            this.A0Y = A0A4;
            A0A4.setColor(color);
            Paint paint = new Paint(A0A);
            this.A0M = paint;
            paint.setColor(this.A0K);
            paint.setStrokeWidth(this.A0H + this.A0I);
            Paint A0A5 = DKC.A0A(1);
            this.A0N = A0A5;
            A0A5.setColor(this.A02);
            DKC.A1L(A0A5);
            A0A5.setStrokeCap(Paint.Cap.ROUND);
            A0A5.setStrokeWidth(this.A0H);
            C66i A0W = AbstractC2326GOr.A0W(this.A0S);
            A0W.A09(C66h.A01());
            A0W.A03();
            this.A0a = A0W;
            1Br.A0C(this.A0R);
            this.A0A = Long.valueOf(LocationComponentOptions.STALE_STATE_DELAY_MS);
            setClickable(true);
            setLongClickable(true);
            this.A0Z = new GestureDetector(context, (GestureDetector.OnGestureListener) new GTi(this));
            ((C7tz) 1Br.A0B(this.A0Q)).A01 = new C7o3(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ CaptureButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(Canvas canvas) {
        Paint paint;
        Paint paint2 = this.A0M;
        float min = ((Math.min(getWidth(), getHeight()) / 2.0f) - (paint2.getStrokeWidth() / 2.0f)) * this.A00;
        float f = this.A0C ? this.A0G * 60.0f : 0.0f;
        float A02 = DKC.A02(this) / 2.0f;
        float A03 = DKC.A03(this) / 2.0f;
        boolean z = this.A0C;
        Paint paint3 = this.A0N;
        if (z) {
            float f2 = A0d;
            paint3.setStrokeWidth(f2);
            Paint paint4 = this.A0X;
            float f3 = 0.0f / 0.0f;
            paint4.setColor(-1);
            paint4.setStrokeWidth(f2);
            canvas.drawCircle(A02, A03, min, paint4);
            Paint paint5 = this.A0W;
            paint5.setColor(-1);
            canvas.drawCircle(A02, A03, f, paint5);
            paint = this.A0V;
        } else {
            float f4 = this.A0H;
            paint3.setStrokeWidth(f4);
            Paint paint6 = this.A0X;
            paint6.setStrokeWidth(f4);
            canvas.drawCircle(A02, A03, min, paint6);
            canvas.drawCircle(A02, A03, min, paint2);
            paint = this.A0Y;
        }
        canvas.drawCircle(A02, A03, min, paint);
        if (this.A0F) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2132279369);
            Paint paint7 = this.A0W;
            GOo.A18(resources, paint7, 2132214621);
            canvas.drawCircle(A02, A03, dimensionPixelSize, paint7);
        }
    }

    public static final void A01(CaptureButton captureButton) {
        Integer num = captureButton.A09;
        if (num == 0S2.A0C || num == 0S2.A01) {
            captureButton.A05();
        }
        A03(captureButton, false);
    }

    public static final void A02(CaptureButton captureButton) {
        ((C62l) 1Br.A0B(captureButton.A0P)).CeK(captureButton.A0U);
        captureButton.setProgress(0.0f);
        C66i c66i = captureButton.A0a;
        c66i.A06(1.2430000305175781d);
        c66i.A04();
        Integer num = 0S2.A00;
        if (captureButton.A09 != num) {
            captureButton.A09 = num;
            captureButton.invalidate();
        }
        captureButton.A0C = false;
    }

    public static final void A03(CaptureButton captureButton, boolean z) {
        Paint paint = captureButton.A0X;
        int i = captureButton.A0J;
        if (z) {
            paint.setAlpha((int) (Color.alpha(i) * 0.6f));
            captureButton.A0M.setAlpha(0);
        } else {
            paint.setColor(i);
            captureButton.A0M.setColor(captureButton.A0K);
        }
        captureButton.invalidate();
    }

    public final void A04() {
        Hjs hjs;
        this.A0C = this.A0B;
        Integer num = 0S2.A01;
        if (this.A09 != num) {
            this.A09 = num;
            invalidate();
        }
        C66i c66i = this.A0a;
        c66i.A03();
        c66i.A07(1.2430000305175781d);
        Hae hae = this.A08;
        if (hae != null) {
            I4C i4c = hae.A01;
            CircularArtPickerView circularArtPickerView = i4c.A0Y.A0C;
            if (circularArtPickerView != null && (hjs = circularArtPickerView.A0I) != null) {
                GOp.A1P(hjs.A02);
                GOp.A1P(hjs.A06);
                GOp.A1P(hjs.A03);
            }
            I7W.A01(i4c.A0b, "start_video_recording");
            GnK gnK = hae.A00;
            gnK.getClass();
            GnK gnK2 = gnK;
            if (gnK2.A1b() && gnK2.A05) {
                GOo.A0G(gnK2.requireContext()).getDefaultDisplay().getRotation();
                boolean A04 = C6x9.A04(gnK2.A01.A01.A0A);
                FbUserSession A0G = 1BL.A0G(gnK2);
                5WA r0 = (5WA) gnK2.A0B.get();
                boolean z = gnK2.A07;
                boolean z2 = gnK2.A01.A00.A1Q.Aio().A05;
                QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                quickPerformanceLogger.markerStart(5505196);
                quickPerformanceLogger.markerTag(5505196, A04 ? "inbox" : "composer");
                if (z) {
                    quickPerformanceLogger.markerTag(5505196, "first_capture");
                }
                if (z2) {
                    quickPerformanceLogger.markerTag(5505196, "has_effect");
                }
                ICU icu = gnK2.A01.A01;
                11T.A0F(A0G, 0);
                Ida ida = icu.A0C;
                if (ida.A0C()) {
                    return;
                }
                AbstractC2421Gci abstractC2421Gci = (AbstractC2421Gci) Ida.A00(ida);
                I1R A0F = abstractC2421Gci.A0F();
                icu.A00 = (A0F == null || !GOp.A1Y(I1R.A0i, A0F)) ? 0 : ((C2420Gch) abstractC2421Gci).A0g.BLM();
                Hk2 hk2 = icu.A0T;
                C2608Gix A00 = ICU.A00(icu);
                File A002 = ((HnB) 1Lm.A05(hk2.A02, A0G, 99907)).A00("MSGR_VIDEO_FOR_UPLOAD_", ".mp4");
                hk2.A01 = A002;
                hk2.A00 = A00;
                try {
                    HGW.A00(A002);
                    GOq.A0i(hk2.A06).markerPoint(5505196, "VIDEO_RECORDING_START_CALLED");
                    JPt jPt = hk2.A04;
                    File file = hk2.A01;
                    11T.A0I(file, "null cannot be cast to non-null type java.io.File");
                    HnX hnX = hk2.A09;
                    C2427Gco c2427Gco = (C2427Gco) jPt;
                    if (file != null) {
                        if (!Ic7.A0A(c2427Gco, JO1.A03, false) && c2427Gco.A00.BV6()) {
                            IHZ.A07(hnX, AnonymousClass001.A0N("Cannot start video recording while camera is paused."));
                            return;
                        }
                        synchronized (c2427Gco.A03) {
                            try {
                                if (c2427Gco.A05 == num) {
                                    IHZ.A07(hnX, AnonymousClass001.A0N("Cannot start video recording. Another recording already in progress"));
                                } else {
                                    Hvi.A00((JQ9) Ic7.A08(c2427Gco, JQ9.A00), "OpticVideoCaptureCoordinator", GOn.A0B(c2427Gco));
                                    GuV guV = new GuV(c2427Gco, 8);
                                    c2427Gco.A05 = num;
                                    c2427Gco.A04 = hnX;
                                    List list = c2427Gco.A02.A00;
                                    if (0 < list.size()) {
                                        list.get(0);
                                        throw AnonymousClass001.A0Q("onVideoCaptureStarted");
                                    }
                                    c2427Gco.A00.D2S(guV, file, null);
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        return;
                    }
                    th = AnonymousClass001.A0T("Both outputFile and outputFileDescriptor cannot be null, one must contain a valid value");
                    throw th;
                } catch (IOException e) {
                    hk2.A09.A00(e);
                }
            }
        }
    }

    public final void A05() {
        if (A06()) {
            A02(this);
            Hae hae = this.A08;
            if (hae != null) {
                GnK gnK = hae.A00;
                gnK.getClass();
                GnK gnK2 = gnK;
                if (gnK2.A1b()) {
                    boolean A04 = C6x9.A04(gnK2.A01.A01.A0A);
                    5WA r0 = (5WA) gnK2.A0B.get();
                    boolean z = gnK2.A07;
                    boolean z2 = gnK2.A01.A00.A1Q.Aio().A05;
                    QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                    quickPerformanceLogger.markerStart(5505197);
                    quickPerformanceLogger.markerTag(5505197, A04 ? "inbox" : "composer");
                    if (z) {
                        quickPerformanceLogger.markerTag(5505197, "first_capture");
                    }
                    if (z2) {
                        quickPerformanceLogger.markerTag(5505197, "has_effect");
                    }
                    ICU icu = gnK2.A01.A01;
                    if (icu.A0C.A0C()) {
                        Hk2 hk2 = icu.A0T;
                        GOq.A0i(hk2.A06).markerPoint(5505197, "VIDEO_RECORDING_STOP_CALLED");
                        hk2.A04.D2z(false);
                    }
                }
                IFl iFl = hae.A01.A0Y;
                CircularArtPickerView circularArtPickerView = iFl.A0C;
                if (circularArtPickerView != null) {
                    circularArtPickerView.A0Q = false;
                }
                HAq hAq = iFl.A0M;
                if (hAq == HAq.A02 || hAq == HAq.A0D) {
                    iFl.A0Q();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.0S2.A0C) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Integer r0 = r0.A09
            r302 = r0
            java.lang.Integer r0 = X.0S2.A01
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            java.lang.Integer r0 = X.0S2.A0C
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.capturebutton.CaptureButton.A06():boolean");
    }

    public final boolean A07() {
        boolean z;
        if (this.A0E) {
            z = true;
            A03(this, true);
            if (this.A09 == 0S2.A00) {
                A04();
                return true;
            }
        } else {
            if (this.A04 != 0) {
                AbstractC2326GOr.A1I(AbJ.A0k(this.A0T), this.A04);
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v191, types: [X.Hh2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [X.Hh2, java.lang.Object] */
    public final boolean A08() {
        I4U i4u;
        HSk hSk;
        I9K i9k;
        HSk hSk2;
        GnK gnK;
        I9K i9k2;
        Hjs hjs;
        C6x4 Afb;
        boolean z = false;
        A03(this, false);
        Had had = this.A07;
        if (had == null || (Afb = had.A01.A0a.A02.Afb()) == null || !(Afb.equals(C6x4.A0A) || Afb.equals(C6x4.A02))) {
            Integer num = this.A09;
            if (num == 0S2.A00 || num == 0S2.A0N) {
                Hae hae = this.A08;
                if (hae != null) {
                    GnK gnK2 = hae.A00;
                    gnK2.getClass();
                    GnK gnK3 = gnK2;
                    if (!gnK3.A1b() || !gnK3.A01.A01.A0C.A0C()) {
                        I4C i4c = hae.A01;
                        IFl iFl = i4c.A0Y;
                        CircularArtPickerView circularArtPickerView = iFl.A0C;
                        if (circularArtPickerView != null && (hjs = circularArtPickerView.A0I) != null) {
                            GOp.A1P(hjs.A02);
                            GOp.A1P(hjs.A06);
                            GOp.A1P(hjs.A03);
                        }
                        I7W.A01(i4c.A0b, "capture_photo");
                        if (gnK3.A1b() && gnK3.A05) {
                            gnK3.A0D.A00 = 1;
                            boolean A04 = C6x9.A04(gnK3.A01.A01.A0A);
                            5WA r0 = (5WA) gnK3.A0B.get();
                            boolean z2 = gnK3.A06;
                            boolean z3 = gnK3.A01.A00.A1Q.Aio().A05;
                            QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                            quickPerformanceLogger.markerStart(5505153);
                            quickPerformanceLogger.markerTag(5505153, A04 ? "inbox" : "composer");
                            if (z2) {
                                quickPerformanceLogger.markerTag(5505153, "first_capture");
                            }
                            if (z3) {
                                quickPerformanceLogger.markerTag(5505153, "has_effect");
                            }
                            ICU icu = gnK3.A01.A01;
                            if (icu.A07) {
                                if (icu.A09) {
                                    I0M i0m = icu.A0S;
                                    ?? obj = new Object();
                                    obj.A03 = true;
                                    if (!i0m.A03) {
                                        HSl hSl = i0m.A0B.A00.A03;
                                        if (hSl != null && (hSk2 = hSl.A00.A00) != null && (i9k2 = (gnK = hSk2.A00).A02) != null) {
                                            i9k2.A00.A1Q.Cur(true);
                                            gnK.A0A.A01(false);
                                        }
                                        C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
                                        if (C9lD.A01(c9lD, i0m.A0C)) {
                                            C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_1_start");
                                        }
                                        obj.A04 = true;
                                        i0m.A03 = true;
                                        C2786Go3 c2786Go3 = new C2786Go3(i0m);
                                        i0m.A01 = c2786Go3;
                                        i0m.A04.D41(obj, c2786Go3, null);
                                    } else if (i0m.A00 != null) {
                                        obj.A04 = false;
                                        C9lD c9lD2 = (C9lD) 1Br.A0B(i0m.A08);
                                        if (C9lD.A01(c9lD2, i0m.A0C)) {
                                            C9lD.A00(c9lD2).flowMarkPoint(c9lD2.A00, "step_wise_capture_2_start");
                                        }
                                        C2787Go4 c2787Go4 = new C2787Go4(i0m);
                                        i0m.A02 = c2787Go4;
                                        i0m.A04.D41(obj, c2787Go4, null);
                                        GOq.A0i(i0m.A07).markerPoint(5505153, "CAMERA_PREVIEW_FROZEN");
                                        i4u = i0m.A0A;
                                    } else {
                                        I0M.A00(i0m);
                                    }
                                    H4T h4t = icu.A0W;
                                    CameraPreviewFlashView cameraPreviewFlashView = h4t.A07;
                                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                    alphaAnimation.setDuration(100);
                                    alphaAnimation.setInterpolator(new LinearInterpolator());
                                    IL3.A00(alphaAnimation, cameraPreviewFlashView, 3);
                                    cameraPreviewFlashView.setVisibility(0);
                                    cameraPreviewFlashView.startAnimation(alphaAnimation);
                                    ((5II) 1Br.A0B(h4t.A05)).A0A("quickcam_image_take_and_send");
                                    h4t.A0V();
                                } else {
                                    FbUserSession A0F = 4YV.A0F(icu.A01);
                                    Hfz hfz = icu.A0R;
                                    11T.A0F(A0F, 0);
                                    ?? obj2 = new Object();
                                    obj2.A03 = true;
                                    obj2.A04 = false;
                                    obj2.A00 = ((HnB) 1Lm.A05(hfz.A00, A0F, 99907)).A00("photo", ".png");
                                    hfz.A01.D41(obj2, new IOA(hfz), new IOD(hfz));
                                    GOq.A0i(hfz.A02).markerPoint(5505153, "CAMERA_PREVIEW_FROZEN");
                                    i4u = hfz.A03;
                                }
                                ICU icu2 = i4u.A00;
                                HTb hTb = icu2.A0a;
                                if (hTb.A00 == 1) {
                                    hTb.A00 = 2;
                                    HSl hSl2 = icu2.A03;
                                    if (hSl2 != null && (hSk = hSl2.A00.A00) != null && (i9k = hSk.A00.A02) != null) {
                                        IQ1 iq1 = i9k.A00;
                                        I58 i58 = iq1.A1U;
                                        if (i58.A02()) {
                                            C6r6 c6r6 = iq1.A1N.A0A;
                                            Context context = iq1.A0I;
                                            if (i58.A04(context, c6r6) && i58.A03(context)) {
                                                iq1.A1Q.CsZ(3);
                                            }
                                        }
                                        DKG.A1J(iq1.A1C.A0C);
                                        iq1.A0H();
                                    }
                                }
                                H4T h4t2 = icu.A0W;
                                CameraPreviewFlashView cameraPreviewFlashView2 = h4t2.A07;
                                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation2.setDuration(100);
                                alphaAnimation2.setInterpolator(new LinearInterpolator());
                                IL3.A00(alphaAnimation2, cameraPreviewFlashView2, 3);
                                cameraPreviewFlashView2.setVisibility(0);
                                cameraPreviewFlashView2.startAnimation(alphaAnimation2);
                                ((5II) 1Br.A0B(h4t2.A05)).A0A("quickcam_image_take_and_send");
                                h4t2.A0V();
                            }
                        }
                        HAq hAq = iFl.A0M;
                        if (hAq == HAq.A02 || hAq == HAq.A0D) {
                            iFl.A0Q();
                        }
                    }
                }
            }
            return z;
        }
        if (A06()) {
            A01(this);
        } else {
            A07();
        }
        z = true;
        return z;
    }

    public final boolean A09(MotionEvent motionEvent) {
        I1R A0F;
        if (!isEnabled()) {
            return false;
        }
        if (!this.A0Z.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.A0D = false;
                A01(this);
                return true;
            }
            if (action == 2 && this.A09 == 0S2.A0C && this.A08 != null && motionEvent.getY() < 0.0f) {
                Hae hae = this.A08;
                if (hae == null) {
                    throw 1BK.A0h();
                }
                float abs = Math.abs(motionEvent.getY() / getY());
                GnK gnK = hae.A00;
                gnK.getClass();
                GnK gnK2 = gnK;
                if (gnK2.A1b() && gnK2.A05) {
                    ICU icu = gnK2.A01.A01;
                    Ida ida = icu.A0C;
                    AbstractC2421Gci abstractC2421Gci = (AbstractC2421Gci) Ida.A00(ida);
                    I1R A0F2 = abstractC2421Gci.A0F();
                    int A0C = (A0F2 == null || (A0F = abstractC2421Gci.A0F()) == null || !GOp.A1Y(I1R.A0i, A0F)) ? 0 : GOq.A0C(I1R.A0m, A0F2);
                    float f = icu.A00;
                    float f2 = A0C;
                    int A00 = (int) C0ed.A00(((f2 - f) * abs) + f, f, f2);
                    AbstractC2421Gci abstractC2421Gci2 = (AbstractC2421Gci) Ida.A00(ida);
                    I1R A0F3 = abstractC2421Gci2.A0F();
                    if (A0F3 != null && GOp.A1Y(I1R.A0i, A0F3)) {
                        ((C2420Gch) abstractC2421Gci2).A0g.Cwp(null, A00);
                    }
                }
            }
        }
        return true;
    }

    @Override // X.C66n
    public void CMP(C66i c66i) {
    }

    @Override // X.C66n
    public void CMR(C66i c66i) {
        invalidate();
    }

    @Override // X.C66n
    public void CMS(C66i c66i) {
    }

    @Override // X.C66n
    public void CMV(C66i c66i) {
        float A01 = (float) GOq.A01(c66i);
        if (this.A0C) {
            this.A0G = (A01 - 1.0f) * 6.0f;
        } else {
            this.A00 = A01;
        }
        invalidate();
    }

    public final float getProgress() {
        return this.A01;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(176723256);
        super.onAttachedToWindow();
        this.A0a.A0A(this);
        0FI.A0C(1996099726, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1689095836);
        this.A0a.A0B(this);
        super.onDetachedFromWindow();
        0FI.A0C(976063518, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        LinearGradient linearGradient;
        11T.A0F(canvas, 0);
        int intValue = this.A09.intValue();
        if (intValue == 0 || intValue == 1) {
            A00(canvas);
            return;
        }
        if (intValue != 2 && intValue != 3) {
            throw AnonymousClass001.A0T("Encountered a mode without drawing instructions");
        }
        A00(canvas);
        float f = this.A01 * 360.0f;
        float strokeWidth = this.A0M.getStrokeWidth() / 2.0f;
        float A02 = DKC.A02(this) / 2.0f;
        float A03 = DKC.A03(this) / 2.0f;
        float min = ((Math.min(getWidth(), getHeight()) / 2.0f) - strokeWidth) * this.A00;
        if (this.A0C && (linearGradient = this.A06) != null) {
            Matrix matrix = this.A0L;
            linearGradient.getLocalMatrix(matrix);
            float elapsedRealtime = (float) (SystemClock.elapsedRealtime() - this.A05);
            Long l = this.A0A;
            if (l == null) {
                throw 1BK.A0h();
            }
            matrix.setRotate(((elapsedRealtime / (l.floatValue() / 2.0f)) * 360.0f) % 360.0f, DKC.A02(this) / 2.0f, DKC.A03(this) / 2.0f);
            linearGradient.setLocalMatrix(matrix);
        }
        RectF rectF = this.A0O;
        rectF.set(A02 - min, A03 - min, A02 + min, A03 + min);
        canvas.drawArc(rectF, 270.0f, f, false, this.A0N);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CircularArtPickerView circularArtPickerView;
        CustomLinearLayout customLinearLayout;
        JMN jmn;
        int A06 = GOp.A06(motionEvent, -1722570129);
        Had had = this.A07;
        boolean A09 = (had != null && (circularArtPickerView = had.A01.A0Y.A0C) != null && (customLinearLayout = circularArtPickerView.A0M) != null && customLinearLayout.getVisibility() == 8 && circularArtPickerView.getVisibility() == 0 && circularArtPickerView.A0i.A00 == 0 && (circularArtPickerView.A0Q || (jmn = circularArtPickerView.A0K) == null || !jmn.BVI())) ? false : A09(motionEvent);
        0FI.A0B(-830185003, A06);
        return A09;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    public final void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        this.A01 = f;
        this.A0Y.setAlpha((int) (255.0f * f));
        invalidate();
    }
}
