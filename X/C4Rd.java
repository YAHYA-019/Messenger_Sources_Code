package X;

/* renamed from: X.4Rd, reason: invalid class name */
/* loaded from: 4Rd.class */
public enum C4Rd implements C07n {
    FOS_TOS_ACTION("fos_tos_action"),
    /* JADX INFO: Fake field, exist only in values array */
    FOS_TOS_OPT_OUT_ACTION("fos_tos_opt_out_action"),
    TRANSPARENCY_ACTION("transparency_action"),
    TRANSPARENCY_OPT_OUT_ACTION("transparency_opt_out_action");

    public final String mValue;

    C4Rd(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
