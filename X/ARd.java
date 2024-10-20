package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* loaded from: ARd.class */
public final class ARd extends C00q implements Function1 {
    public final /* synthetic */ Context $androidContext;
    public final /* synthetic */ String $emojiString;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $fromEmojiPicker;
    public final /* synthetic */ Aaj $highlightsContentListener;
    public final /* synthetic */ HighlightsFeedContent $highlightsFeedContent;
    public final /* synthetic */ 2Qz $highlightsLoggerScopedProvider;
    public final /* synthetic */ AaX $highlightsTabComposerListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARd(Context context, FbUserSession fbUserSession, Aaj aaj, 2Qz r305, HighlightsFeedContent highlightsFeedContent, AaX aaX, String str, boolean z) {
        super(1);
        this.$highlightsContentListener = aaj;
        this.$androidContext = context;
        this.$highlightsFeedContent = highlightsFeedContent;
        this.$emojiString = str;
        this.$highlightsTabComposerListener = aaX;
        this.$highlightsLoggerScopedProvider = r305;
        this.$fromEmojiPicker = z;
        this.$fbUserSession = fbUserSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ThreadKey threadKey = (ThreadKey) obj;
        11T.A0F(threadKey, 0);
        this.$highlightsContentListener.Bvr(this.$androidContext, this.$highlightsFeedContent, this.$highlightsTabComposerListener, threadKey, this.$emojiString);
        this.$highlightsLoggerScopedProvider.A00(this.$androidContext).A0Q(this.$highlightsFeedContent);
        HighlightsFeedContent highlightsFeedContent = this.$highlightsFeedContent;
        int i = highlightsFeedContent.A05;
        if (i == C5by.A0C.value) {
            FbUserSession fbUserSession = this.$fbUserSession;
            Context context = this.$androidContext;
            String str = 9eQ.A00;
            ((C03513yC) 1Lm.A05(context, fbUserSession, 68395)).A07(EnumC03533yL.HIGHLIGHTS_TAB, 14);
        } else if (i == C5by.A0A.value) {
            String str2 = 9eQ.A00;
            MemoryViewModel memoryViewModel = (MemoryViewModel) highlightsFeedContent.A0o.getValue();
            if (memoryViewModel != null) {
                C9mY.A02(7zQ.A0i(), memoryViewModel, Long.valueOf(6), 7, false);
            }
        }
        return 04S.A00;
    }
}
