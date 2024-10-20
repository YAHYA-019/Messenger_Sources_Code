package com.facebook.messaging.highlightstab.utils;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.9gM;
import X.JtB;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function2;

/* loaded from: HighlightsTabE2EEUtil$sendTextMessageWithXMA$1.class */
public final class HighlightsTabE2EEUtil$sendTextMessageWithXMA$1 extends 0DO implements Function2 {
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ HighlightsFeedContent $feedContent;
    public final /* synthetic */ SettableFuture $future;
    public final /* synthetic */ String $sendAttribution;
    public final /* synthetic */ ThreadKey $tamThreadKey;
    public final /* synthetic */ JtB $xmaParams;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ 9gM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightsTabE2EEUtil$sendTextMessageWithXMA$1(FbUserSession fbUserSession, JtB jtB, HighlightsFeedContent highlightsFeedContent, 9gM r305, ThreadKey threadKey, SettableFuture settableFuture, String str, 0DR r309) {
        super(2, r309);
        this.$future = settableFuture;
        this.this$0 = r305;
        this.$xmaParams = jtB;
        this.$feedContent = highlightsFeedContent;
        this.$fbUserSession = fbUserSession;
        this.$sendAttribution = str;
        this.$tamThreadKey = threadKey;
    }

    public final 0DR create(Object obj, 0DR r303) {
        SettableFuture settableFuture = this.$future;
        9gM r0 = this.this$0;
        JtB jtB = this.$xmaParams;
        HighlightsFeedContent highlightsFeedContent = this.$feedContent;
        HighlightsTabE2EEUtil$sendTextMessageWithXMA$1 highlightsTabE2EEUtil$sendTextMessageWithXMA$1 = new HighlightsTabE2EEUtil$sendTextMessageWithXMA$1(this.$fbUserSession, jtB, highlightsFeedContent, r0, this.$tamThreadKey, settableFuture, this.$sendAttribution, r303);
        highlightsTabE2EEUtil$sendTextMessageWithXMA$1.L$0 = obj;
        return highlightsTabE2EEUtil$sendTextMessageWithXMA$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0092, code lost:
    
        if (r0.equals(X.C5by.A03) != true) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Type inference failed for: r0v154, types: [X.4cZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.highlightstab.utils.HighlightsTabE2EEUtil$sendTextMessageWithXMA$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
