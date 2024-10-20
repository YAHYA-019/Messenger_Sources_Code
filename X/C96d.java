package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96d, reason: invalid class name */
/* loaded from: 96d.class */
public final class C96d {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96d[] A01;
    public final String message;
    public static final C96d A02 = new C96d("DATA_INCOMPLETE", 0, "The memory data is incomplete");
    public static final C96d A03 = new C96d("DATA_NULL", 1, "The memory data is null");
    public static final C96d A06 = new C96d("OBSERVER_TIMEOUT", 2, "Detail view observer timed out");
    public static final C96d A05 = new C96d("MAILBOX_CALLBACK_RESULT_VALUE", 3, "MailboxCallback result failure");
    public static final C96d A04 = new C96d("JUMP_THREAD_KEY_PARSE_ERROR", 4, "Parsing thread key for memory on jump to message");

    static {
        C96d[] c96dArr = {A02, A03, A06, A05, A04, new C96d("MEMORIES_MAILBOX_FETCH_FAILED", 5, "Failed to retrieve memories table from mailbox")};
        A01 = c96dArr;
        A00 = C00t.A00(c96dArr);
    }

    public C96d(String str, int i, String str2) {
        this.message = 0Pz.A0W("Memory Client Error: ", str2);
    }

    public static C96d valueOf(String str) {
        return (C96d) Enum.valueOf(C96d.class, str);
    }

    public static C96d[] values() {
        return (C96d[]) A01.clone();
    }
}
