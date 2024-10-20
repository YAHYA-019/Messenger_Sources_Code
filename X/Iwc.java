package X;

import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: Iwc.class */
public final class Iwc implements Runnable {
    public static final String __redex_internal_original_name = "MontageEndCardWithMediaPickerViewerPageFragment$4$1";
    public final /* synthetic */ HmN A00;
    public final /* synthetic */ MediaResource A01;

    public Iwc(HmN hmN, MediaResource mediaResource) {
        this.A00 = hmN;
        this.A01 = mediaResource;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Gby, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = this.A00.A00;
        NavigationTrigger A03 = NavigationTrigger.A03("messenger_montage_end_card");
        MontageComposerFragmentParams A02 = 6zV.A02(this.A01, r0.A0I);
        if (r0.getContext() != null) {
            0LS.A05(MontageComposerActivity.A12(r0.getContext(), A02, A03), (Fragment) r0, ActionId.DATA_LOAD_START);
        }
    }
}
