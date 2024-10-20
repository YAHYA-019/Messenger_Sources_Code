package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;

/* loaded from: H2q.class */
public final class H2q extends C6d6 {
    public double A00;
    public double A01;
    public boolean A02;
    public final ViewGroup A03;

    /* JADX WARN: Multi-variable type inference failed */
    public H2q(Context context) {
        super(context, null, 0);
        this.A00 = 1.7777777777777777d;
        this.A01 = -1.0d;
        A0h(GPl.A00(this, ActionId.RTMP_CONNECTION_REQUESTED), GPl.A00(this, ActionId.RTMP_CONNECTION_RELEASE), GPl.A00(this, 108));
        A0C(2132543554);
        this.A03 = (ViewGroup) C09s.A01(this, 2131368334);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r313 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.H2q r301) {
        /*
            r0 = r301
            android.view.ViewGroup r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L65
            r0 = r301
            android.view.ViewGroup r0 = r0.A03
            r303 = r0
            r0 = r301
            double r0 = r0.A00
            r304 = r0
            r0 = r301
            double r0 = r0.A01
            r306 = r0
            r0 = r303
            boolean r0 = X.7zP.A1X(r0)
            r308 = r0
            r0 = r302
            int r0 = r0.getWidth()
            r309 = r0
            r0 = r302
            int r0 = r0.getHeight()
            r310 = r0
            r0 = r302
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L52
            r0 = r311
            int r0 = r0.width
            r312 = r0
            r0 = r312
            if (r0 <= 0) goto L46
            r0 = r312
            r309 = r0
        L46:
            r0 = r311
            int r0 = r0.height
            r313 = r0
            r0 = r313
            if (r0 > 0) goto L56
        L52:
            r0 = r310
            r313 = r0
        L56:
            r0 = r303
            r1 = r304
            r2 = r306
            r3 = r313
            r4 = r309
            r5 = r308
            r6 = r308
            X.GPx.A00(r0, r1, r2, r3, r4, r5, r6)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2q.A00(X.H2q):void");
    }

    @Override // X.C6d6
    public String A0H() {
        return "EmptyVideoPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r317 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (java.lang.Math.abs(r0 - r301.A00) <= 0.001d) goto L6;
     */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            double r0 = r0.A00
            r305 = r0
            r0 = 0
            r307 = r0
            r0 = 1
            r309 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L47
            r0 = r301
            double r0 = r0.A00
            r311 = r0
            r0 = r305
            r1 = r311
            double r0 = r0 - r1
            r313 = r0
            r0 = r313
            double r0 = java.lang.Math.abs(r0)
            r311 = r0
            r0 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r315 = r0
            r0 = r311
            r1 = r315
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = 1
            r317 = r0
            r0 = r310
            if (r0 > 0) goto L4a
        L47:
            r0 = 0
            r317 = r0
        L4a:
            r0 = r303
            if (r0 == 0) goto L88
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r313 = r0
            r0 = r301
            r1 = r313
            r0.A01 = r1
        L59:
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L6b
            r0 = r301
            r1 = r305
            r0.A00 = r1
        L6b:
            r0 = r301
            A00(r0)
        L6f:
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L87
            r0 = r304
            com.facebook.spherical.video.model.SphericalVideoParams r0 = r0.A0U
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L87
            r0 = r301
            r1 = r309
            r0.A02 = r1
        L87:
            return
        L88:
            r0 = r317
            if (r0 == 0) goto L6f
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2q.A0e(X.6TI, boolean):void");
    }
}
