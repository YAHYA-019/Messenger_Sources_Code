package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: A8a.class */
public final class A8a implements AaP {
    public final C92u A00;

    public A8a(C92u c92u) {
        this.A00 = c92u;
    }

    public 1LI AJG(1LI r302, 1Iw r303) {
        C2cq A00;
        DN9 c92o;
        C2cp A2W;
        1BK.A1M(r303, r302);
        2cM A002 = 2cK.A00(r303);
        A002.A2b();
        6Jq r0 = (6Jq) 1Bi.A03(67639);
        5aU r02 = this.A00.A08;
        AbstractC3827MrG abstractC3827MrG = AbstractC3827MrG.$redex_init_class;
        int ordinal = r02.ordinal();
        if (ordinal == 7) {
            A00 = C2cp.A00(r303, 0);
            c92o = new C92o(r0, 0.0f);
        } else {
            if (ordinal != 9) {
                A2W = null;
                2dD A0p = 7zM.A0p(A2W, r303);
                A0p.A0c();
                A0p.A0b();
                A002.A2e(A0p.A2W());
                A002.A2e(r302);
                A002.A0s(96.0f);
                return A002.A00;
            }
            A00 = C2cp.A00(r303, 0);
            c92o = new C92p(r0, 0.0f);
        }
        A00.A2a(c92o);
        A2W = A00.A2W();
        2dD A0p2 = 7zM.A0p(A2W, r303);
        A0p2.A0c();
        A0p2.A0b();
        A002.A2e(A0p2.A2W());
        A002.A2e(r302);
        A002.A0s(96.0f);
        return A002.A00;
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        C2cp c2cp;
        1BK.A1M(r303, r302);
        A8n a8n = (A8n) 1Bn.A0A(67794);
        2cM A00 = 2cK.A00(r303);
        C92u c92u = this.A00;
        7zV.A0l(c92u.A05, A00);
        2cL r0 = A00.A00;
        2cM A002 = 2cK.A00(r303);
        2cM A003 = 2cK.A00(r303);
        A003.A2b();
        A003.A2h(C1rp.FLEX_END);
        7zO.A1C(A003, A002, r0);
        final 6Jq r02 = (6Jq) 1Bi.A03(67639);
        5aU r03 = c92u.A08;
        AbstractC3827MrG abstractC3827MrG = AbstractC3827MrG.$redex_init_class;
        int ordinal = r03.ordinal();
        if (ordinal == 8) {
            final Context context = r303.A0D;
            final float A004 = 7zR.A00(context);
            C2cq A005 = C2cp.A00(r303, 0);
            A005.A2a(new DN9(context, r02, A004) { // from class: X.92t
                public float A00;
                public int A01;
                public int A02;
                public 6ON A03;
                public 6ON A04;
                public 6ON A05;
                public 6ON A06;
                public 6ON A07;
                public 6ON A08;
                public 6ON A09;
                public 6ON A0A;
                public boolean A0B;
                public float A0C;
                public final int A0D;
                public final float A0E;

                {
                    11T.A0F(r02, 1);
                    this.A0E = A004;
                    this.A0B = true;
                    this.A0D = C0A8.A00(context, 125.0f);
                    r02.A02(AVF.A01(this, 5), new 6Ju[]{6Ju.A0I, 6Ju.A0G, 6Ju.A0H, 6Ju.A0F, 6Ju.A0D, 6Ju.A0E});
                }

                private final void A00(6ON r3022) {
                    if (r3022 != null) {
                        this.A0C = 150.0f;
                        r3022.setBounds(0, 0, 150, (int) ((150.0f * r3022.getIntrinsicHeight()) / r3022.getIntrinsicWidth()));
                        r3022.CXT();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public void draw(Canvas canvas) {
                    6ON r04;
                    6ON r05;
                    11T.A0F(canvas, 0);
                    if (this.A0B) {
                        6ON r305 = this.A08;
                        if (r305 != null && (r04 = this.A06) != null) {
                            6ON r307 = this.A07;
                            if (r307 != null && (r05 = this.A05) != null) {
                                if (7zO.A02(this) >= this.A0D) {
                                    r305 = r04;
                                    r307 = r05;
                                }
                                if (!r305.equals(this.A0A) || !r307.equals(this.A09)) {
                                    6ON r06 = this.A0A;
                                    if (r06 != null) {
                                        r06.stop();
                                    }
                                    6ON r07 = this.A09;
                                    if (r07 != null) {
                                        r07.stop();
                                    }
                                    this.A0A = r305;
                                    this.A09 = r307;
                                }
                                for (Drawable drawable : C0s8.A14(r305, r307)) {
                                    int A02 = 7zO.A02(this);
                                    this.A02 = A02;
                                    this.A01 = (A02 * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
                                    int A022 = 7zN.A02(this);
                                    int i = this.A02;
                                    this.A00 = A022 - (i / 2);
                                    drawable.setBounds(0, 0, i, this.A01);
                                }
                                r305.CXT();
                                r307.CXT();
                            }
                        }
                        A00(this.A03);
                        A00(this.A04);
                    }
                    this.A0B = false;
                    float f = this.A0C / 2.0f;
                    float f2 = 0.0f - f;
                    int save = canvas.save();
                    canvas.translate(f2, f2);
                    try {
                        6ON r08 = this.A03;
                        if (r08 != null) {
                            r08.draw(canvas);
                        }
                        canvas.restoreToCount(save);
                        float f3 = this.A0E;
                        float f4 = (-f3) * 0.88f;
                        float f5 = (f3 * 2.0f) / this.A01;
                        float f6 = 1.0f / f5;
                        int A01 = 7zT.A01(canvas, this, f5);
                        try {
                            float f7 = this.A00;
                            float f8 = f4 * f6;
                            int save2 = canvas.save();
                            canvas.translate(f7, f8);
                            try {
                                6ON r09 = this.A0A;
                                if (r09 != null) {
                                    r09.draw(canvas);
                                }
                                canvas.restoreToCount(save2);
                                canvas.restoreToCount(A01);
                                A01 = 7zT.A01(canvas, this, f5 * (-1.0f));
                                float f9 = this.A00;
                                float height = (f4 - getBounds().height()) * f6;
                                save2 = canvas.save();
                                canvas.translate(f9, height);
                                6ON r010 = this.A09;
                                if (r010 != null) {
                                    r010.draw(canvas);
                                }
                                canvas.restoreToCount(save2);
                                canvas.restoreToCount(A01);
                                save = canvas.save();
                                canvas.scale(-1.0f, -1.0f, 0.0f, 0.0f);
                                try {
                                    float A023 = (0.0f - 7zO.A02(this)) - f;
                                    float height2 = (0.0f - getBounds().height()) - f;
                                    save = canvas.save();
                                    canvas.translate(A023, height2);
                                    6ON r011 = this.A04;
                                    if (r011 != null) {
                                        r011.draw(canvas);
                                    }
                                    canvas.restoreToCount(save);
                                } catch (Throwable th) {
                                    throw th;
                                } finally {
                                }
                            } catch (Throwable th2) {
                                canvas.restoreToCount(save2);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            canvas.restoreToCount(A01);
                            throw th3;
                        }
                    } finally {
                    }
                }

                public int getOpacity() {
                    return -3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public void onBoundsChange(Rect rect) {
                    11T.A0F(rect, 0);
                    super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
                    this.A0B = true;
                }

                public void setAlpha(int i) {
                }

                public void setColorFilter(ColorFilter colorFilter) {
                }
            });
            c2cp = A005.A2W();
        } else {
            c2cp = null;
        }
        2dD A0p = 7zM.A0p(c2cp, r303);
        A0p.A0c();
        A0p.A0b();
        A002.A2e(A0p.A2W());
        8aA A0V = 7zL.A0V(A002, r302);
        8aA r307 = ordinal == 6 ? new 8aA(A0V, a8n, "AvatarHeart", C0ty.A00) : A0V;
        2cM A006 = 2cK.A00(r303);
        A006.A19(117.0f);
        A006.A2S(c92u.A0B);
        return new 8WU(7zL.A0V(A006, r307));
    }

    public boolean CXV(Context context) {
        return false;
    }

    public void Cln(View view) {
    }
}
