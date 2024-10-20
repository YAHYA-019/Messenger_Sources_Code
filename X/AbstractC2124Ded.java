package X;

import android.content.DialogInterface;
import android.os.Message;

/* renamed from: X.Ded, reason: case insensitive filesystem */
/* loaded from: Ded.class */
public abstract class AbstractC2124Ded extends DMV {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2124Ded(android.content.Context r302) {
        /*
            r301 = this;
            X.5ig r0 = new X.5ig
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r303
            r1 = 0
            int r0 = X.DMV.A00(r0, r1)
            r304 = r0
            r0 = r301
            r1 = r303
            r2 = r304
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2124Ded.<init>(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        if (6QE.A00) {
            6QE.A00(this);
            6QE.A01(this);
            6QE.A02(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCancelMessage(Message message) {
        if (6QE.A00) {
            6QE.A00(this);
        }
        super/*android.app.Dialog*/.setCancelMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDismissMessage(Message message) {
        if (6QE.A00) {
            6QE.A01(this);
        }
        super/*android.app.Dialog*/.setDismissMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        if (6QE.A00) {
            6QE.A00(this);
        }
        super/*android.app.Dialog*/.setOnCancelListener(onCancelListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (6QE.A00) {
            6QE.A01(this);
        }
        super/*android.app.Dialog*/.setOnDismissListener(onDismissListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        if (6QE.A00) {
            6QE.A02(this);
        }
        super/*android.app.Dialog*/.setOnShowListener(onShowListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        6QF.A00(this);
        super/*android.app.Dialog*/.show();
    }
}
