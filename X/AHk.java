package X;

import android.widget.TextView;
import com.facebook.messaging.composer.OneLineComposerView;

/* loaded from: AHk.class */
public final class AHk implements C00l, C00m {
    public final int A00;
    public final Object A01;

    public AHk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C00m
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return ((6PP) this.A01).A0S.getText().toString();
            case 1:
                return Integer.valueOf(((TextView) this.A01).getSelectionStart());
            case 2:
                return Integer.valueOf(((TextView) this.A01).getSelectionEnd());
            case 3:
                return ((TextView) this.A01).getEditableText();
            case 4:
                ((OneLineComposerView) this.A01).Cn6(0S2.A0Y);
                return 04S.A00;
            default:
                return ((1qX) this.A01).mResultSet.getString(0, 64);
        }
    }
}
