package X;

/* loaded from: AFj.class */
public final class AFj implements Runnable {
    public static final String __redex_internal_original_name = "TamDeleteMessageController$globalDeleteMessage$1$1";
    public final /* synthetic */ AZm A00;
    public final /* synthetic */ Boolean A01;

    public AFj(AZm aZm, Boolean bool) {
        this.A01 = bool;
        this.A00 = aZm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool = this.A01;
        11T.A0D(bool);
        boolean booleanValue = bool.booleanValue();
        AZm aZm = this.A00;
        if (booleanValue) {
            aZm.Bt6();
        } else {
            aZm.Bt5(new Exception("Unsend via mailbox was not successful"));
        }
    }
}
