package com.facebook.messaging.threadview.jumppill;

import X.0Q8;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Du;
import X.1Iw;
import X.1Lm;
import X.2Gt;
import X.4YU;
import X.5zD;
import X.6F2;
import X.6Fh;
import X.6Fx;
import X.6Hs;
import X.6Mp;
import X.6Mq;
import X.6N0;
import X.6N5;
import X.6NC;
import X.7vV;
import X.AnonymousClass622;
import X.AnonymousClass624;
import X.AnonymousClass626;
import X.AnonymousClass811;
import X.C00653oY;
import X.C04I;
import X.C06w;
import X.C06z;
import X.C12114ys;
import X.C1t1;
import X.C1t3;
import X.C6Ff;
import X.C6N1;
import X.C7aB;
import X.C7ub;
import X.C80s;
import X.C89p;
import X.Fjy;
import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.jumppill.UnopenedContentPillController;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: UnopenedContentPillController.class */
public final class UnopenedContentPillController {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(UnopenedContentPillController.class, "messageClassifier", "getMessageClassifier()Lcom/facebook/messaging/messageclassifier/MessageClassifier;", 0), new C06w(UnopenedContentPillController.class, "attachmentDataFactory", "getAttachmentDataFactory()Lcom/facebook/messaging/attachments/AttachmentDataFactory;", 0), new C06w(UnopenedContentPillController.class, "jumpPillLogger", "getJumpPillLogger()Lcom/facebook/messaging/threadview/jumppill/JumpPillLogger;", 0)};
    public static final 6NC Companion = new Object();
    public static final int FALLBACK_NUMBER_OF_MESSAGES_VISIBLE = 5;
    public static final int MAX_UNREAD_COUNT_THRESHOLD = 200;
    public static final int PILL_APPEAR_ANIMATION_START_DIP = 50;
    public static final int PRECALCULATED_INITIALISED_POSITION = Integer.MIN_VALUE;
    public final 1Br attachmentDataFactory$delegate;
    public final 6Mq callback;
    public final 1Iw compContext;
    public C6N1 componentCallback;
    public AnonymousClass811 containerView;
    public final Context context;
    public final FbUserSession fbUserSession;
    public int firstUnreadPosition;
    public TriState includeLastMessageInThreadLocal;
    public boolean isInSearchInChat;
    public boolean isVisible;
    public final 1Br jumpPillLogger$delegate;
    public long lastMessageAtInit;
    public long lastReadTimestamp;
    public final 1Br messageClassifier$delegate;
    public final 6Fh messageListHelper;
    public boolean messageLoadRequested;
    public final FrameLayout parentView;
    public boolean pillDismissedByUserAction;
    public String pillId;
    public final C1t1 schemeUpdateObserver;
    public ThreadSummary threadSummaryLocal;
    public final 6N0 unopenedContentGatingUtil;
    public int unreadCount;
    public ImmutableList unreadMessagesCollection;

    public UnopenedContentPillController(Context context, FbUserSession fbUserSession, FrameLayout frameLayout, 6Fh r305, 6Mq r306) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(frameLayout, 3);
        11T.A0F(r305, 4);
        this.context = context;
        this.fbUserSession = fbUserSession;
        this.parentView = frameLayout;
        this.messageListHelper = r305;
        this.callback = r306;
        final int i = 3;
        this.componentCallback = new 7vV(this, 3);
        this.includeLastMessageInThreadLocal = TriState.UNSET;
        this.compContext = new 1Iw(context);
        this.unopenedContentGatingUtil = new 6N0();
        this.messageClassifier$delegate = 1Bq.A00(32769);
        this.attachmentDataFactory$delegate = 1Bq.A00(49420);
        this.jumpPillLogger$delegate = 1Bq.A00(100022);
        this.schemeUpdateObserver = new C1t1(this, i) { // from class: X.9zb
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            @Override // X.C1t1
            public void CIs() {
                int i2 = this.A00;
                Object obj = this.A01;
                switch (i2) {
                    case 0:
                        6N4 r0 = (6N4) obj;
                        if (r0.A0A) {
                            6N4.A00(r0.A04, r0);
                            return;
                        }
                        return;
                    case 1:
                        6Mz r02 = (6Mz) obj;
                        if (r02.A08) {
                            6Mz.A02(r02);
                            return;
                        }
                        return;
                    case 2:
                        6N2 r03 = (6N2) obj;
                        if (r03.A03) {
                            6N2.A00(r03);
                            return;
                        }
                        return;
                    case 3:
                        UnopenedContentPillController unopenedContentPillController = (UnopenedContentPillController) obj;
                        if (unopenedContentPillController.isVisible) {
                            unopenedContentPillController.show(unopenedContentPillController.unreadMessagesCollection);
                            return;
                        }
                        return;
                    default:
                        6N6 r04 = (6N6) obj;
                        if (r04.A04) {
                            6N6.A00(r04);
                            return;
                        }
                        return;
                }
            }
        };
        this.componentCallback = new 7vV(this, 2);
    }

    private final int computeNumberToLoad() {
        C7aB c7aB;
        int i = this.unreadCount;
        int positionWithMessageId = getPositionWithMessageId(this.lastMessageAtInit);
        while (true) {
            int i2 = positionWithMessageId;
            if (-1 >= i2) {
                break;
            }
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) ((C6Ff) this.messageListHelper).A0Q.get(i2);
            11T.A0A(anonymousClass624);
            if (anonymousClass624 instanceof AnonymousClass622) {
                i--;
            } else {
                if (anonymousClass624 instanceof C89p) {
                    C89p c89p = (C89p) anonymousClass624;
                    if (!c89p.A01) {
                        c7aB = c89p.A00;
                        i -= c7aB.A00.size();
                    }
                }
                if (anonymousClass624 instanceof Fjy) {
                    Fjy fjy = (Fjy) anonymousClass624;
                    if (!fjy.A03) {
                        c7aB = fjy.A02;
                        i -= c7aB.A00.size();
                    }
                }
            }
            if (i <= 0) {
                i = 0;
                break;
            }
            positionWithMessageId = i2 - 1;
        }
        return i;
    }

    private final C12114ys getAttachmentDataFactory() {
        return (C12114ys) 1Br.A0B(this.attachmentDataFactory$delegate);
    }

    private final int getFirstMessageCollectionPositionInternal() {
        int size = ((C6Ff) this.messageListHelper).A0Q.size();
        int i = 0;
        boolean z = false;
        while (true) {
            ImmutableList immutableList = ((C6Ff) this.messageListHelper).A0Q;
            if (i >= size) {
                return immutableList.size();
            }
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) immutableList.get(i);
            11T.A0A(anonymousClass624);
            if (anonymousClass624 instanceof AnonymousClass622) {
                if (((AnonymousClass622) anonymousClass624).A03.A05 >= this.lastReadTimestamp) {
                    int i2 = -1;
                    if (z) {
                        i2 = i + 1;
                    }
                    return i2;
                }
                z = true;
            }
            i++;
        }
    }

    private final int getFirstUnopenedPositionInternal() {
        int size = ((C6Ff) this.messageListHelper).A0Q.size();
        int i = 0;
        boolean z = false;
        while (true) {
            C6Ff c6Ff = (C6Ff) this.messageListHelper;
            if (i >= size) {
                return c6Ff.A0Q.size();
            }
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) c6Ff.A0Q.get(i);
            11T.A0A(anonymousClass624);
            if (anonymousClass624 instanceof AnonymousClass622) {
                Message message = ((AnonymousClass622) anonymousClass624).A03;
                if (message.A05 >= this.lastReadTimestamp && messageHasUnopenedContent(message)) {
                    if (!z) {
                        i = -1;
                    }
                    return i;
                }
                z = true;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final 6N5 getJumpPillLogger() {
        return (6N5) 1Br.A0B(this.jumpPillLogger$delegate);
    }

    private final long getLastMessageId() {
        AnonymousClass626 anonymousClass626;
        int size = ((C6Ff) this.messageListHelper).A0Q.size();
        do {
            size--;
            if (-1 >= size) {
                return 0L;
            }
            anonymousClass626 = (AnonymousClass626) ((C6Ff) this.messageListHelper).A0Q.get(size);
            11T.A0A(anonymousClass626);
        } while (!(anonymousClass626 instanceof AnonymousClass622));
        return anonymousClass626.AsR();
    }

    private final C00653oY getMessageClassifier() {
        return (C00653oY) 1Br.A0B(this.messageClassifier$delegate);
    }

    private final int getPositionWithMessageId(long j) {
        int size = ((C6Ff) this.messageListHelper).A0Q.size();
        while (true) {
            size--;
            ImmutableList immutableList = ((C6Ff) this.messageListHelper).A0Q;
            if (-1 >= size) {
                return immutableList.size() - 1;
            }
            AnonymousClass626 anonymousClass626 = (AnonymousClass626) immutableList.get(size);
            11T.A0A(anonymousClass626);
            if ((anonymousClass626 instanceof AnonymousClass622) && anonymousClass626.AsR() == j) {
                return size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hide() {
        6Mp r0;
        AnonymousClass811 anonymousClass811 = this.containerView;
        if (anonymousClass811 != null && this.isVisible) {
            C80s.A01(anonymousClass811);
        }
        if (this.isVisible && (r0 = this.callback) != null) {
            6F2 r02 = r0.A00;
            ImmutableSet immutableSet = 6F2.A4P;
            6Fx r03 = r02.A0r;
            5zD A0R = 4YU.A0R(r02);
            6Hs r04 = r03.A01;
            if (6Hs.A07(r04)) {
                r04.A07 = A0R;
                6Hs.A02(r04);
            }
        }
        this.isVisible = false;
        this.messageLoadRequested = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r0.A0m() == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean messageHasUnopenedContent(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            X.1q8 r0 = r0.A04()
            r303 = r0
            X.7lZ r0 = X.7lZ.$redex_init_class
            r304 = r0
            r0 = r303
            int r0 = r0.ordinal()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 1
            r307 = r0
            r0 = 8
            r308 = r0
            r0 = r305
            r1 = r307
            if (r0 != r1) goto L60
            r0 = r302
            java.lang.String r0 = X.4YU.A0x(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L63
            r0 = r303
            int r0 = r0.length()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L63
            r0 = r301
            X.4ys r0 = r0.getAttachmentDataFactory()
            r0 = r302
            X.5Pm r0 = r0.A08
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            r0 = r304
            X.6Ay r0 = r0.BCm()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            r0 = r304
            java.lang.String r0 = r0.A0m()
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 != 0) goto L60
        L5b:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L60:
            r0 = r306
            return r0
        L63:
            r0 = r301
            X.3oY r0 = r0.getMessageClassifier()
            r1 = r302
            X.5ak r0 = X.C00653oY.A00(r0, r1)
            r303 = r0
            r0 = r303
            int r0 = r0.ordinal()
            r305 = r0
            r0 = r305
            r1 = r308
            if (r0 == r1) goto L86
            r0 = 7
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 == r1) goto L86
            r0 = 0
            return r0
        L86:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadview.jumppill.UnopenedContentPillController.messageHasUnopenedContent(com.facebook.messaging.model.messages.Message):boolean");
    }

    private final boolean shouldShowPill() {
        ThreadSummary threadSummary = this.threadSummaryLocal;
        boolean z = false;
        if (threadSummary != null && threadSummary.A0n.A1F()) {
            int A1j = (((C6Ff) this.messageListHelper).A07.A1j() - ((C6Ff) this.messageListHelper).A07.A1h()) + 1;
            if (((C6Ff) this.messageListHelper).A07.A1j() < 0 || ((C6Ff) this.messageListHelper).A07.A1h() < 0) {
                A1j = 5;
            }
            if (2Gt.A0F(threadSummary)) {
                int i = A1j + 1;
                int i2 = this.unreadCount;
                if (i <= i2 && i2 < 200 && this.includeLastMessageInThreadLocal.asBoolean(true) && !this.pillDismissedByUserAction && this.unopenedContentGatingUtil.A00.AZk(72339893648361892L) && !this.unopenedContentGatingUtil.A00.AZk(72339893648624039L)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03bf, code lost:
    
        if (r0.A05 != X.0S2.A0C) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03c2, code lost:
    
        r0.append(X.4YV.A0o(r0, r320, 2131820858));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x032a, code lost:
    
        if (r320 > 0) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void show(com.google.common.collect.ImmutableList r302) {
        /*
            Method dump skipped, instructions count: 1571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadview.jumppill.UnopenedContentPillController.show(com.google.common.collect.ImmutableList):void");
    }

    public final C6N1 getComponentCallback() {
        return this.componentCallback;
    }

    public final int getFirstMessageCollectionPosition() {
        int i = this.firstUnreadPosition;
        if (i < 0) {
            i = getFirstMessageCollectionPositionInternal();
            this.firstUnreadPosition = i;
            if (i < 0) {
                int computeNumberToLoad = computeNumberToLoad();
                i = 0;
                if (computeNumberToLoad > 0) {
                    i = -computeNumberToLoad;
                }
            }
        }
        return i;
    }

    public final int getFirstUnopenedPosition() {
        int firstUnopenedPositionInternal = getFirstUnopenedPositionInternal();
        this.firstUnreadPosition = firstUnopenedPositionInternal;
        if (firstUnopenedPositionInternal < 0) {
            int computeNumberToLoad = computeNumberToLoad();
            firstUnopenedPositionInternal = 0;
            if (computeNumberToLoad > 0) {
                firstUnopenedPositionInternal = -computeNumberToLoad;
            }
        }
        return firstUnopenedPositionInternal;
    }

    public final ThreadSummary getThreadSummary() {
        return this.threadSummaryLocal;
    }

    public final boolean isUnopenedMessageLoadRequested() {
        return this.messageLoadRequested;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public void onEnterSearchInChat() {
        this.isInSearchInChat = true;
        hide();
    }

    public void onLeaveSearchInChat() {
        this.isInSearchInChat = false;
        if (shouldShowPill()) {
            show(this.unreadMessagesCollection);
        }
    }

    public void onMessageReceived(MessagesCollection messagesCollection, boolean z, boolean z2) {
        if (messagesCollection != null) {
            long j = this.lastReadTimestamp;
            if (((int) j) != 0) {
                ImmutableList immutableList = messagesCollection.A01;
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    if (message.A05 <= j) {
                        break;
                    } else {
                        builder.m11011add((Object) message);
                    }
                }
                ImmutableList build = builder.build();
                11T.A0A(build);
                boolean z3 = false;
                if (immutableList.size() < this.unreadCount) {
                    z3 = true;
                }
                6Mp r0 = this.callback;
                if (r0 != null) {
                    6Mp r02 = r0;
                    if (z3) {
                        6F2 r03 = r02.A00;
                        ImmutableSet immutableSet = 6F2.A4P;
                        r03.A2l.get();
                        C7ub.A00(r03.A0u, r03.A0v);
                    }
                }
                this.unreadMessagesCollection = build;
                if (shouldShowPill()) {
                    show(build);
                }
            }
        }
        if (z || z2 || !shouldShowPill()) {
            return;
        }
        this.firstUnreadPosition = getFirstMessageCollectionPositionInternal();
    }

    public void onScroll(int i) {
        if (this.isVisible) {
            boolean z = false;
            if (((C6Ff) this.messageListHelper).A07.A1h() < getFirstMessageCollectionPositionInternal()) {
                z = true;
            }
            if (this.unreadMessagesCollection == null || !z) {
                return;
            }
            6N5 jumpPillLogger = getJumpPillLogger();
            ThreadSummary threadSummary = this.threadSummaryLocal;
            ThreadKey threadKey = null;
            if (threadSummary != null) {
                threadKey = threadSummary.A0n;
            }
            ImmutableList immutableList = this.unreadMessagesCollection;
            String str = this.pillId;
            if (str == null) {
                11T.A0L("pillId");
                throw 0Q8.createAndThrow();
            }
            jumpPillLogger.A05(threadKey, immutableList, str);
            this.pillDismissedByUserAction = true;
            hide();
        }
    }

    public void onThreadClosed() {
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.pillId = obj;
        hide();
        this.threadSummaryLocal = null;
        this.unreadMessagesCollection = null;
        this.messageLoadRequested = false;
        this.unreadCount = 0;
        this.pillDismissedByUserAction = false;
        FbUserSession fbUserSession = this.fbUserSession;
        Context context = this.compContext.A0D;
        11T.A0A(context);
        ((C1t3) 1Lm.A05(context, fbUserSession, 33086)).A01(this.schemeUpdateObserver);
    }

    public void onThreadOpened(ThreadSummary threadSummary, TriState triState, TriState triState2, long j) {
        11T.A0F(threadSummary, 0);
        11T.A0F(triState2, 2);
        this.threadSummaryLocal = threadSummary;
        this.lastReadTimestamp = threadSummary.A0C;
        this.includeLastMessageInThreadLocal = triState2;
        this.unreadCount = (int) j;
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.pillId = obj;
        this.lastMessageAtInit = getLastMessageId();
        this.firstUnreadPosition = (-1) << (-1);
        if (shouldShowPill()) {
            show(this.unreadMessagesCollection);
        }
        FbUserSession fbUserSession = this.fbUserSession;
        Context context = this.compContext.A0D;
        11T.A0A(context);
        ((C1t3) 1Lm.A05(context, fbUserSession, 33086)).A00(this.schemeUpdateObserver);
    }

    public void onThreadSummaryUpdated(ThreadSummary threadSummary, TriState triState, TriState triState2) {
        11T.A0F(threadSummary, 0);
        11T.A0F(triState2, 2);
        if (this.threadSummaryLocal != null) {
            this.threadSummaryLocal = threadSummary;
        }
        this.includeLastMessageInThreadLocal = triState2;
    }

    public void onThreadUnreadMessageCountUpdated(long j) {
    }

    public final void setComponentCallback(C6N1 c6n1) {
        11T.A0F(c6n1, 0);
        this.componentCallback = c6n1;
    }

    public final void unopenedMessageLoadCompleted() {
        this.messageLoadRequested = false;
        if (shouldShowPill()) {
            show(this.unreadMessagesCollection);
        }
    }

    public final void unopenedMessageLoadRequested() {
        this.messageLoadRequested = true;
        if (shouldShowPill()) {
            show(this.unreadMessagesCollection);
        }
    }
}
