package X;

/* renamed from: X.4Rc, reason: invalid class name */
/* loaded from: 4Rc.class */
public enum C4Rc implements C07n {
    CONTENTPROVIDER("contentprovider"),
    DEEPLINK("deeplink"),
    /* JADX INFO: Fake field, exist only in values array */
    KEYCHAIN("nsuserdefaults"),
    /* JADX INFO: Fake field, exist only in values array */
    KEYCHAIN("keychain"),
    SHAREDSTORAGE("sharedstorage");

    public final String mValue;

    C4Rc(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
