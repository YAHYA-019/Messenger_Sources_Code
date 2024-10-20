package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.chatheads.service.ChatHeadService;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.81k, reason: invalid class name */
/* loaded from: 81k.class */
public final /* synthetic */ class C81k implements Runnable {
    public static final String __redex_internal_original_name = "ChatHeadService$4$$ExternalSyntheticLambda0";
    public final /* synthetic */ 9aG A00;

    @Override // java.lang.Runnable
    public final void run() {
        ChatHeadService chatHeadService = this.A00.A00;
        ImmutableSet immutableSet = ChatHeadService.A10;
        0fH.A0j(AnonymousClass000.A00(ActionId.APP_FIRST_VIEW_CONTROLLER), "maybeStartChatHeadForegroundActivity");
        if (chatHeadService.A0b.A0M()) {
            return;
        }
        ChatHeadService.A0n(chatHeadService);
    }
}
