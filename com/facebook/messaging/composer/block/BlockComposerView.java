package com.facebook.messaging.composer.block;

import X.1BQ;
import X.1BV;
import X.1Bn;
import X.7uD;
import X.AbF;
import X.AbG;
import X.AbL;
import X.C00i;
import X.C1F6;
import X.C7kq;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.inject.FbInjector;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: BlockComposerView.class */
public class BlockComposerView extends CustomFrameLayout {
    public TextView A00;
    public C00i A01;
    public 7uD A02;
    public C00i A03;

    public BlockComposerView(Context context) {
        super(context);
        A00();
    }

    public BlockComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public BlockComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        this.A03 = 1BV.A00(782);
        this.A01 = 1BQ.A02(49965);
        A0U(2132542857);
        this.A00 = AbG.A09(this, 2131362461);
    }

    public static void A01(BlockComposerView blockComposerView) {
        if (blockComposerView.A02 == null) {
            C1F6 A0P = AbF.A0P(blockComposerView.A03);
            Context context = blockComposerView.getContext();
            Context A01 = FbInjector.A01();
            AbL.A0y(A0P);
            try {
                1BV A00 = 1BV.A00(83342);
                1Bn.A0K();
                FbInjector.A04(A01);
                blockComposerView.A02 = C7kq.A00(context, A00);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
    }
}
