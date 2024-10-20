package com.facebook.messaging.wellbeing.selfremediation.block.plugins.interfaces.blockmemberlistdata;

import X.7zU;
import X.C00t;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride.class */
public final class BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride[] A01;
    public static final BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride A02;
    public static final BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride A03;
    public static final Parcelable.Creator CREATOR;

    static {
        BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride = new BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride("FORCE_SOCIAL_CHANNEL_LAZY_LOAD", 0);
        A02 = blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride;
        BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride2 = new BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride("NONE", 1);
        A03 = blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride2;
        BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride[] blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverrideArr = {blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride, blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride2};
        A01 = blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverrideArr;
        A00 = C00t.A00(blockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverrideArr);
        CREATOR = CSU.A00(94);
    }

    public BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride(String str, int i) {
    }

    public static BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride valueOf(String str) {
        return (BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride) Enum.valueOf(BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride.class, str);
    }

    public static BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride[] values() {
        return (BlockGroupMembersDataProviderInterfaceSpec$BlockMembersDataOverride[]) A01.clone();
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
