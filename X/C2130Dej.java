package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.fig.bottomsheet.FigAuxiliaryView;

/* renamed from: X.Dej, reason: case insensitive filesystem */
/* loaded from: Dej.class */
public final class C2130Dej extends DSk implements CallerContextable {
    public static final CallerContext A07 = CallerContext.A06(C2130Dej.class);
    public static final String __redex_internal_original_name = "FigBottomSheetAdapter";
    public float A00;
    public View A01;
    public RecyclerView A02;
    public Integer A03;
    public boolean A04;
    public final Context A05;
    public final View.OnClickListener A06;

    public C2130Dej(Context context) {
        super(context);
        this.A03 = 0S2.A00;
        this.A04 = false;
        this.A06 = FXr.A02(this, 44);
        this.A05 = context;
    }

    /* JADX WARN: Type inference failed for: r0v84, types: [int[], int[][]] */
    public static void A00(MenuItem menuItem, DTI dti, C2130Dej c2130Dej) {
        Drawable icon = menuItem.getIcon();
        int i = 8;
        GlyphView glyphView = dti.A01;
        if (icon != null) {
            glyphView.setVisibility(0);
            glyphView.setImageDrawable(menuItem.getIcon());
        } else {
            glyphView.setVisibility(8);
        }
        if (!c2130Dej.A04 && !(menuItem instanceof DgG)) {
            glyphView.A00(7zM.A02(((DSk) c2130Dej).A03, 2MR.A28));
        }
        if (!TextUtils.isEmpty(menuItem.getTitle())) {
            dti.A03.setText(menuItem.getTitle());
        }
        dti.A0I.setOnClickListener(c2130Dej.A06);
        boolean isCheckable = menuItem.isCheckable();
        FigAuxiliaryView figAuxiliaryView = dti.A02;
        if (isCheckable) {
            i = 0;
        }
        figAuxiliaryView.setVisibility(i);
        if (isCheckable && (menuItem instanceof C2131Dek)) {
            View view = dti.A00;
            if (figAuxiliaryView.A00 != 0) {
                figAuxiliaryView.removeAllViews();
                figAuxiliaryView.addView(new CheckBox(figAuxiliaryView.getContext()));
                figAuxiliaryView.A00 = 0;
            }
            CompoundButton compoundButton = (CompoundButton) figAuxiliaryView.getChildAt(0);
            int A00 = RWJ.A00();
            compoundButton.setId(A00);
            view.setId(RWJ.A00());
            view.setLabelFor(A00);
            compoundButton.setChecked(menuItem.isChecked());
            compoundButton.setEnabled(menuItem.isEnabled());
            ?? r0 = {DKC.A1b(-16842910), DKC.A1b(R.attr.state_checked), DKC.A1b(-16842912)};
            Context context = ((DSk) c2130Dej).A03;
            2MR r02 = 2MR.A0o;
            2Mg r03 = 2Me.A02;
            compoundButton.setButtonTintList(new ColorStateList(r0, new int[]{r03.A03(context, r02), r03.A03(context, 2MR.A01), r03.A03(context, 2MR.A2B)}));
            compoundButton.setClickable(false);
        }
        boolean isEnabled = menuItem.isEnabled();
        2OB r04 = dti.A03;
        int i2 = 2132607428;
        if (isEnabled) {
            i2 = 2132607427;
        }
        r04.setTextAppearance(i2);
        if (!(menuItem instanceof DgG)) {
            Context context2 = ((DSk) c2130Dej).A03;
            glyphView.A00(context2.getColor(5YG.A00(context2, isEnabled ? 2MR.A28 : 2MR.A0m)));
        }
        dti.A00.setEnabled(isEnabled);
    }

    public void A0Q(View view) {
        Integer num = this.A03;
        if (num != 0S2.A00 && num != 0S2.A01) {
            throw AnonymousClass001.A0q("Bottom-sheet has a non-custom title");
        }
        this.A03 = 0S2.A01;
        this.A00 = -2.0f;
        this.A01 = view;
        DKH.A16(view);
    }

    public void Bje(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    public void BtQ(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public int getItemViewType(int i) {
        Integer num = this.A03;
        Integer num2 = 0S2.A00;
        if (i == 1BK.A1V(num, num2) || i == getItemCount() - 1) {
            return 4;
        }
        Integer num3 = this.A03;
        if (num3 == num2) {
            return 0;
        }
        int i2 = 2;
        if (i != 0) {
            return 0;
        }
        if (num3 == 0S2.A01) {
            i2 = 3;
        }
        return i2;
    }
}
