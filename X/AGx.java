package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;

/* loaded from: AGx.class */
public final class AGx implements Runnable {
    public static final String __redex_internal_original_name = "VitoViewImpl2$show$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ 5C4 A01;
    public final /* synthetic */ 5BR A02;
    public final /* synthetic */ InterfaceC06154g3 A03;
    public final /* synthetic */ Object A04;

    public AGx(View view, 5C4 r303, 5BR r304, InterfaceC06154g3 interfaceC06154g3, Object obj) {
        this.A01 = r303;
        this.A02 = r304;
        this.A04 = obj;
        this.A03 = interfaceC06154g3;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5Bw A01 = 5BS.A01();
        5C4 r0 = this.A01;
        5BR r02 = this.A02;
        Object obj = this.A04;
        InterfaceC06154g3 interfaceC06154g3 = this.A03;
        View view = this.A00;
        A01.ARx(new Rect(0, 0, view.getWidth(), view.getHeight()), (ContextChain) null, (5CK) null, (AWg) null, r0, r02, (5Bk) null, interfaceC06154g3, obj);
    }
}
