package X;

import com.facebook.inject.FbInjector;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.memories.model.MemoryViewModel;

/* renamed from: X.9t5, reason: invalid class name */
/* loaded from: 9t5.class */
public final class C9t5 implements DEe {
    public final 1BP A01 = FbInjector.A00;
    public final 1Br A00 = 1Bq.A00(68110);

    @Override // X.DEe
    public void DAe(C9fs c9fs) {
        int i;
        String str;
        2R0 r318;
        C2xx arg;
        2R0 A00 = ((2Qz) 1Br.A0B(this.A00)).A00(7zL.A09());
        8Ke r0 = (8Ke) c9fs.A04;
        if (r0 != null) {
            long j = c9fs.A03;
            long j2 = c9fs.A02;
            int i2 = c9fs.A01;
            int i3 = c9fs.A00;
            synchronized (A00) {
                Object obj = r0.A0A;
                if (obj instanceof HighlightsFeedContent) {
                    11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.highlightstab.model.HighlightsFeedContent");
                    HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) obj;
                    2R0.A0A(A00, "FeedItemImpression", new C2xx(A00, highlightsFeedContent, r0, i2, i3, 0, j), 0, A00.A05, j2);
                    if (highlightsFeedContent.A05 == C5by.A0A.value) {
                        MemoryViewModel memoryViewModel = (MemoryViewModel) highlightsFeedContent.A0o.getValue();
                        if (memoryViewModel != null) {
                            C9mY.A02((C9mY) 1Br.A0B(A00.A0A), memoryViewModel, Long.valueOf(6), 5, false);
                        }
                    }
                } else {
                    if (obj instanceof C9ci) {
                        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.montage.activetabunit.ActiveTabMontageViewModel");
                        str = "StoryImpression";
                        r318 = A00;
                        arg = new C2xx(A00, (C9ci) obj, r0, i2, i3, 1, j);
                        i = 0;
                    } else if (obj instanceof 9CF) {
                        2R0.A0A(A00, "CustomCardItemImpression", new ARA(1, j, r0, A00), 0, A00.A05, 2R0.A01(A00));
                    } else if (obj instanceof C95j) {
                        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.highlightstab.model.HighlightsViewModelItem.GenericViewModelItem");
                        int ordinal = ((C95j) obj).ordinal();
                        if (ordinal == 0) {
                            i = 13;
                            str = "GenericItemImpression";
                            r318 = A00;
                            arg = new ARG(A00, r0, i2, i3, j);
                        } else if (ordinal == 1) {
                            A00.A0E();
                        } else if (ordinal == 2) {
                            A00.A0F();
                        }
                    }
                    2R0.A0A(r318, str, arg, 0, i, j2);
                }
            }
        }
    }
}
