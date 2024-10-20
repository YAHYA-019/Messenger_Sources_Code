package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.attachments.VideoAttachmentData;

/* loaded from: Ch2.class */
public final class Ch2 implements 67O {
    public static final String __redex_internal_original_name = "ThreadViewVideoAttachmentView$19$1";
    public final /* synthetic */ BHu A00;

    public Ch2(BHu bHu) {
        this.A00 = bHu;
    }

    public void Bml(Object obj) {
    }

    public void BqY(Object obj) {
        BHu bHu = this.A00;
        6cM r0 = (6cM) bHu.A01;
        CallerContext callerContext = 6cM.A1k;
        if (r0.A0k != null) {
            7zR.A1M(AbF.A0v(r0.A0g), 2131955917);
            6Ro r02 = (6Ro) r0.A1R.get();
            VideoAttachmentData videoAttachmentData = r0.A0k;
            r02.A07((Context) bHu.A02, CallerContext.A0C(4YT.A00(786), "video_save_player_view"), videoAttachmentData, (53U) bHu.A03, true);
        }
    }
}
