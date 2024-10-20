package com.facebook.messaging.composer.hotlike.plugins.base.impl;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.2KY;
import X.6Qb;
import X.6Qc;
import X.6Qf;
import X.7oV;
import X.C00i;
import X.C22a;
import X.C6ka;
import X.C7yt;
import android.content.Context;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.google.common.base.Objects;

/* loaded from: HotLikeBaseExtensionImplementation.class */
public final class HotLikeBaseExtensionImplementation {
    public boolean A00;
    public String A01;
    public final Context A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 6Qc A07;
    public final 6Qb A08;
    public final 6Qf A09;

    public HotLikeBaseExtensionImplementation(Context context, 6Qc r303, 6Qb r304, 6Qf r305) {
        11T.A0F(context, 1);
        11T.A0F(r305, 2);
        11T.A0F(r303, 3);
        11T.A0F(r304, 4);
        this.A02 = context;
        this.A09 = r305;
        this.A07 = r303;
        this.A08 = r304;
        this.A03 = 1Bq.A00(66067);
        this.A04 = 1Bq.A00(16511);
        this.A05 = 1Bu.A00(115099);
        this.A06 = 1HG.A00(context, 65898);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.graphics.drawable.Drawable] */
    public static final void A00(HotLikeBaseExtensionImplementation hotLikeBaseExtensionImplementation, String str) {
        C6ka AjP;
        String A07;
        if (!11T.A0O(str, hotLikeBaseExtensionImplementation.A01) || hotLikeBaseExtensionImplementation.A00) {
            hotLikeBaseExtensionImplementation.A01 = str;
            boolean z = false;
            hotLikeBaseExtensionImplementation.A00 = false;
            if (str == null || str.length() == 0) {
                z = true;
            }
            boolean z2 = !z;
            C00i c00i = hotLikeBaseExtensionImplementation.A03.A00;
            BasicEmoji A02 = 2KY.A02((C22a) c00i.get(), str);
            if (A02 == null) {
                if (z2) {
                    1Br.A04(hotLikeBaseExtensionImplementation.A04).softReport("HotLikeBaseExtensionImplementation", "Composer emoji unavailable", new Throwable(str));
                }
                AjP = null;
                if (z2 && 1Br.A07(((7oV) 1Br.A0B(hotLikeBaseExtensionImplementation.A05)).A00).AZk(36315262747681402L)) {
                    C22a c22a = (C22a) c00i.get();
                    Context context = hotLikeBaseExtensionImplementation.A02;
                    A07 = null;
                    AjP = c22a.AjR(context, str, context.getResources().getDimensionPixelSize(2132279310));
                } else {
                    A07 = null;
                }
            } else {
                AjP = ((C22a) c00i.get()).AjP(A02, hotLikeBaseExtensionImplementation.A02.getResources().getDimensionPixelSize(2132279310));
                A07 = A02.A07();
            }
            C7yt c7yt = hotLikeBaseExtensionImplementation.A09.A00.A0A;
            if (c7yt != null) {
                OneLineComposerView oneLineComposerView = (OneLineComposerView) c7yt;
                if (Objects.equal(oneLineComposerView.A06, AjP)) {
                    return;
                }
                OneLineComposerView.A06(AjP, oneLineComposerView, A07);
            }
        }
    }
}
