package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.2cl, reason: invalid class name */
/* loaded from: 2cl.class */
public final class C2cl extends C1rj {
    public int A00;
    public Drawable A01;
    public ImageView.ScaleType A02;
    public String A03;

    public C2cl() {
        super("Icon");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1rs, X.2cm] */
    public static C2cm A00(1Iw r301) {
        C2cl c2cl = new C2cl();
        ?? c1rs = new C1rs(c2cl, r301, 0, 0);
        c1rs.A00 = c2cl;
        c1rs.A01 = r301;
        return c1rs;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        Drawable drawable = this.A01;
        ImageView.ScaleType scaleType = this.A02;
        11T.A0F(r302, 0);
        C2cq A00 = C2cp.A00(r302, 0);
        C1uv c1uv = C1uu.A03;
        Resources resources = r302.A0D.getResources();
        11T.A0A(resources);
        A00.A2a(c1uv.A03(resources, drawable, i));
        A00.A2b(scaleType);
        return A00.A2W();
    }
}
