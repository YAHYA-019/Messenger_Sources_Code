package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.messaging.composer.ComposerBarEditorActionBarContainerView;

/* renamed from: X.6gx, reason: invalid class name */
/* loaded from: 6gx.class */
public final class C6gx extends 0Cs {
    public final /* synthetic */ ComposerBarEditorActionBarContainerView A00;
    public final /* synthetic */ String A01;

    public C6gx(ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView, String str) {
        this.A00 = composerBarEditorActionBarContainerView;
        this.A01 = str;
    }

    public void A0a(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0a(view, accessibilityNodeInfoCompat);
        CharSequence charSequence = this.A01;
        if (charSequence == null) {
            charSequence = this.A00.A0D.getHint();
        }
        accessibilityNodeInfoCompat.A02.setHintText(charSequence);
    }
}
