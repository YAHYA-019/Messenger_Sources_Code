package com.facebook.messaging.composer.mediasends;

import X.04S;
import X.0CL;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Du;
import X.1XU;
import X.4YT;
import X.4YU;
import X.5HP;
import X.5PI;
import X.5Pz;
import X.6QV;
import X.6Qe;
import X.6Qf;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.C7kd;
import X.HhH;
import X.IUi;
import X.JCy;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.media.send.MediaMessageFactory;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.share.model.ComposerAppAttribution;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: MediaSender$sendMediaMessage$2.class */
public final class MediaSender$sendMediaMessage$2 extends 0DO implements Function2 {
    public final /* synthetic */ ComposerAppAttribution $appAttribution;
    public final /* synthetic */ ImmutableMap $clientTags;
    public final /* synthetic */ 6Qf $composerHooks;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $currentOrientation;
    public final /* synthetic */ ImmutableMap $extensibleMessageData;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $isComposerLaunchSourceThreadView;
    public final /* synthetic */ JCy $listener;
    public final /* synthetic */ boolean $lssMediaStartPointFixEnabled;
    public final /* synthetic */ List $mediaResources;
    public final /* synthetic */ MessageRepliedTo $messageRepliedTo;
    public final /* synthetic */ String $messageRepliedToID;
    public final /* synthetic */ 5Pz $messageSendTrigger;
    public final /* synthetic */ String $messageSendType;
    public final /* synthetic */ 0CL $offlineMessageId;
    public final /* synthetic */ 5Pz $sendTrigger;
    public final /* synthetic */ Capabilities $threadCapabilities;
    public final /* synthetic */ ThreadKey $threadKey;
    public final /* synthetic */ ThreadSummary $threadSummary;
    public int label;
    public final /* synthetic */ HhH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSender$sendMediaMessage$2(Context context, FbUserSession fbUserSession, 5Pz r304, 5Pz r305, JCy jCy, HhH hhH, 6Qf r308, MessageRepliedTo messageRepliedTo, ThreadKey threadKey, ThreadSummary threadSummary, ComposerAppAttribution composerAppAttribution, Capabilities capabilities, ImmutableMap immutableMap, ImmutableMap immutableMap2, String str, String str2, List list, 0DR r319, 0CL r320, int i, boolean z, boolean z2) {
        super(2, r319);
        this.this$0 = hhH;
        this.$fbUserSession = fbUserSession;
        this.$context = context;
        this.$mediaResources = list;
        this.$sendTrigger = r304;
        this.$clientTags = immutableMap;
        this.$extensibleMessageData = immutableMap2;
        this.$threadKey = threadKey;
        this.$threadCapabilities = capabilities;
        this.$messageRepliedToID = str;
        this.$appAttribution = composerAppAttribution;
        this.$currentOrientation = i;
        this.$threadSummary = threadSummary;
        this.$offlineMessageId = r320;
        this.$lssMediaStartPointFixEnabled = z;
        this.$isComposerLaunchSourceThreadView = z2;
        this.$messageSendType = str2;
        this.$messageSendTrigger = r305;
        this.$messageRepliedTo = messageRepliedTo;
        this.$composerHooks = r308;
        this.$listener = jCy;
    }

    public static final String A01(Message message) {
        5HP r0;
        11T.A0F(message, 0);
        ImmutableList immutableList = message.A0z;
        11T.A0A(immutableList);
        boolean A1Y = 1BK.A1Y(immutableList);
        String A00 = 4YT.A00(319);
        if (A1Y && (r0 = 4YU.A0a(immutableList, 0).A0Q) != null) {
            C7kd c7kd = C7kd.$redex_init_class;
            switch (r0.ordinal()) {
                case 0:
                case 10:
                    return "image";
                case 1:
                    return "video";
                case 2:
                    return "audio";
                case 3:
                    return "file";
                case 13:
                    return "gif";
            }
        }
        return A00;
    }

    public final 0DR create(Object obj, 0DR r303) {
        HhH hhH = this.this$0;
        FbUserSession fbUserSession = this.$fbUserSession;
        Context context = this.$context;
        List list = this.$mediaResources;
        5Pz r0 = this.$sendTrigger;
        ImmutableMap immutableMap = this.$clientTags;
        ImmutableMap immutableMap2 = this.$extensibleMessageData;
        ThreadKey threadKey = this.$threadKey;
        Capabilities capabilities = this.$threadCapabilities;
        String str = this.$messageRepliedToID;
        ComposerAppAttribution composerAppAttribution = this.$appAttribution;
        int i = this.$currentOrientation;
        ThreadSummary threadSummary = this.$threadSummary;
        0CL r02 = this.$offlineMessageId;
        boolean z = this.$lssMediaStartPointFixEnabled;
        boolean z2 = this.$isComposerLaunchSourceThreadView;
        String str2 = this.$messageSendType;
        5Pz r03 = this.$messageSendTrigger;
        MessageRepliedTo messageRepliedTo = this.$messageRepliedTo;
        return new MediaSender$sendMediaMessage$2(context, fbUserSession, r0, r03, this.$listener, hhH, this.$composerHooks, messageRepliedTo, threadKey, threadSummary, composerAppAttribution, capabilities, immutableMap, immutableMap2, str, str2, list, r303, r02, i, z, z2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            MediaMessageFactory mediaMessageFactory = (MediaMessageFactory) 1Br.A0B(this.this$0.A00);
            FbUserSession fbUserSession = this.$fbUserSession;
            Context context = this.$context;
            List list = this.$mediaResources;
            5Pz r02 = this.$sendTrigger;
            ImmutableMap immutableMap = this.$clientTags;
            ImmutableMap immutableMap2 = this.$extensibleMessageData;
            ThreadKey threadKey = this.$threadKey;
            Capabilities capabilities = this.$threadCapabilities;
            String str = this.$messageRepliedToID;
            ComposerAppAttribution composerAppAttribution = this.$appAttribution;
            int i2 = this.$currentOrientation;
            ThreadSummary threadSummary = this.$threadSummary;
            String str2 = (String) this.$offlineMessageId.element;
            this.label = 1;
            obj2 = mediaMessageFactory.A03(context, fbUserSession, r02, threadKey, threadSummary, composerAppAttribution, capabilities, immutableMap, immutableMap2, str, str2, list, this, i2);
            if (obj2 == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        ImmutableList immutableList = (ImmutableList) obj2;
        HhH hhH = this.this$0;
        boolean z = this.$lssMediaStartPointFixEnabled;
        boolean z2 = this.$isComposerLaunchSourceThreadView;
        String str3 = this.$messageSendType;
        5Pz r03 = this.$messageSendTrigger;
        ThreadKey threadKey2 = this.$threadKey;
        MessageRepliedTo messageRepliedTo = this.$messageRepliedTo;
        6Qe r04 = this.$composerHooks;
        boolean A00 = 1XU.A00(this.$context);
        IUi iUi = this.$listener;
        C00i c00i = hhH.A01.A00;
        MessagingPerformanceLogger.A08((MessagingPerformanceLogger) c00i.get()).markerEnd(5512262, (short) 2);
        if (immutableList != null) {
            if (iUi != null) {
                final IUi iUi2 = iUi;
                ArrayList A0s = AnonymousClass001.A0s();
                int size = immutableList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str4 = ((Message) immutableList.get(i3)).A1W;
                    if (str4 != null) {
                        A0s.add(str4);
                    }
                }
                6QV r05 = iUi2.A00.A1c;
                final ImmutableMap immutableMap3 = iUi2.A02;
                final String str5 = iUi2.A03;
                final ImmutableList immutableList2 = iUi2.A01;
                r05.A00(A0s, new Function1() { // from class: X.J61
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final IUi iUi3 = iUi2;
                        final ImmutableMap immutableMap4 = immutableMap3;
                        final String str6 = str5;
                        final ImmutableList immutableList3 = immutableList2;
                        final List list2 = (List) obj3;
                        iUi3.A00.A0a.execute(new Runnable() { // from class: X.J2h
                            public static final String __redex_internal_original_name = "ComposeFragment$15$$ExternalSyntheticLambda1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                IUi iUi4 = iUi3;
                                List list3 = list2;
                                ImmutableMap immutableMap5 = immutableMap4;
                                String str7 = str6;
                                6QS.A0Q(iUi4.A00, immutableList3, immutableMap5, str7, list3);
                            }
                        });
                        return 04S.A00;
                    }
                });
            }
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Message message = (Message) AbH.A15(it);
                if (!z && z2) {
                    String A01 = str3 == null ? A01(message) : str3;
                    MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) c00i.get();
                    String str6 = message.A1g;
                    if (str6 == null) {
                        str6 = "";
                    }
                    messagingPerformanceLogger.A0Y(threadKey2, str6, A01, r03.toString(), 0, message.A02, 0L, A00);
                }
                if (messageRepliedTo != null) {
                    5PI r06 = new 5PI(message);
                    r06.A0F = messageRepliedTo;
                    r04.A00.A1r(r03, new Message(r06));
                } else {
                    r04.A00.A1r(r03, message);
                }
                if (z2) {
                    ((MessagingPerformanceLogger) c00i.get()).A0V(message.A0V, message.A1g, str3 == null ? A01(message) : str3, r03.toString());
                }
            }
        }
        return 04S.A00;
    }
}
