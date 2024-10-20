package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* loaded from: AKi.class */
public final class AKi extends C00q implements C00m {
    public final /* synthetic */ C9cn $contentWithInjections;
    public final /* synthetic */ boolean $hasEmptyContentListWithoutInjections;
    public final /* synthetic */ boolean $isAsync;
    public final /* synthetic */ C9yk $montageListItem;
    public final /* synthetic */ 8Gh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKi(8Gh r302, C9cn c9cn, C9yk c9yk, boolean z, boolean z2) {
        super(0);
        this.$contentWithInjections = c9cn;
        this.$montageListItem = c9yk;
        this.this$0 = r302;
        this.$hasEmptyContentListWithoutInjections = z;
        this.$isAsync = z2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C9cn c9cn = this.$contentWithInjections;
        C9yk c9yk = this.$montageListItem;
        8Gh r0 = this.this$0;
        FbUserSession fbUserSession = r0.A05;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            06Z A08 = 7zN.A08(r0);
            8Gh r02 = this.this$0;
            9bF r03 = r02.A0B;
            if (r03 == null) {
                str = "contentLoader";
            } else {
                C9ty c9ty = r02.A08;
                if (c9ty == null) {
                    str = "montageLoader";
                } else {
                    9Tf r04 = r02.A0C;
                    if (r04 == null) {
                        str = "stateCoordinator";
                    } else {
                        LifecycleOwner viewLifecycleOwner = r02.getViewLifecycleOwner();
                        8Gh r05 = this.this$0;
                        9Zd r06 = r05.A0J;
                        if (r06 == null) {
                            str = "viewpointAgent";
                        } else {
                            A32 a32 = r06.A00;
                            08D r07 = r05.A04;
                            9Yc r08 = r05.A0E;
                            if (r08 == null) {
                                str = "feedState";
                            } else {
                                boolean z = r08.A00;
                                LithoView lithoView = r05.A06;
                                str = "lithoView";
                                if (lithoView != null) {
                                    1LI r09 = new 8eZ(lithoView, r07, A08, viewLifecycleOwner, fbUserSession, r05.A0X, c9ty, c9cn, r03, r04, c9yk, a32, z, this.$hasEmptyContentListWithoutInjections);
                                    boolean z2 = this.$isAsync;
                                    LithoView lithoView2 = this.this$0.A06;
                                    if (z2) {
                                        if (lithoView2 != null) {
                                            lithoView2.A0y(r09);
                                            return 04S.A00;
                                        }
                                    } else if (lithoView2 != null) {
                                        lithoView2.A0x(r09);
                                        return 04S.A00;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
