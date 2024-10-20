package X;

import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLMessageThreadCannotReplyReason;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadWarningType;
import com.facebook.messaging.communitymessaging.threadfull.model.ThreadFullnessState;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadRtcCallInfoData;
import com.facebook.messaging.model.threads.ThreadRtcRoomInfoData;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.20o, reason: invalid class name */
/* loaded from: 20o.class */
public interface C20o {
    public static final 3PQ A00 = 3PQ.A00;

    NotificationSetting Aap();

    GraphQLMessageThreadCannotReplyReason AbY();

    CompositeThreadThemeInfo AdX();

    GroupThreadData AoK();

    GraphQLMessengerGroupThreadWarningType AoL();

    String At6();

    String At7();

    ImmutableList At8();

    HeterogeneousMap AxS();

    C20a Axu();

    int AzY();

    NotificationSetting AzZ();

    AnonymousClass214 B0N();

    String B3q();

    ThreadCustomization BF2();

    ThreadFullnessState BF4();

    ThreadRtcCallInfoData BFG();

    ThreadRtcRoomInfoData BFH();

    C1zu BFJ();

    AnonymousClass219 BIz();

    TriState BWg();
}
