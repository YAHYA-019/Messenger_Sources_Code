package com.facebook.pando;

import X.11T;
import X.1BL;
import X.2tU;
import X.4SM;
import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: PandoGraphQLConnectionConfig.class */
public final class PandoGraphQLConnectionConfig {
    public static final 4SM Companion = new Object();
    public final String connectionQueryName;
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4SM, java.lang.Object] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoGraphQLConnectionConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        String str11 = str8;
        String str12 = str5;
        1BL.A1H(str, str2, str3);
        11T.A0F(str4, 4);
        11T.A0F(str6, 6);
        11T.A0F(str7, 7);
        11T.A0F(str9, 9);
        11T.A0F(str10, 10);
        this.connectionQueryName = str4;
        this.mHybridData = initHybridData(str, str2, str3, str5 == null ? "" : str12, str6, str7, str8 == null ? "" : str11, str9, str10, z, z2);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2);

    private final native void setGeneratedPaginationQueryClientDocId(String str);

    public final void setGeneratedPaginationQueryClientDocId(2tU r302) {
        11T.A0F(r302, 0);
        String clientDocIdForQuery = r302.clientDocIdForQuery(this.connectionQueryName);
        if (clientDocIdForQuery == null) {
            clientDocIdForQuery = "";
        }
        setGeneratedPaginationQueryClientDocId(clientDocIdForQuery);
    }
}
