package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ae4, reason: case insensitive filesystem */
/* loaded from: Ae4.class */
public final class C1326Ae4 implements C1ps {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1314Ads A03;
    public final RankingLoggingItem A04;
    public final DataSourceIdentifier A05;
    public final 53N A06;
    public final DK4 A07;
    public final ImmutableList A08;
    public final Integer A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C1326Ae4(C1314Ads c1314Ads, RankingLoggingItem rankingLoggingItem, DataSourceIdentifier dataSourceIdentifier, 53N r305, DK4 dk4, ImmutableList immutableList, Integer num, Long l, String str, String str2, int i, int i2, int i3, boolean z, boolean z2) {
        this.A0C = str;
        this.A0A = l;
        this.A06 = r305;
        this.A07 = dk4;
        this.A05 = dataSourceIdentifier;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = rankingLoggingItem;
        this.A03 = c1314Ads;
        this.A0D = z;
        this.A08 = immutableList;
        this.A0E = z2;
        this.A00 = i3;
        this.A0B = str2;
        this.A09 = num;
    }

    @Override // X.C1ps
    public long AsR() {
        return this.A0C.hashCode();
    }
}
