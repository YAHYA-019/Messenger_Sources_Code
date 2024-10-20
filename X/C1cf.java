package X;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1cf, reason: invalid class name */
/* loaded from: 1cf.class */
public final class C1cf implements C1cg {
    public static final C1cm A05 = new C1cm("QPL", "QPL Events", -1);
    public final C00i A00 = new 1BQ(100042);
    public final C00i A01 = new 1BQ(16520);
    public volatile Integer A02 = 0S2.A00;
    public volatile Pattern A03;
    public volatile boolean A04;

    private void A00(C03b c03b, String str, String str2, long j) {
        Object[] objArr;
        String A00;
        if (3GB.A00(this.A03, c03b.getMarkerId())) {
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            if (this.A02 != 0S2.A00) {
                if (this.A02 != 0S2.A01) {
                    return;
                }
                Locale locale = Locale.US;
                if (!str.toLowerCase(locale).contains("cancel")) {
                    String lowerCase = str3.toLowerCase(locale);
                    if (!lowerCase.contains("fail") && !lowerCase.contains("cancel")) {
                        return;
                    }
                }
            }
            String A002 = 0Kv.A00(c03b.getMarkerId());
            C35a c35a = (C35a) this.A00.get();
            C1cm c1cm = A05;
            Locale locale2 = Locale.US;
            if (str2 != null) {
                objArr = new Object[]{str, A002, str2};
                A00 = "%s %s %s";
            } else {
                objArr = new Object[]{str, A002};
                A00 = AbE.A00(14);
            }
            c35a.A06(c1cm, String.format(locale2, A00, objArr), j);
        }
    }

    @Override // X.C1cg
    public void C5a(C03b c03b, String str, String str2) {
    }

    @Override // X.C1cg
    public void C5c(C03b c03b) {
        long AyF = c03b.AyF() + c03b.AiX();
        short Asy = c03b.Asy();
        A00(c03b, "Cancel", 0Pz.A0j(Asy != 0 ? 0Fx.A00(Asy) : null, " ", String.format(Locale.US, "%dms", AnonymousClass001.A1a(c03b.AiX()))), AyF);
    }

    @Override // X.C1cg
    public void C5f(AnonymousClass045 anonymousClass045, C03b c03b, String str, int i, long j, boolean z) {
        A00(c03b, "Point", 0Pz.A0W(str, anonymousClass045 == null ? "" : AnonymousClass001.A0Z(anonymousClass045, " ", AnonymousClass001.A0k())), j);
    }

    @Override // X.C1cg
    public void C5g(C03b c03b) {
        A00(c03b, "Restart", null, -1);
    }

    @Override // X.C1cg
    public void C5h(C03b c03b) {
        if (this.A04 && this.A02 == 0S2.A00) {
            ((C35a) this.A00.get()).A07(true);
        }
        A00(c03b, "Start", null, c03b.AyF());
    }

    @Override // X.C1cg
    public void C5i(C03b c03b) {
        long AyF = c03b.AyF() + c03b.AiX();
        short Asy = c03b.Asy();
        A00(c03b, "Stop ", 0Pz.A0j(Asy != 0 ? 0Fx.A00(Asy) : null, " ", String.format(Locale.US, "%dms", AnonymousClass001.A1a(c03b.AiX()))), AyF);
    }

    @Override // X.C1cg
    public void CoT(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            1BK.A0U(this.A01).updateListenerMarkers();
            ((C35a) this.A00.get()).A07(z);
        }
    }

    @Override // X.C1cg
    public void CqW(Integer num) {
        if (this.A02 != num) {
            this.A02 = num;
            if (this.A04) {
                Integer num2 = this.A02;
                Integer num3 = 0S2.A00;
                C00i c00i = this.A00;
                C35a c35a = (C35a) c00i.get();
                if (num2 != num3) {
                    int argb = Color.argb(128, 255, 0, 0);
                    WeakReference weakReference = c35a.A01;
                    if (weakReference != null && weakReference.get() != null) {
                        ((View) weakReference.get()).setBackground(new ColorDrawable(argb));
                    }
                    ((C35a) c00i.get()).A07(false);
                    return;
                }
                int argb2 = Color.argb(128, 0, 0, 0);
                WeakReference weakReference2 = c35a.A01;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) weakReference2.get()).setBackground(new ColorDrawable(argb2));
                }
                ((C35a) c00i.get()).A07(true);
            }
        }
    }

    @Override // X.C1cg
    public void CsN(Pattern pattern) {
        this.A03 = pattern;
    }
}
