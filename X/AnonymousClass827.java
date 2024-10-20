package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.827, reason: invalid class name */
/* loaded from: 827.class */
public final class AnonymousClass827 implements 6tF {
    public final Context A00;
    public final 82D A01;
    public final AnonymousClass826 A02;
    public final 6RU A03;

    public AnonymousClass827(Context context, 82D r303, AnonymousClass826 anonymousClass826, 6RU r305) {
        11T.A0F(r303, 1);
        11T.A0F(r305, 3);
        11T.A0F(anonymousClass826, 4);
        this.A01 = r303;
        this.A00 = context;
        this.A03 = r305;
        this.A02 = anonymousClass826;
    }

    public void BY3(1pK r302, ThreadKey threadKey) {
        BY4(r302, threadKey, 0);
    }

    public void BY4(1pK r302, ThreadKey threadKey, int i) {
        BY5(r302, threadKey, i, false);
    }

    public void BY5(1pK r302, ThreadKey threadKey, int i, boolean z) {
        View view = r302.mView;
        if (view != null) {
            C5fi.A01(view);
            1vD.A00(view).Czy(this.A02.A00(threadKey, i), "thread_settings_fragment");
        }
    }

    public void BdA(Fragment fragment, final 1pK r303, final ThreadKey threadKey) {
        if (fragment instanceof 8GC) {
            final 82D r0 = this.A01;
            final Context context = this.A00;
            final 6RU r02 = this.A03;
            DHe dHe = new DHe(context, r303, threadKey, r0, r02) { // from class: X.9xx
                public final Context A00;
                public final 1pK A01;
                public final ThreadKey A02;
                public final 82D A03;
                public final 6RU A04;

                {
                    11T.A0F(r02, 5);
                    this.A01 = r303;
                    this.A03 = r0;
                    this.A02 = threadKey;
                    this.A00 = context;
                    this.A04 = r02;
                }

                @Override // X.DHe
                public void CQ5(int i, Bundle bundle) {
                    Intent intent = new Intent();
                    intent.putExtra(4YT.A00(1522), this.A02);
                    if (bundle != null) {
                        intent.putExtras(bundle);
                    }
                    82D r03 = this.A03;
                    Context context2 = this.A00;
                    2Oh r04 = this.A01;
                    r03.A00(context2, intent, ((Fragment) r04).mView, r04 instanceof 2Oh ? r04 : null, this.A04, (1Va) null, ActionId.ON_VIEW_CREATED_END, i, false);
                }

                @Override // X.DHe
                public void CSR() {
                    View view = this.A01.mView;
                    if (view != null) {
                        1vD.A00(view).CeH("thread_settings_fragment");
                    }
                }
            };
            BBc bBc = (8GC) fragment;
            bBc.A01 = dHe;
            BBc.A03(bBc);
        }
    }
}
