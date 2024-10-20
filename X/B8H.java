package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.util.TriState;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.folders.FolderCounts;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPoll;
import com.facebook.messaging.montage.model.cards.MontageFeedbackPollOption;
import com.facebook.messaging.onetrace.OneTraceInfo;
import com.facebook.messaging.service.model.AcceptMessageRequestParams;
import com.facebook.messaging.service.model.CreateLocalAdminMessageParams;
import com.facebook.messaging.service.model.DeleteMessagesParams;
import com.facebook.messaging.service.model.DeleteMessagesResult;
import com.facebook.messaging.service.model.DeleteThreadsParams;
import com.facebook.messaging.service.model.EditDisplayNameResult;
import com.facebook.messaging.service.model.EditUsernameResult;
import com.facebook.messaging.service.model.FetchMessagesContextParams;
import com.facebook.messaging.service.model.FetchMessagesContextResult;
import com.facebook.messaging.service.model.FetchMoreMessagesParams;
import com.facebook.messaging.service.model.FetchMoreMessagesResult;
import com.facebook.messaging.service.model.FetchMoreRecentMessagesParams;
import com.facebook.messaging.service.model.FetchMoreRecentMessagesResult;
import com.facebook.messaging.service.model.FetchMoreThreadsResult;
import com.facebook.messaging.service.model.FetchThreadByParticipantsResult;
import com.facebook.messaging.service.model.FetchThreadKeyByParticipantsParams;
import com.facebook.messaging.service.model.FetchThreadListResult;
import com.facebook.messaging.service.model.FetchThreadMetadataParams;
import com.facebook.messaging.service.model.FetchThreadMetadataResult;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.messaging.service.model.FetchUnreadMessageParams;
import com.facebook.messaging.service.model.FetchUnreadMessageResult;
import com.facebook.messaging.service.model.MarkFolderSeenResult;
import com.facebook.messaging.service.model.MarkThreadsParams;
import com.facebook.messaging.service.model.SaveDraftParams;
import com.facebook.messaging.service.model.UpdateFolderCountsParams;
import com.facebook.messaging.service.model.UpdateFolderCountsResult;
import com.facebook.messaging.service.model.UpdateProfilePicUriWithFilePathParams;
import com.facebook.messaging.service.model.UpdateVanishModeSelectionParams;
import com.facebook.messaging.service.model.UpdateVanishModeSelectionResult;
import com.facebook.messaging.service.model.UpdateVanishingModePairedTimestampParams;
import com.facebook.messaging.service.model.UpdateVanishingModePairedTimestampResult;
import com.facebook.messaging.service.model.virtualfolders.FetchMoreVirtualFolderThreadsParams;
import com.facebook.messaging.service.model.virtualfolders.FetchVirtualFolderThreadsParams;
import com.facebook.messaging.service.model.virtualfolders.FetchVirtualFolderThreadsResult;
import com.facebook.messenger.plugins.entityenrichmentplugin.EntityEnrichmentPluginPostmailbox;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: B8H.class */
public final class B8H extends B8I {
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
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final MessagingPerformanceLogger A0F;
    public final C15h A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C15h A0P;

    public B8H(1BO r302, FbUserSession fbUserSession) {
        super("DbServiceHandler");
        this.A0M = 1BV.A01((1BY) null, 84569);
        this.A0A = 1BQ.A02(49410);
        this.A0L = AbH.A0O();
        this.A08 = 1BQ.A02(100043);
        this.A0B = 1BQ.A02(83015);
        this.A0E = 1BQ.A02(32804);
        this.A0I = 1BQ.A02(84777);
        this.A09 = AbH.A0S();
        this.A02 = AbH.A0a();
        this.A0F = (MessagingPerformanceLogger) 1Bi.A03(85048);
        this.A0P = DBe.A00(this, 54);
        this.A0G = DBe.A00(this, 55);
        this.A0J = 1BQ.A02(84423);
        this.A0H = 1BQ.A02(17063);
        this.A0K = 1BV.A01((1BY) null, 84557);
        this.A00 = 7zL.A0Q(r302);
        this.A01 = fbUserSession;
        this.A06 = AbF.A0B(fbUserSession, (1BY) null, 84519);
        this.A03 = AbH.A0A(fbUserSession);
        this.A05 = AbM.A0E(fbUserSession);
        this.A04 = AbF.A0A(fbUserSession, (1BY) null, 49413);
        this.A07 = AbF.A0A(fbUserSession, (1BY) null, 49998);
        this.A0N = AbF.A0A(fbUserSession, (1BY) null, 33102);
        this.A0C = AbF.A0A(fbUserSession, (1BY) null, 49346);
        this.A0D = AbF.A0A(fbUserSession, (1BY) null, 50000);
        this.A0O = AbF.A0A(fbUserSession, (1BY) null, 84555);
    }

    private OperationResult A00(1Tu r302, 1TC r303, long j) {
        C00i c00i = this.A0D;
        int A00 = 2yD.A00(1BK.A0N(((6EB) c00i.get()).A03), 36596540155956181L);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                throw new IOException(0Pz.A0W("StaleWebDataException: ", "fetchThreadFromWebWithConsistencyCheck contains stale fetch result"));
            }
            6EB r0 = (6EB) c00i.get();
            AbN.A1J(r0);
            LongSparseArray longSparseArray = new LongSparseArray(1);
            Object obj = r0.A01.get(j);
            if (obj != null) {
                longSparseArray.put(j, obj);
            }
            long j2 = r0.A00;
            OperationResult BMQ = r302.BMQ(r303);
            6EB r02 = (6EB) c00i.get();
            AbN.A1J(r02);
            if (r02.A00 == j2) {
                LongSparseArray longSparseArray2 = new LongSparseArray(1);
                Object obj2 = r02.A01.get(j);
                if (obj2 != null) {
                    longSparseArray2.put(j, obj2);
                }
                if (6EB.A00(longSparseArray2, longSparseArray)) {
                    return BMQ;
                }
            }
            0fH.A17("DbServiceHandler", "fetchFromWeb contains stale fetch result, %s, %s vs %s, %s", new Object[]{longSparseArray, Long.valueOf(j2), ((6EB) c00i.get()).A01, Long.valueOf(((6EB) c00i.get()).A00)});
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0.A01.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.fbservice.service.OperationResult A01(X.1Tu r302, X.1TC r303, com.facebook.messaging.service.model.FetchThreadResult r304, int r305, long r306, long r308) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r308
            com.facebook.fbservice.service.OperationResult r0 = r0.A00(r1, r2, r3)
            r310 = r0
            r0 = r310
            com.facebook.messaging.service.model.FetchThreadResult r0 = X.AbM.A0c(r0)
            r311 = r0
            r0 = r304
            com.facebook.messaging.model.messages.MessagesCollection r0 = r0.A03
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L32
            r0 = r312
            com.google.common.collect.ImmutableList r0 = r0.A01
            r312 = r0
            r0 = r312
            boolean r0 = r0.isEmpty()
            r313 = r0
            r0 = 1
            r314 = r0
            r0 = r313
            if (r0 == 0) goto L35
        L32:
            r0 = 0
            r314 = r0
        L35:
            r0 = r301
            r1 = r304
            r2 = r311
            r0.A0B(r1, r2)
            r0 = r311
            java.util.Map r0 = r0.A00
            r312 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            r315 = r0
            r0 = r312
            if (r0 == 0) goto L54
            r0 = r315
            r1 = r312
            r0.putAll(r1)
        L54:
            r0 = r306
            java.lang.String r0 = java.lang.Long.toString(r0)
            r316 = r0
            r0 = r315
            java.lang.String r1 = "thread_db_duration"
            r2 = r316
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r311
            r1 = r315
            r0.A00 = r1
            r0 = r311
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A05
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L96
            r0 = r314
            if (r0 == 0) goto L96
            r0 = r312
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r316 = r0
            r0 = r301
            X.4yz r0 = X.B8I.A0F(r0)
            r312 = r0
            r0 = r312
            r1 = r316
            r2 = r305
            com.facebook.messaging.service.model.FetchThreadResult r0 = r0.A0H(r1, r2)
            r311 = r0
        L96:
            X.5pc r0 = new X.5pc
            r316 = r0
            r0 = r316
            r1 = r311
            r0.<init>(r1)
            r0 = r316
            r1 = r315
            r0.A09 = r1
            com.facebook.fbservice.results.DataFetchDisposition r0 = com.facebook.fbservice.results.DataFetchDisposition.A0H
            r312 = r0
            r0 = r316
            r1 = r312
            r0.A01 = r1
            r0 = r316
            com.facebook.messaging.service.model.FetchThreadResult r0 = r0.A00()
            com.facebook.fbservice.service.OperationResult r0 = com.facebook.fbservice.service.OperationResult.A04(r0)
            r312 = r0
            r0 = r312
            r1 = r310
            A05(r0, r1)
            r0 = r312
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8H.A01(X.1Tu, X.1TC, com.facebook.messaging.service.model.FetchThreadResult, int, long, long):com.facebook.fbservice.service.OperationResult");
    }

    public static Message A02(MessagesCollection messagesCollection) {
        if (messagesCollection == null) {
            return null;
        }
        1Du it = messagesCollection.A01.iterator();
        while (it.hasNext()) {
            Message A0V = 4YU.A0V(it);
            if (!A0V.A21) {
                return A0V;
            }
        }
        return null;
    }

    public static C5pc A03(FetchThreadResult fetchThreadResult) {
        TriState triState = TriState.UNSET;
        AnonymousClass235 anonymousClass235 = AnonymousClass235.LOCAL_DISK_CACHE;
        TriState triState2 = TriState.YES;
        TriState triState3 = TriState.NO;
        DataFetchDisposition dataFetchDisposition = new DataFetchDisposition(triState, triState2, triState, triState3, triState, triState3, anonymousClass235, -1);
        C5pc c5pc = new C5pc(fetchThreadResult);
        c5pc.A01 = dataFetchDisposition;
        return c5pc;
    }

    private void A04(1Tu r302, FetchThreadParams fetchThreadParams, FetchThreadResult fetchThreadResult) {
        int i;
        MessagesCollection messagesCollection = fetchThreadResult.A03;
        if (messagesCollection.A02) {
            return;
        }
        ThreadSummary threadSummary = fetchThreadResult.A05;
        int size = fetchThreadParams.A01 - messagesCollection.A01.size();
        if (size > 0) {
            FetchMoreMessagesParams fetchMoreMessagesParams = new FetchMoreMessagesParams(threadSummary.A0n, size + 1, messagesCollection.A05().A05, true, false);
            Bundle A05 = 1BK.A05();
            A05.putParcelable("fetchMoreMessagesParams", fetchMoreMessagesParams);
            FetchMoreMessagesResult fetchMoreMessagesResult = (FetchMoreMessagesResult) r302.BMQ(new 1TC("fetch_more_messages", A05)).A08();
            4yH A0G = B8I.A0G(this);
            SQLiteDatabase A00 = C10654u8.A00(A0G.A0G);
            C01m.A01(A00, 1905310862);
            try {
                try {
                    C12014yf c12014yf = A0G.A0M;
                    MessagesCollection messagesCollection2 = fetchMoreMessagesResult.A02;
                    if (c12014yf.A01(messagesCollection, messagesCollection2)) {
                        4yH.A05(A0G, messagesCollection2, true);
                        A00.setTransactionSuccessful();
                        i = 1809711243;
                    } else {
                        0fH.A0j("DbInsertThreadsHandler", "Performance warning - can't add more messages");
                        i = 361452367;
                    }
                    C01m.A03(A00, i);
                    MessagesCollection A002 = C12014yf.A00(messagesCollection, messagesCollection2, (C12014yf) this.A0A.get(), true);
                    C5pc c5pc = new C5pc();
                    c5pc.A01 = DataFetchDisposition.A0H;
                    c5pc.A04 = threadSummary;
                    c5pc.A02 = A002;
                    c5pc.A06 = fetchThreadResult.A07;
                    c5pc.A00 = 1BL.A08(this.A02);
                    c5pc.A00();
                } catch (SQLException e) {
                    4yH.A0A(e);
                    throw 0Q8.createAndThrow();
                }
            } catch (Throwable th) {
                C01m.A03(A00, -1195153417);
                throw th;
            }
        }
    }

    public static void A05(OperationResult operationResult, OperationResult operationResult2) {
        Bundle bundle;
        if (operationResult.resultDataBundle == null || (bundle = operationResult2.resultDataBundle) == null || bundle.getString(Property.SYMBOL_Z_ORDER_SOURCE) == null) {
            return;
        }
        operationResult.resultDataBundle.putString(Property.SYMBOL_Z_ORDER_SOURCE, operationResult2.resultDataBundle.getString(Property.SYMBOL_Z_ORDER_SOURCE));
    }

    private void A06(Message message, FetchThreadResult fetchThreadResult) {
        MessagesCollection messagesCollection;
        Message A04;
        ThreadSummary threadSummary = fetchThreadResult.A05;
        if (threadSummary == null || (messagesCollection = fetchThreadResult.A03) == null || (A04 = messagesCollection.A04()) == null) {
            return;
        }
        String str = this.A01.A05;
        1Js r0 = 1Js.A03;
        UserKey userKey = new UserKey(r0, str);
        if (message == null || message.A05 < A04.A05) {
            UserKey userKey2 = A04.A0K.A0F;
            if (userKey2.type == r0 && !userKey2.equals(userKey) && 2Gt.A0F(threadSummary)) {
                CQF cqf = (CQF) this.A0M.get();
                CQF.A03(1Fw.A05(cqf.A00), cqf, A04, (OneTraceInfo) null, "FETCH_THREAD_OPERATION");
            }
        }
    }

    private void A0B(FetchThreadResult fetchThreadResult, FetchThreadResult fetchThreadResult2) {
        if (fetchThreadResult2.A05 == null) {
            0fH.A0j("DbServiceHandler", "serverResult.threadSummary is null");
            return;
        }
        SQLiteDatabase A00 = C10654u8.A00(this.A0C);
        C01m.A01(A00, 2017149726);
        try {
            A06(A02(fetchThreadResult.A03), fetchThreadResult2);
            B8I.A0G(this).A0b(fetchThreadResult, fetchThreadResult2, "DbServiceHandler.handleFetchThread");
            A00.setTransactionSuccessful();
            C01m.A03(A00, -1541688374);
        } catch (Throwable th) {
            C01m.A03(A00, 1082607647);
            throw th;
        }
    }

    public OperationResult A0H(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        if (BMQ.success) {
            AcceptMessageRequestParams acceptMessageRequestParams = (AcceptMessageRequestParams) r303.A00.getParcelable("acceptMessageRequestParams");
            acceptMessageRequestParams.getClass();
            4yH A0G = B8I.A0G(this);
            ThreadKey threadKey = acceptMessageRequestParams.A00;
            1F9 r0 = 1F9.A0I;
            ThreadSummary A0Y = AbM.A0Y(A0G.A04, threadKey);
            if (A0Y != null && !A0Y.A0g.equals(r0)) {
                ContentValues A07 = 4YU.A07();
                A07.put("thread_key", threadKey.A0u());
                A07.put("folder", r0.dbName);
                C10654u8.A00(A0G.A0G).update("threads", A07, "thread_key=?", new String[]{threadKey.A0u()});
            }
        }
        return BMQ;
    }

    public OperationResult A0I(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0J(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0K(1Tu r302, 1TC r303) {
        ((CNR) this.A06.get()).A02();
        OperationResult BMQ = r302.BMQ(r303);
        B8I.A0G(this).A0Z(ThreadKey.A0E(((CreateCustomizableGroupParams) r303.A00.getParcelable("CreateCustomizableGroupParams")).A00), (FetchThreadResult) BMQ.A07());
        return BMQ;
    }

    public OperationResult A0L(1Tu r302, 1TC r303) {
        Message message = ((CreateLocalAdminMessageParams) r303.A00.getParcelable("createLocalAdminMessageParams")).A00;
        4yH A0G = B8I.A0G(this);
        C00j.A05("DbInsertThreadsHandler.handleInsertLocalAdminMessage", 569758571);
        try {
            SQLiteDatabase A00 = C10654u8.A00(A0G.A0G);
            C01m.A01(A00, -694641523);
            try {
                4yH.A03(A0G, message, true);
                4yH.A0D(A0G, message, C7tn.A02, -1, message.A05);
                A00.setTransactionSuccessful();
                C01m.A03(A00, -781010916);
                C00j.A01(878656184);
                return OperationResult.A00;
            } catch (Throwable th) {
                C01m.A03(A00, 868931207);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(326458523);
            throw th2;
        }
    }

    public OperationResult A0M(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("threadUpdate");
        B8I.A0G(this).A0e(ImmutableList.of((Object) parcelable), "handleCreateOptimisticGroupThread");
        return OperationResult.A04(parcelable);
    }

    public OperationResult A0N(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r0.size() <= 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0O(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8H.A0O(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0P(1Tu r302, 1TC r303) {
        ImmutableSet immutableSet;
        DeleteMessagesParams deleteMessagesParams = (DeleteMessagesParams) r303.A00.getParcelable("DeleteMessagesParams");
        deleteMessagesParams.getClass();
        DeleteMessagesResult A0T = B8I.A0G(this).A0T(deleteMessagesParams, "DbServiceHandler.handleDeleteMessages", -1, false, false);
        1Hz A10 = AbF.A10();
        Integer num = deleteMessagesParams.A03;
        Integer num2 = 0S2.A00;
        if (num == num2 && (immutableSet = A0T.A03) != null) {
            1Du it = immutableSet.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                if (A0i != null && A0i.length() != 0 && !11T.A0P("sent", 1, A0i)) {
                    A10.A05(A0i);
                }
            }
        }
        ImmutableSet A07 = A10.A07();
        if (!A07.isEmpty()) {
            r302.BMQ(new 1TC("delete_messages", AbH.A05(new DeleteMessagesParams(deleteMessagesParams.A00, A07, num2), "DeleteMessagesParams")));
        }
        return OperationResult.A04(A0T);
    }

    public OperationResult A0Q(1Tu r302, 1TC r303) {
        DeleteThreadsParams deleteThreadsParams = (DeleteThreadsParams) r303.A00.getParcelable("deleteThreadsParams");
        OperationResult BMQ = r302.BMQ(r303);
        4yH.A0K(B8I.A0G(this), deleteThreadsParams.A00, "DbServiceHandler.handleDeleteThreads");
        return BMQ;
    }

    public OperationResult A0R(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        EditDisplayNameResult editDisplayNameResult = (EditDisplayNameResult) BMQ.A08();
        if (editDisplayNameResult != null) {
            4yH A0G = B8I.A0G(this);
            1Kh A0y = AbF.A0y();
            A0y.A03(AbF.A0x(this.A0P));
            A0y.A0R = new Name(editDisplayNameResult.A00, editDisplayNameResult.A01, null);
            A0G.A0J.A01(ImmutableList.of((Object) AbF.A0w(A0y)));
        }
        return BMQ;
    }

    public OperationResult A0S(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0T(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        EditUsernameResult editUsernameResult = (EditUsernameResult) BMQ.A08();
        if (editUsernameResult != null) {
            4yH A0G = B8I.A0G(this);
            1Kh A0y = AbF.A0y();
            A0y.A03(AbF.A0x(this.A0P));
            A0y.A1L = editUsernameResult.A00;
            A0G.A0J.A01(ImmutableList.of((Object) AbF.A0w(A0y)));
        }
        return BMQ;
    }

    public OperationResult A0U(1Tu r302, 1TC r303) {
        FetchThreadParams fetchThreadParams = (FetchThreadParams) r303.A00.getParcelable("fetchThreadParams");
        fetchThreadParams.getClass();
        FetchThreadResult A0I = B8I.A0F(this).A0I(fetchThreadParams.A05, fetchThreadParams.A01);
        if (A0I.A05 == null) {
            return r302.BMQ(r303);
        }
        C5pc A03 = A03(A0I);
        A03.A00 = 1BL.A08(this.A02);
        return B8I.A0C(A03.A00());
    }

    public OperationResult A0V(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0W(1Tu r302, 1TC r303) {
        Message A0V;
        FetchMessagesContextParams fetchMessagesContextParams = (FetchMessagesContextParams) AbG.A07(r303.A00, 1BJ.A00(412));
        20A A0J = AbM.A0J(this.A08);
        C1cm c1cm = C2rg.A07;
        ThreadKey threadKey = fetchMessagesContextParams.A03;
        A0J.A05(c1cm, "fetchMessagesContext (DSH). %s", new Object[]{threadKey});
        String str = fetchMessagesContextParams.A04;
        boolean A0B = 1JF.A0B(str);
        C00i c00i = this.A03;
        C4yz A0V2 = AbM.A0V(c00i);
        if (A0B) {
            LinkedHashMap linkedHashMap = C4yz.A00(AbF.A0G("timestamp_ms", Long.toString(fetchMessagesContextParams.A02)), A0V2, null, 1, false).A00;
            if (!linkedHashMap.isEmpty()) {
                A0V = 4YU.A0V(linkedHashMap.values().iterator());
            }
            return r302.BMQ(r303);
        }
        A0V = A0V2.A09(str);
        if (A0V != null) {
            C4yz c4yz = (C4yz) c00i.get();
            long j = A0V.A05;
            long j2 = -1;
            FetchMoreMessagesResult A0F = c4yz.A0F(threadKey, " ASC", fetchMessagesContextParams.A01, j, j2);
            MessagesCollection messagesCollection = A0F.A02;
            messagesCollection.getClass();
            MessagesCollection messagesCollection2 = ((C4yz) c00i.get()).A0F(threadKey, " DESC", fetchMessagesContextParams.A00, j2, j).A02;
            messagesCollection2.getClass();
            C5pv A00 = MessagesCollection.A00(C12014yf.A00(messagesCollection, messagesCollection2, (C12014yf) this.A0A.get(), true));
            A00.A04 = false;
            MessagesCollection A002 = A00.A00();
            A002.getClass();
            DataFetchDisposition dataFetchDisposition = A0F.A01;
            dataFetchDisposition.getClass();
            return OperationResult.A04(new FetchMessagesContextResult(dataFetchDisposition, A002, null, j2));
        }
        return r302.BMQ(r303);
    }

    public OperationResult A0X(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bd, code lost:
    
        if (r0.A05(X.0Pz.A0W("first_", r0.dbName)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0Y(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8H.A0Y(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0Z(1Tu r302, 1TC r303) {
        return A0Y(r302, r303);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x029c, code lost:
    
        if (r0 != null) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0a(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8H.A0a(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0b(1Tu r302, 1TC r303) {
        OperationResult A0C;
        int i;
        FetchMoreRecentMessagesParams fetchMoreRecentMessagesParams = (FetchMoreRecentMessagesParams) AbG.A07(r303.A00, "fetchMoreRecentMessagesParams");
        ThreadKey threadKey = fetchMoreRecentMessagesParams.A02;
        AbM.A0J(this.A08).A05(C2rg.A07, "fetchMoreRecentMessages (DSH). %s", new Object[]{threadKey});
        C00j.A05("DbServiceHandler.handleFetchMoreRecentMessages", -1610912413);
        try {
            C00i c00i = this.A03;
            if (AbM.A0V(c00i).A0B(fetchMoreRecentMessagesParams.A03, fetchMoreRecentMessagesParams.A04) == null) {
                A0C = r302.BMQ(r303);
                i = -1563049147;
            } else {
                C4yz c4yz = (C4yz) c00i.get();
                long j = fetchMoreRecentMessagesParams.A01;
                long j2 = -1;
                int i2 = fetchMoreRecentMessagesParams.A00;
                FetchMoreMessagesResult A0F = c4yz.A0F(threadKey, " ASC", i2, j, j2);
                DataFetchDisposition dataFetchDisposition = A0F.A01;
                MessagesCollection messagesCollection = A0F.A02;
                messagesCollection.getClass();
                ImmutableList immutableList = messagesCollection.A01;
                if (immutableList.size() == i2) {
                    C4yz A0V = AbM.A0V(c00i);
                    if (!immutableList.isEmpty()) {
                        ThreadKey threadKey2 = messagesCollection.A00;
                        4cN r0 = new 4cN();
                        4cO.A00(r0, "thread_key", threadKey2.A0u());
                        LinkedHashMap linkedHashMap = C4yz.A00(r0, A0V, "timestamp_ms DESC", 1, false).A00;
                        Message A0V2 = linkedHashMap.values().isEmpty() ? null : 4YU.A0V(linkedHashMap.values().iterator());
                        A0V2.getClass();
                        int size = immutableList.size() - 1;
                        while (true) {
                            int i3 = size;
                            if (i3 < 0) {
                                break;
                            }
                            Message A0e = AbF.A0e(immutableList, i3);
                            if (Objects.equal(A0e.A1V, A0V2.A1V) || Objects.equal(A0e.A1g, A0V2.A1g)) {
                                break;
                            }
                            size = i3 - 1;
                        }
                    }
                    C5pv A00 = MessagesCollection.A00(messagesCollection);
                    A00.A04 = false;
                    messagesCollection = A00.A00();
                }
                dataFetchDisposition.getClass();
                A0C = B8I.A0C(new FetchMoreRecentMessagesResult(dataFetchDisposition, messagesCollection, j2));
                i = -1213044302;
            }
            C00j.A01(i);
            return A0C;
        } catch (Throwable th) {
            C00j.A01(1568974024);
            throw th;
        }
    }

    public OperationResult A0c(1Tu r302, 1TC r303) {
        return A12(r302, r303);
    }

    public OperationResult A0d(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0e(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0f(1Tu r302, 1TC r303) {
        BlH blH = (BlH) this.A0O.get();
        FetchMoreVirtualFolderThreadsParams fetchMoreVirtualFolderThreadsParams = (FetchMoreVirtualFolderThreadsParams) r303.A00.getParcelable("fetchMoreVirtualFolderThreadsParamsSpec");
        fetchMoreVirtualFolderThreadsParams.getClass();
        1Hk r0 = fetchMoreVirtualFolderThreadsParams.A02;
        C00i c00i = blH.A01;
        CIK cik = (CIK) c00i.get();
        long j = fetchMoreVirtualFolderThreadsParams.A01;
        int i = fetchMoreVirtualFolderThreadsParams.A00;
        FetchVirtualFolderThreadsResult A02 = cik.A02(r0, i, j);
        ThreadsCollection A01 = A02.A01();
        if (!A01.A02 && A01.A01.size() < i) {
            FetchMoreThreadsResult fetchMoreThreadsResult = (FetchMoreThreadsResult) r302.BMQ(r303).A07();
            4yH A0X = AbM.A0X(blH.A00);
            SQLiteDatabase A00 = C10654u8.A00(A0X.A0G);
            C01m.A01(A00, -1584118664);
            try {
                try {
                    ThreadsCollection threadsCollection = fetchMoreThreadsResult.A03;
                    4yH.A0I(A0X, threadsCollection, r0);
                    4yH.A06(A0X, threadsCollection.A01, fetchMoreThreadsResult.A00);
                    ((CI4) A0X.A08.get()).A02(A00, fetchMoreThreadsResult.A05);
                    ImmutableList immutableList = fetchMoreThreadsResult.A06;
                    if (immutableList != null && !immutableList.isEmpty()) {
                        A0X.A0J.A01(immutableList);
                    }
                    1Du it = fetchMoreThreadsResult.A04.iterator();
                    while (it.hasNext()) {
                        4yH.A05(A0X, (MessagesCollection) it.next(), true);
                    }
                    A00.setTransactionSuccessful();
                    C01m.A03(A00, -456300932);
                    A02 = ((CIK) c00i.get()).A02(r0, i, j);
                } catch (SQLException e) {
                    4yH.A0A(e);
                    throw 0Q8.createAndThrow();
                }
            } catch (Throwable th) {
                C01m.A03(A00, 762511613);
                throw th;
            }
        }
        return B8I.A0C(A02);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v3 ??, still in use, count: 2, list:
          (r310v3 ??) from 0x05dd: PHI (r310v2 ??) = (r310v1 ??), (r310v3 ??) binds: [B:269:0x05d8, B:166:0x0568] A[DONT_GENERATE, DONT_INLINE]
          (r310v3 ?? I:X.5pc) from 0x056a: IPUT (r0v316 ?? I:com.facebook.fbservice.results.DataFetchDisposition), (r310v3 ?? I:X.5pc) A[Catch: all -> 0x07a9] X.5pc.A01 com.facebook.fbservice.results.DataFetchDisposition
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public com.facebook.fbservice.service.OperationResult A0g(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v3 ??, still in use, count: 2, list:
          (r310v3 ??) from 0x05dd: PHI (r310v2 ??) = (r310v1 ??), (r310v3 ??) binds: [B:269:0x05d8, B:166:0x0568] A[DONT_GENERATE, DONT_INLINE]
          (r310v3 ?? I:X.5pc) from 0x056a: IPUT (r0v316 ?? I:com.facebook.fbservice.results.DataFetchDisposition), (r310v3 ?? I:X.5pc) A[Catch: all -> 0x07a9] X.5pc.A01 com.facebook.fbservice.results.DataFetchDisposition
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public OperationResult A0h(1Tu r302, 1TC r303) {
        FetchThreadKeyByParticipantsParams fetchThreadKeyByParticipantsParams = (FetchThreadKeyByParticipantsParams) r303.A00.getParcelable("fetch_thread_with_participants_key");
        C4yl c4yl = (C4yl) this.A04.get();
        ImmutableSet immutableSet = fetchThreadKeyByParticipantsParams.A03;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!immutableSet.isEmpty()) {
            String A0T = 0Pz.A0T("count(*) = ", immutableSet.size());
            String A0j = 0Pz.A0j("type = '", "PARTICIPANT", "' ");
            String buildQueryString = SQLiteQueryBuilder.buildQueryString(false, "thread_participants", new String[]{"thread_key"}, A0j, "thread_key", A0T, null, null);
            StringBuilder A0n = AnonymousClass001.A0n(A0j);
            A0n.append(" AND ");
            A0n.append("user_key");
            A0n.append(" IN (");
            1Du it = immutableSet.iterator();
            while (it.hasNext()) {
                UserKey A0v = AbG.A0v(it);
                A0n.append("'");
                A0n.append(A0v.A05());
                A0n.append("',");
            }
            A0n.deleteCharAt(A0n.lastIndexOf(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
            AnonymousClass001.A1D(") AND ", "thread_key", " IN (", A0n);
            A0n.append(buildQueryString);
            A0n.append(")");
            String buildQueryString2 = SQLiteQueryBuilder.buildQueryString(false, "thread_participants", new String[]{"thread_key"}, A0n.toString(), "thread_key", A0T, null, null);
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            StringBuilder sb = new StringBuilder(512);
            sb.append("((");
            sb.append(buildQueryString2);
            sb.append(") ");
            sb.append("thread_participants");
            sb.append(" JOIN ");
            sb.append("threads");
            sb.append(" ON ");
            sb.append("thread_participants");
            sb.append(".");
            sb.append("thread_key");
            AnonymousClass001.A1D(" = ", "threads", ".", sb);
            sQLiteQueryBuilder.setTables(1BL.A0u("thread_key", ")", sb));
            C10714ue A0A = c4yl.A01.A0A(sQLiteQueryBuilder.query(C10654u8.A00(c4yl.A02), null, 0Pz.A0c(4YT.A00(418), " != ", AnonymousClass214.A03.dbValue), null, null, null, "timestamp_ms DESC"), (String) null);
            try {
                ThreadSummary BfR = A0A.BfR();
                while (true) {
                    ThreadSummary threadSummary = BfR;
                    if (threadSummary == null) {
                        break;
                    }
                    builder.m11011add((Object) threadSummary);
                    BfR = A0A.BfR();
                }
                A0A.close();
            } catch (Throwable th) {
                try {
                    A0A.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
        }
        return OperationResult.A04(new FetchThreadByParticipantsResult(ImmutableList.copyOf((Iterable) 2Ri.A03(fetchThreadKeyByParticipantsParams.A01, 1BK.A17(builder.build())))));
    }

    public OperationResult A0i(1Tu r302, 1TC r303) {
        FetchThreadMetadataParams fetchThreadMetadataParams = (FetchThreadMetadataParams) AbG.A07(r303.A00, "fetchThreadMetadataParams");
        20A A0J = AbM.A0J(this.A08);
        C1cm c1cm = C2rg.A07;
        ImmutableSet immutableSet = fetchThreadMetadataParams.A00;
        A0J.A05(c1cm, "fetchThreadMetadata (DSH). %s", new Object[]{immutableSet});
        return OperationResult.A04(new FetchThreadMetadataResult(((CI4) this.A0J.get()).A01(this.A01, immutableSet, fetchThreadMetadataParams.A01)));
    }

    public OperationResult A0j(1Tu r302, 1TC r303) {
        return A0g(r302, r303);
    }

    public OperationResult A0k(1Tu r302, 1TC r303) {
        0QO A08;
        int i;
        ThreadKey threadKey;
        ((CNR) this.A06.get()).A02();
        Bundle bundle = r303.A00;
        CallerContext callerContext = r303.A02;
        FetchThreadParams fetchThreadParams = (FetchThreadParams) bundle.getParcelable("fetchThreadParams");
        ThreadCriteria threadCriteria = fetchThreadParams.A05;
        ImmutableSet immutableSet = threadCriteria.A00;
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            MessagingPerformanceLogger.A03(this.A0F).A04(1BK.A01(AbG.A0k(it)), "db_thread_fetch");
        }
        AbM.A0J(this.A08).A05(C2rg.A07, "fetchThreads (DSH). %s", new Object[]{immutableSet});
        ArrayList A0s = AnonymousClass001.A0s();
        0QO r0 = new 0QO(0);
        0QO r02 = new 0QO(0);
        0QO r03 = new 0QO(0);
        HashSet A1E = AbF.A1E(immutableSet);
        0QO r04 = new 0QO(0);
        1Du it2 = immutableSet.iterator();
        while (it2.hasNext()) {
            r04.put(it2.next(), AnonymousClass001.A0u());
        }
        C00j.A05("DbServiceHandler.handleFetchThread", 616116590);
        try {
            int i2 = fetchThreadParams.A01;
            if (immutableSet.isEmpty()) {
                new 0QO(0);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A08 = B8I.A0F(this).A08(immutableSet, i2);
                long currentTimeMillis2 = (System.currentTimeMillis() - currentTimeMillis) / Math.max(immutableSet.size(), 1);
                int size = A08.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object A04 = A08.A04(i3);
                    FetchThreadResult fetchThreadResult = (FetchThreadResult) A08.A06(i3);
                    java.util.Map map = (java.util.Map) r04.get(A04);
                    map.put("fetch_location", "THREAD_DB");
                    map.put("thread_db_duration", Long.toString(currentTimeMillis2));
                    fetchThreadResult.A00 = map;
                }
            }
            1He r05 = fetchThreadParams.A03;
            boolean A1a = 1BL.A1a(this.A0G);
            int size2 = A08.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ThreadKey threadKey2 = (ThreadKey) A08.A04(i4);
                FetchThreadResult fetchThreadResult2 = (FetchThreadResult) A08.A06(i4);
                ThreadSummary threadSummary = fetchThreadResult2.A05;
                if (A1a && threadSummary != null && fetchThreadResult2.A03 != null && fetchThreadResult2.A03.A06(i2) && fetchThreadResult2.A05.A2b) {
                    DataFetchDisposition dataFetchDisposition = DataFetchDisposition.A09;
                    C5pc A03 = A03(fetchThreadResult2);
                    A03.A00 = 1BL.A08(this.A02);
                    fetchThreadResult2 = A03.A00();
                } else if (!ThreadKey.A0l(threadKey2)) {
                    if (FetchThreadResult.A00(fetchThreadParams, fetchThreadResult2)) {
                        r0.put(threadKey2, fetchThreadResult2);
                    } else if (r05 != 1He.A03) {
                        r02.put(threadKey2, fetchThreadResult2);
                    }
                }
                r03.put(threadKey2, fetchThreadResult2);
            }
            int size3 = r03.size();
            for (int i5 = 0; i5 < size3; i5++) {
                A0s.add((FetchThreadResult) r03.A06(i5));
                A1E.remove(r03.A04(i5));
            }
            if (!r02.isEmpty()) {
                0QO r06 = new 0QO(0);
                HashMap A0u = AnonymousClass001.A0u();
                boolean A1W = AnonymousClass001.A1W(r05, 1He.A05);
                int size4 = r02.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    Object A042 = r02.A04(i6);
                    FetchThreadResult fetchThreadResult3 = (FetchThreadResult) r02.A06(i6);
                    if (fetchThreadResult3.A05 != null && fetchThreadResult3.A03 != null && !fetchThreadResult3.A03.A01.isEmpty() && !fetchThreadResult3.A05.A0g.A02()) {
                        if (A1W) {
                            r06.put(A042, fetchThreadResult3);
                        } else {
                            A0u.put(A042, fetchThreadResult3);
                        }
                    }
                }
                if (!A0u.isEmpty()) {
                    1He r344 = fetchThreadParams.A04;
                    ImmutableList immutableList = fetchThreadParams.A06;
                    boolean z = fetchThreadParams.A0A;
                    boolean z2 = fetchThreadParams.A08;
                    boolean z3 = fetchThreadParams.A07;
                    boolean z4 = fetchThreadParams.A00;
                    boolean z5 = fetchThreadParams.A09;
                    long j = fetchThreadParams.A02;
                    String str = threadCriteria.A01;
                    Set keySet = A0u.keySet();
                    11T.A0F(keySet, 1);
                    ThreadCriteria threadCriteria2 = new ThreadCriteria(str, keySet);
                    if (r344 == null) {
                        r344 = r05;
                    }
                    try {
                        ArrayList A0t = AnonymousClass001.A0t(A0u.size());
                        HashMap A0u2 = AnonymousClass001.A0u();
                        Iterator A0x = AnonymousClass001.A0x(A0u);
                        while (A0x.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0x);
                            Object key = A0z.getKey();
                            FetchThreadResult fetchThreadResult4 = (FetchThreadResult) A0z.getValue();
                            if (r05 == 1He.A02 || fetchThreadResult4.A02.A04.asBoolean(false)) {
                                A0u2.put(key, fetchThreadResult4);
                            } else {
                                A0t.add(fetchThreadResult4);
                            }
                        }
                        1He r07 = 1He.A02;
                        String str2 = threadCriteria2.A01;
                        Set keySet2 = A0u2.keySet();
                        11T.A0F(keySet2, 1);
                        ArrayList A0C = r302.BMQ(new 1TC(AbH.A05(new FetchThreadParams(r07, r344, new ThreadCriteria(str2, keySet2), immutableList, i2, j, z3, z2, z4, z5, z), "fetchThreadParams"), this.A01, callerContext, (1Se) null, (1SZ) null, "fetch_threads", (String) null)).A0C();
                        if (A0C != null) {
                            Iterator it3 = A0C.iterator();
                            while (it3.hasNext()) {
                                FetchThreadResult fetchThreadResult5 = (FetchThreadResult) it3.next();
                                ThreadSummary threadSummary2 = fetchThreadResult5.A05;
                                if (threadSummary2 != null) {
                                    ThreadKey threadKey3 = threadSummary2.A0n;
                                    FetchThreadResult fetchThreadResult6 = (FetchThreadResult) A0u2.get(threadKey3);
                                    MessagesCollection A02 = fetchThreadResult6 != null ? fetchThreadResult6.A03 : MessagesCollection.A02(threadKey3);
                                    Message A022 = A02(A02);
                                    SQLiteDatabase A00 = C10654u8.A00(this.A0C);
                                    C01m.A01(A00, -1715874951);
                                    try {
                                        A06(A022, fetchThreadResult5);
                                        B8I.A0G(this).A0b(fetchThreadResult6, fetchThreadResult5, "fetchMoreRecentMessagesFromServerIfNeeded");
                                        A00.setTransactionSuccessful();
                                        C01m.A03(A00, -1652909740);
                                        if (A02 == null) {
                                            A02 = fetchThreadResult5.A03;
                                            A02.getClass();
                                        } else {
                                            MessagesCollection messagesCollection = fetchThreadResult5.A03;
                                            if (messagesCollection != null) {
                                                A02 = C12014yf.A00(messagesCollection, A02, (C12014yf) this.A0A.get(), true);
                                            }
                                        }
                                        C5pc c5pc = new C5pc();
                                        c5pc.A01 = DataFetchDisposition.A0H;
                                        c5pc.A04 = threadSummary2;
                                        c5pc.A02 = A02;
                                        c5pc.A06 = fetchThreadResult5.A07;
                                        c5pc.A00 = 1BL.A08(this.A02);
                                        A0t.add(c5pc.A00());
                                    } catch (Throwable th) {
                                        C01m.A03(A00, 1934049121);
                                        throw th;
                                    }
                                }
                            }
                        }
                        Iterator it4 = A0t.iterator();
                        while (it4.hasNext()) {
                            A04(r302, fetchThreadParams, (FetchThreadResult) it4.next());
                        }
                        0QO A082 = B8I.A0F(this).A08(A0u.keySet(), i2);
                        int size5 = A082.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            Object A043 = A082.A04(i7);
                            FetchThreadResult fetchThreadResult7 = (FetchThreadResult) A082.A06(i7);
                            FetchThreadResult fetchThreadResult8 = FetchThreadResult.A0C;
                            C5pc c5pc2 = new C5pc(fetchThreadResult7);
                            c5pc2.A01 = DataFetchDisposition.A0H;
                            r06.put(A043, c5pc2.A00());
                        }
                    } catch (IOException e) {
                        if (r344 == 1He.A02) {
                            throw e;
                        }
                        Iterator A19 = 1BK.A19(A0u);
                        while (A19.hasNext()) {
                            Object next = A19.next();
                            FetchThreadResult fetchThreadResult9 = (FetchThreadResult) A0u.get(next);
                            FetchThreadResult fetchThreadResult10 = FetchThreadResult.A0C;
                            C5pc c5pc3 = new C5pc();
                            c5pc3.A01 = DataFetchDisposition.A09;
                            c5pc3.A04 = fetchThreadResult9.A05;
                            c5pc3.A02 = fetchThreadResult9.A03;
                            c5pc3.A09 = fetchThreadResult9.A00;
                            c5pc3.A06 = fetchThreadResult9.A07;
                            c5pc3.A00 = fetchThreadResult9.A01;
                            r06.put(next, c5pc3.A00());
                        }
                    }
                }
                int size6 = r06.size();
                for (int i8 = 0; i8 < size6; i8++) {
                    A0s.add((FetchThreadResult) r06.A06(i8));
                    A1E.remove(r06.A04(i8));
                }
            }
            if (!A1E.isEmpty()) {
                String str3 = r303.A05;
                String str4 = r303.A06;
                1SZ r08 = r303.A04;
                FbUserSession fbUserSession = r303.A01;
                1Se r09 = r303.A03;
                bundle.putParcelable("fetchThreadParams", new FetchThreadParams(r05, fetchThreadParams.A04, new ThreadCriteria(threadCriteria.A01, A1E), fetchThreadParams.A06, i2, fetchThreadParams.A02, fetchThreadParams.A07, fetchThreadParams.A08, fetchThreadParams.A00, fetchThreadParams.A09, fetchThreadParams.A0A));
                1TC r010 = new 1TC(bundle, fbUserSession, callerContext, r09, r08, str4, str3);
                0QO r011 = new 0QO(0);
                r011.A09(r0);
                r011.A09(r02);
                int i9 = ((FetchThreadParams) r010.A00.getParcelable("fetchThreadParams")).A01;
                ArrayList A0s2 = AnonymousClass001.A0s();
                OperationResult BMQ = r302.BMQ(r010);
                ArrayList A0s3 = AnonymousClass001.A0s();
                ArrayList A0C2 = BMQ.A0C();
                if (A0C2 != null) {
                    A0s3.addAll(A0C2);
                }
                Iterator it5 = A0s3.iterator();
                while (it5.hasNext()) {
                    FetchThreadResult fetchThreadResult11 = (FetchThreadResult) it5.next();
                    if (fetchThreadResult11 != FetchThreadResult.A0C) {
                        ThreadSummary threadSummary3 = fetchThreadResult11.A05;
                        FetchThreadResult fetchThreadResult12 = null;
                        if (threadSummary3 != null) {
                            threadKey = threadSummary3.A0n;
                            fetchThreadResult12 = (FetchThreadResult) r011.get(threadKey);
                        } else {
                            threadKey = null;
                        }
                        boolean z6 = false;
                        if (fetchThreadResult12 != null) {
                            MessagesCollection messagesCollection2 = fetchThreadResult12.A03;
                            if (messagesCollection2 != null && !messagesCollection2.A01.isEmpty()) {
                                z6 = true;
                            }
                            A0B(fetchThreadResult12, fetchThreadResult11);
                        }
                        java.util.Map map2 = fetchThreadResult11.A00;
                        HashMap A0u3 = AnonymousClass001.A0u();
                        if (map2 != null) {
                            A0u3.putAll(map2);
                        }
                        if (r04.containsKey(threadKey)) {
                            A0u3.put("thread_db_duration", ((java.util.Map) r04.get(threadKey)).get("thread_db_duration"));
                        }
                        fetchThreadResult11.A00 = A0u3;
                        if (threadSummary3 != null && z6) {
                            fetchThreadResult11 = B8I.A0F(this).A0H(threadKey, i9);
                        }
                        C5pc c5pc4 = new C5pc(fetchThreadResult11);
                        c5pc4.A09 = A0u3;
                        c5pc4.A01 = DataFetchDisposition.A0H;
                        A0s2.add(c5pc4.A00());
                    }
                }
                A0s.addAll(A0s2);
            }
            if (A0s.isEmpty()) {
                A0s.add(FetchThreadResult.A0C);
            }
            OperationResult A06 = OperationResult.A06(A0s);
            if (A1E.isEmpty()) {
                Bundle bundle2 = A06.resultDataBundle;
                if (bundle2 != null) {
                    bundle2.putString(Property.SYMBOL_Z_ORDER_SOURCE, EntityEnrichmentPluginPostmailbox.DB_FILE_EXTENSION);
                }
                i = -19766471;
            } else {
                BRq.A00(A06);
                i = -1472738964;
            }
            C00j.A01(i);
            return A06;
        } catch (Throwable th2) {
            C00j.A01(264662857);
            throw th2;
        }
    }

    public OperationResult A0l(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0m(1Tu r302, 1TC r303) {
        ThreadKey threadKey;
        0fH.A0j("DbServiceHandler", "Fetching unread messages from db");
        FetchUnreadMessageParams fetchUnreadMessageParams = (FetchUnreadMessageParams) r303.A00.getParcelable("fetchUnreadMessageParams");
        HashSet A0v = AnonymousClass001.A0v();
        if (fetchUnreadMessageParams != null && (threadKey = fetchUnreadMessageParams.A01) != null) {
            A0v.add(threadKey);
        }
        C4yz A0F = B8I.A0F(this);
        int i = fetchUnreadMessageParams.A00;
        HashMap A0u = AnonymousClass001.A0u();
        ArrayList A0s = AnonymousClass001.A0s();
        C00j.A05("DbFetchThreadHandler.fetchUnreadThreads", 1016260029);
        try {
            4cN r0 = new 4cN();
            r0.A04(new C1637Aof(1BJ.A00(574), ConstantsKt.CAMERA_ID_FRONT));
            if (!A0v.isEmpty()) {
                r0.A04(new 4sQ("thread_key", A0v));
            }
            Cursor A07 = ((C7d2) A0F.A0C.get()).A07(C10654u8.A00(A0F.A0B), r0.A02(), 4YT.A00(1536), C10714ue.A04, r0.A03());
            if (A07 != null) {
                C10714ue A0A = A0F.A04.A0A(A07, (String) null);
                while (true) {
                    try {
                        C7pQ A00 = A0A.A00();
                        if (A00 == null) {
                            break;
                        }
                        A0s.add(A00.A01);
                    } finally {
                    }
                }
                A0A.close();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
            C00j.A01(430918334);
            1Du it = copyOf.iterator();
            while (it.hasNext()) {
                ThreadSummary A0j = AbF.A0j(it);
                MessagesCollection messagesCollection = A0F.A0F(A0j.A0n, " DESC", i, A0j.A0C + 1, -1).A02;
                if (messagesCollection != null && !messagesCollection.A01.isEmpty()) {
                    A0u.put(A0j, messagesCollection);
                }
            }
            return OperationResult.A04(new FetchUnreadMessageResult(ImmutableMap.copyOf((java.util.Map) A0u)));
        } catch (Throwable th) {
            C00j.A01(-1448917450);
            throw th;
        }
    }

    public OperationResult A0n(1Tu r302, 1TC r303) {
        return r302.BMQ(r303);
    }

    public OperationResult A0o(1Tu r302, 1TC r303) {
        BlH blH = (BlH) this.A0O.get();
        FetchVirtualFolderThreadsParams fetchVirtualFolderThreadsParams = (FetchVirtualFolderThreadsParams) r303.A00.getParcelable("fetchVirtualFolderThreadsParamsSpec");
        fetchVirtualFolderThreadsParams.getClass();
        1Hk r0 = fetchVirtualFolderThreadsParams.A01;
        C00i c00i = blH.A01;
        CIK cik = (CIK) c00i.get();
        int i = fetchVirtualFolderThreadsParams.A00;
        FetchVirtualFolderThreadsResult A01 = cik.A01(r0, i);
        if (A01.A00() == DataFetchDisposition.A0I) {
            FetchThreadListResult fetchThreadListResult = (FetchThreadListResult) r302.BMQ(r303).A07();
            4yH A0X = AbM.A0X(blH.A00);
            C00i c00i2 = A0X.A0G;
            SQLiteDatabase A00 = C10654u8.A00(c00i2);
            C01m.A01(A00, -699747092);
            try {
                try {
                    6E9 r02 = (6E9) A0X.A07.get();
                    C11644x6 A02 = AbstractC11664x8.A02(r0);
                    long j = fetchThreadListResult.A00;
                    r02.A03(A02, Long.toString(j));
                    r02.A03((C11644x6) AbstractC11664x8.A06.A0D("virtual_folders/").A0D(r0.dbName).A0D("/threads_table_out_of_date"), ConstantsKt.CAMERA_ID_FRONT);
                    SQLiteDatabase A002 = C10654u8.A00(c00i2);
                    C01m.A01(A002, -1774943366);
                    try {
                        try {
                            A002.delete("virtual_folders", "virtual_folder=?", new String[]{r0.dbName});
                            A002.setTransactionSuccessful();
                            C01m.A03(A002, 1861816305);
                            ThreadsCollection threadsCollection = fetchThreadListResult.A07;
                            4yH.A0I(A0X, threadsCollection, r0);
                            ImmutableList A06 = 4yH.A06(A0X, threadsCollection.A01, j);
                            1Du it = fetchThreadListResult.A08.iterator();
                            while (it.hasNext()) {
                                4yH.A05(A0X, (MessagesCollection) it.next(), true);
                            }
                            A0X.A0J.A01(fetchThreadListResult.A0A);
                            NotificationSetting notificationSetting = fetchThreadListResult.A06;
                            if (notificationSetting != null) {
                                1Ql A0V = 1BL.A0V(A0X.A0B);
                                A0V.CaH(1NK.A3l, notificationSetting.A00());
                                A0V.commit();
                                A0X.A0N.A00();
                            }
                            ((CI4) A0X.A08.get()).A02(A00, fetchThreadListResult.A09);
                            A00.setTransactionSuccessful();
                            1V0 r03 = new 1V0();
                            r03.A00(fetchThreadListResult);
                            r03.A07 = new ThreadsCollection(A06, threadsCollection.A02);
                            new FetchThreadListResult(r03);
                            C01m.A03(A00, -488751750);
                            A01 = ((CIK) c00i.get()).A01(r0, i);
                        } catch (Throwable th) {
                            C01m.A03(A002, 265020852);
                            throw th;
                        }
                    } catch (SQLException e) {
                        4yH.A0A(e);
                        throw 0Q8.createAndThrow();
                    }
                } catch (SQLException e2) {
                    4yH.A0A(e2);
                    throw 0Q8.createAndThrow();
                }
            } catch (Throwable th2) {
                C01m.A03(A00, -774856838);
                throw th2;
            }
        }
        return B8I.A0C(A01);
    }

    public OperationResult A0p(1Tu r302, 1TC r303) {
        1F9 A00 = 1F9.A00(r303.A00.getString("folderName"));
        OperationResult BMQ = r302.BMQ(r303);
        if (BMQ != null && BMQ.success) {
            long A08 = 1BL.A08(this.A02);
            4yH A0G = B8I.A0G(this);
            FolderCounts A02 = A0G.A0I.A02(A00.dbName);
            if (A02 != null) {
                4yH.A0B(A0G, new FolderCounts(A02.A00, 0, A08), A00.dbName);
            }
            BMQ = OperationResult.A04(new MarkFolderSeenResult(A00, A08));
        }
        return BMQ;
    }

    public OperationResult A0q(1Tu r302, 1TC r303) {
        B8I.A0G(this).A0d((MarkThreadsParams) r303.A00.getParcelable(1BJ.A00(197)));
        return r302.BMQ(r303);
    }

    public OperationResult A0r(1Tu r302, 1TC r303) {
        FetchThreadResult A0c = AbM.A0c(r302.BMQ(r303));
        if (A0c != null && A0c.A05 != null) {
            B8I.A0G(this).A0c(A0c, "handleModifyThread");
        }
        return OperationResult.A04(A0c);
    }

    public OperationResult A0s(1Tu r302, 1TC r303) {
        SaveDraftParams saveDraftParams = (SaveDraftParams) AbG.A07(r303.A00, "saveDraftParams");
        B8I.A0G(this).A0Y(saveDraftParams.A00, saveDraftParams.A01);
        return OperationResult.A00;
    }

    public OperationResult A0t(1Tu r302, 1TC r303) {
        Bundle bundle = r303.A00;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("updated_attachments_list");
        ThreadKey threadKey = (ThreadKey) bundle.getParcelable("thread_key");
        String string = bundle.getString("updated_view_state");
        if (!09K.A00(stringArrayList) || threadKey == null || string == null) {
            return r302.BMQ(r303);
        }
        EphemeralMediaState A00 = EphemeralMediaState.A00(string);
        java.util.Map A0K = B8I.A0F(this).A0K(stringArrayList, Collections.EMPTY_LIST);
        4yH A0G = B8I.A0G(this);
        ImmutableList A002 = C6p5.A00(A00, A0K.values());
        SQLiteDatabase A003 = C10654u8.A00(A0G.A0G);
        boolean z = !A003.inTransaction();
        if (z) {
            C01m.A01(A003, -1706604161);
        }
        try {
            1Du it = A002.iterator();
            while (it.hasNext()) {
                Attachment attachment = (Attachment) it.next();
                ContentValues A07 = 4YU.A07();
                String str = attachment.A0K;
                A07.put(TraceFieldType.MsgId, str);
                A07.put("attachments", A0G.A0K.A04(ImmutableList.of((Object) attachment)));
                A07.put("thread_key", threadKey.A0u());
                A003.update("messages", A07, "msg_id=?", new String[]{str});
            }
            if (z) {
                A003.setTransactionSuccessful();
                C01m.A03(A003, -1660865114);
            }
            return OperationResult.A05("ephemeral_media_view_state_updated", new Pair("thread_key", threadKey));
        } catch (Throwable th) {
            if (z) {
                C01m.A03(A003, 716685147);
            }
            throw th;
        }
    }

    public OperationResult A0u(1Tu r302, 1TC r303) {
        UpdateFolderCountsParams updateFolderCountsParams = (UpdateFolderCountsParams) r303.A00.getParcelable("updateFolderCountsParams");
        4yH A0G = B8I.A0G(this);
        C4yl c4yl = A0G.A0I;
        1F9 r0 = updateFolderCountsParams.A02;
        FolderCounts A02 = c4yl.A02(r0.dbName);
        FolderCounts folderCounts = new FolderCounts(updateFolderCountsParams.A00, updateFolderCountsParams.A01, A02 == null ? 0L : A02.A02);
        4yH.A0B(A0G, folderCounts, r0.dbName);
        return OperationResult.A04(new UpdateFolderCountsResult(folderCounts));
    }

    public OperationResult A0v(1Tu r302, 1TC r303) {
        Bundle bundle = r303.A00;
        String string = bundle.getString("messageId");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("overlays");
        CCe cCe = (CCe) this.A0I.get();
        String A00 = 4YT.A00(397);
        SQLiteDatabase A01 = C10654u8.A01(cCe.A01);
        C01m.A01(A01, 304185852);
        try {
            2V0 A0G = AbF.A0G(TraceFieldType.MsgId, string);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                MontageFeedbackPoll montageFeedbackPoll = ((MontageFeedbackOverlay) it.next()).A03;
                if (montageFeedbackPoll != null) {
                    String str = montageFeedbackPoll.A04;
                    2V0 A0G2 = AbF.A0G("poll_id", str);
                    4cN A002 = 4cM.A00(new 2V0[]{A0G, A0G2});
                    ContentValues A07 = 4YU.A07();
                    A07.put("can_viewer_vote", Boolean.valueOf(montageFeedbackPoll.A08));
                    4YU.A1E(A07, "viewer_vote_index", montageFeedbackPoll.A00);
                    AbN.A0q(A07, A01, A002, "montage_message_poll");
                    4YW.A0C(A01, A0G2, A00);
                    1Du it2 = montageFeedbackPoll.A03.iterator();
                    while (it2.hasNext()) {
                        MontageFeedbackPollOption montageFeedbackPollOption = (MontageFeedbackPollOption) it2.next();
                        ContentValues A072 = 4YU.A07();
                        A072.put("poll_id", str);
                        4YU.A1E(A072, "option_index", montageFeedbackPollOption.A01);
                        A072.put("option_text", montageFeedbackPollOption.A04);
                        4YU.A1E(A072, "vote_count", montageFeedbackPollOption.A03);
                        C01m.A00(-561136592);
                        A01.insert(A00, null, A072);
                        C01m.A00(1922683611);
                    }
                }
            }
            A01.setTransactionSuccessful();
            C01m.A03(A01, 1640322144);
            return OperationResult.A00;
        } catch (Throwable th) {
            C01m.A03(A01, -708254878);
            throw th;
        }
    }

    public OperationResult A0w(1Tu r302, 1TC r303) {
        Bundle bundle = r303.A00;
        long j = bundle.getLong("offline_threading_id");
        AnonymousClass214 anonymousClass214 = (AnonymousClass214) bundle.getSerializable("state");
        ThreadKey A0E = ThreadKey.A0E(j);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("cant_message_users");
        4yH A0G = B8I.A0G(this);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) parcelableArrayList);
        SQLiteDatabase A00 = C10654u8.A00(A0G.A0G);
        C01m.A01(A00, 2124548983);
        try {
            try {
                ContentValues A07 = 4YU.A07();
                4YU.A1E(A07, 4YT.A00(418), anonymousClass214.dbValue);
                AnonymousClass214 anonymousClass2142 = AnonymousClass214.A03;
                if (anonymousClass214 == anonymousClass2142) {
                    A07.put("can_reply_to", (Boolean) false);
                }
                A00.update("threads", A07, "thread_key=?", new String[]{A0E.A0u()});
                if (anonymousClass214 == anonymousClass2142 && 09K.A00(copyOf)) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    1Du it = copyOf.iterator();
                    while (it.hasNext()) {
                        builder.m11011add((Object) AbG.A0t(it).A0k);
                    }
                    4cN A002 = 4cM.A00(new 2V0[]{AbF.A0G("thread_key", A0E.A0u()), new 4sQ("user_key", builder.build())});
                    ContentValues A072 = 4YU.A07();
                    A072.put("can_viewer_message_participant", (Boolean) false);
                    A00.update("thread_participants", A072, A002.A02(), A002.A03());
                }
                A00.setTransactionSuccessful();
                C01m.A03(A00, 1247203839);
                return OperationResult.A04(B8I.A0F(this).A0H(A0E, 0));
            } catch (SQLException e) {
                4yH.A0A(e);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            C01m.A03(A00, 1249287207);
            throw th;
        }
    }

    public OperationResult A0x(1Tu r302, 1TC r303) {
        User A00;
        UpdateProfilePicUriWithFilePathParams updateProfilePicUriWithFilePathParams = (UpdateProfilePicUriWithFilePathParams) r303.A00.getParcelable(1BJ.A00(2116));
        if (updateProfilePicUriWithFilePathParams != null && (A00 = ((23F) this.A0N.get()).A00(updateProfilePicUriWithFilePathParams.A00)) != null) {
            4yH A0G = B8I.A0G(this);
            1Kh A0u = AbH.A0u(A00);
            A0u.A0h = updateProfilePicUriWithFilePathParams.A01;
            A0G.A0J.A01(ImmutableList.of((Object) AbF.A0w(A0u)));
        }
        return OperationResult.A00;
    }

    public OperationResult A0y(1Tu r302, 1TC r303) {
        UpdateVanishModeSelectionParams updateVanishModeSelectionParams = (UpdateVanishModeSelectionParams) AbG.A07(r303.A00, "updateVanishModeSelectionParams");
        ThreadSummary threadSummary = B8I.A0F(this).A0H(updateVanishModeSelectionParams.A01, 0).A05;
        if (threadSummary != null) {
            4yH r0 = (4yH) this.A05.get();
            long j = updateVanishModeSelectionParams.A00;
            AnonymousClass219 anonymousClass219 = updateVanishModeSelectionParams.A02;
            long A08 = 1BL.A08(this.A02);
            C1zm A0g = AbF.A0g(threadSummary);
            A0g.A0P = j;
            A0g.A14 = anonymousClass219;
            String A00 = 1BJ.A00(583);
            C1pq.A08(A00, anonymousClass219);
            C1zm.A00(A0g, A00);
            ThreadSummary A0E = AbO.A0E(r0, A0g, A08);
            if (A0E != null) {
                return OperationResult.A04(new UpdateVanishModeSelectionResult(A0E));
            }
        }
        return OperationResult.A00;
    }

    public OperationResult A0z(1Tu r302, 1TC r303) {
        UpdateVanishingModePairedTimestampParams updateVanishingModePairedTimestampParams = (UpdateVanishingModePairedTimestampParams) AbG.A07(r303.A00, "updateVanishingModePairedTimestamp");
        ThreadSummary threadSummary = B8I.A0F(this).A0H(updateVanishingModePairedTimestampParams.A01, 0).A05;
        if (threadSummary != null) {
            4yH A0G = B8I.A0G(this);
            long j = updateVanishingModePairedTimestampParams.A00;
            C1zm A0g = AbF.A0g(threadSummary);
            A0g.A0G = j;
            ThreadSummary A0E = AbO.A0E(A0G, A0g, j);
            if (A0E != null) {
                return OperationResult.A04(new UpdateVanishingModePairedTimestampResult(A0E));
            }
        }
        return OperationResult.A00;
    }
}
