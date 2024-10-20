package com.facebook.messaging.rtc.incall.impl.widgets.videoparticipantview;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2OB;
import X.4YU;
import X.AnonymousClass001;
import X.GOn;
import X.GOp;
import X.GpZ;
import X.Gq8;
import X.Hnk;
import X.Ht3;
import X.I9M;
import X.IKB;
import X.Is7;
import X.JLm;
import X.JOM;
import X.JQv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbTextView;

/* loaded from: ViEAndroidGLES20ScaledVideoViewHolder.class */
public final class ViEAndroidGLES20ScaledVideoViewHolder extends FbFrameLayout {
    public View A00;
    public JQv A01;
    public FbButton A02;
    public FbTextView A03;
    public boolean A04;
    public boolean A05;
    public final 1Br A06;
    public final 1Br A07;
    public final Runnable A08;
    public final View.OnClickListener A09;
    public final JLm A0A;
    public final Ht3 A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViEAndroidGLES20ScaledVideoViewHolder(Context context) {
        super(context);
        11T.A0F(context, 1);
        Context A08 = 4YU.A08(this);
        this.A07 = 1Bu.A01(A08, 16428);
        this.A06 = 1Bu.A01(A08, 114862);
        this.A0B = new Gq8(this, 16);
        this.A08 = new Is7(this);
        this.A0A = GpZ.A00(this, 39);
        this.A09 = new IKB(this, 24);
        A00(1Br.A03(this.A07), context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViEAndroidGLES20ScaledVideoViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        Context A08 = 4YU.A08(this);
        this.A07 = 1Bu.A01(A08, 16428);
        this.A06 = 1Bu.A01(A08, 114862);
        this.A0B = new Gq8(this, 16);
        this.A08 = new Is7(this);
        this.A0A = GpZ.A00(this, 39);
        this.A09 = new IKB(this, 24);
        A00(1Br.A03(this.A07), context);
    }

    private final void A00(FbUserSession fbUserSession, Context context) {
        View.inflate(context, 2132543248, this);
        this.A00 = requireViewById(2131363373);
        this.A03 = (FbTextView) requireViewById(2131368519);
        this.A02 = (FbButton) requireViewById(2131368518);
        JQv jQv = (JQv) requireViewById(2131367102);
        this.A01 = jQv;
        if (jQv == null) {
            throw 1BK.A0h();
        }
        ((ViEAndroidGLES20ScaledSurfaceView) jQv).A05 = new Hnk(fbUserSession, this);
        A02();
        View view = this.A00;
        if (view == null) {
            throw 1BK.A0h();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GOp.A0C(view);
        layoutParams.gravity = 49;
        view.setLayoutParams(layoutParams);
    }

    public static final void A01(ViEAndroidGLES20ScaledVideoViewHolder viEAndroidGLES20ScaledVideoViewHolder) {
        if (viEAndroidGLES20ScaledVideoViewHolder.A04 && viEAndroidGLES20ScaledVideoViewHolder.A05) {
            JQv jQv = viEAndroidGLES20ScaledVideoViewHolder.A01;
            if (jQv == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            if (((ViEAndroidGLES20ScaledSurfaceView) jQv).A00 > 1.01f) {
                FbButton fbButton = viEAndroidGLES20ScaledVideoViewHolder.A02;
                if (fbButton == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                fbButton.setVisibility(0);
                2OB r0 = viEAndroidGLES20ScaledVideoViewHolder.A03;
                if (r0 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                r0.setVisibility(8);
            }
        }
    }

    public final void A02() {
        FbButton fbButton = this.A02;
        if (fbButton == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        fbButton.setVisibility(8);
        2OB r0 = this.A03;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r0.setVisibility(8);
    }

    public final void A03(boolean z) {
        this.A05 = z;
        JQv jQv = this.A01;
        if (jQv == null) {
            throw 1BK.A0h();
        }
        ViEAndroidGLES20ScaledSurfaceView viEAndroidGLES20ScaledSurfaceView = (ViEAndroidGLES20ScaledSurfaceView) jQv;
        if (viEAndroidGLES20ScaledSurfaceView.A07 != z) {
            viEAndroidGLES20ScaledSurfaceView.A07 = z;
            if (z) {
                if (viEAndroidGLES20ScaledSurfaceView.A08) {
                    return;
                }
                viEAndroidGLES20ScaledSurfaceView.A08 = true;
                ((I9M) 1Br.A0B(viEAndroidGLES20ScaledSurfaceView.A0A)).A03(viEAndroidGLES20ScaledSurfaceView.A0C, 230);
                return;
            }
            viEAndroidGLES20ScaledSurfaceView.Chi("PINCH_TO_ZOOM_ENDED_PINCH_OUT");
            if (viEAndroidGLES20ScaledSurfaceView.A08) {
                viEAndroidGLES20ScaledSurfaceView.A08 = false;
                ((I9M) 1Br.A0B(viEAndroidGLES20ScaledSurfaceView.A0A)).A02(viEAndroidGLES20ScaledSurfaceView.A0C);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(227966123);
        super.onAttachedToWindow();
        FbButton fbButton = this.A02;
        if (fbButton == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A0C(1159885238, A06);
            throw A0h;
        }
        fbButton.setOnClickListener(this.A09);
        FbUserSession A03 = 1Br.A03(this.A07);
        Context A08 = 4YU.A08(this);
        GOn.A0s(A08, A03).A60(this.A0A);
        ((JOM) 1Lm.A05(A08, A03, 114856)).A62(this.A0B);
        0FI.A0C(-735761733, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IllegalStateException A0N;
        int i;
        int A06 = 0FI.A06(621442055);
        JQv jQv = this.A01;
        if (jQv != null) {
            jQv.Chi("PINCH_TO_ZOOM_ENDED_WITH_VIEW_DESTROYED");
            FbButton fbButton = this.A02;
            if (fbButton != null) {
                fbButton.setOnClickListener(null);
                FbUserSession A03 = 1Br.A03(this.A07);
                Context A08 = 4YU.A08(this);
                GOn.A0s(A08, A03).CeV(this.A0A);
                ((JOM) 1Lm.A05(A08, A03, 114856)).CeX(this.A0B);
                super.onDetachedFromWindow();
                0FI.A0C(-510980372, A06);
                return;
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 88952803;
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 256749149;
        }
        0FI.A0C(i, A06);
        throw A0N;
    }
}
