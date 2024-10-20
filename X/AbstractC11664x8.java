package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.4x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4x8.class */
public abstract class AbstractC11664x8 {
    public static final C11644x6 A00;
    public static final C11644x6 A01;
    public static final C11644x6 A02;
    public static final C11644x6 A03;
    public static final C11644x6 A04;
    public static final C11644x6 A05;
    public static final C11644x6 A06;
    public static final C11644x6 A07;
    public static final C11644x6 A08;
    public static final C11644x6 A09;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4x6, X.1G3] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.4x6, X.1G3] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.4x6, X.1G3] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.4x6, X.1G3] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.4x6, X.1G3] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.4x6, X.1G3] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.4x6, X.1G3] */
    static {
        ?? r0 = new 1G3("/sync/");
        A06 = r0;
        A09 = (C11644x6) r0.A0D("user_info_fetch_latest_thread_timestamp");
        A07 = (C11644x6) r0.A0D("sync_latest_user_info_fetch_timestamp_ms");
        A01 = (C11644x6) r0.A0D("last_fetch_room_threads_time_ms");
        A08 = new 1G3("sync_token");
        A03 = new 1G3("last_sequence_id");
        A04 = new 1G3("last_sync_full_refresh_ms");
        A05 = new 1G3("needs_full_refresh");
        A00 = new 1G3("full_refresh_reason");
        A02 = new 1G3("missed_delta_exception_seq_id");
        "db_server_inconsistency_messages_hash".getClass();
    }

    public static C11644x6 A00(1F9 r301) {
        return (C11644x6) A06.A0D(r301.dbName).A0D(AbE.A00(ActionId.ON_VIEW_CREATED_END));
    }

    public static C11644x6 A01(1F9 r301) {
        return (C11644x6) A06.A0D(r301.dbName).A0D("/last_get_threads_client_time_ms");
    }

    public static C11644x6 A02(1Hk r301) {
        return (C11644x6) A06.A0D(AbE.A00(779)).A0D(r301.dbName).A0D("/last_get_threads_client_time_ms");
    }
}
