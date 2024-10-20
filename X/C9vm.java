package X;

import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9vm, reason: invalid class name */
/* loaded from: 9vm.class */
public final class C9vm implements 7yU {
    public final /* synthetic */ Function1 A00;

    public C9vm(Function1 function1) {
        this.A00 = function1;
    }

    public void C49(final Throwable th) {
        0fH.A0r("HighlightsClassicContentLoader", "Data load failed", th);
        this.A00.invoke(new AWs(th) { // from class: X.9vb
            public final Throwable A00;

            {
                this.A00 = th;
            }
        });
    }

    public void C95(8LH r302, HighlightsTabFeedLoaderState highlightsTabFeedLoaderState) {
        List list = r302.A01;
        int size = list != null ? list.size() : 0;
        Integer num = highlightsTabFeedLoaderState.A01;
        0fH.A0j("HighlightsClassicContentLoader", 0Pz.A0E(size, "Data received. ", " items, loaderState: ", num != null ? 9CP.A00(num) : "null"));
        this.A00.invoke(new 8N0(r302, highlightsTabFeedLoaderState));
    }
}
