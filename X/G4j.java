package X;

import android.text.TextUtils;

/* loaded from: G4j.class */
public final class G4j implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$3$1";
    public final /* synthetic */ EoJ A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Throwable A02;

    public G4j(EoJ eoJ, Object obj, Throwable th) {
        this.A00 = eoJ;
        this.A02 = th;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.A02;
        String str = null;
        try {
            if (!TextUtils.isEmpty(null)) {
                str = this.A00.A01.decodeResponse((String) null);
            }
            EoJ eoJ = this.A00;
            eoJ.A03.execute(new G5t(eoJ.A00, eoJ.A02, this.A01, str, th));
        } catch (IllegalArgumentException e) {
            EoJ eoJ2 = this.A00;
            eoJ2.A03.execute(new G5t(eoJ2.A00, eoJ2.A02, this.A01, null, e));
        } catch (Throwable th2) {
            EoJ eoJ3 = this.A00;
            eoJ3.A03.execute(new G5t(eoJ3.A00, eoJ3.A02, this.A01, null, th));
            throw th2;
        }
    }
}
