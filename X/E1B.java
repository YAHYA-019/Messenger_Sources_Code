package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.InstantGameInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.widget.recyclerview.BetterLinearLayoutManager;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.facebook.widget.text.BetterTextView;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: E1B.class */
public final class E1B extends EBk implements C7yi, CallerContextable {
    public static final CallerContext A0L = CallerContext.A06(E1B.class);
    public static final String __redex_internal_original_name = "AdminMessageGameUpdate";
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public FbDraweeView A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C6eZ A0C;
    public 6Fu A0D;
    public ExM A0E;
    public AnonymousClass622 A0F;
    public BetterRecyclerView A0G;
    public BetterTextView A0H;
    public BetterTextView A0I;
    public BetterTextView A0J;
    public BetterTextView A0K;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(E1B e1b) {
        String A00 = e1b.A0F.A03.A0K.A00();
        DSf dSf = (DSf) 4YU.A0p(e1b.A0A);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dSf.A03.size()) {
                return;
            }
            if (A00.equals(((RNk) dSf.A03.get(i2)).A01)) {
                if (i2 < 0 || i2 > 99) {
                    return;
                }
                int i3 = 7zO.A0I(e1b.getContext()).widthPixels - ((DSf) 4YU.A0p(e1b.A0A)).A01;
                BetterRecyclerView betterRecyclerView = e1b.A0G;
                int round = Math.round(i3 / 2);
                if (betterRecyclerView.A0X) {
                    return;
                }
                betterRecyclerView.A0q();
                2Z5 r0 = ((RecyclerView) betterRecyclerView).A0F;
                if (r0 == null) {
                    0fH.A0k("BetterRecyclerView", "Cannot scroll to position without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                } else {
                    Preconditions.checkState(r0 instanceof 2Z5);
                    r0.Cjt(i2, round);
                    return;
                }
            }
            i = i2 + 1;
        }
    }

    public static void A01(E1B e1b) {
        5zD r0 = ((EBk) e1b).A00.A00;
        if (r0 != null) {
            e1b.A0I.setTextColor(r0.BKa());
            e1b.A0K.setTextColor(r0.BKZ());
            ((DSf) 4YU.A0p(e1b.A0A)).A00 = r0.BKZ();
            e1b.A0J.setTextColor(r0.BKa());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7yi
    public void ACK(AnonymousClass622 anonymousClass622) {
        GenericAdminMessageExtensibleData genericAdminMessageExtensibleData;
        if (anonymousClass622.equals(this.A0F)) {
            return;
        }
        this.A0F = anonymousClass622;
        FbUserSession A0C = 4YV.A0C(this.A05.getContext());
        Context context = getContext();
        1Lo.A03(context, A0C, 84357);
        if (CCf.A00()) {
            AnonymousClass622 anonymousClass6222 = this.A0F;
            GenericAdminMessageInfo genericAdminMessageInfo = anonymousClass6222.A03.A0C;
            if (genericAdminMessageInfo != null && genericAdminMessageInfo.A0E != null) {
                boolean A03 = anonymousClass6222.A06.A03();
                this.A0E.A02(A03);
                Message message = this.A0F.A03;
                GenericAdminMessageExtensibleData genericAdminMessageExtensibleData2 = message.A0C.A0E;
                if (genericAdminMessageExtensibleData2 == null) {
                    genericAdminMessageExtensibleData2 = null;
                }
                InstantGameInfoProperties instantGameInfoProperties = (InstantGameInfoProperties) genericAdminMessageExtensibleData2;
                String str = message.A0F().A00;
                String str2 = instantGameInfoProperties.A03;
                if (Platform.stringIsNullOrEmpty(str2)) {
                    str2 = str;
                }
                String str3 = instantGameInfoProperties.A07;
                if (!Platform.stringIsNullOrEmpty(str3)) {
                    str = str3;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str2);
                spannableStringBuilder.append((CharSequence) " ");
                SpannableString spannableString = new SpannableString(getResources().getString(2131952457));
                spannableString.setSpan(new DOB(this, 4), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                this.A0I.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                this.A0I.setContentDescription(spannableStringBuilder);
                C2rp.A01(this.A0I);
                this.A0J.setText(((C22a) 4YU.A0p(this.A08)).BdE(str, this.A0J.getTextSize()));
                FXr.A03(this.A05, this, ActionId.TIMEOUT);
                this.A0K.setText(2131952456);
                C2rp.A01(this.A0K);
                FXs.A01(this.A0K, A0C, this, 29);
                this.A0H.setText(instantGameInfoProperties.A09);
                String str4 = instantGameInfoProperties.A08;
                if (!Platform.stringIsNullOrEmpty(str4)) {
                    FbDraweeView fbDraweeView = this.A07;
                    Uri uri = null;
                    try {
                        uri = C0A2.A03(str4);
                    } catch (SecurityException unused) {
                    }
                    fbDraweeView.A0G(uri, A0L);
                }
                ImmutableList immutableList = instantGameInfoProperties.A02;
                if (immutableList == null) {
                    immutableList = instantGameInfoProperties.A01;
                    if (immutableList == null) {
                        this.A0G.A16(null);
                        A01(this);
                        return;
                    }
                }
                ((DSf) 4YU.A0p(this.A0A)).A02 = this.A0F.A03.A0K.A00();
                DSf dSf = (DSf) 4YU.A0p(this.A0A);
                dSf.A03 = ImmutableList.copyOf((Collection) immutableList);
                dSf.A07();
                BetterLinearLayoutManager betterLinearLayoutManager = new BetterLinearLayoutManager(context);
                ((AutoMeasureLinearLayoutManager) betterLinearLayoutManager).A00 = true;
                betterLinearLayoutManager.A1p(0);
                this.A0G.A1D(betterLinearLayoutManager);
                this.A0G.A16((2Xd) 4YU.A0p(this.A0A));
                if (A03) {
                    A00(this);
                }
                A01(this);
                return;
            }
        }
        this.A0I.setTextAppearance(context, 2132606996);
        this.A06.setVisibility(8);
        this.A04.setVisibility(8);
        this.A0J.setVisibility(8);
        this.A0I.setVisibility(0);
        A01(this);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Resources resources = getResources();
        Message message2 = this.A0F.A03;
        spannableStringBuilder2.append((CharSequence) message2.A0F().A00);
        GenericAdminMessageInfo genericAdminMessageInfo2 = message2.A0C;
        if (0S2.A01.equals((genericAdminMessageInfo2 == null || (genericAdminMessageExtensibleData = genericAdminMessageInfo2.A0E) == null) ? null : C7kx.A00(((InstantGameInfoProperties) genericAdminMessageExtensibleData).A0B))) {
            SpannableString spannableString2 = new SpannableString(resources.getString(2131952456));
            spannableString2.setSpan(new DOG(7, message2, this, A0C), 0, spannableString2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) spannableString2);
            DKC.A1P(this.A0I);
        }
        this.A0I.setText(new SpannableString(spannableStringBuilder2));
    }

    @Override // X.C7yi
    public void Cqe(6Fu r302) {
        this.A0D = r302;
    }
}
