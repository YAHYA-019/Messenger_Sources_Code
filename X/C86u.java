package X;

import android.view.View;

/* renamed from: X.86u, reason: invalid class name */
/* loaded from: 86u.class */
public final class C86u {
    public final 74E A00;
    public final AYy A01;
    public final java.util.Map A02 = 1BK.A1C();
    public final /* synthetic */ C86t A03;

    public C86u(final C86t c86t, 74E r303) {
        this.A03 = c86t;
        this.A00 = r303;
        this.A01 = new AYy() { // from class: X.86v
            @Override // X.AYy
            public final boolean CLg(View view, String str, int i) {
                74E r0;
                C86u c86u = C86u.this;
                5vW r02 = (5vW) c86u.A02.get(str);
                if (r02 == null || (r0 = c86u.A00) == null) {
                    return false;
                }
                C86t c86t2 = c86t;
                C06974ih c06974ih = C86t.A0Y;
                ((6Vf) 1Br.A0B(c86t2.A0D)).A02.A04(str, Integer.valueOf(i));
                r0.BoE(4YU.A08(view), view, r02);
                return true;
            }
        };
    }
}
