package X;

import com.facebook.messaging.sharedalbum.bottomsheet.SharedAlbumBottomSheetFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: ADj.class */
public final class ADj implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumBottomSheetFragment$onVideoSizeExceeded$1";
    public final /* synthetic */ SharedAlbumBottomSheetFragment A00;

    public ADj(SharedAlbumBottomSheetFragment sharedAlbumBottomSheetFragment) {
        this.A00 = sharedAlbumBottomSheetFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedAlbumBottomSheetFragment sharedAlbumBottomSheetFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        ((Hsl) 1Br.A0B(sharedAlbumBottomSheetFragment.A0G)).A01(new 9wC(2), 5Pz.A1B.toString());
        sharedAlbumBottomSheetFragment.A0I.invoke();
    }
}
