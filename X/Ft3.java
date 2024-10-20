package X;

/* loaded from: Ft3.class */
public final class Ft3 implements GIo {
    public final /* synthetic */ GIo A00;
    public final /* synthetic */ FtE A01;
    public final /* synthetic */ GJg A02;

    public Ft3(GIo gIo, FtE ftE, GJg gJg) {
        this.A01 = ftE;
        this.A02 = gJg;
        this.A00 = gIo;
    }

    @Override // X.GIo
    public void accept(Object obj) {
        this.A02.A3k(this.A00, this.A01, obj);
    }

    @Override // X.GIo
    public void close() {
        this.A02.CNs();
        this.A00.close();
    }
}
