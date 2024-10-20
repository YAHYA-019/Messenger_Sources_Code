package com.facebook.messaging.rollcall.presentation.nux;

import X.1Br;
import X.2yD;
import X.7zU;
import X.9FG;
import X.C00t;
import X.C61c;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: RollCallNuxConfig.class */
public final class RollCallNuxConfig implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ RollCallNuxConfig[] A01;
    public static final RollCallNuxConfig A02;
    public static final RollCallNuxConfig A03;
    public static final RollCallNuxConfig A04;
    public static final RollCallNuxConfig A05;
    public static final RollCallNuxConfig A06;
    public static final RollCallNuxConfig A07;
    public static final RollCallNuxConfig A08;
    public static final Parcelable.Creator CREATOR;
    public final int buttonId;
    public final boolean isCommunityMessaging;
    public final boolean isGroupChat;
    public final int subtitleId;
    public final int titleId;
    public final int videoHeight;
    public final String videoId;
    public final String videoUri;
    public final int videoWidth;

    static {
        1Br r0 = 9FG.A00;
        A07 = new RollCallNuxConfig("ONE_TO_ONE_CREATION", ((C61c) 1Br.A0B(r0)).A03(), ((C61c) 1Br.A0B(r0)).A04(), 0, 2131964651, 2131964640, 2131964649, ((C61c) 1Br.A0B(r0)).A01(), ((C61c) 1Br.A0B(r0)).A02(), false, false);
        A08 = new RollCallNuxConfig("ONE_TO_ONE_PARTICIPATION", ((C61c) 1Br.A0B(r0)).A03(), ((C61c) 1Br.A0B(r0)).A04(), 1, 2131964651, 2131964652, 2131964649, ((C61c) 1Br.A0B(r0)).A01(), ((C61c) 1Br.A0B(r0)).A02(), false, false);
        A05 = new RollCallNuxConfig("GROUP_CREATION", ((C61c) 1Br.A0B(r0)).A03(), ((C61c) 1Br.A0B(r0)).A04(), 2, 2131964651, 2131964640, 2131964649, ((C61c) 1Br.A0B(r0)).A01(), ((C61c) 1Br.A0B(r0)).A02(), false, true);
        A06 = new RollCallNuxConfig("GROUP_PARTICIPATION", ((C61c) 1Br.A0B(r0)).A03(), ((C61c) 1Br.A0B(r0)).A04(), 3, 2131964651, 2131964652, 2131964649, ((C61c) 1Br.A0B(r0)).A01(), ((C61c) 1Br.A0B(r0)).A02(), false, true);
        A02 = new RollCallNuxConfig("COMMUNITY_MESSAGING", ((C61c) 1Br.A0B(r0)).A03(), ((C61c) 1Br.A0B(r0)).A04(), 4, 2131964651, 2131952388, 2131964649, ((C61c) 1Br.A0B(r0)).A01(), ((C61c) 1Br.A0B(r0)).A02(), true, false);
        A03 = new RollCallNuxConfig("COMMUNITY_MESSAGING_CREATION", 2yD.A02(C61c.A00((C61c) 1Br.A0B(r0)), 36886046721771116L), 2yD.A02(C61c.A00((C61c) 1Br.A0B(r0)), 36886046721836653L), 5, ((C61c) 1Br.A0B(r0)).A09() ? 2131952392 : 2131952391, ((C61c) 1Br.A0B(r0)).A09() ? 2131952389 : 2131952388, 2131952390, 2yD.A00(C61c.A00((C61c) 1Br.A0B(r0)), 36604571745000101L), 2yD.A00(C61c.A00((C61c) 1Br.A0B(r0)), 36604571745196710L), true, false);
        RollCallNuxConfig rollCallNuxConfig = new RollCallNuxConfig("COMMUNITY_MESSAGING_PARTICIPATION", 2yD.A02(C61c.A00((C61c) 1Br.A0B(r0)), 36886046721771116L), 2yD.A02(C61c.A00((C61c) 1Br.A0B(r0)), 36886046721836653L), 6, 2131952397, ((C61c) 1Br.A0B(r0)).A09() ? 2131952399 : 2131952398, 2131952400, 2yD.A00(C61c.A00((C61c) 1Br.A0B(r0)), 36604571745000101L), 2yD.A00(C61c.A00((C61c) 1Br.A0B(r0)), 36604571745196710L), true, false);
        A04 = rollCallNuxConfig;
        RollCallNuxConfig[] rollCallNuxConfigArr = {A07, A08, A05, A06, A02, A03, rollCallNuxConfig};
        A01 = rollCallNuxConfigArr;
        A00 = C00t.A00(rollCallNuxConfigArr);
        CREATOR = new CSS(46);
    }

    public RollCallNuxConfig(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.titleId = i2;
        this.subtitleId = i3;
        this.buttonId = i4;
        this.isCommunityMessaging = z;
        this.isGroupChat = z2;
        this.videoId = str2;
        this.videoUri = str3;
        this.videoHeight = i5;
        this.videoWidth = i6;
    }

    public static RollCallNuxConfig valueOf(String str) {
        return (RollCallNuxConfig) Enum.valueOf(RollCallNuxConfig.class, str);
    }

    public static RollCallNuxConfig[] values() {
        return (RollCallNuxConfig[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zU.A11(parcel, this);
    }
}
