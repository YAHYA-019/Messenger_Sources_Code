package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.MontageComposerFragment;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;

/* renamed from: X.6zd, reason: invalid class name */
/* loaded from: 6zd.class */
public abstract class C6zd {
    /* JADX WARN: Type inference failed for: r0v24, types: [X.6yW, java.lang.Object] */
    public static final C6yg A00(Context context, Bundle bundle, Fragment fragment, final ThreadKey threadKey, final C6zc c6zc) {
        C6yg A00;
        11T.A0F(fragment, 1);
        Parcelable parcelable = bundle.getParcelable("trigger2");
        if (parcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        final NavigationTrigger navigationTrigger = (NavigationTrigger) parcelable;
        Object A01 = 0Gm.A01(MontageComposerFragmentParams.CREATOR, bundle.getParcelable("fragment_params"), MontageComposerFragmentParams.class);
        if (A01 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        MontageComposerFragmentParams montageComposerFragmentParams = (MontageComposerFragmentParams) A01;
        if (1XU.A00(context)) {
            final 06Z childFragmentManager = fragment.getChildFragmentManager();
            11T.A0A(childFragmentManager);
            MontageComposerFragmentParams.Builder A002 = montageComposerFragmentParams.A00();
            A002.A0V = true;
            A002.A0C = C6x5.A03;
            final MontageComposerFragmentParams A003 = A002.A00();
            11T.A0D(c6zc);
            11T.A0D(threadKey);
            A00 = new C6yg(childFragmentManager, threadKey, A003, c6zc, navigationTrigger) { // from class: X.828
                public final 06Z A00;
                public final ThreadKey A01;
                public final C6zc A02;
                public final NavigationTrigger A03;
                public final MontageComposerFragmentParams A04;

                {
                    11T.A0F(navigationTrigger, 2);
                    11T.A0F(c6zc, 4);
                    11T.A0F(threadKey, 5);
                    this.A00 = childFragmentManager;
                    this.A03 = navigationTrigger;
                    this.A04 = A003;
                    this.A02 = c6zc;
                    this.A01 = threadKey;
                }

                @Override // X.C6yg
                public int B7H() {
                    return 7376;
                }

                @Override // X.C6yg
                public void BXy(6RU r302) {
                    C7t0.A01(this.A00, this.A04, this.A03, 0);
                }

                @Override // X.C6yg
                public void BXz(Bundle bundle2, 6RU r303) {
                    MontageComposerFragmentParams montageComposerFragmentParams2 = (MontageComposerFragmentParams) bundle2.getParcelable(4YT.A00(65));
                    if (montageComposerFragmentParams2 == null) {
                        0fH.A0o("CameraFragmentLauncher", "Cannot launch montage composer fragment without params");
                        return;
                    }
                    MontageComposerFragmentParams.Builder A004 = montageComposerFragmentParams2.A00();
                    A004.A0C = C6x5.A03;
                    C7t0.A01(this.A00, A004.A00(), this.A03, 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C6yg
                public void BzX(Fragment fragment2, 6RU r303) {
                    if (fragment2 instanceof MontageComposerFragment) {
                        MontageComposerFragment montageComposerFragment = (MontageComposerFragment) fragment2;
                        montageComposerFragment.A06 = new IVx(fragment2, this, r303);
                        montageComposerFragment.A04 = new 9wR(this, 7zL.A14(r303.A00));
                    }
                }
            };
        } else {
            ?? obj = new Object();
            obj.A01(bundle);
            obj.A02(fragment);
            ((6yW) obj).A00 = 7376;
            ((6yW) obj).A04 = MontageComposerActivity.class;
            A00 = obj.A00();
        }
        return A00;
    }
}
