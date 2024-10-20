package X;

import com.facebook.messaging.montage.composer.doodle.TextColorLayout;
import java.util.List;

/* loaded from: Ih3.class */
public final class Ih3 implements GJe {
    public final /* synthetic */ TextColorLayout A00;

    public Ih3(TextColorLayout textColorLayout) {
        this.A00 = textColorLayout;
    }

    @Override // X.GJe
    public void CM7() {
    }

    @Override // X.GJe
    public void CM8(int i) {
        TextColorLayout textColorLayout = this.A00;
        List list = TextColorLayout.A09;
        if (i != textColorLayout.A00) {
            CM9(i);
        }
    }

    @Override // X.GJe
    public void CM9(int i) {
        TextColorLayout textColorLayout = this.A00;
        List list = TextColorLayout.A09;
        textColorLayout.A00 = i;
        textColorLayout.setPadding(textColorLayout.getPaddingLeft(), textColorLayout.getPaddingTop(), textColorLayout.getPaddingRight(), i);
        textColorLayout.invalidate();
    }
}
