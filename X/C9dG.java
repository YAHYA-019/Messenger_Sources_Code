package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.facebook.ui.media.attachments.model.MediaUploadResult;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9dG, reason: invalid class name */
/* loaded from: 9dG.class */
public abstract class C9dG {
    public static final SharedMedia A00(HighlightsAttachmentContent highlightsAttachmentContent, ThreadKey threadKey, 5HP r303, String str, String str2, long j) {
        C5en A00 = C5en.A00();
        A00.A0J = threadKey;
        A00.A0P = r303;
        String str3 = highlightsAttachmentContent.A0B;
        if (str3 != null && str3.length() != 0) {
            try {
                Uri A03 = C0A2.A03(str3);
                if (A03 != null) {
                    A00.A0E = A03;
                }
            } catch (SecurityException unused) {
            }
        }
        Uri uri = null;
        if (r303 == 5HP.A0H && str3 != null) {
            try {
                uri = C0A2.A03(str3);
            } catch (SecurityException unused2) {
            }
        }
        A00.A0D = uri;
        A00.A06 = j;
        Integer num = highlightsAttachmentContent.A00;
        if (num != null) {
            A00.A00 = num.intValue();
        }
        Integer num2 = highlightsAttachmentContent.A03;
        if (num2 != null) {
            A00.A04 = num2.intValue();
        }
        A00.A0R = new MediaUploadResult(highlightsAttachmentContent.A08);
        A00.A08 = highlightsAttachmentContent.A01 != null ? r0.intValue() : 0L;
        return new SharedMedia(4YU.A0Y(A00), str2, 4YU.A0z(threadKey), str);
    }

    public static final void A01(06Z r301, C2k6 c2k6, HighlightsAttachmentContent highlightsAttachmentContent, HighlightsFeedContent highlightsFeedContent, String str, String str2, List list, Function1 function1, long j) {
        5HP r316;
        11T.A0G(c2k6, 0, highlightsAttachmentContent);
        4YV.A1M(list, 6, r301);
        C98S c98s = C98S.A0T;
        Object A01 = 3vP.A01(c2k6, 9G3.A00);
        if (A01 == null) {
            throw 1BK.A0h();
        }
        9O8 r0 = (9O8) A01;
        2R0.A08(c98s, (3Ec) null, r0.A00, highlightsAttachmentContent, r0.A01);
        C96g A00 = 9CR.A00(highlightsAttachmentContent.A02);
        if (A00 != null) {
            int ordinal = A00.ordinal();
            if (ordinal == 1) {
                r316 = 5HP.A0H;
            } else if (ordinal != 3 && ordinal != 2 && ordinal != 0) {
                return;
            } else {
                r316 = 5HP.A0F;
            }
            Long l = highlightsFeedContent.A0M;
            if (l == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            ThreadKey A02 = ((4iI) 7zR.A0o(3vP.A00(c2k6), 67720)).A02(l.longValue());
            if (A02 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            ArrayList A0z = 1BL.A0z(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0z.add(A00((HighlightsAttachmentContent) it.next(), A02, r316, str, str2, j));
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0z);
            SharedMedia A002 = A00(highlightsAttachmentContent, A02, r316, str, str2, j);
            int A022 = r316 == 5HP.A0H ? 7zQ.A0w().A07(9nH.A02, highlightsAttachmentContent.A05).A02() : 0;
            Context A003 = 3vP.A00(c2k6);
            11T.A0D(copyOf);
            9DK.A00(A003, r301, A02, C95o.A02, A002, copyOf, "photo_view_fragment", function1, A022, false, C1ub.A00().AZk(36321636485055058L), false);
        }
    }
}
