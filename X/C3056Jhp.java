package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.List;

/* renamed from: X.Jhp, reason: case insensitive filesystem */
/* loaded from: Jhp.class */
public final class C3056Jhp extends 2Xd {
    public final Context A00;
    public final Jtx A01;

    public C3056Jhp(Context context, Jtx jtx) {
        this.A00 = context;
        this.A01 = jtx;
    }

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        ComponentTree componentTree;
        LithoView lithoView = (LithoView) c2lb.A0I;
        ViewGroup.LayoutParams layoutParams = lithoView.getLayoutParams();
        Jtx jtx = this.A01;
        int i2 = -2;
        int i3 = -1;
        if (View.MeasureSpec.getMode(jtx.AcT(i)) == 0) {
            i3 = -2;
        }
        if (View.MeasureSpec.getMode(jtx.A04(i)) != 0) {
            i2 = -1;
        }
        if (layoutParams != null) {
            layoutParams.width = i3;
            layoutParams.height = i2;
        } else {
            lithoView.setLayoutParams(new C2lg(i3, i2));
        }
        synchronized (jtx) {
            componentTree = (ComponentTree) C0Ak.A00(((LWO) jtx).A06.A00, i);
        }
        lithoView.A0z(componentTree);
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        List list = C2lb.A0J;
        return new C2lb(new LithoView(this.A00));
    }

    public int getItemCount() {
        return this.A01.A03();
    }
}
