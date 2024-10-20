package X;

import com.facebook.acra.constants.ActionId;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yg.class */
public final class EnumC03583yg implements C07n {
    public static final /* synthetic */ EnumC03583yg[] A00;
    public static final EnumC03583yg A01;
    public static final EnumC03583yg A02;
    public static final EnumC03583yg A03;
    public static final EnumC03583yg A04;
    public static final EnumC03583yg A05;
    public static final EnumC03583yg A06;
    public static final EnumC03583yg A07;
    public static final EnumC03583yg A08;
    public static final EnumC03583yg A09;
    public static final EnumC03583yg A0A;
    public static final EnumC03583yg A0B;
    public static final EnumC03583yg A0C;
    public static final EnumC03583yg A0D;
    public static final EnumC03583yg A0E;
    public static final EnumC03583yg A0F;
    public static final EnumC03583yg A0G;
    public static final EnumC03583yg A0H;
    public static final EnumC03583yg A0I;
    public static final EnumC03583yg A0J;
    public static final EnumC03583yg A0K;
    public static final EnumC03583yg A0L;
    public static final EnumC03583yg A0M;
    public final long mValue;

    static {
        EnumC03583yg enumC03583yg = new EnumC03583yg("COMMUNITY_FOLDER", 0, 17);
        A07 = enumC03583yg;
        EnumC03583yg enumC03583yg2 = new EnumC03583yg("COMMUNITY_GROUP", 1, 18);
        A08 = enumC03583yg2;
        EnumC03583yg enumC03583yg3 = new EnumC03583yg("COMMUNITY_GROUP_UNJOINED", 2, 19);
        EnumC03583yg enumC03583yg4 = new EnumC03583yg("COMMUNITY_CHANNEL_CATEGORY", 3, 20);
        A06 = enumC03583yg4;
        EnumC03583yg enumC03583yg5 = new EnumC03583yg("COMMUNITY_PRIVATE_HIDDEN_JOINED_THREAD", 4, 21);
        EnumC03583yg enumC03583yg6 = new EnumC03583yg("COMMUNITY_PRIVATE_HIDDEN_UNJOINED_THREAD", 5, 22);
        EnumC03583yg enumC03583yg7 = new EnumC03583yg("COMMUNITY_BROADCAST_JOINED_THREAD", 6, 23);
        EnumC03583yg enumC03583yg8 = new EnumC03583yg("COMMUNITY_BROADCAST_UNJOINED_THREAD", 7, 24);
        EnumC03583yg enumC03583yg9 = new EnumC03583yg("COMMUNITY_GROUP_INVITED_UNJOINED", 8, 25);
        EnumC03583yg enumC03583yg10 = new EnumC03583yg("COMMUNITY_SUB_THREAD", 9, 26);
        A09 = enumC03583yg10;
        EnumC03583yg enumC03583yg11 = new EnumC03583yg("DISCOVERABLE_PUBLIC_CHAT", 10, 150L);
        EnumC03583yg enumC03583yg12 = new EnumC03583yg("DISCOVERABLE_PUBLIC_CHAT_UNJOINED", 11, 151L);
        EnumC03583yg enumC03583yg13 = new EnumC03583yg("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 12, 152L);
        A0A = enumC03583yg13;
        EnumC03583yg enumC03583yg14 = new EnumC03583yg("DISCOVERABLE_PUBLIC_BROADCAST_CHAT_UNJOINED", 13, 153L);
        EnumC03583yg enumC03583yg15 = new EnumC03583yg("DISCOVERABLE_PUBLIC_CHAT_V2", 14, 154L);
        A0B = enumC03583yg15;
        EnumC03583yg enumC03583yg16 = new EnumC03583yg("DISCOVERABLE_PUBLIC_CHAT_V2_UNJOINED", 15, 155L);
        EnumC03583yg enumC03583yg17 = new EnumC03583yg("ONE_TO_ONE", 16, 1L);
        A0G = enumC03583yg17;
        EnumC03583yg enumC03583yg18 = new EnumC03583yg("GROUP", 17, 2);
        A0D = enumC03583yg18;
        EnumC03583yg enumC03583yg19 = new EnumC03583yg("ROOM", 18, 3);
        A0H = enumC03583yg19;
        EnumC03583yg enumC03583yg20 = new EnumC03583yg("MONTAGE", 19, 4);
        A0F = enumC03583yg20;
        EnumC03583yg enumC03583yg21 = new EnumC03583yg("MARKETPLACE", 20, 5);
        A0E = enumC03583yg21;
        EnumC03583yg enumC03583yg22 = new EnumC03583yg("FOLDER", 21, 6);
        A0C = enumC03583yg22;
        EnumC03583yg enumC03583yg23 = new EnumC03583yg("TINCAN_ONE_TO_ONE", 22, 7);
        A0K = enumC03583yg23;
        EnumC03583yg enumC03583yg24 = new EnumC03583yg("TINCAN_GROUP_DISAPPEARING", 23, 8);
        A0J = enumC03583yg24;
        EnumC03583yg enumC03583yg25 = new EnumC03583yg("CARRIER_MESSAGING_ONE_TO_ONE", 24, 10);
        A05 = enumC03583yg25;
        EnumC03583yg enumC03583yg26 = new EnumC03583yg("CARRIER_MESSAGING_GROUP", 25, 11);
        A04 = enumC03583yg26;
        EnumC03583yg enumC03583yg27 = new EnumC03583yg("TINCAN_ONE_TO_ONE_DISAPPEARING", 26, 13);
        A0L = enumC03583yg27;
        EnumC03583yg enumC03583yg28 = new EnumC03583yg("PAGE_FOLLOW_UP", 27, 14);
        EnumC03583yg enumC03583yg29 = new EnumC03583yg("SECURE_MESSAGE_OVER_WA_ONE_TO_ONE", 28, 15);
        EnumC03583yg enumC03583yg30 = new EnumC03583yg("SECURE_MESSAGE_OVER_WA_GROUP", 29, 16);
        EnumC03583yg enumC03583yg31 = new EnumC03583yg("PINNED", 30, ActionId.ON_VIEW_CREATED_END);
        EnumC03583yg enumC03583yg32 = new EnumC03583yg("LWG", 31, ActionId.DATA_LOAD_START);
        EnumC03583yg enumC03583yg33 = new EnumC03583yg("XAC_GROUP", 32, 200L);
        EnumC03583yg enumC03583yg34 = new EnumC03583yg("AI_BOT", 33, 201L);
        A01 = enumC03583yg34;
        EnumC03583yg enumC03583yg35 = new EnumC03583yg(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 34, 0L);
        A0M = enumC03583yg35;
        EnumC03583yg enumC03583yg36 = new EnumC03583yg("SELF_THREAD", 35, 12);
        A0I = enumC03583yg36;
        EnumC03583yg enumC03583yg37 = new EnumC03583yg("ARMADILLO_ONE_TO_ONE", 36, -1);
        A03 = enumC03583yg37;
        EnumC03583yg enumC03583yg38 = new EnumC03583yg("ARMADILLO_GROUP", 37, -2);
        A02 = enumC03583yg38;
        EnumC03583yg[] enumC03583ygArr = new EnumC03583yg[38];
        System.arraycopy(new EnumC03583yg[]{enumC03583yg, enumC03583yg2, enumC03583yg3, enumC03583yg4, enumC03583yg5, enumC03583yg6, enumC03583yg7, enumC03583yg8, enumC03583yg9, enumC03583yg10, enumC03583yg11, enumC03583yg12, enumC03583yg13, enumC03583yg14, enumC03583yg15, enumC03583yg16, enumC03583yg17, enumC03583yg18, enumC03583yg19, enumC03583yg20, enumC03583yg21, enumC03583yg22, enumC03583yg23, enumC03583yg24, enumC03583yg25, enumC03583yg26, enumC03583yg27}, 0, enumC03583ygArr, 0, 27);
        System.arraycopy(new EnumC03583yg[]{enumC03583yg28, enumC03583yg29, enumC03583yg30, enumC03583yg31, enumC03583yg32, enumC03583yg33, enumC03583yg34, enumC03583yg35, enumC03583yg36, enumC03583yg37, enumC03583yg38}, 0, enumC03583ygArr, 27, 11);
        A00 = enumC03583ygArr;
    }

    public EnumC03583yg(String str, int i, long j) {
        this.mValue = j;
    }

    public static EnumC03583yg valueOf(String str) {
        return (EnumC03583yg) Enum.valueOf(EnumC03583yg.class, str);
    }

    public static EnumC03583yg[] values() {
        return (EnumC03583yg[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
