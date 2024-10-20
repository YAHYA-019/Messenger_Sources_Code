package androidx.core.view.accessibility;

import X.0Oe;
import X.0On;
import X.0PO;
import X.0Pz;
import X.0T7;
import X.AnonymousClass001;
import X.C0T6;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: AccessibilityNodeInfoCompat.class */
public final class AccessibilityNodeInfoCompat {
    public int A00 = -1;
    public int A01 = -1;
    public final AccessibilityNodeInfo A02;

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A02 = accessibilityNodeInfo;
    }

    public static String A00(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RequestDefragmentingOutputStream.BODY_BUFFER_SIZE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET /* 16384 */:
                return "ACTION_COPY";
            case Constants.LOAD_RESULT_PGO /* 32768 */:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP /* 131072 */:
                return "ACTION_SET_SELECTION";
            case Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED /* 262144 */:
                return "ACTION_EXPAND";
            case Constants.LOAD_RESULT_WITH_VDEX_ODEX /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.KEYCODE_3D_MODE:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private ArrayList A01(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = AnonymousClass001.A0s();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r311v0 */
    /* JADX WARN: Type inference failed for: r311v1 */
    /* JADX WARN: Type inference failed for: r311v2, types: [android.text.SpannableString] */
    public CharSequence A02() {
        CharSequence text;
        if (!A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            ArrayList A01 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList A012 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList A013 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList A014 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
            text = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < A01.size(); i++) {
                final int A03 = AnonymousClass001.A03(A014.get(i));
                final int i2 = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
                text.setSpan(new ClickableSpan(this, A03, i2) { // from class: X.0T3
                    public final int A00;
                    public final int A01;
                    public final AccessibilityNodeInfoCompat A02;

                    {
                        this.A01 = A03;
                        this.A02 = this;
                        this.A00 = i2;
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = this.A02;
                        accessibilityNodeInfoCompat.A02.performAction(this.A00, bundle);
                    }
                }, AnonymousClass001.A03(A01.get(i)), AnonymousClass001.A03(A012.get(i)), AnonymousClass001.A03(A013.get(i)));
            }
        } else {
            text = this.A02.getText();
        }
        return text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0 */
    /* JADX WARN: Type inference failed for: r304v1 */
    /* JADX WARN: Type inference failed for: r304v2, types: [java.util.AbstractCollection] */
    public List A03() {
        List emptyList;
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.A02.getActionList();
        if (actionList != null) {
            emptyList = AnonymousClass001.A0s();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new 0Oe((0PO) null, (CharSequence) null, (Class) null, actionList.get(i), 0));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }

    public void A04(int i) {
        this.A02.addAction(i);
    }

    public void A05(0Oe r302) {
        this.A02.addAction((AccessibilityNodeInfo.AccessibilityAction) r302.A03);
    }

    public void A06(0Oe r302) {
        this.A02.removeAction((AccessibilityNodeInfo.AccessibilityAction) r302.A03);
    }

    public void A07(CharSequence charSequence) {
        this.A02.setClassName(charSequence);
    }

    public void A08(CharSequence charSequence) {
        this.A02.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void A09(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 30) {
            C0T6.A01(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void A0A(boolean z) {
        this.A02.setCheckable(z);
    }

    public void A0B(boolean z) {
        this.A02.setChecked(z);
    }

    public void A0C(boolean z) {
        this.A02.setClickable(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
                return false;
            }
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.A02;
            if (accessibilityNodeInfo == null) {
                if (accessibilityNodeInfo2 != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
                return false;
            }
            if (this.A01 != accessibilityNodeInfoCompat.A01 || this.A00 != accessibilityNodeInfoCompat.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A02);
    }

    public String toString() {
        boolean z;
        boolean z2;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        accessibilityNodeInfo.getBoundsInParent(rect);
        A0k.append(AnonymousClass001.A0Z(rect, "; boundsInParent: ", AnonymousClass001.A0k()));
        accessibilityNodeInfo.getBoundsInScreen(rect);
        A0k.append(AnonymousClass001.A0Z(rect, "; boundsInScreen: ", AnonymousClass001.A0k()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            0On.A02(rect, accessibilityNodeInfo);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        A0k.append(AnonymousClass001.A0Z(rect, "; boundsInWindow: ", AnonymousClass001.A0k()));
        A0k.append("; packageName: ");
        A0k.append(accessibilityNodeInfo.getPackageName());
        A0k.append("; className: ");
        A0k.append(accessibilityNodeInfo.getClassName());
        A0k.append("; text: ");
        A0k.append(A02());
        A0k.append("; error: ");
        A0k.append(accessibilityNodeInfo.getError());
        A0k.append("; maxTextLength: ");
        A0k.append(accessibilityNodeInfo.getMaxTextLength());
        A0k.append("; stateDescription: ");
        A0k.append(i >= 30 ? C0T6.A00(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        A0k.append("; contentDescription: ");
        A0k.append(accessibilityNodeInfo.getContentDescription());
        A0k.append("; tooltipText: ");
        A0k.append(accessibilityNodeInfo.getTooltipText());
        A0k.append("; viewIdResName: ");
        A0k.append(accessibilityNodeInfo.getViewIdResourceName());
        A0k.append("; uniqueId: ");
        A0k.append(i >= 33 ? 0T7.A00(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        A0k.append("; checkable: ");
        A0k.append(accessibilityNodeInfo.isCheckable());
        A0k.append("; checked: ");
        A0k.append(accessibilityNodeInfo.isChecked());
        A0k.append("; focusable: ");
        A0k.append(accessibilityNodeInfo.isFocusable());
        A0k.append("; focused: ");
        A0k.append(accessibilityNodeInfo.isFocused());
        A0k.append("; selected: ");
        A0k.append(accessibilityNodeInfo.isSelected());
        A0k.append("; clickable: ");
        A0k.append(accessibilityNodeInfo.isClickable());
        A0k.append("; longClickable: ");
        A0k.append(accessibilityNodeInfo.isLongClickable());
        A0k.append("; contextClickable: ");
        A0k.append(accessibilityNodeInfo.isContextClickable());
        A0k.append("; enabled: ");
        A0k.append(accessibilityNodeInfo.isEnabled());
        A0k.append("; password: ");
        A0k.append(accessibilityNodeInfo.isPassword());
        A0k.append(0Pz.A1C("; scrollable: ", accessibilityNodeInfo.isScrollable()));
        A0k.append("; containerTitle: ");
        A0k.append(i >= 34 ? 0On.A01(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        A0k.append("; granularScrollingSupported: ");
        Bundle extras = accessibilityNodeInfo.getExtras();
        boolean z3 = false;
        if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 67108864) == 67108864) {
            z3 = true;
        }
        A0k.append(z3);
        A0k.append("; importantForAccessibility: ");
        A0k.append(accessibilityNodeInfo.isImportantForAccessibility());
        A0k.append("; visible: ");
        A0k.append(accessibilityNodeInfo.isVisibleToUser());
        A0k.append("; isTextSelectable: ");
        if (i >= 33) {
            z = 0T7.A01(accessibilityNodeInfo);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            z = false;
            if (extras2 != null && (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) == 8388608) {
                z = true;
            }
        }
        A0k.append(z);
        A0k.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            z2 = 0On.A03(accessibilityNodeInfo);
        } else {
            Bundle extras3 = accessibilityNodeInfo.getExtras();
            z2 = false;
            if (extras3 != null && (extras3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 64) == 64) {
                z2 = true;
            }
        }
        A0k.append(z2);
        A0k.append("; [");
        List A03 = A03();
        for (int i2 = 0; i2 < A03.size(); i2++) {
            0Oe r0 = (0Oe) A03.get(i2);
            String A00 = A00(((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getId());
            if (A00.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getLabel() != null) {
                A00 = ((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getLabel().toString();
            }
            A0k.append(A00);
            if (i2 != A03.size() - 1) {
                A0k.append(", ");
            }
        }
        return AnonymousClass001.A0d("]", A0k);
    }
}
