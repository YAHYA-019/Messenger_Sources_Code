package X;

import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.concurrent.Executor;

/* loaded from: Cxo.class */
public final class Cxo implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public Cxo(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl mailboxFutureImpl;
        Boolean bool;
        MailboxFeature.DbConnectionResolutionCallback A02;
        String str;
        String str2;
        Mailbox mailbox2;
        MailboxFutureImpl mailboxFutureImpl2;
        MailboxNullable A0T;
        MailboxFeature.DbConnectionResolutionCallback A022;
        String str3;
        String str4;
        Executor executor;
        Runnable d5v;
        Mailbox mailbox3;
        MailboxFutureImpl mailboxFutureImpl3;
        MailboxNullable A0T2;
        MailboxFeature.DbConnectionResolutionCallback A023;
        String str5;
        String str6;
        int i;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czm.A02(this, 14);
                str = "MCAMailboxAvatarsInfo";
                str2 = "UpdateAvatarUsabilitySettings";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A02);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czm.A02(this, 25);
                str = "MCAMailboxColorFilterSettings";
                str2 = "UpdateColorFilterSettings";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A02);
                return;
            case 2:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A022 = Czm.A02(this, ActionId.RTMP_STREAM_PREPARED);
                str3 = "MCAMailboxCommunityMessagingSearch";
                str4 = "GetCmUniversalSearchNuxCounter";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 3:
                mailbox3 = (Mailbox) obj;
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                A0T2 = 1BL.A0T();
                A023 = Czm.A02(this, 127);
                str5 = "MCAMailboxForwardRateLimit";
                str6 = "IsUserEligibleForForwardRateLimit";
                i = 1;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, A0T2, 0, i, str5, str6, A023);
                return;
            case 4:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czm.A02(this, 128);
                str = "MCAMailboxForwardRateLimit";
                str2 = "InsertForwardRateLimitTimestamp";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A02);
                return;
            case 5:
                B9S b9s = (B9S) this.A03;
                ((Handler) 1Br.A0B(b9s.A04)).post(new SE8((ThreadKey) this.A02, b9s, (Boolean) obj, this.A01));
                return;
            case 6:
                1qX A0t = 7zL.A0t(obj);
                if (A0t == null || 1qX.A00(A0t) == 0) {
                    executor = (Executor) this.A03;
                    d5v = new D5v((DFN) this.A02);
                } else {
                    Long nullableLong = A0t.mResultSet.getNullableLong(0, 12);
                    6As A00 = 6BJ.A00();
                    A00.A08("cta_id", this.A01);
                    A00.setString("target_id", 4YV.A0u(nullableLong));
                    A00.setString("action_url", 7zP.A0o(A0t, 0));
                    A00.setString(4YT.A00(821), 7zP.A0r(A0t, 0));
                    A00.setString(4YT.A00(52), 7zP.A0i(A0t, 0));
                    A00.setString("message_id", 7zP.A0k(A0t, 0));
                    A00.A08(AnonymousClass000.A00(172), (int) 7zQ.A0F(A0t, 0));
                    A00.setString("native_url", 7zP.A0p(A0t, 0));
                    A00.setString("title", 7zP.A0l(A0t, 0));
                    A00.setString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 7zP.A0m(A0t, 0));
                    A00.setString("thread_key", String.valueOf(7zQ.A0G(A0t, 0)));
                    A00.setString("platform_token", 7zP.A0n(A0t, 0));
                    Integer nullableInteger = A0t.mResultSet.getNullableInteger(0, 14);
                    if (nullableInteger == null) {
                        nullableInteger = 0;
                    }
                    A00.A08("extension_height_type", nullableInteger.intValue());
                    6BJ A03 = A00.A03();
                    executor = (Executor) this.A03;
                    d5v = new D7s(A03, (DFN) this.A02);
                }
                executor.execute(d5v);
                return;
            case 7:
                mailbox = (Mailbox) obj;
                mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                bool = false;
                A02 = Czl.A00(this, 16);
                str = "MCAMailboxPushNotifications";
                str2 = "OptimisticallyUpdateAppSelectorSetting";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, bool, 0, 1, str, str2, A02);
                return;
            case 8:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A022 = Czl.A00(this, 43);
                str3 = "MCAMailboxSearchAiBots";
                str4 = "SearchAiBotResults";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 9:
                mailbox2 = (Mailbox) obj;
                mailboxFutureImpl2 = (MailboxFutureImpl) this.A03;
                A0T = 1BL.A0T();
                A022 = Czl.A00(this, 44);
                str3 = "MCAMailboxSearchAiBots";
                str4 = "SearchNullStateAiPrompts";
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, mailboxFutureImpl2, A0T, 0, 0, str3, str4, A022);
                return;
            case 10:
                MailboxFutureImpl mailboxFutureImpl4 = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T3 = 1BL.A0T();
                Czl A002 = Czl.A00(this, 68);
                C1qL c1qL = 1yC.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl4, A0T3, 0, 0, "MCAMailboxStories", "StorySettingsParticipantList", A002);
                return;
            default:
                mailbox3 = (Mailbox) obj;
                4uZ.A06("MailboxTam", "loadTamClientErrorNotificationsHandleNew", this.A01);
                mailboxFutureImpl3 = (MailboxFutureImpl) this.A03;
                A0T2 = 1BL.A0T();
                A023 = Czl.A00(this, 81);
                str5 = "MCAMailboxTam";
                str6 = "TamClientErrorNotificationsHandleNew";
                i = 1;
                C1qL c1qL2 = 22C.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, mailboxFutureImpl3, A0T2, 0, i, str5, str6, A023);
                return;
        }
    }
}
