package X;

import java.io.File;

/* loaded from: Lnj.class */
public final class Lnj implements Runnable {
    public static final String __redex_internal_original_name = "AppLogPersistenceProxyHelperBase$deleteLog$1";
    public final /* synthetic */ Khl A00;
    public final /* synthetic */ String A01;

    public Lnj(Khl khl, String str) {
        this.A00 = khl;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Khl khl = this.A00;
            String str = this.A01;
            File file = khl.A01;
            if (file != null) {
                File A0D = AnonymousClass001.A0D(file, 0Pz.A0l("callSummaryInfo", str, ".callsum", '.'));
                if (A0D != null) {
                    A0D.delete();
                    return;
                }
            }
            0fH.A0j("AppLogPersistenceProxyBase", "Unable to open call stats file");
        } catch (Exception unused) {
            0fH.A0k("AppLogPersistenceProxyBase", 0Pz.A0m("Error deleting ", "callSummaryInfo", "AppLogPersistenceProxyBase".getMessage(), '\n'));
        }
    }
}
