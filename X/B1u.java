package X;

import android.view.inputmethod.InputMethodManager;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: B1u.class */
public final class B1u extends 2Yv {
    public int A00;
    public InputMethodManager A01;
    public Emoji A02;
    public boolean A03;

    /* JADX WARN: Type inference failed for: r308v0, types: [java.lang.Object, X.66W] */
    /* JADX WARN: Type inference failed for: r308v2, types: [java.lang.Object, X.66W] */
    public void A02(C2l4 c2l4) {
        66W r308;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            this.A02 = (Emoji) objArr[0];
            return;
        }
        if (i == 1) {
            ?? obj = new Object();
            ((66W) obj).A00 = Integer.valueOf(this.A00);
            ((66W) obj).A00 = objArr[0];
            r308 = obj;
        } else if (i != 2) {
            if (i == 3) {
                this.A03 = 7zO.A1Z(objArr, 0);
                return;
            }
            return;
        } else {
            ?? obj2 = new Object();
            ((66W) obj2).A00 = Integer.valueOf(this.A00);
            Emoji emoji = (Emoji) objArr[0];
            ((66W) obj2).A00 = objArr[1];
            this.A02 = emoji;
            r308 = obj2;
        }
        this.A00 = AnonymousClass001.A03(r308.A00);
    }
}
