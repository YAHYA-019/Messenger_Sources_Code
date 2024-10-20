package com.facebook.messaging.contacts.picker.common;

import X.0RK;
import X.0S2;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Lo;
import X.2Wo;
import X.4YU;
import X.7zL;
import X.AbG;
import X.AbK;
import X.AoS;
import X.BOt;
import X.C00i;
import X.C09s;
import X.C0A8;
import X.CJ1;
import X.CZj;
import X.D1d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.montage.widget.tile.MontageTileView;
import com.facebook.messaging.presence.PresenceIndicatorView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.SimpleVariableTextLayoutView;

/* loaded from: ContactPickerListItem.class */
public class ContactPickerListItem extends CustomRelativeLayout {
    public int A00;
    public ViewStub A01;
    public Button A02;
    public CheckBox A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public AoS A07;
    public MontageTileView A08;
    public PresenceIndicatorView A09;
    public 2Wo A0A;
    public 2Wo A0B;
    public 2Wo A0C;
    public 2Wo A0D;
    public 2Wo A0E;
    public 2Wo A0F;
    public int A0G;
    public int A0H;
    public ImageView A0I;
    public C00i A0J;
    public C00i A0K;
    public UserTileView A0L;
    public 2Wo A0M;
    public SimpleVariableTextLayoutView A0N;
    public final C00i A0O;
    public final C00i A0P;

    /* loaded from: ContactPickerListItem$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new 0RK(new CZj());
        public TriState A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeSerializable(this.A00);
        }
    }

    public ContactPickerListItem(Context context, AttributeSet attributeSet, int i, FbUserSession fbUserSession) {
        super(context, attributeSet, i);
        this.A0O = 1BQ.A02(84393);
        this.A0P = 1BQ.A02(17053);
        A01(fbUserSession);
    }

    public ContactPickerListItem(Context context, AttributeSet attributeSet, FbUserSession fbUserSession) {
        super(context, attributeSet, 2130969209);
        this.A0O = 1BQ.A02(84393);
        this.A0P = 1BQ.A02(17053);
        A01(fbUserSession);
    }

    public ContactPickerListItem(Context context, FbUserSession fbUserSession) {
        super(context, null, 2130969209);
        this.A0O = 1BQ.A02(84393);
        this.A0P = 1BQ.A02(17053);
        A01(fbUserSession);
    }

    private void A00() {
        Integer num;
        AoS aoS = this.A07;
        if (User.A01(aoS.A07.A0e) || (num = aoS.A08) == 0S2.A00) {
            return;
        }
        if ((num == 0S2.A0C && aoS.A04 == BOt.A03) || num == 0S2.A0u || aoS.A02) {
            return;
        }
        this.A0P.get();
    }

    private void A01(FbUserSession fbUserSession) {
        Context context = getContext();
        this.A0J = 7zL.A0R(context, 16979);
        this.A0K = 1Lo.A00(context, fbUserSession, 17069);
        setId(2131363305);
        A0C(2132542895);
        setPadding(0, getPaddingTop(), 0, getPaddingBottom());
        SimpleVariableTextLayoutView simpleVariableTextLayoutView = (SimpleVariableTextLayoutView) C09s.A01(this, 2131363300);
        this.A0N = simpleVariableTextLayoutView;
        this.A0H = simpleVariableTextLayoutView.getTextColor();
        this.A05 = AbG.A09(this, 2131363320);
        this.A06 = AbG.A09(this, 2131363321);
        this.A0L = (UserTileView) C09s.A01(this, 2131363322);
        this.A09 = (PresenceIndicatorView) C09s.A01(this, 2131363314);
        this.A03 = (CheckBox) C09s.A01(this, 2131365066);
        this.A02 = (Button) C09s.A01(this, 2131365059);
        this.A0F = AbK.A0v(this, 2131367412);
        this.A0D = AbK.A0v(this, 2131365807);
        this.A0I = (ImageView) C09s.A01(this, 2131364615);
        this.A04 = (ImageView) C09s.A01(this, 2131363683);
        this.A01 = (ViewStub) C09s.A01(this, 2131363661);
        this.A0M = AbK.A0v(this, 2131368322);
        this.A0E = AbK.A0v(this, 2131366286);
        this.A0B = AbK.A0v(this, 2131361981);
        this.A0A = AbK.A0v(this, 2131366152);
        this.A0C = AbK.A0v(this, 2131365463);
        this.A00 = AbG.A00(context);
        this.A0G = context.getColor(2132213766);
        this.A0D.A02 = new D1d(this, 1);
    }

    public static void A02(ContactPickerListItem contactPickerListItem) {
        AoS aoS = contactPickerListItem.A07;
        if (aoS.A08 == 0S2.A0j || !aoS.A02) {
            contactPickerListItem.A03.setVisibility(8);
            return;
        }
        Context context = contactPickerListItem.getContext();
        Drawable A02 = ((CJ1) 1Bn.A0E(context, (1BY) null, 84365)).A02(Integer.valueOf(contactPickerListItem.A00), Integer.valueOf(((MigColorScheme) 4YU.A0p(contactPickerListItem.A0J)).B9O()));
        contactPickerListItem.A03.setChecked(contactPickerListItem.A07.A02);
        contactPickerListItem.A03.setButtonDrawable(A02);
        contactPickerListItem.A03.setVisibility(0);
        if (contactPickerListItem.A07.A03) {
            int A00 = C0A8.A00(context, 15.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactPickerListItem.A03.getLayoutParams();
            marginLayoutParams.setMargins(A00, 0, A00, 0);
            contactPickerListItem.A03.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A03(ContactPickerListItem contactPickerListItem) {
        AoS aoS = contactPickerListItem.A07;
        if (aoS.A08 == 0S2.A0C) {
            contactPickerListItem.A0N.setTextColor(aoS.A02 ? contactPickerListItem.A00 : contactPickerListItem.A0H);
        }
        if (contactPickerListItem.A07.A08 == 0S2.A0u) {
            contactPickerListItem.A0N.setTextColor(contactPickerListItem.A00);
        }
        contactPickerListItem.A0N.A08(contactPickerListItem.A07.A07.A0X.displayName);
        contactPickerListItem.A0N.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x04be, code lost:
    
        if (r303 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(com.facebook.messaging.contacts.picker.common.ContactPickerListItem r301) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.contacts.picker.common.ContactPickerListItem.A04(com.facebook.messaging.contacts.picker.common.ContactPickerListItem):void");
    }

    public String getUserId() {
        return this.A07.A07.A13;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.A00.isSet()) {
            this.A0A.A01().setEnabled(savedState.A00.asBoolean());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.facebook.messaging.contacts.picker.common.ContactPickerListItem$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        2Wo r0 = this.A0A;
        baseSavedState.A00 = r0.A00 != null ? TriState.valueOf(r0.A01().isEnabled()) : TriState.UNSET;
        return baseSavedState;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.A0G != i) {
            this.A0G = i;
            A04(this);
        }
    }
}
