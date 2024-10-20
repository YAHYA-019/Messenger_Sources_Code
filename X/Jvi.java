package X;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: Jvi.class */
public final class Jvi extends AbstractC11304w4 {
    public final RQj A00;

    public Jvi(File file, OutputStream outputStream) {
        super(outputStream);
        ((AbstractC11304w4) this).A00 = 0L;
        this.A00 = new RQj(file, 1);
    }

    @Override // X.AbstractC11304w4
    public void A00() {
        this.A00.A00(((AbstractC11304w4) this).A00, true);
    }

    @Override // X.AbstractC11304w4
    public void A01(IOException iOException) {
        this.A00.A00(((AbstractC11304w4) this).A00, false);
        throw iOException;
    }
}
