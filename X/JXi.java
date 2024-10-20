package X;

import android.content.Context;
import android.view.View;

/* loaded from: JXi.class */
public final class JXi extends View {
    public boolean A00;
    public final JVP A01;
    public final Runnable A02;
    public final L0G A03;

    public JXi(Context context) {
        super(context, null, 0);
        JVP jvp = new JVP(context, C0ty.A00, 180.0f, 0.4f, 4000L);
        setBackground(jvp);
        this.A01 = jvp;
        this.A03 = new L0G(this, new M0s(this, 12));
        this.A02 = new Llf(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        11T.A0F(view, 0);
        super.onVisibilityChanged(view, i);
        L0G.A00(this.A03);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        int A06 = 0FI.A06(-873177677);
        super.onWindowVisibilityChanged(i);
        L0G l0g = this.A03;
        l0g.A00 = i;
        L0G.A00(l0g);
        0FI.A0C(368310845, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.JVP r0 = r0.A01
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L24
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L26
        L24:
            r0 = 1
            r304 = r0
        L26:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXi.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
