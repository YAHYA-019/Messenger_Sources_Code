package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.folders.FolderCounts;
import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.GroupPollingInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.MontageThreadPreview;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadUpdate;
import com.facebook.messaging.service.model.DeleteMessagesResult;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.messaging.service.model.NewMessageResult;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;

/* renamed from: X.4z1, reason: invalid class name */
/* loaded from: 4z1.class */
public final class C4z1 implements CallerContextable {
    public static final String __redex_internal_original_name = "CacheInsertThreadsHandler";
    public 1BY A00;
    public final FbUserSession A01;
    public final 2fI A04;
    public final C00i A05 = new 1BV((1BY) null, 65933);
    public final 1Uv A03 = (1Uv) 1Bi.A03(16688);
    public final C1q7 A06 = (C1q7) 1Bi.A03(16822);
    public final C00i A02 = new 1BQ(49476);

    public C4z1(FbUserSession fbUserSession, 1BO r303, 2fI r304) {
        this.A00 = new 1BY(r303);
        this.A04 = r304;
        this.A01 = fbUserSession;
    }

    public void A00(FolderCounts folderCounts, 1F9 r303) {
        this.A04.A0b(folderCounts, r303);
        1Uv r0 = this.A03;
        Intent A0A = 4YU.A0A(1BJ.A00(ActionId.DISPLAYED));
        A0A.putExtra("folder_name", r303.toString());
        1Uv.A02(A0A, r0);
    }

    public void A01(1F9 r302) {
        2fI r0 = this.A04;
        2fL A00 = r0.A0E.A00();
        try {
            4dO A01 = 2fI.A01(r0, r302);
            if (A01 != null) {
                A01.A06.A01();
                A01.A04 = false;
                2fJ r02 = r0.A0F;
                1F9 r03 = A01.A07;
                synchronized (r02) {
                    if (r03 != null) {
                        if (2fJ.A05(r02) && r03 == 1F9.A0I && 2fJ.A06(r02)) {
                            2fJ.A03(2fJ.A01((3Kb) null, r02, (ThreadKey) null, "markThreadListStaleForFolderInCache", r03.toString()), r02);
                        }
                    }
                }
            }
            if (A00 != null) {
                A00.close();
            }
        } catch (Throwable th) {
            if (A00 != null) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void A02(1F9 r302, DeleteMessagesResult deleteMessagesResult) {
        ThreadKey threadKey = deleteMessagesResult.A00;
        if (threadKey != null) {
            2fI r0 = this.A04;
            r0.BFC(threadKey);
            ImmutableSet immutableSet = deleteMessagesResult.A03;
            1Uv r02 = this.A03;
            ImmutableSet immutableSet2 = deleteMessagesResult.A04;
            Intent A0A = 4YU.A0A("MEDIA_UPLOAD_CACHE_PURGE");
            A0A.putStringArrayListExtra("media_fbids", 1BK.A17(immutableSet2));
            1Uv.A02(A0A, r02);
            2fL A00 = r0.A0E.A00();
            try {
                2fI.A0J(r0.A0A, r0, r0.BFC(threadKey), threadKey, immutableSet);
                2fI.A0J(r0.A0B, r0, r0.BFD(threadKey), threadKey, immutableSet);
                if (A00 != null) {
                    A00.close();
                }
                if (deleteMessagesResult.A05) {
                    A03(r302, ImmutableList.of((Object) threadKey));
                    return;
                }
                ThreadSummary threadSummary = deleteMessagesResult.A01;
                if (threadSummary != null) {
                    r0.A0h(threadSummary);
                }
            } catch (Throwable th) {
                if (A00 != null) {
                    try {
                        A00.close();
                        throw th;
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public void A03(1F9 r302, ImmutableList immutableList) {
        this.A04.A0d(r302, immutableList);
        if (immutableList.isEmpty()) {
            return;
        }
        this.A03.A0C(this.A01, immutableList, __redex_internal_original_name);
    }

    public void A04(ThreadKey threadKey) {
        2fI r0 = this.A04;
        if (threadKey != null) {
            2fI.A0R(r0, threadKey);
            2fL A00 = r0.A0E.A00();
            try {
                2fI.A0S(r0, threadKey);
                0QO r02 = r0.A02;
                int size = r02.size();
                for (int i = 0; i < size; i++) {
                    2fI.A0N(r0, (1F9) r02.A04(i), (ThreadKey) null, threadKey);
                }
                0QO r03 = r0.A01;
                int size2 = r03.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    2fI.A0N(r0, (1F9) null, (ThreadKey) r03.A04(i2), threadKey);
                }
                if (A00 != null) {
                    A00.close();
                }
            } catch (Throwable th) {
                if (A00 != null) {
                    try {
                        A00.close();
                        throw th;
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public void A05(ThreadKey threadKey, long j, long j2) {
        2fI r0 = this.A04;
        2fL A00 = r0.A0E.A00();
        try {
            2fI.A0R(r0, threadKey);
            ThreadSummary BFL = r0.BFL(threadKey);
            if (BFL != null && j >= BFL.A0N) {
                C1zm c1zm = new C1zm(BFL);
                c1zm.A0L = j2;
                c1zm.A0C = j;
                c1zm.A0O = 0L;
                ThreadSummary threadSummary = new ThreadSummary(c1zm);
                2fI.A0O(r0, threadSummary.A0g, threadSummary.A0l, threadSummary);
            }
            if (A00 != null) {
                A00.close();
            }
        } catch (Throwable th) {
            if (A00 != null) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void A06(ThreadKey threadKey, ImmutableList immutableList, boolean z) {
        2fI r0 = this.A04;
        2fL A00 = r0.A0E.A00();
        try {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                MessageRepliedTo messageRepliedTo = null;
                Message Awq = r0.Awq((ThreadKey) null, AnonymousClass001.A0i(it));
                if (Awq != null) {
                    ThreadKey threadKey2 = Awq.A0V;
                    if (threadKey2 != null) {
                        MessagesCollection BFC = r0.BFC(threadKey2);
                        if (BFC != null) {
                            int indexOf = BFC.A01.indexOf(Awq);
                            if (indexOf != -1) {
                                if (z) {
                                    6B1 r02 = new 6B1();
                                    r02.A0C = "DELETED";
                                    MessageRepliedTo messageRepliedTo2 = Awq.A0F;
                                    r02.A05 = messageRepliedTo2 != null ? messageRepliedTo2.A05 : C63c.A03;
                                    new MessageRepliedTo(r02);
                                }
                                5PI r03 = new 5PI(Awq);
                                r03.A0F = messageRepliedTo;
                                r0.A0A.A06(2fI.A08(4YU.A0U(r03), BFC, indexOf), (User) 1Bn.A0E((Context) null, r0.A00, 83430), false, false);
                            }
                        }
                    }
                }
            }
            if (A00 != null) {
                A00.close();
            }
            this.A03.A0A(this.A01, threadKey, __redex_internal_original_name);
        } catch (Throwable th) {
            if (A00 != null) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void A07(ThreadSummary threadSummary) {
        this.A04.A0h(threadSummary);
    }

    public void A08(ThreadUpdate threadUpdate, int i, boolean z, boolean z2) {
        if (!z) {
            ((23F) 1Lo.A04((Context) null, this.A01, this.A00, 33102)).A03(threadUpdate.A03);
        }
        1Uu r0 = (1Uu) this.A05.get();
        FbUserSession fbUserSession = this.A01;
        r0.A01(fbUserSession, threadUpdate);
        ThreadSummary threadSummary = threadUpdate.A02;
        if (threadSummary != null) {
            2fI r02 = this.A04;
            r02.A0h(threadSummary);
            if (i > 0) {
                MessagesCollection messagesCollection = threadUpdate.A01;
                messagesCollection.getClass();
                2fI.A0M(r02.A0A, r02, messagesCollection, false);
            }
            if (threadSummary.A0g == 1F9.A0M) {
                2fL A00 = r02.A0E.A00();
                MontageThreadPreview montageThreadPreview = null;
                try {
                    1BY r03 = r02.A00;
                    String str = (String) 1Bn.A0E((Context) null, r03, 83433);
                    if (str != null) {
                        ImmutableList immutableList = threadSummary.A1L;
                        if (immutableList.size() == 2) {
                            ParticipantInfo participantInfo = threadSummary.A0i;
                            if (participantInfo == null || !str.equals(participantInfo.A00())) {
                                String A03 = C28p.A03((ThreadParticipant) 1BK.A0r(immutableList));
                                String A032 = C28p.A03((ThreadParticipant) immutableList.get(1));
                                String str2 = (String) 1Bn.A0E((Context) null, r03, 83433);
                                if (str2 != null && A03 != null && A032 != null) {
                                    boolean equals = str2.equals(A03);
                                    if (!equals || str2.equals(A032)) {
                                        if (str2.equals(A032) && !equals) {
                                            A032 = A03;
                                        }
                                    }
                                    ThreadSummary BFL = r02.BFL(4YV.A0R(A032, str));
                                    if (BFL != null) {
                                        MessagesCollection messagesCollection2 = threadUpdate.A01;
                                        if (messagesCollection2 != null) {
                                            montageThreadPreview = ((60V) r02.A08.get()).A09(messagesCollection2.A01);
                                        }
                                        C1zm c1zm = new C1zm(BFL);
                                        c1zm.A0k = threadSummary.A0n;
                                        c1zm.A0s = montageThreadPreview;
                                        ThreadSummary threadSummary2 = new ThreadSummary(c1zm);
                                        2fI.A0O(r02, threadSummary2.A0g, threadSummary2.A0l, threadSummary2);
                                    }
                                }
                                C01s A09 = 1BK.A09(r02.A04);
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("Got a null other user for thread key ");
                                A0k.append(threadSummary.A0n);
                                A0k.append(" with participants ");
                                1BK.A1R(A0k, immutableList);
                                A09.D0v("montage-null-other-user-id", A0k.toString());
                            }
                        }
                    }
                    if (A00 != null) {
                        A00.close();
                    }
                } catch (Throwable th) {
                    if (A00 != null) {
                        try {
                            A00.close();
                            throw th;
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            Bundle A05 = 1BK.A05();
            if (z2) {
                A05.putSerializable("broadcast_cause", 54N.A01);
            }
            this.A03.A09(A05, fbUserSession, threadSummary.A0n, __redex_internal_original_name);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(com.facebook.messaging.service.model.FetchThreadListResult r302) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4z1.A09(com.facebook.messaging.service.model.FetchThreadListResult):void");
    }

    public void A0A(FetchThreadResult fetchThreadResult) {
        ThreadSummary threadSummary = fetchThreadResult.A05;
        threadSummary.getClass();
        MessagesCollection messagesCollection = fetchThreadResult.A03;
        messagesCollection.getClass();
        ImmutableList immutableList = fetchThreadResult.A07;
        if (immutableList != null) {
            ((23F) 1Lo.A04((Context) null, this.A01, this.A00, 33102)).A03(immutableList);
        }
        2fI r0 = this.A04;
        r0.A0h(threadSummary);
        2fL A00 = r0.A0E.A00();
        try {
            ThreadKey threadKey = threadSummary.A0n;
            2fI.A0R(r0, threadKey);
            2fM r02 = r0.A0C;
            r02.A04.A01();
            LiveData liveData = (LiveData) r02.A02.get(threadKey);
            if (liveData == null || liveData.getValue() == null) {
                2fI.A0M(r0.A0A, r0, messagesCollection, false);
            } else {
                2fI.A0Q(r0, (Message) messagesCollection.A01.get(0), messagesCollection, C7tn.A02, 0S2.A00, -1);
            }
            if (A00 != null) {
                A00.close();
            }
            this.A03.A0A(this.A01, threadKey, __redex_internal_original_name);
        } catch (Throwable th) {
            if (A00 != null) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void A0B(FetchThreadResult fetchThreadResult, int i, boolean z) {
        A08(new ThreadUpdate(fetchThreadResult.A03, fetchThreadResult.A05, fetchThreadResult.A07, null, fetchThreadResult.A01), i, z, true);
    }

    public void A0C(NewMessageResult newMessageResult, long j) {
        A0D(newMessageResult, C7tn.A02, j);
    }

    public void A0D(NewMessageResult newMessageResult, C7tn c7tn, long j) {
        java.util.Map map;
        Number A0o;
        Message message = newMessageResult.A00;
        this.A04.A0e(message, newMessageResult.A01, c7tn, j);
        FbUserSession fbUserSession = this.A01;
        1BY r0 = this.A00;
        7GD r02 = (7GD) 1Lo.A04((Context) null, fbUserSession, r0, 67133);
        if (!C1q7.A0X(message)) {
            ParticipantInfo participantInfo = message.A0K;
            participantInfo.getClass();
            UserKey userKey = participantInfo.A0F;
            long j2 = message.A05;
            if (userKey != null && ((A0o = 1BK.A0o(userKey, (map = r02.A00))) == null || A0o.longValue() < j2)) {
                AnonymousClass001.A18(userKey, j2, map);
            }
            1Uv r03 = this.A03;
            r03.A06();
            ThreadSummary threadSummary = newMessageResult.A02;
            if (threadSummary != null && threadSummary.A0g == 1F9.A0M) {
                r03.A07();
            }
        }
        if (C1q7.A0j(message)) {
            GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
            genericAdminMessageInfo.getClass();
            GenericAdminMessageExtensibleData genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E;
            if (genericAdminMessageExtensibleData == null) {
                genericAdminMessageExtensibleData = null;
            }
            GroupPollingInfoProperties groupPollingInfoProperties = (GroupPollingInfoProperties) genericAdminMessageExtensibleData;
            if (groupPollingInfoProperties != null) {
                BgL bgL = (BgL) 1Lo.A04((Context) null, fbUserSession, r0, 84696);
                String str = groupPollingInfoProperties.A02;
                synchronized (bgL) {
                    bgL.A00.remove(str);
                }
            }
        }
    }

    public void A0E(Collection collection) {
        ((23F) 1Lo.A04((Context) null, this.A01, this.A00, 33102)).A03(collection);
    }
}
