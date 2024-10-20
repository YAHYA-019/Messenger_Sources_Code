package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function1;

/* loaded from: ASh.class */
public final class ASh extends C00q implements Function1 {
    public static final ASh A00 = new ASh();

    public ASh() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) obj;
        11T.A0F(highlightsFeedContent, 0);
        return Boolean.valueOf(AnonymousClass001.A1Q(highlightsFeedContent.A05, C5by.A0B.value));
    }
}
