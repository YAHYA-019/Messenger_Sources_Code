package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;

/* loaded from: C5n.class */
public final class C5n {
    public final 53M A00;
    public final BLs A01;
    public final ImmutableSet A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C5n(53M r302, BLs bLs, ImmutableSet immutableSet, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = bLs;
        this.A00 = r302;
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A02 = immutableSet;
    }

    public String toString() {
        MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper("DataSourcesConfigurationCreatorInput");
        toStringHelper.add(ErrorReportingConstants.APP_NAME_KEY, this.A01);
        toStringHelper.add("searchSurface", this.A00);
        toStringHelper.add("isEmployee", this.A03);
        toStringHelper.add("shouldExcludeXacResults", this.A05);
        boolean z = this.A04;
        toStringHelper.add("shouldExcludeSmsAndCarrierResults", z);
        toStringHelper.add("shouldExcludeSmsAndCarrierResults", z);
        toStringHelper.add("selectedUsersFbIds", this.A02);
        toStringHelper.add("shouldShowCommunityChatThreadsResults", true);
        return toStringHelper.toString();
    }
}
