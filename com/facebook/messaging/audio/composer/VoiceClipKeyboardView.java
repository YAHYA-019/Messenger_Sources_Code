package com.facebook.messaging.audio.composer;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Rv;
import X.2Pl;
import X.2Wo;
import X.4YU;
import X.5YZ;
import X.6KV;
import X.70Q;
import X.7Fa;
import X.82O;
import X.AbK;
import X.C09s;
import X.C6kg;
import X.HIR;
import X.Hlp;
import X.IlT;
import X.Ilf;
import X.Ipt;
import X.REr;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: VoiceClipKeyboardView.class */
public final class VoiceClipKeyboardView extends CustomFrameLayout {
    public Handler A00;
    public 2Pl A01;
    public 6KV A02;
    public 70Q A03;
    public AudioComposerContentView A04;
    public 5YZ A05;
    public REr A06;
    public ThreadKey A07;
    public ThreadKey A08;
    public HIR A09;
    public 1Rv A0A;
    public C6kg A0B;
    public 2Wo A0C;
    public 7Fa A0D;
    public final Runnable A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceClipKeyboardView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0E = new Ipt(this);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceClipKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0E = new Ipt(this);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceClipKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0E = new Ipt(this);
        A00();
    }

    private final void A00() {
        String str;
        A0U(2132542854);
        this.A09 = (HIR) 1Bn.A0A(99453);
        this.A01 = (2Pl) 1Bi.A03(17012);
        Context A08 = 4YU.A08(this);
        this.A0D = (7Fa) 1Bn.A0E(A08, (1BY) null, 115945);
        this.A05 = (5YZ) 1Bi.A03(49777);
        this.A0B = (C6kg) 1Bi.A03(50135);
        this.A0A = (1Rv) 1Bi.A03(67262);
        this.A00 = (Handler) 1Bn.A0A(16430);
        this.A03 = (70Q) 1Bn.A0A(115912);
        this.A02 = ((82O) 1Bn.A0A(65571)).A00(A08);
        setFocusableInTouchMode(true);
        this.A04 = (AudioComposerContentView) C09s.A01(this, 2131362132);
        2Wo A0v = AbK.A0v(this, 2131362133);
        this.A0C = A0v;
        IlT.A00(A0v, this, 0);
        AudioComposerContentView audioComposerContentView = this.A04;
        if (audioComposerContentView == null) {
            str = "audioComposerContentView";
        } else {
            audioComposerContentView.A0G = new Hlp(this);
            7Fa r0 = this.A0D;
            if (r0 != null) {
                r0.A00 = new Ilf(this);
                return;
            }
            str = "audioRecorderAsync";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(275528324);
        super.onDetachedFromWindow();
        7Fa r0 = this.A0D;
        if (r0 == null) {
            11T.A0L("audioRecorderAsync");
            throw 0Q8.createAndThrow();
        }
        r0.A07();
        0FI.A0C(402522490, A06);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        11T.A0F(keyEvent, 1);
        7Fa r0 = this.A0D;
        if (r0 == null) {
            11T.A0L("audioRecorderAsync");
            throw 0Q8.createAndThrow();
        }
        r0.A07();
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        int A06 = 0FI.A06(-708146571);
        super.onWindowFocusChanged(z);
        if (!z) {
            7Fa r0 = this.A0D;
            if (r0 == null) {
                11T.A0L("audioRecorderAsync");
                throw 0Q8.createAndThrow();
            }
            r0.A07();
        }
        0FI.A0C(116432207, A06);
    }
}
