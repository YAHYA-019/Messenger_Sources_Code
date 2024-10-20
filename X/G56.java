package X;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* loaded from: G56.class */
public final class G56 implements Runnable {
    public static final String __redex_internal_original_name = "FBNTExceptionHandler$1";
    public final /* synthetic */ FkZ A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public G56(FkZ fkZ, Exception exc, String str, boolean z) {
        this.A00 = fkZ;
        this.A03 = z;
        this.A01 = exc;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            FkZ fkZ = this.A00;
            AlertDialog.Builder title = new AlertDialog.Builder(fkZ.A01).setTitle(this.A03 ? "[FB-Only] NT User Exception" : "[FB-Only] NT Infra Exception");
            Exception exc = this.A01;
            title.setMessage(exc.getCause() == null ? exc.getMessage() : exc.getCause().getMessage()).setPositiveButton((CharSequence) "ok", (DialogInterface.OnClickListener) FK6.A00(fkZ, 37)).setNeutralButton((CharSequence) "more info", (DialogInterface.OnClickListener) FK6.A00(this, 36)).setNegativeButton((CharSequence) "skip all", (DialogInterface.OnClickListener) FK6.A00(this, 35)).show();
        } catch (Exception e) {
            0fH.A0N(FkZ.class, "NativeTemplates|%s", e, new Object[]{this.A02});
        }
    }
}
