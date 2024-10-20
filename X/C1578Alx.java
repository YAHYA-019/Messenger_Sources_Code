package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.pagesurface.about.params.PageAboutInputParams;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Alx, reason: case insensitive filesystem */
/* loaded from: Alx.class */
public final class C1578Alx extends 1pK implements AaW, DF3 {
    public static final String __redex_internal_original_name = "PageAboutFragment";
    public ProgressBar A00;
    public FbUserSession A01;
    public C0dr A02;
    public 1Iw A03;
    public ComponentTree A04;
    public LithoView A05;
    public 6Je A06;
    public CCE A07;
    public PageAboutInputParams A08;
    public Long A09;
    public ExecutorService A0A;

    public static final void A03(C1578Alx c1578Alx) {
        String str;
        ProgressBar progressBar = c1578Alx.A00;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setVisibility(0);
            LithoView lithoView = c1578Alx.A05;
            if (lithoView != null) {
                lithoView.setVisibility(8);
                return;
            }
            str = "lithoView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public 1iF A1R() {
        return new 1iF(ConstantsKt.CAMERA_ID_FRONT, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = 1BM.A01(this);
        this.A0A = (ExecutorService) 1Bi.A03(16456);
        this.A02 = (C0dr) 1Bi.A03(84488);
        this.A07 = (CCE) 1Bn.A0A(84864);
    }

    public void BiL() {
        String str;
        CCE cce = this.A07;
        if (cce == null) {
            str = "pageAboutAnalyticsLogger";
        } else {
            PageAboutInputParams pageAboutInputParams = this.A08;
            if (pageAboutInputParams != null) {
                String str2 = pageAboutInputParams.A02;
                if (str2 == null) {
                    str2 = "";
                }
                long j = 0;
                if (this.A09 != null) {
                    C0dr c0dr = this.A02;
                    if (c0dr == null) {
                        str = "clock";
                    } else {
                        long now = c0dr.now();
                        Long l = this.A09;
                        if (l != null) {
                            j = l.longValue();
                        }
                        j = now - j;
                    }
                }
                CCE.A00(cce, Long.valueOf(j), "leave_page_profile_in_messenger", str2, (String) null);
                return;
            }
            str = "inputParams";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void BiM() {
    }

    public boolean Bkd() {
        return false;
    }

    public void BlA() {
    }

    public void CSS() {
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        11T.A0F(r302, 0);
        this.A06 = r302;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(895461340);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132543006, false);
        0FI.A08(-1140355156, A02);
        return A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        PageAboutInputParams pageAboutInputParams = bundle2 != null ? (PageAboutInputParams) bundle2.getParcelable("arg_page_about_params") : null;
        if (pageAboutInputParams == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A08 = pageAboutInputParams;
        this.A00 = (ProgressBar) 7zL.A0F(this, 2131366235);
        this.A05 = (LithoView) 7zL.A0F(this, 2131366234);
        Context context = getContext();
        if (context == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = 7zL.A0W(context);
        A03(this);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        PageAboutInputParams pageAboutInputParams2 = this.A08;
        String str = "inputParams";
        if (pageAboutInputParams2 != null) {
            String str2 = pageAboutInputParams2.A02;
            if (str2 == null) {
                str2 = "";
            }
            A0M.A05("page_id", str2);
            PageAboutInputParams pageAboutInputParams3 = this.A08;
            if (pageAboutInputParams3 != null) {
                ThreadKey threadKey = pageAboutInputParams3.A00;
                A0M.A05("thread_id", String.valueOf(threadKey != null ? 4YU.A0l(threadKey) : null));
                A0M.A04(DKB.A00(ActionId.MESSENGER_QUEUE_CREATION), Integer.valueOf(7zO.A0D(this).getDimensionPixelSize(2132279359)));
                if (this.A08 != null) {
                    2Jf r0 = new 2Jf(2JX.class, (Class) null, "PageAboutQuery", (String) null, "fbandroid", -1245423706, 0, 2981444163L, 2981444163L, false, true);
                    r0.A00 = A0M;
                    1Hz A10 = AbF.A10();
                    AbH.A1W(A10, 109250890);
                    AbH.A1W(A10, -338181066);
                    AbH.A1W(A10, 1735518709);
                    A10.A07();
                    C3sa A00 = C3sa.A00(r0);
                    FbUserSession fbUserSession = this.A01;
                    if (fbUserSession == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    AbstractC05414dq A07 = 1VX.A07(requireContext(), fbUserSession);
                    4YV.A1B(A00);
                    C03713yu A03 = A07.A03(A00);
                    11T.A0A(A03);
                    D4q A002 = D4q.A00(this, 68);
                    ExecutorService executorService = this.A0A;
                    if (executorService != null) {
                        1Kd.A0F(A002, A03, executorService);
                        return;
                    }
                    str = "executorService";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
