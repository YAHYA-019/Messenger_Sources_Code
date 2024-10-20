package androidx.preference;

import X.0V5;
import X.JiB;
import X.LLC;
import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: DropDownPreference.class */
public class DropDownPreference extends ListPreference {
    public Spinner A00;
    public final Context A01;
    public final AdapterView.OnItemSelectedListener A02;
    public final ArrayAdapter A03;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969402);
        this.A02 = new LLC(this, 2);
        this.A01 = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.A03 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).A01;
        if (charSequenceArr == null) {
            return;
        }
        int length = charSequenceArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            arrayAdapter.add(charSequenceArr[i2].toString());
            i = i2 + 1;
        }
    }

    @Override // androidx.preference.Preference
    public void A06() {
        super.A06();
        ArrayAdapter arrayAdapter = this.A03;
        if (arrayAdapter != null) {
            0V5.A00(arrayAdapter, 1859630881);
        }
    }

    @Override // androidx.preference.Preference
    public void A0D(JiB jiB) {
        int i;
        Spinner spinner = (Spinner) jiB.A0I.findViewById(2131367513);
        this.A00 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.A03);
        this.A00.setOnItemSelectedListener(this.A02);
        Spinner spinner2 = this.A00;
        String str = ((ListPreference) this).A00;
        CharSequence[] charSequenceArr = ((ListPreference) this).A02;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length;
            do {
                i--;
                if (i >= 0) {
                }
            } while (!TextUtils.equals(charSequenceArr[i].toString(), str));
            spinner2.setSelection(i);
            super.A0D(jiB);
        }
        i = -1;
        spinner2.setSelection(i);
        super.A0D(jiB);
    }
}
