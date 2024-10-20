package X;

import android.content.Intent;

/* renamed from: X.Jms, reason: case insensitive filesystem */
/* loaded from: Jms.class */
public final class C3215Jms extends L3E {
    public C3215Jms() {
        super("ACTION_OPEN_WITH");
    }

    public static Intent A00(JgX jgX, JgX jgX2) {
        Intent A0T = jgX2.A0T();
        if (A0T == null) {
            return null;
        }
        String stringExtra = jgX.A0e() ? A0T.getStringExtra("BrowserLiteIntent.OPEN_WITH_URL") : null;
        AbstractC3252Jnp A0U = jgX.A0U();
        if (A0U == null) {
            return null;
        }
        L4Z l4z = L4Z.A06;
        if (l4z != null && l4z.A01()) {
            stringExtra = l4z.A01.A03;
        } else if (stringExtra == null) {
            stringExtra = A0U.A08();
        }
        if (A0U.A0e) {
            stringExtra = A0U.A0O;
        }
        if (stringExtra == null) {
            return null;
        }
        String stringExtra2 = A0T.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID");
        boolean booleanExtra = A0T.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", false);
        if (stringExtra2 != null) {
            String stringExtra3 = A0T.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_APP_SURFACE");
            if (("BrowserLiteIntent.BrowserAppSurfaceExtras.FB4A".equals(stringExtra3) || ("BrowserLiteIntent.BrowserAppSurfaceExtras.IG4A".equals(stringExtra3) && !jgX.A0e())) && booleanExtra) {
                stringExtra = AbM.A0A(C0A2.A03(stringExtra).buildUpon(), "fbclid", stringExtra2).toString();
            }
        }
        L4Z l4z2 = L4Z.A06;
        if (l4z2 != null) {
            8Lr r0 = l4z2.A00;
            if (r0.A01 && stringExtra != null) {
                stringExtra = Qyk.A00((RKX) r0.A00, stringExtra);
            }
        }
        Intent A05 = AbF.A05();
        A05.setAction("android.intent.action.VIEW");
        A05.setData(JQy.A0O(stringExtra));
        A05.putExtra("click_id", stringExtra2);
        A05.putExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS", A0T.getStringExtra("BrowserLiteIntent.EXTRA_IAB_CLICKID_STATUS"));
        A05.putExtra("BrowserLiteIntent.EXTRA_SHOULD_ATTACH_CLICKID", booleanExtra);
        return A05;
    }
}
