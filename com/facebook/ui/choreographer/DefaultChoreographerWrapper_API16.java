package com.facebook.ui.choreographer;

import X.1BQ;
import X.1GU;
import X.C00i;
import X.C1pl;
import X.C62l;
import X.Lnl;
import X.Lnm;
import X.Lnn;
import android.view.Choreographer;

/* loaded from: DefaultChoreographerWrapper_API16.class */
public class DefaultChoreographerWrapper_API16 implements C62l {
    public Choreographer A00;
    public final C00i A01 = new 1BQ(16458);

    @Override // X.C62l
    public void CXz(C1pl c1pl) {
        C00i c00i = this.A01;
        if (!((1GU) c00i.get()).BWu()) {
            ((1GU) c00i.get()).CY3(new Lnl(this, c1pl));
            return;
        }
        Choreographer choreographer = this.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            this.A00 = choreographer;
        }
        choreographer.postFrameCallback(c1pl.A02());
    }

    @Override // X.C62l
    public void CY0(C1pl c1pl, long j) {
        C00i c00i = this.A01;
        if (!((1GU) c00i.get()).BWu()) {
            ((1GU) c00i.get()).CY3(new Lnm(this, c1pl));
            return;
        }
        Choreographer choreographer = this.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            this.A00 = choreographer;
        }
        choreographer.postFrameCallbackDelayed(c1pl.A02(), 400L);
    }

    @Override // X.C62l
    public void CeK(C1pl c1pl) {
        C00i c00i = this.A01;
        if (!((1GU) c00i.get()).BWu()) {
            ((1GU) c00i.get()).CY3(new Lnn(this, c1pl));
            return;
        }
        Choreographer choreographer = this.A00;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            this.A00 = choreographer;
        }
        choreographer.removeFrameCallback(c1pl.A02());
    }
}
