package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.countdown.RtcGroupCountdownOverlay;
import com.facebook.messaging.rtc.incall.impl.widgets.gradientbackground.GradientCallBackgroundView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.rtc.views.common.CountdownView;

/* renamed from: X.Gc1, reason: case insensitive filesystem */
/* loaded from: Gc1.class */
public final class C2399Gc1 extends 1pK implements JFq {
    public static final String __redex_internal_original_name = "CountdownFragment";
    public RtcGroupCountdownOverlay A00;
    public final C01i A01 = J9s.A01(this, 22);

    public 1iF A1R() {
        return GOq.A0U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        IEA iea = (IEA) 7zN.A0n(this, IDw.A02(this, __redex_internal_original_name), 115612);
        JOY A01 = I7M.A01(IEA.A01(iea));
        C00i c00i = iea.A03;
        JOY.A00(c00i, A01).Bcw("CountdownFragment_create", (String) null);
        JOY.A00(c00i, I7M.A01(IEA.A01(iea))).Bcv("CountdownFragment_create", (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay;
        LithoView lithoView;
        C2px A2W;
        CountdownView countdownView;
        CountdownView countdownView2;
        GradientCallBackgroundView gradientCallBackgroundView;
        IZi iZi = (IZi) jdb;
        int i = 0;
        11T.A0F(iZi, 0);
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay2 = this.A00;
        if (rtcGroupCountdownOverlay2 != null) {
            boolean z = iZi.A06;
            int i2 = iZi.A01;
            if (!rtcGroupCountdownOverlay2.A0D) {
                rtcGroupCountdownOverlay2.A0D = true;
                Context context = rtcGroupCountdownOverlay2.getContext();
                LayoutInflater.from(context).inflate(2132543273, rtcGroupCountdownOverlay2);
                Resources resources = rtcGroupCountdownOverlay2.getResources();
                resources.getConfiguration();
                rtcGroupCountdownOverlay2.A04 = new 1Iw(context);
                rtcGroupCountdownOverlay2.A01 = (ImageButton) rtcGroupCountdownOverlay2.requireViewById(2131364379);
                rtcGroupCountdownOverlay2.A08 = (FbTextView) rtcGroupCountdownOverlay2.requireViewById(2131364380);
                rtcGroupCountdownOverlay2.A09 = (FbTextView) rtcGroupCountdownOverlay2.requireViewById(2131364381);
                rtcGroupCountdownOverlay2.A0B = (CountdownView) rtcGroupCountdownOverlay2.requireViewById(2131364382);
                rtcGroupCountdownOverlay2.A05 = (LithoView) rtcGroupCountdownOverlay2.requireViewById(2131363409);
                rtcGroupCountdownOverlay2.A0A = (FbTextView) rtcGroupCountdownOverlay2.requireViewById(2131363408);
                rtcGroupCountdownOverlay2.A07 = (GradientCallBackgroundView) rtcGroupCountdownOverlay2.requireViewById(2131362764);
                C00i c00i = rtcGroupCountdownOverlay2.A0E.A00;
                if (((HmX) c00i.get()).A00() && (gradientCallBackgroundView = rtcGroupCountdownOverlay2.A07) != null) {
                    gradientCallBackgroundView.setVisibility(0);
                }
                ImageButton imageButton = rtcGroupCountdownOverlay2.A01;
                if (imageButton != null) {
                    IKB.A00(imageButton, rtcGroupCountdownOverlay2, 0);
                }
                CountdownView countdownView3 = rtcGroupCountdownOverlay2.A0B;
                if (countdownView3 != null) {
                    countdownView3.A03 = new HV5(rtcGroupCountdownOverlay2);
                }
                C00i c00i2 = rtcGroupCountdownOverlay2.A02;
                int B4i = AbF.A0p(c00i2).B4i();
                2OB r0 = rtcGroupCountdownOverlay2.A08;
                if (r0 != null) {
                    r0.setTextColor(B4i);
                }
                2OB r02 = rtcGroupCountdownOverlay2.A09;
                if (r02 != null) {
                    r02.setTextColor(B4i);
                }
                CountdownView countdownView4 = rtcGroupCountdownOverlay2.A0B;
                if (countdownView4 != null) {
                    countdownView4.setColor(B4i);
                }
                if (!((HmX) c00i.get()).A00()) {
                    rtcGroupCountdownOverlay2.setBackgroundColor(context.getColor(2132213826));
                }
                2OB r03 = rtcGroupCountdownOverlay2.A09;
                if (r03 != null) {
                    int i3 = 2131968027;
                    if (z) {
                        i3 = 2131968126;
                    }
                    r03.setText(i3);
                }
                ImageButton imageButton2 = rtcGroupCountdownOverlay2.A01;
                if (imageButton2 != null) {
                    GOo.A16(context, imageButton2, 2131968041);
                }
                C1u2 A0I = 4YV.A0I();
                ImageButton imageButton3 = rtcGroupCountdownOverlay2.A01;
                if (imageButton3 != null) {
                    imageButton3.setImageDrawable(A0I.A06(2MQ.A11, 2Re.A02, AbF.A0p(c00i2).AWT()));
                }
                float dimension = resources.getDimension(2132279333);
                ImageButton imageButton4 = rtcGroupCountdownOverlay2.A01;
                if (imageButton4 != null) {
                    imageButton4.setBackground(C2cn.A00(dimension, AbF.A0p(c00i2).Ahd(), AbF.A0p(c00i2).B4f()));
                }
                rtcGroupCountdownOverlay2.A00 = new GTA(rtcGroupCountdownOverlay2, i2 * 1000, z);
            }
        }
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay3 = this.A00;
        if (rtcGroupCountdownOverlay3 != null) {
            boolean A1P = AnonymousClass001.A1P((7zO.A0D(this).getConfiguration().fontScale > 1.3f ? 1 : (7zO.A0D(this).getConfiguration().fontScale == 1.3f ? 0 : -1)));
            if (rtcGroupCountdownOverlay3.A0D && (countdownView2 = rtcGroupCountdownOverlay3.A0B) != null) {
                countdownView2.A05 = A1P;
            }
        }
        int i4 = iZi.A01;
        if (i4 > 0) {
            RtcGroupCountdownOverlay rtcGroupCountdownOverlay4 = this.A00;
            if (rtcGroupCountdownOverlay4 != null && rtcGroupCountdownOverlay4.A0D && (countdownView = rtcGroupCountdownOverlay4.A0B) != null) {
                countdownView.A00 = i4;
                ValueAnimator valueAnimator = countdownView.A01;
                11T.A0D(valueAnimator);
                valueAnimator.setDuration(countdownView.A00 * 1000);
            }
            RtcGroupCountdownOverlay rtcGroupCountdownOverlay5 = this.A00;
            if (rtcGroupCountdownOverlay5 != null && rtcGroupCountdownOverlay5.A0D) {
                IZI izi = (JOJ) rtcGroupCountdownOverlay5.A03.get();
                AbN.A0X(izi).A03(izi.A01, "COUNTDOWN_RING_STARTED");
                CountdownView countdownView5 = rtcGroupCountdownOverlay5.A0B;
                if (countdownView5 != null) {
                    countdownView5.A06 = true;
                    ValueAnimator valueAnimator2 = countdownView5.A01;
                    11T.A0D(valueAnimator2);
                    0K6.A00(valueAnimator2);
                }
                CountDownTimer countDownTimer = rtcGroupCountdownOverlay5.A00;
                if (countDownTimer != null) {
                    countDownTimer.start();
                }
            }
        }
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay6 = this.A00;
        if (rtcGroupCountdownOverlay6 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) C09s.A01(rtcGroupCountdownOverlay6, 2131363405);
            5XE r04 = new 5XE();
            r04.A0C(constraintLayout);
            5XE.A02(r04, 2131363409).A03.A05 = 0.33f;
            r04.A0A(constraintLayout);
            LithoView lithoView2 = rtcGroupCountdownOverlay6.A05;
            if (lithoView2 != null) {
                lithoView2.setVisibility(0);
            }
            2OB r05 = rtcGroupCountdownOverlay6.A0A;
            if (r05 != null) {
                r05.setVisibility(0);
            }
        }
        C2fr c2fr = iZi.A02;
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay7 = this.A00;
        if (rtcGroupCountdownOverlay7 != null) {
            if (c2fr.BWd()) {
                lithoView = rtcGroupCountdownOverlay7.A05;
                if (lithoView != null) {
                    C2pz A00 = C2px.A00(rtcGroupCountdownOverlay7.A04);
                    A00.A2Y(AbF.A0p(rtcGroupCountdownOverlay7.A02));
                    A00.A2X(C2q0.A00);
                    A00.A2Z(c2fr);
                    A2W = A00.A2W();
                    lithoView.A0x(A2W);
                }
            } else {
                c2fr.Azi();
                int A01 = GOo.A01(rtcGroupCountdownOverlay7.getResources());
                lithoView = rtcGroupCountdownOverlay7.A05;
                if (lithoView != null) {
                    2rS A0P = AbstractC2326GOr.A0P(rtcGroupCountdownOverlay7.A04, c2fr, A01);
                    A0P.A2b(AbF.A0p(rtcGroupCountdownOverlay7.A02));
                    A2W = A0P.A2W();
                    lithoView.A0x(A2W);
                }
            }
        }
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay8 = this.A00;
        if (rtcGroupCountdownOverlay8 != null) {
            CharSequence charSequence = iZi.A03;
            2OB r06 = rtcGroupCountdownOverlay8.A0A;
            if (r06 != null) {
                r06.setText(charSequence);
            }
            2OB r07 = rtcGroupCountdownOverlay8.A0A;
            if (r07 != null) {
                r07.setContentDescription(charSequence);
            }
        }
        if (iZi.A04 && (rtcGroupCountdownOverlay = this.A00) != null && !rtcGroupCountdownOverlay.A0C) {
            rtcGroupCountdownOverlay.A0C = true;
            7zQ.A19(rtcGroupCountdownOverlay.A0B);
        }
        boolean z2 = iZi.A07;
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay9 = this.A00;
        if (z2) {
            if (rtcGroupCountdownOverlay9 == null) {
                return;
            } else {
                i = 8;
            }
        } else if (rtcGroupCountdownOverlay9 == null) {
            return;
        }
        rtcGroupCountdownOverlay9.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(190645356);
        11T.A0F(layoutInflater, 0);
        IEA iea = (IEA) 7zN.A0n(this, IDw.A02(this, __redex_internal_original_name), 115612);
        JOY A01 = I7M.A01(IEA.A01(iea));
        C00i c00i = iea.A03;
        JOY.A00(c00i, A01).Bcw("CountdownFragment_onCreateView", (String) null);
        View inflate = layoutInflater.inflate(2132541783, viewGroup, false);
        JOY.A00(c00i, I7M.A01(IEA.A01(iea))).Bcv("CountdownFragment_onCreateView", (String) null);
        0FI.A08(1382930985, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1733425693);
        AbI.A1X(this.A01);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(940458601, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        CountdownView countdownView;
        int A02 = 0FI.A02(-1116544695);
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay = this.A00;
        if (rtcGroupCountdownOverlay == null || !rtcGroupCountdownOverlay.A0D || (countdownView = rtcGroupCountdownOverlay.A0B) == null || !countdownView.A06) {
            Gr0 gr0 = (Gr0) this.A01.getValue();
            GOp.A0O(gr0.A06).A01();
            Gr0.A00(gr0);
        }
        super/*androidx.fragment.app.Fragment*/.onStart();
        0FI.A08(-436673368, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        CountdownView countdownView;
        int A02 = 0FI.A02(1589174438);
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay = this.A00;
        if (rtcGroupCountdownOverlay != null && rtcGroupCountdownOverlay.A0D && (countdownView = rtcGroupCountdownOverlay.A0B) != null && countdownView.A06) {
            CountDownTimer countDownTimer = rtcGroupCountdownOverlay.A00;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            CountdownView countdownView2 = rtcGroupCountdownOverlay.A0B;
            if (countdownView2 != null) {
                countdownView2.A06 = false;
                ValueAnimator valueAnimator = countdownView2.A01;
                11T.A0D(valueAnimator);
                int max = Math.max(3, (int) ((1.0f - valueAnimator.getAnimatedFraction()) * countdownView2.A00));
                ValueAnimator valueAnimator2 = countdownView2.A01;
                11T.A0D(valueAnimator2);
                valueAnimator2.cancel();
                if (max > 0) {
                    ((Gr0) this.A01.getValue()).A00 = max;
                }
            }
        }
        super/*androidx.fragment.app.Fragment*/.onStop();
        0FI.A08(-1761547101, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        IEA iea = (IEA) 7zN.A0n(this, IDw.A02(this, __redex_internal_original_name), 115612);
        JOY A01 = I7M.A01(IEA.A01(iea));
        C00i c00i = iea.A03;
        JOY.A00(c00i, A01).Bcw("CountdownFragment_onViewCreated", (String) null);
        RtcGroupCountdownOverlay rtcGroupCountdownOverlay = (RtcGroupCountdownOverlay) view.requireViewById(2131363406);
        this.A00 = rtcGroupCountdownOverlay;
        if (rtcGroupCountdownOverlay != null) {
            rtcGroupCountdownOverlay.A06 = new HV4(this);
        }
        AbI.A1S(this, this.A01);
        JOY.A00(c00i, I7M.A01(IEA.A01(iea))).Bcv("CountdownFragment_onViewCreated", (String) null);
    }
}
