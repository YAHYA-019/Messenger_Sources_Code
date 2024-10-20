package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.910, reason: invalid class name */
/* loaded from: 910.class */
public final class AnonymousClass910 extends 25G implements C1rk {
    public Rect A00;
    public 5BR A01;
    public final ContextChain A02;
    public final 5CK A03;
    public final InterfaceC06154g3 A04;
    public final C06974ih A05;
    public final 5BO A06;
    public final Object A07;
    public final boolean A08;
    public final boolean A09;
    public final long A0A;
    public final C1rk A0B;
    public static final A2I A0E = new A2I();
    public static final A2G A0C = new A2G();
    public static final A2H A0D = new A2H();

    public AnonymousClass910(ContextChain contextChain, 5CK r303, InterfaceC06154g3 interfaceC06154g3, C06974ih c06974ih, 5BO r306, Object obj, long j, boolean z, boolean z2) {
        super(0S2.A01);
        this.A0A = j;
        this.A06 = r306;
        this.A04 = interfaceC06154g3;
        this.A03 = r303;
        this.A05 = c06974ih;
        this.A08 = z;
        this.A07 = obj;
        this.A02 = contextChain;
        this.A09 = z2;
        A0E(new 29L(A0D, this));
        A0E(new 29L(A0E, this));
        A0D(new 29L(A0C, this));
        this.A0B = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (X.11T.A0O(r301.A03, r302.A03) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A03(X.AnonymousClass910 r301, X.AnonymousClass910 r302) {
        /*
            r0 = r301
            X.5BO r0 = r0.A06
            r303 = r0
            r0 = r302
            X.5BO r0 = r0.A06
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L70
            r0 = r301
            X.4ih r0 = r0.A05
            r303 = r0
            r0 = r302
            X.4ih r0 = r0.A05
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L70
            r0 = r301
            boolean r0 = r0.A08
            r306 = r0
            r0 = r302
            boolean r0 = r0.A08
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L70
            r0 = r301
            X.4g3 r0 = r0.A04
            r303 = r0
            r0 = r302
            X.4g3 r0 = r0.A04
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L70
            r0 = r301
            X.5CK r0 = r0.A03
            r303 = r0
            r0 = r302
            X.5CK r0 = r0.A03
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L73
        L70:
            r0 = 1
            r305 = r0
        L73:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass910.A03(X.910, X.910):boolean");
    }

    public long A0I() {
        return this.A0A;
    }

    public C1rk A0J() {
        return this.A0B;
    }

    @Override // X.C1rk
    public /* synthetic */ boolean ADe() {
        return false;
    }

    @Override // X.C1rk
    public /* bridge */ /* synthetic */ Object AJK(Context context) {
        11T.A0F(context, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(5BS.A01().AJb());
        return imageView;
    }

    @Override // X.C1rk
    public /* synthetic */ Object B3t() {
        return getClass();
    }

    @Override // X.C1rk
    public /* synthetic */ 1Ii B3u() {
        return C29N.A00;
    }

    @Override // X.C1rk
    public /* synthetic */ C3m7 Brt(int i) {
        return C2m5.A00(this, i);
    }

    @Override // X.C1rk
    public /* synthetic */ int CXj() {
        return 3;
    }
}
