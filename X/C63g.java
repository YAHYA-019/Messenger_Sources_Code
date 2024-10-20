package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.63g, reason: invalid class name */
/* loaded from: 63g.class */
public abstract class C63g extends C63h {
    private C1rh A06(Uri uri, 1Iw r303, 5zD r304, float f, float f2) {
        5BH A01;
        CallerContext callerContext;
        if (this instanceof C63f) {
            float f3 = f2 == 0.0f ? 1.0f : f / f2;
            C5be c5be = null;
            if (r304 != null) {
                int AYv = r304.Ad2().A0F.AYv();
                float dimension = 4YU.A0E(r303).getDimension(2132279311);
                C5be c5be2 = new C5be(GradientDrawable.Orientation.TOP_BOTTOM, null);
                c5be2.setColor(AYv);
                c5be2.setCornerRadius(dimension);
                c5be = c5be2;
            }
            A01 = 5BG.A01(r303);
            C07004ik A00 = C06984ii.A00();
            A00.A06(c5be);
            A00.A0E = InterfaceC07034in.A08;
            A00.A00(InterfaceC07034in.A01);
            A00.A0J = true;
            C06984ii.A01(A01, A00);
            A01.A0f(f3);
            A01.A2W(f3);
            A01.A1J(2131957338);
            A01.A0l(120.0f);
            A01.A0T();
            A01.A2X(uri);
            callerContext = C63f.A00;
        } else {
            C63k c63k = (C63k) this;
            float f4 = f2 == 0.0f ? 1.0f : f / f2;
            Context context = r303.A0D;
            Drawable drawable = context.getApplicationContext().getDrawable(2132213982);
            A01 = 5BG.A01(r303);
            C07004ik A002 = C06984ii.A00();
            A002.A06(drawable);
            A002.A00(InterfaceC07034in.A01);
            A002.A0J = true;
            A002.A0C = r304 == null ? null : 7Yf.A00(context, (C62j) 1Br.A0B(c63k.A00), r304.B4l());
            C06984ii.A01(A01, A002);
            A01.A0f(f4);
            A01.A2W(f4);
            A01.A1J(2131957795);
            A01.A1P(2132279319);
            A01.A1V(2132279339);
            A01.A0T();
            A01.A2X(uri);
            callerContext = C63k.A01;
        }
        A01.A2b(callerContext);
        C1rq A003 = C1rg.A00(r303);
        A003.A2e(A01);
        return A003.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x017f, code lost:
    
        if (r308 != null) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.0w6, java.lang.Object] */
    @Override // X.C63h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A05(X.1Iw r302, X.5zD r303, X.6Az r304, X.AnonymousClass622 r305, X.7Wh r306) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63g.A05(X.1Iw, X.5zD, X.6Az, X.622, X.7Wh):X.1LI");
    }
}
