package X;

/* loaded from: J1d.class */
public final class J1d implements Runnable {
    public static final String __redex_internal_original_name = "UploadProtocol$TransferProgressListener$onCompletion$1";
    public final /* synthetic */ ICS A00;
    public final /* synthetic */ ISe A01;
    public final /* synthetic */ IF5 A02;

    public J1d(ICS ics, ISe iSe, IF5 if5) {
        this.A02 = if5;
        this.A01 = iSe;
        this.A00 = ics;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IF5 if5 = this.A02;
        JM1 jm1 = if5.A0D;
        if (jm1 == null) {
            IF5.A02(this.A00, this.A01.A02, if5);
            return;
        }
        Integer num = 0S2.A01;
        Rb8 rb8 = this.A01.A02;
        ICS ics = this.A00;
        S3N s3n = new S3N(new IkI(ics, rb8, if5, num), if5.A0N);
        QxZ qxZ = if5.A00;
        if (qxZ == null) {
            throw 1BK.A0h();
        }
        jm1.Cl7(ics, qxZ, s3n, rb8);
    }
}
