package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.chatheads.service.ChatHeadService;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.SettableFuture;
import org.json.JSONObject;

/* loaded from: D4c.class */
public final class D4c implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public D4c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A05 = obj4;
        this.A06 = str;
        this.A03 = obj2;
        this.A02 = obj;
        this.A04 = obj5;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                ImmutableSet immutableSet = ChatHeadService.A10;
                0fH.A0j("ChatHeadService", "resolvedThreadType failure");
                ChatHeadService chatHeadService = (ChatHeadService) this.A01;
                ChatHeadService.A0P((Intent) this.A03, (FbUserSession) this.A02, chatHeadService, this.A06);
                chatHeadService.A08 = false;
                return;
            case 1:
                11T.A0F(th, 0);
                0fH.A0r(7zK.A00(183), 7zK.A00(231), th);
                return;
            case 2:
                0fH.A0o("BusinessInboxPagesBanUserMutationHelper", "Business inbox ban action graphql mutation failed.");
                CbV cbV = (CbV) this.A01;
                cbV.A05.A02("Business inbox ban action graphql mutation failed.");
                User A00 = ((C8b) ((C00i) this.A03).get()).A00(((User) this.A05).A0k);
                if (A00 == null || this.A06.equals("BAN") != A00.A1p) {
                    return;
                }
                cbV.A01((FbUserSession) this.A02, (ThreadSummary) this.A04, A00);
                AbN.A1Q(AbF.A0v(cbV.A03), 2131957337);
                return;
            default:
                0fH.A0r(B9s.__redex_internal_original_name, "Failed to find thread key", th);
                ((1FX) this.A05).set(CP4.error(25, "Could not resolve thread key"));
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ThreadSummary threadSummary;
        Message message;
        switch (this.A00) {
            case 0:
                DLB dlb = (DLB) obj;
                if (dlb != null && "AdvancedCrypto".equals(dlb.A02)) {
                    5P7 r0 = (5P7) this.A04;
                    Object obj2 = this.A05;
                    ChatHeadService chatHeadService = (ChatHeadService) this.A01;
                    ImmutableSet immutableSet = ChatHeadService.A10;
                    ImmutableList A06 = r0.A06(ImmutableSet.A02(obj2, chatHeadService.A0e.get()));
                    if (A06 != null && !A06.isEmpty() && (threadSummary = (ThreadSummary) A06.get(0)) != null) {
                        ThreadKey threadKey = threadSummary.A0n;
                        0fH.A0g(threadKey == null ? "" : threadKey, "ChatHeadService", "handleActionChatHead, navigateToThread: %s");
                        ChatHeadService.A0O((Intent) this.A03, (FbUserSession) this.A02, chatHeadService, threadKey);
                        return;
                    }
                }
                ChatHeadService chatHeadService2 = (ChatHeadService) this.A01;
                ChatHeadService.A0P((Intent) this.A03, (FbUserSession) this.A02, chatHeadService2, this.A06);
                chatHeadService2.A08 = false;
                return;
            case 1:
                Bqb bqb = (Bqb) obj;
                if (bqb != null && (message = bqb.A00) != null) {
                    A4w.A01((FbUserSession) this.A01, (A4w) this.A05, message, (C5fv) this.A03);
                }
                A4w.A00((FbUserSession) this.A01, (A4w) this.A05, (Message) this.A04, (NavigationTrigger) this.A02, (C5fv) this.A03, this.A06);
                return;
            case 2:
                ((CbV) this.A01).A05.A01();
                return;
            default:
                ThreadKey threadKey2 = (ThreadKey) obj;
                if (threadKey2 == null) {
                    0fH.A0k(B9s.__redex_internal_original_name, "ThreadKeyUtil.resolveThreadKeyFromThreadId returned successfully with null");
                    ((1FX) this.A05).set(CP4.error(25, "Could not resolve thread key"));
                    return;
                } else {
                    0fH.A0d(threadKey2.A0u(), this.A06, B9s.__redex_internal_original_name, "Thread key successfully resolved: %s from threadId param: %s");
                    B9s.A00((Context) this.A02, (FbUserSession) this.A03, threadKey2, (B9s) this.A01, (SettableFuture) this.A05, (JSONObject) this.A04);
                    return;
                }
        }
    }
}
