package X;

import com.facebook.acra.constants.ActionId;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1q8, reason: invalid class name */
/* loaded from: 1q8.class */
public final class C1q8 {
    public static final ImmutableMap A00;
    public static final /* synthetic */ C1q8[] A01;
    public static final C1q8 A02;
    public static final C1q8 A03;
    public static final C1q8 A04;
    public static final C1q8 A05;
    public static final C1q8 A06;
    public static final C1q8 A07;
    public static final C1q8 A08;
    public static final C1q8 A09;
    public static final C1q8 A0A;
    public static final C1q8 A0B;
    public static final C1q8 A0C;
    public static final C1q8 A0D;
    public static final C1q8 A0E;
    public static final C1q8 A0F;
    public static final C1q8 A0G;
    public static final C1q8 A0H;
    public static final C1q8 A0I;
    public static final C1q8 A0J;
    public static final C1q8 A0K;
    public static final C1q8 A0L;
    public static final C1q8 A0M;
    public static final C1q8 A0N;
    public static final C1q8 A0O;
    public static final C1q8 A0P;
    public static final C1q8 A0Q;
    public static final C1q8 A0R;
    public static final C1q8 A0S;
    public static final C1q8 A0T;
    public static final C1q8 A0U;
    public static final C1q8 A0V;
    public static final C1q8 A0W;
    public final int dbKeyValue;

    static {
        C1q8 c1q8 = new C1q8("BEFORE_FIRST_SENTINEL", 0, -1);
        A05 = c1q8;
        C1q8 c1q82 = new C1q8("REGULAR", 1, 0);
        A0N = c1q82;
        C1q8 c1q83 = new C1q8("ADD_MEMBERS", 2, 1);
        A03 = c1q83;
        C1q8 c1q84 = new C1q8("REMOVE_MEMBERS", 3, 2);
        A0P = c1q84;
        C1q8 c1q85 = new C1q8("SET_NAME", 4, 3);
        A0R = c1q85;
        C1q8 c1q86 = new C1q8("SET_IMAGE", 5, 4);
        A0Q = c1q86;
        C1q8 c1q87 = new C1q8("VIDEO_CALL", 6, 5);
        A0W = c1q87;
        C1q8 c1q88 = new C1q8("MISSED_VIDEO_CALL", 7, 6);
        A0E = c1q88;
        C1q8 c1q89 = new C1q8("REMOVED_IMAGE", 8, 7);
        A0O = c1q89;
        C1q8 c1q810 = new C1q8("ADMIN", 9, 8);
        A04 = c1q810;
        C1q8 c1q811 = new C1q8("CALL_LOG", 10, 9);
        A07 = c1q811;
        C1q8 c1q812 = new C1q8("P2P_PAYMENT", 11, 50);
        A0J = c1q812;
        C1q8 c1q813 = new C1q8("P2P_PAYMENT_CANCELED", 12, 51);
        A0K = c1q813;
        C1q8 c1q814 = new C1q8("P2P_PAYMENT_GROUP", 13, 52);
        A0L = c1q814;
        C1q8 c1q815 = new C1q8("INCOMING_CALL", 14, 100);
        A0C = c1q815;
        C1q8 c1q816 = new C1q8("MISSED_CALL", 15, ActionId.ON_VIEW_CREATED_END);
        A0D = c1q816;
        C1q8 c1q817 = new C1q8("OUTGOING_CALL", 16, ActionId.DATA_LOAD_START);
        A0I = c1q817;
        C1q8 c1q818 = new C1q8("COMMERCE_LINK", 17, 150);
        A08 = c1q818;
        C1q8 c1q819 = new C1q8("COMMERCE_UNLINK", 18, ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
        A09 = c1q819;
        C1q8 c1q820 = new C1q8("ACTIVITY_REPLY", 19, ActionId.APPLY_OPTIMISTICS);
        A02 = c1q820;
        C1q8 c1q821 = new C1q8("TELEPHONE_CALL_LOG", 20, 200);
        A0U = c1q821;
        C1q8 c1q822 = new C1q8("SMS_LOG", 21, 201);
        A0S = c1q822;
        C1q8 c1q823 = new C1q8("SMS_MATCH", 22, 202);
        A0T = c1q823;
        C1q8 c1q824 = new C1q8("GROUP_CALL_LOG", 23, 203);
        A0B = c1q824;
        C1q8 c1q825 = new C1q8("BLOCKED", 24, 300);
        A06 = c1q825;
        C1q8 c1q826 = new C1q8("MSYS_TYPING", 25, 400);
        A0H = c1q826;
        C1q8 c1q827 = new C1q8("MSYS_LOAD_MORE_BEFORE", 26, 401);
        A0G = c1q827;
        C1q8 c1q828 = new C1q8("MSYS_LOAD_MORE_AFTER", 27, 402);
        A0F = c1q828;
        C1q8 c1q829 = new C1q8("PENDING_SEND", 28, 900);
        A0M = c1q829;
        C1q8 c1q830 = new C1q8("FAILED_SEND", 29, 901);
        A0A = c1q830;
        C1q8 c1q831 = new C1q8(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 30, 1000);
        A0V = c1q831;
        C1q8[] c1q8Arr = new C1q8[31];
        System.arraycopy(new C1q8[]{c1q8, c1q82, c1q83, c1q84, c1q85, c1q86, c1q87, c1q88, c1q89, c1q810, c1q811, c1q812, c1q813, c1q814, c1q815, c1q816, c1q817, c1q818, c1q819, c1q820, c1q821, c1q822, c1q823, c1q824, c1q825, c1q826, c1q827}, 0, c1q8Arr, 0, 27);
        System.arraycopy(new C1q8[]{c1q828, c1q829, c1q830, c1q831}, 0, c1q8Arr, 27, 4);
        A01 = c1q8Arr;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (C1q8 c1q832 : values()) {
            builder.put(Integer.valueOf(c1q832.dbKeyValue), c1q832);
        }
        A00 = builder.build();
    }

    public C1q8(String str, int i, int i2) {
        this.dbKeyValue = i2;
    }

    public static C1q8 A00(int i) {
        ImmutableMap immutableMap = A00;
        Integer valueOf = Integer.valueOf(i);
        Object obj = immutableMap.get(valueOf);
        if (obj != null) {
            return (C1q8) obj;
        }
        throw AnonymousClass001.A0Q(Strings.lenientFormat("Unknown db key value %s", valueOf));
    }

    public static C1q8 valueOf(String str) {
        return (C1q8) Enum.valueOf(C1q8.class, str);
    }

    public static C1q8[] values() {
        return (C1q8[]) A01.clone();
    }
}
