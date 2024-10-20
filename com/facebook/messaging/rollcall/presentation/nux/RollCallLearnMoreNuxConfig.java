package com.facebook.messaging.rollcall.presentation.nux;

import X.1Br;
import X.7zU;
import X.9FG;
import X.C00t;
import X.C1u3;
import X.C61c;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: RollCallLearnMoreNuxConfig.class */
public final class RollCallLearnMoreNuxConfig implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ RollCallLearnMoreNuxConfig[] A01;
    public static final RollCallLearnMoreNuxConfig A02;
    public static final RollCallLearnMoreNuxConfig A03;
    public static final RollCallLearnMoreNuxConfig A04;
    public static final RollCallLearnMoreNuxConfig A05;
    public static final Parcelable.Creator CREATOR;
    public final int icon1TitleId;
    public final C1u3 icon1Type;
    public final int icon2TitleId;
    public final int icon3TitleId;
    public final Integer subtitleId;
    public final int titleId;

    static {
        C1u3 c1u3 = C1u3.A5Y;
        A05 = new RollCallLearnMoreNuxConfig(c1u3, 2131964646, "ONE_TO_ONE", 0, 2131964647, 2131964643, 2131964648, 2131964644);
        A04 = new RollCallLearnMoreNuxConfig(c1u3, 2131964645, "GROUP", 1, 2131964647, 2131964643, 2131964648, 2131964644);
        A02 = new RollCallLearnMoreNuxConfig(C1u3.A6E, null, "COMMUNITY_MESSAGING", 2, 2131964636, 2131964635, 2131964637, 2131964634);
        C1u3 c1u32 = C1u3.A4v;
        1Br r0 = 9FG.A00;
        RollCallLearnMoreNuxConfig rollCallLearnMoreNuxConfig = new RollCallLearnMoreNuxConfig(c1u32, null, "COMMUNITY_MESSAGING_ADD_YOURS", 3, 2131952382, ((C61c) 1Br.A0B(r0)).A09() ? 2131952384 : 2131952381, ((C61c) 1Br.A0B(r0)).A09() ? 2131952385 : 2131952383, 2131952380);
        A03 = rollCallLearnMoreNuxConfig;
        RollCallLearnMoreNuxConfig[] rollCallLearnMoreNuxConfigArr = {A05, A04, A02, rollCallLearnMoreNuxConfig};
        A01 = rollCallLearnMoreNuxConfigArr;
        A00 = C00t.A00(rollCallLearnMoreNuxConfigArr);
        CREATOR = new CSS(45);
    }

    public RollCallLearnMoreNuxConfig(C1u3 c1u3, Integer num, String str, int i, int i2, int i3, int i4, int i5) {
        this.titleId = i2;
        this.subtitleId = num;
        this.icon1Type = c1u3;
        this.icon1TitleId = i3;
        this.icon2TitleId = i4;
        this.icon3TitleId = i5;
    }

    public static RollCallLearnMoreNuxConfig valueOf(String str) {
        return (RollCallLearnMoreNuxConfig) Enum.valueOf(RollCallLearnMoreNuxConfig.class, str);
    }

    public static RollCallLearnMoreNuxConfig[] values() {
        return (RollCallLearnMoreNuxConfig[]) A01.clone();
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
