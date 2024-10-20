package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.facebook.messaging.montage.composer.cameracore.view.CompositeCapturePreviewView;

/* renamed from: X.Go3, reason: case insensitive filesystem */
/* loaded from: Go3.class */
public final class C2786Go3 extends AbstractC2788Go5 implements JOk {
    public final /* synthetic */ I0M A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2786Go3(I0M i0m) {
        super(i0m);
        this.A00 = i0m;
    }

    @Override // X.JOk
    public void Blj(Bitmap bitmap) {
        11T.A0F(bitmap, 0);
        if (super.A00) {
            return;
        }
        2EU A00 = IQf.A00(bitmap);
        11T.A0A(A00);
        I0M i0m = this.A00;
        i0m.A00 = A00;
        C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
        if (C9lD.A01(c9lD, i0m.A0C)) {
            C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_1_end");
        }
        ICU icu = i0m.A0B.A00;
        icu.A07 = false;
        icu.A0f.run();
        H4T h4t = icu.A0W;
        CompositeCapturePreviewView compositeCapturePreviewView = (CompositeCapturePreviewView) h4t.A0B.A01();
        Float f = h4t.A08.A01;
        Htn htn = compositeCapturePreviewView.A00;
        htn.A02(f);
        ((ImageView) htn.A03).setImageBitmap(7zL.A0C(A00));
        h4t.A0W(1);
        h4t.A0G.A02();
    }

    @Override // X.JHs
    public void BnD() {
        super.BnD();
        I0M i0m = this.A00;
        C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
        if (C9lD.A01(c9lD, i0m.A0C)) {
            C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_1_cancel");
        }
    }

    @Override // X.JHs
    public void BnG(Exception exc) {
        11T.A0F(exc, 0);
        super.BnG(exc);
        I0M i0m = this.A00;
        C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
        String str = i0m.A0C;
        String message = exc.getMessage();
        if (C9lD.A01(c9lD, str)) {
            C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_1_error", message);
        }
    }
}
