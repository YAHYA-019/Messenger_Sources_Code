package androidx.preference;

import X.ILC;
import X.JiB;
import X.KdO;
import X.LGo;
import X.LKR;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: SeekBarPreference.class */
public class SeekBarPreference extends Preference {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public SeekBar A04;
    public TextView A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final View.OnKeyListener A0A;
    public final SeekBar.OnSeekBarChangeListener A0B;

    /* loaded from: SeekBarPreference$SavedState.class */
    public final class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(25);
        public int A00;
        public int A01;
        public int A02;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A02);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971598);
        this.A0B = new ILC(this, 0);
        this.A0A = new LKR(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KdO.A0A, 2130971598, 0);
        this.A01 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.A01;
        i = i < i2 ? i2 : i;
        if (i != this.A00) {
            this.A00 = i;
            A06();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.A02) {
            this.A02 = Math.min(this.A00 - this.A01, Math.abs(i3));
            A06();
        }
        this.A06 = obtainStyledAttributes.getBoolean(2, true);
        this.A07 = obtainStyledAttributes.getBoolean(5, false);
        this.A09 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public static void A00(SeekBarPreference seekBarPreference, int i, boolean z) {
        int i2 = seekBarPreference.A01;
        if (i < i2) {
            i = i2;
        }
        int i3 = seekBarPreference.A00;
        if (i > i3) {
            i = i3;
        }
        if (i != seekBarPreference.A03) {
            seekBarPreference.A03 = i;
            TextView textView = seekBarPreference.A05;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (seekBarPreference.A0L()) {
                int i4 = i ^ (-1);
                if (seekBarPreference.A0L()) {
                    i4 = seekBarPreference.A0C.A00().getInt(seekBarPreference.A0H, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor edit = seekBarPreference.A0C.A00().edit();
                    edit.putInt(seekBarPreference.A0H, i);
                    edit.apply();
                }
            }
            if (z) {
                seekBarPreference.A06();
            }
        }
    }

    @Override // androidx.preference.Preference
    public void A0B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.A0B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A0B(savedState.getSuperState());
        this.A03 = savedState.A02;
        this.A01 = savedState.A01;
        this.A00 = savedState.A00;
        A06();
    }

    @Override // androidx.preference.Preference
    public void A0D(JiB jiB) {
        super.A0D(jiB);
        jiB.A0I.setOnKeyListener(this.A0A);
        this.A04 = (SeekBar) jiB.A0A(2131367254);
        TextView textView = (TextView) jiB.A0A(2131367256);
        this.A05 = textView;
        if (this.A07) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A05 = null;
        }
        SeekBar seekBar = this.A04;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A0B);
        this.A04.setMax(this.A00 - this.A01);
        int i = this.A02;
        SeekBar seekBar2 = this.A04;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.A02 = seekBar2.getKeyProgressIncrement();
        }
        this.A04.setProgress(this.A03 - this.A01);
        int i2 = this.A03;
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.A04.setEnabled(A0J());
    }
}
