package X;

import android.text.TextUtils;

/* loaded from: Eti.class */
public final class Eti {
    public ENM A00;
    public String A01;
    public Throwable A02;

    public ERn A00() {
        if (this.A00 == null) {
            throw AnonymousClass001.A0L("Must set load exception type");
        }
        String str = TextUtils.isEmpty(this.A01) ? this.A00.mMessage : this.A01;
        Throwable th = this.A02;
        if (th != null) {
            str = TextUtils.join(";", new String[]{str, th.getMessage()});
        }
        return new ERn(this.A00, str, this.A02);
    }
}
