package X;

import android.net.Uri;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: X.5n0, reason: invalid class name */
/* loaded from: 5n0.class */
public final class C5n0 implements C5n1 {
    public final C5mz A00;

    public C5n0(C5mz c5mz) {
        this.A00 = c5mz;
    }

    @Override // X.C5n1
    public void A8v(Spannable spannable, int i, int i2, final String str) {
        11T.A0F(str, 0);
        final C5mz c5mz = this.A00;
        spannable.setSpan(new URLSpan(c5mz, str) { // from class: X.5uq
            public final C5mz A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str);
                11T.A0F(c5mz, 2);
                this.A00 = c5mz;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
            
                if (X.11T.A0O(r301.A00, r0.A00) == false) goto L8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean equals(java.lang.Object r302) {
                /*
                    r301 = this;
                    r0 = r302
                    boolean r0 = r0 instanceof X.C5uq
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L3e
                    r0 = r301
                    java.lang.String r0 = r0.getURL()
                    r304 = r0
                    r0 = r302
                    X.5uq r0 = (X.C5uq) r0
                    r302 = r0
                    r0 = r302
                    java.lang.String r0 = r0.getURL()
                    r305 = r0
                    r0 = r304
                    r1 = r305
                    boolean r0 = X.11T.A0O(r0, r1)
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L3e
                    r0 = r301
                    X.5mz r0 = r0.A00
                    r304 = r0
                    r0 = r302
                    X.5mz r0 = r0.A00
                    r305 = r0
                    r0 = r304
                    r1 = r305
                    boolean r0 = X.11T.A0O(r0, r1)
                    r306 = r0
                    r0 = 1
                    r303 = r0
                    r0 = r306
                    if (r0 != 0) goto L43
                L3e:
                    r0 = 0
                    r303 = r0
                    r0 = 0
                    r305 = r0
                L43:
                    r0 = r303
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5uq.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                return (getURL().hashCode() * 31) + this.A00.hashCode();
            }

            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public void onClick(View view) {
                11T.A0F(view, 0);
                C5mz c5mz2 = this.A00;
                String url = getURL();
                if (url != null) {
                    C76 c76 = (C76) 1Bn.A0A(68729);
                    try {
                        Uri A03 = C0A2.A03(url);
                        if (A03 != null) {
                            c76.A01(4YU.A08(view), A03, c5mz2.A00);
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    0fH.A0o("LinkClickHandler", "Unable to parse URI");
                    KXg.A00(view, 4YU.A0t(view.getResources(), 2131958643), -1).A02();
                }
            }
        }, i, i2, 33);
    }

    @Override // X.C5n1
    public ClickableSpan[] Atx(Spannable spannable, int i, int i2) {
        Object[] spans = spannable.getSpans(i, i2, C5uq.class);
        11T.A0A(spans);
        return (ClickableSpan[]) spans;
    }
}
