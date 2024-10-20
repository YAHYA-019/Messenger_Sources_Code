package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;
import com.facebook.resources.ui.FbTextView;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.DeW, reason: case insensitive filesystem */
/* loaded from: DeW.class */
public final class C2118DeW extends EAX {
    public DMV A00;
    public C00i A01;
    public DynamicDescriptorParams A02;
    public String A03;
    public ProgressBar A04;
    public GlyphView A05;
    public FbTextView A06;
    public final Handler A07;
    public volatile boolean A08;
    public volatile boolean A09;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    public C2118DeW(Context context, DMV dmv, DynamicDescriptorParams dynamicDescriptorParams, String str) {
        super(context, 0);
        this.A09 = false;
        this.A08 = false;
        this.A07 = AnonymousClass001.A07();
        setContentView(2132541819);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        A0C(false);
        this.A00 = dmv;
        this.A05 = (GlyphView) findViewById(2131363539);
        this.A04 = (ProgressBar) findViewById(2131362163);
        ?? r0 = (FbTextView) findViewById(2131363540);
        this.A06 = r0;
        this.A02 = dynamicDescriptorParams;
        this.A03 = str;
        if (r0 != 0) {
            DKH.A0v(context, (TextView) r0, dynamicDescriptorParams.A03, 2131952969);
        }
        this.A01 = AbF.A0Q(context, 99424);
    }

    public static void A00(C2118DeW c2118DeW) {
        synchronized (c2118DeW) {
            if (c2118DeW.A09 && c2118DeW.A08) {
                ProgressBar progressBar = c2118DeW.A04;
                if (progressBar != null) {
                    GlyphView glyphView = c2118DeW.A05;
                    if (glyphView != null) {
                        progressBar.setVisibility(8);
                        glyphView.setVisibility(0);
                    }
                }
                c2118DeW.A07.postDelayed(new S8w(c2118DeW), 2000L);
            }
        }
    }

    public void show() {
        F6A f6a;
        Rtd eei;
        ListenableFuture A0Z;
        int i;
        Object obj;
        A0G(false, false);
        this.A09 = false;
        this.A07.postDelayed(new S8v(this), 4000L);
        String str = this.A03;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        switch (str.hashCode()) {
            case -1945468359:
                if (str.equals("p2p_send")) {
                    f6a = (F6A) this.A01.get();
                    DynamicDescriptorParams dynamicDescriptorParams = this.A02;
                    String str2 = dynamicDescriptorParams.A0E;
                    String str3 = dynamicDescriptorParams.A08;
                    String str4 = dynamicDescriptorParams.A00;
                    String str5 = dynamicDescriptorParams.A0D;
                    eei = new Eei(this);
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, str2, "restricted_entity_id");
                    07S.A00(A0J, str3, "credential_id");
                    07S.A00(A0J, str4, "actor_id");
                    GraphQlQueryParamSet A0N = 4YU.A0N(A0J, str5, "payment_type");
                    4YV.A1A(A0J, A0N, "input");
                    5Dh A00 = 5Dh.A00(A0N, new C01643sd(Q8q.class, "AuthorizeDynamicDescriptorMutation", null, "input", "fbandroid", 1267760754, 96, 3956780601L, 3956780601L, false, true));
                    Context context = f6a.A03;
                    DKG.A1D(context);
                    A0Z = AbL.A0Z(7zM.A0K(context), A00, 412873616736935L);
                    i = 22;
                    1Kd.A0D(f6a.A04, FwJ.A00(eei, f6a, i), A0Z);
                }
                return;
            case 3009503:
                obj = "aymt";
                break;
            case 130106941:
                obj = "boost_screen_load";
                break;
            case 1731733506:
                obj = "boost_load";
                break;
            case 1788783896:
                obj = "boost_create";
                break;
            default:
                return;
        }
        if (str.equals(obj)) {
            f6a = (F6A) this.A01.get();
            DynamicDescriptorParams dynamicDescriptorParams2 = this.A02;
            String str6 = dynamicDescriptorParams2.A01;
            String str7 = dynamicDescriptorParams2.A08;
            eei = new Rtd(this);
            Q70 q70 = new Q70();
            q70.A03("legacy_account_id", str6);
            q70.A03("credential_id", str7);
            q70.A03("entrypoint", EX6.A00(str));
            5Dh r0 = new 5Dh(q70);
            Context context2 = f6a.A03;
            DKG.A1D(context2);
            A0Z = AbL.A0Z(7zM.A0K(context2), r0, 412873616736935L);
            i = 21;
            1Kd.A0D(f6a.A04, FwJ.A00(eei, f6a, i), A0Z);
        }
    }
}
