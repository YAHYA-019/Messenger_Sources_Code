package com.facebook.video.plugins;

import X.0S2;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.6TI;
import X.6TX;
import X.6Tb;
import X.6Tu;
import X.6UR;
import X.6VR;
import X.82P;
import X.C09s;
import X.C6cp;
import X.C6d6;
import X.C6dv;
import X.C6dx;
import X.C7lz;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.lang.ref.WeakReference;

/* loaded from: LoadingSpinnerPlugin.class */
public class LoadingSpinnerPlugin extends C6d6 {
    public 6TI A00;
    public Integer A01;
    public 82P A02;
    public 82P A03;
    public final ViewGroup A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final C6dx A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerPlugin(Context context) {
        this(context, 2132542441);
        11T.A0F(context, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.os.Handler, X.6dx] */
    public LoadingSpinnerPlugin(Context context, int i) {
        super(context, null, 0);
        C6cp c6cp;
        this.A01 = 0S2.A00;
        this.A06 = 1HG.A00(context, 115833);
        this.A07 = 1Bq.A00(115824);
        this.A05 = 1Bq.A00(16458);
        A0C(i);
        this.A04 = (ViewGroup) C09s.A01(this, 2131365317);
        ?? handler = new Handler(Looper.getMainLooper());
        handler.A00 = new WeakReference(this);
        this.A08 = handler;
        if (this instanceof C6dv) {
            final C6dv c6dv = (C6dv) this;
            c6cp = new C6cp() { // from class: X.6dy
                {
                    super(C6dv.this);
                }

                @Override // X.C6cp
                public void A06(6UE r302) {
                    super.A06(r302);
                }
            };
        } else {
            c6cp = new C6cp(this);
        }
        A0h(c6cp, new 82P(this, 31), new 6VR(this, this));
    }

    public static final void A00(LoadingSpinnerPlugin loadingSpinnerPlugin, boolean z) {
        6UR B3e;
        6TI r0 = loadingSpinnerPlugin.A00;
        boolean z2 = true;
        if (r0 == null || !r0.A03.A1k) {
            6Tu r02 = ((C6d6) loadingSpinnerPlugin).A08;
            if (r02 == null) {
                if (z) {
                    loadingSpinnerPlugin.A0g("PlaybackController", "LoadingSpinnerPlugin.onLoad");
                    return;
                }
                return;
            }
            B3e = r02.B3e();
        } else {
            6Tb r03 = (6Tb) loadingSpinnerPlugin.A07.A00.get();
            String A03 = r0.A03();
            PlayerOrigin playerOrigin = ((C6d6) loadingSpinnerPlugin).A03;
            if (playerOrigin == null) {
                playerOrigin = PlayerOrigin.A0g;
            }
            B3e = r03.A07(playerOrigin, A03).A06();
        }
        if (B3e != 6UR.A02) {
            z2 = false;
        }
        A01(loadingSpinnerPlugin, z2);
    }

    public static final void A01(LoadingSpinnerPlugin loadingSpinnerPlugin, boolean z) {
        C6dx c6dx = loadingSpinnerPlugin.A08;
        c6dx.removeMessages(0);
        if (z) {
            c6dx.sendEmptyMessageDelayed(0, 1000L);
        } else {
            A02(loadingSpinnerPlugin, false);
        }
    }

    public static final void A02(LoadingSpinnerPlugin loadingSpinnerPlugin, boolean z) {
        ViewGroup viewGroup;
        loadingSpinnerPlugin.A06.A00.get();
        int intValue = loadingSpinnerPlugin.A01.intValue();
        int i = 4;
        if (intValue == 0) {
            viewGroup = loadingSpinnerPlugin.A04;
            if (z) {
                i = 0;
            }
        } else if (intValue != 1) {
            return;
        } else {
            viewGroup = loadingSpinnerPlugin.A04;
        }
        viewGroup.setVisibility(i);
    }

    @Override // X.C6d6
    public void A0M() {
        this.A08.removeMessages(0);
        A02(this, false);
    }

    @Override // X.C6d6
    public void A0P() {
        this.A08.removeMessages(0);
        A02(this, false);
        this.A00 = null;
        A0i(this.A02, this.A03);
    }

    @Override // X.C6d6
    public void A0Y(6TI r302) {
        this.A0D = false;
        this.A01 = 0S2.A00;
        this.A00 = r302;
        if (r302 == null || !r302.A03.A1k) {
            return;
        }
        if (this.A02 == null) {
            this.A02 = new 82P(this, 29);
        }
        82P r306 = this.A03;
        if (r306 == null) {
            r306 = new 82P(this, 30);
            this.A03 = r306;
        }
        A0h(this.A02, r306);
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        if (z) {
            this.A01 = 0S2.A00;
        }
        A00(this, true);
    }

    @Override // X.C6d6
    public void CgE(6TX r302) {
        11T.A0F(r302, 0);
        super.CgE(r302);
        C7lz.A00(this.A04, r302, "LoadingSpinner");
    }
}
