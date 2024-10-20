package com.facebook.messaging.threadview.summary.bottomsheet;

import X.11T;
import X.1BJ;
import X.1Bf;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.7zO;
import X.7zV;
import X.8gR;
import X.9De;
import X.C1F6;
import X.C9P7;
import X.C9fr;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import com.facebook.inject.FbInjector;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: MetaAiThreadSummaryBottomSheet.class */
public final class MetaAiThreadSummaryBottomSheet extends MigBottomSheetDialogFragment {
    public final 1Br A00 = 1Bu.A00(68319);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(1145);
        long j = requireArguments().getLong("THREAD_ID_ARG");
        long j2 = requireArguments().getLong("ENTRY_POINT_TYPE_ARG");
        long j3 = requireArguments().getLong("THREAD_TYPE_ARG");
        Context A00 = 1Bf.A00(c1f6);
        try {
            C9fr c9fr = new C9fr(j, j2, j3);
            1Bn.A0K();
            FbInjector.A04(A00);
            long j4 = requireArguments().getLong("THREAD_ID_ARG");
            double d = requireArguments().getDouble("START_TIMESTAMP_MS_ARG");
            long j5 = requireArguments().getLong(1BJ.A00(844));
            return new 8gR(new C9P7(this, c9fr), A1F(), d, j4, j5);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        int Chx = A1F().Chx(7zV.A0N(this));
        Object parent = view.getParent();
        11T.A0I(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((View) parent).findViewById(2131364441);
        GradientDrawable A0G = 7zO.A0G(0);
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = 0.0f;
            i++;
        } while (i < 8);
        7zV.A0k(A0G, fArr);
        A0G.setColor(Chx);
        findViewById.setBackground(A0G);
    }
}
