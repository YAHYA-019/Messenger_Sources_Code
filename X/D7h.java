package X;

/* loaded from: D7h.class */
public final class D7h implements Runnable {
    public static final String __redex_internal_original_name = "IgnoreMessagesHandler$ignoreMessageThreadMsys$1$1";
    public final /* synthetic */ C7Q A00;
    public final /* synthetic */ Boolean A01;

    public D7h(C7Q c7q, Boolean bool) {
        this.A01 = bool;
        this.A00 = c7q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool = this.A01;
        11T.A0D(bool);
        boolean booleanValue = bool.booleanValue();
        C7Q c7q = this.A00;
        if (booleanValue) {
            c7q.A00();
        } else {
            c7q.A01(new Exception("Unable to ignore message"));
        }
    }
}
