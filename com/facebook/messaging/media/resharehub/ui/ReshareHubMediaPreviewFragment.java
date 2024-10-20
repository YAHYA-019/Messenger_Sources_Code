package com.facebook.messaging.media.resharehub.ui;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Iw;
import X.1iG;
import X.1tJ;
import X.2KE;
import X.2MG;
import X.2Ov;
import X.5zI;
import X.7zL;
import X.7zN;
import X.7zT;
import X.8TT;
import X.9zQ;
import X.AnonymousClass001;
import X.C1oi;
import X.C1rh;
import X.C1rq;
import X.C1u7;
import X.C2yk;
import X.C5yy;
import X.C83r;
import X.C9lC;
import X.C9zj;
import X.QFs;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.resharehub.model.ReshareHubPreviewModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ReshareHubMediaPreviewFragment.class */
public final class ReshareHubMediaPreviewFragment extends 2Ov {
    public FbUserSession A00;
    public LithoView A01;
    public LithoView A02;
    public ReshareHubPreviewModel A03;
    public ThreadKey A04;
    public MigColorScheme A05;
    public final 2KE A0B = 2KE.A0C;
    public final 1Br A0A = 1HG.A01(this, 65898);
    public final 1Br A09 = 1Bq.A00(67858);
    public final 1Br A08 = 1Bq.A00(16688);
    public final 1Br A06 = 1Bq.A00(66389);
    public final 1Br A07 = 1Bu.A00(147630);

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-814662366);
        super.onCreate(bundle);
        this.A00 = 7zT.A08(this);
        A0g(2, R.style.Theme.NoTitleBar);
        0FI.A08(-1091070859, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1099483279);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543256, viewGroup, false);
        0FI.A08(-1717889697, A02);
        return inflate;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-251218753);
        super.onDestroy();
        C1oi.A00(A16(), 4);
        0FI.A08(-372078540, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        ReshareHubPreviewModel reshareHubPreviewModel;
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        Window window = null;
        MigColorScheme migColorScheme = bundle2 != null ? (MigColorScheme) bundle2.getParcelable("color_scheme") : null;
        if (migColorScheme == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A05 = migColorScheme;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (reshareHubPreviewModel = (ReshareHubPreviewModel) bundle3.getParcelable("media_preview_model")) == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = reshareHubPreviewModel;
        Bundle bundle4 = this.mArguments;
        this.A04 = bundle4 != null ? (ThreadKey) bundle4.getParcelable("thread_key") : null;
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            window = dialog.getWindow();
        }
        MigColorScheme migColorScheme2 = this.A05;
        if (migColorScheme2 != null) {
            int BDl = migColorScheme2.BDl();
            if (window != null) {
                window.setBackgroundDrawable(7zL.A0D(BDl));
                C2yk.A00(window, BDl);
                1tJ.A07(window, false);
                1tJ.A06(window, BDl);
            }
            View requireViewById = view.requireViewById(2131366932);
            11T.A0A(requireViewById);
            this.A02 = (LithoView) requireViewById;
            View requireViewById2 = view.requireViewById(2131366931);
            11T.A0A(requireViewById2);
            this.A01 = (LithoView) requireViewById2;
            LithoView lithoView = this.A02;
            String str2 = "toolbar";
            if (lithoView != null) {
                1Iw r0 = lithoView.A09;
                ReshareHubPreviewModel reshareHubPreviewModel2 = this.A03;
                if (reshareHubPreviewModel2 != null) {
                    int i = 2131964471;
                    if (11T.A0O(reshareHubPreviewModel2.A08, "REEL")) {
                        i = 2131964472;
                    }
                    String A0D = r0.A0D(i);
                    11T.A0D(A0D);
                    C1rq A0P = 7zN.A0P(r0, 0);
                    8TT A00 = 5zI.A00(r0);
                    MigColorScheme migColorScheme3 = this.A05;
                    if (migColorScheme3 != null) {
                        A00.A2Y(migColorScheme3);
                        A00.A2a(A0D);
                        A00.A2Z(this.A0B);
                        A00.A2X(C1u7.A08);
                        A00.A2M(true);
                        C1rh A0d = 7zL.A0d(A00.A2W(), A0P);
                        C83r A002 = C5yy.A00(r0);
                        MigColorScheme migColorScheme4 = this.A05;
                        if (migColorScheme4 != null) {
                            A002.A2Y(migColorScheme4);
                            2MG r02 = 2MG.A02;
                            C5yy c5yy = A002.A01;
                            c5yy.A08 = r02;
                            c5yy.A02 = migColorScheme4.AX9();
                            c5yy.A0H = true;
                            C9zj.A03(A002, this, 75);
                            c5yy.A0E = false;
                            A002.A2X(A0d);
                            C9lC A003 = C9lC.A00();
                            MigColorScheme migColorScheme5 = this.A05;
                            if (migColorScheme5 != null) {
                                A003.A01 = migColorScheme5;
                                A003.A03 = r0.A0D(2131964470);
                                A003.A03(new 9zQ(this, 19));
                                A002.A2a(A003.A02());
                                C5yy A2V = A002.A2V();
                                LithoView lithoView2 = this.A02;
                                if (lithoView2 != null) {
                                    lithoView2.A0y(A2V);
                                    ReshareHubPreviewModel reshareHubPreviewModel3 = this.A03;
                                    str = "reshareHubPreviewModel";
                                    if (reshareHubPreviewModel3 != null) {
                                        if ("PHOTO".equals(reshareHubPreviewModel3.A08)) {
                                            ((1iG) 1Br.A0B(this.A06)).A00();
                                        }
                                        LithoView lithoView3 = this.A01;
                                        if (lithoView3 == null) {
                                            str = "content";
                                        } else {
                                            ReshareHubPreviewModel reshareHubPreviewModel4 = this.A03;
                                            if (reshareHubPreviewModel4 != null) {
                                                MigColorScheme migColorScheme6 = this.A05;
                                                if (migColorScheme6 != null) {
                                                    lithoView3.A0y(new QFs(reshareHubPreviewModel4, migColorScheme6));
                                                    C1oi.A00(A16(), 1);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    11T.A0L(str);
                                    throw 0Q8.createAndThrow();
                                }
                            }
                        }
                    }
                    11T.A0L("colorScheme");
                    throw 0Q8.createAndThrow();
                }
                str2 = "reshareHubPreviewModel";
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        str = "colorScheme";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
