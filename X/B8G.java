package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.folders.FolderCounts;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadUpdate;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.service.model.AcceptMessageRequestParams;
import com.facebook.messaging.service.model.DeleteMessagesResult;
import com.facebook.messaging.service.model.DeleteThreadsParams;
import com.facebook.messaging.service.model.EditDisplayNameResult;
import com.facebook.messaging.service.model.EditPasswordResult;
import com.facebook.messaging.service.model.EditUsernameResult;
import com.facebook.messaging.service.model.FetchMessagesContextResult;
import com.facebook.messaging.service.model.FetchMoreMessagesParams;
import com.facebook.messaging.service.model.FetchMoreMessagesResult;
import com.facebook.messaging.service.model.FetchMoreRecentMessagesParams;
import com.facebook.messaging.service.model.FetchMoreRecentMessagesResult;
import com.facebook.messaging.service.model.FetchMoreThreadsResult;
import com.facebook.messaging.service.model.FetchThreadByParticipantsResult;
import com.facebook.messaging.service.model.FetchThreadKeyByParticipantsParams;
import com.facebook.messaging.service.model.FetchThreadListResult;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.messaging.service.model.FetchUnreadMessageParams;
import com.facebook.messaging.service.model.FetchUnreadMessageResult;
import com.facebook.messaging.service.model.MarkFolderSeenResult;
import com.facebook.messaging.service.model.MarkThreadFields;
import com.facebook.messaging.service.model.MarkThreadsParams;
import com.facebook.messaging.service.model.SaveDraftParams;
import com.facebook.messaging.service.model.UpdateFolderCountsParams;
import com.facebook.messaging.service.model.UpdateFolderCountsResult;
import com.facebook.messaging.service.model.UpdateVanishModeSelectionResult;
import com.facebook.messaging.service.model.UpdateVanishingModePairedTimestampResult;
import com.facebook.messaging.service.model.virtualfolders.FetchMoreVirtualFolderThreadsParams;
import com.facebook.messaging.service.model.virtualfolders.FetchVirtualFolderThreadsParams;
import com.facebook.messaging.service.model.virtualfolders.FetchVirtualFolderThreadsResult;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: B8G.class */
public final class B8G extends B8I {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final 2fH A0C;
    public final 2fI A0D;
    public final CPa A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;

    public B8G(FbUserSession fbUserSession, 1BO r303, C00i c00i, 2fI r305, CPa cPa, String str) {
        super(str);
        this.A03 = 1BQ.A02(100043);
        this.A05 = 1BV.A01((1BY) null, 84556);
        this.A08 = 1BV.A01((1BY) null, 84558);
        this.A06 = AbH.A0O();
        this.A09 = 1BQ.A02(83015);
        this.A0A = 1BV.A01((1BY) null, 84569);
        this.A0H = 1BV.A01((1BY) null, 33114);
        this.A0F = 1BQ.A02(83443);
        this.A0G = 1BV.A01((1BY) null, 83968);
        this.A07 = 1BQ.A00();
        this.A0I = 1BV.A01((1BY) null, 84553);
        this.A04 = 1BV.A01((1BY) null, 16455);
        this.A0B = 1BQ.A02(32804);
        this.A00 = 7zL.A0Q(r303);
        this.A01 = fbUserSession;
        this.A0D = r305;
        this.A0C = r305.A0D;
        this.A0E = cPa;
        this.A02 = c00i;
    }

    public static D4w A00(CallerContext callerContext, B8G b8g, String str) {
        int i = 67250;
        if (b8g.A0C != 2fH.A01) {
            i = 67571;
        }
        return ((1To) 1Lo.A04((Context) null, b8g.A01, b8g.A00, i)).BZK(callerContext, str);
    }

    private OperationResult A01(1Tu r302, 1TC r303, String str) {
        D4w A00 = A00(r303.A02, this, str);
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchThreadListResult fetchThreadListResult = (FetchThreadListResult) BMQ.A08();
            if (fetchThreadListResult != null) {
                B8I.A0E(this).A0E(fetchThreadListResult.A0A);
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    private OperationResult A02(1Tu r302, 1TC r303, String str) {
        D4w A00 = A00(r303.A02, this, str);
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchMoreThreadsResult fetchMoreThreadsResult = (FetchMoreThreadsResult) BMQ.A08();
            if (fetchMoreThreadsResult != null) {
                ImmutableList immutableList = fetchMoreThreadsResult.A06;
                if (immutableList != null) {
                    B8I.A0E(this).A0E(immutableList);
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0H(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleAcceptMessageRequest");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            if (BMQ.success) {
                AcceptMessageRequestParams acceptMessageRequestParams = (AcceptMessageRequestParams) r303.A00.getParcelable("acceptMessageRequestParams");
                acceptMessageRequestParams.getClass();
                C4z1 A0E = B8I.A0E(this);
                ThreadKey threadKey = acceptMessageRequestParams.A00;
                A0E.A04.A0c(1F9.A0Q, 1F9.A0I, threadKey);
                BMQ = OperationResult.A00;
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0I(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0J(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0K(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleCreateGroup");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchThreadResult A0c = AbM.A0c(BMQ);
            if (A0c != null) {
                ThreadSummary threadSummary = A0c.A05;
                if (threadSummary != null && !ThreadKey.A0o(threadSummary.A0n)) {
                    C4z1 A0E = B8I.A0E(this);
                    this.A0G.get();
                    A0E.A03(1F9.A0I, ImmutableList.of((Object) ThreadKey.A0E(((CreateCustomizableGroupParams) r303.A00.getParcelable("CreateCustomizableGroupParams")).A00)));
                    A0E.A0A(A0c);
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r0.A00 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0L(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8G.A0L(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0M(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleCreateOptimisticGroupThread");
        try {
            B8I.A0E(this).A08((ThreadUpdate) r303.A00.getParcelable("threadUpdate"), 0, false, false);
            OperationResult BMQ = r302.BMQ(r303);
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0N(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0O(1Tu r302, 1TC r303) {
        try {
            D4w A00 = A00(r303.A02, this, "CSH.handleCreateThread");
            try {
                OperationResult BMQ = r302.BMQ(r303);
                B8I.A0E(this).A0A(AbM.A0c(BMQ));
                A00.close();
                return BMQ;
            } finally {
            }
        } catch (BPV e) {
            if (e.failedMessage.A0V != null) {
                C4z1 A0E = B8I.A0E(this);
                A0E.A04.A0f(e.failedMessage, true);
            }
            throw e;
        }
    }

    public OperationResult A0P(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleDeleteMessages");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            DeleteMessagesResult deleteMessagesResult = (DeleteMessagesResult) BMQ.A08();
            ThreadKey threadKey = deleteMessagesResult.A00;
            if (threadKey != null) {
                ThreadSummary BFL = this.A0D.BFL(threadKey);
                if (BFL != null) {
                    C4z1 A0E = B8I.A0E(this);
                    1F9 r0 = BFL.A0g;
                    A0E.A02(r0, deleteMessagesResult);
                    C00i c00i = this.A06;
                    AbF.A0a(c00i).A0K(threadKey, "CacheServiceHandler.handleDeleteMessages", deleteMessagesResult.A03, deleteMessagesResult.A02.values());
                    if (!deleteMessagesResult.A05) {
                        AbF.A0a(c00i).A0A(this.A01, threadKey, "CacheServiceHandler.handleDeleteMessages");
                    }
                    if (r0 == 1F9.A0M) {
                        AbF.A0a(c00i).A07();
                    }
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0Q(1Tu r302, 1TC r303) {
        DeleteThreadsParams deleteThreadsParams = (DeleteThreadsParams) r303.A00.getParcelable("deleteThreadsParams");
        D4w A00 = A00(r303.A02, this, "CSH.handleDeleteThreads");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            C00i c00i = this.A02;
            C4z1 A0h = AbG.A0h(c00i);
            1F9 r0 = 1F9.A0I;
            ImmutableList immutableList = deleteThreadsParams.A00;
            A0h.A03(r0, immutableList);
            AbG.A0h(c00i).A03(1F9.A0Q, immutableList);
            AbG.A0h(c00i).A03(1F9.A0U, immutableList);
            AbJ.A1Q(this.A06);
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0R(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleEditDisplayName");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            EditDisplayNameResult editDisplayNameResult = (EditDisplayNameResult) BMQ.A08();
            User user = (User) 1Bn.A0E((Context) null, this.A00, 83430);
            if (editDisplayNameResult != null) {
                1Kh A0u = AbH.A0u(user);
                A0u.A0R = new Name(editDisplayNameResult.A00, editDisplayNameResult.A01, null);
                User A0w = AbF.A0w(A0u);
                ((1F2) this.A0F.get()).CjY(A0w);
                B8I.A0E(this).A0E(ImmutableList.of((Object) A0w));
                ((AnonymousClass241) this.A0H.get()).A00(A0w.A0k);
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0S(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        EditPasswordResult editPasswordResult = (EditPasswordResult) BMQ.A08();
        User user = (User) 1Bn.A0E((Context) null, this.A00, 83430);
        if (editPasswordResult != null) {
            1Kh A0u = AbH.A0u(user);
            A0u.A2J = editPasswordResult.A00;
            User A0w = AbF.A0w(A0u);
            ((1F2) this.A0F.get()).CjY(A0w);
            B8I.A0E(this).A0E(ImmutableList.of((Object) A0w));
            ((AnonymousClass241) this.A0H.get()).A01(A0w.A0k);
        }
        return BMQ;
    }

    public OperationResult A0T(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleEditUsername");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            EditUsernameResult editUsernameResult = (EditUsernameResult) BMQ.A08();
            User user = (User) 1Bn.A0E((Context) null, this.A00, 83430);
            if (editUsernameResult != null) {
                1Kh A0u = AbH.A0u(user);
                A0u.A1L = editUsernameResult.A00;
                User A0w = AbF.A0w(A0u);
                ((1F2) this.A0F.get()).CjY(A0w);
                B8I.A0E(this).A0E(ImmutableList.of((Object) A0w));
                ((AnonymousClass241) this.A0H.get()).A01(A0w.A0k);
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0U(1Tu r302, 1TC r303) {
        FetchThreadParams fetchThreadParams = (FetchThreadParams) AbG.A07(r303.A00, "fetchThreadParams");
        FetchThreadResult A06 = this.A0E.A06(r303);
        return (FetchThreadResult.A00(fetchThreadParams, A06) || A06 == null) ? r302.BMQ(r303) : B8I.A0D(A06);
    }

    public OperationResult A0V(1Tu r302, 1TC r303) {
        return A01(r302, r303, "CSH.handleFetchFollowUpThreads");
    }

    public OperationResult A0W(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleFetchMessagesContext");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchMessagesContextResult fetchMessagesContextResult = (FetchMessagesContextResult) BMQ.A07();
            2fI r0 = B8I.A0E(this).A04;
            2fI.A0M(r0.A0B, r0, fetchMessagesContextResult.A02, true);
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0X(1Tu r302, 1TC r303) {
        return A02(r302, r303, "CSH.handleFetchMoreFollowUpThreads");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r304v1 */
    /* JADX WARN: Type inference failed for: r304v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r304v12 */
    /* JADX WARN: Type inference failed for: r304v13 */
    /* JADX WARN: Type inference failed for: r304v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r304v17, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r304v18 */
    /* JADX WARN: Type inference failed for: r304v3, types: [com.facebook.messaging.service.model.FetchMoreThreadsResult] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0Y(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8G.A0Y(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0Z(1Tu r302, 1TC r303) {
        return A0Y(r302, r303);
    }

    public OperationResult A0a(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleFetchMoreMessages");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchMoreMessagesResult fetchMoreMessagesResult = (FetchMoreMessagesResult) BMQ.A08();
            if (fetchMoreMessagesResult != null) {
                if (((FetchMoreMessagesParams) AbG.A07(r303.A00, "fetchMoreMessagesParams")).A04) {
                    C4z1 A0E = B8I.A0E(this);
                    MessagesCollection messagesCollection = fetchMoreMessagesResult.A02;
                    2fI r0 = A0E.A04;
                    2fI.A0I(r0.A0B, r0, messagesCollection);
                } else {
                    MessagesCollection messagesCollection2 = fetchMoreMessagesResult.A02;
                    if (messagesCollection2 != null) {
                        2fI r02 = B8I.A0E(this).A04;
                        2fI.A0I(r02.A0A, r02, messagesCollection2);
                    }
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0b(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleFetchMoreRecentMessages");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchMoreRecentMessagesResult fetchMoreRecentMessagesResult = (FetchMoreRecentMessagesResult) BMQ.A08();
            if (fetchMoreRecentMessagesResult != null && ((FetchMoreRecentMessagesParams) AbG.A07(r303.A00, "fetchMoreRecentMessagesParams")).A05) {
                C4z1 A0E = B8I.A0E(this);
                MessagesCollection messagesCollection = fetchMoreRecentMessagesResult.A02;
                2fI r0 = A0E.A04;
                2fI.A0I(r0.A0B, r0, messagesCollection);
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0c(1Tu r302, 1TC r303) {
        return A12(r302, r303);
    }

    public OperationResult A0d(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0e(1Tu r302, 1TC r303) {
        return A02(r302, r303, "CSH.handleFetchMoreUnreadThreads");
    }

    public OperationResult A0f(1Tu r302, 1TC r303) {
        BkZ bkZ = (BkZ) this.A0I.get();
        FbUserSession fbUserSession = this.A01;
        1To r0 = (1To) 1Lo.A04((Context) null, fbUserSession, bkZ.A00, 67250);
        CallerContext callerContext = r303.A02;
        r0.BZG(callerContext, "handleFetchMoreVirtualThreads");
        try {
            FetchMoreVirtualFolderThreadsParams fetchMoreVirtualFolderThreadsParams = (FetchMoreVirtualFolderThreadsParams) r303.A00.getParcelable("fetchMoreVirtualFolderThreadsParamsSpec");
            fetchMoreVirtualFolderThreadsParams.getClass();
            OperationResult BMQ = r302.BMQ(r303);
            FetchVirtualFolderThreadsResult fetchVirtualFolderThreadsResult = (FetchVirtualFolderThreadsResult) BMQ.A07();
            if (!fetchVirtualFolderThreadsResult.A00().A05.asBoolean(false)) {
                Bka bka = (Bka) bkZ.A01.get();
                1Hk r02 = fetchMoreVirtualFolderThreadsParams.A02;
                1BY r03 = bka.A00;
                AbG.A0s(fbUserSession, r03).A03(fetchVirtualFolderThreadsResult.A02);
                2fI r04 = (2fI) 1Lo.A04((Context) null, fbUserSession, r03, 67665);
                2fI.A0F(2fI.A06(r04, r02), r04, fetchVirtualFolderThreadsResult.A01());
            }
            return BMQ;
        } finally {
            r0.D5i(callerContext, "handleFetchMoreVirtualThreads");
        }
    }

    public OperationResult A0g(1Tu r302, 1TC r303) {
        OperationResult BMQ;
        2fL A07;
        Bundle bundle = r303.A00;
        FetchThreadParams fetchThreadParams = (FetchThreadParams) AbG.A07(bundle, "fetchThreadParams");
        ThreadKey A00 = fetchThreadParams.A05.A00();
        AbM.A0J(this.A03).A04(C2rg.A05, AnonymousClass001.A0Z(A00, "fetchThread (CSH). ", AnonymousClass001.A0k()));
        ImmutableList immutableList = fetchThreadParams.A06;
        FbUserSession fbUserSession = this.A01;
        1BY r0 = this.A00;
        2fM th = AbG.A0s(fbUserSession, r0);
        if (immutableList != null && !fetchThreadParams.A09) {
            th.A04(immutableList, true);
        }
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("fetch_location", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
        long currentTimeMillis = System.currentTimeMillis();
        CPa cPa = this.A0E;
        FetchThreadResult A06 = cPa.A06(r303);
        A0u.put("thread_cache_duration", Long.toString(System.currentTimeMillis() - currentTimeMillis));
        Object A0E = 1Bn.A0E((Context) null, r0, 83430);
        try {
            if (A06 == null && A00 != null && A00.A1K()) {
                2fI r02 = cPa.A01;
                A07 = 2fI.A07(r02);
                try {
                    2fM r03 = r02.A0C;
                    r03.A04.A01();
                    boolean contains = r03.A00.contains(A00);
                    if (A07 != null) {
                        A07.close();
                    }
                    if (contains) {
                        User A002 = th.A00(AbJ.A0o(A00));
                        if (A002 != null) {
                            FetchThreadResult fetchThreadResult = FetchThreadResult.A0C;
                            C5pc c5pc = new C5pc();
                            c5pc.A01 = DataFetchDisposition.A0D;
                            c5pc.A06 = ImmutableList.of((Object) A002, A0E);
                            c5pc.A00 = -1;
                            BMQ = B8I.A0D(c5pc.A00());
                            return BMQ;
                        }
                        0fH.A0E(B8G.class, "Null other user when fetching a thread marked as non-existent. This shouldn't happen!");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (A07 != null) {
                        throw th;
                    }
                    throw th;
                }
            }
            if (FetchThreadResult.A00(fetchThreadParams, A06) || A06 == null) {
                th = r303.A02;
                FetchThreadParams fetchThreadParams2 = (FetchThreadParams) AbG.A07(bundle, "fetchThreadParams");
                D4w A003 = A00(th, this, "CSH.handleFetchThread");
                try {
                    BMQ = r302.BMQ(r303);
                    if (BMQ.success) {
                        FetchThreadResult fetchThreadResult2 = (FetchThreadResult) BMQ.A07();
                        if (fetchThreadResult2.A02.A08) {
                            ThreadSummary threadSummary = fetchThreadResult2.A05;
                            if (threadSummary != null) {
                                2fI r04 = this.A0D;
                                ThreadKey threadKey = threadSummary.A0n;
                                ThreadSummary BFL = r04.BFL(threadKey);
                                if (BFL != null) {
                                    long j = threadSummary.A0L;
                                    if (j != -1) {
                                        long j2 = BFL.A0L;
                                        if (j < j2) {
                                            0fH.A0V(Long.valueOf(j2), B8G.class, "handleFetchThread, skip stale thread summary, current: %d, new: %d", Long.valueOf(j));
                                        }
                                    }
                                }
                                if (ThreadKey.A0o(threadKey) && !C2fg.A00(threadKey)) {
                                    MessagesCollection messagesCollection = fetchThreadResult2.A03;
                                    if (messagesCollection != null && messagesCollection.A01.isEmpty()) {
                                        ImmutableList immutableList2 = fetchThreadResult2.A07;
                                        if (immutableList2 != null) {
                                            AbG.A0s(fbUserSession, r0).A03(immutableList2);
                                        }
                                    }
                                }
                            }
                            B8I.A0E(this).A0B(fetchThreadResult2, fetchThreadParams2.A01, fetchThreadParams2.A09);
                        }
                    }
                } finally {
                    A003.close();
                }
            } else {
                A0u.put("fetch_location", "THREAD_CACHE");
                BMQ = B8I.A0D(A06);
            }
            if (BMQ.success) {
                FetchThreadResult fetchThreadResult3 = (FetchThreadResult) BMQ.A07();
                if (A00 != null && A00.A1K()) {
                    th = fetchThreadResult3.A02.A07;
                    if (th == AnonymousClass235.SERVER && fetchThreadResult3.A03 == null && fetchThreadResult3.A05 == null) {
                        2fI r05 = B8I.A0E(this).A04;
                        A07 = 2fI.A07(r05);
                        try {
                            th = r05.A0C;
                            th.A04.A01();
                            th.A00.add(A00);
                            if (A07 != null) {
                                A07.close();
                            }
                        } finally {
                            th = th;
                            if (A07 != null) {
                                A07.close();
                            }
                            throw th;
                        }
                    }
                }
                java.util.Map map = fetchThreadResult3.A00;
                if (map != null) {
                    A0u.putAll(map);
                }
                ((4yK) this.A05.get()).A01(A0u);
                return BMQ;
            }
            return BMQ;
        } catch (Throwable th3) {
            7kF.A00(th, th3);
        }
    }

    public OperationResult A0h(1Tu r302, 1TC r303) {
        CPa cPa = this.A0E;
        1F9 r0 = 1F9.A0I;
        if (cPa.A01.BWf(r0)) {
            FetchThreadKeyByParticipantsParams fetchThreadKeyByParticipantsParams = (FetchThreadKeyByParticipantsParams) r303.A00.getParcelable("fetch_thread_with_participants_key");
            ArrayList A17 = 1BK.A17(CPa.A01(cPa, r0, (ThreadKey) null).A07.A01);
            Collections.sort(A17, FetchThreadKeyByParticipantsParams.A07);
            ImmutableList copyOf = ImmutableList.copyOf((Iterable) 2Ri.A03(fetchThreadKeyByParticipantsParams.A02, A17));
            if (!copyOf.isEmpty()) {
                return OperationResult.A04(new FetchThreadByParticipantsResult(copyOf));
            }
        }
        return r302.BMQ(r303);
    }

    public OperationResult A0i(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0j(1Tu r302, 1TC r303) {
        return A0g(r302, r303);
    }

    public OperationResult A0k(1Tu r302, 1TC r303) {
        Bundle bundle = r303.A00;
        FetchThreadParams fetchThreadParams = (FetchThreadParams) AbG.A07(bundle, "fetchThreadParams");
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0v = AnonymousClass001.A0v();
        HashMap A0u = AnonymousClass001.A0u();
        FetchThreadParams fetchThreadParams2 = (FetchThreadParams) bundle.getParcelable("fetchThreadParams");
        ImmutableSet immutableSet = fetchThreadParams2.A05.A00;
        0QO r0 = new 0QO(0);
        ImmutableList immutableList = fetchThreadParams2.A06;
        if (immutableList != null) {
            AbG.A0s(this.A01, this.A00).A04(immutableList, true);
        }
        long currentTimeMillis = System.currentTimeMillis();
        CPa cPa = this.A0E;
        1He r02 = fetchThreadParams2.A03;
        int i = fetchThreadParams2.A01;
        0QO r03 = new 0QO(0);
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            ThreadKey A0k = AbG.A0k(it);
            ThreadSummary BFL = cPa.A01.BFL(A0k);
            if (CPa.A03(r02, cPa, BFL, i)) {
                r03.put(A0k, CPa.A02(cPa, BFL));
            }
        }
        long currentTimeMillis2 = (System.currentTimeMillis() - currentTimeMillis) / Math.max(immutableSet.size(), 1);
        1Du it2 = immutableSet.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Object obj = r03.get(next);
            HashMap A0u2 = AnonymousClass001.A0u();
            A0u2.put("thread_cache_duration", Long.toString(currentTimeMillis2));
            A0u2.put("fetch_location", (obj != null ? 0S2.A01 : 0S2.A00).intValue() != 0 ? "THREAD_CACHE" : OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            A0u.put(next, A0u2);
            r0.put(next, obj);
        }
        int size = r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object A04 = r0.A04(i2);
            FetchThreadResult fetchThreadResult = (FetchThreadResult) r0.A06(i2);
            if (fetchThreadResult == null || FetchThreadResult.A00(fetchThreadParams, fetchThreadResult)) {
                A0v.add(A04);
            } else {
                A0s.add(fetchThreadResult);
            }
        }
        if (!A0v.isEmpty()) {
            String str = r303.A05;
            String str2 = r303.A06;
            1SZ r04 = r303.A04;
            CallerContext callerContext = r303.A02;
            FbUserSession fbUserSession = r303.A01;
            1Se r05 = r303.A03;
            ThreadCriteria threadCriteria = fetchThreadParams.A05;
            1He r06 = fetchThreadParams.A03;
            1He r07 = fetchThreadParams.A04;
            ImmutableList immutableList2 = fetchThreadParams.A06;
            int i3 = fetchThreadParams.A01;
            boolean z = fetchThreadParams.A0A;
            bundle.putParcelable("fetchThreadParams", new FetchThreadParams(r06, r07, new ThreadCriteria(threadCriteria.A01, A0v), immutableList2, i3, fetchThreadParams.A02, fetchThreadParams.A07, fetchThreadParams.A08, fetchThreadParams.A00, fetchThreadParams.A09, z));
            1TC r08 = new 1TC(bundle, fbUserSession, callerContext, r05, r04, str2, str);
            D4w A00 = A00(r08.A02, this, "CSH.fetchThreadsFromNextHandler");
            try {
                ArrayList A0C = r302.BMQ(r08).A0C();
                if (A0C != null) {
                    Iterator it3 = A0C.iterator();
                    while (it3.hasNext()) {
                        FetchThreadResult fetchThreadResult2 = (FetchThreadResult) it3.next();
                        java.util.Map map = fetchThreadResult2.A00;
                        ThreadSummary threadSummary = fetchThreadResult2.A05;
                        if (map != null && threadSummary != null) {
                            ThreadKey threadKey = threadSummary.A0n;
                            java.util.Map map2 = (java.util.Map) A0u.get(threadKey);
                            if (map2 == null) {
                                map2 = AnonymousClass001.A0u();
                                A0u.put(threadKey, map2);
                            }
                            map2.putAll(map);
                        }
                    }
                    Iterator it4 = A0C.iterator();
                    while (it4.hasNext()) {
                        FetchThreadResult fetchThreadResult3 = (FetchThreadResult) it4.next();
                        if (fetchThreadResult3.A02.A08) {
                            ThreadSummary threadSummary2 = fetchThreadResult3.A05;
                            if (threadSummary2 != null) {
                                2fI r09 = this.A0D;
                                ThreadKey threadKey2 = threadSummary2.A0n;
                                ThreadSummary BFL2 = r09.BFL(threadKey2);
                                if (BFL2 != null) {
                                    long j = threadSummary2.A0L;
                                    if (j != -1) {
                                        long j2 = BFL2.A0L;
                                        if (j < j2) {
                                            0fH.A0V(Long.valueOf(j2), B8G.class, "handleFetchThread, skip stale thread summary, current: %d, new: %d", Long.valueOf(j));
                                        }
                                    }
                                }
                                if (ThreadKey.A0o(threadKey2) && !C2fg.A00(threadKey2)) {
                                    MessagesCollection messagesCollection = fetchThreadResult3.A03;
                                    if (messagesCollection != null && messagesCollection.A01.isEmpty()) {
                                        AbG.A0s(this.A01, this.A00).A03(fetchThreadResult3.A07);
                                    }
                                }
                            }
                            FetchThreadParams fetchThreadParams3 = (FetchThreadParams) r08.A00.getParcelable("fetchThreadParams");
                            B8I.A0E(this).A0B(fetchThreadResult3, fetchThreadParams3.A01, fetchThreadParams3.A09);
                        }
                    }
                }
                A00.close();
                if (A0C != null) {
                    A0s.addAll(A0C);
                }
            } catch (Throwable th) {
                try {
                    A00.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
        }
        4yK r010 = (4yK) this.A05.get();
        Collection values = A0u.values();
        11T.A0F(values, 0);
        Iterator it5 = values.iterator();
        while (it5.hasNext()) {
            r010.A01((java.util.Map) it5.next());
        }
        return OperationResult.A06(A0s);
    }

    public OperationResult A0l(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0m(1Tu r302, 1TC r303) {
        java.util.Map map;
        FetchUnreadMessageParams fetchUnreadMessageParams = (FetchUnreadMessageParams) r303.A00.getParcelable("fetchUnreadMessageParams");
        if (fetchUnreadMessageParams != null) {
            ThreadKey threadKey = fetchUnreadMessageParams.A01;
            if (threadKey != null) {
                2fI r0 = this.A0D;
                ThreadSummary BFL = r0.BFL(threadKey);
                if (BFL != null && r0.BWh(threadKey, 0)) {
                    0fH.A0A(B8G.class, "Fetching unread messages from cache");
                    if (BFL.A0O != 0) {
                        MessagesCollection A0Z = r0.A0Z(threadKey);
                        if (A0Z != null) {
                            HashMap A0u = AnonymousClass001.A0u();
                            A0u.put(BFL, A0Z);
                            map = A0u;
                            return OperationResult.A04(new FetchUnreadMessageResult(ImmutableMap.copyOf(map)));
                        }
                    }
                }
                return r302.BMQ(r303);
            }
            2fI r02 = this.A0D;
            1F9 r03 = 1F9.A0I;
            if (r02.BWf(r03)) {
                0fH.A0A(B8G.class, "Fetching unread messages from cache");
                2fL A07 = 2fI.A07(r02);
                try {
                    4dO A01 = 2fI.A01(r02, r03);
                    HashMap A0u2 = AnonymousClass001.A0u();
                    if (A01 != null) {
                        A01.A06.A01();
                        Iterator it = A01.A05.A01.iterator();
                        while (it.hasNext()) {
                            ThreadSummary A0j = AbF.A0j(it);
                            ThreadKey threadKey2 = A0j.A0n;
                            if (r02.BWh(threadKey2, 0)) {
                                if (A0j.A0O > 0) {
                                    MessagesCollection A0Z2 = r02.A0Z(threadKey2);
                                    if (A0Z2 != null) {
                                        A0u2.put(A0j, A0Z2);
                                    }
                                }
                            }
                            if (A07 != null) {
                                A07.close();
                            }
                        }
                    }
                    map = A0u2;
                    if (A07 != null) {
                        A07.close();
                        map = A0u2;
                    }
                    return OperationResult.A04(new FetchUnreadMessageResult(ImmutableMap.copyOf(map)));
                } catch (Throwable th) {
                    if (A07 != null) {
                        try {
                            A07.close();
                            throw th;
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            return r302.BMQ(r303);
        }
        map = Collections.EMPTY_MAP;
        return OperationResult.A04(new FetchUnreadMessageResult(ImmutableMap.copyOf(map)));
    }

    public OperationResult A0n(1Tu r302, 1TC r303) {
        return A01(r302, r303, "CSH.handleFetchUnreadThreads");
    }

    public OperationResult A0o(1Tu r302, 1TC r303) {
        BkZ bkZ = (BkZ) this.A0I.get();
        FbUserSession fbUserSession = this.A01;
        1To r0 = (1To) 1Lo.A04((Context) null, fbUserSession, bkZ.A00, 67250);
        CallerContext callerContext = r303.A02;
        r0.BZG(callerContext, "handleFetchVirtualThreads");
        try {
            FetchVirtualFolderThreadsParams fetchVirtualFolderThreadsParams = (FetchVirtualFolderThreadsParams) r303.A00.getParcelable("fetchVirtualFolderThreadsParamsSpec");
            fetchVirtualFolderThreadsParams.getClass();
            OperationResult BMQ = r302.BMQ(r303);
            FetchVirtualFolderThreadsResult fetchVirtualFolderThreadsResult = (FetchVirtualFolderThreadsResult) BMQ.A07();
            if (!fetchVirtualFolderThreadsResult.A00().A05.asBoolean(false)) {
                Bka bka = (Bka) bkZ.A01.get();
                1Hk r02 = fetchVirtualFolderThreadsParams.A01;
                1BY r03 = bka.A00;
                2fI r04 = (2fI) 1Lo.A04((Context) null, fbUserSession, r03, 67665);
                ThreadsCollection A01 = fetchVirtualFolderThreadsResult.A01();
                2fI.A0G(2fI.A06(r04, r02), r04, A01);
                AbJ.A0l(fbUserSession, r03).A03(fetchVirtualFolderThreadsResult.A02);
                ((1Uu) bka.A01.get()).A00(fbUserSession, 1F9.A0I, A01);
            }
            return BMQ;
        } finally {
            r0.D5i(callerContext, "handleFetchVirtualThreads");
        }
    }

    public OperationResult A0p(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleMarkFolderSeen");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            if (BMQ != null && BMQ.success) {
                MarkFolderSeenResult markFolderSeenResult = (MarkFolderSeenResult) BMQ.A08();
                if (markFolderSeenResult == null) {
                    BMQ = null;
                } else {
                    C4z1 A0E = B8I.A0E(this);
                    1F9 r0 = markFolderSeenResult.A01;
                    long j = markFolderSeenResult.A00;
                    FolderCounts Ams = A0E.A04.Ams(r0);
                    if (Ams != null) {
                        A0E.A00(new FolderCounts(Ams.A00, 0, j), r0);
                    }
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0q(1Tu r302, 1TC r303) {
        ThreadSummary BFL;
        Bundle bundle = r303.A00;
        String A00 = 1BJ.A00(197);
        MarkThreadsParams markThreadsParams = (MarkThreadsParams) bundle.getParcelable(A00);
        Integer num = markThreadsParams.A02;
        Integer num2 = 0S2.A00;
        if (num == num2) {
            ImmutableList.Builder builder = ImmutableList.builder();
            boolean z = markThreadsParams.A03;
            1Du it = markThreadsParams.A00.iterator();
            while (it.hasNext()) {
                MarkThreadFields markThreadFields = (MarkThreadFields) it.next();
                ThreadKey threadKey = markThreadFields.A06;
                boolean z2 = markThreadFields.A07;
                long j = markThreadFields.A02;
                long j2 = markThreadFields.A04;
                1F9 r0 = markThreadFields.A05;
                long j3 = markThreadFields.A01;
                if (z2 && (BFL = this.A0E.A01.BFL(threadKey)) != null) {
                    long j4 = BFL.A0C;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                }
                builder.m11011add((Object) new MarkThreadFields(r0, threadKey, j3, j, -1, j2, z2));
            }
            markThreadsParams = new MarkThreadsParams(builder, num, z);
        }
        HashMultimap hashMultimap = new HashMultimap();
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableMap.Builder A0c = 1BK.A0c();
        ImmutableList immutableList = markThreadsParams.A00;
        1Du it2 = immutableList.iterator();
        while (it2.hasNext()) {
            MarkThreadFields markThreadFields2 = (MarkThreadFields) it2.next();
            1F9 r334 = markThreadFields2.A05;
            if (r334 == null) {
                r334 = 1F9.A0I;
            }
            hashMultimap.CZw(r334, markThreadFields2);
            if (r334 == 1F9.A06 && !markThreadFields2.A07) {
                A0h.m11011add((Object) markThreadFields2.A06);
            } else if (markThreadFields2.A07) {
                ThreadKey threadKey2 = markThreadFields2.A06;
                A0h.m11011add((Object) threadKey2);
                if (r334 == 1F9.A0M) {
                    A0c.put(threadKey2, Long.valueOf(markThreadFields2.A04));
                }
            }
        }
        Integer num3 = markThreadsParams.A02;
        D4w A002 = A00(r303.A02, this, "CSH.handleMarkThreads");
        try {
            for (1F9 r02 : hashMultimap.keySet()) {
                C4z1 A0E = B8I.A0E(this);
                ImmutableList.Builder builder2 = ImmutableList.builder();
                builder2.addAll(ImmutableList.copyOf((Collection) hashMultimap.AUe(r02)));
                MarkThreadsParams markThreadsParams2 = new MarkThreadsParams(builder2, num3, true);
                Integer num4 = markThreadsParams2.A02;
                if (num4 == num2) {
                    1Du it3 = markThreadsParams2.A00.iterator();
                    while (it3.hasNext()) {
                        A0E.A04.BfY((MarkThreadFields) it3.next());
                    }
                } else if (num4 == 0S2.A01) {
                    1Du it4 = markThreadsParams2.A00.iterator();
                    while (it4.hasNext()) {
                        MarkThreadFields markThreadFields3 = (MarkThreadFields) it4.next();
                        2fI r03 = A0E.A04;
                        ThreadKey threadKey3 = markThreadFields3.A06;
                        1F9 r333 = markThreadFields3.A07 ? 1F9.A06 : 1F9.A0I;
                        1F9 r04 = markThreadFields3.A05;
                        if (r333 != r04) {
                            r03.A0c(r04, r333, threadKey3);
                        }
                    }
                } else if (num4 == 0S2.A0C) {
                    ImmutableList.Builder A0h2 = 4YU.A0h();
                    1Du it5 = markThreadsParams2.A00.iterator();
                    while (it5.hasNext()) {
                        A0h2.m11011add((Object) ((MarkThreadFields) it5.next()).A06);
                    }
                    A0E.A04.A0d(r02, A0h2.build());
                }
            }
            ImmutableList build = A0h.build();
            if (!build.isEmpty()) {
                if (num3 == num2) {
                    if (((MarkThreadFields) 1BK.A0r(immutableList)).A07) {
                        1Uv.A04(this.A01, AbF.A0a(this.A06), AnonymousClass000.A00(53), "CacheServiceHandler.handleMarkThreads", 1BK.A17(build));
                    } else {
                        AbF.A0a(this.A06).A0D(this.A01, build, "CacheServiceHandler.handleMarkThreads");
                    }
                } else if (num3 == 0S2.A01 || num3 == 0S2.A0C) {
                    AbF.A0a(this.A06).A0C(this.A01, build, "CacheServiceHandler.handleMarkThreads");
                }
            }
            if (!hashMultimap.isEmpty()) {
                C00i c00i = this.A06;
                AbJ.A1Q(c00i);
                if (hashMultimap.A01.containsKey(1F9.A0M)) {
                    AbF.A0a(c00i).A07();
                }
            }
            ImmutableMap build2 = A0c.build();
            if (!build2.isEmpty()) {
                C4z1 A0E2 = B8I.A0E(this);
                HashSet hashSet = new HashSet(build2.size());
                1Du A0i = 4YU.A0i(build2);
                while (A0i.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0i);
                    ThreadKey threadKey4 = (ThreadKey) A0z.getKey();
                    A0z.getValue();
                    C5nf A0Y = A0E2.A04.A0Y(threadKey4);
                    Object obj = A0Y.A00;
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                    Object obj2 = A0Y.A01;
                    if (obj2 != null) {
                        hashSet.add(obj2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    AbF.A0a(this.A06).A0B(this.A01, ImmutableList.copyOf((Collection) hashSet), "CacheServiceHandler.maybeHandleMarkThreadsForMontage");
                }
            }
            bundle.putParcelable(A00, markThreadsParams);
            OperationResult BMQ = r302.BMQ(r303);
            A002.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0r(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleModifyThread");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchThreadResult A0c = AbM.A0c(BMQ);
            if (A0c != null) {
                ThreadSummary threadSummary = A0c.A05;
                if (threadSummary != null) {
                    C4z1 A0E = B8I.A0E(this);
                    A0E.A04.A0h(threadSummary);
                    FbUserSession fbUserSession = A0E.A01;
                    1BY r0 = A0E.A00;
                    AbG.A0s(fbUserSession, r0).A03(A0c.A07);
                    if (!((AnonymousClass242) 1Lo.A04((Context) null, fbUserSession, r0, 16907)).A0E(threadSummary)) {
                        A0E.A03(threadSummary.A0g, ImmutableList.of((Object) threadSummary.A0n));
                    }
                    A0E.A03.A0A(fbUserSession, threadSummary.A0n, 4YT.A00(215));
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0s(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleSaveDraft");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            SaveDraftParams saveDraftParams = (SaveDraftParams) r303.A00.getParcelable("saveDraftParams");
            C4z1 A0E = B8I.A0E(this);
            ThreadKey threadKey = saveDraftParams.A01;
            MessageDraft messageDraft = saveDraftParams.A00;
            2fI r0 = A0E.A04;
            ThreadSummary BFL = r0.BFL(threadKey);
            if (BFL != null) {
                r0.A0g(messageDraft, BFL);
                A0E.A03.A0A(A0E.A01, threadKey, 4YT.A00(215));
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0t(1Tu r302, 1TC r303) {
        Bundle bundle = r303.A00;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("updated_attachments_list");
        ThreadKey threadKey = (ThreadKey) bundle.getParcelable("thread_key");
        String string = bundle.getString("updated_view_state");
        if (!09K.A01(stringArrayList) && threadKey != null && string != null) {
            EphemeralMediaState A00 = EphemeralMediaState.A00(string);
            ImmutableList.Builder A0h = 4YU.A0h();
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                Message Awq = this.A0D.Awq(threadKey, AnonymousClass001.A0i(it));
                if (Awq != null) {
                    A0h.m11011add((Object) Awq);
                }
            }
            ImmutableList A002 = C6p5.A00(A00, A0h.build());
            if (09K.A00(A002)) {
                C4z1 A0E = B8I.A0E(this);
                1Du it2 = A002.iterator();
                while (it2.hasNext()) {
                    Attachment attachment = (Attachment) it2.next();
                    String str = attachment.A0K;
                    2fI r0 = A0E.A04;
                    CiW ciW = new CiW(r0, attachment);
                    2fI.A0H(ciW, r0, str, true);
                    2fI.A0H(ciW, r0, str, false);
                }
                r302.BMQ(r303);
                return OperationResult.A05("ephemeral_media_view_state_updated", new Pair("thread_key", threadKey));
            }
        }
        return r302.BMQ(r303);
    }

    public OperationResult A0u(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleUpdateFolderCounts");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            if (BMQ != null && BMQ.success) {
                UpdateFolderCountsResult updateFolderCountsResult = (UpdateFolderCountsResult) BMQ.A08();
                if (updateFolderCountsResult != null) {
                    UpdateFolderCountsParams updateFolderCountsParams = (UpdateFolderCountsParams) r303.A00.getParcelable("updateFolderCountsParams");
                    B8I.A0E(this).A00(updateFolderCountsResult.A00, updateFolderCountsParams.A02);
                    A00.close();
                    return BMQ;
                }
            }
            A00.close();
            return null;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0v(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        Bundle bundle = r303.A00;
        String string = bundle.getString("messageId");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("overlays");
        2fI r0 = B8I.A0E(this).A04;
        2fL A07 = 2fI.A07(r0);
        try {
            C2fN c2fN = r0.A0A;
            Message A02 = c2fN.A02(string);
            if (A02 != null) {
                MessagesCollection BFC = r0.BFC(A02.A0V);
                if (BFC != null) {
                    int indexOf = BFC.A01.indexOf(A02);
                    if (indexOf != -1) {
                        5PI A0d = AbF.A0d(A02);
                        A0d.A0w = ImmutableList.copyOf((Collection) parcelableArrayList);
                        c2fN.A06(2fI.A08(4YU.A0U(A0d), BFC, indexOf), (User) 1Bn.A0E((Context) null, r0.A00, 83430), false, false);
                    }
                }
            }
            if (A07 != null) {
                A07.close();
            }
            Message Awq = this.A0D.Awq((ThreadKey) null, string);
            if (Awq != null) {
                AbF.A0a(this.A06).A0A(this.A01, Awq.A0V, "CacheServiceHandler.handleUpdateMontageInteractiveFeedbackOverlays");
            }
            return BMQ;
        } catch (Throwable th) {
            if (A07 != null) {
                try {
                    A07.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public OperationResult A0w(1Tu r302, 1TC r303) {
        D4w A00 = A00(r303.A02, this, "CSH.handleUpdateOptimisticGroupThreadState");
        try {
            OperationResult BMQ = r302.BMQ(r303);
            FetchThreadResult A0c = AbM.A0c(BMQ);
            if (A0c != null) {
                ThreadSummary threadSummary = A0c.A05;
                if (threadSummary != null) {
                    AbM.A1J(this.A02, threadSummary);
                    AbF.A0a(this.A06).A0A(this.A01, threadSummary.A0n, "CacheServiceHandler.handleUpdateOptimisticGroupThreadState");
                }
            }
            A00.close();
            return BMQ;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public OperationResult A0x(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0y(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        UpdateVanishModeSelectionResult updateVanishModeSelectionResult = (UpdateVanishModeSelectionResult) BMQ.A08();
        if (updateVanishModeSelectionResult != null) {
            C4z1 A0E = B8I.A0E(this);
            ThreadSummary threadSummary = updateVanishModeSelectionResult.A00;
            A0E.A07(threadSummary);
            ThreadKey threadKey = threadSummary.A0n;
            AbF.A0a(this.A06).A0B(this.A01, ImmutableList.of((Object) C2ga.A00(threadKey), (Object) C2ga.A01(threadKey)), "CacheServiceHandler.handleUpdateVanishModeSelection");
        }
        return BMQ;
    }

    public OperationResult A0z(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        UpdateVanishingModePairedTimestampResult updateVanishingModePairedTimestampResult = (UpdateVanishingModePairedTimestampResult) BMQ.A08();
        if (updateVanishingModePairedTimestampResult != null) {
            C4z1 A0E = B8I.A0E(this);
            ThreadSummary threadSummary = updateVanishingModePairedTimestampResult.A00;
            A0E.A07(threadSummary);
            AbF.A0a(this.A06).A0A(this.A01, threadSummary.A0n, "CacheServiceHandler.handleUpdatedVanishingModePairedTimestamp");
        }
        return BMQ;
    }
}
