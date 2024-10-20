package X;

import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;

/* loaded from: D8s.class */
public final class D8s implements Runnable {
    public static final String __redex_internal_original_name = "OmnipickerRealtimeMemberSearchFragment$updateContentListener$1$onSearchResultsReceived$1$1";
    public final /* synthetic */ C1565Alk A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ boolean A02;

    public D8s(C1565Alk c1565Alk, ImmutableList immutableList, boolean z) {
        this.A00 = c1565Alk;
        this.A01 = immutableList;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1565Alk c1565Alk = this.A00;
        LithoView lithoView = c1565Alk.A02;
        if (lithoView == null) {
            11T.A0L("contentView");
            throw 0Q8.createAndThrow();
        }
        ImmutableList immutableList = this.A01;
        boolean z = this.A02;
        c1565Alk.A0F = false;
        lithoView.A0x(C1565Alk.A03(AbF.A0U(lithoView), c1565Alk, immutableList, false, z));
        C1565Alk.A06(lithoView, c1565Alk);
    }
}
