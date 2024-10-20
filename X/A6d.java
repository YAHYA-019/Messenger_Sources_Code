package X;

import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6d.class */
public final class A6d implements 6xM {
    public HashSet A00 = null;
    public boolean A01;
    public final HighlightsFeedContent A02;

    public A6d(HighlightsFeedContent highlightsFeedContent) {
        this.A02 = highlightsFeedContent;
    }

    public static void A00(A6d a6d) {
        if (a6d.A01) {
            return;
        }
        a6d.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{7BB.class, A5n.class, 7Af.class, 7Cb.class, 7C8.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "HighlightsTabComposerLoggingPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        MemoryViewModel memoryViewModel;
        2R0 A00;
        Integer num;
        Integer num2;
        if (r305 instanceof 7C8) {
            A00(this);
            11T.A0F(r304, 0);
            0fH.A0j("HighlightsTabComposerLoggingPlugin", 4YT.A00(778));
            A00 = 7zQ.A0g().A00(r304.A00);
            num = 0S2.A01;
        } else if (r305 instanceof 7Cb) {
            A00(this);
            11T.A0F(r304, 0);
            0fH.A0j("HighlightsTabComposerLoggingPlugin", 4YT.A00(777));
            A00 = 7zQ.A0g().A00(r304.A00);
            num = 0S2.A0N;
        } else {
            if (r305 instanceof A5n) {
                A00(this);
                A5n a5n = (A5n) r305;
                11T.A0H(r304, a5n);
                0fH.A0j("HighlightsTabComposerLoggingPlugin", "SuggestedMessageClickEvent");
                A00 = 7zQ.A0g().A00(r304.A00);
                num = 0S2.A0C;
                num2 = a5n.A00;
                A00.A0S(num, num2);
            }
            if (!(r305 instanceof 7BB)) {
                if (r305 instanceof 7Af) {
                    A00(this);
                    HighlightsFeedContent highlightsFeedContent = this.A02;
                    11T.A0F(r304, 0);
                    0fH.A0j("HighlightsTabComposerLoggingPlugin", "HighlightsTabSendClickEvent");
                    2Qz A0g = 7zQ.A0g();
                    Context context = r304.A00;
                    2R0.A08(C98S.A0M, 3Ec.A05, A0g.A00(context), (HighlightsAttachmentContent) null, highlightsFeedContent);
                    int i = highlightsFeedContent.A05;
                    if (i == C5by.A0C.value) {
                        ((C03513yC) 1Lm.A05(context, 4YV.A0F(context), 68395)).A07(EnumC03533yL.HIGHLIGHTS_TAB, 13);
                        return;
                    } else {
                        if (i != C5by.A0A.value || (memoryViewModel = (MemoryViewModel) highlightsFeedContent.A0o.getValue()) == null) {
                            return;
                        }
                        C9mY.A02(7zQ.A0i(), memoryViewModel, Long.valueOf(6), 7, false);
                        return;
                    }
                }
                return;
            }
            A00(this);
            11T.A0F(r304, 0);
            0fH.A0j("HighlightsTabComposerLoggingPlugin", 4YT.A00(772));
            A00 = 7zQ.A0g().A00(r304.A00);
            num = 0S2.A00;
        }
        num2 = null;
        A00.A0S(num, num2);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(this);
    }
}
