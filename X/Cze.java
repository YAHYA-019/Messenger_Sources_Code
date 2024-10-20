package X;

import android.content.Context;
import com.facebook.messaging.business.bmop.plugins.bmopcomposerlifecycle.BmopComposerLifeCycleImplementation;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: Cze.class */
public final class Cze implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cze(Message message, C5fm c5fm, int i) {
        this.A00 = i;
        if (8 - i != 0) {
            this.A01 = c5fm;
            this.A02 = message;
        } else {
            this.A01 = c5fm;
            this.A02 = message;
        }
    }

    public Cze(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C5fm A00(Cze cze) {
        C5fm c5fm = (C5fm) cze.A01;
        C5fm.A08((Message) cze.A02, c5fm, "send_api_end");
        return c5fm;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1FX r306;
        Object obj2;
        1qW r307;
        C5fm A00;
        String str;
        String str2;
        DHa dHa;
        Object obj3;
        C5fm c5fm;
        String str3;
        String str4;
        Object[] objArr;
        String str5;
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A02, 1BL.A0T(), 0, 0, "MCAMailboxAvatarsInfo", "AvatarsInfoValues", Czm.A02(this, 12));
                return;
            case 1:
                1qX A0t = 7zL.A0t(obj);
                if (A0t != null) {
                    BmopComposerLifeCycleImplementation bmopComposerLifeCycleImplementation = (BmopComposerLifeCycleImplementation) this.A02;
                    6fA r0 = (6fA) this.A01;
                    if (1qX.A00(A0t) > 0) {
                        7zP.A0N(bmopComposerLifeCycleImplementation.A02).Ciz(new D8p(bmopComposerLifeCycleImplementation, r0, A0t.mResultSet.getBoolean(0, 5)));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                11T.A0F(mailboxNullable, 0);
                4YV.A11((1Br) this.A02).execute(new D7m((BEw) mailboxNullable.value, (Function1) this.A01));
                return;
            case 3:
                MailboxNullable mailboxNullable2 = (MailboxNullable) obj;
                if (mailboxNullable2 == null || (obj3 = mailboxNullable2.value) == null || AbM.A04(obj3) <= 0) {
                    return;
                }
                ((C5d3) this.A02).Bys(7zP.A02((1qX) mailboxNullable2.value, 0), ((1qX) mailboxNullable2.value).mResultSet.getBoolean(0, 2), ((1qX) mailboxNullable2.value).mResultSet.getBoolean(0, 4));
                return;
            case 4:
                r306 = (1FX) this.A02;
                obj2 = ((MailboxNullable) obj).value;
                r306.set(obj2);
                return;
            case 5:
                BnY bnY = (BnY) obj;
                Number number = bnY.A01;
                if (number != null) {
                    5PG.A01(number.intValue());
                }
                r306 = (1FX) this.A02;
                r307 = bnY.A00;
                obj2 = 7zL.A0s(r307);
                r306.set(obj2);
                return;
            case 6:
                5PF r02 = (5PF) obj;
                Number number2 = r02.A01;
                if (number2 != null) {
                    5PG.A01(number2.intValue());
                }
                r306 = (1FX) this.A02;
                r307 = r02.A00;
                obj2 = 7zL.A0s(r307);
                r306.set(obj2);
                return;
            case 7:
                1qW r03 = ((AeO) obj).A00;
                if (r03 == null) {
                    r306 = (1FX) this.A02;
                    obj2 = ImmutableList.of();
                    r306.set(obj2);
                    return;
                }
                try {
                    ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(1qX.A00(r03));
                    for (int i = 0; i < 1qX.A00(r03); i++) {
                        C5y4 c5y4 = (C5y4) this.A01;
                        builderWithExpectedSize.m11011add((Object) ((C1ya) 1Lo.A04((Context) null, c5y4.A02, c5y4.A00, 16886)).A00(((1qX) r03).mResultSet.getInteger(i, 47)).A08(new C1yd(r03, i)).A00);
                    }
                    AbG.A1V(builderWithExpectedSize, (SettableFuture) this.A02);
                    return;
                } catch (Exception e) {
                    ((1FX) this.A02).setException(e);
                    return;
                }
            case 8:
                c5fm = (C5fm) this.A01;
                Boolean bool = (Boolean) obj;
                C5fm.A08((Message) this.A02, c5fm, "send_api_end");
                if (bool != null && bool.booleanValue()) {
                    return;
                }
                str3 = "Something's wrong with forwarding message";
                0fH.A0k(1BJ.A00(38), str3);
                C5fm.A0C(c5fm, str3);
                return;
            case 9:
                Bnu bnu = (Bnu) obj;
                A00 = A00(this);
                str = bnu.A01;
                str2 = bnu.A00;
                C5fm.A0D(A00, str, str2);
                return;
            case 10:
                boolean A1V = AnonymousClass001.A1V(obj);
                dHa = (DHa) this.A02;
                if (!A1V) {
                    dHa.BxM();
                    return;
                }
                dHa.COM();
                return;
            case 11:
                c5fm = A00(this);
                if (((BbW) obj).A00 != null) {
                    return;
                }
                str3 = "Something's wrong with forwarding message";
                0fH.A0k(1BJ.A00(38), str3);
                C5fm.A0C(c5fm, str3);
                return;
            case 12:
                c5fm = A00(this);
                if (((BbV) obj).A00 == null) {
                    str3 = "Something's wrong with sharing message";
                    0fH.A0k(1BJ.A00(38), str3);
                    C5fm.A0C(c5fm, str3);
                    return;
                }
                return;
            case 13:
                c5fm = A00(this);
                if (((BbV) obj).A00 == null) {
                    str3 = "Something's wrong with forwarding message with attachment";
                    0fH.A0k(1BJ.A00(38), str3);
                    C5fm.A0C(c5fm, str3);
                    return;
                }
                return;
            case 14:
                Bjl bjl = (Bjl) obj;
                A00 = A00(this);
                str = bjl.A00;
                str2 = bjl.A01;
                C5fm.A0D(A00, str, str2);
                return;
            case 15:
                Bns bns = (Bns) obj;
                A00 = A00(this);
                str = bns.A01;
                str2 = bns.A00;
                C5fm.A0D(A00, str, str2);
                return;
            case 16:
                if (AnonymousClass001.A1V(obj)) {
                    return;
                }
                str4 = "MsysTamMutationService";
                objArr = new Object[]{4YU.A0y((ThreadKey) this.A02)};
                str5 = "Delete thread has failed for threadPk: %s";
                0fH.A14(str4, str5, objArr);
                return;
            case 17:
                if (AnonymousClass001.A1V(obj)) {
                    return;
                }
                str4 = "MsysTamMutationService";
                objArr = new Object[]{4YU.A0y((ThreadKey) this.A02)};
                str5 = "Delete Interop thread has failed for threadPk: %s";
                0fH.A14(str4, str5, objArr);
                return;
            case 18:
                boolean A1V2 = AnonymousClass001.A1V(obj);
                B3r b3r = (B3r) 1Br.A0B(((CNB) this.A02).A01);
                if (!A1V2) {
                    b3r.A05(4YV.A0Z(b3r.A00), "Failed to promote participants as admin in ACT thread");
                    ((DHa) this.A01).BxM();
                    throw AnonymousClass001.A0T("Failed to promote participants as admin in ACT thread");
                }
                b3r.A02(4YV.A0Z(b3r.A00));
                dHa = (DHa) this.A01;
                dHa.COM();
                return;
            case 19:
                boolean A1V3 = AnonymousClass001.A1V(obj);
                B3r b3r2 = (B3r) 1Br.A0B(((CNB) this.A02).A01);
                if (!A1V3) {
                    b3r2.A05(4YV.A0Z(b3r2.A00), "Failed to demote participant from admin in ACT thread");
                    ((DHa) this.A01).BxM();
                    throw AnonymousClass001.A0T("Failed to demote participant from admin in ACT thread");
                }
                b3r2.A02(4YV.A0Z(b3r2.A00));
                dHa = (DHa) this.A01;
                dHa.COM();
                return;
            case 20:
                AbF.A1W(this.A02, obj);
                0fH.A0g(obj, Cbd.__redex_internal_original_name, "Successfully insert media message: %s");
                return;
            case 21:
                MailboxSDKJNI.dispatchVO(22, obj);
                ((MailboxObservableImpl) this.A02).setResult(null);
                return;
            default:
                Mailbox mailbox = (Mailbox) obj;
                String A1D = 7zM.A1D(5Xd.A00, 33);
                NotificationScope A002 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 57);
                7zL.A1O(A002, this.A02, A1D);
                MailboxSecureMessageJNI.dispatchVOO(22, mailbox, A002);
                return;
        }
    }
}
