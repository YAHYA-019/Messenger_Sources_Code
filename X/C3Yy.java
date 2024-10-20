package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.messaging.communitymessaging.plugins.communitypreview.touchinterceptor.CommunityPreviewTouchInterceptorImplementation;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* renamed from: X.3Yy, reason: invalid class name */
/* loaded from: 3Yy.class */
public final class C3Yy implements 3xS {
    public final /* synthetic */ CommunityPreviewTouchInterceptorImplementation A00;

    public C3Yy(CommunityPreviewTouchInterceptorImplementation communityPreviewTouchInterceptorImplementation) {
        this.A00 = communityPreviewTouchInterceptorImplementation;
    }

    public final Integer C29(MotionEvent motionEvent, RecyclerView recyclerView) {
        new BaseMigBottomSheetDialogFragment().A0m(this.A00.A00, "CommunityPreviewJoinBottomSheetFragment");
        return 0S2.A00;
    }
}
