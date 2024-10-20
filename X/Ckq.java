package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.user.model.User;
import java.util.List;

/* loaded from: Ckq.class */
public final class Ckq implements DGw {
    public final F7W A00 = (F7W) 1Bn.A0A(84947);

    @Override // X.DGw
    public void ACN(View.OnClickListener onClickListener, Bpe bpe, GXa gXa) {
        02W.A05(gXa instanceof QWK);
        User user = bpe.A00;
        String str = bpe.A02;
        List list = C2lb.A0J;
        FrameLayout frameLayout = ((QWK) gXa).A00;
        frameLayout.removeAllViews();
        frameLayout.addView(this.A00.A01(frameLayout.getContext(), user, 2132279393));
        frameLayout.setContentDescription(str);
        gXa.A00.setOnClickListener(onClickListener);
    }

    @Override // X.DGw
    public GXa ALK(ViewGroup viewGroup) {
        List list = C2lb.A0J;
        return new QWK(AbG.A08(LayoutInflater.from(viewGroup.getContext()), viewGroup, 2132542643));
    }
}
