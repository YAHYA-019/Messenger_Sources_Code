package com.facebook.stickers.ui;

import X.0FI;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Hv;
import X.1Kd;
import X.1hM;
import X.2Dp;
import X.2IA;
import X.2eS;
import X.4YT;
import X.4gJ;
import X.4gO;
import X.5BL;
import X.5BO;
import X.5Bb;
import X.5Bm;
import X.5Yf;
import X.69H;
import X.69W;
import X.6fM;
import X.7Qb;
import X.7Qc;
import X.7Qe;
import X.7Qf;
import X.81D;
import X.81T;
import X.82O;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbstractC2326GOr;
import X.C00i;
import X.C06394go;
import X.C06974ih;
import X.C06984ii;
import X.C07004ik;
import X.C1iM;
import X.C2067Das;
import X.C69o;
import X.C69s;
import X.C6pf;
import X.C6qc;
import X.GOo;
import X.GRm;
import X.Im3;
import X.Inh;
import X.InterfaceC07034in;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import java.util.concurrent.Executor;

/* loaded from: StickerDraweeView.class */
public class StickerDraweeView extends ImageView {
    public 2eS A00;
    public C00i A01;
    public C00i A02;
    public 5Yf A03;
    public C6pf A04;
    public 7Qf A05;
    public 6fM A06;
    public 7Qb A07;
    public 7Qe A08;
    public Executor A09;
    public C07004ik A0A;
    public C00i A0B;
    public 7Qc A0C;

    public StickerDraweeView(Context context) {
        super(context);
        A00(context);
    }

    public StickerDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    private void A00(Context context) {
        this.A05 = (7Qf) 1Bi.A03(50202);
        InterfaceC07034in interfaceC07034in = 6fM.A0I;
        this.A06 = new 6fM(context, new GRm(this));
        this.A02 = 1BQ.A00();
        this.A01 = AbH.A0K();
        this.A0C = (7Qc) 1Bn.A0A(68026);
        Context context2 = getContext();
        this.A03 = (5Yf) 1Hv.A02(context2, 84088);
        this.A0B = 1BV.A00(355);
        this.A08 = (7Qe) 1Bn.A0A(115005);
        this.A09 = AbJ.A1D();
        this.A04 = (C6pf) 1Bi.A03(50150);
        this.A07 = (7Qb) 1Bn.A0E(context2, (1BY) null, 50201);
        if (AbstractC2326GOr.A1Y(this)) {
            this.A0A = C06984ii.A00();
        } else {
            setImageDrawable(this.A06);
        }
    }

    public static void A01(FbUserSession fbUserSession, C6qc c6qc, StickerDraweeView stickerDraweeView, 2Dp[] r304) {
        String str;
        2Dp r308;
        if (r304 == null || (str = c6qc.A06) == null) {
            return;
        }
        Sticker A02 = ((69H) GOo.A0o(stickerDraweeView, fbUserSession, 49969)).A02(str);
        if (A02 != null) {
            r308 = 7Qb.A00(A02, stickerDraweeView.A07);
            if (r308 != null) {
                2IA A022 = 2IA.A02(r304[0]);
                Uri uri = r308.A05;
                uri.getClass();
                A022.A02 = uri;
                r308 = A022.A04();
            }
        } else {
            r308 = null;
        }
        5BO A00 = 5BL.A00(r304);
        if (r308 != null) {
            A00 = 5Bm.A03(5BL.A01(r308), A00);
        }
        C07004ik c07004ik = stickerDraweeView.A0A;
        C06974ih c06974ih = c07004ik != null ? new C06974ih(c07004ik) : C06974ih.A0Q;
        if (c6qc.A0A) {
            C07004ik c07004ik2 = new C07004ik(c06974ih);
            c07004ik2.A0G = new C06394go(((82O) stickerDraweeView.A0B.get()).A0V(c6qc.A00));
            new C06974ih(c07004ik2);
        }
        CallerContext callerContext = c6qc.A02;
        4gJ r0 = c6qc.A03;
        C1iM.A01(stickerDraweeView, r0 != null ? new 4gO(r0) : null, c06974ih, A00, callerContext);
    }

    private void A02(CallerContext callerContext, String str, int i, boolean z) {
        Bitmap bitmap;
        int A01 = 7Qf.A01(str);
        Context context = getContext();
        81D drawable = context.getDrawable(A01);
        if (drawable != null) {
            if (z && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                drawable = new 81D(context.getResources(), bitmap);
            }
            ((Drawable) drawable).setAlpha(i);
        }
        C07004ik c07004ik = this.A0A;
        if (c07004ik == null) {
            c07004ik = C06984ii.A00();
        }
        this.A0A = c07004ik;
        c07004ik.A07((Drawable) drawable, InterfaceC07034in.A04);
        if (7Qc.A00(this.A0C).AZk(2342166050147223724L)) {
            C1iM.A01(this, null, new C06974ih(this.A0A), 5Bb.A00, callerContext);
        }
    }

    public void A03(Drawable drawable) {
        6fM r0 = this.A06;
        AbI.A1N(r0.A02);
        r0.A07 = null;
        69W r02 = r0.A0C;
        C69s c69s = r0.A01;
        c69s.A07(null);
        ((C69o) c69s).A04 = null;
        ((C69o) c69s).A03 = null;
        ((C69o) c69s).A02 = CallerContext.A08;
        r02.A06(c69s.A08());
        r0.A0B.A08(drawable, 6fM.A0I);
    }

    public void A04(FbUserSession fbUserSession, C6qc c6qc) {
        1hM A01;
        CallerContext callerContext;
        String str = c6qc.A05;
        if (str != null) {
            setContentDescription(str);
        }
        if (c6qc.A0D) {
            String str2 = c6qc.A06;
            String str3 = c6qc.A08;
            GraphQLStickerType graphQLStickerType = str3 != null ? (GraphQLStickerType) EnumHelper.A00(GraphQLStickerType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, str3) : null;
            if (getVisibility() == 0) {
                this.A05.getClass();
                int A00 = 7Qf.A00(graphQLStickerType, str2);
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(A00);
                if (A00 == 2132279339) {
                    dimensionPixelSize = (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics());
                }
                81T.A00(this, dimensionPixelSize, dimensionPixelSize);
            }
        }
        if (!AbstractC2326GOr.A1Y(this)) {
            this.A06.A04(fbUserSession, c6qc);
            return;
        }
        boolean AZk = 1BK.A0N(this.A02).AZk(36324449682738860L);
        AbI.A1N(this.A01);
        if (AZk) {
            String str4 = c6qc.A06;
            if (str4 != null) {
                try {
                    long parseLong = Long.parseLong(str4);
                    CallerContext callerContext2 = c6qc.A02;
                    if (callerContext2 != null) {
                        A02(callerContext2, str4, c6qc.A00, c6qc.A0A);
                    }
                    this.A08.A00(fbUserSession, new Im3(fbUserSession, c6qc, this), parseLong);
                    return;
                } catch (NumberFormatException e) {
                    0fH.A0z("StickerDrawable", 4YT.A00(560), e, new Object[]{str4});
                    return;
                }
            }
            return;
        }
        String str5 = c6qc.A06;
        if (str5 != null && (callerContext = c6qc.A02) != null) {
            A02(callerContext, str5, c6qc.A00, c6qc.A0A);
        }
        2eS r0 = this.A00;
        if (r0 != null) {
            r0.A00(false);
        }
        if (str5 == null) {
            A01 = 1Kd.A06();
        } else {
            Sticker A02 = ((69H) GOo.A0o(this, fbUserSession, 49969)).A02(str5);
            A01 = (A02 == null || this.A03.A01(A02)) ? this.A04.A01(str5) : new 1hM(A02);
        }
        C2067Das c2067Das = new C2067Das(new Inh(14, fbUserSession, c6qc, this), 0);
        1Kd.A0F(c2067Das, A01, this.A09);
        this.A00 = new 2eS(c2067Das, A01);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1212352921);
        super.onAttachedToWindow();
        if (!AbstractC2326GOr.A1Y(this)) {
            this.A06.A0C.A03();
        }
        0FI.A0C(272620942, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2039931375);
        super.onDetachedFromWindow();
        if (!AbstractC2326GOr.A1Y(this)) {
            this.A06.A0C.A04();
        }
        0FI.A0C(64681067, A06);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (AbstractC2326GOr.A1Y(this)) {
            return;
        }
        this.A06.A0C.A03();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (AbstractC2326GOr.A1Y(this)) {
            return;
        }
        this.A06.A0C.A04();
    }
}
