package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.montage.forked.model.viewer.ViewerPollVoteResult;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: I6C.class */
public abstract class I6C {
    public static C2578Ghr A00(GL2 gl2) {
        Iterator it = HII.A00(gl2.AmF(), "StoryOverlayPollSticker").iterator();
        while (it.hasNext()) {
            C2578Ghr c2578Ghr = (C2578Ghr) it.next();
            String A0v = c2578Ghr.A0v();
            if ("TWO_OPTION_COMBINED".equals(A0v) || "IG_TWO_OPTION_COMBINED".equals(A0v) || "TWO_OPTION_COMBINED_V2".equals(A0v)) {
                return c2578Ghr;
            }
        }
        throw AnonymousClass001.A0L("Do not call this method if you haven't validated data exists");
    }

    public static ImmutableList A01(2JX r301, int i, boolean z) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            ImmutableList A2K = r301.A2K(-892168674, 333599975);
            if (i3 >= A2K.size()) {
                return builder.build();
            }
            boolean A1Q = AnonymousClass001.A1Q(i, i3);
            if (z) {
                A1Q = false;
            }
            builder.m11011add((Object) new ViewerPollVoteResult(i3, ((TreeJNI) A2K.get(i3)).getIntValue(2082975610) + (A1Q ? 1 : 0)));
            i2 = i3 + 1;
        }
    }

    public static void A02(View view, float f) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.weight = f;
        view.setLayoutParams(layoutParams);
    }
}
