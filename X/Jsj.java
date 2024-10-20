package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;

/* loaded from: Jsj.class */
public final class Jsj extends 6OU {
    public float A00;
    public Paint A01;
    public Path A02;
    public Path A03;
    public PathMeasure A04;
    public boolean A05;
    public boolean A06;
    public Path A07;
    public Path A08;

    public void A08() {
        super.A08();
        Path path = this.A07;
        if (path != null) {
            path.rewind();
        }
        Path path2 = this.A08;
        if (path2 != null) {
            path2.rewind();
        }
    }

    /* JADX WARN: Type inference failed for: r320v14, types: [java.lang.Object, X.5Im] */
    public void A0A(float f) {
        5IW r0 = ((6OU) this).A04;
        5Ii r02 = r0.A0f;
        5IZ r03 = r0.A0a;
        6OQ r04 = ((6OU) this).A0B;
        6OR r05 = r04.A03;
        5Ii A00 = r05.A00();
        Path path = this.A07;
        5IQ r06 = r04.A0E;
        float f2 = r06.A00;
        float f3 = r04.A00;
        Path A03 = 6Oc.A03(path, r03, r02, A00, f, f2, f3, f3);
        this.A07 = A03;
        if (A03 != null) {
            Path path2 = this.A08;
            if (!this.A06 || path2 == null || path2.isEmpty()) {
                float f4 = r0.A0H;
                5If r07 = r0.A0o;
                float f5 = r06.A00;
                float A002 = 6Oa.A00(r07, f4, f, f5) / 100.0f;
                float A003 = 6Oa.A00(r0.A0m, r0.A0F, f, f5) / 100.0f;
                float A004 = 6Oa.A00(r0.A0n, r0.A0G, f, f5) / 360.0f;
                PathMeasure pathMeasure = this.A04;
                if (pathMeasure == null) {
                    this.A04 = new PathMeasure(A03, false);
                } else {
                    pathMeasure.setPath(A03, false);
                }
                float length = this.A04.getLength();
                if (length < 1.0f) {
                    path2 = null;
                } else {
                    if (path2 == null) {
                        path2 = DKC.A0B();
                    } else if (!path2.isEmpty()) {
                        path2.reset();
                    }
                    if (DKC.A01(A003, A002) >= 0.0015d) {
                        if ((A002 == 0.0f && A003 == 1.0f) || (A002 == 1.0f && A003 == 0.0f)) {
                            path2.set(A03);
                        } else {
                            float f6 = A002 * length;
                            float f7 = A003 * length;
                            if (f6 > f7) {
                                f7 = f6;
                                f6 = f7;
                            }
                            float f8 = A004 * length;
                            float f9 = f6 + f8;
                            float f10 = f7 + f8;
                            if (f9 < 0.0f) {
                                f9 = (f9 % length) + length;
                            }
                            if (f10 < 0.0f) {
                                f10 = (f10 % length) + length;
                            }
                            if (f9 > length || f10 > length) {
                                f9 %= length;
                                f10 %= length;
                            }
                            if (f9 > f10) {
                                Path path3 = this.A02;
                                if (path3 == null) {
                                    path3 = DKC.A0B();
                                } else if (!path3.isEmpty()) {
                                    path3.reset();
                                }
                                this.A02 = path3;
                                Path path4 = this.A03;
                                if (path4 == null) {
                                    path4 = DKC.A0B();
                                } else if (!path4.isEmpty()) {
                                    path4.reset();
                                }
                                this.A03 = path4;
                                this.A04.getSegment(0.0f, f10, this.A02, true);
                                this.A04.getSegment(f9, length, this.A03, true);
                                path2.addPath(this.A02);
                                path2.addPath(this.A03);
                            } else {
                                this.A04.getSegment(f9, f10, path2, true);
                            }
                        }
                    }
                }
            }
            this.A08 = path2;
            if (path2 != null) {
                if (r0.A0T == null && r0.A0d == null && r0.A09 == 0.0f && r0.A0l == null) {
                    return;
                }
                this.A05 = false;
                float A005 = 6Oa.A00(r0.A0l, r0.A09, f, r06.A00) * r04.A00;
                this.A00 = A005;
                if (A005 == 0.0f) {
                    this.A05 = true;
                    return;
                }
                if (this.A01 == null) {
                    Paint A0A = DKC.A0A(1);
                    this.A01 = A0A;
                    DKC.A1L(A0A);
                    this.A01.setStrokeCap(Paint.Cap.values()[r0.A00]);
                    this.A01.setStrokeJoin(Paint.Join.values()[r0.A01]);
                }
                this.A01.setStrokeWidth(this.A00);
                5Im r08 = r0.A0T;
                5IZ r09 = r0.A0d;
                float f11 = r06.A00;
                5Id r320 = r05.A04;
                5Id r3202 = r320;
                if (r320 == null) {
                    ?? obj = new Object();
                    r05.A04 = obj;
                    r3202 = obj;
                }
                5Im A006 = 6Ob.A00(r08, r3202, r09, f, f11);
                if (A006 != null) {
                    this.A01.setARGB((A006.A00 * ((6OU) this).A01) / 255, A006.A03, A006.A02, A006.A01);
                }
                float A007 = 6Oa.A00(r0.A0i, r0.A05, f, r06.A00) * r04.A00;
                if (A007 >= 0.0f) {
                    this.A01.setStrokeMiter(A007);
                }
            }
        }
    }

    public void A0B(Canvas canvas) {
        Paint paint;
        Path path = this.A08;
        if (path == null || (paint = this.A01) == null || this.A05) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void A0F(RectF rectF) {
        Path path = this.A08;
        if (path != null) {
            path.computeBounds(rectF, false);
            float f = rectF.left;
            float f2 = this.A00 / 2.0f;
            rectF.set((f - f2) - 1.0f, (rectF.top - f2) - 1.0f, rectF.right + f2 + 1.0f, rectF.bottom + f2 + 1.0f);
        }
    }
}
