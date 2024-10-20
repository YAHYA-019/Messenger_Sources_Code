package X;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.91e, reason: invalid class name */
/* loaded from: 91e.class */
public final class C91e extends 81W {
    public final RQj A00;

    public C91e(File file, InputStream inputStream) {
        super(inputStream);
        ((81W) this).A00 = 0L;
        this.A00 = new RQj(file, 0);
    }

    public void A00() {
        this.A00.A00(((81W) this).A00, true);
    }

    public void A01(IOException iOException) {
        this.A00.A00(((81W) this).A00, false);
        throw iOException;
    }
}
