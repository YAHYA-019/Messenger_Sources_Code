package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.timepicker.ClockFaceView;

/* renamed from: X.Jek, reason: case insensitive filesystem */
/* loaded from: Jek.class */
public final class C2957Jek extends 0Cs {
    public final int A00;
    public final Object A01;

    public C2957Jek(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A0U(View view, AccessibilityEvent accessibilityEvent) {
        if (4 - this.A00 != 0) {
            super.A0U(view, accessibilityEvent);
        } else {
            super.A0U(view, accessibilityEvent);
            accessibilityEvent.setChecked(((CheckableImageButton) this.A01).isChecked());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.fragment.app.Fragment, X.K87] */
    public void A0a(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        boolean isChecked;
        switch (this.A00) {
            case 0:
                super.A0a(view, accessibilityNodeInfoCompat);
                ViewGroup viewGroup = (ViewGroup) this.A01;
                if (view instanceof MaterialButton) {
                    i = 0;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        if (viewGroup.getChildAt(i2) == view) {
                            isChecked = ((MaterialButton) view).isChecked();
                            break;
                        } else {
                            if ((viewGroup.getChildAt(i2) instanceof MaterialButton) && viewGroup.getChildAt(i2).getVisibility() != 8) {
                                i++;
                            }
                        }
                    }
                    break;
                }
                i = -1;
                isChecked = ((MaterialButton) view).isChecked();
                break;
            case 1:
            case 3:
            default:
                super.A0a(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A02.setCollectionInfo(null);
                return;
            case 2:
                super.A0a(view, accessibilityNodeInfoCompat);
                ?? r0 = (K87) this.A01;
                accessibilityNodeInfoCompat.A02.setHintText(r0.getString(r0.A00.getVisibility() == 0 ? 2131961880 : 2131961878));
                return;
            case 4:
                super.A0a(view, accessibilityNodeInfoCompat);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.A01;
                accessibilityNodeInfoCompat.A0A(checkableImageButton.A00);
                accessibilityNodeInfoCompat.A0B(checkableImageButton.isChecked());
                return;
            case 5:
                super.A0a(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A0A(((NavigationMenuItemView) this.A01).A04);
                return;
            case 6:
                super.A0a(view, accessibilityNodeInfoCompat);
                i = AnonymousClass001.A03(view.getTag(2131365475));
                if (i > 0) {
                    accessibilityNodeInfoCompat.A02.setTraversalAfter((View) ((ClockFaceView) this.A01).A07.get(i - 1));
                }
                isChecked = view.isSelected();
                break;
        }
        accessibilityNodeInfoCompat.A02.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, isChecked));
    }
}
