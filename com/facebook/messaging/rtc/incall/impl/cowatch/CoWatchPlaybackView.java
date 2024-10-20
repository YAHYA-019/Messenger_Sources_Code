package com.facebook.messaging.rtc.incall.impl.cowatch;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.4YU;
import X.4YV;
import X.AbF;
import X.AbstractC2327GOs;
import X.C00i;
import X.C09s;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GP5;
import X.GhD;
import X.Gr1;
import X.HIl;
import X.IAP;
import X.IDw;
import X.IKB;
import X.JFq;
import X.RgY;
import X.SEZ;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: CoWatchPlaybackView.class */
public final class CoWatchPlaybackView extends ConstraintLayout implements JFq {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public LinearLayout A05;
    public GhD A06;
    public RgY A07;
    public Gr1 A08;
    public CoWatchRtcPlayerView A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C00i A0E;
    public final 1Br A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoWatchPlaybackView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0F = GOo.A0L();
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoWatchPlaybackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0F = GOo.A0L();
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoWatchPlaybackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0F = GOo.A0L();
        A00();
    }

    private final void A00() {
        String str;
        Context A08 = 4YU.A08(this);
        this.A08 = new Gr1(A08, IDw.A01(this, "CoWatchPlaybackView"));
        this.A0E = 1Bu.A01(A08, 115390);
        LayoutInflater.from(A08).inflate(2132541795, this);
        this.A04 = C09s.A01(this, 2131363455);
        this.A09 = (CoWatchRtcPlayerView) C09s.A01(this, 2131363439);
        this.A03 = C09s.A01(this, 2131363451);
        this.A05 = (LinearLayout) C09s.A01(this, 2131363450);
        this.A02 = C09s.A01(this, 2131363428);
        CoWatchRtcPlayerView coWatchRtcPlayerView = this.A09;
        if (coWatchRtcPlayerView == null) {
            str = "cowatchPlayerView";
        } else {
            View view = this.A04;
            if (view == null) {
                str = "cowatchTitleView";
            } else {
                LinearLayout linearLayout = this.A05;
                if (linearLayout == null) {
                    str = "cowatchSeekBarContainerView";
                } else {
                    C00i c00i = this.A0E;
                    if (c00i == null) {
                        throw 1BK.A0h();
                    }
                    Object obj = c00i.get();
                    11T.A0A(obj);
                    this.A07 = new RgY(view, linearLayout, (GP5) obj, coWatchRtcPlayerView);
                    View view2 = this.A02;
                    if (view2 == null) {
                        str = "cowatchClosePillView";
                    } else {
                        IKB.A00(view2, this, 1);
                        Resources resources = getResources();
                        this.A01 = resources.getDimensionPixelOffset(2132279368);
                        this.A00 = resources.getDimensionPixelOffset(2132279368);
                        Gr1 gr1 = this.A08;
                        if (gr1 != null) {
                            int A06 = GOn.A06(resources);
                            GOp.A0K(gr1.A04).A04(gr1.A01);
                            gr1.A00 = 4YV.A1V(A06, 1);
                            Gr1.A00(gr1, false);
                            return;
                        }
                        str = "presenter";
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    private final void A01(boolean z) {
        View view = this.A04;
        String str = "cowatchTitleView";
        if (view != null) {
            int visibility = view.getVisibility();
            LinearLayout linearLayout = this.A05;
            String str2 = "cowatchSeekBarContainerView";
            if (linearLayout != null) {
                int visibility2 = linearLayout.getVisibility();
                View view2 = this.A04;
                if (view2 != null) {
                    view2.setVisibility(8);
                    LinearLayout linearLayout2 = this.A05;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                        CoWatchRtcPlayerView coWatchRtcPlayerView = this.A09;
                        str2 = "cowatchPlayerView";
                        if (coWatchRtcPlayerView != null) {
                            ViewGroup.LayoutParams layoutParams = coWatchRtcPlayerView.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                                CoWatchRtcPlayerView coWatchRtcPlayerView2 = this.A09;
                                if (coWatchRtcPlayerView2 != null) {
                                    coWatchRtcPlayerView2.setLayoutParams(layoutParams);
                                }
                            }
                            str = "coWatchPlaybackAnimator";
                            if (z && isAttachedToWindow()) {
                                RgY rgY = this.A07;
                                if (rgY != null) {
                                    RgY.A02(rgY);
                                    RgY.A01(rgY);
                                    CoWatchRtcPlayerView coWatchRtcPlayerView3 = rgY.A07;
                                    IAP iap = new IAP(coWatchRtcPlayerView3);
                                    rgY.A02 = HIl.A00(coWatchRtcPlayerView3, new SEZ(rgY, iap, AbstractC2327GOs.A0G(coWatchRtcPlayerView3, iap), visibility, visibility2));
                                    return;
                                }
                            } else {
                                RgY rgY2 = this.A07;
                                if (rgY2 != null) {
                                    rgY2.A03();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x051b, code lost:
    
        if (r306 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02fb, code lost:
    
        if (r301.A0C != false) goto L66;
     */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.cowatch.CoWatchPlaybackView.CfQ(X.JDB):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2126681250);
        super.onAttachedToWindow();
        Gr1 gr1 = this.A08;
        if (gr1 == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gr1.A0Y(this);
        0FI.A0C(913985420, A06);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        Gr1 gr1 = this.A08;
        if (gr1 == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        int i = configuration.orientation;
        GOp.A0K(gr1.A04).A04(gr1.A01);
        gr1.A00 = 4YV.A1U(i);
        Gr1.A00(gr1, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str;
        int A06 = 0FI.A06(-1057137490);
        RgY rgY = this.A07;
        if (rgY == null) {
            str = "coWatchPlaybackAnimator";
        } else {
            RgY.A02(rgY);
            Gr1 gr1 = this.A08;
            if (gr1 != null) {
                gr1.A0X();
                super.onDetachedFromWindow();
                0FI.A0C(-1876859188, A06);
                return;
            }
            str = "presenter";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
