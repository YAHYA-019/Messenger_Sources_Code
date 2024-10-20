package com.facebook.xapp.messaging.generatedsticker.fragment;

import X.0D2;
import X.0FI;
import X.0Gm;
import X.0Q8;
import X.0S2;
import X.0Xs;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1tJ;
import X.2Ov;
import X.2qQ;
import X.2qR;
import X.3yK;
import X.4YT;
import X.6tM;
import X.6zN;
import X.79P;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zR;
import X.7zT;
import X.7zV;
import X.8L7;
import X.9MH;
import X.9Xh;
import X.9hT;
import X.9hU;
import X.AJU;
import X.AW5;
import X.AnonymousClass842;
import X.C00i;
import X.C1p8;
import X.C2636Gjo;
import X.C2yk;
import X.DKB;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function2;

/* loaded from: GeneratedStickersSearchFragment.class */
public final class GeneratedStickersSearchFragment extends 2Ov {
    public LithoView A00;
    public ThreadKey A01;
    public 3yK A02;
    public 6tM A03;
    public 9hU A04;
    public 79P A05;
    public ScheduledFuture A06;
    public boolean A07;
    public boolean A08;
    public final 1Br A09 = 7zN.A0I(this);
    public final 1Br A0D = 1Bq.A00(68416);
    public final 1Br A0F = 1Bq.A00(16461);
    public final 1Br A0E = 1Bu.A00(68628);
    public final 1Br A0B = 7zM.A0Y();
    public final 1Br A0A = 1Bu.A02(this, 50173);
    public final 1Br A0C = 1Bu.A00(115920);
    public final Function2 A0H = new AW5(this, 46);
    public final 9MH A0G = new 9MH(this);

    public static final void A05(Context context, GeneratedStickersSearchFragment generatedStickersSearchFragment, ImmutableList immutableList) {
        Object value;
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        boolean z4;
        1Br A00 = 1HG.A00(context, 68097);
        generatedStickersSearchFragment.A07 = false;
        9hU r0 = generatedStickersSearchFragment.A04;
        if (r0 != null) {
            if (r0.A00.length() <= 0) {
                return;
            }
            if (((AnonymousClass842) 1Br.A0B(generatedStickersSearchFragment.A0D)).A04()) {
                9hU r02 = generatedStickersSearchFragment.A04;
                if (r02 != null) {
                    0Xs r03 = r02.A06;
                    do {
                        value = r03.getValue();
                        8L7 r04 = (8L7) value;
                        z = r04.A03;
                        z2 = r04.A04;
                        list = r04.A01;
                        z3 = r04.A05;
                        z4 = r04.A02;
                        11T.A0F(list, 2);
                    } while (!r03.AGt(value, new 8L7(immutableList, list, z, z2, z3, z4)));
                    9hU.A00(r02, immutableList, r02.A00, 0L, false);
                    return;
                }
            } else {
                9hT A002 = ((9Xh) 1Br.A0B(A00)).A00("generated_suggested_sticker_search_fragment_loader_key");
                if (A002 == null) {
                    return;
                }
                9hU r05 = generatedStickersSearchFragment.A04;
                if (r05 != null) {
                    A002.A01(new C2636Gjo(immutableList, (Boolean) false, r05.A00));
                    return;
                }
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1060776021);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 == null || !bundle2.getBoolean("show_animated_hints")) {
            z = false;
        }
        this.A08 = z;
        Bundle bundle3 = this.mArguments;
        Parcelable parcelable = bundle3 != null ? bundle3.getParcelable("thread_key") : null;
        Parcelable.Creator creator = ThreadKey.CREATOR;
        11T.A0B(creator);
        this.A01 = (ThreadKey) 0Gm.A01(creator, parcelable, ThreadKey.class);
        Context context = getContext();
        11T.A0I(context, DKB.A00(ActionId.RTMP_STREAM_PREPARED));
        ThreadKey threadKey = this.A01;
        79P r0 = new 79P(context, 7zV.A09(this, this.A0B), "image/png", 4YT.A00(404), 4, 16, true, threadKey != null ? threadKey.A0z() : false);
        this.A04 = new 9hU(this, this.A01, r0, this.A08);
        this.A05 = r0;
        A0g(2, 2132608309);
        0FI.A08(-1345721734, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-2110879333);
        LithoView A0V = 7zO.A0V(getContext());
        this.A00 = A0V;
        0FI.A08(1548931028, A02);
        return A0V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-936636912);
        super.onDestroy();
        Context context = getContext();
        11T.A0I(context, DKB.A00(ActionId.RTMP_STREAM_PREPARED));
        ((9Xh) 7zR.A0o(context, 68097)).A00.remove("generated_suggested_sticker_search_fragment_loader_key");
        this.A00 = null;
        0FI.A08(1726744869, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(621329767);
        super.onDestroyView();
        this.A00 = null;
        0FI.A08(707517780, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        int A00;
        Drawable A0D;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        2qR r0 = 6tM.A01;
        C00i c00i = this.A09.A00;
        this.A03 = 6zN.A00(7zM.A11(c00i));
        Dialog dialog = ((0D2) this).A01;
        Window window = null;
        if (dialog != null) {
            window = dialog.getWindow();
        }
        C1p8 A0N = 7zV.A0N(this);
        this.A02 = A0N;
        C00i c00i2 = this.A0D.A00;
        if (7zM.A15(c00i2).A07(this.A01)) {
            A00 = 7zM.A11(c00i).Chx(A0N);
        } else {
            6tM r02 = this.A03;
            if (r02 == null) {
                11T.A0L("boltTheme");
                throw 0Q8.createAndThrow();
            }
            A00 = r02.A00(0S2.A0N);
        }
        if (7zM.A15(c00i2).A07(this.A01)) {
            Context requireContext = requireContext();
            MigColorScheme A11 = 7zM.A11(c00i);
            2qQ A0o = 7zL.A0o();
            7zM.A1V(A0o, 2132346770);
            A0D = requireContext.getDrawable(7zT.A02(A0o, A11, 2132346769));
        } else {
            A0D = 7zL.A0D(A00);
        }
        if (window != null) {
            window.setBackgroundDrawable(A0D);
            C2yk.A00(window, A00);
            1tJ.A07(window, false);
            1tJ.A06(window, A00);
        }
        AJU.A02(this, 7zO.A0J(this), 45);
    }
}
