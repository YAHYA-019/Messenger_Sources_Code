package X;

import android.view.View;
import com.facebook.litho.LithoView;

/* renamed from: X.2mg, reason: invalid class name */
/* loaded from: 2mg.class */
public final class C2mg extends 2O4 {
    public 2Z6 A00;
    public int A01 = -1;
    public View A02;
    public 2XA A03;
    public final C2X3 A04;

    public C2mg(C2X3 c2x3) {
        this.A04 = c2x3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0248, code lost:
    
        if (r0.A04.A0d() == 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f4 A[EDGE_INSN: B:63:0x02f4->B:61:0x02f4 BREAK  A[LOOP:1: B:54:0x02a0->B:58:0x0310], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(androidx.recyclerview.widget.RecyclerView r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2mg.A07(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void A08() {
        2Z6 r0 = this.A00;
        if (r0 == null) {
            throw AnonymousClass001.A0N("SectionsRecyclerView has not been set yet.");
        }
        r0.A04.A1G(this);
        this.A03 = null;
        this.A00 = null;
    }

    public void A09(2Z6 r302) {
        if (this.A00 != null) {
            throw AnonymousClass001.A0T("SectionsRecyclerView has already been initialized but never reset.");
        }
        this.A00 = r302;
        LithoView lithoView = r302.A05;
        lithoView.A0i();
        lithoView.setVisibility(8);
        2XA r0 = r302.A04.A0F;
        this.A03 = r0;
        if (r0 == null) {
            throw AnonymousClass001.A0T("LayoutManager of RecyclerView is not initialized yet.");
        }
        this.A00.A04.A1F(this);
    }
}
