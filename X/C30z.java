package X;

import android.view.View;

/* renamed from: X.30z, reason: invalid class name */
/* loaded from: 30z.class */
public final class C30z implements 2Pu {
    public final /* synthetic */ 6Ko A00;

    public C30z(6Ko r302) {
        this.A00 = r302;
    }

    public void Bku() {
        6Ko r0 = this.A00;
        r0.A03 = null;
        6Ko.A00(r0);
    }

    public void Bkv(View view, Class cls) {
        2PY r0;
        11T.A0F(cls, 1);
        6Ko r02 = this.A00;
        2PP r03 = r02.A01;
        11T.A0D(r03);
        synchronized (r03) {
            r0 = (2PY) r03.A07.A03();
        }
        11T.A0D(r0);
        2PP r04 = r02.A01;
        11T.A0D(r04);
        r02.A03 = new 3Kx(r0, r04.A02.AYt(cls));
        6Ko.A00(r02);
    }
}
