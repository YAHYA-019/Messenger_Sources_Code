package X;

import android.text.TextUtils;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.messaging.montage.forked.viewer.model.StoryCardTextModel;

/* loaded from: F1z.class */
public abstract class F1z {
    public static Integer A00(GL2 gl2) {
        if (gl2 != null) {
            if (gl2.Ats() != null) {
                return 0S2.A0u;
            }
            Hsm Avt = gl2.Avt();
            if (Avt != null && DKC.A1Y(Avt.A08)) {
                return 0S2.A01;
            }
            StoryCardTextModel BEu = gl2.BEu();
            if (BEu != null && BEu.A04) {
                return 0S2.A0N;
            }
            StoryCardTextModel BEu2 = gl2.BEu();
            if (BEu2 != null && BEu2.A00 != null) {
                return 0S2.A0Y;
            }
            2JY r0 = (GLo) ((IXN) gl2).A06.get();
            if (r0 != null) {
                1Du A0v = AbI.A0v(r0, 2JX.class, -738997328, 906223158);
                while (A0v.hasNext()) {
                    2JY A0P = 7zL.A0P(A0v);
                    if (A0P.A0L(-880905839, 2JX.class, 37170545) != null && A0P.A0e(GraphQLStoryAttachmentStyle.A1G, 139866732).contains(GraphQLStoryAttachmentStyle.A04)) {
                        return 0S2.A0j;
                    }
                }
            }
            if (gl2.Avt() != null) {
                return 0S2.A00;
            }
        }
        return 0S2.A1J;
    }

    public static Integer A01(GL2 gl2) {
        if (gl2.Ats() != null) {
            return 0S2.A0u;
        }
        StoryCardTextModel BEu = gl2.BEu();
        if (BEu == null || !BEu.A04) {
            StoryCardTextModel BEu2 = gl2.BEu();
            if (BEu2 != null && BEu2.A00 != null) {
                return 0S2.A0Y;
            }
            if (gl2.Avt() != null) {
                if (!TextUtils.isEmpty(gl2.Avt().A08)) {
                    return 0S2.A01;
                }
                if (!TextUtils.isEmpty(gl2.Avt().A03)) {
                    return 0S2.A15;
                }
                if (TextUtils.isEmpty(gl2.Avt().A04)) {
                    throw AnonymousClass001.A0N("Can't find media type");
                }
                return 0S2.A00;
            }
        }
        return 0S2.A0N;
    }
}
