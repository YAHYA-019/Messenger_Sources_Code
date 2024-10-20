package X;

import com.facebook.messaging.expandablecomponent.dialogfragment.ExpandableBottomSheetDialogFragment;
import com.facebook.messaging.media.mediatraydialogfragment.MediaTrayDialogFragment;

/* loaded from: Cm7.class */
public final class Cm7 implements JL5 {
    public final /* synthetic */ MediaTrayDialogFragment A00;

    public Cm7(MediaTrayDialogFragment mediaTrayDialogFragment) {
        this.A00 = mediaTrayDialogFragment;
    }

    @Override // X.JL5
    public void A86() {
        this.A00.A0p();
    }

    @Override // X.JL5
    public void A88() {
    }

    @Override // X.JL5
    public boolean ADW() {
        return true;
    }

    @Override // X.JL5
    public boolean BQk() {
        if (((ExpandableBottomSheetDialogFragment) this.A00).A00 != null) {
            return !AnonymousClass001.A1Q(r0.getLayoutParams().height, r0.A02);
        }
        11T.A0L("container");
        throw 0Q8.createAndThrow();
    }
}
