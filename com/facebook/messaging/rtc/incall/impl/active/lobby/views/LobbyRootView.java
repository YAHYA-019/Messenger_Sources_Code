package com.facebook.messaging.rtc.incall.impl.active.lobby.views;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1Lm;
import X.2FP;
import X.2Qa;
import X.2Qn;
import X.2eH;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zN;
import X.AbG;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.AnonymousClass016;
import X.B7b;
import X.By3;
import X.C0D1;
import X.C1F6;
import X.C1rg;
import X.C36;
import X.CZp;
import X.CZq;
import X.CaE;
import X.Cp7;
import X.Cwk;
import X.D3d;
import X.D6E;
import X.DIo;
import X.HoU;
import X.I7P;
import X.IDw;
import X.IEo;
import X.RQf;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbFrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LobbyRootView.class */
public final class LobbyRootView extends FbFrameLayout implements LifecycleOwner, LifecycleEventObserver {
    public LifecycleRegistry A00;
    public LithoView A01;
    public B7b A02;
    public boolean A03;
    public final Context A04;
    public final Lifecycle A05;
    public final FbUserSession A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final RQf A0W;
    public final List A0X;
    public final 1Br A0Y;
    public final 1Br A0Z;
    public final 2Qn A0a;
    public final CZp A0b;
    public final Runnable A0c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyRootView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LobbyRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lifecycle lifecycle;
        11T.A0F(context, 1);
        this.A00 = new LifecycleRegistry(this);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) AnonymousClass016.A00(getContext(), LifecycleOwner.class);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.A05 = this.A00;
        this.A04 = context;
        this.A0X = AnonymousClass001.A0s();
        this.A0R = 1Bu.A01(context, 115682);
        this.A0V = 1Bu.A00(98449);
        this.A0Q = 7zM.A0P();
        this.A0Y = AbG.A0Z();
        this.A0Z = 7zN.A0H(context);
        FbUserSession A01 = IDw.A01(this, "LobbyRootView");
        this.A06 = A01;
        this.A0L = 1Bu.A01(context, 85155);
        this.A0T = 1Lm.A00(context, A01, 67965);
        this.A0H = 1Bu.A00(147746);
        this.A0N = 1Bu.A01(context, 85154);
        this.A07 = 1Lm.A00(context, A01, 99475);
        this.A0O = 1Lm.A01(A01, 84148);
        this.A09 = 1Lm.A00(context, A01, 100046);
        this.A08 = 1Bu.A01(context, 114932);
        this.A0C = 1Bu.A01(context, 16980);
        this.A0M = 1Lm.A00(context, A01, 33089);
        this.A0F = 1Bu.A00(115624);
        this.A0G = 1Lm.A00(context, A01, 85218);
        this.A0B = 1Bu.A00(84151);
        this.A0S = 1Lm.A00(context, A01, 17016);
        this.A0A = 1Lm.A00(context, A01, 84181);
        this.A0U = 1Bq.A00(147982);
        this.A0K = 1Bq.A00(147983);
        this.A0J = 1Bq.A00(147981);
        this.A0D = 1Bq.A00(115033);
        this.A0E = 1Bq.A00(115042);
        this.A0P = 1Bq.A00(115040);
        this.A0I = 1Bu.A00(147720);
        this.A0W = new RQf(this);
        this.A0c = new D6E(this);
        this.A0a = new Cp7(this, 1);
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 1019);
        Context A012 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            B7b b7b = new B7b(this, A01, AbG.A0H(c1f6));
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A02 = b7b;
            C1F6 A0F = AbG.A0F(1020);
            A012 = FbInjector.A01();
            AbL.A0y(A0F);
            try {
                LifecycleObserver cZp = new CZp(context, A01);
                1Bn.A0K();
                FbInjector.A04(A012);
                this.A0b = cZp;
                1Iw A0W = 7zL.A0W(context);
                this.A01 = LithoView.A02(C1rg.A00(A0W).A00, A0W);
                Lifecycle lifecycle2 = getLifecycle();
                CZq cZq = this.A02;
                if (cZq != null) {
                    lifecycle2.addObserver(cZq);
                    B7b b7b2 = this.A02;
                    if (b7b2 != null) {
                        CaE.A02(this, b7b2.A03, ActionId.NEW_START_FOUND);
                        B7b b7b3 = this.A02;
                        if (b7b3 != null) {
                            CaE.A02(this, b7b3.A02, ActionId.MISSED_EVENT);
                            lifecycle2.addObserver(cZp);
                            addView(this.A01);
                            return;
                        }
                    }
                }
                11T.A0L("rootViewModel");
                throw 0Q8.createAndThrow();
            } finally {
            }
        } finally {
        }
    }

    public /* synthetic */ LobbyRootView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final Cwk A00(LobbyRootView lobbyRootView, String str, String str2) {
        By3 by3 = (By3) 1Br.A0B(lobbyRootView.A0N);
        ArrayList A0s = AnonymousClass001.A0s();
        if (1Br.A07(((C36) 1Br.A0B(by3.A04)).A00).AZk(36317792483422046L)) {
            AnonymousClass001.A1J(A0s, 0);
        }
        if (7zM.A1b(A0s)) {
            return new Cwk(lobbyRootView, str, str2);
        }
        return null;
    }

    public static final 2eH A01(DIo dIo, LobbyRootView lobbyRootView, boolean z) {
        return 2FP.A00(new D3d(lobbyRootView, dIo, 2), ((HoU) 1Br.A0B(lobbyRootView.A0L)).A00(lobbyRootView.A04, lobbyRootView.A06, z), 4YV.A11(lobbyRootView.A0Q));
    }

    public static final void A02(LobbyRootView lobbyRootView) {
        if (lobbyRootView.A03) {
            return;
        }
        boolean z = ((IEo) 1Br.A0B(lobbyRootView.A09)).A06().A00;
        I7P i7p = (I7P) 1Br.A0B(lobbyRootView.A08);
        FbUserSession fbUserSession = lobbyRootView.A06;
        11T.A0F(fbUserSession, 0);
        I7P.A00(fbUserSession, i7p, z ? "avatar_show_avatar_button" : "avatar_hide_avatar_button", "rooms_lobby");
        lobbyRootView.A03 = true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.A05;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1771186662);
        1Br.A0C(this.A0D);
        int A062 = 0FI.A06(-809690501);
        super.onAttachedToWindow();
        this.A00.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        0FI.A0C(231708386, A062);
        getHandler().postDelayed(this.A0c, 3000L);
        2Qa r0 = (2Qa) 1Br.A0B(this.A0M);
        2Qn r02 = this.A0a;
        r0.A02(r02);
        r02.CBi();
        0FI.A0C(1669197135, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-2027183951);
        int A062 = 0FI.A06(1341273538);
        LifecycleRegistry lifecycleRegistry = this.A00;
        if (lifecycleRegistry.state != Lifecycle.State.DESTROYED) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        super.onDetachedFromWindow();
        0FI.A0C(979319873, A062);
        getHandler().removeCallbacks(this.A0c);
        1Br.A0C(this.A0H);
        Context context = this.A04;
        11T.A0F(context, 0);
        if (context instanceof FragmentActivity) {
            06Z BDe = ((FragmentActivity) context).BDe();
            11T.A0A(BDe);
            if (C0D1.A01(BDe)) {
                Fragment A0b = BDe.A0b("privacy_fragment");
                if (A0b != null) {
                    AbN.A0y(A0b, BDe);
                }
                Fragment A0b2 = BDe.A0b("link_upgrade_version");
                if (A0b2 != null) {
                    AbN.A0y(A0b2, BDe);
                }
            }
        }
        ((2Qa) 1Br.A0B(this.A0M)).A03(this.A0a);
        0FI.A0C(781819999, A06);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(event, 1);
        this.A00.handleLifecycleEvent(event);
    }
}
