package X;

import android.text.Html;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8l7, reason: invalid class name */
/* loaded from: 8l7.class */
public final class C8l7 extends C1rj {
    public MigColorScheme A00;

    public C8l7() {
        super("WorkLobbyGuestDisclaimerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C8p0 c8p0 = (C8p0) 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A00;
        InterfaceC02083tw interfaceC02083tw = c8p0.A00;
        11T.A0F(migColorScheme, 1);
        2KD A00 = 2K3.A00(r302);
        A00.A2x(migColorScheme);
        A00.A2z(Html.fromHtml(4YU.A0E(r302).getString(2131968155)));
        A00.A2i();
        A00.A01.A0B = interfaceC02083tw;
        A00.A2d();
        A00.A30(true);
        2RH r0 = 2RH.A04;
        4YU.A1N(A00, r0);
        7zO.A1K(A00, 2RH.A03);
        4YU.A1M(A00, r0);
        A00.A2a();
        A00.A0S();
        A00.A2K("DISCLAIMER_TEXT");
        return A00.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(final 1Iw r302, 2Yv r303) {
        11T.A0F(r302, 0);
        final 1Br A00 = 1Bq.A00(49965);
        ((C8p0) r303).A00 = new InterfaceC02083tw() { // from class: X.9st
            @Override // X.InterfaceC02083tw
            public boolean BoV(ClickableSpan clickableSpan, View view) {
                String str;
                String url;
                1Iw r0 = r302;
                C68t A0b = 7zP.A0b(A00);
                String str2 = null;
                if ((clickableSpan instanceof URLSpan) && (url = ((URLSpan) clickableSpan).getURL()) != null) {
                    str2 = new C04t("[^a-zA-Z0-9_]").A00(url, "");
                }
                boolean z = false;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 841121026) {
                        if (hashCode != 1376469481) {
                            if (hashCode == 1699425543 && str2.equals("ACCEPTABLE_USE_POLICY")) {
                                str = "https://www.workplace.com/legal/FB_Work_AUP";
                            }
                        } else if (str2.equals("PRIVACY_POLICY")) {
                            str = "https://www.workplace.com/legal/Workplace_Standard_Privacy";
                        }
                    } else if (str2.equals("COOKIES_POLICY")) {
                        str = "https://www.workplace.com/legal/WP_Work_Cookies";
                    }
                    try {
                        A0b.A0E(r0.A0D, 7zM.A0D(str));
                        z = true;
                    } catch (Exception unused) {
                    }
                }
                return z;
            }

            @Override // X.InterfaceC02083tw
            public boolean C5A(View view, C6nn c6nn) {
                return false;
            }
        };
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
