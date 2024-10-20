package X;

import android.content.Context;
import com.facebook.assistant.stella.ipc.common.model.StellaInboxMessage;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* loaded from: Cbw.class */
public final class Cbw implements 2TV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ B9q A02;
    public final /* synthetic */ SettableFuture A03;

    public Cbw(Context context, FbUserSession fbUserSession, B9q b9q, SettableFuture settableFuture) {
        this.A02 = b9q;
        this.A03 = settableFuture;
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        this.A03.set(CP4.error(22, "Failed to load threads"));
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [com.facebook.assistant.stella.ipc.common.model.StellaInboxMessage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v155, types: [com.facebook.assistant.stella.ipc.common.model.StellaInboxThread, java.lang.Object] */
    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        ThreadsCollection threadsCollection;
        String str;
        String str2;
        2Un r0 = (2Un) obj2;
        if (r0 == null || (threadsCollection = r0.A02) == null) {
            CallerContext callerContext = B9q.A01;
            0fH.A0j(B9q.__redex_internal_original_name, "No threads loaded");
            this.A03.set(CP4.error(22, "Failed to load threads"));
            return;
        }
        CallerContext callerContext2 = B9q.A01;
        0fH.A0j(B9q.__redex_internal_original_name, "Threads loaded");
        ImmutableList immutableList = threadsCollection.A01;
        B9q b9q = this.A02;
        Context context = this.A00;
        FbUserSession fbUserSession = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        1BV A0R = 7zL.A0R(context, 83014);
        int i = 10;
        if (immutableList.size() < 10) {
            0fH.A0h(Integer.valueOf(immutableList.size()), B9q.__redex_internal_original_name, "%d threads returned, changing limit");
            i = immutableList.size();
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                break;
            }
            try {
                ThreadSummary threadSummary = (ThreadSummary) immutableList.get(i3);
                1Du A12 = AbF.A12(threadSummary);
                while (true) {
                    if (!A12.hasNext()) {
                        break;
                    } else if (AbH.A0j(A12).A0I == 1Ks.A02) {
                        0fH.A0j(B9q.__redex_internal_original_name, "Thread is epd sensitive, adding to threadlist.");
                        break;
                    }
                }
                ArrayList A0s2 = AnonymousClass001.A0s();
                ParticipantInfo participantInfo = threadSummary.A0i;
                String str3 = "";
                if (participantInfo != null) {
                    str = participantInfo.A09.A00;
                    str2 = participantInfo.A00();
                } else {
                    str = str3;
                    str2 = str3;
                }
                String str4 = threadSummary.A2A;
                String str5 = ((1G1) fbUserSession).A05;
                if (str == null) {
                    str = str3;
                }
                if (str2 == null) {
                    str2 = str3;
                }
                long j = threadSummary.A0N;
                if (str4 != null) {
                    str3 = str4;
                }
                ?? obj3 = new Object();
                obj3.mid = ConstantsKt.CAMERA_ID_BACK;
                obj3.prevMid = null;
                obj3.type = "text";
                obj3.senderName = str;
                obj3.senderId = str2;
                obj3.timestamp = j;
                obj3.content = str3;
                obj3.isAdminMessage = false;
                obj3.adminMessageContentSubTypeId = 0;
                obj3.attachments = null;
                obj3.messageDelivery = null;
                A0s2.add(obj3);
                ImmutableList A00 = ((C7H) A0R.get()).A00(fbUserSession, threadSummary);
                ThreadKey threadKey = threadSummary.A0n;
                String A0y = 4YU.A0y(threadKey);
                String str6 = threadSummary.A20;
                StellaInboxMessage[] stellaInboxMessageArr = (StellaInboxMessage[]) A0s2.toArray(new StellaInboxMessage[0]);
                A0R.get().getClass();
                String[] A1b = 1BK.A1b((AbstractCollection) A00.get(0), 0);
                A0R.get().getClass();
                String[] A1b2 = 1BK.A1b((AbstractCollection) A00.get(1), 0);
                boolean A15 = threadKey.A15();
                boolean A122 = threadKey.A12();
                long j2 = threadSummary.A0O;
                ?? obj4 = new Object();
                obj4.threadId = A0y;
                obj4.threadName = str6;
                obj4.messageList = stellaInboxMessageArr;
                obj4.participantIds = A1b;
                obj4.participantNames = A1b2;
                obj4.isE2ee = A122;
                obj4.isGroup = A15;
                obj4.isMuted = false;
                obj4.viewerId = str5;
                obj4.unreadCount = j2;
                A0s.add(obj4);
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                0fH.A0r(B9q.__redex_internal_original_name, "Thread index out of bounds, stopping processing", e);
            }
        }
        0fH.A0g(1BK.A0k(A0s), B9q.__redex_internal_original_name, "Parsed %d threads");
        try {
            this.A03.set(CP4.success(AbG.A0x(b9q.A00).A0W(A0s)));
        } catch (IOException e2) {
            0fH.A0s(B9q.__redex_internal_original_name, "Failed to convert threads to JSON string", e2);
            this.A03.set(CP4.error(22, "Failed to load threads"));
        }
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
    }
}
