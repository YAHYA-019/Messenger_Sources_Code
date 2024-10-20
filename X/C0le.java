package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.0le, reason: invalid class name */
/* loaded from: 0le.class */
public final class C0le extends C00q implements C00m {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ 0xD this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0le(ViewGroup viewGroup, 0xD r303) {
        super(0);
        this.this$0 = r303;
        this.$container = viewGroup;
    }

    public static final void A00(ViewGroup viewGroup, 0xD r302) {
        11T.A0H(r302, viewGroup);
        Iterator it = r302.A05.iterator();
        while (it.hasNext()) {
            C0Ao c0Ao = ((0D4) it.next()).A00;
            View view = c0Ao.A01().getView();
            if (view != null) {
                C0As.A01(view, viewGroup, c0Ao.A00);
            }
        }
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (06Z.A0N()) {
            android.util.Log.v("FragmentManager", "Animating to start");
        }
        0xD r0 = this.this$0;
        0UA r02 = r0.A02;
        Object obj = r0.A00;
        11T.A0D(obj);
        r02.A0K(new 0Tj(this.$container, this.this$0), obj);
        return 04S.A00;
    }
}
