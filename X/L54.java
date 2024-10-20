package X;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* loaded from: L54.class */
public final class L54 {
    public final View A00;
    public final Object A01;

    public L54(View view, ContentCaptureSession contentCaptureSession) {
        this.A01 = contentCaptureSession;
        this.A00 = view;
    }

    public static L54 A00(View view, ContentCaptureSession contentCaptureSession) {
        return new L54(view, contentCaptureSession);
    }

    public AutofillId A01(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return LCX.A02(this.A00.getAutofillId(), (ContentCaptureSession) this.A01, j);
    }

    public Kdq A02(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new Kdq(LCX.A01(autofillId, (ContentCaptureSession) this.A01, j));
        }
        return null;
    }

    public void A03(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            LCX.A04(autofillId, (ContentCaptureSession) this.A01, charSequence);
        }
    }

    public void A04(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            KUu.A00((ContentCaptureSession) this.A01, list);
            return;
        }
        if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A00 = LCX.A00(view, contentCaptureSession);
            A00.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            LCX.A03(A00, contentCaptureSession);
            for (int i2 = 0; i2 < list.size(); i2++) {
                LCX.A03((ViewStructure) list.get(i2), contentCaptureSession);
            }
            ViewStructure A002 = LCX.A00(view, contentCaptureSession);
            A002.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            LCX.A03(A002, contentCaptureSession);
        }
    }

    public void A05(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            LCX.A05(this.A00.getAutofillId(), (ContentCaptureSession) this.A01, jArr);
            return;
        }
        if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A00 = LCX.A00(view, contentCaptureSession);
            A00.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            LCX.A03(A00, contentCaptureSession);
            LCX.A05(view.getAutofillId(), contentCaptureSession, jArr);
            ViewStructure A002 = LCX.A00(view, contentCaptureSession);
            A002.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            LCX.A03(A002, contentCaptureSession);
        }
    }
}
