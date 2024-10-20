package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLNegativeFeedbackActionType;
import java.util.AbstractMap;
import java.util.HashMap;

/* loaded from: N96.class */
public final class N96 extends HashMap {
    public final /* synthetic */ N09 this$0;

    public N96(N09 n09) {
        this.this$0 = n09;
        put("444813342392137", "Angry");
        put("115940658764963", "Haha");
        put(GOm.A00(ActionId.TIMEOUT), "Like");
        put("908563459236466", "Sad");
        put("478547315650144", "Wow");
        put(GraphQLNegativeFeedbackActionType.A01.toString(), "block");
        String obj = GraphQLNegativeFeedbackActionType.A04.toString();
        put(obj, "hide");
        A00(GraphQLNegativeFeedbackActionType.A07, "hide", this);
        put(obj, "hide");
        put(GraphQLNegativeFeedbackActionType.A0A.toString(), "report");
        A00(GraphQLNegativeFeedbackActionType.A0D, "report", this);
        put(GraphQLNegativeFeedbackActionType.A0F.toString(), "snooze");
        A00(GraphQLNegativeFeedbackActionType.A0G, "snooze", this);
        A00(GraphQLNegativeFeedbackActionType.A0H, "snooze", this);
        A00(GraphQLNegativeFeedbackActionType.A0I, "snooze", this);
        A00(GraphQLNegativeFeedbackActionType.A0J, "snooze", this);
        A00(GraphQLNegativeFeedbackActionType.A0K, "snooze", this);
        put(GraphQLNegativeFeedbackActionType.A0O.toString(), "unfollow");
        A00(GraphQLNegativeFeedbackActionType.A0S, "unfollow", this);
        A00(GraphQLNegativeFeedbackActionType.A0U, "unfollow", this);
        A00(GraphQLNegativeFeedbackActionType.A0P, "unfollow", this);
        A00(GraphQLNegativeFeedbackActionType.A0Q, "unfollow", this);
        A00(GraphQLNegativeFeedbackActionType.A0V, "unfollow", this);
        A00(GraphQLNegativeFeedbackActionType.A0T, "unfollow", this);
        A00(GraphQLNegativeFeedbackActionType.A0R, "unfollow", this);
        put(GraphQLNegativeFeedbackActionType.A0W.toString(), "untag");
        A00(GraphQLNegativeFeedbackActionType.A0X, "untag", this);
        A00(GraphQLNegativeFeedbackActionType.A0Y, "untag", this);
    }

    public static void A00(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj.toString(), obj2);
    }
}
