package com.facebook.messaging.montage.composer.art;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bu;
import X.4YU;
import X.AbL;
import X.AbR;
import X.C09s;
import X.GOn;
import X.HsE;
import X.Hus;
import X.I8Z;
import X.IQ0;
import X.J0K;
import X.JFT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.widget.CustomFrameLayout;
import java.util.Iterator;

/* loaded from: ArtItemView.class */
public final class ArtItemView extends CustomFrameLayout implements JFT, CallerContextable {
    public HsE A00;
    public I8Z A01;
    public Hus A02;
    public IQ0 A03;
    public ViewGroup A04;
    public boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtItemView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A05 = true;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A05 = true;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0G(context, 1, attributeSet);
        this.A05 = true;
        A00();
    }

    private final void A00() {
        this.A01 = (I8Z) 1Bu.A00(115961).get();
        this.A00 = (HsE) 1Bu.A00(115964).get();
        A0U(2132541521);
        this.A04 = (ViewGroup) C09s.A01(this, 2131365169);
        HsE hsE = this.A00;
        if (hsE == null) {
            11T.A0L("artAssetLoadingNotifier");
            throw 0Q8.createAndThrow();
        }
        hsE.A02 = this;
    }

    private final void A01() {
        this.A02 = new Hus();
        AbR abR = (AbR) 1Bn.A0E(4YU.A08(this), (1BY) null, 485);
        ViewGroup viewGroup = this.A04;
        Hus hus = this.A02;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            IQ0 iq0 = new IQ0(this, viewGroup, abR, hus);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = iq0;
            iq0.A0I(getWidth(), getHeight());
            IQ0 iq02 = this.A03;
            if (iq02 != null) {
                iq02.A0E = false;
                iq02.A0A = true;
                iq02.A0F();
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r306 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r0 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        r0.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r301.A02 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r0 = r301.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r0.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r0 = r306.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (r0.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        r0 = (com.facebook.messaging.montage.model.art.ArtAsset) r0.next();
        r0 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        r0.A01++;
        r0 = r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r0 = r0.A03(r0, r302, r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        r0 = new X.IXj(r301, 1);
        X.11T.A0F(r0, 0);
        r0.A0I.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        r0 = r301.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        r0.A05(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        r0 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        r0.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a0, code lost:
    
        if (r306 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0V(com.facebook.messaging.montage.model.art.ArtItem r302, java.lang.Integer r303) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.art.ArtItemView.A0V(com.facebook.messaging.montage.model.art.ArtItem, java.lang.Integer):void");
    }

    public void C4q(Integer num) {
        Hus hus;
        11T.A0F(num, 0);
        if (num != 0S2.A0C || (hus = this.A02) == null) {
            return;
        }
        Iterator it = hus.A06.iterator();
        while (it.hasNext()) {
            GOn.A0q(it).A05(true);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-58226908);
        super.onSizeChanged(i, i2, i3, i4);
        post(new J0K(this, i, i2));
        0FI.A0C(2088458059, A06);
    }
}
