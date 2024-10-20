package X;

import java.nio.file.FileVisitResult;

/* loaded from: MAa.class */
public abstract class MAa extends Ly2 {
    public final KtK A00;
    public final MHa A01;
    public final MHa A02;

    public MAa(KtK ktK) {
        Lrt lrt = new Lrt(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
        MRa mRa = Lia.A00;
        this.A00 = ktK;
        this.A02 = lrt;
        C6f2.A00("dirFilter", mRa);
        this.A01 = mRa;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MAa) {
            return 2Go.A00(this.A00, ((MAa) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    public String toString() {
        return this.A00.toString();
    }
}
