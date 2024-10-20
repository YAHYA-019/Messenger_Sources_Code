package com.facebook.messaging.communitymessaging.unread.calculator.count;

import X.04S;
import X.07E;
import X.07I;
import X.0Be;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0zU;
import X.11T;
import X.1WY;
import X.1qX;
import X.2RU;
import X.4YU;
import X.5dZ;
import X.7zP;
import X.7zR;
import X.AnonymousClass001;
import X.C00i;
import X.C4Lg;
import X.C5dg;
import X.C5di;
import com.facebook.messaging.communitymessaging.model.CommunityNewBadgeStatus;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* loaded from: CommunityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2.class */
public final class CommunityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2 extends 0DO implements 0Be {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ 5dZ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2(5dZ r302, 0DR r303) {
        super(4, r303);
        this.this$0 = r302;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        CommunityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2 communityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2 = new CommunityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2(this.this$0, (0DR) obj4);
        communityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2.L$0 = obj;
        communityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2.L$1 = obj2;
        communityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2.L$2 = obj3;
        return communityUnreadItemsDataFetcher$getUnreadCountForCommunityFolders$2.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object c5dg;
        int integer;
        int integer2;
        boolean z;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            0zU r02 = (0zU) this.L$0;
            MailboxNullable mailboxNullable = (MailboxNullable) this.L$1;
            List list = (List) this.L$2;
            1qX r03 = (1qX) mailboxNullable.value;
            if (r03 == null) {
                c5dg = C5di.A00;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
            } else {
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                07E A0w = 7zR.A0w(r03);
                5dZ r04 = this.this$0;
                07I it = A0w.iterator();
                while (it.hasNext()) {
                    int A00 = it.A00();
                    long j = r03.mResultSet.getLong(A00, 0);
                    C00i c00i = r04.A03.A00;
                    if (((2RU) c00i.get()).A02()) {
                        String A0q = 7zP.A0q(r03, A00);
                        integer = 5dZ.A00(list, A0q != null ? 4YU.A19(A0q, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0) : null);
                    } else {
                        integer = r03.mResultSet.getInteger(A00, 8);
                    }
                    if (((2RU) c00i.get()).A02()) {
                        String A0r = 7zP.A0r(r03, A00);
                        integer2 = 5dZ.A00(list, A0r != null ? 4YU.A19(A0r, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0) : null);
                    } else {
                        integer2 = r03.mResultSet.getInteger(A00, 9);
                    }
                    long j2 = r03.mResultSet.getLong(A00, 2);
                    CommunityNewBadgeStatus communityNewBadgeStatus = (CommunityNewBadgeStatus) CommunityNewBadgeStatus.A00.get(r03.mResultSet.getNullableInteger(A00, 4));
                    if (communityNewBadgeStatus == null) {
                        communityNewBadgeStatus = CommunityNewBadgeStatus.A03;
                    }
                    if (1WY.A01((1WY) r04.A01.A00.get()).AZk(36321400255955277L) && j2 == 0) {
                        z = true;
                        if (C4Lg.A00((C4Lg) r04.A02.A00.get(), communityNewBadgeStatus, String.valueOf(j), r04.A00.A05)) {
                            builder.put(new Long(j), new CommunityItemsDataFetcherUnreadCounts(integer2, integer, z));
                        }
                    }
                    z = false;
                    builder.put(new Long(j), new CommunityItemsDataFetcherUnreadCounts(integer2, integer, z));
                }
                ImmutableMap build = builder.build();
                11T.A0A(build);
                c5dg = new C5dg(build);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
            if (r02.emit(c5dg, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
