package com.facebook.fresco.animation.factory;

import X.1KF;
import X.1iL;
import X.1iO;
import X.2DP;
import X.2DS;
import X.2DX;
import X.2FD;
import X.2Fp;
import X.2Fq;
import X.2Fr;
import X.2G5;
import X.2yU;
import X.3YQ;
import X.C06314gg;
import X.C06354gk;
import X.C06374gm;
import X.GPA;
import X.InterfaceC06384gn;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: AnimatedFactoryV2Impl.class */
public class AnimatedFactoryV2Impl implements 2Fp {
    public int A00;
    public int A01;
    public 1KF A02;
    public 2G5 A03;
    public 2Fq A04;
    public 2Fr A05;
    public InterfaceC06384gn A06;
    public final 2DX A07;
    public final 2FD A08;
    public final 2DP A09;
    public final boolean A0A;
    public final boolean A0B;

    public AnimatedFactoryV2Impl(2DX r302, 2DP r303, 2FD r304, boolean z, boolean z2, int i, int i2, 1KF r309) {
        this.A07 = r302;
        this.A09 = r303;
        this.A08 = r304;
        this.A00 = i;
        this.A0B = z2;
        this.A0A = z;
        this.A02 = r309;
        this.A01 = i2;
    }

    public InterfaceC06384gn AWr(Context context) {
        InterfaceC06384gn interfaceC06384gn = this.A06;
        if (interfaceC06384gn == null) {
            GPA gpa = new GPA(0);
            C06314gg c06314gg = this.A02;
            if (c06314gg == null) {
                c06314gg = new C06314gg("SerialExecutor", new LinkedBlockingQueue(), this.A09.ATW());
            }
            GPA gpa2 = new GPA(1);
            1iL r0 = 1iO.A00;
            2Fq r313 = this.A04;
            if (r313 == null) {
                r313 = new 2Fq() { // from class: X.4gi
                    /* JADX WARN: Type inference failed for: r305v2, types: [X.2Fr, java.lang.Object] */
                    public LA8 AUn(Rect rect, C10014s8 c10014s8) {
                        AnimatedFactoryV2Impl animatedFactoryV2Impl = AnimatedFactoryV2Impl.this;
                        2Fr r305 = animatedFactoryV2Impl.A05;
                        2Fr r3052 = r305;
                        if (r305 == null) {
                            ?? obj = new Object();
                            animatedFactoryV2Impl.A05 = obj;
                            r3052 = obj;
                        }
                        return new LA8(rect, c10014s8, r3052, animatedFactoryV2Impl.A0A);
                    }
                };
                this.A04 = r313;
            }
            C06354gk A00 = C06354gk.A00();
            interfaceC06384gn = new C06374gm(gpa, gpa2, r0, new 2yU(Boolean.valueOf(this.A0B), 1), new 2yU(Boolean.valueOf(this.A0A), 1), new 2yU(Integer.valueOf(this.A00), 1), new 2yU(Integer.valueOf(this.A01), 1), RealtimeSinceBootClock.A00, r313, this.A07, this.A08, c06314gg, A00);
            this.A06 = interfaceC06384gn;
        }
        return interfaceC06384gn;
    }

    public 2DS Ant() {
        return new 3YQ(this, 1);
    }

    public 2DS BKb() {
        return new 3YQ(this, 0);
    }
}
