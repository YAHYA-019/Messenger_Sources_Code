package X;

/* renamed from: X.97b, reason: invalid class name */
/* loaded from: 97b.class */
public enum C97b {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    THREADVIEW_SUGGESTED_PROMPT("THREADVIEW_SUGGESTED_PROMPT"),
    TYPEAHEAD_SUGGESTED_PROMPT("TYPEAHEAD_SUGGESTED_PROMPT"),
    SUGGESTED_PROMPT("SUGGESTED_PROMPT"),
    NULL_STATE_PROMPT("NULL_STATE_PROMPT"),
    USER_INPUT_PROMPT("USER_INPUT_PROMPT"),
    GENERIC_PROMPT("GENERIC_PROMPT"),
    /* JADX INFO: Fake field, exist only in values array */
    THREADVIEW_USER_INPUT_PROMPT("THREADVIEW_USER_INPUT_PROMPT");

    public final String serverValue;

    C97b(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
