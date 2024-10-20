package X;

import com.facebook.messaging.wellbeing.selfremediation.block.user.bottomsheet.BlockUserBottomSheetFragment;

/* loaded from: D6u.class */
public final class D6u implements Runnable {
    public static final String __redex_internal_original_name = "BlockUserBottomSheetPresenter$handleSuccess$1";
    public final /* synthetic */ CMj A00;

    public D6u(CMj cMj) {
        this.A00 = cMj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockUserBottomSheetFragment blockUserBottomSheetFragment = this.A00.A01;
        if (blockUserBottomSheetFragment != null) {
            blockUserBottomSheetFragment.A0o();
        }
    }
}
