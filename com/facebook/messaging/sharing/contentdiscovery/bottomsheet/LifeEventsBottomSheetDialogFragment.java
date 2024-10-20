package com.facebook.messaging.sharing.contentdiscovery.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.1cU;
import X.1fF;
import X.2XL;
import X.2XO;
import X.2cK;
import X.2cM;
import X.2kW;
import X.2kZ;
import X.4YV;
import X.7zL;
import X.8OH;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass557;
import X.BLX;
import X.C02A;
import X.C1u2;
import X.C1u3;
import X.C2kk;
import X.C58v;
import X.C5ww;
import X.C8m6;
import X.CBB;
import X.Cvn;
import X.DIZ;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharing.contentdiscovery.model.LifeEvent;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: LifeEventsBottomSheetDialogFragment.class */
public final class LifeEventsBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public ThreadKey A00;
    public DIZ A01;
    public BLX A02;
    public LifeEvent A03;
    public MigColorScheme A04;
    public ImmutableList.Builder A05;
    public C1u2 A06;
    public final 1Br A07 = AbG.A0T();

    private final void A05(C1u3 c1u3, 1Iw r303, C5ww c5ww, int i, int i2) {
        String str;
        ImmutableList.Builder builder = this.A05;
        if (builder != null) {
            AnonymousClass557 A0p = 7zL.A0p();
            A0p.A08(r303.A0D(i));
            A0p.A0A = r303.A0D(i2);
            Context context = r303.A0D;
            C1u2 c1u2 = this.A06;
            if (c1u2 == null) {
                str = "migIconResolver";
            } else {
                int A03 = c1u2.A03(c1u3);
                MigColorScheme migColorScheme = this.A04;
                str = "colorscheme";
                if (migColorScheme != null) {
                    A0p.A05 = C58v.A01(context, A03, migColorScheme.B4h());
                    A0p.A01 = c5ww;
                    MigColorScheme migColorScheme2 = this.A04;
                    if (migColorScheme2 != null) {
                        AbJ.A1S(A0p, migColorScheme2, builder);
                        return;
                    }
                }
            }
        } else {
            str = "bottomSheetItems";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        this.A04 = A1F();
        this.A06 = 4YV.A0I();
        boolean A04 = ((1fF) 1Br.A0B(this.A07)).A04();
        this.A05 = ImmutableList.builder();
        if (!A04) {
            A05(C1u3.A4K, r302, Cvn.A00(this, ActionId.APP_FIRST_VIEW_CONTROLLER), 2131958623, 2131958622);
        }
        A05(C1u3.A2d, r302, Cvn.A00(this, ActionId.MESSENGER_THREAD_LIST_LOADED), 2131958621, 2131958620);
        A05(C1u3.A0q, r302, Cvn.A00(this, ActionId.MESSENGER_THREAD_LIST_DISPLAYED), 2131958619, 2131958618);
        LifeEvent lifeEvent = this.A03;
        if (lifeEvent == null) {
            str = "lifeEvent";
        } else {
            if (CBB.A00(lifeEvent.A00) != 1) {
                Cvn A00 = Cvn.A00(this, ActionId.PREV_ACTIVITY_PAUSE);
                int i = 2131958625;
                int i2 = 2131958624;
                if (A04) {
                    i = 2131957044;
                    i2 = 2131957043;
                }
                A05(C1u3.A1N, r302, A00, i, i2);
            }
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            8OH A002 = C8m6.A00(r302);
            A002.A0R();
            ImmutableList.Builder builder = this.A05;
            if (builder != null) {
                A002.A2W(builder.build());
                2kW r0 = new 2kW();
                r0.A07 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, true), (1cU) null, (Integer) null, false, false);
                A002.A01.A01 = r0.A00();
                A002.A0J();
                return 7zL.A0V(A01, A002.A01);
            }
            str = "bottomSheetItems";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        BLX serializable;
        Parcelable parcelable;
        int A02 = 0FI.A02(-369081962);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        ThreadKey threadKey = null;
        if (bundle2 != null) {
            threadKey = AbH.A0k(bundle2);
        }
        if (threadKey != null) {
            this.A00 = threadKey;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (serializable = bundle3.getSerializable("surface")) == null) {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -1661928252;
            } else {
                this.A02 = serializable;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && (parcelable = bundle4.getParcelable("life_event")) != null) {
                    this.A03 = (LifeEvent) parcelable;
                    0FI.A08(1064241814, A02);
                    return;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = -736541445;
                }
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1155552606;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        ThreadKey threadKey = this.A00;
        if (threadKey == null) {
            str = "threadKey";
        } else {
            AbF.A1J(bundle, threadKey);
            BLX blx = this.A02;
            str = "surface";
            if (blx != null) {
                bundle.putSerializable(str, blx);
                LifeEvent lifeEvent = this.A03;
                if (lifeEvent != null) {
                    bundle.putParcelable("life_event", lifeEvent);
                    return;
                }
                str = "lifeEvent";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
