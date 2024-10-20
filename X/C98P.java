package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98P, reason: invalid class name */
/* loaded from: 98P.class */
public final class C98P implements C07n {
    public static final /* synthetic */ C98P[] A00;
    public static final C98P A01;
    public final long mValue;

    static {
        C98P A002 = A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, 0L);
        A01 = A002;
        C98P[] c98pArr = new C98P[42];
        System.arraycopy(new C98P[]{A00("MESSENGER_DISAPPEARING_MODE_THREAD_DETAILS", 27, 27), A00("IMBE_STORY", 28, 28), A00("S4MI_STORY", 29, 29), A00("MESSENGER_DM_THREAD_WITH_EMPTY_DIRECT_THREAD", 30, 30), A00("MESSENGER_EMPTY_DIRECT_THREAD_WITH_DM_THREAD", 31, 31), A00("MARKETPLACE_C2C_TRANSACTION_SURVEY_SELECT_BUYER_ONLY", 32, 32), A00("MESSENGER_RTC_AR_EFFECT", 33, 33), A00("MESSENGER_ENCRYPTED_DIRECT_THREAD", 34, 34), A00("MESSENGER_ENCRYPTED_GROUP_THREAD", 35, 35), A00("MESSENGER_COMMUNITY_MESSAGING_GROUP_THREAD_DETAILS", 36, 36), A00("MESSENGER_RTC_COWATCH_AD", 37, 37), A00("MESSENGER_DIRECT_THREAD_WITH_DM", 38, 38), A00("MESSENGER_B2P_DIRECT_THREAD_DETAILS", 39, 39), A00("MESSENGER_PROACTIVE_WARNING_WEB_BANNER", 40, 40), A00("MESSENGER_COMMUNITY_MESSAGING_CHANNEL_LIST", 41, 41)}, 1BK.A1W(new C98P[]{A002, A00("MESSENGER_DIRECT_THREAD_DETAILS", 1, 1L), A00("MESSENGER_GROUP_THREAD_DETAILS", 2, 2), A00("MESSENGER_ENCRYPTED_THREAD", 3, 3), A00("MESSENGER_P2B_DIRECT_THREAD_DETAILS", 4, 4), A00("MESSENGER_THREAD", 5, 5), A00("MESSENGER_INBOX_AD", 6, 6), A00("MESSENGER_STORY_AD", 7, 7), A00("MESSENGER_SPONSORED_MESSAGE", 8, 8), A00("MESSENGER_STORY_VIEWER", 9, 9), A00("MARKETPLACE_RATE_SELLER", 10, 10), A00("MARKETPLACE_RATE_BUYER", 11, 11), A00("MARKETPLACE_C2C_TRANSACTION_SURVEY", 12, 12), A00("MARKETPLACE_SCALED_RATE_SELLER", 13, 13), A00("MARKETPLACE_SCALED_RATE_BUYER", 14, 14), A00("MESSENGER_DIRECT_THREAD_MESSAGE_REQUEST", 15, 15), A00("MESSENGER_GROUP_THREAD_MESSAGE_REQUEST", 16, 16), A00("MESSENGER_DIRECT_THREAD_FILTERED_REQUEST", 17, 17), A00("MESSENGER_GROUP_THREAD_FILTERED_REQUEST", 18, 18), A00("MESSENGER_P2B_DIRECT_THREAD", 19, 19), A00("MESSENGER_EMPTY_DIRECT_THREAD", 20, 20), A00("MARKETPLACE_MESSENGER_REPORT_SELLER", 21, 21), A00("MARKETPLACE_MESSENGER_REPORT_BUYER", 22, 22), A00("MESSENGER_RTC_COWATCH", 23, 23), A00("MESSENGER_ROOM", 24, 24), A00("MESSENGER_ROOM_LOBBY", 25, 25), A00("MESSENGER_ROOM_TRAY", 26, 26)}, c98pArr) ? 1 : 0, c98pArr, 27, 15);
        A00 = c98pArr;
    }

    public C98P(String str, int i, long j) {
        this.mValue = j;
    }

    public static C98P A00(String str, int i, long j) {
        return new C98P(str, i, j);
    }

    public static C98P valueOf(String str) {
        return (C98P) Enum.valueOf(C98P.class, str);
    }

    public static C98P[] values() {
        return (C98P[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
