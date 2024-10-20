package X;

import com.facebook.messaging.highlightstab.model.HighlightsReplyMessageContent;

/* renamed from: X.9vt, reason: invalid class name */
/* loaded from: 9vt.class */
public final class C9vt implements AXt {
    public static final C9vt A00 = new C9vt();

    /* JADX WARN: Type inference failed for: r0v11, types: [X.5fq, X.5qu] */
    @Override // X.AXt
    public final C5fv A4m(HighlightsReplyMessageContent highlightsReplyMessageContent) {
        String str;
        String str2 = highlightsReplyMessageContent.A0M;
        5gC r304 = null;
        if (str2 != null && (str = highlightsReplyMessageContent.A0L) != null && str.length() != 0) {
            ?? c5fq = new C5fq();
            c5fq.A09 = str2;
            c5fq.A02 = str;
            r304 = new 5gC((C5qu) c5fq);
        }
        return r304;
    }
}
