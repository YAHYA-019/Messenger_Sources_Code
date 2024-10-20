package com.facebook.mig.nux;

import X.0D2;
import X.0Dc;
import X.0FI;
import X.0ND;
import X.0OU;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.1Lm;
import X.1tC;
import X.2qQ;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zS;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8NK;
import X.8Zu;
import X.9qW;
import X.AVH;
import X.AnonymousClass001;
import X.C0T0;
import X.C0T2;
import X.C0s8;
import X.C1os;
import X.C1u3;
import X.C1ub;
import X.C77c;
import X.C8xe;
import X.C8xf;
import X.C9pw;
import X.C9py;
import X.C9zj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.nux.MetaAIVoiceNuxFragment;
import com.facebook.messaging.highlightstab.nux.HighlightsNuxFragment;
import com.facebook.messaging.montage.composer.magicmod.nux.MagicModNuxFragment;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MigNuxFullScreenSlidingSheet.class */
public abstract class MigNuxFullScreenSlidingSheet extends SlidingSheetFullScreenDialogFragment {
    public MigColorScheme A00;
    public LithoView A01;

    /* JADX WARN: Multi-variable type inference failed */
    public 8NJ A1D(1Iw r302) {
        if (!(this instanceof HighlightsNuxFragment)) {
            if (!(this instanceof MagicModNuxFragment)) {
                return null;
            }
            Context context = r302.A0D;
            Object A0k = 7zN.A0k(context, 100011);
            List A12 = 7zO.A12(8Ll.A01(C1u3.A3Q, r302.A0D(2131958928), r302.A0D(2131958927), (String) null, 8), 8Ll.A01(C1u3.A42, r302.A0D(2131958930), r302.A0D(2131958929), (String) null, 8));
            8Lf r0 = new 8Lf(C9py.A03(this, ActionId.PREV_ACTIVITY_PAUSE), C9pw.A00(r302, A0k, 27), r302.A0D(2131958931), r302.A0D(2131958932));
            0Dc A0P = 7zP.A0P(context);
            A0P.A02(r302.A0D(2131958926));
            A0P.A02(" ");
            MigColorScheme migColorScheme = this.A00;
            if (migColorScheme == null) {
                migColorScheme = 7zS.A0j((Fragment) this);
            }
            A0P.A04(7zQ.A0o().A01(context, C9pw.A00(context, A0k, 26), migColorScheme), 33);
            return new 8NJ(r0, C8xf.A00(2132411098), (CharSequence) null, 7zS.A0A(A0P, r302.A0D(2131958925)), r302.A0D(2131958933), A12, true);
        }
        boolean AZk = C1ub.A00().AZk(36321636489380454L);
        MigColorScheme migColorScheme2 = this.A00;
        if (AZk) {
            if (migColorScheme2 == null) {
                migColorScheme2 = 7zS.A0j(this);
            }
            return new 8NJ(C9py.A02(r302.A0D(2131962392), this, ActionId.APP_DID_FINISH_LAUNCHING), C8xf.A00(7zS.A02(HighlightsNuxFragment.A01, migColorScheme2)), (CharSequence) null, (CharSequence) null, r302.A0D(2131957731), C0s8.A11(8Ll.A01(C1u3.A39, r302.A0D(2131962382), r302.A0D(2131962381), (String) null, 8), 8Ll.A01(C1u3.A4K, r302.A0D(2131962384), r302.A0D(2131962385), (String) null, 8)), true);
        }
        if (migColorScheme2 == null) {
            migColorScheme2 = 7zS.A0j(this);
        }
        C9py c9py = null;
        C8xf A00 = C8xf.A00(7zS.A02(HighlightsNuxFragment.A01, migColorScheme2));
        ArrayList A11 = C0s8.A11(8Ll.A01(C1u3.A61, r302.A0D(2131962378), r302.A0D(2131962377), (String) null, 8), 8Ll.A01(C1u3.A4K, r302.A0D(2131962376), r302.A0D(2131962383), (String) null, 8));
        if (C1ub.A00().AZk(36321636479681079L)) {
            A11.add(8Ll.A01(C1u3.A5q, r302.A0D(2131962380), r302.A0D(2131962379), (String) null, 8));
        }
        String A0D = r302.A0D(2131962392);
        C9py A03 = C9py.A03(this, ActionId.MESSENGER_QUEUE_CREATION);
        String A0D2 = C1ub.A00().AZk(36321636479681079L) ? r302.A0D(2131962396) : null;
        if (C1ub.A00().AZk(36321636479681079L)) {
            c9py = C9py.A03(AVH.A00(r302, this, 15), ActionId.APP_DID_BECOME_ACTIVE);
        }
        return new 8NJ(new 8Lf(A03, c9py, A0D, A0D2), A00, (CharSequence) null, (CharSequence) null, r302.A0D(2131957730), A11, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 8NK A1E(1Iw r302) {
        if (!(this instanceof MetaAIVoiceNuxFragment)) {
            return null;
        }
        List A0v = 7zN.A0v(8Ll.A01(C1u3.A63, ((Fragment) this).getString(2131960307), ((Fragment) this).getString(2131960306), (String) null, 8), 8Ll.A01(C1u3.A3U, ((Fragment) this).getString(2131960312), ((Fragment) this).getString(2131960311), (String) null, 8), 8Ll.A01(C1u3.A4Q, ((Fragment) this).getString(2131960310), ((Fragment) this).getString(2131960309), (String) null, 8));
        8Lf A02 = C9py.A02(7zN.A0s((Fragment) this, 2131960308), this, 13);
        Context context = r302.A0D;
        C77c c77c = (C77c) 7zN.A0k(context, 68283);
        0Dc A0P = 7zP.A0P(context);
        A0P.A02(((Fragment) this).getString(2131960304));
        if (this.A00 == null) {
            7zS.A0j((Fragment) this);
        }
        c77c.A0F(context, A0P);
        SpannableString A0E = 7zM.A0E(A0P);
        C1os c1os = (C1os) 1Lm.A05(context, 1BM.A01((Fragment) this), 66301);
        String A0s = 7zN.A0s((Fragment) this, 2131960305);
        int i = 2132346726;
        if (c1os.A00()) {
            i = 2132346725;
        }
        return new 8NK(A02, (1LI) null, new C8xe(ImageView.ScaleType.CENTER_CROP, Integer.valueOf((int) (((7zO.A0I(context).widthPixels / 7zO.A0I(context).density) * 240.0f) / 394.0f)), i), A0s, (CharSequence) null, A0E, 0, 0, A0v, true, true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1405676489);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132542490, false);
        0FI.A08(-1531839297, A02);
        return A0G;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(813675786);
        super.onDestroyView();
        this.A01 = null;
        0FI.A08(1069006940, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme == null) {
            migColorScheme = 7zS.A0j(this);
        }
        MigColorScheme.A00(view, migColorScheme);
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            throw 1BK.A0h();
        }
        1Bn.A0A(16838);
        1tC.A01(window, 0, 0);
        0OU.A00(window, false);
        C0T2 c0t2 = new C0T2(view, window);
        MigColorScheme migColorScheme2 = this.A00;
        if (migColorScheme2 == null) {
            migColorScheme2 = 7zS.A0j(this);
        }
        2qQ A0o = 7zL.A0o();
        A0o.A01 = 1BK.A0d();
        Object A0p = 7zR.A0p(A0o, migColorScheme2, AnonymousClass001.A0K());
        11T.A0A(A0p);
        boolean z = !AnonymousClass001.A1V(A0p);
        C0T0 c0t0 = c0t2.A00;
        c0t0.A04(z);
        MigColorScheme migColorScheme3 = this.A00;
        if (migColorScheme3 == null) {
            migColorScheme3 = 7zS.A0j(this);
        }
        2qQ A0o2 = 7zL.A0o();
        A0o2.A01 = 1BK.A0d();
        11T.A0A(7zR.A0p(A0o2, migColorScheme3, AnonymousClass001.A0K()));
        c0t0.A03(!AnonymousClass001.A1V(r0));
        LithoView A0b = 7zL.A0b(view, 2131365270);
        0ND.A00(A0b, 9qW.A00);
        MigColorScheme migColorScheme4 = this.A00;
        if (migColorScheme4 == null) {
            migColorScheme4 = 7zS.A0j(this);
        }
        1Iw r0 = A0b.A09;
        11T.A0A(r0);
        A0b.A0x(new 8Zu(A1D(r0), A1E(r0), migColorScheme4, new C9zj(this, ActionId.ABORTED)));
        this.A01 = A0b;
    }
}
