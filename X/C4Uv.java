package X;

import android.content.Context;

/* renamed from: X.4Uv, reason: invalid class name */
/* loaded from: 4Uv.class */
public final class C4Uv {
    public static final Object A04 = new Object();
    public static volatile C4Uv A05;
    public final 4IX A00;
    public final MEe A01;
    public final C4YH A02;
    public final C4Ii A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.4YH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.MEe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.4Ii] */
    public C4Uv(Context context) {
        4IU r304;
        4IX r305;
        C4Ih c4Ih;
        synchronized (4IU.A0D) {
            r304 = 4IU.A0C;
            r304 = r304 == null ? 4IU.A0B : r304;
        }
        if (r304 != null) {
            this.A00 = r304.A02;
            c4Ih = r304.A06;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof 0V7) {
                r305 = 4IV.A00();
            } else {
                4IW r0 = new 4IW();
                String packageName = applicationContext.getPackageName();
                11T.A0F(packageName, 0);
                r0.A05 = packageName;
                r305 = new 4IX(r0);
            }
            this.A00 = r305;
            c4Ih = new C4Ih(r305.A08);
        }
        this.A03 = c4Ih;
        this.A02 = new Object();
        this.A01 = new Object();
    }
}
