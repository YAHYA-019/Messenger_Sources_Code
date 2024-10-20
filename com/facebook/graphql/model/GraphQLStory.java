package com.facebook.graphql.model;

import X.1BJ;
import X.4iV;
import X.MNz;
import X.MSk;
import X.MSt;
import X.MSy;
import X.MT1;
import X.NA4;
import X.S6F;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;

/* loaded from: GraphQLStory.class */
public final class GraphQLStory extends BaseModelWithTree implements NA4, MNz, 4iV {
    public S6F A00;

    public GraphQLStory(int i, int[] iArr) {
        super(i, iArr);
        this.A00 = null;
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0K() {
        MSk A03 = MSk.A03(this);
        GraphQLStory graphQLStory = (GraphQLStory) A03.A1V("Story", GraphQLStory.class, -541423194);
        graphQLStory.A00 = (S6F) A03.A00;
        return graphQLStory;
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0L() {
        return MSk.A03(this).A1v();
    }

    public final MSy A0c() {
        return A0Q(MSy.class, -132939024, 341202575);
    }

    public final MSt A0d() {
        return A0Q(MSt.class, 3707, -857105319);
    }

    public final ImmutableList A0e() {
        return A0T(-1422944994, MT1.class, 482887193);
    }

    public final ImmutableList A0f() {
        return A0T(-738997328, GraphQLStoryAttachment.class, 23431254);
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [X.S6F, java.lang.Object] */
    @Override // X.NA4
    public S6F B5L() {
        S6F s6f = this.A00;
        S6F s6f2 = s6f;
        if (s6f == null) {
            ?? obj = new Object();
            this.A00 = obj;
            s6f2 = obj;
        }
        return s6f2;
    }

    @Override // com.facebook.graphql.modelutil.BaseModel
    public final String getTypeName() {
        return "Story";
    }

    @Override // com.facebook.graphql.modelutil.BaseModel
    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(GraphQLStory.class);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0Z());
        stringHelper.add("cache_id", A0a(-433489160));
        stringHelper.add("legacy_api_story_id", A0a(-291507744));
        stringHelper.add("fetchTimeMs", A0J(571038893));
        stringHelper.add("local_story_visibility", A0a(494463728));
        stringHelper.add("local_last_negative_feedback_action_type", A0a(1949247774));
        stringHelper.add(1BJ.A00(ActionId.VIDEO_REQUESTED_PLAYING), A0J(1932333101));
        BaseModelWithTree A0M = A0M(110371416);
        if (A0M != null) {
            stringHelper.add("title.text", A0M.A0X());
        }
        ImmutableList A0e = A0e();
        if (!A0e.isEmpty()) {
            stringHelper.add("actors[0].name", ((BaseModelWithTree) A0e.get(0)).A0Y());
        }
        BaseModelWithTree A0M2 = A0M(954925063);
        if (A0M2 != null) {
            stringHelper.add("message.text", A0M2.A0X());
        }
        BaseModelWithTree A0M3 = A0M(-1857640538);
        if (A0M3 != null) {
            stringHelper.add("summary.text", A0M3.A0X());
        }
        ImmutableList A0f = A0f();
        if (!A0f.isEmpty()) {
            stringHelper.add("attachments[0].title:", ((GraphQLStoryAttachment) A0f.get(0)).A0e());
        }
        String A0a = A0a(33847702);
        if (A0a != null) {
            stringHelper.add("hideable_token", A0a);
        }
        return stringHelper.toString();
    }
}
