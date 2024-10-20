package X;

import android.content.Context;
import android.view.ViewOutlineProvider;
import com.facebook.litho.ComponentHost;

/* renamed from: X.3bo, reason: invalid class name */
/* loaded from: 3bo.class */
public final class C3bo implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        return null;
    }

    public /* synthetic */ String AhU() {
        return 2JF.A00(getClass());
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C1qv c1qv = (C1qv) obj;
        11T.A0F(c1qv, 1);
        boolean z = c1qv instanceof ComponentHost;
        if (z) {
            ((ComponentHost) c1qv).A0J = true;
        }
        c1qv.setVisibility(0);
        C28t c28t = C28s.A0f;
        c1qv.setOnClickListener(null);
        c1qv.setClickable(false);
        c28t.A01(c1qv);
        c28t.A00(c1qv);
        c28t.A02(c1qv);
        if (z) {
            ((ComponentHost) c1qv).A0A = null;
        }
        float f = 0.0f / 0.0f;
        c1qv.setId(-1);
        c1qv.setTag(null);
        if (z) {
            ((ComponentHost) c1qv).A02 = null;
        }
        if (c1qv.getStateListAnimator() != null) {
            c1qv.getStateListAnimator().jumpToCurrentState();
            c1qv.setStateListAnimator(null);
        }
        c1qv.setElevation(0.0f);
        c1qv.setOutlineAmbientShadowColor(-16777216);
        c1qv.setOutlineSpotShadowColor(-16777216);
        c1qv.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        c1qv.setClipToOutline(false);
        c1qv.setClipChildren(true);
        c1qv.setContentDescription(null);
        c1qv.setTooltipText(null);
        c1qv.setScaleX(1.0f);
        c1qv.setScaleY(1.0f);
        c1qv.setAlpha(1.0f);
        c1qv.setRotation(0.0f);
        c1qv.setRotationX(0.0f);
        c1qv.setRotationY(0.0f);
        c1qv.setClickable(true);
        c1qv.setLongClickable(true);
        c1qv.setFocusable(false);
        c1qv.setEnabled(true);
        c1qv.setSelected(false);
        c1qv.setForeground(null);
        c1qv.setKeyboardNavigationCluster(false);
        c1qv.setImportantForAccessibility(0);
        if (z || c1qv.getTag(2131363225) != null) {
            c1qv.setTag(2131363225, null);
            if (!z) {
                C0Ad.A0B(c1qv, null);
            }
        }
        c1qv.setBackground(null);
        c1qv.setLayoutDirection(2);
        c1qv.setLayerType(0, null);
        C0Ad.A0G(c1qv, C0ty.A00);
        if (z) {
            ComponentHost componentHost = (ComponentHost) c1qv;
            componentHost.A0J = false;
            componentHost.A0M.A06();
            componentHost.A0N.A06();
            componentHost.A0L.A06();
            componentHost.A05 = null;
            componentHost.A04 = null;
            componentHost.A03 = null;
            componentHost.A0C = null;
            componentHost.A02 = null;
            componentHost.A0K = new int[0];
            componentHost.A0H = false;
            componentHost.A0G = false;
            componentHost.A0E = false;
            componentHost.A06 = null;
            componentHost.A0I = false;
            componentHost.A08 = null;
            componentHost.A0A = null;
            componentHost.A00 = Float.MIN_VALUE;
            componentHost.A01 = Float.MIN_VALUE;
            componentHost.A0F = false;
            componentHost.A0J = false;
            componentHost.A09 = null;
            try {
                componentHost.A0J = true;
                componentHost.setOnTouchListener(null);
                componentHost.A0J = false;
                componentHost.A0B = null;
            } catch (Throwable th) {
                componentHost.A0J = false;
                throw th;
            }
        }
    }
}
