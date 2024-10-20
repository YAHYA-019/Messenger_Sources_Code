package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Rh, reason: invalid class name */
/* loaded from: 4Rh.class */
public final class C4Rh implements C07n {
    public static final /* synthetic */ C4Rh[] A00;
    public final String mValue;

    static {
        C4Rh A002 = A00("AI_BOT", 0);
        C4Rh A003 = A00("ARMADILLO_GROUP", 1);
        C4Rh A004 = A00("ARMADILLO_ONE_TO_ONE", 2);
        C4Rh A005 = A00("CARRIER_MESSAGING_GROUP", 3);
        C4Rh A006 = A00("CARRIER_MESSAGING_ONE_TO_ONE", 4);
        C4Rh A007 = A00("COMMUNITY_BROADCAST_JOINED_THREAD", 5);
        C4Rh A008 = A00("COMMUNITY_BROADCAST_UNJOINED_THREAD", 6);
        C4Rh A009 = A00("COMMUNITY_CHANNEL_CATEGORY", 7);
        C4Rh A0010 = A00("COMMUNITY_FOLDER", 8);
        C4Rh A0011 = A00("COMMUNITY_GROUP", 9);
        C4Rh A0012 = A00("COMMUNITY_GROUP_INVITED_UNJOINED", 10);
        C4Rh A0013 = A00("COMMUNITY_GROUP_UNJOINED", 11);
        C4Rh A0014 = A00("COMMUNITY_PRIVATE_HIDDEN_JOINED_THREAD", 12);
        C4Rh A0015 = A00("COMMUNITY_PRIVATE_HIDDEN_UNJOINED_THREAD", 13);
        C4Rh A0016 = A00("COMMUNITY_SUB_THREAD", 14);
        C4Rh A0017 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 15);
        C4Rh A0018 = A00("DISCOVERABLE_PUBLIC_BROADCAST_CHAT_UNJOINED", 16);
        C4Rh A0019 = A00("DISCOVERABLE_PUBLIC_CHAT", 17);
        C4Rh A0020 = A00("DISCOVERABLE_PUBLIC_CHAT_UNJOINED", 18);
        C4Rh A0021 = A00("DISCOVERABLE_PUBLIC_CHAT_V2", 19);
        C4Rh A0022 = A00("DISCOVERABLE_PUBLIC_CHAT_V2_UNJOINED", 20);
        C4Rh A0023 = A00("FOLDER", 21);
        C4Rh A0024 = A00("GROUP", 22);
        C4Rh A0025 = A00("LWG", 23);
        C4Rh A0026 = A00("MARKETPLACE", 24);
        C4Rh A0027 = A00("MONTAGE", 25);
        C4Rh A0028 = A00("ONE_TO_ONE", 26);
        C4Rh A0029 = A00("PAGE_FOLLOW_UP", 27);
        C4Rh A0030 = A00("PINNED", 28);
        C4Rh A0031 = A00("ROOM", 29);
        C4Rh A0032 = A00("SECURE_MESSAGE_OVER_WA_GROUP", 30);
        C4Rh A0033 = A00("SECURE_MESSAGE_OVER_WA_ONE_TO_ONE", 31);
        C4Rh A0034 = A00("SELF_THREAD", 32);
        C4Rh A0035 = A00("TINCAN_GROUP_DISAPPEARING", 33);
        C4Rh A0036 = A00("TINCAN_ONE_TO_ONE", 34);
        C4Rh A0037 = A00("TINCAN_ONE_TO_ONE_DISAPPEARING", 35);
        C4Rh A0038 = A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 36);
        C4Rh A0039 = A00("XAC_GROUP", 37);
        C4Rh[] c4RhArr = new C4Rh[38];
        System.arraycopy(new C4Rh[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, 0, c4RhArr, 0, 27);
        System.arraycopy(new C4Rh[]{A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039}, 0, c4RhArr, 27, 11);
        A00 = c4RhArr;
    }

    public C4Rh(String str, int i, String str2) {
        this.mValue = str2;
    }

    public static C4Rh A00(String str, int i) {
        return new C4Rh(str, i, str);
    }

    public static C4Rh valueOf(String str) {
        return (C4Rh) Enum.valueOf(C4Rh.class, str);
    }

    public static C4Rh[] values() {
        return (C4Rh[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
