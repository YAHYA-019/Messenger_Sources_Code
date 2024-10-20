package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* renamed from: X.894, reason: invalid class name */
/* loaded from: 894.class */
public final class AnonymousClass894 extends C00q implements C00m {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass894(String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                String str = this.A01;
                11T.A0I(str, "null cannot be cast to non-null type kotlin.CharSequence");
                return str;
            case 1:
                String str2 = this.A01;
                if (str2.length() > 127) {
                    str2 = 0Pz.A0J(7zM.A1C(0, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES, str2), (char) 8230);
                }
                0Z9.A01(str2, 1002497425);
                return 04S.A00;
            case 2:
                return this.A01;
            default:
                GraphQlQueryParamSet A0M = 7zL.A0M();
                4YV.A1A(4YU.A0J(GraphQlCallInput.A02, this.A01, "prompt_id"), A0M, "data");
                A0M.A04("msgr_channel_prompt_submissions_paginating_first", 14);
                return 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MessengerBroadcastChannelPromptFetchResponsesQuery", (String) null, "fbandroid", 925031484, 0, 1578899676L, 1578899676L, false, true));
        }
    }
}
