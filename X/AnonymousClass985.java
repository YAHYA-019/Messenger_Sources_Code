package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.985, reason: invalid class name */
/* loaded from: 985.class */
public enum AnonymousClass985 implements C07n {
    SUCCESS(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS),
    FAIL("fail"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public final String mValue;

    AnonymousClass985(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
