package X;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: Gzd.class */
public final class Gzd extends JvT {
    public static final String __redex_internal_original_name = "DefaultIdPermissionsFragment";
    public Button A00;

    public Gzd() {
    }

    public Gzd(int i) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(161117750);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541835, viewGroup, false);
        0FI.A08(-543807253, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        Button button = (Button) HL8.A00(view, 2131362673);
        this.A00 = button;
        if (button == null) {
            11T.A0L("btnCameraAccessAllow");
            throw 0Q8.createAndThrow();
        }
        HL8.A00(button, 2131362673).setOnClickListener(new LKO(this, 81));
        TextView textView = (TextView) HL8.A00(view, 2131368222);
        Context requireContext = requireContext();
        TypedValue typedValue = new TypedValue();
        requireContext.getTheme().resolveAttribute(2130970604, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || charSequence.length() <= 0) {
            charSequence = getText(2131951806);
            11T.A0D(charSequence);
        }
        textView.setText(charSequence);
        ImageView imageView = (ImageView) view.findViewById(2131365084);
        if (imageView != null) {
            Context requireContext2 = requireContext();
            Hp9 hp9 = ((JgR) this).A00;
            if (hp9 != null) {
                imageView.setImageDrawable(hp9.A00(requireContext2));
            }
            imageView.setOnClickListener(new LKO(this, 82));
        }
    }
}
