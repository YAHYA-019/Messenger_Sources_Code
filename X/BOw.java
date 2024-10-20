package X;

/* loaded from: BOw.class */
public enum BOw implements C4zn {
    SEE_ALL("see_all"),
    MESSAGE_MULTIPLE("message_multiple"),
    MESSAGE_SINGLE("message_single");

    public final String loggingName;

    BOw(String str) {
        this.loggingName = str;
    }

    @Override // X.C4zn
    public String Aus() {
        return this.loggingName;
    }
}
