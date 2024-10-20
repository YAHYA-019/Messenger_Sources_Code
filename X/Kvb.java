package X;

/* loaded from: Kvb.class */
public abstract class Kvb {
    public static Integer A00(String str) {
        Integer num;
        Integer[] A00 = 0S2.A00(33);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                num = 0S2.A00;
                break;
            }
            num = A00[i2];
            if (A01(num).equals(str)) {
                break;
            }
            i = i2 + 1;
        }
        return num;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "android.widget.Button";
            case 2:
                return "android.widget.CompoundButton";
            case 3:
                return "android.widget.Spinner";
            case 4:
                return "android.widget.EditText";
            case 5:
                return "android.widget.GridView";
            case 6:
            case 7:
                return "android.widget.ImageView";
            case 8:
                return "android.widget.AbsListView";
            case 9:
                return "androidx.viewpager.widget.ViewPager";
            case 10:
                return "android.widget.RadioButton";
            case 11:
                return "android.widget.SeekBar";
            case 12:
                return "android.widget.Switch";
            case 13:
                return "android.widget.TabWidget";
            case 14:
                return "android.widget.ToggleButton";
            case 15:
                return "android.view.ViewGroup";
            case 16:
                return "android.webkit.WebView";
            case 17:
                return "android.widget.CheckedTextView";
            case 18:
                return "android.widget.ProgressBar";
            case 19:
                return "android.app.ActionBar$Tab";
            case 20:
                return "androidx.drawerlayout.widget.DrawerLayout";
            case 21:
                return "android.widget.SlidingDrawer";
            case 22:
                return "com.android.internal.view.menu.IconMenuView";
            case 23:
                return "android.widget.Toast$TN";
            case 24:
                return "android.app.AlertDialog";
            case 25:
                return "android.app.DatePickerDialog";
            case 26:
                return "android.app.TimePickerDialog";
            case 27:
                return "android.widget.DatePicker";
            case 28:
                return "android.widget.TimePicker";
            case 29:
                return "android.widget.NumberPicker";
            case 30:
                return "android.widget.ScrollView";
            case 31:
                return "android.widget.HorizontalScrollView";
            case 32:
                return "android.inputmethodservice.Keyboard$Key";
            default:
                return "android.view.View";
        }
    }
}
