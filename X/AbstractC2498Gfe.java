package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.litho.LithoView;
import com.facebook.messaging.common.bitmaps.BitmapUtil;
import com.facebook.messaging.media.editing.MultimediaEditorPhotoImageViewer;
import com.facebook.messaging.montage.composer.CanvasEditorView;
import com.facebook.stickers.model.Sticker;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Gfe, reason: case insensitive filesystem */
/* loaded from: Gfe.class */
public abstract class AbstractC2498Gfe extends 2rI {
    public void A03(1OW r302) {
        if (r302.BSj()) {
            2EU A0J = GOn.A0J(r302);
            Bitmap bitmap = null;
            if (A0J != null && AbG.A1a(A0J)) {
                bitmap = AbH.A04(A0J);
            }
            try {
                A04(bitmap);
            } finally {
                2EU.A04(A0J);
            }
        }
    }

    public void A04(Bitmap bitmap) {
        1OW r0;
        int i;
        AtomicInteger atomicInteger;
        Bitmap bitmap2;
        Sticker sticker;
        SettableFuture settableFuture;
        2EU A07;
        if (!(this instanceof GiF)) {
            if (this instanceof GiG) {
                GiG giG = (GiG) this;
                Canvas canvas = giG.A00;
                Rect rect = giG.A01;
                0OO r02 = giG.A02;
                boolean z = giG.A05;
                canvas.save();
                int min = Math.min(canvas.getWidth(), canvas.getHeight());
                int A00 = 0OP.A00(r02);
                if (z) {
                    A00 = -A00;
                }
                float f = min / 2.0f;
                canvas.rotate(A00, f, f);
                sticker = null;
                canvas.drawBitmap(bitmap, (Rect) null, rect, DKC.A0A(2));
                canvas.restore();
                settableFuture = giG.A04;
            } else {
                if (!(this instanceof GiE)) {
                    if (this instanceof GiB) {
                        GiB giB = (GiB) this;
                        if (bitmap != null) {
                            giB.A00.set(bitmap);
                            return;
                        }
                        return;
                    }
                    if (this instanceof GiD) {
                        GiD giD = (GiD) this;
                        switch (giD.A00) {
                            case 0:
                                i = giD.A01;
                                Hig hig = (Hig) giD.A02;
                                atomicInteger = hig.A05;
                                if (i >= atomicInteger.get()) {
                                    if (bitmap != null) {
                                        hig.A00 = 2EU.A00(2EU.A05, IQd.A00, bitmap);
                                        LithoView lithoView = hig.A01;
                                        if (lithoView != null) {
                                            lithoView.A0y(new 8UK(bitmap));
                                        }
                                    }
                                    hig.A03 = false;
                                    break;
                                } else {
                                    return;
                                }
                            case 1:
                                i = giD.A01;
                                C6tR c6tR = (C6tR) giD.A02;
                                atomicInteger = c6tR.A0K;
                                if (i >= atomicInteger.get()) {
                                    if (bitmap != null) {
                                        C6tR.A00(bitmap, c6tR);
                                    }
                                    c6tR.A05 = false;
                                    break;
                                } else {
                                    return;
                                }
                            default:
                                0DR r03 = (0DR) giD.A02;
                                if (bitmap != null) {
                                    float max = Math.max(bitmap.getWidth(), bitmap.getHeight()) / giD.A01;
                                    if (max < 1.0f) {
                                        max = 1.0f;
                                    }
                                    float ceil = (float) Math.ceil(max);
                                    if (ceil > 1.0f) {
                                        ceil = 1.0f;
                                    }
                                    0gF.A00(bitmap);
                                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.rint(bitmap.getWidth() / ceil), (int) Math.rint(bitmap.getHeight() / ceil), true);
                                    11T.A0A(bitmap2);
                                } else {
                                    bitmap2 = null;
                                }
                                r03.resumeWith(bitmap2);
                                return;
                        }
                        atomicInteger.set(i);
                        return;
                    }
                    GiC giC = (GiC) this;
                    switch (giC.A00) {
                        case 0:
                            Dpq dpq = (Dpq) giC.A01;
                            if (bitmap == null) {
                                Dpq.A03(dpq);
                                return;
                            }
                            int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
                            Matrix A0F = GOn.A0F();
                            int i2 = dpq.A09;
                            float f2 = i2;
                            float f3 = f2 / min2;
                            A0F.setScale(f3, f3);
                            2EU A002 = 2DX.A00(bitmap, A0F, (2DX) 1Br.A0B(dpq.A0B), (bitmap.getWidth() - min2) / 2, (bitmap.getHeight() - min2) / 2, min2, min2, true);
                            GSe gSe = new GSe(dpq.A0A.getResources(), 7zL.A0C(A002));
                            gSe.A01(f2 / 2.0f);
                            gSe.setBounds(0, 0, i2, i2);
                            dpq.A01 = gSe;
                            dpq.A02 = A002;
                            Dpq.A04(dpq, 2);
                            return;
                        case 1:
                            IWi iWi = (IWi) giC.A01;
                            if (bitmap == null) {
                                Integer num = IWi.A0b;
                                1Br.A04(iWi.A0P).D0v("MontageMultimediaController", "Null result trying to load gallery image");
                                return;
                            } else {
                                if (iWi.A05 == null || (r0 = iWi.A06) == null || r0.isClosed()) {
                                    return;
                                }
                                IWi.A00(bitmap, ImageView.ScaleType.FIT_CENTER, iWi, iWi.A09, iWi.A0B, iWi.A00);
                                return;
                            }
                        case 2:
                            if (bitmap != null) {
                                DNC dnc = (DNC) giC.A01;
                                GSa gSa = new GSa(bitmap);
                                CallerContext callerContext = DNC.A05;
                                dnc.A01 = gSa;
                                gSa.setCallback(dnc);
                                dnc.A01.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                dnc.invalidateSelf();
                                return;
                            }
                            return;
                        default:
                            7zL.A1T(giC.A01, bitmap);
                            return;
                    }
                }
                GiE giE = (GiE) this;
                if (bitmap == null) {
                    giE.A03.set((Object) null);
                    return;
                }
                String str = giE.A04;
                Uri A003 = I9n.A00(bitmap);
                if (A003 != null) {
                    C6q8 c6q8 = new C6q8();
                    c6q8.A0F = str;
                    c6q8.A04("930215145186465");
                    c6q8.A0B = GraphQLStickerType.CUSTOM;
                    c6q8.A08 = A003;
                    c6q8.A09 = A003;
                    c6q8.A03(7Qn.A00());
                    sticker = c6q8.A00();
                    I9n.A02(giE.A00, giE.A01, sticker);
                } else {
                    sticker = null;
                }
                settableFuture = giE.A03;
            }
            settableFuture.set(sticker);
            return;
        }
        GiF giF = (GiF) this;
        if (bitmap == null) {
            IWi iWi2 = giF.A03;
            Integer num2 = IWi.A0b;
            1Br.A04(iWi2.A0P).D0v("MontageMultimediaController", "Null result trying to load gallery image");
            return;
        }
        IWi iWi3 = giF.A03;
        if (iWi3.A05 == null) {
            return;
        }
        1OW r04 = iWi3.A06;
        if (r04 != null && r04.isClosed()) {
            return;
        }
        2EU r313 = null;
        try {
            C00i c00i = iWi3.A0N.A00;
            2EU A02 = ((BitmapUtil) c00i.get()).A02(bitmap);
            if (A02 != null) {
                try {
                    A07 = A02.A07();
                } catch (Throwable th) {
                    th = th;
                    r313 = A02;
                    2EU.A04(r313);
                    throw th;
                }
            } else {
                A07 = null;
            }
            11T.A0I(A07, "null cannot be cast to non-null type com.facebook.common.references.CloseableReference<android.graphics.Bitmap?>");
            try {
                IWi.A01(giF.A01, A07, iWi3, giF.A04, giF.A05, giF.A00);
                Hio hio = giF.A02;
                if (hio != null) {
                    float f4 = hio.A00;
                    if (f4 > 0.0f) {
                        CanvasEditorView canvasEditorView = iWi3.A0U;
                        CanvasEditorView.A00(canvasEditorView);
                        if (canvasEditorView.A02 != null) {
                            CanvasEditorView.A00(canvasEditorView);
                            MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = canvasEditorView.A02;
                            if (multimediaEditorPhotoImageViewer != null) {
                                multimediaEditorPhotoImageViewer.A02(f4);
                            }
                        }
                    }
                }
                HmB hmB = iWi3.A0W;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                IQ1 iq1 = hmB.A00;
                CallerContext callerContext2 = IQ1.A1m;
                Hm7 hm7 = iq1.A04;
                if (hm7 != null && C6r6.A0O.equals(hm7.A00.A1N.A0A)) {
                    CanvasEditorView canvasEditorView2 = iq1.A1F;
                    int width2 = canvasEditorView2.getWidth();
                    int height2 = canvasEditorView2.getHeight();
                    float f5 = height;
                    float f6 = height2 / f5;
                    float f7 = width;
                    float f8 = width2 / f7;
                    if (f6 < f8) {
                        width2 = (int) (f7 * f6);
                    } else {
                        height2 = (int) (f5 * f8);
                    }
                    CanvasEditorView.A00(canvasEditorView2);
                    if (canvasEditorView2.A02 != null) {
                        CanvasEditorView.A00(canvasEditorView2);
                        81T.A00(canvasEditorView2.A02.A0A.A01(), width2, height2);
                        GpB gpB = iq1.A1C.A0J.A05;
                        if (gpB != null) {
                            81T.A00(((IDq) gpB).A05, width2, height2);
                        }
                    }
                }
                2EU.A04(A07);
                1Br.A0C(iWi3.A0Q);
                C6r6 c6r6 = iWi3.A0V.A00.A1N.A0A;
                11T.A0F(c6r6, 0);
                if (c6r6 == C6r6.A0A || c6r6 == C6r6.A0O) {
                    hmB.A00((2EU) null);
                } else {
                    A07 = A02 != null ? A02.A07() : ((BitmapUtil) c00i.get()).A02(bitmap);
                    11T.A0I(A07, "null cannot be cast to non-null type com.facebook.common.references.CloseableReference<android.graphics.Bitmap?>");
                    hmB.A00(A07);
                    2EU.A04(A07);
                }
                int[] iArr = iWi3.A0J;
                if (iArr != null) {
                    iWi3.A0U.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr));
                } else {
                    2EU A072 = A02.A07();
                    try {
                        IWi.A03(A072, hio, iWi3);
                        2EU.A04(A072);
                    } catch (Throwable th2) {
                        th = th2;
                        2EU.A04(A072);
                        throw th;
                    }
                }
                2EU.A04(A02);
            } catch (Throwable th3) {
                th = th3;
                2EU.A04(A07);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
