package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.facebook.widget.FbImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9lp, reason: invalid class name */
/* loaded from: 9lp.class */
public final class C9lp {
    public boolean A00;
    public boolean A01;
    public final float A02;
    public final C9ce A03;
    public final C9tk A04;
    public final C9hW A05;
    public final FbRelativeLayout A06;
    public final 70P A07;
    public final List A08;
    public final 9Hq A09;
    public final S4M A0A;

    /* JADX WARN: Type inference failed for: r0v29, types: [X.9tk] */
    public C9lp(2Ff r302, C9ce c9ce, C6kf c6kf, AvatarAudioMessagePose avatarAudioMessagePose, FbRelativeLayout fbRelativeLayout, 70P r307, float f) {
        7zT.A11(3, r307, c9ce, c6kf, r302);
        this.A06 = fbRelativeLayout;
        this.A02 = f;
        this.A07 = r307;
        this.A03 = c9ce;
        this.A01 = true;
        this.A08 = AnonymousClass001.A0s();
        9Hq r0 = new 9Hq(new SGf(this));
        this.A09 = r0;
        C9hW c9hW = new C9hW(fbRelativeLayout, r302, r0, c6kf, c9ce.A00, AnonymousClass001.A1T(avatarAudioMessagePose));
        this.A05 = c9hW;
        this.A0A = new S4M(c9hW);
        this.A04 = new 70N() { // from class: X.9tk
            public void CCk(ArrayList arrayList) {
            }

            public void CKA(AvatarAudioMessagePose avatarAudioMessagePose2, boolean z) {
                C9lp c9lp = C9lp.this;
                C9lp.A02(c9lp, c9lp.A03.A00, false);
            }
        };
        int length = Qq9.values().length;
        int i = 0;
        while (true) {
            int i2 = i;
            ImageView imageView = null;
            if (i2 >= length) {
                break;
            }
            Qq9 qq9 = Qq9.values()[i2];
            java.util.Map map = this.A05.A0B;
            View findViewById = this.A06.findViewById(qq9.viewId);
            11T.A0I(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            map.put(qq9, new 9Nb((ImageView) findViewById));
            C9hW c9hW2 = this.A05;
            if (c9hW2.A0D) {
                9Nb r02 = (9Nb) c9hW2.A0B.get(qq9);
                if (r02 != null) {
                    r02.A01.setPivotX(this.A02 / 2.0f);
                }
                9Nb r03 = (9Nb) this.A05.A0B.get(qq9);
                if (r03 != null) {
                    r03.A01.setPivotY(this.A02);
                }
                9Nb r04 = (9Nb) this.A05.A0B.get(qq9);
                imageView = r04 != null ? r04.A01 : imageView;
                if (imageView != null) {
                    imageView.setScaleX(0.83f);
                }
                9Nb r05 = (9Nb) this.A05.A0B.get(qq9);
                if (r05 != null) {
                    r05.A01.setScaleY(0.83f);
                }
            }
            i = i2 + 1;
        }
        if (avatarAudioMessagePose != null) {
            A02(this, avatarAudioMessagePose, true);
        } else {
            C9ce c9ce2 = this.A03;
            C9tk c9tk = this.A04;
            11T.A0F(c9tk, 0);
            c9ce2.A05.add(c9tk);
            A02(this, null, false);
        }
        this.A07.Cm0(this.A0A);
        A01(this);
    }

    private final void A00(int i, int i2, float f) {
        FbRelativeLayout fbRelativeLayout = this.A06;
        FbImageView fbImageView = new FbImageView(fbRelativeLayout.getContext());
        fbImageView.setImageResource(2132410463);
        fbImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fbImageView.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        layoutParams.setMargins(i, 0, (int) (this.A02 - i2), 0);
        fbImageView.setTranslationY(f);
        fbRelativeLayout.addView(fbImageView, 1, layoutParams);
        this.A08.add(fbImageView);
    }

    public static final void A01(C9lp c9lp) {
        boolean z = c9lp.A01;
        boolean z2 = c9lp.A00;
        Qq9 qq9 = z ? z2 ? Qq9.A05 : Qq9.A03 : z2 ? Qq9.A06 : Qq9.A04;
        C9hW c9hW = c9lp.A05;
        Iterator A0y = AnonymousClass001.A0y(c9hW.A0B);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            ((9Nb) A0z.getValue()).A01.setAlpha((A0z.getKey() == qq9 || (A0z.getKey() == Qq9.A02 && !c9hW.A04)) ? 1.0f : 0.0f);
        }
    }

    public static final void A02(C9lp c9lp, AvatarAudioMessagePose avatarAudioMessagePose, boolean z) {
        ImageView imageView;
        Rect rect;
        if (avatarAudioMessagePose != null) {
            c9lp.A05.A01 = avatarAudioMessagePose;
        }
        C9hW c9hW = c9lp.A05;
        C9hW.A00(c9hW, null, z);
        boolean A1Q = AnonymousClass001.A1Q(c9hW.A01.A00, 4);
        List list = c9lp.A08;
        if (!A1Q) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(8);
            }
        } else if (list.isEmpty()) {
            float f = c9lp.A02;
            float f2 = f / 3.0f;
            float f3 = (2.0f * f) / 3.0f;
            float f4 = 0.05f * f;
            int i = (int) f4;
            float f5 = 2.0f * f4;
            c9lp.A00(i, (int) (f2 + f5), 0.2f * f);
            c9lp.A00((int) (f3 - f5), (int) (f - f4), 0.22f * f);
            c9lp.A00((int) (f2 - f4), (int) (f3 + f4), f * 0.15f);
            FbRelativeLayout fbRelativeLayout = c9lp.A06;
            fbRelativeLayout.setClipChildren(false);
            fbRelativeLayout.setClipToPadding(false);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(0);
            }
        }
        synchronized (c9hW.A0A) {
            if (c9hW.A01.A00 == 4) {
                float f6 = c9lp.A02;
                int i2 = (int) (f6 / 7.0f);
                int i3 = (int) (f6 / 6.0f);
                9Nb r0 = (9Nb) c9hW.A0B.get(Qq9.A02);
                if (r0 != null) {
                    imageView = r0.A01;
                    int i4 = (int) f6;
                    new Rect(i2, i4, i4 - i3, (int) (f6 * 0.3f));
                    imageView.setClipBounds(rect);
                }
            } else {
                9Nb r02 = (9Nb) c9hW.A0B.get(Qq9.A02);
                if (r02 != null) {
                    imageView = r02.A01;
                    int i5 = (int) c9lp.A02;
                    new Rect(0, i5, i5, 0);
                    imageView.setClipBounds(rect);
                }
            }
        }
    }
}
