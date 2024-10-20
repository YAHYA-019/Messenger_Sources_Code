package X;

/* renamed from: X.4Re, reason: invalid class name */
/* loaded from: 4Re.class */
public enum C4Re implements C07n {
    GROUP_THREAD_CREATED_OPTIMISTICALLY("group_thread_created_optimistically"),
    GROUP_THREAD_CREATED_AUTHORITATIVELY("group_thread_created_authoritatively"),
    GROUP_THREAD_CLICK("group_thread_click"),
    GROUP_THREAD_IMPRESSION("group_thread_impression");

    public final String mValue;

    C4Re(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
