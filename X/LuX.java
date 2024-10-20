package X;

import com.facebook.privacy.zone.policy.ZonePolicy;

/* loaded from: LuX.class */
public final /* synthetic */ class LuX implements 0Jf, MFI {
    public final /* synthetic */ L2h A00;

    public LuX(L2h l2h) {
        this.A00 = l2h;
    }

    public final boolean BuA(Fik fik) {
        Object obj;
        String str;
        11T.A0F(fik, 0);
        L2h l2h = this.A00;
        l2h.A05 = true;
        l2h.A04 = false;
        if (l2h.A02) {
            obj = "ACTION_TABS_ICON_SHOPPING_TOOLTIP_DISMISSED";
            str = "CALL_EXTENSION_TABS_ICON_SHOPPING_TOOLTIP_DISMISSED";
        } else {
            obj = "ACTION_TABS_TOOLTIP_DISMISSED";
            str = "CALL_EXTENSION_TAB_TOOLTIP_DISMISSED";
        }
        l2h.A08.A0A(1BK.A05(), ZonePolicy.A03, str, 4YW.A0A("iaw_session_id", l2h.A0D, 1BK.A1G("action", obj)));
        return true;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof MFI) && (obj instanceof 0Jf)) {
            z = 11T.A0O(getFunctionDelegate(), ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return new 01I(1, this.A00, L2h.class, "onDismiss", "onDismiss(Lcom/facebook/fds/tooltip/FDSTooltip;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
