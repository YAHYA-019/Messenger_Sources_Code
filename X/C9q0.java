package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.TextView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.primitive.textinput.TextInputView;
import java.util.List;

/* renamed from: X.9q0, reason: invalid class name */
/* loaded from: 9q0.class */
public final class C9q0 implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C9q0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.A00) {
            case 0:
                if (z) {
                    C9c5 c9c5 = (C9c5) this.A01;
                    9nJ A0j = 7zQ.A0j(c9c5.A05);
                    SharedAlbumArgs sharedAlbumArgs = c9c5.A08;
                    ThreadKey threadKey = sharedAlbumArgs.A01;
                    long j = sharedAlbumArgs.A00;
                    11T.A0F(threadKey, 0);
                    9nJ.A03(C98N.ALBUM_RENAME_DIALOG, 98L.A02, threadKey, A0j, "click", "text_input_title", (List) null, (List) null, j);
                    return;
                }
                return;
            case 1:
                if (view instanceof TextInputView) {
                    if (!z) {
                        TextInputView textInputView = (TextInputView) view;
                        if (textInputView.getEllipsize() == null && 9FQ.A00.A04(textInputView) && C9mU.A03(textInputView)) {
                            C9mU.A00(TextUtils.TruncateAt.END, (C9cu) this.A01, textInputView);
                            return;
                        }
                        return;
                    }
                    TextView textView = (TextView) view;
                    C9cu c9cu = (C9cu) this.A01;
                    11T.A0F(textView, 0);
                    KeyListener keyListener = c9cu.A00;
                    if (keyListener == null) {
                        9W5 r0 = c9cu.A03;
                        if (r0 == null) {
                            throw 1BK.A0h();
                        }
                        keyListener = r0.A0H;
                    }
                    if (textView.getKeyListener() == keyListener && textView.getEllipsize() == null) {
                        return;
                    }
                    textView.setKeyListener(keyListener);
                    textView.setEllipsize(null);
                    textView.getExtendedPaddingTop();
                    textView.getViewTreeObserver().addOnPreDrawListener(new LKn(textView, 2));
                    return;
                }
                return;
            case 2:
                if (z) {
                    7zT.A13((Context) this.A01, view);
                    return;
                }
                return;
            default:
                8KU r02 = (8KU) this.A01;
                C00m c00m = z ? r02.A0M : r02.A0N;
                if (c00m != null) {
                    c00m.invoke();
                    return;
                }
                return;
        }
    }
}
