package X;

import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.MarketplaceThreadLabel;
import com.facebook.messaging.model.threads.MarketplaceThreadUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2o7, reason: invalid class name */
/* loaded from: 2o7.class */
public abstract class C2o7 {
    public static String A00(ThreadSummary threadSummary) {
        ImmutableList immutableList;
        MarketplaceThreadData marketplaceThreadData = threadSummary.A0r;
        if (marketplaceThreadData == null || (immutableList = marketplaceThreadData.A03) == null) {
            return null;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            MarketplaceThreadLabel marketplaceThreadLabel = (MarketplaceThreadLabel) it.next();
            String str = marketplaceThreadLabel.A01;
            if (str != null && !str.equals(GraphQLStringDefUtil.A00().ATw("GraphQLMarketplaceThreadLabelType", DKB.A00(70)))) {
                return marketplaceThreadLabel.A00;
            }
        }
        return null;
    }

    public static boolean A01(ThreadSummary threadSummary) {
        boolean z = true;
        if (!threadSummary.A0n.A1I() && threadSummary.A0Y != GraphQLMessengerGroupThreadSubType.A0C && threadSummary.A0r == null) {
            z = false;
        }
        return z;
    }

    public static boolean A02(ThreadSummary threadSummary, String str) {
        MarketplaceThreadUserData marketplaceThreadUserData;
        MarketplaceThreadData marketplaceThreadData = threadSummary.A0r;
        return str.equalsIgnoreCase((marketplaceThreadData == null || (marketplaceThreadUserData = marketplaceThreadData.A01) == null) ? null : marketplaceThreadUserData.A08);
    }

    public static boolean A03(ThreadSummary threadSummary, String str) {
        MarketplaceThreadData marketplaceThreadData;
        if (!A01(threadSummary) || (marketplaceThreadData = threadSummary.A0r) == null) {
            return false;
        }
        MarketplaceThreadUserData marketplaceThreadUserData = marketplaceThreadData.A01;
        String str2 = marketplaceThreadUserData != null ? marketplaceThreadUserData.A08 : null;
        MarketplaceThreadUserData marketplaceThreadUserData2 = marketplaceThreadData.A00;
        String str3 = marketplaceThreadUserData2 != null ? marketplaceThreadUserData2.A08 : null;
        if (str2 == null || !str.equalsIgnoreCase(str2)) {
            return str3 != null && str.equalsIgnoreCase(str3);
        }
        return true;
    }
}
