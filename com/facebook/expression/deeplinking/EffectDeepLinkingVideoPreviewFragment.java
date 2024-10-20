package com.facebook.expression.deeplinking;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BM;
import X.1BY;
import X.1Bn;
import X.2Ov;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.9AN;
import X.9Gs;
import X.Gqn;
import X.Hoo;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: EffectDeepLinkingVideoPreviewFragment.class */
public final class EffectDeepLinkingVideoPreviewFragment extends 2Ov {
    public Hoo A00;
    public 9AN A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View, com.facebook.litho.LithoView, X.Gl0] */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1687514129);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A01 = (9AN) 7zN.A0n(this, 1BM.A01(this), 68649);
        this.A00 = (Hoo) 7zO.A0l(this, 99829);
        9AN r0 = this.A01;
        if (r0 != null) {
            r0.A00 = new 9Gs(this);
            Bundle bundle2 = this.mArguments;
            EffectItem effectItem = bundle2 != null ? (EffectItem) bundle2.getParcelable(1BJ.A00(688)) : null;
            Bundle bundle3 = this.mArguments;
            String string = bundle3 != null ? bundle3.getString("CRYPTO_HASH") : null;
            if (effectItem != null) {
                9AN r02 = this.A01;
                if (r02 != null) {
                    r02.A01 = effectItem;
                }
            }
            if (string == null || this.A01 != null) {
                Context requireContext = requireContext();
                ?? lithoView = new LithoView(requireContext, (AttributeSet) null);
                lithoView.A00 = (Gqn) 1Bn.A0E(requireContext, (1BY) null, 68650);
                lithoView.A01 = (MigColorScheme) 1Bn.A0E(requireContext, (1BY) null, 16980);
                0FI.A08(-777746765, A04);
                return lithoView;
            }
        }
        11T.A0L("viewModel");
        throw 0Q8.createAndThrow();
    }
}
