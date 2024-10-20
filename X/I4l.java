package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.expression.effect.flm.bottomsheet.FlmConsentBottomSheetFragment;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: I4l.class */
public final class I4l {
    public final 1Br A00;
    public final FbUserSession A02;
    public final 1De A04;
    public final 1Br A05;
    public final C01i A01 = GAY.A00(this, 11);
    public final 1BP A03 = FbInjector.A00;

    public I4l(1De r302) {
        this.A04 = r302;
        1Br A0g = 7zM.A0g(FbInjector.A03, 16428);
        this.A00 = A0g;
        FbUserSession A03 = 1Br.A03(A0g);
        this.A02 = A03;
        this.A05 = 7zL.A0S(A03, r302, 82179);
    }

    public static final ExQ A00(I4l i4l) {
        return (ExQ) 1Br.A0B(i4l.A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v2, types: [com.facebook.expression.effect.flm.bottomsheet.FlmConsentBottomSheetFragment, X.0D2, androidx.fragment.app.Fragment] */
    public final FlmConsentBottomSheetFragment A01(Context context, GHg gHg, QqA qqA, boolean z) {
        11T.A0F(context, 0);
        FlmConsentBottomSheetFragment flmConsentBottomSheetFragment = null;
        FlmConsentBottomSheetFragment flmConsentBottomSheetFragment2 = flmConsentBottomSheetFragment;
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            flmConsentBottomSheetFragment2 = flmConsentBottomSheetFragment;
            if (fragmentActivity != null) {
                06Z BDe = fragmentActivity.BDe();
                flmConsentBottomSheetFragment2 = flmConsentBottomSheetFragment;
                if (BDe != null) {
                    flmConsentBottomSheetFragment2 = flmConsentBottomSheetFragment;
                    if (!BDe.A1U()) {
                        flmConsentBottomSheetFragment2 = flmConsentBottomSheetFragment;
                        if (BDe.A0b("FlmConsentBottomSheet") == null) {
                            ?? flmConsentBottomSheetFragment3 = new FlmConsentBottomSheetFragment();
                            flmConsentBottomSheetFragment3.setArguments(0PK.A00(7zO.A1b(DKB.A00(305), Boolean.valueOf(z), 1BK.A1G(DKB.A00(304), qqA))));
                            A00(this).A02 = new GAa(gHg, 33);
                            A00(this).A01 = new GAY(gHg, 12);
                            flmConsentBottomSheetFragment3.A0m(BDe, "FlmConsentBottomSheet");
                            flmConsentBottomSheetFragment2 = flmConsentBottomSheetFragment3;
                        }
                    }
                }
            }
        }
        return flmConsentBottomSheetFragment2;
    }

    public final boolean A02() {
        return AnonymousClass001.A1W(((LiveData) this.A01.getValue()).getValue(), TriState.NO);
    }

    public final boolean A03(EffectItem effectItem) {
        ExQ A00 = A00(this);
        return effectItem != null && effectItem.A10 && 1Br.A07(A00.A0A).AZk(36319321491781498L) && A00.A03;
    }
}
