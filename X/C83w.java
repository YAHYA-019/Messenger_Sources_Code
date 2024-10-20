package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.83w, reason: invalid class name */
/* loaded from: 83w.class */
public final class C83w implements C5mp {
    public final Context A00;

    public C83w(Context context) {
        this.A00 = context;
    }

    @Override // X.C5mp
    public C5fv CZN(final C5j5 c5j5, Capabilities capabilities, final C5fv c5fv) {
        11T.A0F(c5fv, 0);
        final int i = 1;
        11T.A0F(c5j5, 1);
        if (c5fv instanceof 5gC) {
            c5fv = (C5fv) C5uk.A00(C5ua.A00(new C5uZ(i, c5fv, c5j5, this) { // from class: X.84t
                public final int A00;
                public final Object A01;
                public final Object A02;
                public final Object A03;

                {
                    this.A00 = i;
                    this.A03 = this;
                    this.A02 = c5j5;
                    this.A01 = c5fv;
                }

                @Override // X.C5uZ
                public /* bridge */ /* synthetic */ Object get() {
                    5gC r305;
                    SpannableStringBuilder spannableStringBuilder;
                    int i2;
                    Uri uri;
                    switch (this.A00) {
                        case 0:
                            ((C1is) ((L7l) this.A03).A03.A00.get()).A08((Activity) this.A01, (FbUserSession) this.A02);
                            r305 = 04S.A00;
                            break;
                        case 1:
                            C5j5 c5j52 = (C5j5) this.A02;
                            r305 = (5gC) this.A01;
                            String ALh = c5j52.ALh(r305.A03, 826798206027203L);
                            11T.A0A(ALh);
                            C83w c83w = (C83w) this.A03;
                            C5uf c5uf = C5uf.A00;
                            C5ug c5ug = (C5ug) r305.AxW(c5uf);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(c5ug != null ? c5ug.A00 : Spannable.Factory.getInstance().newSpannable(0CU.A06(ALh).toString()));
                            Context context = c83w.A00;
                            if (((2yD) 1Bi.A03(16385)).AZk(36327035253118893L)) {
                                if (spannableStringBuilder2 instanceof Editable) {
                                    spannableStringBuilder = spannableStringBuilder2;
                                } else {
                                    spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder2 instanceof Spannable ? spannableStringBuilder2 : new SpannableString(spannableStringBuilder2));
                                }
                                spannableStringBuilder.insert(0, (CharSequence) "_");
                                Drawable drawable = context.getDrawable(2132345316);
                                if (drawable == null) {
                                    throw 1BK.A0h();
                                }
                                spannableStringBuilder.setSpan(new ImageSpan(drawable), 0, 1, 33);
                                C5qu c5qu = new C5qu(r305);
                                c5qu.A02(c5uf, new C5ug(spannableStringBuilder2));
                                return new 5gC(c5qu);
                            }
                            break;
                        default:
                            VideoPlayerParams videoPlayerParams = (VideoPlayerParams) this.A03;
                            C5j5 c5j53 = (C5j5) this.A02;
                            C23P c23p = (C23P) this.A01;
                            VideoDataSource videoDataSource = videoPlayerParams.A0V;
                            C02353ux c02353ux = null;
                            try {
                                Uri A03 = C0A2.A03(c5j53.ALh((videoDataSource == null || (uri = videoDataSource.A03) == null) ? "" : String.valueOf(uri), 195771409088126L));
                                if (A03 != null) {
                                    2IA A01 = 2IA.A01(A03);
                                    A01.A0H = true;
                                    A01.A0I = true;
                                    2rA r0 = new 2rA();
                                    r0.A0A = false;
                                    r0.A07 = false;
                                    A01.A04 = new C2r9(r0);
                                    int i3 = c23p.A01;
                                    if (i3 > 0 && (i2 = c23p.A00) > 0) {
                                        c02353ux = new C02353ux(i3, i2, 2048.0f, 0.6666667f);
                                    }
                                    A01.A06 = c02353ux;
                                    return A01.A04();
                                }
                            } catch (SecurityException unused) {
                            }
                            throw 1BK.A0h();
                    }
                    return r305;
                }
            }, ZonePolicy.A0F), 0S2.A0F);
        }
        return c5fv;
    }
}
