package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;

/* loaded from: AGl.class */
public final class AGl implements Runnable {
    public static final String __redex_internal_original_name = "MontageStoriesViewerPrimitive$addFragmentIfAbsent$2$1";
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C2k6 A01;
    public final /* synthetic */ C8is A02;
    public final /* synthetic */ RYh A03;

    public AGl(ViewGroup viewGroup, C2k6 c2k6, C8is c8is, RYh rYh) {
        this.A02 = c8is;
        this.A01 = c2k6;
        this.A03 = rYh;
        this.A00 = viewGroup;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.messaging.montage.viewer.MontageViewerFragment, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public final void run() {
        C8is c8is = this.A02;
        C2k6 c2k6 = this.A01;
        C00m c00m = c8is.A08;
        ?? montageViewerFragment = new MontageViewerFragment();
        Bundle A05 = 1BK.A05();
        A05.putStringArrayList("bucket_ids", C0s8.A10(c8is.A06.A0P));
        A05.putSerializable("launch_source", 7Mg.A07);
        A05.putBoolean(GOm.A00(254), true);
        A05.putInt("extra_render_destination", 2);
        montageViewerFragment.setArguments(A05);
        montageViewerFragment.A0L = new 8uL(0, c2k6, c8is, c00m);
        RYh rYh = this.A03;
        ViewGroup viewGroup = this.A00;
        if (viewGroup.isAttachedToWindow()) {
            RYh.A00(viewGroup, (Fragment) montageViewerFragment, rYh);
        } else {
            0fH.A0n("ImmersiveStories.Primitive.DeferredTxHandler", 0Pz.A0j("Container view for ", rYh.A00, " not attached to Window. Will begin deferred attachment"));
            viewGroup.addOnAttachStateChangeListener(new RjT(viewGroup, (Fragment) montageViewerFragment, rYh));
        }
    }
}
