package X;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.PopupWindow;
import com.facebook.litho.LithoView;

/* loaded from: AKx.class */
public final class AKx extends C00q implements C00m {
    public final /* synthetic */ SpannableString $content;
    public final /* synthetic */ C00m $dismissToast;
    public final /* synthetic */ View $parentView;
    public final /* synthetic */ C2lh $popupWindow;
    public final /* synthetic */ boolean $showPopup;
    public final /* synthetic */ C2k5 $this_usePopupWindow;
    public final /* synthetic */ int $gravity = 48;
    public final /* synthetic */ int $positionX = 0;
    public final /* synthetic */ int $positionY = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKx(SpannableString spannableString, View view, C2k5 c2k5, C2lh c2lh, C00m c00m, boolean z) {
        super(0);
        this.$showPopup = z;
        this.$this_usePopupWindow = c2k5;
        this.$content = spannableString;
        this.$popupWindow = c2lh;
        this.$parentView = view;
        this.$dismissToast = c00m;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.$showPopup) {
            LithoView lithoView = new LithoView(this.$this_usePopupWindow.A05);
            final SpannableString spannableString = this.$content;
            final G9D g9d = new G9D(this.$dismissToast, 7);
            lithoView.A0x(new 1LH(spannableString, g9d) { // from class: X.8We
                public final CharSequence A00;
                public final C00m A01;

                {
                    11T.A0F(spannableString, 1);
                    this.A00 = spannableString;
                    this.A01 = g9d;
                }

                public 1LI A0s(C2k5 c2k5) {
                    11T.A0F(c2k5, 0);
                    C6tP A00 = F2c.A00(c2k5);
                    boolean BRa = A00.BRa();
                    Aaq A002 = C9kH.A00(A00);
                    float A003 = 7zQ.A00(c2k5, new GAX(c2k5, 18), new Object[0]);
                    Object A004 = 2rO.A00(c2k5, new AKk(this, A002, A003, 1, BRa), new Object[0]);
                    2rO.A00(c2k5, new AKk(this, A002, 7zQ.A00(c2k5, new GAX(c2k5, 17), new Object[0]), 0, BRa), new Object[0]);
                    C1rp c1rp = C1rp.CENTER;
                    C2sn A0K = 7zR.A0K(c2k5.A05);
                    Integer num = 0S2.A00;
                    2lO A0L = 4YV.A0L((2lO) null, num, A004, 1);
                    long doubleToRawLongBits = Double.doubleToRawLongBits(92.0d);
                    Integer num2 = 0S2.A01;
                    2lO A0N = 7zT.A0N(C82m.A04(4YV.A0K(A0L, num2, doubleToRawLongBits), num, 100.0f, 0), 8.0d);
                    long A09 = 7zP.A09();
                    2lO A0K2 = 4YV.A0K(A0N, 0S2.A0E, A09);
                    final long A07 = 7zQ.A07();
                    final 8CI r0 = new 8CI(A003, 1);
                    final int i = -16777216;
                    2lO A0g = 7zL.A0g(A0K2, new 2lU(r0, i, i, A07) { // from class: X.9so
                        public final int A00;
                        public final int A01;
                        public final long A02;
                        public final ViewOutlineProvider A03;
                        public final C9cX A04;

                        /* JADX WARN: Type inference failed for: r0v5, types: [X.9cX] */
                        {
                            this.A02 = A07;
                            this.A03 = r0;
                            this.A00 = i;
                            this.A01 = i;
                            this.A04 = new Object(r0, i, i, A07) { // from class: X.9cX
                                public final int A00;
                                public final int A01;
                                public final long A02;
                                public final ViewOutlineProvider A03;

                                {
                                    this.A02 = A07;
                                    this.A03 = r0;
                                    this.A00 = i;
                                    this.A01 = i;
                                }

                                public boolean equals(Object obj) {
                                    if (this != obj) {
                                        if (!(obj instanceof C9cX)) {
                                            return false;
                                        }
                                        C9cX c9cX = (C9cX) obj;
                                        if (this.A02 != c9cX.A02 || !11T.A0O(this.A03, c9cX.A03) || this.A00 != c9cX.A00 || this.A01 != c9cX.A01) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }

                                public int hashCode() {
                                    return ((AnonymousClass002.A05(this.A03, 7zQ.A02(this.A02)) + this.A00) * 31) + this.A01;
                                }

                                public String toString() {
                                    StringBuilder A0k = AnonymousClass001.A0k();
                                    A0k.append("ShadowStyleItemParams(elevation=");
                                    A0k.append((Object) C2lu.A03(this.A02));
                                    A0k.append(", outlineProvider=");
                                    A0k.append(this.A03);
                                    A0k.append(", ambientShadowColor=");
                                    A0k.append(this.A00);
                                    A0k.append(", spotShadowColor=");
                                    A0k.append(this.A01);
                                    return 4YV.A0x(A0k);
                                }
                            };
                        }

                        public void A8l(C1ti c1ti, 1Iw r303) {
                            11T.A0H(r303, c1ti);
                            c1ti.A0C(7zP.A00(r303, this.A02));
                            c1ti.A0K(this.A03);
                            int i2 = this.A00;
                            29K A02 = C1ti.A02(c1ti);
                            A02.A0F |= 134217728;
                            A02.A06 = i2;
                            int i3 = this.A01;
                            29K A022 = C1ti.A02(c1ti);
                            A022.A0F |= 268435456;
                            A022.A07 = i3;
                        }

                        public boolean equals(Object obj) {
                            if (this != obj) {
                                if (!(obj instanceof C9so)) {
                                    return false;
                                }
                                C9so c9so = (C9so) obj;
                                if (this.A02 != c9so.A02 || !11T.A0O(this.A03, c9so.A03) || this.A00 != c9so.A00 || this.A01 != c9so.A01) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        public int hashCode() {
                            return ((AnonymousClass002.A05(this.A03, 7zQ.A02(this.A02)) + this.A00) * 31) + this.A01;
                        }

                        public String toString() {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("ShadowStyleItem(elevation=");
                            A0k.append((Object) C2lu.A03(this.A02));
                            A0k.append(", outlineProvider=");
                            A0k.append(this.A03);
                            A0k.append(", ambientShadowColor=");
                            A0k.append(this.A00);
                            A0k.append(", spotShadowColor=");
                            A0k.append(this.A01);
                            return 4YV.A0x(A0k);
                        }
                    });
                    C2sn A0K3 = 7zS.A0K(A0K);
                    C1ro c1ro = C1ro.CENTER;
                    C1rp c1rp2 = C1rp.SPACE_BETWEEN;
                    2lO A0Q = 7zT.A0Q(4YV.A0K(C82m.A02(null, 7zL.A0k(num2, 1.0f), num, 100.0f, 0), 0S2.A05, A09), 7zP.A0G(), A09);
                    C2sn A0J = 7zS.A0J(A0K3);
                    2lO A0Z = 7zS.A0Z(C82m.A04(null, num, 100.0f, 0), num2, 60.0d);
                    long A0A = 7zQ.A0A();
                    Integer num3 = 0S2.A07;
                    2lO A0W = 7zT.A0W(A0Z, 7zL.A0i(num3, A0A), A07);
                    C2sn A0K4 = 7zS.A0K(A0J);
                    CharSequence charSequence = this.A00;
                    int Chy = A002.Chy(C97i.A0Z, BRa);
                    Typeface typeface = Typeface.DEFAULT;
                    long A08 = 7zP.A08();
                    1Iw r02 = A0K4.A00;
                    3yF A0v = 7zM.A0v(r02, charSequence, 0);
                    7zS.A1Q(A0K4, A0v, Chy, Float.floatToRawIntBits(14.0f) | 9221683186994511872L);
                    A0v.A33(1);
                    A0v.A34(typeface);
                    7zU.A1H(A0K4, A0v, 0, A08);
                    7zU.A1L(A0v, false);
                    7zV.A0z(A0K4, A0v, Float.floatToRawIntBits(20.0f) | 9221683186994511872L);
                    7zS.A1V(A0v, false);
                    7zR.A13((2K8) null, A0K4, A0v);
                    2lO A0K5 = 4YV.A0K((2lO) null, num3, A07);
                    C2sn A0U = 7zQ.A0U(r02);
                    C00m c00m = this.A01;
                    int Chy2 = A002.Chy(C97i.A0e, BRa);
                    long doubleToRawLongBits2 = Double.doubleToRawLongBits(50.0d);
                    GradientDrawable A0G = 7zO.A0G(0);
                    A0G.setColor(Chy2);
                    A0G.setCornerRadius(7zO.A01(A0U, doubleToRawLongBits2));
                    A0U.A00(new 8eM(7zT.A0k((2lO) null, num2, num, 7zQ.A08()), 7zT.A0k(4YV.A0L((2lO) null, num, A0G, 1), num2, num, 7zP.A0H()), C97h.A0G, (C97i) null, (C97i) null, (String) null, (String) null, new GAX(c00m, 16), 760, 0L, false));
                    7zN.A1K(A0U, A0K4, A0K5);
                    A0J.A00(C2so.A0R(A0K4, A0J, A0W, c1ro));
                    7zQ.A1F(C2so.A0T(A0J, A0K3, A0Q, c1ro, c1ro, c1rp2), A0K3, A0K, A0g);
                    return new C1rh(null, null, c1rp, null, A0K.A01, false);
                }
            });
            ((PopupWindow) this.$popupWindow.A02).setContentView(lithoView);
            PopupWindow popupWindow = (PopupWindow) this.$popupWindow.A02;
            View view = this.$parentView;
            popupWindow.setWidth(view != null ? view.getWidth() : 0);
            View view2 = this.$parentView;
            if (view2 != null) {
                ((PopupWindow) this.$popupWindow.A02).showAtLocation(view2, this.$gravity, this.$positionX, this.$positionY);
            }
        }
        return 7zL.A0T(new G9D(this.$popupWindow, 8));
    }
}
