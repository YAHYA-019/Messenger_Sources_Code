package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.InstantGameInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.threadview.messagelist.item.adminmessage.PlatformAdminMessageGameUpdate$3;

/* loaded from: E1C.class */
public final class E1C extends EBk implements C7yi, 7yM, CallerContextable, GCn, GDS {
    public static final CallerContext A0T = CallerContext.A06(E1C.class);
    public static final String __redex_internal_original_name = "PlatformAdminMessageGameUpdate";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewStub A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public 06Z A0A;
    public FbDraweeView A0B;
    public FbDraweeView A0C;
    public C00i A0D;
    public C6eZ A0E;
    public CCf A0F;
    public C0b A0G;
    public COo A0H;
    public 65U A0I;
    public Epa A0J;
    public AnonymousClass622 A0K;
    public 2Wo A0L;
    public 6Fu A0M;
    public final View.OnClickListener A0N;
    public final View.OnClickListener A0O;
    public final 1GS A0P;
    public final C00i A0Q;
    public final DGs A0R;
    public final PlatformAdminMessageGameUpdate$3 A0S;

    /* JADX WARN: Multi-variable type inference failed */
    public E1C(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A0P = DKG.A0J();
        this.A0Q = 1BQ.A01();
        this.A0O = FXr.A02(this, ActionId.RTMP_STREAM_PREPARED);
        this.A0N = FXr.A02(this, ActionId.VIDEO_PLAYING);
        this.A0S = new PlatformAdminMessageGameUpdate$3(this);
        this.A0R = new FjX(this);
        FbUserSession A0F = 1BL.A0F();
        Context context2 = getContext();
        this.A0D = 7zL.A0R(context2, 84968);
        this.A0H = (COo) 1Bn.A0E(context2, (1BY) null, 84769);
        this.A0G = (C0b) 1Bn.A0A(84768);
        this.A0E = (C6eZ) 1Hv.A02(context2, 84358);
        this.A0I = (65U) 1Lo.A04(context2, A0F, (1BY) null, 49952);
        this.A0F = (CCf) 1Lo.A04(context2, A0F, (1BY) null, 84357);
        setContentView(2132542949);
        this.A04 = C09s.A01(this, 2131366590);
        this.A03 = C09s.A01(this, 2131366588);
        this.A00 = C09s.A01(this, 2131366585);
        this.A05 = (ViewStub) C09s.A01(this, 2131366581);
        this.A0B = DKC.A0M(this, 2131366586);
        this.A07 = AbG.A09(this, 2131366587);
        this.A06 = AbG.A09(this, 2131366583);
        this.A01 = C09s.A01(this, 2131366589);
        this.A0L = AbK.A0v(this, 2131365636);
    }

    public static InstantGameInfoProperties A00(E1C e1c) {
        GenericAdminMessageInfo genericAdminMessageInfo;
        AnonymousClass622 anonymousClass622 = e1c.A0K;
        if (anonymousClass622 == null || (genericAdminMessageInfo = anonymousClass622.A03.A0C) == null) {
            return null;
        }
        GenericAdminMessageExtensibleData genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E;
        if (genericAdminMessageExtensibleData == null) {
            genericAdminMessageExtensibleData = null;
        }
        return (InstantGameInfoProperties) genericAdminMessageExtensibleData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01(InstantGameInfoProperties instantGameInfoProperties) {
        if (instantGameInfoProperties != null) {
            String str = instantGameInfoProperties.A09;
            String str2 = instantGameInfoProperties.A08;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str3 = instantGameInfoProperties.A03;
            spannableStringBuilder.append((CharSequence) str3);
            this.A0F.getClass();
            boolean A00 = CCf.A00();
            Resources resources = getResources();
            int i = 2131952455;
            if (A00) {
                i = 2131952457;
            }
            String string = resources.getString(i);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new DOB(this, 6), str3.length() + 1, spannableStringBuilder.length(), 33);
            FbDraweeView fbDraweeView = this.A0B;
            Uri uri = null;
            try {
                uri = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
            fbDraweeView.A0G(uri, A0T);
            this.A07.setText(str);
            this.A06.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            this.A03.setOnClickListener(this.A0O);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A02(InstantGameInfoProperties instantGameInfoProperties, E1C e1c) {
        if (instantGameInfoProperties != null) {
            if (e1c.A02 == null) {
                View inflate = e1c.A05.inflate();
                e1c.A02 = inflate;
                e1c.A0C = (FbDraweeView) inflate.findViewById(2131366580);
                e1c.A09 = AbF.A06(e1c.A02, 2131366582);
                e1c.A08 = AbF.A06(e1c.A02, 2131366584);
            }
            String str = instantGameInfoProperties.A06;
            String str2 = instantGameInfoProperties.A07;
            String str3 = instantGameInfoProperties.A04;
            if (str != null) {
                FbDraweeView fbDraweeView = e1c.A0C;
                Uri uri = null;
                try {
                    uri = C0A2.A03(str);
                } catch (SecurityException unused) {
                }
                fbDraweeView.A0G(uri, A0T);
            }
            e1c.A09.setText(str2);
            TextView textView = e1c.A08;
            int A02 = DKI.A02(e1c);
            5zD r0 = ((EBk) e1c).A00.A00;
            if (r0 != null) {
                A02 = r0.BKZ();
            }
            textView.setTextColor(A02);
            e1c.A08.setText(str3.toUpperCase(e1c.A0P.A05()));
            e1c.A02.setOnClickListener(e1c.A0N);
        }
    }

    public static void A03(E1C e1c) {
        boolean z;
        e1c.A0F.getClass();
        if (CCf.A00()) {
            AnonymousClass622 anonymousClass622 = e1c.A0K;
            if (anonymousClass622 == null) {
                return;
            }
            z = anonymousClass622.A06.A03();
            InstantGameInfoProperties A00 = A00(e1c);
            e1c.A01(A00);
            if (z) {
                A02(A00, e1c);
            }
        } else {
            e1c.A01(A00(e1c));
            z = false;
        }
        TextView textView = e1c.A06;
        if (z) {
            textView.setVisibility(8);
            e1c.A00.setVisibility(0);
            View view = e1c.A02;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        textView.setVisibility(0);
        e1c.A00.setVisibility(8);
        View view2 = e1c.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        2Wo r0 = e1c.A0L;
        if (r0.A05()) {
            r0.A02();
        }
    }

    public static void A04(E1C e1c) {
        AnonymousClass622 anonymousClass622;
        6Fu r0 = e1c.A0M;
        if (r0 == null || (anonymousClass622 = e1c.A0K) == null) {
            return;
        }
        Message message = anonymousClass622.A03;
        C62q c62q = r0.A00.A03;
        if (c62q != null) {
            c62q.C21(message);
        }
        ((COn) 4YU.A0p(e1c.A0D)).A02(4YV.A0C(e1c.A04.getContext()), e1c.A0K.A03);
    }

    @Override // X.C7yi
    public void ACK(AnonymousClass622 anonymousClass622) {
        AnonymousClass622 anonymousClass6222 = this.A0K;
        if (anonymousClass6222 == null || !anonymousClass622.equals(anonymousClass6222)) {
            this.A0K = anonymousClass622;
            GenericAdminMessageInfo genericAdminMessageInfo = anonymousClass622.A03.A0C;
            if (genericAdminMessageInfo == null || genericAdminMessageInfo.A0E == null) {
                return;
            }
            A03(this);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass622 AgU() {
        return this.A0K;
    }

    @Override // X.C7yi
    public void Cqe(6Fu r302) {
        this.A0M = r302;
    }
}
