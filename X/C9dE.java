package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;

/* renamed from: X.9dE, reason: invalid class name */
/* loaded from: 9dE.class */
public abstract class C9dE {
    public static final boolean A00(HighlightsFeedContent highlightsFeedContent) {
        11T.A0F(highlightsFeedContent, 0);
        if (A01(highlightsFeedContent)) {
            return false;
        }
        int i = highlightsFeedContent.A05;
        return i == C5by.A03.value || i == C5by.A06.value;
    }

    public static final boolean A01(HighlightsFeedContent highlightsFeedContent) {
        String str = highlightsFeedContent.A0P;
        boolean z = false;
        if (11T.A0O(str, "INJECTED_MULTI_MEDIA_FEED_CONTENT_ID") || 0CV.A0b(str, "INJECTED_FEED_CONTENT_ID_", false)) {
            z = true;
        }
        return z;
    }
}
