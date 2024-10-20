package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.picker.ContactPickerSingleTapActionButton;
import com.facebook.messaging.business.search.model.PlatformSearchData;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.contacts.picker.common.ContactPickerListItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel;
import com.facebook.messaging.ui.name.ThreadNameView;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.model.UserPhoneNumber;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.SimpleVariableTextLayoutView;
import com.facebook.widget.tiles.ThreadTileView;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: Cf8.class */
public final class Cf8 implements DIw {
    public int A00;
    public 1BY A01;
    public final Context A02;
    public final C00i A03 = 1BV.A01((1BY) null, 16979);
    public final 1Iw A04;
    public final C00i A05;

    public Cf8(1BO r302) {
        1BV A01 = 1BV.A01((1BY) null, 147967);
        this.A05 = A01;
        this.A01 = 7zL.A0Q(r302);
        Context A03 = AbI.A03((1BY) null);
        this.A02 = A03;
        this.A04 = 7zL.A0W(A03);
        A01.get();
        11T.A0F(A03, 0);
        this.A00 = 0NA.A01(A03, 2130971196, 2132214411);
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D96(AoO aoO, Object obj) {
        CustomRelativeLayout customRelativeLayout = (View) obj;
        if (customRelativeLayout == null) {
            customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            customRelativeLayout.A0C(2132542893);
            ((BJ3) customRelativeLayout).A01 = (CheckBox) C09s.A01(customRelativeLayout, 2131365065);
            ((BJ3) customRelativeLayout).A04 = (SimpleVariableTextLayoutView) C09s.A01(customRelativeLayout, 2131363300);
            ((BJ3) customRelativeLayout).A03 = AbK.A0v(customRelativeLayout, 2131367409);
            ((BJ3) customRelativeLayout).A00 = ((BJ3) customRelativeLayout).A04.getTextColor();
        }
        ((BJ3) customRelativeLayout).A02 = aoO;
        BJ3.A00(customRelativeLayout);
        return customRelativeLayout;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D97(AoU aoU, Object obj) {
        CustomRelativeLayout customRelativeLayout = (View) obj;
        if (customRelativeLayout == null) {
            customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            Context context = customRelativeLayout.getContext();
            ((BJ1) customRelativeLayout).A05 = 7zL.A0R(context, 84365);
            customRelativeLayout.A0C(2132542894);
            customRelativeLayout.setPadding(0, customRelativeLayout.getPaddingTop(), 0, customRelativeLayout.getPaddingBottom());
            customRelativeLayout.setId(2131363287);
            ThreadNameView threadNameView = (ThreadNameView) C09s.A01(customRelativeLayout, 2131364401);
            ((BJ1) customRelativeLayout).A07 = threadNameView;
            ((BJ1) customRelativeLayout).A00 = threadNameView.getTextColor();
            ((BJ1) customRelativeLayout).A06 = (ThreadNameView) C09s.A01(customRelativeLayout, 2131364393);
            ((BJ1) customRelativeLayout).A09 = (ThreadTileView) C09s.A01(customRelativeLayout, 2131363288);
            ((BJ1) customRelativeLayout).A03 = (ImageView) C09s.A01(customRelativeLayout, 2131366621);
            int A01 = 0NA.A01(context, 2130969141, AbG.A00(context));
            CheckBox checkBox = (CheckBox) C09s.A01(customRelativeLayout, 2131365065);
            ((BJ1) customRelativeLayout).A02 = checkBox;
            checkBox.setButtonDrawable((Drawable) ((CJ1) 4YU.A0p(((BJ1) customRelativeLayout).A05)).A02(Integer.valueOf(A01), (Integer) null));
            ((BJ1) customRelativeLayout).A01 = (ViewStub) C09s.A01(customRelativeLayout, 2131363661);
            ((BJ1) customRelativeLayout).A08 = AbK.A0v(customRelativeLayout, 2131367412);
        }
        FbUserSession A0C = 4YV.A0C(this.A04.A0D);
        ((BJ1) customRelativeLayout).A04 = aoU;
        ThreadSummary threadSummary = aoU.A03;
        Context context2 = customRelativeLayout.getContext();
        5Xv A02 = ((5Xu) 1Lo.A04(context2, A0C, (1BY) null, 49772)).A02(threadSummary);
        ((BJ1) customRelativeLayout).A07.A07(A02);
        ((BJ1) customRelativeLayout).A07.setVisibility(0);
        ((BJ1) customRelativeLayout).A09.A01(((2fZ) 1Lo.A04(context2, A0C, (1BY) null, 17067)).A0N(threadSummary));
        ((BJ1) customRelativeLayout).A09.setVisibility(0);
        boolean A08 = 2Gt.A08(threadSummary);
        DP1 dp1 = ((BJ1) customRelativeLayout).A06;
        if (A08) {
            dp1.A07(A02);
            ((BJ1) customRelativeLayout).A06.setVisibility(0);
        } else {
            dp1.setVisibility(8);
        }
        ((BJ1) customRelativeLayout).A03.setVisibility(8);
        boolean z = ((BJ1) customRelativeLayout).A04.A02;
        CheckBox checkBox2 = ((BJ1) customRelativeLayout).A02;
        if (z) {
            checkBox2.setVisibility(0);
            ((BJ1) customRelativeLayout).A02.setChecked(((BJ1) customRelativeLayout).A04.A01);
        } else {
            checkBox2.setVisibility(8);
        }
        ((BJ1) customRelativeLayout).A07.setTextColor(((BJ1) customRelativeLayout).A04.A01 ? AbG.A00(context2) : ((BJ1) customRelativeLayout).A00);
        boolean z2 = ((BJ1) customRelativeLayout).A04.A02;
        2Wo r0 = ((BJ1) customRelativeLayout).A08;
        if (!z2) {
            r0.A02();
            return customRelativeLayout;
        }
        ContactPickerSingleTapActionButton contactPickerSingleTapActionButton = (ContactPickerSingleTapActionButton) r0.A01();
        contactPickerSingleTapActionButton.setVisibility(0);
        contactPickerSingleTapActionButton.A0V(((BJ1) customRelativeLayout).A04);
        return customRelativeLayout;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D98(RnX rnX, Object obj) {
        CustomRelativeLayout customRelativeLayout = (View) obj;
        if (customRelativeLayout == null) {
            customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            ((BIz) customRelativeLayout).A04 = 1BQ.A02(66067);
            customRelativeLayout.A0C(2132541755);
            customRelativeLayout.setMinimumHeight(0NA.A02(customRelativeLayout.getContext(), 2130969214, 0));
            ((BIz) customRelativeLayout).A05 = (UserTileView) C09s.A01(customRelativeLayout, 2131365656);
            ((BIz) customRelativeLayout).A01 = AbG.A09(customRelativeLayout, 2131365658);
            ((BIz) customRelativeLayout).A00 = AbG.A09(customRelativeLayout, 2131365654);
            ((BIz) customRelativeLayout).A02 = AbG.A09(customRelativeLayout, 2131365657);
        }
        if (((BIz) customRelativeLayout).A03 != rnX) {
            ((BIz) customRelativeLayout).A03 = rnX;
            ((BIz) customRelativeLayout).A05.A03(rnX.A00);
            ((BIz) customRelativeLayout).A01.setText(((C22a) 4YU.A0p(((BIz) customRelativeLayout).A04)).BdE(((BIz) customRelativeLayout).A03.A03, ((BIz) customRelativeLayout).A01.getTextSize()));
            ((BIz) customRelativeLayout).A02.setText(((BIz) customRelativeLayout).A03.A04);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((BIz) customRelativeLayout).A03.A02);
            ImmutableList immutableList = ((BIz) customRelativeLayout).A03.A01;
            if (immutableList != null) {
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    MessageSearchMatchRangesModel messageSearchMatchRangesModel = (MessageSearchMatchRangesModel) it.next();
                    StyleSpan styleSpan = new StyleSpan(1);
                    int i = messageSearchMatchRangesModel.A01;
                    int i2 = i + messageSearchMatchRangesModel.A00;
                    spannableStringBuilder.setSpan(styleSpan, i, i2, 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(customRelativeLayout.getContext().getColor(2132214335)), i, i2, 33);
                }
            }
            ((BIz) customRelativeLayout).A00.setText(((C22a) 4YU.A0p(((BIz) customRelativeLayout).A04)).BdE(spannableStringBuilder, ((BIz) customRelativeLayout).A00.getTextSize()));
            TextView textView = ((BIz) customRelativeLayout).A00;
            int i3 = 3;
            if (((BIz) customRelativeLayout).A03.A06) {
                i3 = (-1) >>> 1;
                float f = 0.0f / 0.0f;
            }
            textView.setMaxLines(i3);
            if (((BIz) customRelativeLayout).A03.A05) {
                customRelativeLayout.setBackgroundColor(customRelativeLayout.getContext().getColor(2132213979));
                return customRelativeLayout;
            }
            customRelativeLayout.setBackground(null);
        }
        return customRelativeLayout;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D99(RnW rnW, Object obj) {
        BIy bIy = (View) obj;
        CustomRelativeLayout customRelativeLayout = bIy;
        if (customRelativeLayout == null) {
            customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            ((BIy) customRelativeLayout).A03 = 1BQ.A02(66067);
            customRelativeLayout.A0C(2132541756);
            customRelativeLayout.setMinimumHeight(0NA.A02(customRelativeLayout.getContext(), 2130969214, 0));
            ((BIy) customRelativeLayout).A01 = AbG.A09(customRelativeLayout, 2131365658);
            ((BIy) customRelativeLayout).A04 = (ThreadTileView) C09s.A01(customRelativeLayout, 2131365656);
            ((BIy) customRelativeLayout).A00 = AbG.A09(customRelativeLayout, 2131365655);
        }
        FbUserSession A0C = 4YV.A0C(bIy.getContext());
        if (((BIy) customRelativeLayout).A02 != rnW) {
            ((BIy) customRelativeLayout).A02 = rnW;
            ((BIy) customRelativeLayout).A01.setText(((C22a) 4YU.A0p(((BIy) customRelativeLayout).A03)).BdE(((BIy) customRelativeLayout).A02.A02, ((BIy) customRelativeLayout).A01.getTextSize()));
            ((BIy) customRelativeLayout).A04.A01(((2fZ) 1Lo.A04(customRelativeLayout.getContext(), A0C, (1BY) null, 17067)).A0N(((BIy) customRelativeLayout).A02.A01));
            ((BIy) customRelativeLayout).A00.setText(4YU.A0u(customRelativeLayout.getResources(), Integer.valueOf(((BIy) customRelativeLayout).A02.A00), 2131959797));
        }
        return customRelativeLayout;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9A(AoP aoP, Object obj) {
        BJ4 bj4 = (View) obj;
        if (bj4 == null) {
            bj4 = new BJ4(this.A02);
        }
        bj4.A02 = aoP;
        BJ4.A00(bj4);
        return bj4;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9B(Cf7 cf7, Object obj) {
        48A r303 = (BJ7) ((View) obj);
        if (r303 == null) {
            r303 = new 48A(this.A02, (AttributeSet) null, 0);
            r303.setContentView(2132542906);
            ((BJ7) r303).A00 = AbG.A09(r303, 2131364202);
        }
        ((BJ7) r303).A00.setText(cf7.A00);
        return r303;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9C(AoT aoT, Object obj) {
        int i;
        BJ2 bj2 = (View) obj;
        if (bj2 == null) {
            bj2 = new BJ2(this.A02);
        }
        bj2.A00 = aoT;
        aoT.A02.getClass();
        bj2.A01.A03();
        UserTileView userTileView = (UserTileView) C09s.A01(bj2, 2131365990);
        SimpleVariableTextLayoutView simpleVariableTextLayoutView = (SimpleVariableTextLayoutView) C09s.A01(bj2, 2131365987);
        TextView A09 = AbG.A09(bj2, 2131365989);
        View A01 = C09s.A01(bj2, 2131365988);
        PicSquare picSquare = bj2.A00.A02.A02;
        userTileView.A03(picSquare != null ? new 2qZ((Uri) null, (UserKey) null, picSquare, 2qU.A01, (3xU) null, ((C6g) bj2.A02.get()).A00(bj2.A00.A02), (String) null, (String) null, 0, 0) : null);
        simpleVariableTextLayoutView.A08(bj2.A00.A02.A01.displayName);
        C00i c00i = bj2.A02;
        String A012 = ((C6g) c00i.get()).A01(bj2.A00.A02, true);
        if (Platform.stringIsNullOrEmpty(A012)) {
            i = 8;
        } else {
            A09.setText(A012);
            i = 0;
        }
        A09.setVisibility(i);
        c00i.get();
        PlatformSearchData platformSearchData = bj2.A00.A02;
        String str = platformSearchData instanceof PlatformSearchGameData ? ((PlatformSearchGameData) platformSearchData).A00.A0I : null;
        if (Platform.stringIsNullOrEmpty(str)) {
            A01.setVisibility(8);
            return bj2;
        }
        if (A01 instanceof ViewStub) {
            A01 = ((ViewStub) A01).inflate();
        }
        TextView textView = (TextView) A01;
        textView.setVisibility(0);
        textView.setText(str);
        return bj2;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9D(DJm dJm, Object obj) {
        Object obj2 = null;
        if (dJm == BY1.A00) {
            obj2 = obj;
            if (obj == null) {
                48A r305 = new 48A(this.A02, (AttributeSet) null, 0);
                r305.setContentView(2132542901);
                obj2 = r305;
            }
        }
        return obj2;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9E(Cey cey, Object obj) {
        View.OnClickListener onClickListener;
        48A r303 = (BJ8) ((View) obj);
        if (r303 == null) {
            r303 = new 48A(this.A02);
            r303.setContentView(2132542847);
            ((BJ8) r303).A02 = (Button) C09s.A01(r303, 2131366145);
            ((BJ8) r303).A03 = AbG.A09(r303, 2131366146);
            CZF.A01(((BJ8) r303).A02, r303, 72);
            ((BJ8) r303).A00 = ((BJ8) r303).A02.getCurrentTextColor();
        }
        ((BJ8) r303).A03.setText(cey.A03);
        r303.setTextColor(AbF.A0p(this.A03).B9Q());
        String str = cey.A01;
        if (Platform.stringIsNullOrEmpty(str) || (onClickListener = cey.A00) == null) {
            ((BJ8) r303).A02.setText((CharSequence) null);
            ((BJ8) r303).A02.setVisibility(8);
            ((BJ8) r303).A02.setTextColor(((BJ8) r303).A00);
            return r303;
        }
        ((BJ8) r303).A02.setText(str);
        Button button = ((BJ8) r303).A02;
        int i = 0;
        if (1JF.A0B(str)) {
            i = 8;
        }
        button.setVisibility(i);
        ((BJ8) r303).A01 = onClickListener;
        ((BJ8) r303).A02.setTextColor(0NA.A01(this.A02, 2130971196, 2132214411));
        return r303;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9F(RnT rnT, Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            CustomRelativeLayout customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            customRelativeLayout.A0C(2132542905);
            obj2 = customRelativeLayout;
        }
        return obj2;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9G(AoQ aoQ, Object obj) {
        CustomRelativeLayout customRelativeLayout = (View) obj;
        if (customRelativeLayout == null) {
            customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            customRelativeLayout.A0C(2132542900);
            ((BIx) customRelativeLayout).A02 = (ThreadTileView) C09s.A01(customRelativeLayout, 2131368064);
            ((BIx) customRelativeLayout).A01 = (ThreadNameView) C09s.A01(customRelativeLayout, 2131368063);
        }
        FbUserSession A0C = 4YV.A0C(this.A02);
        ((BIx) customRelativeLayout).A00 = aoQ;
        Context context = customRelativeLayout.getContext();
        5Xu r0 = (5Xu) 1Lo.A04(context, A0C, (1BY) null, 49772);
        2fZ r02 = (2fZ) 1Lo.A04(context, A0C, (1BY) null, 17067);
        ThreadSummary threadSummary = ((BIx) customRelativeLayout).A00.A02;
        ((BIx) customRelativeLayout).A01.A07(r0.A02(threadSummary));
        ((BIx) customRelativeLayout).A02.A01(r02.A0N(threadSummary));
        return customRelativeLayout;
    }

    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9H(AoS aoS, Object obj) {
        ContactPickerListItem contactPickerListItem = (ContactPickerListItem) ((View) obj);
        if (contactPickerListItem == null) {
            Context context = this.A02;
            contactPickerListItem = new ContactPickerListItem(context, 4YV.A0C(context));
        }
        contactPickerListItem.A07 = aoS;
        ContactPickerListItem.A04(contactPickerListItem);
        int i = this.A00;
        if (contactPickerListItem.A00 != i) {
            contactPickerListItem.A00 = i;
            ContactPickerListItem.A03(contactPickerListItem);
            ContactPickerListItem.A02(contactPickerListItem);
        }
        return contactPickerListItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View] */
    @Override // X.DIw
    public /* bridge */ /* synthetic */ Object D9I(AoR aoR, Object obj) {
        SimpleVariableTextLayoutView simpleVariableTextLayoutView;
        int i;
        SimpleVariableTextLayoutView simpleVariableTextLayoutView2;
        Context context;
        int i2;
        CustomRelativeLayout customRelativeLayout = (View) obj;
        if (customRelativeLayout == null) {
            customRelativeLayout = new CustomRelativeLayout(this.A02, null, 2130969209);
            customRelativeLayout.A0C(2132542897);
            ((BJ0) customRelativeLayout).A04 = (SimpleVariableTextLayoutView) C09s.A01(customRelativeLayout, 2131363306);
            ((BJ0) customRelativeLayout).A05 = (SimpleVariableTextLayoutView) C09s.A01(customRelativeLayout, 2131363307);
            ((BJ0) customRelativeLayout).A03 = (UserTileView) C09s.A01(customRelativeLayout, 2131363308);
            ((BJ0) customRelativeLayout).A01 = (CheckBox) C09s.A01(customRelativeLayout, 2131365066);
            ((BJ0) customRelativeLayout).A00 = (Button) C09s.A01(customRelativeLayout, 2131367034);
        }
        ((BJ0) customRelativeLayout).A02 = aoR;
        User user = aoR.A04;
        ((BJ0) customRelativeLayout).A04.A08(7zL.A13(user));
        UserPhoneNumber A03 = user.A03();
        if (A03 != null) {
            String str = A03.A02;
            SimpleVariableTextLayoutView simpleVariableTextLayoutView3 = ((BJ0) customRelativeLayout).A05;
            if (str == null) {
                str = A03.toString();
            }
            simpleVariableTextLayoutView3.A08(str);
            simpleVariableTextLayoutView = ((BJ0) customRelativeLayout).A05;
            i = 0;
        } else {
            simpleVariableTextLayoutView = ((BJ0) customRelativeLayout).A05;
            i = 8;
        }
        simpleVariableTextLayoutView.setVisibility(i);
        AoR aoR2 = ((BJ0) customRelativeLayout).A02;
        if (aoR2.A03 || !aoR2.A02) {
            ((BJ0) customRelativeLayout).A01.setVisibility(8);
        } else {
            ((BJ0) customRelativeLayout).A01.setVisibility(0);
            ((BJ0) customRelativeLayout).A01.setChecked(((BJ0) customRelativeLayout).A02.A01);
        }
        AoR aoR3 = ((BJ0) customRelativeLayout).A02;
        if (aoR3.A00 && aoR3.A01) {
            SimpleVariableTextLayoutView simpleVariableTextLayoutView4 = ((BJ0) customRelativeLayout).A04;
            context = customRelativeLayout.getContext();
            i2 = 2132214411;
            simpleVariableTextLayoutView4.setTextColor(context.getColor(2132214411));
            simpleVariableTextLayoutView2 = ((BJ0) customRelativeLayout).A05;
        } else {
            ((BJ0) customRelativeLayout).A04.setTextColor(-16777216);
            simpleVariableTextLayoutView2 = ((BJ0) customRelativeLayout).A05;
            context = customRelativeLayout.getContext();
            i2 = 2132213997;
        }
        simpleVariableTextLayoutView2.setTextColor(context.getColor(i2));
        boolean z = ((BJ0) customRelativeLayout).A02.A03;
        Button button = ((BJ0) customRelativeLayout).A00;
        if (z) {
            button.setVisibility(0);
            boolean z2 = ((BJ0) customRelativeLayout).A02.A01;
            ((BJ0) customRelativeLayout).A00.setEnabled(!z2);
            Button button2 = ((BJ0) customRelativeLayout).A00;
            Resources resources = customRelativeLayout.getResources();
            int i3 = 2131958461;
            if (z2) {
                i3 = 2131958469;
            }
            button2.setText(resources.getString(i3));
            ((BJ0) customRelativeLayout).A00.setOnClickListener(new CZE(customRelativeLayout, customRelativeLayout, 26));
        } else {
            button.setVisibility(8);
        }
        ((BJ0) customRelativeLayout).A03.A03(2qZ.A02(user, ((BJ0) customRelativeLayout).A02.A02 ? C2fd.A0c : C2fd.A0T));
        return customRelativeLayout;
    }
}
