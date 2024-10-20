package X;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: K86.class */
public final class K86 extends JgS {
    public static final String __redex_internal_original_name = "MaterialTextInputPicker";
    public int A00;
    public CalendarConstraints A01;
    public DateSelector A02;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1169167578);
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        this.A00 = bundle.getInt("THEME_RES_ID_KEY");
        this.A02 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A01 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        0FI.A08(718966735, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-925414375);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.A00));
        DateSelector dateSelector = this.A02;
        CalendarConstraints calendarConstraints = this.A01;
        K85 k85 = new K85(this);
        SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelector;
        View inflate = cloneInContext.inflate(2132542795, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(2131365884);
        EditText editText = textInputLayout.A0V;
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("lge") || lowerCase.equals("samsung")) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = inflate.getResources();
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        String replaceAll = localizedPattern.replaceAll("d", resources.getString(2131961874)).replaceAll("M", resources.getString(2131961875)).replaceAll("y", resources.getString(2131961876));
        textInputLayout.A0f(replaceAll);
        Long l = singleDateSelector.A00;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new K8C(calendarConstraints, k85, singleDateSelector, textInputLayout, replaceAll, simpleDateFormat));
        editText.requestFocus();
        editText.post(new Llz(editText));
        0FI.A08(-1185997067, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A00);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A01);
    }
}
