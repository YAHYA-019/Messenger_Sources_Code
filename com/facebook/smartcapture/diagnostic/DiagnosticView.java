package com.facebook.smartcapture.diagnostic;

import X.0KF;
import X.11T;
import X.DKC;
import X.DKD;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DiagnosticView.class */
public final class DiagnosticView extends View {
    public static final Companion Companion = new Object();
    public static final int TEXT_HORIZONTAL_PADDING = 5;
    public final float density;
    public DiagnosticInfo diagnosticInfo;
    public float scale;
    public float verticalOffset;

    /* loaded from: DiagnosticView$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final int colorFloatToInt(float f) {
            return 0KF.A01(f * 255.0f);
        }

        private final int convertToUnsigned(int i) {
            if (i < 0) {
                i += 256;
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v32, types: [int] */
        /* JADX WARN: Type inference failed for: r0v34, types: [int] */
        /* JADX WARN: Type inference failed for: r0v36, types: [int] */
        public final int[] createPixelColorArray(byte[] bArr) {
            int length = bArr.length / 4;
            int[] iArr = new int[length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return iArr;
                }
                int i3 = i2 * 4;
                byte b = bArr[i3];
                if (b < 0) {
                    b += 256;
                }
                byte b2 = bArr[i3 + 1];
                if (b2 < 0) {
                    b2 += 256;
                }
                byte b3 = bArr[i3 + 2];
                if (b3 < 0) {
                    b3 += 256;
                }
                iArr[i2] = android.graphics.Color.argb(255, (int) b, (int) b2, (int) b3);
                i = i2 + 1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Rect getTextBackgroundSize(float f, float f2, String str, TextPaint textPaint) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            return new Rect((int) (f - 5.0f), (int) (fontMetrics.top + f2), (int) (f + textPaint.measureText(str) + 5.0f), (int) (f2 + fontMetrics.bottom));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setPaintColor(Paint paint, Color color) {
            paint.setARGB(0KF.A01(color.alpha * 255.0f), 0KF.A01(color.red * 255.0f), 0KF.A01(color.green * 255.0f), 0KF.A01(color.blue * 255.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.density = DKD.A09(this).density;
    }

    private final Path createPath(Point[] pointArr) {
        Path A0B = DKC.A0B();
        int length = pointArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A0B.close();
                return A0B;
            }
            float f = pointArr[i2].x;
            float f2 = this.scale;
            float f3 = f * f2;
            float f4 = (r0.y * f2) + this.verticalOffset;
            if (i2 == 0) {
                A0B.moveTo(f3, f4);
            } else {
                A0B.lineTo(f3, f4);
            }
            i = i2 + 1;
        }
    }

    private final void drawImages(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        ImageAnnotation[] imageAnnotationArr = diagnosticInfo.imageAnnotations;
        int length = imageAnnotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            ImageAnnotation imageAnnotation = imageAnnotationArr[i2];
            if (imageAnnotation.width != 0 && imageAnnotation.height != 0) {
                int[] createPixelColorArray = Companion.createPixelColorArray(imageAnnotation.image);
                int i3 = imageAnnotation.width;
                Bitmap createBitmap = Bitmap.createBitmap(createPixelColorArray, 0, i3, i3, imageAnnotation.height, Bitmap.Config.ARGB_8888);
                11T.A0A(createBitmap);
                float f = imageAnnotation.displayOrigin.x;
                float f2 = this.scale;
                int i4 = (int) (f * f2);
                int i5 = (int) ((r0.y * f2) + this.verticalOffset);
                canvas.drawBitmap(createBitmap, (Rect) null, new Rect(i4, i5, (int) (i4 + (imageAnnotation.displayWidth * f2)), (int) (i5 + (imageAnnotation.displayHeight * f2))), (Paint) null);
                createBitmap.recycle();
            }
            i = i2 + 1;
        }
    }

    private final void drawPoints(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A09 = DKC.A09();
        PointAnnotation[] pointAnnotationArr = diagnosticInfo.pointAnnotations;
        int length = pointAnnotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            PointAnnotation pointAnnotation = pointAnnotationArr[i2];
            Companion.setPaintColor(A09, pointAnnotation.color);
            float f = pointAnnotation.point.x;
            float f2 = this.scale;
            canvas.drawCircle(f * f2, (r0.y * f2) + this.verticalOffset, pointAnnotation.radius * this.density * f2, A09);
            i = i2 + 1;
        }
    }

    private final void drawPolygons(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A09 = DKC.A09();
        PolygonAnnotation[] polygonAnnotationArr = diagnosticInfo.polygonAnnotations;
        int length = polygonAnnotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            PolygonAnnotation polygonAnnotation = polygonAnnotationArr[i2];
            Path createPath = createPath(polygonAnnotation.points);
            DKC.A1M(A09);
            Companion companion = Companion;
            companion.setPaintColor(A09, polygonAnnotation.fillColor);
            canvas.drawPath(createPath, A09);
            DKC.A1L(A09);
            companion.setPaintColor(A09, polygonAnnotation.borderColor);
            A09.setStrokeWidth(polygonAnnotation.borderWidth * this.density);
            canvas.drawPath(createPath, A09);
            i = i2 + 1;
        }
    }

    private final void drawSegments(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A09 = DKC.A09();
        SegmentAnnotation[] segmentAnnotationArr = diagnosticInfo.segmentAnnotations;
        int length = segmentAnnotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            SegmentAnnotation segmentAnnotation = segmentAnnotationArr[i2];
            Companion.setPaintColor(A09, segmentAnnotation.color);
            A09.setStrokeWidth(segmentAnnotation.lineWidth * this.density * this.scale);
            float f = segmentAnnotation.firstPoint.x;
            float f2 = this.scale;
            float f3 = f * f2;
            float f4 = r0.y * f2;
            float f5 = this.verticalOffset;
            float f6 = f4 + f5;
            Point point = segmentAnnotation.secondPoint;
            canvas.drawLine(f3, f6, point.x * f2, f5 + (point.y * f2), A09);
            i = i2 + 1;
        }
    }

    private final void drawTexts(Canvas canvas, DiagnosticInfo diagnosticInfo) {
        Paint A09 = DKC.A09();
        TextPaint textPaint = new TextPaint();
        TextAnnotation[] textAnnotationArr = diagnosticInfo.textAnnotations;
        int length = textAnnotationArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            TextAnnotation textAnnotation = textAnnotationArr[i2];
            textPaint.setTextSize(((textAnnotation.fontSize * this.density) * 2.0f) / 3.0f);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = textAnnotation.topLeftPosition.x;
            float f2 = this.scale;
            float f3 = f * f2;
            float f4 = (r0.y - (fontMetrics.top * f2)) + this.verticalOffset;
            Companion companion = Companion;
            companion.setPaintColor(A09, textAnnotation.backgroundColor);
            canvas.drawRect(companion.getTextBackgroundSize(f3, f4, textAnnotation.text, textPaint), A09);
            companion.setPaintColor(textPaint, textAnnotation.textColor);
            canvas.drawText(textAnnotation.text, f3, f4, textPaint);
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        DiagnosticInfo diagnosticInfo = this.diagnosticInfo;
        if (diagnosticInfo != null) {
            this.scale = DKC.A02(this) / diagnosticInfo.previewWidth;
            this.verticalOffset = (DKC.A03(this) - ((DKC.A02(this) * diagnosticInfo.previewHeight) / diagnosticInfo.previewWidth)) / 2.0f;
            drawImages(canvas, diagnosticInfo);
            drawPolygons(canvas, diagnosticInfo);
            drawPoints(canvas, diagnosticInfo);
            drawSegments(canvas, diagnosticInfo);
            drawTexts(canvas, diagnosticInfo);
        }
    }

    public final void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
        11T.A0F(diagnosticInfo, 0);
        this.diagnosticInfo = diagnosticInfo;
        postInvalidate();
    }
}
