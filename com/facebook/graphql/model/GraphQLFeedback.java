package com.facebook.graphql.model;

import X.1Du;
import X.4iV;
import X.AnonymousClass001;
import X.JQw;
import X.MSm;
import X.MSn;
import X.MSy;
import X.MT0;
import X.MT1;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.GraphQLFeedbackReactionType;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.MoreObjects;

/* loaded from: GraphQLFeedback.class */
public final class GraphQLFeedback extends BaseModelWithTree implements 4iV {
    public GraphQLFeedback(int i, int[] iArr) {
        super(i, iArr);
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0K() {
        return (BaseModelWithTree) MSm.A01(this).A1V("Feedback", GraphQLFeedback.class, -1096498488);
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0L() {
        return (BaseModelWithTree) MSm.A01(this).A1U("Feedback", GraphQLFeedback.class, -1096498488);
    }

    @Override // com.facebook.graphql.modelutil.BaseModel
    public final String getTypeName() {
        return "Feedback";
    }

    @Override // com.facebook.graphql.modelutil.BaseModel
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        BaseModelWithTree A0Q = A0Q(MSy.class, -238731008, 1104822693);
        if (A0Q != null) {
            A0k.append("GraphQLTopReactionConnection{edges=[");
            1Du it = A0Q.A0T(96356950, MSy.class, -1691888679).iterator();
            while (it.hasNext()) {
                BaseModelWithTree baseModelWithTree = (BaseModelWithTree) it.next();
                BaseModelWithTree A0Q2 = baseModelWithTree.A0Q(MT1.class, 3386882, 1717475186);
                if (A0Q2 != null) {
                    MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(baseModelWithTree);
                    stringHelper.add("reaction_count", baseModelWithTree.A0I(467831673));
                    stringHelper.add("node.id", A0Q2.A0Z());
                    stringHelper.add("node.reaction_type", A0Q2.A0V(GraphQLFeedbackReactionType.A01, -1646960752));
                    A0k.append(stringHelper.toString());
                    A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
            A0k.append("]}");
        } else {
            A0k.append("null");
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        BaseModelWithTree A0Q3 = A0Q(MT0.class, -1379139442, -1723273906);
        if (A0Q3 != null) {
            A0k2.append("GraphQLImportantReactorsConnection{nodes=[");
            1Du it2 = A0Q3.A0T(104993457, MT1.class, 482887193).iterator();
            while (it2.hasNext()) {
                BaseModelWithTree baseModelWithTree2 = (BaseModelWithTree) it2.next();
                MoreObjects.ToStringHelper stringHelper2 = MoreObjects.toStringHelper(baseModelWithTree2);
                stringHelper2.add("node.id", baseModelWithTree2.A0Z());
                stringHelper2.add("node.name", baseModelWithTree2.A0Y());
                A0k2.append(stringHelper2.toString());
                A0k2.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A0k2.append("]}");
        } else {
            A0k2.append("null");
        }
        MoreObjects.ToStringHelper stringHelper3 = MoreObjects.toStringHelper(GraphQLFeedback.class);
        stringHelper3.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0Z());
        stringHelper3.add("legacy_api_post_id", A0a(236710015));
        BaseModelWithTree A0Q4 = A0Q(MT0.class, -1102760936, 329257907);
        if (A0Q4 == null) {
            A0Q4 = (BaseModelWithTree) MSn.A0b((TreeJNI) null, 329257907).A1U("LikersOfContentConnection", MT0.class, 329257907);
        }
        stringHelper3.add("LikeCount", A0Q4.A0I(94851343));
        int i = 0;
        BaseModelWithTree A0Q5 = A0Q(MSy.class, -1311285127, -1193035112);
        if (A0Q5 != null) {
            i = A0Q5.A0I(-407761836);
            if (i == 0) {
                i = A0Q5.A0I(94851343);
            }
        }
        stringHelper3.add("CommentCount", i);
        stringHelper3.add(JQw.A00(270), A0b(1919370462));
        stringHelper3.add("top_reactions", A0k.toString());
        stringHelper3.add("important_reactors", A0k2.toString());
        return stringHelper3.toString();
    }
}
