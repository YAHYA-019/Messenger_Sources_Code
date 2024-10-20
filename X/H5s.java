package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.messaging.sharedimage.sharedmediareactions.SharedMediaWithReactions;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.FbImageView;
import com.facebook.widget.RoundedCornersFrameLayout;
import com.facebook.xapp.messaging.threadview.model.highlightstab.HighlightsTabMetadata;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;

/* loaded from: H5s.class */
public final class H5s extends 48A {
    public int A00;
    public Uri A01;
    public RelativeLayout A02;
    public C87p A03;
    public LithoView A04;
    public LithoView A05;
    public LithoView A06;
    public LithoView A07;
    public LithoView A08;
    public HaZ A09;
    public ThreadKey A0A;
    public FbImageView A0B;
    public RoundedCornersFrameLayout A0C;
    public RoundedCornersFrameLayout A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final CallerContext A0L;
    public final C06974ih A0M;
    public final C00i A0N;
    public final MediaMessageItem A0O;
    public final boolean A0P;
    public final int A0Q;
    public final int A0R;
    public final C00i A0S;
    public final C00i A0T;

    /* JADX WARN: Multi-variable type inference failed */
    public H5s(Context context, ThreadKey threadKey, MediaMessageItem mediaMessageItem, boolean z) {
        super(context);
        boolean z2;
        Resources resources;
        String string;
        LithoView lithoView;
        8VX r312;
        1CO A02;
        long j;
        ThreadKey threadKey2;
        HighlightsTabMetadata highlightsTabMetadata;
        HighlightsTabMetadata highlightsTabMetadata2;
        this.A0L = CallerContext.A0B("MediaMessageView");
        this.A0S = 1BV.A00(66570);
        1BV A00 = 1BV.A00(66811);
        this.A0T = A00;
        this.A0N = AbH.A0Q();
        this.A0A = threadKey;
        this.A0G = z;
        this.A0O = mediaMessageItem;
        this.A0H = false;
        this.A0K = mediaMessageItem.BTC();
        this.A03 = new C87p(false, 6);
        this.A0Q = mediaMessageItem.B0a();
        this.A0R = mediaMessageItem.B0d();
        Context context2 = getContext();
        this.A00 = 7zR.A00(context2);
        this.A0E = mediaMessageItem.Aw7();
        Uri BFd = mediaMessageItem.BFd();
        this.A01 = BFd == null ? mediaMessageItem.AqA() : BFd;
        this.A0F = mediaMessageItem.BAM();
        C07004ik A002 = C06984ii.A00();
        ((C07014il) A002).A09 = ((7Ju) A00.get()).A00();
        A002.A00(InterfaceC07034in.A01);
        MediaResource AwL = mediaMessageItem.AwL();
        if (AwL.A0s != null && AwL.A03()) {
            A002.A05(new ColorDrawable(context2.getColor(2132214336)));
        }
        this.A0P = mediaMessageItem.BUo();
        this.A0M = new C06974ih(A002);
        MediaMessageItem mediaMessageItem2 = this.A0O;
        Message Ax8 = mediaMessageItem2.Ax8();
        boolean z3 = false;
        if (Ax8 != null && (threadKey2 = Ax8.A0V) != null && this.A0G && ((threadKey2.A1N() && (highlightsTabMetadata2 = mediaMessageItem2.AwL().A0Y) != null && highlightsTabMetadata2.A02 != C5wh.A09 && C1ub.A00().AZk(36321636492919421L) && C1ub.A00().AZk(36321636492329593L)) || (threadKey2.A0z() && (highlightsTabMetadata = mediaMessageItem2.AwL().A0Y) != null && highlightsTabMetadata.A02 != C5wh.A09 && C1ub.A02()))) {
            z3 = true;
        }
        this.A0I = z3;
        Message Ax82 = this.A0O.Ax8();
        if (this.A0P && this.A0G && Ax82 != null && 60U.A09(Ax82)) {
            1qI r0 = (1qI) 1Bi.A03(66409);
            ThreadKey threadKey3 = this.A0A;
            z2 = false;
            if (threadKey3 != null) {
                if (threadKey3.A0z()) {
                    A02 = 1qI.A02(r0);
                    j = 36322796133894098L;
                } else if (threadKey3.A1L()) {
                    A02 = 1qI.A02(r0);
                    j = 36322796133828561L;
                } else if (threadKey3.A0y()) {
                    A02 = 1qI.A02(r0);
                    j = 36322796134025171L;
                }
                z2 = A02.AZk(j);
            }
        } else {
            z2 = false;
        }
        this.A0J = z2;
        setContentView(2132543268);
        RelativeLayout relativeLayout = (RelativeLayout) C09s.A01(this, 2131365506);
        this.A02 = relativeLayout;
        IKN.A00(relativeLayout, this, 2);
        this.A0D = (RoundedCornersFrameLayout) C09s.A01(this.A02, 2131367029);
        LithoView lithoView2 = new LithoView(context2, (AttributeSet) null);
        this.A04 = lithoView2;
        1Iw r02 = lithoView2.A09;
        2cM A01 = 2cK.A01(r02, (String) null, 0);
        A01.A0c();
        C26z c26z = C26z.ALL;
        A01.A27(c26z, 0.0f);
        A01.A2c();
        A01.A2b();
        C2cm A003 = C2cl.A00(r02);
        C00i c00i = this.A0N;
        A003.A2a(GOn.A0M(c00i).A03(C1u3.A2d));
        A003.A2Z(2132213766);
        A003.A2c(ImageView.ScaleType.FIT_CENTER);
        A01.A2d(A003);
        C8S3 c8s3 = new C8S3(r02, new 8mN());
        String str = this.A0F;
        if (str == null || str.equals("")) {
            resources = getResources();
            string = resources.getString(2131959347);
        } else {
            resources = getResources();
            string = 4YU.A0u(resources, str, 2131959348);
        }
        8mN r03 = c8s3.A01;
        r03.A01 = string;
        BitSet bitSet = c8s3.A02;
        bitSet.set(1);
        r03.A00 = resources.getString(2131959346);
        bitSet.set(0);
        C1rs.A00(bitSet, c8s3.A03);
        c8s3.A0J();
        A01.A2e(r03);
        lithoView2.A0x(A01.A00);
        FbImageView fbImageView = new FbImageView(context2);
        this.A0B = fbImageView;
        AbH.A1K(fbImageView, context2.getColor(2132214336));
        7zR.A11(this.A0B);
        IKE.A01(this.A0B, this, 71);
        RoundedCornersFrameLayout roundedCornersFrameLayout = new RoundedCornersFrameLayout(context2);
        this.A0C = roundedCornersFrameLayout;
        roundedCornersFrameLayout.setLayoutParams(A00(this));
        if (this.A0H) {
            A05(false);
        } else {
            A03();
        }
        LithoView lithoView3 = new LithoView(context2, (AttributeSet) null);
        this.A07 = lithoView3;
        2cM A012 = 2cK.A01(lithoView3.A09, (String) null, 0);
        A012.A0c();
        A012.A27(c26z, 0.0f);
        A012.A2g(C1ro.FLEX_END);
        C2cm A004 = C2cl.A00(this.A07.A09);
        A004.A2a(GOn.A0M(c00i).A03(C1u3.A3h));
        A004.A2Z(2132214193);
        A004.A0c();
        A004.A2F(C26z.RIGHT, R.dimen.mapbox_eight_dp);
        A004.A1Z(R.dimen.mapbox_eight_dp);
        A004.A2T(EWA.A00(new J5y(this, 0)));
        A012.A2d(A004);
        lithoView3.A0y(A012.A00);
        this.A08 = (LithoView) C09s.A01(this.A02, 2131366824);
        if (this.A0I) {
            this.A05 = new LithoView(context2, (AttributeSet) null);
            MigColorScheme A0d = AbI.A0d(context2);
            lithoView = this.A05;
            HighlightsTabMetadata highlightsTabMetadata3 = this.A0O.AwL().A0Y;
            r312 = new 8VX(A0d, highlightsTabMetadata3 != null ? highlightsTabMetadata3.A02 : C5wh.A09);
        } else {
            if (!this.A0J) {
                return;
            }
            this.A06 = new LithoView(context2, (AttributeSet) null);
            MigColorScheme A0d2 = AbI.A0d(context2);
            lithoView = this.A06;
            r312 = new 8Yn(this.A0A, this.A0O, A0d2, new J5y(this, 1));
        }
        lithoView.A0y(r312);
    }

    public static FrameLayout.LayoutParams A00(H5s h5s) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(h5s.A0D.getLayoutParams());
        if ((layoutParams.width == -1 || layoutParams.height == -1) && h5s.A0Q > 0 && h5s.A0R > 0) {
            h5s.A01(layoutParams);
        }
        int max = Math.max(layoutParams.height, 350);
        layoutParams.height = max;
        int max2 = Math.max(layoutParams.width, 350);
        layoutParams.width = max2;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(max2, max);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    private void A01(ViewGroup.LayoutParams layoutParams) {
        RelativeLayout relativeLayout = this.A02;
        int height = relativeLayout.getHeight();
        int width = relativeLayout.getWidth();
        float f = this.A0R / this.A0Q;
        float f2 = width;
        float f3 = height;
        if (f > f2 / f3) {
            layoutParams.height = (int) (f2 / f);
        } else {
            layoutParams.height = height;
            width = (int) (f3 * f);
        }
        layoutParams.width = width;
    }

    public static void A02(H5s h5s, int i) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        FbImageView fbImageView;
        int max;
        if (h5s.A0Q <= 0 || h5s.A0R <= 0) {
            return;
        }
        if (h5s.A0G) {
            C6kc A0l = GOn.A0l(h5s.A0S);
            ThreadKey threadKey = h5s.A0A;
            if (C6kc.A00(A0l).AZk(36310469565612308L) || C6kc.A01(threadKey)) {
                z = true;
                RoundedCornersFrameLayout roundedCornersFrameLayout = h5s.A0D;
                roundedCornersFrameLayout.setCornerRadius(i);
                layoutParams = roundedCornersFrameLayout.getLayoutParams();
                if (!z || !h5s.A0P) {
                    h5s.A01(layoutParams);
                    fbImageView = h5s.A0B;
                    if (fbImageView != null && fbImageView.getVisibility() == 0) {
                        layoutParams.height = Math.max(layoutParams.height, 350);
                        max = Math.max(layoutParams.width, 350);
                    }
                    roundedCornersFrameLayout.setLayoutParams(layoutParams);
                }
                max = -1;
                float f = 0.0f / 0.0f;
                layoutParams.height = -1;
                layoutParams.width = max;
                roundedCornersFrameLayout.setLayoutParams(layoutParams);
            }
        }
        z = false;
        i = 0;
        RoundedCornersFrameLayout roundedCornersFrameLayout2 = h5s.A0D;
        roundedCornersFrameLayout2.setCornerRadius(i);
        layoutParams = roundedCornersFrameLayout2.getLayoutParams();
        if (!z) {
        }
        h5s.A01(layoutParams);
        fbImageView = h5s.A0B;
        if (fbImageView != null) {
            layoutParams.height = Math.max(layoutParams.height, 350);
            max = Math.max(layoutParams.width, 350);
            layoutParams.width = max;
        }
        roundedCornersFrameLayout2.setLayoutParams(layoutParams);
    }

    public void A03() {
        this.A0B.setVisibility(8);
        this.A04.setVisibility(8);
        this.A0C.setVisibility(8);
        View childAt = this.A0D.getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
        }
        this.A03 = new C87p(false, 6);
        A02(this, this.A00);
    }

    public void A04(SharedMediaWithReactions sharedMediaWithReactions) {
        LithoView lithoView = this.A08;
        C1rq A01 = C1rg.A01(lithoView.A09, null, 0);
        A01.A0S();
        A01.A2f(new 8XB(new IVn(this), sharedMediaWithReactions.A01, sharedMediaWithReactions.A02));
        lithoView.A0x(A01.A00);
        lithoView.post(new IqS(this));
    }

    public void A05(boolean z) {
        if (this.A0H) {
            if (z) {
                C7uL.A00(this.A01, this.A0B, this.A0M, this.A0L);
            }
            this.A0B.setVisibility(0);
            this.A04.setVisibility(0);
            this.A0C.setVisibility(0);
            DKG.A1J(this.A0D.getChildAt(0));
            this.A03 = new C87p(true, 6);
            A02(this, this.A00);
        }
    }
}
